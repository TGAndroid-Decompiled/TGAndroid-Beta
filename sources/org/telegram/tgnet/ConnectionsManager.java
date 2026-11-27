package org.telegram.tgnet;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
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
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public class ConnectionsManager extends rf0 {
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
    public static final int DownloadConnectionsCount = 8;
    public static final int FileTypeAudio = 50331648;
    public static final int FileTypeFile = 67108864;
    public static final int FileTypePhoto = 16777216;
    public static final int FileTypeVideo = 33554432;
    private static final ConnectionsManager[] Instance;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static final int RequestFlagCanCompress = 4;
    public static final int RequestFlagDoNotWaitFloodWait = 1024;
    public static final int RequestFlagDownloadByteBudget = 262144;
    public static final int RequestFlagEnableUnauthorized = 1;
    public static final int RequestFlagFailOnServerErrors = 2;
    public static final int RequestFlagFailOnServerErrorsExceptFloodWait = 65536;
    public static final int RequestFlagForceDownload = 32;
    public static final int RequestFlagInvokeAfter = 64;
    public static final int RequestFlagListenAfterCancel = 2048;
    public static final int RequestFlagNeedQuickAck = 128;
    public static final int RequestFlagSmallDownload = 131072;
    public static final int RequestFlagTryDifferentDc = 16;
    public static final int RequestFlagWithoutLogin = 8;
    public static final byte USE_IPV4_IPV6_RANDOM = 2;
    public static final byte USE_IPV4_ONLY = 0;
    public static final byte USE_IPV6_ONLY = 1;
    public static final int UploadConnectionsCountPremium = 8;
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

        public GoogleDnsLoadTask(int i) {
            this.currentAccount = i;
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
            cc4.b("3. currentTask = null, result = " + nativeByteBuffer);
            ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i, nativeByteBuffer.address, yac.h(k5.a(i).a).d(), this.responseDate);
                return;
            }
            if (f11.a) {
                cc4.b("failed to get google result");
                cc4.b("start mozilla task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(this.currentAccount);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            cc4.b("4. currentTask = mozilla");
            ConnectionsManager.currentTask = mozillaDnsLoadTask;
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            String str;
            int read;
            boolean z = false;
            try {
                if (ConnectionsManager.native_isTestBackend(this.currentAccount) != 0) {
                    str = "tapv3.stel.com";
                } else {
                    str = uc7.s1(k5.a(this.currentAccount).a).r3;
                }
                int nextInt = Utilities.b.nextInt(116) + 13;
                StringBuilder sb = new StringBuilder(nextInt);
                for (int i = 0; i < nextInt; i++) {
                    sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.b.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://dns.google.com/resolve?name=" + str + "&type=ANY&random_padding=" + ((Object) sb)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                inputStream = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                inputStream = null;
            }
            try {
                byte[] bArr = new byte[32768];
                while (!isCancelled() && (read = inputStream.read(bArr)) > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream.toByteArray())).getJSONArray("Answer");
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    if (jSONObject.getInt("type") == 16) {
                        arrayList.add(jSONObject.getString("data"));
                    }
                }
                Collections.sort(arrayList, new a((byte) 0));
                StringBuilder sb2 = new StringBuilder();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    sb2.append(((String) arrayList.get(i3)).replace("\"", ""));
                }
                byte[] decode = Base64.decode(sb2.toString(), 0);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                nativeByteBuffer.writeBytes(decode);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        cc4.g(th3, true);
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
                return nativeByteBuffer;
            } catch (Throwable th4) {
                th = th4;
                try {
                    if (!(th instanceof SocketTimeoutException) && !(th instanceof SSLException)) {
                        z = true;
                    }
                    cc4.g(th, z);
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
                        } catch (Throwable th5) {
                            cc4.g(th5, true);
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
        }

        @Override
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.d.c(new b(this, nativeByteBuffer, (byte) 0));
        }
    }

    public interface INativeTlTest {
        boolean test(long j);
    }

    public static class MozillaDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public MozillaDnsLoadTask(int i) {
            this.currentAccount = i;
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
            cc4.b("5. currentTask = null");
            ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i, nativeByteBuffer.address, yac.h(k5.a(i).a).d(), this.responseDate);
            } else if (f11.a) {
                cc4.b("failed to get mozilla txt result");
            }
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            String str;
            int read;
            try {
                if (ConnectionsManager.native_isTestBackend(this.currentAccount) != 0) {
                    str = "tapv3.stel.com";
                } else {
                    str = uc7.s1(k5.a(this.currentAccount).a).r3;
                }
                int nextInt = Utilities.b.nextInt(116) + 13;
                StringBuilder sb = new StringBuilder(nextInt);
                for (int i = 0; i < nextInt; i++) {
                    sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.b.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://mozilla.cloudflare-dns.com/dns-query?name=" + str + "&type=TXT&random_padding=" + ((Object) sb)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.addRequestProperty("accept", "application/dns-json");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                inputStream = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (!isCancelled() && (read = inputStream.read(bArr)) > 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream.toByteArray())).getJSONArray("Answer");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            if (jSONObject.getInt("type") == 16) {
                                arrayList.add(jSONObject.getString("data"));
                            }
                        }
                        Collections.sort(arrayList, new a((byte) 1));
                        StringBuilder sb2 = new StringBuilder();
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            sb2.append(((String) arrayList.get(i3)).replace("\"", ""));
                        }
                        byte[] decode = Base64.decode(sb2.toString(), 0);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                        nativeByteBuffer.writeBytes(decode);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                cc4.g(th, true);
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused) {
                        }
                        return nativeByteBuffer;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            cc4.g(th, false);
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
                                } catch (Throwable th3) {
                                    cc4.g(th3, true);
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
                } catch (Throwable th4) {
                    th = th4;
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
            Utilities.d.c(new b(this, nativeByteBuffer, (byte) 1));
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

    public static class RequestException extends RuntimeException {
        public final int code;
        public final String text;

        public RequestException(TLRPC.TL_error tL_error) {
            super((tL_error == null || (r0 = tL_error.text) == null) ? null : null);
            if (tL_error != null) {
                this.code = tL_error.code;
                this.text = tL_error.text;
                return;
            }
            this.code = 0;
            this.text = "NULL";
        }

        @Override
        public String getMessage() {
            return this.text;
        }
    }

    public static class ResolveHostByNameTask extends AsyncTask<Void, Void, ResolvedDomain> {
        private ArrayList<Long> addresses = new ArrayList<>();
        private String currentHostName;

        public ResolveHostByNameTask(String str) {
            this.currentHostName = str;
        }

        public void addAddress(long j) {
            if (this.addresses.contains(Long.valueOf(j))) {
                return;
            }
            this.addresses.add(Long.valueOf(j));
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
                            for (int i = 0; i < length; i++) {
                                arrayList.add(jSONArray.getJSONObject(i).getString("data"));
                            }
                            ResolvedDomain resolvedDomain = new ResolvedDomain(arrayList, SystemClock.elapsedRealtime());
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                cc4.g(th, false);
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
                            cc4.g(th2, false);
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            cc4.g(th, false);
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
                            } catch (Exception e) {
                                cc4.g(e, false);
                                return null;
                            }
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    cc4.g(th4, false);
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
            int i = 0;
            if (resolvedDomain != null) {
                ConnectionsManager.dnsCache.put(this.currentHostName, resolvedDomain);
                int size = this.addresses.size();
                while (i < size) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i).longValue(), resolvedDomain.getAddress());
                    i++;
                }
            } else {
                int size2 = this.addresses.size();
                while (i < size2) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i).longValue(), "");
                    i++;
                }
            }
            ConnectionsManager.resolvingHostnameTasks.remove(this.currentHostName);
        }
    }

    public static class ResolvedDomain {
        public ArrayList<String> addresses;
        long ttl;

        public ResolvedDomain(ArrayList<String> arrayList, long j) {
            this.addresses = arrayList;
            this.ttl = j;
        }

        public String getAddress() {
            ArrayList<String> arrayList = this.addresses;
            return arrayList.get(Utilities.b.nextInt(arrayList.size()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        CORE_POOL_SIZE = max;
        int i = (availableProcessors << 1) + 1;
        MAXIMUM_POOL_SIZE = i;
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
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    public ConnectionsManager(int i) {
        super(i);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SharedPreferences k;
        int i2;
        String str7;
        byte b;
        File O0;
        String str8 = "";
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File h = org.telegram.messenger.a.h();
        if (i != 0) {
            File file = new File(h, uh9.k(i, "account"));
            file.mkdirs();
            h = file;
        }
        String file2 = h.toString();
        boolean isPushConnectionEnabled = isPushConnectionEnabled();
        try {
            str4 = ob6.Q0().toLowerCase();
            str5 = ob6.I0().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = org.telegram.messenger.a.b.getPackageManager().getPackageInfo(org.telegram.messenger.a.b.getPackageName(), 0);
            boolean z = f11.a;
            str2 = (packageInfo.versionName + " (" + packageInfo.versionCode + ")").concat(" beta");
            str = "SDK " + Build.VERSION.SDK_INT;
        } catch (Exception unused) {
            str = "SDK " + Build.VERSION.SDK_INT;
            str2 = "App version unknown";
            str3 = "Android unknown";
            str4 = "en";
            str5 = "";
        }
        String str9 = str4.trim().length() != 0 ? str4 : "en";
        String str10 = str3.trim().length() != 0 ? str3 : "Android unknown";
        str2 = str2.trim().length() == 0 ? "App version unknown" : str2;
        str = str.trim().length() == 0 ? "SDK Unknown" : str;
        getUserConfig().r();
        String regId = getRegId();
        Typeface typeface = hl.a;
        try {
            byte[] encoded = ((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(org.telegram.messenger.a.b.getPackageManager().getPackageInfo(org.telegram.messenger.a.b.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded();
            Pattern pattern = Utilities.a;
            str6 = Utilities.f(Utilities.o(encoded.length, encoded));
        } catch (Throwable unused2) {
            str6 = "";
        }
        int dSTSavings = (TimeZone.getDefault().getDSTSavings() + TimeZone.getDefault().getRawOffset()) / 1000;
        if (this.currentAccount == 0) {
            k = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
        } else {
            k = bp1.k(new StringBuilder("mainconfig"), this.currentAccount, org.telegram.messenger.a.b, 0);
        }
        this.forceTryIpV6 = k.getBoolean("forceTryIpV6", false);
        boolean z2 = getUserConfig().f() != null ? getUserConfig().f().premium : false;
        int d = xea.d();
        String str11 = str5;
        String str12 = str9;
        byte b2 = f11.d;
        boolean z3 = cc4.j;
        if (f11.a) {
            try {
                O0 = hl.O0();
            } catch (Throwable th) {
                th = th;
                i2 = d;
            }
            if (O0 != null) {
                cc4 j = cc4.j();
                StringBuilder sb = new StringBuilder();
                i2 = d;
                try {
                    str7 = str10;
                    b = b2;
                    try {
                        sb.append(cc4.j().c.format(System.currentTimeMillis()));
                        sb.append("_net.txt");
                        j.f = new File(O0, sb.toString());
                        str8 = cc4.j().f.getAbsolutePath();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        init(i2, 235, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str7 = str10;
                    b = b2;
                    th.printStackTrace();
                    init(i2, 235, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
                }
                init(i2, 235, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
            }
        }
        i2 = d;
        str7 = str10;
        b = b2;
        init(i2, 235, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
    }

    public void checkWebProxyInternal(jx8 jx8Var, int i, RequestTimeDelegate requestTimeDelegate) {
        native_checkProxy(this.currentAccount, "127.0.0.1", i, "", "", jx8Var.f, requestTimeDelegate);
    }

    public static int generateClassGuid() {
        int i = lastClassGuid;
        lastClassGuid = i + 1;
        return i;
    }

    public static void getHostByName(String str, long j) {
        hl.c3(new kt(str, j, (byte) 12));
    }

    public static int getInitFlags() {
        if (c34.m(org.telegram.messenger.a.b).h()) {
            if (f11.a) {
                cc4.b("detected emu");
                return 1024;
            }
            return 1024;
        }
        return 0;
    }

    public static ConnectionsManager getInstance(int i) {
        ConnectionsManager connectionsManager;
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager2 = connectionsManagerArr[i];
        if (connectionsManager2 == null) {
            synchronized (ConnectionsManager.class) {
                connectionsManager = connectionsManagerArr[i];
                if (connectionsManager == null) {
                    connectionsManager = new ConnectionsManager(i);
                    connectionsManagerArr[i] = connectionsManager;
                }
            }
            return connectionsManager;
        }
        return connectionsManager2;
    }

    private String getRegId() {
        String str;
        String str2 = xea.f;
        if (!TextUtils.isEmpty(str2) && xea.e == 13) {
            str2 = c00.i("huawei://", str2);
        }
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(xea.g)) {
            str2 = xea.g;
        }
        if (TextUtils.isEmpty(str2)) {
            if (xea.e == 2) {
                str = "FIREBASE";
            } else {
                str = "HUAWEI";
            }
            StringBuilder p = ik8.p("__", str, "_GENERATING_SINCE_");
            p.append(getCurrentTime());
            p.append("__");
            String sb = p.toString();
            xea.g = sb;
            return sb;
        }
        return str2;
    }

    public void lambda$cancelRequest$10(Runnable runnable, int i, boolean z) {
        if (runnable != null) {
            listenCancel(i, new dt2(runnable, (byte) 0));
        }
        native_cancelRequest(this.currentAccount, i, z);
    }

    public static void lambda$cancelRequest$9(Runnable runnable) {
        Utilities.d.c(runnable);
    }

    public void lambda$cancelRequestsForGuid$11(int i) {
        native_cancelRequestsForGuid(this.currentAccount, i);
    }

    public void lambda$discardConnection$0(int i, int i2) {
        native_discardConnection(this.currentAccount, i, i2);
    }

    public void lambda$failNotRunningRequest$1(int i) {
        native_failNotRunningRequest(this.currentAccount, i);
    }

    public static void lambda$getHostByName$20(String str, long j) {
        ResolvedDomain resolvedDomain = dnsCache.get(str);
        if (resolvedDomain != null && SystemClock.elapsedRealtime() - resolvedDomain.ttl < 300000) {
            native_onHostNameResolved(str, j, resolvedDomain.getAddress());
            return;
        }
        ResolveHostByNameTask resolveHostByNameTask = resolvingHostnameTasks.get(str);
        if (resolveHostByNameTask == null) {
            resolveHostByNameTask = new ResolveHostByNameTask(str);
            try {
                resolveHostByNameTask.executeOnExecutor(DNS_THREAD_POOL_EXECUTOR, null, null, null);
                resolvingHostnameTasks.put(str, resolveHostByNameTask);
            } catch (Throwable th) {
                cc4.g(th, true);
                native_onHostNameResolved(str, j, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j);
    }

    public static void lambda$onCaptchaCheck$28(final int i, final int i2, final int i3, final String str, String str2) {
        final gb1 gb1Var = new gb1(i, i2, i3);
        Activity u0 = hl.u0();
        if (u0 == null) {
            cc4.d("CaptchaController: no activity found");
            gb1Var.a("RECAPTCHA_FAILED_NO_ACTIVITY");
            return;
        }
        Recaptcha.getTasksClient(u0.getApplication(), str2).addOnSuccessListener(new OnSuccessListener() {
            @Override
            public final void onSuccess(Object obj) {
                RecaptchaAction recaptchaAction;
                RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
                String str3 = str;
                str3.getClass();
                char c = 65535;
                switch (str3.hashCode()) {
                    case -1849137896:
                        if (str3.equals("SIGNUP")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -902467304:
                        if (str3.equals("signup")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 72611657:
                        if (str3.equals("LOGIN")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 103149417:
                        if (str3.equals("login")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        recaptchaAction = RecaptchaAction.SIGNUP;
                        break;
                    case 2:
                    case 3:
                        recaptchaAction = RecaptchaAction.LOGIN;
                        break;
                    default:
                        recaptchaAction = RecaptchaAction.custom(str3);
                        break;
                }
                Task<String> executeTask = recaptchaTasksClient.executeTask(recaptchaAction);
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                final gb1 gb1Var2 = gb1Var;
                executeTask.addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public final void onSuccess(Object obj2) {
                        String concat;
                        String str4 = (String) obj2;
                        if (f11.a) {
                            int i7 = 0;
                            if (str4 == null) {
                                concat = "null";
                            } else {
                                concat = str4.substring(0, Math.min(24, str4.length())).concat("...");
                            }
                            StringBuilder p = bs2.p("CaptchaController: got token for account=", i4, ", request=", i5, ", generation=");
                            p.append(i6);
                            p.append(", token=");
                            p.append(concat);
                            p.append(", length=");
                            if (str4 != null) {
                                i7 = str4.length();
                            }
                            c00.q(i7, p);
                        }
                        gb1 gb1Var3 = gb1Var2;
                        if (str4 == null) {
                            gb1Var3.a("RECAPTCHA_FAILED_TOKEN_NULL");
                        } else {
                            gb1Var3.a(str4);
                        }
                    }
                }).addOnFailureListener(new eb1(gb1Var2, (byte) 1));
            }
        }).addOnFailureListener(new eb1(gb1Var, (byte) 0));
    }

    public static void lambda$onConnectionStateChanged$15(int i, int i2) {
        getInstance(i).connectionState = i2;
        ma4 ma4Var = ea4.a;
        if (i2 != 3 && i2 != 5) {
            ea4.a(ea4.j.i(i, 0, 0, true));
        }
        jn7.f(k5.a(i).a).k(jn7.T1, new Object[0]);
    }

    public static void lambda$onIntegrityCheckClassic$25(int i, long j, int i2, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder m = uh9.m(i, "account", ": integrity check gave null token in ");
            m.append(System.currentTimeMillis() - j);
            m.append("ms");
            cc4.d(m.toString());
            native_receivedIntegrityCheckClassic(i, i2, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        cc4.b("account" + i + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i, i2, str, str2);
        } catch (Exception e) {
            cc4.e("receivedIntegrityCheckClassic failed", e);
        }
    }

    public static void lambda$onIntegrityCheckClassic$26(int i, long j, int i2, String str, Exception exc) {
        StringBuilder m = uh9.m(i, "account", ": integrity check failed to give a token in ");
        m.append(System.currentTimeMillis() - j);
        m.append("ms");
        cc4.e(m.toString(), exc);
        native_receivedIntegrityCheckClassic(i, i2, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + qh6.p1(exc));
    }

    public static void lambda$onIntegrityCheckClassic$27(int i, String str, String str2, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("account");
        sb.append(i);
        sb.append(": server requests integrity classic check with project = ");
        sb.append(str);
        sb.append(" nonce = ");
        uh9.s(str2, sb);
        try {
            IntegrityManagerFactory.create(org.telegram.messenger.a.b).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new ft2(i, currentTimeMillis, str2, i2)).addOnFailureListener(new ft2(i, currentTimeMillis, str2, i2));
        } catch (Exception unused) {
            cc4.b("account" + i + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i, i2, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    public static void lambda$onLogout$16(int i) {
        int i2 = k5.a(i).a;
        if (yac.h(i2).e() != 0) {
            yac.h(i2).b();
            uc7.s1(i2).J3(0);
        }
    }

    public static void lambda$onPremiumFloodWait$23(boolean z, int i, int i2) {
        boolean z2;
        hb4 hb4Var = null;
        nd4 nd4Var = null;
        if (z) {
            Iterator it = xb4.G(i).h.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nd4 nd4Var2 = (nd4) it.next();
                if (nd4Var2 != null && nd4Var2.q.contains(Integer.valueOf(i2))) {
                    nd4Var = nd4Var2;
                    break;
                }
            }
            if (nd4Var != null) {
                z2 = !nd4Var.T;
                nd4Var.T = true;
            }
            z2 = false;
        } else {
            Iterator it2 = xb4.G(i).w.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                hb4 hb4Var2 = (hb4) it2.next();
                if (hb4Var2 != null && hb4Var2.F0.contains(Integer.valueOf(i2))) {
                    hb4Var = hb4Var2;
                    break;
                }
            }
            if (hb4Var != null) {
                z2 = !hb4Var.l;
                hb4Var.l = true;
            }
            z2 = false;
        }
        if (z2) {
            jn7.f(i).k(jn7.v3, new Object[0]);
        }
    }

    public static void lambda$onPremiumFloodWait$24(int i, boolean z, int i2) {
        if (yac.t0 != i) {
            return;
        }
        hl.c3(new bt2(z, i, i2));
    }

    public static void lambda$onProxyError$19() {
        jn7.e().k(jn7.M0, 3);
    }

    public static void lambda$onRequestNewServerIpAndPort$17(int i, boolean z, int i2) {
        cc4.b("13. currentTask == " + currentTask);
        if (currentTask == null && ((i != 0 || Math.abs(lastDnsRequestTime - System.currentTimeMillis()) >= 10000) && z)) {
            lastDnsRequestTime = System.currentTimeMillis();
            if (i == 2) {
                if (f11.a) {
                    cc4.b("start mozilla txt task");
                }
                MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i2);
                mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                cc4.b("9. currentTask = mozilla");
                currentTask = mozillaDnsLoadTask;
                return;
            }
            if (f11.a) {
                cc4.b("start google txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i2);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            cc4.b("11. currentTask = dnstxt");
            currentTask = googleDnsLoadTask;
        } else if (f11.a) {
            cc4.b("don't start task, current task = " + currentTask + " next task = " + i + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + org.telegram.messenger.a.r());
        }
    }

    public static void lambda$onRequestNewServerIpAndPort$18(int i, int i2) {
        Utilities.d.c(new bt2(i, org.telegram.messenger.a.r(), i2, (byte) 2));
    }

    public static void lambda$onSessionCreated$14(int i) {
        uc7.s1(k5.a(i).a).X0();
    }

    public static void lambda$onUnparsedMessageReceived$12(int i, TLRPC.Updates updates) {
        uc7.s1(k5.a(i).a).Y3(updates, false);
    }

    public static void lambda$onUpdate$13(int i) {
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        long j3;
        zh6 zh6Var;
        boolean z;
        long j4;
        uc7 s1 = uc7.s1(k5.a(i).a);
        long currentTimeMillis = System.currentTimeMillis();
        int i6 = 0;
        s1.G(false);
        ArrayList arrayList = s1.K1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = s1.I1;
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            i2 = 1;
            if (i7 >= size) {
                break;
            }
            nc7 nc7Var = (nc7) arrayList2.get(i7);
            if (nc7Var.f <= elapsedRealtime) {
                s1.P(nc7Var);
                arrayList2.remove(i7);
                s1.J1.l(nc7Var.a);
                i7--;
                size--;
            }
            i7++;
        }
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            nc7 nc7Var2 = (nc7) arrayList.get(i8);
            if (nc7Var2.f <= elapsedRealtime) {
                s1.P(nc7Var2);
                arrayList.remove(i8);
                s1.L1.remove(nc7Var2.a + "_" + nc7Var2.b);
                i8 += -1;
                size2 += -1;
            }
            i8++;
        }
        long j5 = 1000;
        long j6 = 0;
        if (s1.getUserConfig().o()) {
            if (!s1.a4 && s1.getConnectionsManager().getPauseTime() == 0 && org.telegram.messenger.a.w && !org.telegram.messenger.a.F) {
                if (org.telegram.messenger.a.H != 0 && Math.abs(org.telegram.messenger.a.H - System.currentTimeMillis()) > 1000 && s1.E2 != 1 && (s1.C2 == 0 || Math.abs(System.currentTimeMillis() - s1.C2) >= 55000 || s1.F2)) {
                    s1.E2 = (byte) 1;
                    if (s1.D2 != 0) {
                        s1.getConnectionsManager().cancelRequest(s1.D2, true);
                    }
                    TL_account.updateStatus updatestatus = new TL_account.updateStatus();
                    updatestatus.offline = false;
                    s1.D2 = s1.getConnectionsManager().sendRequest(updatestatus, new h77(s1, (byte) 8));
                }
            } else if (s1.E2 != 2 && !s1.F2 && Math.abs(System.currentTimeMillis() - s1.getConnectionsManager().getPauseTime()) >= 2000) {
                s1.E2 = (byte) 2;
                if (s1.D2 != 0) {
                    s1.getConnectionsManager().cancelRequest(s1.D2, true);
                }
                TL_account.updateStatus updatestatus2 = new TL_account.updateStatus();
                updatestatus2.offline = true;
                s1.D2 = s1.getConnectionsManager().sendRequest(updatestatus2, new h77(s1, (byte) 9));
            }
            long j7 = 1500;
            if (s1.N0.m() != 0) {
                int i9 = 0;
                while (i9 < s1.N0.m()) {
                    long j8 = s1.N0.j(i9);
                    if (Math.abs(currentTimeMillis - s1.O0.valueAt(i9)) >= j7) {
                        if (f11.a) {
                            j4 = j7;
                            cc4.b("QUEUE CHANNEL " + j8 + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        } else {
                            j4 = j7;
                        }
                        s1.P3(0, j8);
                    } else {
                        j4 = j7;
                    }
                    i9++;
                    j7 = j4;
                }
            }
            long j9 = j7;
            for (int i10 = 0; i10 < 3; i10++) {
                if (s1.W1(i10) != 0 && Math.abs(currentTimeMillis - s1.W1(i10)) >= j9) {
                    if (f11.a) {
                        cc4.b(i10 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    s1.Z3(i10, 0);
                }
            }
        }
        int currentTime = s1.getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - s1.D0) >= 5000) {
            s1.D0 = System.currentTimeMillis();
            if (s1.A0.m() != 0) {
                int i11 = 0;
                while (true) {
                    int m = s1.A0.m();
                    zh6Var = s1.A0;
                    if (i11 >= m) {
                        break;
                    }
                    long j10 = zh6Var.j(i11);
                    TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = new TLRPC.TL_messages_getMessagesViews();
                    tL_messages_getMessagesViews.peer = s1.j1(j10);
                    tL_messages_getMessagesViews.id = (ArrayList) s1.A0.n(i11);
                    if (i11 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tL_messages_getMessagesViews.increment = z;
                    s1.getConnectionsManager().sendRequest(tL_messages_getMessagesViews, new p87(s1, j10, tL_messages_getMessagesViews, (byte) 6));
                    i11++;
                    j5 = j5;
                }
                j = j5;
                zh6Var.b();
            } else {
                j = 1000;
            }
            if (s1.C0 > 0) {
                hl.c3(new y77(s1, currentTime, (byte) 2));
            }
        } else {
            j = 1000;
        }
        if (!s1.a0.isEmpty()) {
            ArrayList arrayList3 = null;
            for (Map.Entry entry : s1.a0.entrySet()) {
                if (((Integer) entry.getValue()).intValue() < currentTime - 30) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add((Long) entry.getKey());
                }
            }
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    s1.a0.remove((Long) obj);
                }
                hl.c3(new l87(s1, (byte) 27));
            }
        }
        if (s1.q0.size() != 0) {
            int i13 = 0;
            while (i13 < s1.q0.size()) {
                long keyAt = s1.q0.keyAt(i13);
                if (s1.q0.valueAt(i13) < System.currentTimeMillis() / j) {
                    s1.q0.delete(keyAt);
                    i13--;
                    if (s1.r0.h(keyAt) >= 0) {
                        s1.I0(keyAt);
                    }
                }
                i13++;
            }
        }
        if (s1.s0.size() != 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() / j;
            int i14 = 0;
            while (i14 < s1.s0.size()) {
                long keyAt2 = s1.s0.keyAt(i14);
                if (s1.s0.valueAt(i14) < elapsedRealtime2) {
                    int h = s1.r0.h(keyAt2);
                    LongSparseIntArray longSparseIntArray = s1.s0;
                    if (h >= 0) {
                        j3 = j6;
                        longSparseIntArray.put(keyAt2, (int) (elapsedRealtime2 + 300));
                    } else {
                        j3 = j6;
                        longSparseIntArray.delete(keyAt2);
                        i14--;
                    }
                    TLRPC.TL_messages_getOnlines tL_messages_getOnlines = new TLRPC.TL_messages_getOnlines();
                    tL_messages_getOnlines.peer = s1.j1(-keyAt2);
                    s1.getConnectionsManager().sendRequest(tL_messages_getOnlines, new e77(s1, keyAt2, (byte) 12));
                } else {
                    j3 = j6;
                }
                i14++;
                j6 = j3;
            }
        }
        long j11 = j6;
        if (s1.W.isEmpty() && s1.c0 == s1.W.size()) {
            j2 = currentTimeMillis;
            i3 = 1;
        } else {
            ArrayList arrayList4 = new ArrayList(s1.W.keySet());
            int i15 = 0;
            int i16 = 0;
            while (i15 < arrayList4.size()) {
                Long l = (Long) arrayList4.get(i15);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s1.W.get(l);
                if (concurrentHashMap != null) {
                    ArrayList arrayList5 = new ArrayList(concurrentHashMap.keySet());
                    int i17 = i6;
                    while (i17 < arrayList5.size()) {
                        Integer num = (Integer) arrayList5.get(i17);
                        ArrayList arrayList6 = (ArrayList) concurrentHashMap.get(num);
                        if (arrayList6 != null) {
                            int i18 = i6;
                            while (i18 < arrayList6.size()) {
                                mc7 mc7Var = (mc7) arrayList6.get(i18);
                                if (mc7Var.c instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                    i5 = 30000;
                                } else {
                                    i5 = 5900;
                                }
                                int i19 = i2;
                                int i20 = i17;
                                long j12 = currentTimeMillis;
                                if (mc7Var.a + i5 < j12) {
                                    arrayList6.remove(mc7Var);
                                    i18--;
                                    i16 = i19;
                                }
                                i18++;
                                i2 = i19;
                                i17 = i20;
                                currentTimeMillis = j12;
                            }
                        }
                        long j13 = currentTimeMillis;
                        int i21 = i2;
                        int i22 = i17;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            i4 = i22;
                        } else {
                            concurrentHashMap.remove(num);
                            arrayList5.remove(i22);
                            i4 = i22 - 1;
                        }
                        i17 = i4 + 1;
                        i2 = i21;
                        currentTimeMillis = j13;
                        i6 = 0;
                    }
                }
                long j14 = currentTimeMillis;
                int i23 = i2;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    s1.W.remove(l);
                    arrayList4.remove(i15);
                    i15--;
                }
                i15++;
                i2 = i23;
                currentTimeMillis = j14;
                i6 = 0;
            }
            j2 = currentTimeMillis;
            i3 = i2;
            s1.B5();
            if (i16 != 0) {
                hl.c3(new l87(s1, (byte) 28));
            }
        }
        if (aob.o == i3 && Math.abs(j2 - uc7.q5) >= 60) {
            hl.c3(s1.A2);
            uc7.q5 = j2;
        }
        if (s1.getUserConfig().k0 != null && Math.abs(j2 - uc7.r5) >= 60) {
            hl.c3(s1.B2);
            uc7.r5 = j2;
        }
        if (s1.d2 != j11 && Math.abs(SystemClock.elapsedRealtime() - s1.d2) >= 10800000) {
            PushListenerController.sendRegistrationToServer(xea.e, xea.f);
        }
        s1.getLocationController().t();
        s1.L(false);
        if (s1.y2 <= s1.getConnectionsManager().getCurrentTime() && !s1.x2 && s1.getUserConfig().o()) {
            s1.x2 = true;
            s1.getConnectionsManager().sendRequest(new TLRPC.TL_help_getTermsOfServiceUpdate(), new h77(s1, (byte) 0));
        }
    }

    public static void lambda$onUpdateConfig$21(int i, TLRPC.TL_config tL_config) {
        hl.c3(new ve2(uc7.s1(k5.a(i).a), tL_config, (byte) 8));
    }

    public void lambda$sendRequestInternal$7(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j);
        } else if (tLObject instanceof TLRPC.Updates) {
            CountDownLatch countDownLatch = KeepAliveJob.a;
            Utilities.e.c(new jm3((byte) 18));
            uc7.s1(k5.a(this.currentAccount).a).Y3((TLRPC.Updates) tLObject, false);
        }
        if (tLObject != null) {
            tLObject.freeResources();
        }
    }

    public void lambda$sendRequestInternal$8(TLObject tLObject, int i, long j, RequestDelegate requestDelegate, RequestDelegateTimestamp requestDelegateTimestamp, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i2, int i3, boolean z, int i4, long j2, int i5, String str, int i6, long j3, long j4, int i7) {
        int i8;
        TLObject tLObject2;
        ConnectionsManager connectionsManager;
        String str2;
        TLRPC.TL_error tL_error = null;
        try {
            if (j2 != 0) {
                NativeByteBuffer wrap = NativeByteBuffer.wrap(j2);
                wrap.setDataSourceType(TLDataSourceType.NETWORK);
                wrap.reused = true;
                i8 = wrap.limit();
                try {
                    tLObject2 = tLObject.deserializeResponse(wrap, wrap.readInt32(true), true);
                } catch (Exception e) {
                    boolean z2 = f11.a;
                    cc4.i(e, true);
                    return;
                }
            } else if (str != null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.code = i5;
                tL_error2.text = str;
                if (f11.a && i5 != -2000) {
                    cc4.d(tLObject + " got error " + tL_error2.code + " " + tL_error2.text);
                }
                i8 = 0;
                tLObject2 = null;
                tL_error = tL_error2;
            } else {
                i8 = 0;
                tLObject2 = null;
            }
            if ((i & 2) == 0 || !kfc.l0.isEmpty()) {
                connectionsManager = this;
            } else {
                connectionsManager = this;
                la3.d(org.telegram.messenger.a.b).f(i8, Math.max(0L, (System.currentTimeMillis() - j) - native_getCurrentPingTime(connectionsManager.currentAccount)));
            }
            boolean z3 = f11.a;
            if (tLObject2 != null) {
                tLObject2.networkType = i6;
            }
            if (f11.a) {
                StringBuilder sb = new StringBuilder("java received ");
                sb.append(tLObject2);
                if (tL_error != null) {
                    str2 = " error = " + tL_error;
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(" messageId = 0x");
                sb.append(Long.toHexString(j4));
                cc4.b(sb.toString());
            }
            Utilities.d.c(new nm1(connectionsManager, requestDelegate, tLObject2, tL_error, requestDelegateTimestamp, j3, (byte) 1));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public static void lambda$sendRequestTyped$3(Executor executor, icc iccVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new gt2(iccVar, tLObject, tL_error, (byte) 0));
        } else {
            iccVar.a(tLObject, tL_error);
        }
    }

    public void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, icc iccVar, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().Y3(updates, false);
        }
        if (executor != null) {
            executor.execute(new on1(iccVar, updates, tL_error, (byte) 28));
        } else {
            iccVar.a(updates, tL_error);
        }
    }

    public void lambda$setIsUpdating$22(boolean z) {
        if (this.isUpdating != z) {
            this.isUpdating = z;
            if (this.connectionState == 3) {
                jn7.f(k5.a(this.currentAccount).a).k(jn7.T1, new Object[0]);
            }
        }
    }

    private void listen(int i, RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
        this.requestCallbacks.put(Integer.valueOf(i), new RequestCallbacks(requestDelegateInternal, quickAckDelegate, writeToSocketDelegate));
    }

    private void listenCancel(int i, Runnable runnable) {
        RequestCallbacks requestCallbacks = this.requestCallbacks.get(Integer.valueOf(i));
        if (requestCallbacks != null) {
            requestCallbacks.onCancelled = runnable;
        }
    }

    public static native byte[] nativeTestGenerateClientHello(String str);

    public static native void native_applyDatacenterAddress(int i, int i2, String str, int i3);

    public static native void native_applyDnsConfig(int i, long j, String str, int i2);

    public static native void native_bindRequestToGuid(int i, int i2, int i3);

    public static native void native_cancelRequest(int i, int i2, boolean z);

    public static native void native_cancelRequestsForGuid(int i, int i2);

    public static native long native_checkProxy(int i, String str, int i2, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate);

    public static native void native_cleanUp(int i, boolean z);

    public static native void native_discardConnection(int i, int i2, int i3);

    public static native void native_failNotRunningRequest(int i, int i2);

    public static native int native_getConnectionState(int i);

    public static native long native_getCurrentAuthKeyId(int i);

    public static native int native_getCurrentDatacenterId(int i);

    public static native int native_getCurrentPingTime(int i);

    public static native int native_getCurrentTime(int i);

    public static native long native_getCurrentTimeMillis(int i);

    public static native int native_getTimeDifference(int i);

    public static native void native_init(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i5, long j, boolean z, boolean z2, boolean z3, int i6, int i7);

    public static native boolean native_isGoodPrime(byte[] bArr, int i);

    public static native int native_isTestBackend(int i);

    public static native void native_moveDatacenter(int i, int i2);

    public static native void native_onHostNameResolved(String str, long j, String str2);

    public static native void native_pauseNetwork(int i);

    public static native void native_receivedCaptchaResult(int i, int i2, int i3, String str);

    public static native void native_receivedIntegrityCheckClassic(int i, int i2, String str, String str2);

    public static native void native_resumeNetwork(int i, boolean z);

    public static native void native_sendRequest(int i, long j, int i2, int i3, int i4, boolean z, int i5, int i6);

    public static native void native_setIpStrategy(int i, byte b);

    public static native void native_setJava(boolean z);

    public static native void native_setLangCode(int i, String str);

    public static native void native_setNetworkAvailable(int i, boolean z, int i2, boolean z2);

    public static native void native_setProxySettings(int i, String str, int i2, String str2, String str3, String str4);

    public static native void native_setPushConnectionEnabled(int i, boolean z);

    public static native void native_setRegId(int i, String str);

    public static native void native_setSystemLangCode(int i, String str);

    public static native void native_setUserId(int i, long j);

    public static native void native_switchBackend(int i, boolean z);

    public static native boolean native_test_AuthAuthorization(long j);

    public static native void native_updateDcSettings(int i);

    public static void onBytesReceived(int i, int i2, int i3) {
        try {
            a2b.c(i3).f(i2, 6, i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static void onBytesSent(int i, int i2, int i3) {
        try {
            a2b.c(k5.a(i3).a).h(i2, 6, i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static void onCaptchaCheck(int i, int i2, int i3, String str, String str2) {
        hl.c3(new it2(i, i2, i3, str, str2, (byte) 0));
    }

    public static void onConnectionStateChanged(int i, int i2) {
        hl.c3(new zs2(i2, i, (byte) 0));
    }

    public static void onIntegrityCheckClassic(int i, int i2, String str, String str2) {
        hl.c3(new aq1(i, i2, str, str2));
    }

    public static void onInternalPushReceived(int i) {
        CountDownLatch countDownLatch = KeepAliveJob.a;
        Utilities.e.c(new jm3((byte) 19));
    }

    public static void onLogout(int i) {
        hl.c3(new gw0(i, (byte) 3));
    }

    public static void onPremiumFloodWait(int i, int i2, boolean z) {
        hl.c3(new bt2(i, z, i2, (byte) 0));
    }

    public static void onProxyError() {
        hl.c3(new kc((byte) 25));
    }

    public static void onRequestClear(int i, int i2, boolean z) {
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2));
            if (z) {
                if (requestCallbacks != null) {
                    Runnable runnable = requestCallbacks.onCancelled;
                    if (runnable != null) {
                        runnable.run();
                    }
                    connectionsManager.requestCallbacks.remove(Integer.valueOf(i2));
                }
            } else if (requestCallbacks != null) {
                connectionsManager.requestCallbacks.remove(Integer.valueOf(i2));
            }
        }
    }

    public static void onRequestComplete(int i, int i2, long j, int i3, String str, int i4, long j2, long j3, int i5) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2));
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i2));
            if (requestCallbacks != null && (requestDelegateInternal = requestCallbacks.onComplete) != null) {
                requestDelegateInternal.run(j, i3, str, i4, j2, j3, i5);
            }
        }
    }

    public static void onRequestNewServerIpAndPort(int i, int i2) {
        Utilities.e.c(new zs2(i, i2, (byte) 1));
    }

    public static void onRequestQuickAck(int i, int i2) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2))) != null && (quickAckDelegate = requestCallbacks.onQuickAck) != null) {
            quickAckDelegate.mo24run();
        }
    }

    public static void onRequestWriteToSocket(int i, int i2) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2))) != null && (writeToSocketDelegate = requestCallbacks.onWriteToSocket) != null) {
            writeToSocketDelegate.run();
        }
    }

    public static void onSessionCreated(int i) {
        Utilities.d.c(new gw0(i, (byte) 2));
    }

    public static void onUnparsedMessageReceived(long j, int i, long j2) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j);
            wrap.setDataSourceType(TLDataSourceType.NETWORK);
            wrap.reused = true;
            int readInt32 = wrap.readInt32(true);
            TLRPC.Updates TLdeserialize = TLRPC.Updates.TLdeserialize(wrap, readInt32, true);
            boolean z = cc4.j;
            boolean z2 = f11.a;
            if (TLdeserialize != null) {
                if (f11.a) {
                    cc4.b("java received " + TLdeserialize);
                }
                CountDownLatch countDownLatch = KeepAliveJob.a;
                Utilities.e.c(new jm3((byte) 18));
                Utilities.d.c(new ne(i, TLdeserialize, (byte) 1));
            } else if (f11.a) {
                cc4.b(String.format("java received unknown constructor 0x%x", Integer.valueOf(readInt32)));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static void onUpdate(int i) {
        Utilities.d.c(new gw0(i, (byte) 1));
    }

    public static void onUpdateConfig(long j, int i) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j);
            wrap.reused = true;
            TLRPC.TL_config TLdeserialize = TLRPC.TL_config.TLdeserialize(wrap, wrap.readInt32(true), true);
            if (TLdeserialize != null) {
                Utilities.d.c(new zd(i, TLdeserialize, (byte) 28));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i, final int i2, final int i3, final boolean z, final int i4) {
        long j;
        int i5;
        if (f11.a) {
            cc4.b("send request " + tLObject + " with token = " + i4);
        }
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer);
            tLObject.freeResources();
            if ((i3 & 2) != 0) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            final long j2 = j;
            listen(i4, new RequestDelegateInternal() {
                @Override
                public final void run(long j3, int i6, String str, int i7, long j4, long j5, int i8) {
                    ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i3, j2, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i, i2, z, i4, j3, i6, str, i7, j4, j5, i8);
                }
            }, quickAckDelegate, writeToSocketDelegate);
            if ((i & 262144) != 0 && (i3 & 65535) == 2) {
                if (tLObject instanceof TLRPC.TL_upload_getFile) {
                    i5 = ((TLRPC.TL_upload_getFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getWebFile) {
                    i5 = ((TLRPC.TL_upload_getWebFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getCdnFile) {
                    i5 = ((TLRPC.TL_upload_getCdnFile) tLObject).limit;
                }
                native_sendRequest(this.currentAccount, nativeByteBuffer.address, i, i2, i3, z, i4, i5);
            }
            i5 = 0;
            native_sendRequest(this.currentAccount, nativeByteBuffer.address, i, i2, i3, z, i4, i5);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i = 0; i < 4; i++) {
            native_setLangCode(i, lowerCase);
        }
    }

    public static void setProxySettings(boolean z, jx8 jx8Var) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        if (z && jx8Var != null && jx8Var.g()) {
            str = jx8Var.b;
            i = jx8Var.c;
            str2 = jx8Var.d;
            str3 = jx8Var.e;
            str4 = jx8Var.f;
            if (jx8Var.a == 3) {
                int o = pyc.o(str, str4);
                if (o == 0) {
                    o = 9;
                }
                i = o;
                str = "127.0.0.1";
                str2 = "";
                str3 = str2;
            } else {
                synchronized (pyc.y) {
                    pyc pycVar = pyc.z;
                    if (pycVar != null) {
                        pycVar.q();
                        pyc.z = null;
                    }
                }
            }
        } else {
            pyc.p();
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            i = 0;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (z && jx8Var != null && jx8Var.g()) {
                native_setProxySettings(i2, str, i, str2, str3, str4);
            } else {
                native_setProxySettings(i2, "", 1080, "", "", "");
            }
            int i3 = k5.a(i2).a;
            if (yac.h(i3).o()) {
                Utilities.d.c(new pa7(uc7.s1(i3), (byte) 9));
            }
        }
    }

    public static void setRegId(String str, int i, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && i == 13) {
            str = c00.i("huawei://", str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            if (i == 2) {
                str3 = "FIREBASE";
            } else {
                str3 = "HUAWEI";
            }
            StringBuilder p = ik8.p("__", str3, "_GENERATING_SINCE_");
            p.append(getInstance(0).getCurrentTime());
            p.append("__");
            str2 = p.toString();
            xea.g = str2;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            native_setRegId(i2, str2);
        }
    }

    public static void setSystemLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i = 0; i < 4; i++) {
            native_setSystemLangCode(i, lowerCase);
        }
    }

    public static boolean testNativeTlScheme(NativeByteBuffer nativeByteBuffer, INativeTlTest iNativeTlTest) {
        return iNativeTlTest.test(nativeByteBuffer.address);
    }

    public void applyDatacenterAddress(int i, String str, int i2) {
        native_applyDatacenterAddress(this.currentAccount, i, str, i2);
    }

    public void bindRequestToGuid(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        native_bindRequestToGuid(this.currentAccount, i, i2);
    }

    public void cancelRequest(int i, boolean z, Runnable runnable) {
        Utilities.d.c(new ps1(this, runnable, i, z, (byte) 1));
    }

    public void cancelRequestsForGuid(int i) {
        Utilities.d.c(new at2(this, i, (byte) 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (f11.a) {
            cc4.b("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, org.telegram.messenger.a.r(), org.telegram.messenger.a.f(), org.telegram.messenger.a.p());
    }

    public long checkProxy(jx8 jx8Var, RequestTimeDelegate requestTimeDelegate) {
        if (jx8Var != null && jx8Var.g()) {
            if (jx8Var.a == 3) {
                lyc lycVar = lyc.f;
                if (lycVar == null) {
                    synchronized (lyc.class) {
                        lycVar = lyc.f;
                        if (lycVar == null) {
                            lycVar = new lyc((byte) 0);
                            lyc.f = lycVar;
                        }
                    }
                }
                ht2 ht2Var = new ht2(this, (byte) 0);
                if (jx8Var.a == 3 && jx8Var.g() && requestTimeDelegate != null) {
                    hl.c3(new ipc(lycVar, ht2Var, jx8Var, requestTimeDelegate, (byte) 7));
                    return 0L;
                } else if (requestTimeDelegate != null) {
                    requestTimeDelegate.run(-1L);
                    return 0L;
                }
            } else {
                return native_checkProxy(this.currentAccount, jx8Var.b, jx8Var.c, jx8Var.d, jx8Var.e, jx8Var.f, requestTimeDelegate);
            }
        }
        return 0L;
    }

    public void cleanup(boolean z) {
        native_cleanUp(this.currentAccount, z);
    }

    public void discardConnection(int i, int i2) {
        Utilities.d.c(new bt(this, i, i2, (byte) 5));
    }

    public void failNotRunningRequest(int i) {
        Utilities.d.c(new at2(this, i, (byte) 0));
    }

    public int getConnectionState() {
        int i = this.connectionState;
        if (i == 3 && this.isUpdating) {
            return 5;
        }
        return i;
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
        if (f11.a) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback() && !nextElement.getInterfaceAddresses().isEmpty()) {
                        if (f11.a) {
                            cc4.b("valid interface: " + nextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                        for (int i = 0; i < interfaceAddresses.size(); i++) {
                            InetAddress address = interfaceAddresses.get(i).getAddress();
                            if (f11.a) {
                                cc4.b("address: " + address.getHostAddress());
                            }
                            if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress() && f11.a) {
                                cc4.b("address is good");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (networkInterfaces2.hasMoreElements()) {
                NetworkInterface nextElement2 = networkInterfaces2.nextElement();
                if (nextElement2.isUp() && !nextElement2.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses2 = nextElement2.getInterfaceAddresses();
                    for (int i2 = 0; i2 < interfaceAddresses2.size(); i2++) {
                        InetAddress address2 = interfaceAddresses2.get(i2).getAddress();
                        if (!address2.isLinkLocalAddress() && !address2.isLoopbackAddress() && !address2.isMulticastAddress()) {
                            if (address2 instanceof Inet6Address) {
                                z = true;
                            } else if (address2 instanceof Inet4Address) {
                                if (!address2.getHostAddress().startsWith("192.0.0.")) {
                                    z3 = true;
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                if (!this.forceTryIpV6) {
                    if (z2) {
                        return (byte) 2;
                    }
                    if (!z3) {
                    }
                }
                return (byte) 1;
            }
        } catch (Throwable th2) {
            cc4.g(th2, true);
        }
        return (byte) 0;
    }

    public long getPauseTime() {
        return this.lastPauseTime;
    }

    public int getTimeDifference() {
        return native_getTimeDifference(this.currentAccount);
    }

    public void init(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i4, long j, boolean z, boolean z2) {
        String str10;
        String str11;
        Context context;
        SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
        jx8 c = jx8.c(sharedPreferences);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && c.g()) {
            if (c.a == 3) {
                int o = pyc.o(c.b, c.f);
                int i5 = this.currentAccount;
                if (o == 0) {
                    o = 9;
                }
                native_setProxySettings(i5, "127.0.0.1", o, "", "", c.f);
            } else {
                native_setProxySettings(this.currentAccount, c.b, c.c, c.d, c.e, c.f);
            }
        }
        try {
            context = org.telegram.messenger.a.b;
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
            str11 = org.telegram.messenger.a.b.getPackageName();
        } catch (Throwable unused3) {
            str11 = "";
        }
        native_init(this.currentAccount, i, i2, i3, str, str2, str3, str4, str5, str6, str7, str8, str9, str12, str11 == null ? "" : str11, i4, j, z, z2, org.telegram.messenger.a.r(), org.telegram.messenger.a.f(), xea.u());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences f1 = uc7.f1();
        if (f1.contains("pushConnection")) {
            return f1.getBoolean("pushConnection", true);
        }
        return uc7.s1(yac.t0).Y3.getBoolean("backgroundConnection", false);
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

    public int sendRequest(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i, final int i2, final int i3, final boolean z) {
        final int andIncrement = this.lastRequestToken.getAndIncrement();
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.this.lambda$sendRequest$6(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i, i2, i3, z, andIncrement);
            }
        });
        return andIncrement;
    }

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i, int i2, int i3, boolean z) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$6(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i, i2, i3, z, andIncrement);
        return andIncrement;
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, icc iccVar, int i, int i2) {
        return sendRequest(tLMethod, new ql(executor, iccVar, (byte) 25), null, null, null, i2, i, 1, true);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, icc iccVar) {
        return sendRequestTypedAndProcessUpdates(tLMethod, executor, iccVar, Integer.MAX_VALUE, 0);
    }

    public void setAppPaused(boolean z, boolean z2) {
        if (!z2) {
            this.appPaused = z;
            if (f11.a) {
                cc4.b("app paused = " + z);
            }
            int i = this.appResumeCount;
            if (z) {
                this.appResumeCount = i - 1;
            } else {
                this.appResumeCount = i + 1;
            }
            if (f11.a) {
                c00.q(this.appResumeCount, new StringBuilder("app resume count "));
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
            if (f11.a) {
                cc4.b("reset app pause time");
            }
            if (this.lastPauseTime != 0 && System.currentTimeMillis() - this.lastPauseTime > 5000) {
                lv2 contactsController = getContactsController();
                contactsController.getClass();
                Utilities.e.c(new pu2(contactsController, (byte) 3));
            }
            this.lastPauseTime = 0L;
            native_resumeNetwork(this.currentAccount, false);
        }
    }

    public void setDefaultDatacenterId(int i) {
        native_moveDatacenter(this.currentAccount, i);
    }

    public void setForceTryIpV6(boolean z) {
        if (this.forceTryIpV6 != z) {
            this.forceTryIpV6 = z;
            checkConnection();
        }
    }

    public void setIsUpdating(boolean z) {
        hl.c3(new xac((byte) 14, this, z));
    }

    public void setPushConnectionEnabled(boolean z) {
        native_setPushConnectionEnabled(this.currentAccount, z);
    }

    public void setUserId(long j) {
        native_setUserId(this.currentAccount, j);
    }

    public void switchBackend(boolean z) {
        uc7.e1().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, icc iccVar, int i, int i2) {
        return sendRequestTyped(tLMethod, null, new p(this, executor, iccVar, (byte) 7), i, i2);
    }

    public void cancelRequest(int i, boolean z) {
        cancelRequest(i, z, null);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, icc iccVar) {
        return sendRequestTyped(tLMethod, executor, iccVar, Integer.MAX_VALUE, 0);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, icc iccVar, int i) {
        return sendRequestTyped(tLMethod, executor, iccVar, Integer.MAX_VALUE, i);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, icc iccVar) {
        return sendRequestTyped(tLMethod, null, iccVar);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i, Integer.MAX_VALUE, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i, int i2) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i, Integer.MAX_VALUE, i2, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegateTimestamp requestDelegateTimestamp, int i, int i2, int i3) {
        return sendRequest(tLObject, null, requestDelegateTimestamp, null, null, i, i3, i2, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, int i) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, null, i, Integer.MAX_VALUE, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i, int i2, int i3, boolean z) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i, i2, i3, z);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate) {
        return sendRequest(tLObject, requestDelegate, (QuickAckDelegate) null, 0);
    }
}
