package org.telegram.tgnet;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import bg.c2;
import bg.i2;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import fh.f0;
import gh.p2;
import h3.e0;
import h3.y;
import ih.e2;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j3.r0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import mh.k2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CaptchaController;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dh;
import org.telegram.messenger.l0;
import org.telegram.messenger.voip.j0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.fg0;
public class ConnectionsManager extends BaseController {
    private static final int CORE_POOL_SIZE;
    public static final int CPU_COUNT;
    public static final int ConnectionStateConnected = 3;
    public static final int ConnectionStateConnecting = 1;
    public static final int ConnectionStateConnectingToProxy = 4;
    public static final int ConnectionStateUpdating = 5;
    public static final int ConnectionStateWaitingForNetwork = 2;
    public static final int ConnectionTypeDownload = 2;
    public static final int ConnectionTypeDownload2 = 65538;
    public static final int ConnectionTypeGeneric = 1;
    public static final int ConnectionTypePush = 8;
    public static final int ConnectionTypeUpload = 4;
    public static final int DEFAULT_DATACENTER_ID = Integer.MAX_VALUE;
    public static final Executor DNS_THREAD_POOL_EXECUTOR;
    public static final int FileTypeAudio = 50331648;
    public static final int FileTypeFile = 67108864;
    public static final int FileTypePhoto = 16777216;
    public static final int FileTypeVideo = 33554432;
    private static final ConnectionsManager[] Instance;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static final int RequestFlagCanCompress = 4;
    public static final int RequestFlagDoNotWaitFloodWait = 1024;
    public static final int RequestFlagEnableUnauthorized = 1;
    public static final int RequestFlagFailOnServerErrors = 2;
    public static final int RequestFlagFailOnServerErrorsExceptFloodWait = 65536;
    public static final int RequestFlagForceDownload = 32;
    public static final int RequestFlagInvokeAfter = 64;
    public static final int RequestFlagListenAfterCancel = 2048;
    public static final int RequestFlagNeedQuickAck = 128;
    public static final int RequestFlagTryDifferentDc = 16;
    public static final int RequestFlagWithoutLogin = 8;
    public static final byte USE_IPV4_IPV6_RANDOM = 2;
    public static final byte USE_IPV4_ONLY = 0;
    public static final byte USE_IPV6_ONLY = 1;
    private static AsyncTask currentTask;
    private static HashMap<String, ResolvedDomain> dnsCache;
    private static int lastClassGuid;
    private static long lastDnsRequestTime;
    public static long lastPremiumFloodWaitShown;
    private static HashMap<String, ResolveHostByNameTask> resolvingHostnameTasks = new HashMap<>();
    private static final BlockingQueue<Runnable> sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private boolean appPaused;
    private int appResumeCount;
    private int connectionState;
    private boolean forceTryIpV6;
    private boolean isUpdating;
    private long lastPauseTime;
    private AtomicInteger lastRequestToken;
    private final ConcurrentHashMap<Integer, RequestCallbacks> requestCallbacks;

    public static class GoogleDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public GoogleDnsLoadTask(int i9) {
            this.currentAccount = i9;
        }

