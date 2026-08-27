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
import cg.b2;
import cg.w1;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import gh.d0;
import h3.f0;
import h3.z;
import hh.p2;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
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
import jh.d2;
import nh.k2;
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
import org.telegram.messenger.hh;
import org.telegram.messenger.voip.j0;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.m61;
import org.telegram.ui.ig0;

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

        public GoogleDnsLoadTask(int i10) {
            this.currentAccount = i10;
        }

        public static int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            FileLog.d("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i10 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i10, nativeByteBuffer.address, AccountInstance.getInstance(i10).getUserConfig().getClientPhone(), this.responseDate);
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
            int i10;
            boolean z10 = false;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : AccountInstance.getInstance(this.currentAccount).getMessagesController().dcDomainName;
                int iNextInt = Utilities.random.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(iNextInt);
                for (int i11 = 0; i11 < iNextInt; i11++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.random.nextInt(62)));
                }
                URLConnection uRLConnectionOpenConnection = new URL("https://dns.google.com/resolve?name=" + str + "&type=ANY&random_padding=" + ((Object) sb2)).openConnection();
                uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                uRLConnectionOpenConnection.setConnectTimeout(5000);
                uRLConnectionOpenConnection.setReadTimeout(5000);
                uRLConnectionOpenConnection.connect();
                InputStream inputStream2 = uRLConnectionOpenConnection.getInputStream();
                try {
                    this.responseDate = (int) (uRLConnectionOpenConnection.getDate() / 1000);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (!isCancelled() && (i10 = inputStream2.read(bArr)) > 0) {
                            byteArrayOutputStream2.write(bArr, 0, i10);
                        }
                        JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i12 = 0; i12 < length; i12++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            if (jSONObject.getInt("type") == 16) {
                                arrayList.add(jSONObject.getString("data"));
                            }
                        }
                        Collections.sort(arrayList, new i(0));
                        StringBuilder sb3 = new StringBuilder();
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            sb3.append(((String) arrayList.get(i13)).replace("\"", ""));
                        }
                        byte[] bArrDecode = Base64.decode(sb3.toString(), 0);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(bArrDecode.length);
                        nativeByteBuffer.writeBytes(bArrDecode);
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
                            return null;
                        } finally {
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
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
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

        public MozillaDnsLoadTask(int i10) {
            this.currentAccount = i10;
        }

        public static int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            FileLog.d("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i10 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i10, nativeByteBuffer.address, AccountInstance.getInstance(i10).getUserConfig().getClientPhone(), this.responseDate);
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to get mozilla txt result");
            }
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            int i10;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : AccountInstance.getInstance(this.currentAccount).getMessagesController().dcDomainName;
                int iNextInt = Utilities.random.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(iNextInt);
                for (int i11 = 0; i11 < iNextInt; i11++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.random.nextInt(62)));
                }
                URLConnection uRLConnectionOpenConnection = new URL("https://mozilla.cloudflare-dns.com/dns-query?name=" + str + "&type=TXT&random_padding=" + ((Object) sb2)).openConnection();
                uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                uRLConnectionOpenConnection.addRequestProperty("accept", "application/dns-json");
                uRLConnectionOpenConnection.setConnectTimeout(5000);
                uRLConnectionOpenConnection.setReadTimeout(5000);
                uRLConnectionOpenConnection.connect();
                InputStream inputStream2 = uRLConnectionOpenConnection.getInputStream();
                try {
                    this.responseDate = (int) (uRLConnectionOpenConnection.getDate() / 1000);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (!isCancelled() && (i10 = inputStream2.read(bArr)) > 0) {
                            byteArrayOutputStream2.write(bArr, 0, i10);
                        }
                        JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i12 = 0; i12 < length; i12++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            if (jSONObject.getInt("type") == 16) {
                                arrayList.add(jSONObject.getString("data"));
                            }
                        }
                        Collections.sort(arrayList, new i(1));
                        StringBuilder sb3 = new StringBuilder();
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            sb3.append(((String) arrayList.get(i13)).replace("\"", ""));
                        }
                        byte[] bArrDecode = Base64.decode(sb3.toString(), 0);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(bArrDecode.length);
                        nativeByteBuffer.writeBytes(bArrDecode);
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
                            FileLog.e(th, false);
                            return null;
                        } finally {
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
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
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
                URLConnection uRLConnectionOpenConnection = new URL("https://www.google.com/resolve?name=" + this.currentHostName + "&type=A").openConnection();
                uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                uRLConnectionOpenConnection.addRequestProperty("Host", "dns.google.com");
                uRLConnectionOpenConnection.setConnectTimeout(1000);
                uRLConnectionOpenConnection.setReadTimeout(2000);
                uRLConnectionOpenConnection.connect();
                inputStream = uRLConnectionOpenConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int i10 = inputStream.read(bArr);
                            if (i10 <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        }
                        JSONObject jSONObject = new JSONObject(new String(byteArrayOutputStream.toByteArray()));
                        if (jSONObject.has("Answer") && (length = (jSONArray = jSONObject.getJSONArray("Answer")).length()) > 0) {
                            ArrayList arrayList = new ArrayList(length);
                            for (int i11 = 0; i11 < length; i11++) {
                                arrayList.add(jSONArray.getJSONObject(i11).getString("data"));
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
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            FileLog.e(th, false);
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
                                } catch (Exception unused3) {
                                }
                            }
                            try {
                                InetAddress byName = InetAddress.getByName(this.currentHostName);
                                ArrayList arrayList2 = new ArrayList(1);
                                arrayList2.add(byName.getHostAddress());
                                return new ResolvedDomain(arrayList2, SystemClock.elapsedRealtime());
                            } catch (Exception e9) {
                                FileLog.e((Throwable) e9, false);
                            }
                        } catch (Throwable th5) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th6) {
                                    FileLog.e(th6, false);
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th5;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th5;
                            } catch (Exception unused4) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th8) {
                th = th8;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        }

        @Override
        public void onPostExecute(ResolvedDomain resolvedDomain) {
            int i10 = 0;
            if (resolvedDomain != null) {
                ConnectionsManager.dnsCache.put(this.currentHostName, resolvedDomain);
                int size = this.addresses.size();
                while (i10 < size) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i10).longValue(), resolvedDomain.getAddress());
                    i10++;
                }
            } else {
                int size2 = this.addresses.size();
                while (i10 < size2) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i10).longValue(), "");
                    i10++;
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
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        CORE_POOL_SIZE = iMax;
        int i10 = (iAvailableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i10;
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
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i10, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    public ConnectionsManager(int i10) {
        String str;
        String lowerCase;
        String str2;
        String str3;
        String lowerCase2;
        SharedPreferences sharedPreferences;
        super(i10);
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (i10 != 0) {
            File file = new File(filesDirFixed, i0.a.k(i10, "account"));
            file.mkdirs();
            filesDirFixed = file;
        }
        String string = filesDirFixed.toString();
        boolean zIsPushConnectionEnabled = isPushConnectionEnabled();
        try {
            lowerCase2 = LocaleController.getSystemLocaleStringIso639().toLowerCase();
            lowerCase = LocaleController.getLocaleStringIso639().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str2 = str2 + " pbeta";
            } else if (BuildVars.DEBUG_VERSION) {
                str2 = str2 + " beta";
            }
            str = "SDK " + Build.VERSION.SDK_INT;
        } catch (Exception unused) {
            str = "SDK " + Build.VERSION.SDK_INT;
            lowerCase = "";
            str2 = "App version unknown";
            str3 = "Android unknown";
            lowerCase2 = "en";
        }
        String str4 = lowerCase2.trim().length() != 0 ? lowerCase2 : "en";
        String str5 = str3.trim().length() != 0 ? str3 : "Android unknown";
        String str6 = str2.trim().length() == 0 ? "App version unknown" : str2;
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
        init(SharedConfig.buildVersion(), 229, BuildVars.APP_ID, str5, str, str6, lowerCase, str4, string, FileLog.getNetworkLogPath(), regId, certificateSHA256Fingerprint, dSTSavings, getUserConfig().getClientUserId(), getUserConfig().getCurrentUser() != null ? getUserConfig().getCurrentUser().premium : false, zIsPushConnectionEnabled);
    }

    public static int generateClassGuid() {
        int i10 = lastClassGuid;
        lastClassGuid = i10 + 1;
        return i10;
    }

    public static void getHostByName(String str, long j10) {
        AndroidUtilities.runOnUIThread(new b2(str, j10, 19));
    }

    public static int getInitFlags() {
        if (!EmuDetector.with(ApplicationLoader.applicationContext).detect()) {
            return 0;
        }
        if (!BuildVars.LOGS_ENABLED) {
            return 1024;
        }
        FileLog.d("detected emu");
        return 1024;
    }

    public static ConnectionsManager getInstance(int i10) {
        ConnectionsManager connectionsManager;
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager2 = connectionsManagerArr[i10];
        if (connectionsManager2 != null) {
            return connectionsManager2;
        }
        synchronized (ConnectionsManager.class) {
            try {
                connectionsManager = connectionsManagerArr[i10];
                if (connectionsManager == null) {
                    connectionsManager = new ConnectionsManager(i10);
                    connectionsManagerArr[i10] = connectionsManager;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return connectionsManager;
    }

    private String getRegId() {
        String strE = SharedConfig.pushString;
        if (!TextUtils.isEmpty(strE) && SharedConfig.pushType == 13) {
            strE = s3.c.e("huawei://", strE);
        }
        if (TextUtils.isEmpty(strE) && !TextUtils.isEmpty(SharedConfig.pushStringStatus)) {
            strE = SharedConfig.pushStringStatus;
        }
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        StringBuilder sbR = a9.p.r("__", SharedConfig.pushType == 2 ? "FIREBASE" : "HUAWEI", "_GENERATING_SINCE_");
        sbR.append(getCurrentTime());
        sbR.append("__");
        String string = sbR.toString();
        SharedConfig.pushStringStatus = string;
        return string;
    }

    public void lambda$cancelRequest$10(Runnable runnable, int i10, boolean z10) {
        if (runnable != null) {
            listenCancel(i10, new d2(3, runnable));
        }
        native_cancelRequest(this.currentAccount, i10, z10);
    }

    public static void lambda$cancelRequest$9(Runnable runnable) {
        Utilities.stageQueue.postRunnable(runnable);
    }

    public void lambda$cancelRequestsForGuid$11(int i10) {
        native_cancelRequestsForGuid(this.currentAccount, i10);
    }

    public void lambda$discardConnection$0(int i10, int i11) {
        native_discardConnection(this.currentAccount, i10, i11);
    }

    public void lambda$failNotRunningRequest$1(int i10) {
        native_failNotRunningRequest(this.currentAccount, i10);
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

    public static void lambda$onConnectionStateChanged$15(int i10, int i11) {
        getInstance(i10).connectionState = i11;
        AccountInstance.getInstance(i10).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateConnectionState, new Object[0]);
    }

    public static void lambda$onIntegrityCheckClassic$25(int i10, long j10, int i11, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder sbO = i0.a.o(i10, "account", ": integrity check gave null token in ");
            sbO.append(System.currentTimeMillis() - j10);
            sbO.append("ms");
            FileLog.e(sbO.toString());
            native_receivedIntegrityCheckClassic(i10, i11, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        FileLog.d("account" + i10 + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j10) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i10, i11, str, str2);
        } catch (Exception e9) {
            FileLog.e("receivedIntegrityCheckClassic failed", e9);
        }
    }

    public static void lambda$onIntegrityCheckClassic$26(int i10, long j10, int i11, String str, Exception exc) {
        StringBuilder sbO = i0.a.o(i10, "account", ": integrity check failed to give a token in ");
        sbO.append(System.currentTimeMillis() - j10);
        sbO.append("ms");
        FileLog.e(sbO.toString(), exc);
        native_receivedIntegrityCheckClassic(i10, i11, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + ig0.f1(exc));
    }

    public static void lambda$onIntegrityCheckClassic$27(int i10, String str, String str2, int i11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("account");
        sb2.append(i10);
        sb2.append(": server requests integrity classic check with project = ");
        sb2.append(str);
        sb2.append(" nonce = ");
        pa.v(str2, sb2);
        try {
            IntegrityManagerFactory.create(ApplicationLoader.applicationContext).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new f(i10, jCurrentTimeMillis, str2, i11)).addOnFailureListener(new f(i10, jCurrentTimeMillis, str2, i11));
        } catch (Exception unused) {
            FileLog.d("account" + i10 + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i10, i11, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    public static void lambda$onLogout$16(int i10) {
        AccountInstance accountInstance = AccountInstance.getInstance(i10);
        if (accountInstance.getUserConfig().getClientUserId() != 0) {
            accountInstance.getUserConfig().clearConfig();
            accountInstance.getMessagesController().performLogout(0);
        }
    }

    public static void lambda$onPremiumFloodWait$23(boolean z10, int i10, int i11) {
        boolean z11;
        if (z10) {
            FileUploadOperation fileUploadOperationFindUploadOperationByRequestToken = FileLoader.getInstance(i10).findUploadOperationByRequestToken(i11);
            if (fileUploadOperationFindUploadOperationByRequestToken != null) {
                z11 = !fileUploadOperationFindUploadOperationByRequestToken.caughtPremiumFloodWait;
                fileUploadOperationFindUploadOperationByRequestToken.caughtPremiumFloodWait = true;
            } else {
                z11 = false;
            }
        } else {
            FileLoadOperation fileLoadOperationFindLoadOperationByRequestToken = FileLoader.getInstance(i10).findLoadOperationByRequestToken(i11);
            if (fileLoadOperationFindLoadOperationByRequestToken != null) {
                z11 = !fileLoadOperationFindLoadOperationByRequestToken.caughtPremiumFloodWait;
                fileLoadOperationFindLoadOperationByRequestToken.caughtPremiumFloodWait = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumFloodWaitReceived, new Object[0]);
        }
    }

    public static void lambda$onPremiumFloodWait$24(int i10, boolean z10, int i11) {
        if (UserConfig.selectedAccount != i10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new b(z10, i10, i11));
    }

    public static void lambda$onProxyError$19() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 3);
    }

    public static void lambda$onRequestNewServerIpAndPort$17(int i10, boolean z10, int i11) {
        FileLog.d("13. currentTask == " + currentTask);
        if (currentTask != null || ((i10 == 0 && Math.abs(lastDnsRequestTime - System.currentTimeMillis()) < 10000) || !z10)) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("don't start task, current task = " + currentTask + " next task = " + i10 + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + ApplicationLoader.isNetworkOnline());
                return;
            }
            return;
        }
        lastDnsRequestTime = System.currentTimeMillis();
        if (i10 == 2) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start mozilla txt task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i11);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("9. currentTask = mozilla");
            currentTask = mozillaDnsLoadTask;
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start google txt task");
        }
        GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i11);
        googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
        FileLog.d("11. currentTask = dnstxt");
        currentTask = googleDnsLoadTask;
    }

    public static void lambda$onRequestNewServerIpAndPort$18(int i10, int i11) {
        Utilities.stageQueue.postRunnable(new b(i10, i11, 2, ApplicationLoader.isNetworkOnline()));
    }

    public static void lambda$onSessionCreated$14(int i10) {
        AccountInstance.getInstance(i10).getMessagesController().getDifference();
    }

    public static void lambda$onUnparsedMessageReceived$12(int i10, TLObject tLObject) {
        AccountInstance.getInstance(i10).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    public static void lambda$onUpdate$13(int i10) {
        AccountInstance.getInstance(i10).getMessagesController().updateTimerProc();
    }

    public static void lambda$onUpdateConfig$21(int i10, TLRPC.TL_config tL_config) {
        AccountInstance.getInstance(i10).getMessagesController().updateConfig(tL_config);
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

    public void lambda$sendRequestInternal$8(TLObject tLObject, int i10, long j10, RequestDelegate requestDelegate, RequestDelegateTimestamp requestDelegateTimestamp, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i11, int i12, boolean z10, int i13, long j11, int i14, String str, int i15, long j12, long j13, int i16) {
        int iLimit;
        TLRPC.TL_error tL_error;
        String str2;
        TLRPC.TL_error tL_error2 = null;
        TLObject tLObjectDeserializeResponse = null;
        tL_error2 = null;
        try {
            if (j11 != 0) {
                NativeByteBuffer nativeByteBufferWrap = NativeByteBuffer.wrap(j11);
                nativeByteBufferWrap.setDataSourceType(TLDataSourceType.NETWORK);
                nativeByteBufferWrap.reused = true;
                iLimit = nativeByteBufferWrap.limit();
                try {
                    tLObjectDeserializeResponse = tLObject.deserializeResponse(nativeByteBufferWrap, nativeByteBufferWrap.readInt32(true), true);
                } catch (Exception e9) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        throw e9;
                    }
                    FileLog.fatal(e9);
                    return;
                }
            } else {
                if (str != null) {
                    TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
                    tL_error3.code = i14;
                    tL_error3.text = str;
                    if (BuildVars.LOGS_ENABLED && i14 != -2000) {
                        FileLog.e(tLObject + " got error " + tL_error3.code + " " + tL_error3.text);
                    }
                    tL_error2 = tL_error3;
                }
                iLimit = 0;
            }
            if ((i10 & 2) != 0 && m61.f30588g0.isEmpty()) {
                com.google.android.exoplayer2.upstream.u.b(ApplicationLoader.applicationContext).d(iLimit, Math.max(0L, (System.currentTimeMillis() - j10) - ((long) native_getCurrentPingTime(this.currentAccount))));
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                try {
                    if (!getUserConfig().isClientActivated() && tL_error2 != null && tL_error2.code == 400 && Objects.equals(tL_error2.text, "CONNECTION_NOT_INITED")) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("Cleanup keys for " + this.currentAccount + " because of CONNECTION_NOT_INITED");
                        }
                        cleanup(true);
                        try {
                            sendRequest(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i11, i12, i10, z10);
                            return;
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            if (tLObjectDeserializeResponse != null) {
                tLObjectDeserializeResponse.networkType = i15;
            }
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("java received ");
                sb2.append(tLObjectDeserializeResponse);
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
                FileLog.dumpResponseAndRequest(this.currentAccount, tLObject, tLObjectDeserializeResponse, tL_error, j13, j10, i13);
            } else {
                tL_error = tL_error2;
            }
            Utilities.stageQueue.postRunnable(new p2(this, requestDelegate, tLObjectDeserializeResponse, tL_error, requestDelegateTimestamp, j12));
        } catch (Exception e12) {
            e = e12;
            FileLog.e(e);
        }
    }

    public static void lambda$sendRequestTyped$3(Executor executor, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new j3.m(callback2, tLObject, tL_error, 27));
        } else {
            callback2.run(tLObject, tL_error);
        }
    }

    public void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, Utilities.Callback2 callback2, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
        if (executor != null) {
            executor.execute(new j3.m(callback2, updates, tL_error, 28));
        } else {
            callback2.run(updates, tL_error);
        }
    }

    public void lambda$setIsUpdating$22(boolean z10) {
        if (this.isUpdating == z10) {
            return;
        }
        this.isUpdating = z10;
        if (this.connectionState == 3) {
            AccountInstance.getInstance(this.currentAccount).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateConnectionState, new Object[0]);
        }
    }

    private void listen(int i10, RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
        this.requestCallbacks.put(Integer.valueOf(i10), new RequestCallbacks(requestDelegateInternal, quickAckDelegate, writeToSocketDelegate));
    }

    private void listenCancel(int i10, Runnable runnable) {
        RequestCallbacks requestCallbacks = this.requestCallbacks.get(Integer.valueOf(i10));
        if (requestCallbacks != null) {
            requestCallbacks.onCancelled = runnable;
        }
    }

    public static native byte[] nativeTestGenerateClientHello(String str);

    public static native void native_applyDatacenterAddress(int i10, int i11, String str, int i12);

    public static native void native_applyDnsConfig(int i10, long j10, String str, int i11);

    public static native void native_bindRequestToGuid(int i10, int i11, int i12);

    public static native void native_cancelRequest(int i10, int i11, boolean z10);

    public static native void native_cancelRequestsForGuid(int i10, int i11);

    public static native long native_checkProxy(int i10, String str, int i11, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate);

    public static native void native_cleanUp(int i10, boolean z10);

    public static native void native_discardConnection(int i10, int i11, int i12);

    public static native void native_failNotRunningRequest(int i10, int i11);

    public static native int native_getConnectionState(int i10);

    public static native long native_getCurrentAuthKeyId(int i10);

    public static native int native_getCurrentDatacenterId(int i10);

    public static native int native_getCurrentPingTime(int i10);

    public static native int native_getCurrentTime(int i10);

    public static native long native_getCurrentTimeMillis(int i10);

    public static native int native_getTimeDifference(int i10);

    public static native void native_init(int i10, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i14, long j10, boolean z10, boolean z11, boolean z12, int i15, int i16);

    public static native boolean native_isGoodPrime(byte[] bArr, int i10);

    public static native int native_isTestBackend(int i10);

    public static native void native_moveDatacenter(int i10, int i11);

    public static native void native_onHostNameResolved(String str, long j10, String str2);

    public static native void native_pauseNetwork(int i10);

    public static native void native_receivedCaptchaResult(int i10, int[] iArr, String str);

    public static native void native_receivedIntegrityCheckClassic(int i10, int i11, String str, String str2);

    public static native void native_resumeNetwork(int i10, boolean z10);

    public static native void native_sendRequest(int i10, long j10, int i11, int i12, int i13, boolean z10, int i14);

    public static native void native_setIpStrategy(int i10, byte b10);

    public static native void native_setJava(boolean z10);

    public static native void native_setLangCode(int i10, String str);

    public static native void native_setNetworkAvailable(int i10, boolean z10, int i11, boolean z11);

    public static native void native_setProxySettings(int i10, String str, int i11, String str2, String str3, String str4);

    public static native void native_setPushConnectionEnabled(int i10, boolean z10);

    public static native void native_setRegId(int i10, String str);

    public static native void native_setSystemLangCode(int i10, String str);

    public static native void native_setUserId(int i10, long j10);

    public static native void native_switchBackend(int i10, boolean z10);

    public static native boolean native_test_AuthAuthorization(long j10);

    public static native void native_updateDcSettings(int i10);

    public static void onBytesReceived(int i10, int i11, int i12) {
        try {
            StatsController.getInstance(i12).incrementReceivedBytesCount(i11, 6, i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void onBytesSent(int i10, int i11, int i12) {
        try {
            AccountInstance.getInstance(i12).getStatsController().incrementSentBytesCount(i11, 6, i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void onCaptchaCheck(int i10, int i11, String str, String str2) {
        CaptchaController.request(i10, i11, str, str2);
    }

    public static void onConnectionStateChanged(int i10, int i11) {
        AndroidUtilities.runOnUIThread(new hh(i11, i10, 2));
    }

    public static void onIntegrityCheckClassic(int i10, int i11, String str, String str2) {
        AndroidUtilities.runOnUIThread(new f0(i10, i11, str, str2));
    }

    public static void onInternalPushReceived(int i10) {
        KeepAliveJob.startJob();
    }

    public static void onLogout(int i10) {
        AndroidUtilities.runOnUIThread(new k2(i10, 9));
    }

    public static void onPremiumFloodWait(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new b(i10, i11, 0, z10));
    }

    public static void onProxyError() {
        AndroidUtilities.runOnUIThread(new d());
    }

    public static void onRequestClear(int i10, int i11, boolean z10) {
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11));
        if (!z10) {
            if (requestCallbacks != null) {
                connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
            }
        } else if (requestCallbacks != null) {
            Runnable runnable = requestCallbacks.onCancelled;
            if (runnable != null) {
                runnable.run();
            }
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
        }
    }

    public static void onRequestComplete(int i10, int i11, long j10, int i12, String str, int i13, long j11, long j12, int i14) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11));
        connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
        if (requestCallbacks == null || (requestDelegateInternal = requestCallbacks.onComplete) == null) {
            return;
        }
        requestDelegateInternal.run(j10, i12, str, i13, j11, j12, i14);
    }

    public static void onRequestNewServerIpAndPort(int i10, int i11) {
        Utilities.globalQueue.postRunnable(new hh(i10, i11, 1));
    }

    public static void onRequestQuickAck(int i10, int i11) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11))) == null || (quickAckDelegate = requestCallbacks.onQuickAck) == null) {
            return;
        }
        quickAckDelegate.run();
    }

    public static void onRequestWriteToSocket(int i10, int i11) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11))) == null || (writeToSocketDelegate = requestCallbacks.onWriteToSocket) == null) {
            return;
        }
        writeToSocketDelegate.run();
    }

    public static void onSessionCreated(int i10) {
        Utilities.stageQueue.postRunnable(new k2(i10, 8));
    }

    public static void onUnparsedMessageReceived(long j10, int i10, long j11) {
        try {
            NativeByteBuffer nativeByteBufferWrap = NativeByteBuffer.wrap(j10);
            nativeByteBufferWrap.setDataSourceType(TLDataSourceType.NETWORK);
            nativeByteBufferWrap.reused = true;
            int int32 = nativeByteBufferWrap.readInt32(true);
            TLObject tLObjectTLdeserialize = TLClassStore.Instance().TLdeserialize(nativeByteBufferWrap, int32, true);
            FileLog.dumpUnparsedMessage(tLObjectTLdeserialize, j11, i10);
            int i11 = 0;
            if (!(tLObjectTLdeserialize instanceof TLRPC.Updates)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(String.format("java received unknown constructor 0x%x", Integer.valueOf(int32)));
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("java received " + tLObjectTLdeserialize);
                }
                KeepAliveJob.finishJob();
                Utilities.stageQueue.postRunnable(new g(i10, (TLRPC.Updates) tLObjectTLdeserialize, i11));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void onUpdate(int i10) {
        Utilities.stageQueue.postRunnable(new k2(i10, 7));
    }

    public static void onUpdateConfig(long j10, int i10) {
        try {
            NativeByteBuffer nativeByteBufferWrap = NativeByteBuffer.wrap(j10);
            nativeByteBufferWrap.reused = true;
            TLRPC.TL_config tL_configTLdeserialize = TLRPC.TL_config.TLdeserialize(nativeByteBufferWrap, nativeByteBufferWrap.readInt32(true), true);
            if (tL_configTLdeserialize != null) {
                Utilities.stageQueue.postRunnable(new w1(i10, tL_configTLdeserialize, 12));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i10, final int i11, final int i12, final boolean z10, final int i13) {
        long jCurrentTimeMillis;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("send request " + tLObject + " with token = " + i13);
        }
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer);
            tLObject.freeResources();
            if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else if ((i12 & 2) != 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = 0;
            }
            final long j10 = jCurrentTimeMillis;
            listen(i13, new RequestDelegateInternal() {
                @Override
                public final void run(long j11, int i14, String str, int i15, long j12, long j13, int i16) {
                    this.f22542a.lambda$sendRequestInternal$8(tLObject, i12, j10, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i10, i11, z10, i13, j11, i14, str, i15, j12, j13, i16);
                }
            }, quickAckDelegate, writeToSocketDelegate);
            native_sendRequest(this.currentAccount, nativeByteBuffer.address, i10, i11, i12, z10, i13);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i10 = 0; i10 < 4; i10++) {
            native_setLangCode(i10, lowerCase);
        }
    }

    public static void setProxySettings(boolean z10, String str, int i10, String str2, String str3, String str4) {
        String str5 = str == null ? "" : str;
        String str6 = str2 == null ? "" : str2;
        String str7 = str3 == null ? "" : str3;
        String str8 = str4 == null ? "" : str4;
        for (int i11 = 0; i11 < 4; i11++) {
            if (!z10 || TextUtils.isEmpty(str5)) {
                native_setProxySettings(i11, "", 1080, "", "", "");
            } else {
                native_setProxySettings(i11, str5, i10, str6, str7, str8);
            }
            AccountInstance accountInstance = AccountInstance.getInstance(i11);
            if (accountInstance.getUserConfig().isClientActivated()) {
                accountInstance.getMessagesController().checkPromoInfo(true);
            }
        }
    }

    public static void setRegId(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str) && i10 == 13) {
            str = s3.c.e("huawei://", str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sbR = a9.p.r("__", i10 == 2 ? "FIREBASE" : "HUAWEI", "_GENERATING_SINCE_");
            sbR.append(getInstance(0).getCurrentTime());
            sbR.append("__");
            str2 = sbR.toString();
            SharedConfig.pushStringStatus = str2;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            native_setRegId(i11, str2);
        }
    }

    public static void setSystemLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i10 = 0; i10 < 4; i10++) {
            native_setSystemLangCode(i10, lowerCase);
        }
    }

    public static boolean testNativeTlScheme(NativeByteBuffer nativeByteBuffer, INativeTlTest iNativeTlTest) {
        return iNativeTlTest.test(nativeByteBuffer.address);
    }

    public void applyDatacenterAddress(int i10, String str, int i11) {
        native_applyDatacenterAddress(this.currentAccount, i10, str, i11);
    }

    public void bindRequestToGuid(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        native_bindRequestToGuid(this.currentAccount, i10, i11);
    }

    public void cancelRequest(int i10, boolean z10) {
        cancelRequest(i10, z10, null);
    }

    public void cancelRequestsForGuid(int i10) {
        Utilities.stageQueue.postRunnable(new a(this, i10, 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, ApplicationLoader.isNetworkOnline(), ApplicationLoader.getCurrentNetworkType(), ApplicationLoader.isConnectionSlow());
    }

    public long checkProxy(String str, int i10, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return native_checkProxy(this.currentAccount, str == null ? "" : str, i10, str2 == null ? "" : str2, str3 == null ? "" : str3, str4 == null ? "" : str4, requestTimeDelegate);
    }

    public void cleanup(boolean z10) {
        native_cleanUp(this.currentAccount, z10);
    }

    public void discardConnection(int i10, int i11) {
        Utilities.stageQueue.postRunnable(new z(this, i10, i11, 4));
    }

    public void failNotRunningRequest(int i10) {
        Utilities.stageQueue.postRunnable(new a(this, i10, 0));
    }

    public int getConnectionState() {
        int i10 = this.connectionState;
        if (i10 == 3 && this.isUpdating) {
            return 5;
        }
        return i10;
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
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback() && !networkInterfaceNextElement.getInterfaceAddresses().isEmpty()) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("valid interface: " + networkInterfaceNextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = networkInterfaceNextElement.getInterfaceAddresses();
                        for (int i10 = 0; i10 < interfaceAddresses.size(); i10++) {
                            InetAddress address = interfaceAddresses.get(i10).getAddress();
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
                NetworkInterface networkInterfaceNextElement2 = networkInterfaces2.nextElement();
                if (networkInterfaceNextElement2.isUp() && !networkInterfaceNextElement2.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses2 = networkInterfaceNextElement2.getInterfaceAddresses();
                    for (int i11 = 0; i11 < interfaceAddresses2.size(); i11++) {
                        InetAddress address2 = interfaceAddresses2.get(i11).getAddress();
                        if (!address2.isLinkLocalAddress() && !address2.isLoopbackAddress() && !address2.isMulticastAddress()) {
                            if (address2 instanceof Inet6Address) {
                                z10 = true;
                            } else if (address2 instanceof Inet4Address) {
                                if (address2.getHostAddress().startsWith("192.0.0.")) {
                                    z11 = true;
                                } else {
                                    z12 = true;
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

    public void init(int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i13, long j10, boolean z10, boolean z11) {
        String installerPackageName;
        String packageName;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i14 = sharedPreferences.getInt("proxy_port", 1080);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
            native_setProxySettings(this.currentAccount, string, i14, string2, string3, string4);
        }
        try {
            Context context = ApplicationLoader.applicationContext;
            if (Build.VERSION.SDK_INT >= 30) {
                InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    installerPackageName = installSourceInfo.getInitiatingPackageName();
                    if (installerPackageName == null) {
                        try {
                            installerPackageName = installSourceInfo.getInstallingPackageName();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    installerPackageName = "";
                }
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
        } catch (Throwable unused2) {
        }
        String str10 = installerPackageName == null ? "" : installerPackageName;
        try {
            packageName = ApplicationLoader.applicationContext.getPackageName();
        } catch (Throwable unused3) {
            packageName = "";
        }
        native_init(this.currentAccount, i10, i11, i12, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, packageName == null ? "" : packageName, i13, j10, z10, z11, ApplicationLoader.isNetworkOnline(), ApplicationLoader.getCurrentNetworkType(), SharedConfig.measureDevicePerformanceClass());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        return globalNotificationsSettings.contains("pushConnection") ? globalNotificationsSettings.getBoolean("pushConnection", true) : MessagesController.getMainSettings(UserConfig.selectedAccount).getBoolean("backgroundConnection", false);
    }

    public boolean isTestBackend() {
        return native_isTestBackend(this.currentAccount) != 0;
    }

    public void resumeNetworkMaybe() {
        native_resumeNetwork(this.currentAccount, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate) {
        return sendRequest(tLObject, requestDelegate, (QuickAckDelegate) null, 0);
    }

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i10, int i11, int i12, boolean z10) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$6(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10, andIncrement);
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
                i0.a.v(this.appResumeCount, new StringBuilder("app resume count "));
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
        } else {
            if (this.appPaused) {
                return;
            }
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

    public void setDefaultDatacenterId(int i10) {
        native_moveDatacenter(this.currentAccount, i10);
    }

    public void setForceTryIpV6(boolean z10) {
        if (this.forceTryIpV6 != z10) {
            this.forceTryIpV6 = z10;
            checkConnection();
        }
    }

    public void setIsUpdating(boolean z10) {
        AndroidUtilities.runOnUIThread(new fh.f(22, this, z10));
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

    public void cancelRequest(int i10, boolean z10, Runnable runnable) {
        Utilities.stageQueue.postRunnable(new j0(i10, 1, this, runnable, z10));
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i10) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i10, Integer.MAX_VALUE, 1, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> callback2) {
        return sendRequestTyped(tLMethod, executor, callback2, Integer.MAX_VALUE, 0);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, Utilities.Callback2<TLRPC.Updates, TLRPC.TL_error> callback2, int i10, int i11) {
        return sendRequestTyped(tLMethod, null, new d0(this, executor, callback2, 4), i10, i11);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i10, int i11) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i10, Integer.MAX_VALUE, i11, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> callback2, int i10) {
        return sendRequestTyped(tLMethod, executor, callback2, Integer.MAX_VALUE, i10);
    }

    public int sendRequest(TLObject tLObject, RequestDelegateTimestamp requestDelegateTimestamp, int i10, int i11, int i12) {
        return sendRequest(tLObject, null, requestDelegateTimestamp, null, null, i10, i12, i11, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, final Executor executor, final Utilities.Callback2<T, TLRPC.TL_error> callback2, int i10, int i11) {
        return sendRequest(tLMethod, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ConnectionsManager.lambda$sendRequestTyped$3(executor, callback2, tLObject, tL_error);
            }
        }, null, null, null, i11, i10, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, int i10) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, null, i10, Integer.MAX_VALUE, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i10, int i11, int i12, boolean z10) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10);
    }

    public int sendRequest(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i10, final int i11, final int i12, final boolean z10) {
        final int andIncrement = this.lastRequestToken.getAndIncrement();
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f22552a.lambda$sendRequest$6(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10, andIncrement);
            }
        });
        return andIncrement;
    }
}