        public static int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            if (length < length2) {
                return 1;
            }
            return 0;
        }

        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            FileLog.d("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i9 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i9, nativeByteBuffer.address, AccountInstance.getInstance(i9).getUserConfig().getClientPhone(), this.responseDate);
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to get google result");
                FileLog.d("start mozilla task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(this.currentAccount);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("4. currentTask = mozilla");
            AsyncTask unused2 = ConnectionsManager.currentTask = mozillaDnsLoadTask;
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            int read;
            boolean z10 = false;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : AccountInstance.getInstance(this.currentAccount).getMessagesController().dcDomainName;
                int nextInt = Utilities.random.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i9 = 0; i9 < nextInt; i9++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.random.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://dns.google.com/resolve?name=" + str + "&type=ANY&random_padding=" + ((Object) sb2)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                InputStream inputStream2 = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            if (jSONObject.getInt("type") == 16) {
                                arrayList.add(jSONObject.getString("data"));
                            }
                        }
                        Collections.sort(arrayList, new i(0));
                        StringBuilder sb3 = new StringBuilder();
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            sb3.append(((String) arrayList.get(i11)).replace("\"", ""));
                        }
                        byte[] decode = Base64.decode(sb3.toString(), 0);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                        nativeByteBuffer.writeBytes(decode);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused) {
                        }
                        return nativeByteBuffer;
                    } catch (Throwable th2) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th2;
                        inputStream = inputStream2;
                        try {
                            if (!(th instanceof SocketTimeoutException) && !(th instanceof SSLException)) {
                                z10 = true;
                            }
                            FileLog.e(th, z10);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    FileLog.e(th4);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.stageQueue.postRunnable(new j(this, nativeByteBuffer, 0));
        }
    }

    public interface INativeTlTest {
        boolean test(long j10);
    }

    public static class MozillaDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public MozillaDnsLoadTask(int i9) {
            this.currentAccount = i9;
        }

        public static int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            if (length < length2) {
                return 1;
            }
            return 0;
        }

        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            FileLog.d("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i9 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i9, nativeByteBuffer.address, AccountInstance.getInstance(i9).getUserConfig().getClientPhone(), this.responseDate);
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to get mozilla txt result");
            }
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            int read;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : AccountInstance.getInstance(this.currentAccount).getMessagesController().dcDomainName;
                int nextInt = Utilities.random.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i9 = 0; i9 < nextInt; i9++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.random.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://mozilla.cloudflare-dns.com/dns-query?name=" + str + "&type=TXT&random_padding=" + ((Object) sb2)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.addRequestProperty("accept", "application/dns-json");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                InputStream inputStream2 = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[32768];
                    while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        if (jSONObject.getInt("type") == 16) {
                            arrayList.add(jSONObject.getString("data"));
                        }
                    }
                    Collections.sort(arrayList, new i(1));
                    StringBuilder sb3 = new StringBuilder();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        sb3.append(((String) arrayList.get(i11)).replace("\"", ""));
                    }
                    byte[] decode = Base64.decode(sb3.toString(), 0);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                    nativeByteBuffer.writeBytes(decode);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    return nativeByteBuffer;
                } catch (Throwable th3) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th3;
                    inputStream = inputStream2;
                    try {
                        FileLog.e(th, false);
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                FileLog.e(th4);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.stageQueue.postRunnable(new j(this, nativeByteBuffer, 1));
        }
    }

    public static class RequestCallbacks {
        public Runnable onCancelled;
        public RequestDelegateInternal onComplete;
        public QuickAckDelegate onQuickAck;
        public WriteToSocketDelegate onWriteToSocket;

        public RequestCallbacks(RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
            this.onComplete = requestDelegateInternal;
            this.onQuickAck = quickAckDelegate;
            this.onWriteToSocket = writeToSocketDelegate;
        }
    }

    public static class ResolveHostByNameTask extends AsyncTask<Void, Void, ResolvedDomain> {
        private ArrayList<Long> addresses = new ArrayList<>();
        private String currentHostName;

        public ResolveHostByNameTask(String str) {
            this.currentHostName = str;
        }

        public void addAddress(long j10) {
            if (this.addresses.contains(Long.valueOf(j10))) {
                return;
            }
            this.addresses.add(Long.valueOf(j10));
        }

        @Override
        public ResolvedDomain doInBackground(Void... voidArr) {
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            JSONArray jSONArray;
            int length;
            try {
                URLConnection openConnection = new URL("https://www.google.com/resolve?name=" + this.currentHostName + "&type=A").openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.addRequestProperty("Host", "dns.google.com");
                openConnection.setConnectTimeout(1000);
                openConnection.setReadTimeout(2000);
                openConnection.connect();
                inputStream = openConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        JSONObject jSONObject = new JSONObject(new String(byteArrayOutputStream.toByteArray()));
                        if (jSONObject.has("Answer") && (length = (jSONArray = jSONObject.getJSONArray("Answer")).length()) > 0) {
                            ArrayList arrayList = new ArrayList(length);
                            for (int i9 = 0; i9 < length; i9++) {
                                arrayList.add(jSONArray.getJSONObject(i9).getString("data"));
                            }
                            ResolvedDomain resolvedDomain = new ResolvedDomain(arrayList, SystemClock.elapsedRealtime());
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                FileLog.e(th, false);
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused) {
                            }
                            return resolvedDomain;
                        }
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            FileLog.e(th2, false);
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            FileLog.e(th, false);
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            try {
                                InetAddress byName = InetAddress.getByName(this.currentHostName);
                                ArrayList arrayList2 = new ArrayList(1);
                                arrayList2.add(byName.getHostAddress());
                                return new ResolvedDomain(arrayList2, SystemClock.elapsedRealtime());
                            } catch (Exception e10) {
                                FileLog.e((Throwable) e10, false);
                                return null;
                            }
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    FileLog.e(th4, false);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused4) {
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        }

        @Override
        public void onPostExecute(ResolvedDomain resolvedDomain) {
            int i9 = 0;
            if (resolvedDomain != null) {
                ConnectionsManager.dnsCache.put(this.currentHostName, resolvedDomain);
                int size = this.addresses.size();
                while (i9 < size) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i9).longValue(), resolvedDomain.getAddress());
                    i9++;
                }
            } else {
                int size2 = this.addresses.size();
                while (i9 < size2) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i9).longValue(), "");
                    i9++;
                }
            }
            ConnectionsManager.resolvingHostnameTasks.remove(this.currentHostName);
        }
    }

    public static class ResolvedDomain {
        public ArrayList<String> addresses;
        long ttl;

        public ResolvedDomain(ArrayList<String> arrayList, long j10) {
            this.addresses = arrayList;
            this.ttl = j10;
        }

        public String getAddress() {
            ArrayList<String> arrayList = this.addresses;
            return arrayList.get(Utilities.random.nextInt(arrayList.size()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        CORE_POOL_SIZE = max;
        int i9 = (availableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i9;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        sPoolWorkQueue = linkedBlockingQueue;
        ThreadFactory threadFactory = new ThreadFactory() {
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "DnsAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = threadFactory;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i9, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    public ConnectionsManager(int i9) {
        super(i9);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SharedPreferences sharedPreferences;
        boolean z10;
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (i9 != 0) {
            File file = new File(filesDirFixed, r0.l(i9, "account"));
            file.mkdirs();
            filesDirFixed = file;
        }
        String file2 = filesDirFixed.toString();
        boolean isPushConnectionEnabled = isPushConnectionEnabled();
        try {
            str5 = LocaleController.getSystemLocaleStringIso639().toLowerCase();
            str2 = LocaleController.getLocaleStringIso639().toLowerCase();
            str4 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            str3 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str3 = str3 + " pbeta";
            } else if (BuildVars.DEBUG_VERSION) {
                str3 = str3 + " beta";
            }
            str = "SDK " + Build.VERSION.SDK_INT;
        } catch (Exception unused) {
            str = "SDK " + Build.VERSION.SDK_INT;
            str2 = "";
            str3 = "App version unknown";
            str4 = "Android unknown";
            str5 = "en";
        }
        String str7 = str5.trim().length() != 0 ? str5 : "en";
        String str8 = str4.trim().length() != 0 ? str4 : "Android unknown";
        if (str3.trim().length() == 0) {
            str6 = "App version unknown";
        } else {
            str6 = str3;
        }
        str = str.trim().length() == 0 ? "SDK Unknown" : str;
        getUserConfig().loadConfig();
        String regId = getRegId();
        String certificateSHA256Fingerprint = AndroidUtilities.getCertificateSHA256Fingerprint();
        int dSTSavings = (TimeZone.getDefault().getDSTSavings() + TimeZone.getDefault().getRawOffset()) / 1000;
        if (this.currentAccount == 0) {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        } else {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig" + this.currentAccount, 0);
        }
        this.forceTryIpV6 = sharedPreferences.getBoolean("forceTryIpV6", false);
        if (getUserConfig().getCurrentUser() != null) {
            z10 = getUserConfig().getCurrentUser().premium;
        } else {
            z10 = false;
        }
        init(SharedConfig.buildVersion(), 229, BuildVars.APP_ID, str8, str, str6, str2, str7, file2, FileLog.getNetworkLogPath(), regId, certificateSHA256Fingerprint, dSTSavings, getUserConfig().getClientUserId(), z10, isPushConnectionEnabled);
    }

    public static int generateClassGuid() {
        int i9 = lastClassGuid;
        lastClassGuid = i9 + 1;
        return i9;
    }

    public static void getHostByName(String str, long j10) {
        AndroidUtilities.runOnUIThread(new i2(str, j10, 19));
    }

    public static int getInitFlags() {
        if (EmuDetector.with(ApplicationLoader.applicationContext).detect()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("detected emu");
                return 1024;
            }
            return 1024;
        }
        return 0;
    }

    public static ConnectionsManager getInstance(int i9) {
        ConnectionsManager connectionsManager;
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager2 = connectionsManagerArr[i9];
        if (connectionsManager2 == null) {
            synchronized (ConnectionsManager.class) {
                try {
                    connectionsManager = connectionsManagerArr[i9];
                    if (connectionsManager == null) {
                        connectionsManager = new ConnectionsManager(i9);
                        connectionsManagerArr[i9] = connectionsManager;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return connectionsManager;
        }
        return connectionsManager2;
    }

    private String getRegId() {
        String str;
        String str2 = SharedConfig.pushString;
        if (!TextUtils.isEmpty(str2) && SharedConfig.pushType == 13) {
            str2 = ta.b.d("huawei://", str2);
        }
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(SharedConfig.pushStringStatus)) {
            str2 = SharedConfig.pushStringStatus;
        }
        if (TextUtils.isEmpty(str2)) {
            if (SharedConfig.pushType == 2) {
                str = "FIREBASE";
            } else {
                str = "HUAWEI";
            }
            StringBuilder t10 = aa.d.t("__", str, "_GENERATING_SINCE_");
            t10.append(getCurrentTime());
            t10.append("__");
            String sb2 = t10.toString();
            SharedConfig.pushStringStatus = sb2;
            return sb2;
        }
        return str2;
    }

    public void lambda$cancelRequest$10(Runnable runnable, int i9, boolean z10) {
        if (runnable != null) {
            listenCancel(i9, new e2(3, runnable));
        }
        native_cancelRequest(this.currentAccount, i9, z10);
    }

    public static void lambda$cancelRequest$9(Runnable runnable) {
        Utilities.stageQueue.postRunnable(runnable);
    }

    public void lambda$cancelRequestsForGuid$11(int i9) {
        native_cancelRequestsForGuid(this.currentAccount, i9);
    }

    public void lambda$discardConnection$0(int i9, int i10) {
        native_discardConnection(this.currentAccount, i9, i10);
    }

    public void lambda$failNotRunningRequest$1(int i9) {
        native_failNotRunningRequest(this.currentAccount, i9);
    }

    public static void lambda$getHostByName$20(String str, long j10) {
        ResolvedDomain resolvedDomain = dnsCache.get(str);
        if (resolvedDomain != null && SystemClock.elapsedRealtime() - resolvedDomain.ttl < 300000) {
            native_onHostNameResolved(str, j10, resolvedDomain.getAddress());
            return;
        }
        ResolveHostByNameTask resolveHostByNameTask = resolvingHostnameTasks.get(str);
        if (resolveHostByNameTask == null) {
            resolveHostByNameTask = new ResolveHostByNameTask(str);
            try {
                resolveHostByNameTask.executeOnExecutor(DNS_THREAD_POOL_EXECUTOR, null, null, null);
                resolvingHostnameTasks.put(str, resolveHostByNameTask);
            } catch (Throwable th) {
                FileLog.e(th);
                native_onHostNameResolved(str, j10, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j10);
    }

    public static void lambda$onConnectionStateChanged$15(int i9, int i10) {
        getInstance(i9).connectionState = i10;
        AccountInstance.getInstance(i9).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateConnectionState, new Object[0]);
    }

    public static void lambda$onIntegrityCheckClassic$25(int i9, long j10, int i10, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder p6 = r0.p(i9, "account", ": integrity check gave null token in ");
            p6.append(System.currentTimeMillis() - j10);
            p6.append("ms");
            FileLog.e(p6.toString());
            native_receivedIntegrityCheckClassic(i9, i10, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        FileLog.d("account" + i9 + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j10) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i9, i10, str, str2);
        } catch (Exception e10) {
            FileLog.e("receivedIntegrityCheckClassic failed", e10);
        }
    }

    public static void lambda$onIntegrityCheckClassic$26(int i9, long j10, int i10, String str, Exception exc) {
        StringBuilder p6 = r0.p(i9, "account", ": integrity check failed to give a token in ");
        p6.append(System.currentTimeMillis() - j10);
        p6.append("ms");
        FileLog.e(p6.toString(), exc);
        native_receivedIntegrityCheckClassic(i9, i10, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + fg0.f1(exc));
    }

    public static void lambda$onIntegrityCheckClassic$27(int i9, String str, String str2, int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("account");
        sb2.append(i9);
        sb2.append(": server requests integrity classic check with project = ");
        sb2.append(str);
        sb2.append(" nonce = ");
        r0.x(str2, sb2);
        try {
            IntegrityManagerFactory.create(ApplicationLoader.applicationContext).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new f(i9, currentTimeMillis, str2, i10)).addOnFailureListener(new f(i9, currentTimeMillis, str2, i10));
        } catch (Exception unused) {
            FileLog.d("account" + i9 + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i9, i10, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    public static void lambda$onLogout$16(int i9) {
        AccountInstance accountInstance = AccountInstance.getInstance(i9);
        if (accountInstance.getUserConfig().getClientUserId() != 0) {
            accountInstance.getUserConfig().clearConfig();
            accountInstance.getMessagesController().performLogout(0);
        }
    }

    public static void lambda$onPremiumFloodWait$23(boolean z10, int i9, int i10) {
        boolean z11;
        if (z10) {
            FileUploadOperation findUploadOperationByRequestToken = FileLoader.getInstance(i9).findUploadOperationByRequestToken(i10);
            if (findUploadOperationByRequestToken != null) {
                z11 = !findUploadOperationByRequestToken.caughtPremiumFloodWait;
                findUploadOperationByRequestToken.caughtPremiumFloodWait = true;
            }
            z11 = false;
        } else {
            FileLoadOperation findLoadOperationByRequestToken = FileLoader.getInstance(i9).findLoadOperationByRequestToken(i10);
            if (findLoadOperationByRequestToken != null) {
                z11 = !findLoadOperationByRequestToken.caughtPremiumFloodWait;
                findLoadOperationByRequestToken.caughtPremiumFloodWait = true;
            }
            z11 = false;
        }
        if (z11) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumFloodWaitReceived, new Object[0]);
        }
    }

    public static void lambda$onPremiumFloodWait$24(int i9, boolean z10, int i10) {
        if (UserConfig.selectedAccount != i9) {
            return;
        }
        AndroidUtilities.runOnUIThread(new b(z10, i9, i10));
    }

    public static void lambda$onProxyError$19() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 3);
    }

    public static void lambda$onRequestNewServerIpAndPort$17(int i9, boolean z10, int i10) {
        FileLog.d("13. currentTask == " + currentTask);
        if (currentTask == null && ((i9 != 0 || Math.abs(lastDnsRequestTime - System.currentTimeMillis()) >= 10000) && z10)) {
            lastDnsRequestTime = System.currentTimeMillis();
            if (i9 == 2) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("start mozilla txt task");
                }
                MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i10);
                mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                FileLog.d("9. currentTask = mozilla");
                currentTask = mozillaDnsLoadTask;
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start google txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i10);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("11. currentTask = dnstxt");
            currentTask = googleDnsLoadTask;
        } else if (BuildVars.LOGS_ENABLED) {
            FileLog.d("don't start task, current task = " + currentTask + " next task = " + i9 + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + ApplicationLoader.isNetworkOnline());
        }
    }

    public static void lambda$onRequestNewServerIpAndPort$18(int i9, int i10) {
        Utilities.stageQueue.postRunnable(new b(i9, i10, 2, ApplicationLoader.isNetworkOnline()));
    }

    public static void lambda$onSessionCreated$14(int i9) {
        AccountInstance.getInstance(i9).getMessagesController().getDifference();
    }

    public static void lambda$onUnparsedMessageReceived$12(int i9, TLObject tLObject) {
        AccountInstance.getInstance(i9).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    public static void lambda$onUpdate$13(int i9) {
        AccountInstance.getInstance(i9).getMessagesController().updateTimerProc();
    }

    public static void lambda$onUpdateConfig$21(int i9, TLRPC.TL_config tL_config) {
        AccountInstance.getInstance(i9).getMessagesController().updateConfig(tL_config);
    }

    public void lambda$sendRequestInternal$7(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j10);
        } else if (tLObject instanceof TLRPC.Updates) {
            KeepAliveJob.finishJob();
            AccountInstance.getInstance(this.currentAccount).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (tLObject != null) {
            tLObject.freeResources();
        }
    }

    public void lambda$sendRequestInternal$8(TLObject tLObject, int i9, long j10, RequestDelegate requestDelegate, RequestDelegateTimestamp requestDelegateTimestamp, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i10, int i11, boolean z10, int i12, long j11, int i13, String str, int i14, long j12, long j13, int i15) {
        TLObject tLObject2;
        int i16;
        TLRPC.TL_error tL_error;
        String str2;
        TLRPC.TL_error tL_error2 = null;
        try {
            if (j11 != 0) {
                NativeByteBuffer wrap = NativeByteBuffer.wrap(j11);
                wrap.setDataSourceType(TLDataSourceType.NETWORK);
                wrap.reused = true;
                i16 = wrap.limit();
                try {
                    tLObject2 = tLObject.deserializeResponse(wrap, wrap.readInt32(true), true);
                } catch (Exception e10) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.fatal(e10);
                        return;
                    }
                    throw e10;
                }
            } else {
                if (str != null) {
                    TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
                    tL_error3.code = i13;
                    tL_error3.text = str;
                    if (BuildVars.LOGS_ENABLED && i13 != -2000) {
                        FileLog.e(tLObject + " got error " + tL_error3.code + " " + tL_error3.text);
                    }
                    tLObject2 = null;
                    tL_error2 = tL_error3;
                } else {
                    tLObject2 = null;
                }
                i16 = 0;
            }
            if ((i9 & 2) != 0 && k61.f29996g0.isEmpty()) {
                com.google.android.exoplayer2.upstream.u.b(ApplicationLoader.applicationContext).d(i16, Math.max(0L, (System.currentTimeMillis() - j10) - native_getCurrentPingTime(this.currentAccount)));
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                try {
                    if (!getUserConfig().isClientActivated() && tL_error2 != null && tL_error2.code == 400 && Objects.equals(tL_error2.text, "CONNECTION_NOT_INITED")) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("Cleanup keys for " + this.currentAccount + " because of CONNECTION_NOT_INITED");
                        }
                        cleanup(true);
                        try {
                            sendRequest(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i10, i11, i9, z10);
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            if (tLObject2 != null) {
                tLObject2.networkType = i14;
            }
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("java received ");
                sb2.append(tLObject2);
                if (tL_error2 != null) {
                    str2 = " error = " + tL_error2;
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(" messageId = 0x");
                sb2.append(Long.toHexString(j13));
                FileLog.d(sb2.toString());
                tL_error = tL_error2;
                FileLog.dumpResponseAndRequest(this.currentAccount, tLObject, tLObject2, tL_error, j13, j10, i12);
            } else {
                tL_error = tL_error2;
            }
            Utilities.stageQueue.postRunnable(new p2(this, requestDelegate, tLObject2, tL_error, requestDelegateTimestamp, j12));
        } catch (Exception e13) {
            e = e13;
            FileLog.e(e);
        }
    }

    public static void lambda$sendRequestTyped$3(Executor executor, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new org.telegram.messenger.video.e(callback2, tLObject, tL_error, 3));
        } else {
            callback2.run(tLObject, tL_error);
        }
    }

    public void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, Utilities.Callback2 callback2, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
        if (executor != null) {
            executor.execute(new org.telegram.messenger.video.e(callback2, updates, tL_error, 4));
        } else {
            callback2.run(updates, tL_error);
        }
    }

    public void lambda$setIsUpdating$22(boolean z10) {
        if (this.isUpdating != z10) {
            this.isUpdating = z10;
            if (this.connectionState == 3) {
                AccountInstance.getInstance(this.currentAccount).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateConnectionState, new Object[0]);
            }
        }
    }

    private void listen(int i9, RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
        this.requestCallbacks.put(Integer.valueOf(i9), new RequestCallbacks(requestDelegateInternal, quickAckDelegate, writeToSocketDelegate));
    }

    private void listenCancel(int i9, Runnable runnable) {
        RequestCallbacks requestCallbacks = this.requestCallbacks.get(Integer.valueOf(i9));
        if (requestCallbacks != null) {
            requestCallbacks.onCancelled = runnable;
        }
    }

    public static native byte[] nativeTestGenerateClientHello(String str);

    public static native void native_applyDatacenterAddress(int i9, int i10, String str, int i11);

    public static native void native_applyDnsConfig(int i9, long j10, String str, int i10);

    public static native void native_bindRequestToGuid(int i9, int i10, int i11);

    public static native void native_cancelRequest(int i9, int i10, boolean z10);

    public static native void native_cancelRequestsForGuid(int i9, int i10);

    public static native long native_checkProxy(int i9, String str, int i10, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate);

    public static native void native_cleanUp(int i9, boolean z10);

    public static native void native_discardConnection(int i9, int i10, int i11);

    public static native void native_failNotRunningRequest(int i9, int i10);

    public static native int native_getConnectionState(int i9);

    public static native long native_getCurrentAuthKeyId(int i9);

    public static native int native_getCurrentDatacenterId(int i9);

    public static native int native_getCurrentPingTime(int i9);

    public static native int native_getCurrentTime(int i9);

    public static native long native_getCurrentTimeMillis(int i9);

    public static native int native_getTimeDifference(int i9);

    public static native void native_init(int i9, int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i13, long j10, boolean z10, boolean z11, boolean z12, int i14, int i15);

    public static native boolean native_isGoodPrime(byte[] bArr, int i9);

    public static native int native_isTestBackend(int i9);

    public static native void native_moveDatacenter(int i9, int i10);

    public static native void native_onHostNameResolved(String str, long j10, String str2);

    public static native void native_pauseNetwork(int i9);

    public static native void native_receivedCaptchaResult(int i9, int[] iArr, String str);

    public static native void native_receivedIntegrityCheckClassic(int i9, int i10, String str, String str2);

    public static native void native_resumeNetwork(int i9, boolean z10);

    public static native void native_sendRequest(int i9, long j10, int i10, int i11, int i12, boolean z10, int i13);

    public static native void native_setIpStrategy(int i9, byte b10);

    public static native void native_setJava(boolean z10);

    public static native void native_setLangCode(int i9, String str);

    public static native void native_setNetworkAvailable(int i9, boolean z10, int i10, boolean z11);

    public static native void native_setProxySettings(int i9, String str, int i10, String str2, String str3, String str4);

    public static native void native_setPushConnectionEnabled(int i9, boolean z10);

    public static native void native_setRegId(int i9, String str);

    public static native void native_setSystemLangCode(int i9, String str);

    public static native void native_setUserId(int i9, long j10);

    public static native void native_switchBackend(int i9, boolean z10);

    public static native boolean native_test_AuthAuthorization(long j10);

    public static native void native_updateDcSettings(int i9);

    public static void onBytesReceived(int i9, int i10, int i11) {
        try {
            StatsController.getInstance(i11).incrementReceivedBytesCount(i10, 6, i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void onBytesSent(int i9, int i10, int i11) {
        try {
            AccountInstance.getInstance(i11).getStatsController().incrementSentBytesCount(i10, 6, i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void onCaptchaCheck(int i9, int i10, String str, String str2) {
        CaptchaController.request(i9, i10, str, str2);
    }

    public static void onConnectionStateChanged(int i9, int i10) {
        AndroidUtilities.runOnUIThread(new dh(i10, i9, 2));
    }

    public static void onIntegrityCheckClassic(int i9, int i10, String str, String str2) {
        AndroidUtilities.runOnUIThread(new e0(i9, i10, str, str2));
    }

    public static void onInternalPushReceived(int i9) {
        KeepAliveJob.startJob();
    }

    public static void onLogout(int i9) {
        AndroidUtilities.runOnUIThread(new k2(i9, 9));
    }

    public static void onPremiumFloodWait(int i9, int i10, boolean z10) {
        AndroidUtilities.runOnUIThread(new b(i9, i10, 0, z10));
    }

    public static void onProxyError() {
        AndroidUtilities.runOnUIThread(new Object());
    }

    public static void onRequestClear(int i9, int i10, boolean z10) {
        ConnectionsManager connectionsManager = getInstance(i9);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10));
            if (z10) {
                if (requestCallbacks != null) {
                    Runnable runnable = requestCallbacks.onCancelled;
                    if (runnable != null) {
                        runnable.run();
                    }
                    connectionsManager.requestCallbacks.remove(Integer.valueOf(i10));
                }
            } else if (requestCallbacks != null) {
                connectionsManager.requestCallbacks.remove(Integer.valueOf(i10));
            }
        }
    }

    public static void onRequestComplete(int i9, int i10, long j10, int i11, String str, int i12, long j11, long j12, int i13) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i9);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10));
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i10));
            if (requestCallbacks != null && (requestDelegateInternal = requestCallbacks.onComplete) != null) {
                requestDelegateInternal.run(j10, i11, str, i12, j11, j12, i13);
            }
        }
    }

    public static void onRequestNewServerIpAndPort(int i9, int i10) {
        Utilities.globalQueue.postRunnable(new dh(i9, i10, 1));
    }

    public static void onRequestQuickAck(int i9, int i10) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i9);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10))) != null && (quickAckDelegate = requestCallbacks.onQuickAck) != null) {
            quickAckDelegate.run();
        }
    }

    public static void onRequestWriteToSocket(int i9, int i10) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i9);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10))) != null && (writeToSocketDelegate = requestCallbacks.onWriteToSocket) != null) {
            writeToSocketDelegate.run();
        }
    }

    public static void onSessionCreated(int i9) {
        Utilities.stageQueue.postRunnable(new k2(i9, 8));
    }

    public static void onUnparsedMessageReceived(long j10, int i9, long j11) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j10);
            wrap.setDataSourceType(TLDataSourceType.NETWORK);
            wrap.reused = true;
            int readInt32 = wrap.readInt32(true);
            TLObject TLdeserialize = TLClassStore.Instance().TLdeserialize(wrap, readInt32, true);
            FileLog.dumpUnparsedMessage(TLdeserialize, j11, i9);
            if (TLdeserialize instanceof TLRPC.Updates) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("java received " + TLdeserialize);
                }
                KeepAliveJob.finishJob();
                Utilities.stageQueue.postRunnable(new g(i9, (TLRPC.Updates) TLdeserialize, 0));
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d(String.format("java received unknown constructor 0x%x", Integer.valueOf(readInt32)));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void onUpdate(int i9) {
        Utilities.stageQueue.postRunnable(new k2(i9, 7));
    }

    public static void onUpdateConfig(long j10, int i9) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j10);
            wrap.reused = true;
            TLRPC.TL_config TLdeserialize = TLRPC.TL_config.TLdeserialize(wrap, wrap.readInt32(true), true);
            if (TLdeserialize != null) {
                Utilities.stageQueue.postRunnable(new c2(i9, TLdeserialize, 13));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i9, final int i10, final int i11, final boolean z10, final int i12) {
        long j10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("send request " + tLObject + " with token = " + i12);
        }
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer);
            tLObject.freeResources();
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                if (!BuildVars.LOGS_ENABLED) {
                }
                j10 = System.currentTimeMillis();
                final long j11 = j10;
                listen(i12, new RequestDelegateInternal() {
                    @Override
                    public final void run(long j12, int i13, String str, int i14, long j13, long j14, int i15) {
                        ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i11, j11, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i9, i10, z10, i12, j12, i13, str, i14, j13, j14, i15);
                    }
                }, quickAckDelegate, writeToSocketDelegate);
                native_sendRequest(this.currentAccount, nativeByteBuffer.address, i9, i10, i11, z10, i12);
            }
            if ((i11 & 2) == 0) {
                j10 = 0;
                final long j112 = j10;
                listen(i12, new RequestDelegateInternal() {
                    @Override
                    public final void run(long j12, int i13, String str, int i14, long j13, long j14, int i15) {
                        ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i11, j112, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i9, i10, z10, i12, j12, i13, str, i14, j13, j14, i15);
                    }
                }, quickAckDelegate, writeToSocketDelegate);
                native_sendRequest(this.currentAccount, nativeByteBuffer.address, i9, i10, i11, z10, i12);
            }
            j10 = System.currentTimeMillis();
            final long j1122 = j10;
            listen(i12, new RequestDelegateInternal() {
                @Override
                public final void run(long j12, int i13, String str, int i14, long j13, long j14, int i15) {
                    ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i11, j1122, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i9, i10, z10, i12, j12, i13, str, i14, j13, j14, i15);
                }
            }, quickAckDelegate, writeToSocketDelegate);
            native_sendRequest(this.currentAccount, nativeByteBuffer.address, i9, i10, i11, z10, i12);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i9 = 0; i9 < 4; i9++) {
            native_setLangCode(i9, lowerCase);
        }
    }

    public static void setProxySettings(boolean z10, String str, int i9, String str2, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        String str8;
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        if (str2 == null) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if (str3 == null) {
            str7 = "";
        } else {
            str7 = str3;
        }
        if (str4 == null) {
            str8 = "";
        } else {
            str8 = str4;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (z10 && !TextUtils.isEmpty(str5)) {
                native_setProxySettings(i10, str5, i9, str6, str7, str8);
            } else {
                native_setProxySettings(i10, "", 1080, "", "", "");
            }
            AccountInstance accountInstance = AccountInstance.getInstance(i10);
            if (accountInstance.getUserConfig().isClientActivated()) {
                accountInstance.getMessagesController().checkPromoInfo(true);
            }
        }
    }

    public static void setRegId(String str, int i9, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && i9 == 13) {
            str = ta.b.d("huawei://", str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            if (i9 == 2) {
                str3 = "FIREBASE";
            } else {
                str3 = "HUAWEI";
            }
            StringBuilder t10 = aa.d.t("__", str3, "_GENERATING_SINCE_");
            t10.append(getInstance(0).getCurrentTime());
            t10.append("__");
            str2 = t10.toString();
            SharedConfig.pushStringStatus = str2;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            native_setRegId(i10, str2);
        }
    }

    public static void setSystemLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i9 = 0; i9 < 4; i9++) {
            native_setSystemLangCode(i9, lowerCase);
        }
    }

    public static boolean testNativeTlScheme(NativeByteBuffer nativeByteBuffer, INativeTlTest iNativeTlTest) {
        return iNativeTlTest.test(nativeByteBuffer.address);
    }

    public void applyDatacenterAddress(int i9, String str, int i10) {
        native_applyDatacenterAddress(this.currentAccount, i9, str, i10);
    }

    public void bindRequestToGuid(int i9, int i10) {
        if (i10 == 0) {
            return;
        }
        native_bindRequestToGuid(this.currentAccount, i9, i10);
    }

    public void cancelRequest(int i9, boolean z10) {
        cancelRequest(i9, z10, null);
    }

    public void cancelRequestsForGuid(int i9) {
        Utilities.stageQueue.postRunnable(new a(this, i9, 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, ApplicationLoader.isNetworkOnline(), ApplicationLoader.getCurrentNetworkType(), ApplicationLoader.isConnectionSlow());
    }

    public long checkProxy(String str, int i9, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate) {
        String str5;
        String str6;
        String str7;
        String str8;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        if (str2 == null) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if (str3 == null) {
            str7 = "";
        } else {
            str7 = str3;
        }
        if (str4 == null) {
            str8 = "";
        } else {
            str8 = str4;
        }
        return native_checkProxy(this.currentAccount, str5, i9, str6, str7, str8, requestTimeDelegate);
    }

    public void cleanup(boolean z10) {
        native_cleanUp(this.currentAccount, z10);
    }

    public void discardConnection(int i9, int i10) {
        Utilities.stageQueue.postRunnable(new y(this, i9, i10, 5));
    }

    public void failNotRunningRequest(int i9) {
        Utilities.stageQueue.postRunnable(new a(this, i9, 0));
    }

    public int getConnectionState() {
        int i9 = this.connectionState;
        if (i9 == 3 && this.isUpdating) {
            return 5;
        }
        return i9;
    }

    public long getCurrentAuthKeyId() {
        return native_getCurrentAuthKeyId(this.currentAccount);
    }

    public int getCurrentDatacenterId() {
        return native_getCurrentDatacenterId(this.currentAccount);
    }

    public int getCurrentTime() {
        return native_getCurrentTime(this.currentAccount);
    }

    public long getCurrentTimeMillis() {
        return native_getCurrentTimeMillis(this.currentAccount);
    }

    public byte getIpStrategy() {
        if (BuildVars.LOGS_ENABLED) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback() && !nextElement.getInterfaceAddresses().isEmpty()) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("valid interface: " + nextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                        for (int i9 = 0; i9 < interfaceAddresses.size(); i9++) {
                            InetAddress address = interfaceAddresses.get(i9).getAddress();
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("address: " + address.getHostAddress());
                            }
                            if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress() && BuildVars.LOGS_ENABLED) {
                                FileLog.d("address is good");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (networkInterfaces2.hasMoreElements()) {
                NetworkInterface nextElement2 = networkInterfaces2.nextElement();
                if (nextElement2.isUp() && !nextElement2.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses2 = nextElement2.getInterfaceAddresses();
                    for (int i10 = 0; i10 < interfaceAddresses2.size(); i10++) {
                        InetAddress address2 = interfaceAddresses2.get(i10).getAddress();
                        if (!address2.isLinkLocalAddress() && !address2.isLoopbackAddress() && !address2.isMulticastAddress()) {
                            if (address2 instanceof Inet6Address) {
                                z10 = true;
                            } else if (address2 instanceof Inet4Address) {
                                if (!address2.getHostAddress().startsWith("192.0.0.")) {
                                    z12 = true;
                                } else {
                                    z11 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z10) {
                if (this.forceTryIpV6) {
                    return (byte) 1;
                }
                if (z11) {
                    return (byte) 2;
                }
                if (!z12) {
                    return (byte) 1;
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        return (byte) 0;
    }

    public long getPauseTime() {
        return this.lastPauseTime;
    }

    public int getTimeDifference() {
        return native_getTimeDifference(this.currentAccount);
    }

    public void init(int i9, int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, long j10, boolean z10, boolean z11) {
        String str10;
        String str11;
        Context context;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i13 = sharedPreferences.getInt("proxy_port", 1080);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
            native_setProxySettings(this.currentAccount, string, i13, string2, string3, string4);
        }
        try {
            context = ApplicationLoader.applicationContext;
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
            if (installSourceInfo != null) {
                str10 = installSourceInfo.getInitiatingPackageName();
                if (str10 == null) {
                    try {
                        str10 = installSourceInfo.getInstallingPackageName();
                    } catch (Throwable unused2) {
                    }
                }
            }
            str10 = "";
        } else {
            str10 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        }
        String str12 = str10 == null ? "" : str10;
        try {
            str11 = ApplicationLoader.applicationContext.getPackageName();
        } catch (Throwable unused3) {
            str11 = "";
        }
        native_init(this.currentAccount, i9, i10, i11, str, str2, str3, str4, str5, str6, str7, str8, str9, str12, str11 == null ? "" : str11, i12, j10, z10, z11, ApplicationLoader.isNetworkOnline(), ApplicationLoader.getCurrentNetworkType(), SharedConfig.measureDevicePerformanceClass());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        if (globalNotificationsSettings.contains("pushConnection")) {
            return globalNotificationsSettings.getBoolean("pushConnection", true);
        }
        return MessagesController.getMainSettings(UserConfig.selectedAccount).getBoolean("backgroundConnection", false);
    }

    public boolean isTestBackend() {
        if (native_isTestBackend(this.currentAccount) != 0) {
            return true;
        }
        return false;
    }

    public void resumeNetworkMaybe() {
        native_resumeNetwork(this.currentAccount, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate) {
        return sendRequest(tLObject, requestDelegate, (QuickAckDelegate) null, 0);
    }

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i9, int i10, int i11, boolean z10) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$6(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i9, i10, i11, z10, andIncrement);
        return andIncrement;
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Utilities.Callback2<T, TLRPC.TL_error> callback2) {
        return sendRequestTyped(tLMethod, null, callback2);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, Utilities.Callback2<TLRPC.Updates, TLRPC.TL_error> callback2) {
        return sendRequestTypedAndProcessUpdates(tLMethod, executor, callback2, Integer.MAX_VALUE, 0);
    }

    public void setAppPaused(boolean z10, boolean z11) {
        if (!z11) {
            this.appPaused = z10;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app paused = " + z10);
            }
            if (z10) {
                this.appResumeCount--;
            } else {
                this.appResumeCount++;
            }
            if (BuildVars.LOGS_ENABLED) {
                l0.n(this.appResumeCount, new StringBuilder("app resume count "));
            }
            if (this.appResumeCount < 0) {
                this.appResumeCount = 0;
            }
        }
        if (this.appResumeCount == 0) {
            if (this.lastPauseTime == 0) {
                this.lastPauseTime = System.currentTimeMillis();
            }
            native_pauseNetwork(this.currentAccount);
        } else if (this.appPaused) {
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset app pause time");
            }
            if (this.lastPauseTime != 0 && System.currentTimeMillis() - this.lastPauseTime > 5000) {
                getContactsController().checkContacts();
            }
            this.lastPauseTime = 0L;
            native_resumeNetwork(this.currentAccount, false);
        }
    }

    public void setDefaultDatacenterId(int i9) {
        native_moveDatacenter(this.currentAccount, i9);
    }

    public void setForceTryIpV6(boolean z10) {
        if (this.forceTryIpV6 != z10) {
            this.forceTryIpV6 = z10;
            checkConnection();
        }
    }

    public void setIsUpdating(boolean z10) {
        AndroidUtilities.runOnUIThread(new eh.f(22, this, z10));
    }

    public void setPushConnectionEnabled(boolean z10) {
        native_setPushConnectionEnabled(this.currentAccount, z10);
    }

    public void setUserId(long j10) {
        native_setUserId(this.currentAccount, j10);
    }

    public void switchBackend(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z10);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public void cancelRequest(int i9, boolean z10, Runnable runnable) {
        Utilities.stageQueue.postRunnable(new j0(i9, 1, this, runnable, z10));
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i9) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i9, Integer.MAX_VALUE, 1, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> callback2) {
        return sendRequestTyped(tLMethod, executor, callback2, Integer.MAX_VALUE, 0);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, Utilities.Callback2<TLRPC.Updates, TLRPC.TL_error> callback2, int i9, int i10) {
        return sendRequestTyped(tLMethod, null, new f0(this, executor, callback2, 4), i9, i10);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i9, int i10) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i9, Integer.MAX_VALUE, i10, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> callback2, int i9) {
        return sendRequestTyped(tLMethod, executor, callback2, Integer.MAX_VALUE, i9);
    }

    public int sendRequest(TLObject tLObject, RequestDelegateTimestamp requestDelegateTimestamp, int i9, int i10, int i11) {
        return sendRequest(tLObject, null, requestDelegateTimestamp, null, null, i9, i11, i10, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, final Executor executor, final Utilities.Callback2<T, TLRPC.TL_error> callback2, int i9, int i10) {
        return sendRequest(tLMethod, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ConnectionsManager.lambda$sendRequestTyped$3(executor, callback2, tLObject, tL_error);
            }
        }, null, null, null, i10, i9, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, int i9) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, null, i9, Integer.MAX_VALUE, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i9, int i10, int i11, boolean z10) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i9, i10, i11, z10);
    }

    public int sendRequest(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i9, final int i10, final int i11, final boolean z10) {
        final int andIncrement = this.lastRequestToken.getAndIncrement();
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.this.lambda$sendRequest$6(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i9, i10, i11, z10, andIncrement);
            }
        });
        return andIncrement;
    }
}
