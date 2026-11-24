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
public class ConnectionsManager extends pf0 {
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
            fa4.b("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i, nativeByteBuffer.address, y6c.h(j5.a(i).a).d(), this.responseDate);
                return;
            }
            if (w01.a) {
                fa4.b("failed to get google result");
                fa4.b("start mozilla task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(this.currentAccount);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            fa4.b("4. currentTask = mozilla");
            AsyncTask unused2 = ConnectionsManager.currentTask = mozillaDnsLoadTask;
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
                    str = na7.q1(j5.a(this.currentAccount).a).q3;
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
                        fa4.g(th3, true);
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
                    fa4.g(th, z);
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
                            fa4.g(th5, true);
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
            fa4.b("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i, nativeByteBuffer.address, y6c.h(j5.a(i).a).d(), this.responseDate);
            } else if (w01.a) {
                fa4.b("failed to get mozilla txt result");
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
                    str = na7.q1(j5.a(this.currentAccount).a).q3;
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
                                fa4.g(th, true);
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
                            fa4.g(th, false);
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
                                    fa4.g(th3, true);
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
                                fa4.g(th, false);
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
                            fa4.g(th2, false);
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            fa4.g(th, false);
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
                                fa4.g(e, false);
                                return null;
                            }
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    fa4.g(th4, false);
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
            File file = new File(h, de9.k(i, "account"));
            file.mkdirs();
            h = file;
        }
        String file2 = h.toString();
        boolean isPushConnectionEnabled = isPushConnectionEnabled();
        try {
            str4 = k96.Q0().toLowerCase();
            str5 = k96.I0().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = org.telegram.messenger.a.b.getPackageManager().getPackageInfo(org.telegram.messenger.a.b.getPackageName(), 0);
            boolean z = w01.a;
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
        Typeface typeface = gl.a;
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
            k = oo1.k(new StringBuilder("mainconfig"), this.currentAccount, org.telegram.messenger.a.b, 0);
        }
        this.forceTryIpV6 = k.getBoolean("forceTryIpV6", false);
        boolean z2 = getUserConfig().f() != null ? getUserConfig().f().premium : false;
        int d = gba.d();
        String str11 = str5;
        String str12 = str9;
        byte b2 = w01.d;
        boolean z3 = fa4.j;
        if (w01.a) {
            try {
                O0 = gl.O0();
            } catch (Throwable th) {
                th = th;
                i2 = d;
            }
            if (O0 != null) {
                fa4 j = fa4.j();
                StringBuilder sb = new StringBuilder();
                i2 = d;
                try {
                    str7 = str10;
                    b = b2;
                    try {
                        sb.append(fa4.j().c.format(System.currentTimeMillis()));
                        sb.append("_net.txt");
                        j.f = new File(O0, sb.toString());
                        str8 = fa4.j().f.getAbsolutePath();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        init(i2, 234, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str7 = str10;
                    b = b2;
                    th.printStackTrace();
                    init(i2, 234, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
                }
                init(i2, 234, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
            }
        }
        i2 = d;
        str7 = str10;
        b = b2;
        init(i2, 234, b, str7, str, str2, str11, str12, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z2, isPushConnectionEnabled);
    }

    public void checkWebProxyInternal(au8 au8Var, int i, RequestTimeDelegate requestTimeDelegate) {
        native_checkProxy(this.currentAccount, "127.0.0.1", i, "", "", au8Var.f, requestTimeDelegate);
    }

    public static int generateClassGuid() {
        int i = lastClassGuid;
        lastClassGuid = i + 1;
        return i;
    }

    public static void getHostByName(String str, long j) {
        gl.c3(new et(str, j, (byte) 12));
    }

    public static int getInitFlags() {
        if (h24.m(org.telegram.messenger.a.b).h()) {
            if (w01.a) {
                fa4.b("detected emu");
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
        String str2 = gba.f;
        if (!TextUtils.isEmpty(str2) && gba.e == 13) {
            str2 = b00.h("huawei://", str2);
        }
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(gba.g)) {
            str2 = gba.g;
        }
        if (TextUtils.isEmpty(str2)) {
            if (gba.e == 2) {
                str = "FIREBASE";
            } else {
                str = "HUAWEI";
            }
            StringBuilder p = ug8.p("__", str, "_GENERATING_SINCE_");
            p.append(getCurrentTime());
            p.append("__");
            String sb = p.toString();
            gba.g = sb;
            return sb;
        }
        return str2;
    }

    public void lambda$cancelRequest$10(Runnable runnable, int i, boolean z) {
        if (runnable != null) {
            listenCancel(i, new ks2(runnable, (byte) 0));
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
                fa4.g(th, true);
                native_onHostNameResolved(str, j, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j);
    }

    public static void lambda$onCaptchaCheck$28(final int i, final int i2, final int i3, final String str, String str2) {
        final ya1 ya1Var = new ya1(i, i2, i3);
        Activity u0 = gl.u0();
        if (u0 == null) {
            fa4.d("CaptchaController: no activity found");
            ya1Var.a("RECAPTCHA_FAILED_NO_ACTIVITY");
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
                final ya1 ya1Var2 = ya1Var;
                executeTask.addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public final void onSuccess(Object obj2) {
                        String concat;
                        String str4 = (String) obj2;
                        if (w01.a) {
                            int i7 = 0;
                            if (str4 == null) {
                                concat = "null";
                            } else {
                                concat = str4.substring(0, Math.min(24, str4.length())).concat("...");
                            }
                            StringBuilder p = ir2.p("CaptchaController: got token for account=", i4, ", request=", i5, ", generation=");
                            p.append(i6);
                            p.append(", token=");
                            p.append(concat);
                            p.append(", length=");
                            if (str4 != null) {
                                i7 = str4.length();
                            }
                            b00.p(i7, p);
                        }
                        ya1 ya1Var3 = ya1Var2;
                        if (str4 == null) {
                            ya1Var3.a("RECAPTCHA_FAILED_TOKEN_NULL");
                        } else {
                            ya1Var3.a(str4);
                        }
                    }
                }).addOnFailureListener(new wa1(ya1Var2, (byte) 1));
            }
        }).addOnFailureListener(new wa1(ya1Var, (byte) 0));
    }

    public static void lambda$onConnectionStateChanged$15(int i, int i2) {
        getInstance(i).connectionState = i2;
        kk7.f(j5.a(i).a).k(kk7.S1, new Object[0]);
    }

    public static void lambda$onIntegrityCheckClassic$25(int i, long j, int i2, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder m = de9.m(i, "account", ": integrity check gave null token in ");
            m.append(System.currentTimeMillis() - j);
            m.append("ms");
            fa4.d(m.toString());
            native_receivedIntegrityCheckClassic(i, i2, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        fa4.b("account" + i + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i, i2, str, str2);
        } catch (Exception e) {
            fa4.e("receivedIntegrityCheckClassic failed", e);
        }
    }

    public static void lambda$onIntegrityCheckClassic$26(int i, long j, int i2, String str, Exception exc) {
        StringBuilder m = de9.m(i, "account", ": integrity check failed to give a token in ");
        m.append(System.currentTimeMillis() - j);
        m.append("ms");
        fa4.e(m.toString(), exc);
        native_receivedIntegrityCheckClassic(i, i2, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + mf6.o1(exc));
    }

    public static void lambda$onIntegrityCheckClassic$27(int i, String str, String str2, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("account");
        sb.append(i);
        sb.append(": server requests integrity classic check with project = ");
        sb.append(str);
        sb.append(" nonce = ");
        de9.s(str2, sb);
        try {
            IntegrityManagerFactory.create(org.telegram.messenger.a.b).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new ms2(i, currentTimeMillis, str2, i2)).addOnFailureListener(new ms2(i, currentTimeMillis, str2, i2));
        } catch (Exception unused) {
            fa4.b("account" + i + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i, i2, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    public static void lambda$onLogout$16(int i) {
        int i2 = j5.a(i).a;
        if (y6c.h(i2).e() != 0) {
            y6c.h(i2).b();
            na7.q1(i2).C3(0);
        }
    }

    public static void lambda$onPremiumFloodWait$23(boolean z, int i, int i2) {
        boolean z2;
        l94 l94Var = null;
        qb4 qb4Var = null;
        if (z) {
            Iterator it = ba4.G(i).h.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qb4 qb4Var2 = (qb4) it.next();
                if (qb4Var2 != null && qb4Var2.q.contains(Integer.valueOf(i2))) {
                    qb4Var = qb4Var2;
                    break;
                }
            }
            if (qb4Var != null) {
                z2 = !qb4Var.T;
                qb4Var.T = true;
            }
            z2 = false;
        } else {
            Iterator it2 = ba4.G(i).w.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                l94 l94Var2 = (l94) it2.next();
                if (l94Var2 != null && l94Var2.F0.contains(Integer.valueOf(i2))) {
                    l94Var = l94Var2;
                    break;
                }
            }
            if (l94Var != null) {
                z2 = !l94Var.l;
                l94Var.l = true;
            }
            z2 = false;
        }
        if (z2) {
            kk7.f(i).k(kk7.u3, new Object[0]);
        }
    }

    public static void lambda$onPremiumFloodWait$24(int i, boolean z, int i2) {
        if (y6c.t0 != i) {
            return;
        }
        gl.c3(new is2(z, i, i2));
    }

    public static void lambda$onProxyError$19() {
        kk7.e().k(kk7.L0, 3);
    }

    public static void lambda$onRequestNewServerIpAndPort$17(int i, boolean z, int i2) {
        fa4.b("13. currentTask == " + currentTask);
        if (currentTask == null && ((i != 0 || Math.abs(lastDnsRequestTime - System.currentTimeMillis()) >= 10000) && z)) {
            lastDnsRequestTime = System.currentTimeMillis();
            if (i == 2) {
                if (w01.a) {
                    fa4.b("start mozilla txt task");
                }
                MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i2);
                mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                fa4.b("9. currentTask = mozilla");
                currentTask = mozillaDnsLoadTask;
                return;
            }
            if (w01.a) {
                fa4.b("start google txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i2);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            fa4.b("11. currentTask = dnstxt");
            currentTask = googleDnsLoadTask;
        } else if (w01.a) {
            fa4.b("don't start task, current task = " + currentTask + " next task = " + i + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + org.telegram.messenger.a.r());
        }
    }

    public static void lambda$onRequestNewServerIpAndPort$18(int i, int i2) {
        Utilities.d.c(new is2(i, org.telegram.messenger.a.r(), i2, (byte) 2));
    }

    public static void lambda$onSessionCreated$14(int i) {
        na7.q1(j5.a(i).a).V0();
    }

    public static void lambda$onUnparsedMessageReceived$12(int i, TLRPC.Updates updates) {
        na7.q1(j5.a(i).a).R3(updates, false);
    }

    public static void lambda$onUpdate$13(int i) {
        int i2;
        long j;
        int i3;
        ArrayList arrayList;
        int i4;
        long j2;
        vf6 vf6Var;
        boolean z;
        long j3;
        na7 q1 = na7.q1(j5.a(i).a);
        long currentTimeMillis = System.currentTimeMillis();
        int i5 = 0;
        q1.E(false);
        ArrayList arrayList2 = q1.K1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList3 = q1.I1;
        int size = arrayList3.size();
        int i6 = 0;
        while (true) {
            i2 = 1;
            if (i6 >= size) {
                break;
            }
            ga7 ga7Var = (ga7) arrayList3.get(i6);
            if (ga7Var.f <= elapsedRealtime) {
                q1.N(ga7Var);
                arrayList3.remove(i6);
                q1.J1.l(ga7Var.a);
                i6--;
                size--;
            }
            i6++;
        }
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            ga7 ga7Var2 = (ga7) arrayList2.get(i7);
            if (ga7Var2.f <= elapsedRealtime) {
                q1.N(ga7Var2);
                arrayList2.remove(i7);
                q1.L1.remove(ga7Var2.a + "_" + ga7Var2.b);
                i7 += -1;
                size2 += -1;
            }
            i7++;
        }
        long j4 = 1000;
        long j5 = 0;
        if (q1.getUserConfig().o()) {
            if (!q1.Z3 && q1.getConnectionsManager().getPauseTime() == 0 && org.telegram.messenger.a.w && !org.telegram.messenger.a.F) {
                if (org.telegram.messenger.a.H != 0 && Math.abs(org.telegram.messenger.a.H - System.currentTimeMillis()) > 1000 && q1.E2 != 1 && (q1.C2 == 0 || Math.abs(System.currentTimeMillis() - q1.C2) >= 55000 || q1.F2)) {
                    q1.E2 = (byte) 1;
                    if (q1.D2 != 0) {
                        q1.getConnectionsManager().cancelRequest(q1.D2, true);
                    }
                    TL_account.updateStatus updatestatus = new TL_account.updateStatus();
                    updatestatus.offline = false;
                    q1.D2 = q1.getConnectionsManager().sendRequest(updatestatus, new y47(q1, (byte) 9));
                }
            } else if (q1.E2 != 2 && !q1.F2 && Math.abs(System.currentTimeMillis() - q1.getConnectionsManager().getPauseTime()) >= 2000) {
                q1.E2 = (byte) 2;
                if (q1.D2 != 0) {
                    q1.getConnectionsManager().cancelRequest(q1.D2, true);
                }
                TL_account.updateStatus updatestatus2 = new TL_account.updateStatus();
                updatestatus2.offline = true;
                q1.D2 = q1.getConnectionsManager().sendRequest(updatestatus2, new y47(q1, (byte) 10));
            }
            long j6 = 1500;
            if (q1.N0.m() != 0) {
                int i8 = 0;
                while (i8 < q1.N0.m()) {
                    long j7 = q1.N0.j(i8);
                    if (Math.abs(currentTimeMillis - q1.O0.valueAt(i8)) >= j6) {
                        if (w01.a) {
                            j3 = j6;
                            fa4.b("QUEUE CHANNEL " + j7 + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        } else {
                            j3 = j6;
                        }
                        q1.I3(0, j7);
                    } else {
                        j3 = j6;
                    }
                    i8++;
                    j6 = j3;
                }
            }
            long j8 = j6;
            for (int i9 = 0; i9 < 3; i9++) {
                if (q1.U1(i9) != 0 && Math.abs(currentTimeMillis - q1.U1(i9)) >= j8) {
                    if (w01.a) {
                        fa4.b(i9 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    q1.S3(i9, 0);
                }
            }
        }
        int currentTime = q1.getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - q1.D0) >= 5000) {
            q1.D0 = System.currentTimeMillis();
            if (q1.A0.m() != 0) {
                int i10 = 0;
                while (true) {
                    int m = q1.A0.m();
                    vf6Var = q1.A0;
                    if (i10 >= m) {
                        break;
                    }
                    long j9 = vf6Var.j(i10);
                    TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = new TLRPC.TL_messages_getMessagesViews();
                    tL_messages_getMessagesViews.peer = q1.h1(j9);
                    tL_messages_getMessagesViews.id = (ArrayList) q1.A0.n(i10);
                    if (i10 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tL_messages_getMessagesViews.increment = z;
                    q1.getConnectionsManager().sendRequest(tL_messages_getMessagesViews, new w47(q1, j9, tL_messages_getMessagesViews, (byte) 7));
                    i10++;
                    j4 = j4;
                }
                j = j4;
                vf6Var.b();
            } else {
                j = 1000;
            }
            if (q1.C0 > 0) {
                gl.c3(new w57(q1, currentTime, (byte) 3));
            }
        } else {
            j = 1000;
        }
        if (!q1.a0.isEmpty()) {
            ArrayList arrayList4 = null;
            for (Map.Entry entry : q1.a0.entrySet()) {
                if (((Integer) entry.getValue()).intValue() < currentTime - 30) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add((Long) entry.getKey());
                }
            }
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    q1.a0.remove((Long) obj);
                }
                gl.c3(new f67(q1, (byte) 27));
            }
        }
        if (q1.q0.size() != 0) {
            int i12 = 0;
            while (i12 < q1.q0.size()) {
                long keyAt = q1.q0.keyAt(i12);
                if (q1.q0.valueAt(i12) < System.currentTimeMillis() / j) {
                    q1.q0.delete(keyAt);
                    i12--;
                    if (q1.r0.h(keyAt) >= 0) {
                        q1.G0(keyAt);
                    }
                }
                i12++;
            }
        }
        if (q1.s0.size() != 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() / j;
            int i13 = 0;
            while (i13 < q1.s0.size()) {
                long keyAt2 = q1.s0.keyAt(i13);
                if (q1.s0.valueAt(i13) < elapsedRealtime2) {
                    int h = q1.r0.h(keyAt2);
                    LongSparseIntArray longSparseIntArray = q1.s0;
                    if (h >= 0) {
                        j2 = j5;
                        longSparseIntArray.put(keyAt2, (int) (elapsedRealtime2 + 300));
                    } else {
                        j2 = j5;
                        longSparseIntArray.delete(keyAt2);
                        i13--;
                    }
                    TLRPC.TL_messages_getOnlines tL_messages_getOnlines = new TLRPC.TL_messages_getOnlines();
                    tL_messages_getOnlines.peer = q1.h1(-keyAt2);
                    q1.getConnectionsManager().sendRequest(tL_messages_getOnlines, new x47(q1, keyAt2, (byte) 13));
                } else {
                    j2 = j5;
                }
                i13++;
                j5 = j2;
            }
        }
        long j10 = j5;
        if (q1.W.isEmpty() && q1.c0 == q1.W.size()) {
            i3 = 1;
        } else {
            ArrayList arrayList5 = new ArrayList(q1.W.keySet());
            int i14 = 0;
            int i15 = 0;
            while (i14 < arrayList5.size()) {
                Long l = (Long) arrayList5.get(i14);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) q1.W.get(l);
                if (concurrentHashMap != null) {
                    ArrayList arrayList6 = new ArrayList(concurrentHashMap.keySet());
                    int i16 = i5;
                    while (i16 < arrayList6.size()) {
                        Integer num = (Integer) arrayList6.get(i16);
                        ArrayList arrayList7 = (ArrayList) concurrentHashMap.get(num);
                        if (arrayList7 != null) {
                            int i17 = i5;
                            while (i17 < arrayList7.size()) {
                                fa7 fa7Var = (fa7) arrayList7.get(i17);
                                int i18 = i2;
                                if (fa7Var.c instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                    i4 = 30000;
                                } else {
                                    i4 = 5900;
                                }
                                ArrayList arrayList8 = arrayList5;
                                if (fa7Var.a + i4 < currentTimeMillis) {
                                    arrayList7.remove(fa7Var);
                                    i17--;
                                    i15 = i18;
                                }
                                i17++;
                                i2 = i18;
                                arrayList5 = arrayList8;
                            }
                        }
                        ArrayList arrayList9 = arrayList5;
                        int i19 = i2;
                        if (arrayList7 == null || arrayList7.isEmpty()) {
                            concurrentHashMap.remove(num);
                            arrayList6.remove(i16);
                            i16--;
                        }
                        i16++;
                        i2 = i19;
                        arrayList5 = arrayList9;
                        i5 = 0;
                    }
                }
                ArrayList arrayList10 = arrayList5;
                int i20 = i2;
                if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                    arrayList = arrayList10;
                } else {
                    q1.W.remove(l);
                    arrayList = arrayList10;
                    arrayList.remove(i14);
                    i14--;
                }
                i14++;
                arrayList5 = arrayList;
                i2 = i20;
                i5 = 0;
            }
            i3 = i2;
            q1.t5();
            if (i15 != 0) {
                gl.c3(new c87(q1, (byte) 0));
            }
        }
        if (bkb.o == i3 && Math.abs(currentTimeMillis - na7.o5) >= 60) {
            gl.c3(q1.A2);
            na7.o5 = currentTimeMillis;
        }
        if (q1.getUserConfig().k0 != null && Math.abs(currentTimeMillis - na7.p5) >= 60) {
            gl.c3(q1.B2);
            na7.p5 = currentTimeMillis;
        }
        if (q1.d2 != j10 && Math.abs(SystemClock.elapsedRealtime() - q1.d2) >= 10800000) {
            PushListenerController.sendRegistrationToServer(gba.e, gba.f);
        }
        q1.getLocationController().t();
        q1.J(false);
        if (q1.y2 <= q1.getConnectionsManager().getCurrentTime() && !q1.x2 && q1.getUserConfig().o()) {
            q1.x2 = true;
            q1.getConnectionsManager().sendRequest(new TLRPC.TL_help_getTermsOfServiceUpdate(), new y47(q1, (byte) 3));
        }
    }

    public static void lambda$onUpdateConfig$21(int i, TLRPC.TL_config tL_config) {
        gl.c3(new ee2(na7.q1(j5.a(i).a), tL_config, (byte) 8));
    }

    public void lambda$sendRequestInternal$7(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j);
        } else if (tLObject instanceof TLRPC.Updates) {
            CountDownLatch countDownLatch = KeepAliveJob.a;
            Utilities.e.c(new ql3((byte) 16));
            na7.q1(j5.a(this.currentAccount).a).R3((TLRPC.Updates) tLObject, false);
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
                    boolean z2 = w01.a;
                    fa4.i(e, true);
                    return;
                }
            } else if (str != null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.code = i5;
                tL_error2.text = str;
                if (w01.a && i5 != -2000) {
                    fa4.d(tLObject + " got error " + tL_error2.code + " " + tL_error2.text);
                }
                i8 = 0;
                tLObject2 = null;
                tL_error = tL_error2;
            } else {
                i8 = 0;
                tLObject2 = null;
            }
            if ((i & 2) == 0 || !lbc.l0.isEmpty()) {
                connectionsManager = this;
            } else {
                connectionsManager = this;
                s93.d(org.telegram.messenger.a.b).f(i8, Math.max(0L, (System.currentTimeMillis() - j) - native_getCurrentPingTime(connectionsManager.currentAccount)));
            }
            boolean z3 = w01.a;
            if (tLObject2 != null) {
                tLObject2.networkType = i6;
            }
            if (w01.a) {
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
                fa4.b(sb.toString());
            }
            Utilities.d.c(new fl1(connectionsManager, requestDelegate, tLObject2, tL_error, requestDelegateTimestamp, j3, (byte) 1));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static void lambda$sendRequestTyped$3(Executor executor, i8c i8cVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new ns2(i8cVar, tLObject, tL_error, (byte) 0));
        } else {
            i8cVar.a(tLObject, tL_error);
        }
    }

    public void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, i8c i8cVar, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().R3(updates, false);
        }
        if (executor != null) {
            executor.execute(new jn1(i8cVar, updates, tL_error, (byte) 24));
        } else {
            i8cVar.a(updates, tL_error);
        }
    }

    public void lambda$setIsUpdating$22(boolean z) {
        if (this.isUpdating != z) {
            this.isUpdating = z;
            if (this.connectionState == 3) {
                kk7.f(j5.a(this.currentAccount).a).k(kk7.S1, new Object[0]);
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
            yxa.c(i3).f(i2, 6, i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public static void onBytesSent(int i, int i2, int i3) {
        try {
            yxa.c(j5.a(i3).a).h(i2, 6, i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public static void onCaptchaCheck(int i, int i2, int i3, String str, String str2) {
        gl.c3(new os2(i, i2, i3, str, str2, (byte) 0));
    }

    public static void onConnectionStateChanged(int i, int i2) {
        gl.c3(new gs2(i2, i, (byte) 0));
    }

    public static void onIntegrityCheckClassic(int i, int i2, String str, String str2) {
        gl.c3(new mp1(i, i2, str, str2));
    }

    public static void onInternalPushReceived(int i) {
        CountDownLatch countDownLatch = KeepAliveJob.a;
        Utilities.e.c(new ql3((byte) 17));
    }

    public static void onLogout(int i) {
        gl.c3(new xv0(i, (byte) 3));
    }

    public static void onPremiumFloodWait(int i, int i2, boolean z) {
        gl.c3(new is2(i, z, i2, (byte) 0));
    }

    public static void onProxyError() {
        gl.c3(new jc((byte) 25));
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
        Utilities.e.c(new gs2(i, i2, (byte) 1));
    }

    public static void onRequestQuickAck(int i, int i2) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2))) != null && (quickAckDelegate = requestCallbacks.onQuickAck) != null) {
            quickAckDelegate.run();
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
        Utilities.d.c(new xv0(i, (byte) 2));
    }

    public static void onUnparsedMessageReceived(long j, int i, long j2) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j);
            wrap.setDataSourceType(TLDataSourceType.NETWORK);
            wrap.reused = true;
            int readInt32 = wrap.readInt32(true);
            TLRPC.Updates TLdeserialize = TLRPC.Updates.TLdeserialize(wrap, readInt32, true);
            boolean z = fa4.j;
            boolean z2 = w01.a;
            if (TLdeserialize != null) {
                if (w01.a) {
                    fa4.b("java received " + TLdeserialize);
                }
                CountDownLatch countDownLatch = KeepAliveJob.a;
                Utilities.e.c(new ql3((byte) 16));
                Utilities.d.c(new ze(i, TLdeserialize, (byte) 1));
            } else if (w01.a) {
                fa4.b(String.format("java received unknown constructor 0x%x", Integer.valueOf(readInt32)));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public static void onUpdate(int i) {
        Utilities.d.c(new xv0(i, (byte) 1));
    }

    public static void onUpdateConfig(long j, int i) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j);
            wrap.reused = true;
            TLRPC.TL_config TLdeserialize = TLRPC.TL_config.TLdeserialize(wrap, wrap.readInt32(true), true);
            if (TLdeserialize != null) {
                Utilities.d.c(new eg(i, TLdeserialize, (byte) 27));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i, final int i2, final int i3, final boolean z, final int i4) {
        long j;
        int i5;
        if (w01.a) {
            fa4.b("send request " + tLObject + " with token = " + i4);
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
            fa4.g(e, true);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i = 0; i < 4; i++) {
            native_setLangCode(i, lowerCase);
        }
    }

    public static void setProxySettings(boolean z, au8 au8Var) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        String str5 = "";
        if (z && au8Var != null && au8Var.g()) {
            String str6 = au8Var.b;
            int i3 = au8Var.c;
            String str7 = au8Var.d;
            String str8 = au8Var.e;
            String str9 = au8Var.f;
            if (au8Var.a == 3) {
                i = auc.o(str6, str9);
                if (i == 0) {
                    i = 9;
                }
                str2 = "";
                str3 = str9;
                str5 = "127.0.0.1";
                str = str2;
            } else {
                synchronized (auc.y) {
                    auc aucVar = auc.z;
                    if (aucVar != null) {
                        aucVar.q();
                        auc.z = null;
                    }
                }
                str5 = str6;
                i = i3;
                str = str7;
                str2 = str8;
                str3 = str9;
            }
        } else {
            auc.p();
            str = "";
            str2 = str;
            str3 = str2;
            i = 0;
        }
        int i4 = 0;
        while (i4 < 4) {
            if (z && au8Var != null && au8Var.g()) {
                str4 = str5;
                i2 = i4;
                native_setProxySettings(i2, str4, i, str, str2, str3);
            } else {
                str4 = str5;
                i2 = i4;
                native_setProxySettings(i2, "", 1080, "", "", "");
            }
            int i5 = j5.a(i2).a;
            if (y6c.h(i5).o()) {
                Utilities.d.c(new c87(na7.q1(i5), (byte) 11));
            }
            i4 = i2 + 1;
            str5 = str4;
        }
    }

    public static void setRegId(String str, int i, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && i == 13) {
            str = b00.h("huawei://", str);
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
            StringBuilder p = ug8.p("__", str3, "_GENERATING_SINCE_");
            p.append(getInstance(0).getCurrentTime());
            p.append("__");
            str2 = p.toString();
            gba.g = str2;
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
        Utilities.d.c(new bs1(this, runnable, i, z, (byte) 1));
    }

    public void cancelRequestsForGuid(int i) {
        Utilities.d.c(new hs2(this, i, (byte) 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (w01.a) {
            fa4.b("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, org.telegram.messenger.a.r(), org.telegram.messenger.a.f(), org.telegram.messenger.a.p());
    }

    public long checkProxy(au8 au8Var, RequestTimeDelegate requestTimeDelegate) {
        if (au8Var != null && au8Var.g()) {
            if (au8Var.a == 3) {
                wtc wtcVar = wtc.e;
                if (wtcVar == null) {
                    synchronized (wtc.class) {
                        wtcVar = wtc.e;
                        if (wtcVar == null) {
                            wtcVar = new wtc((byte) 0);
                            wtc.e = wtcVar;
                        }
                    }
                }
                wtc wtcVar2 = wtcVar;
                rh1 rh1Var = new rh1(this, (byte) 28);
                if (au8Var.a == 3 && au8Var.g() && requestTimeDelegate != null) {
                    gl.c3(new rnc(wtcVar2, rh1Var, au8Var, requestTimeDelegate, (byte) 6));
                    return 0L;
                } else if (requestTimeDelegate != null) {
                    requestTimeDelegate.run(-1L);
                    return 0L;
                }
            } else {
                return native_checkProxy(this.currentAccount, au8Var.b, au8Var.c, au8Var.d, au8Var.e, au8Var.f, requestTimeDelegate);
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
        Utilities.d.c(new hs2(this, i, (byte) 0));
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
        if (w01.a) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback() && !nextElement.getInterfaceAddresses().isEmpty()) {
                        if (w01.a) {
                            fa4.b("valid interface: " + nextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                        for (int i = 0; i < interfaceAddresses.size(); i++) {
                            InetAddress address = interfaceAddresses.get(i).getAddress();
                            if (w01.a) {
                                fa4.b("address: " + address.getHostAddress());
                            }
                            if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress() && w01.a) {
                                fa4.b("address is good");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                fa4.g(th, true);
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
            fa4.g(th2, true);
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
        au8 c = au8.c(sharedPreferences);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && c.g()) {
            if (c.a == 3) {
                int o = auc.o(c.b, c.f);
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
        native_init(this.currentAccount, i, i2, i3, str, str2, str3, str4, str5, str6, str7, str8, str9, str12, str11 == null ? "" : str11, i4, j, z, z2, org.telegram.messenger.a.r(), org.telegram.messenger.a.f(), gba.u());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences d1 = na7.d1();
        if (d1.contains("pushConnection")) {
            return d1.getBoolean("pushConnection", true);
        }
        return na7.q1(y6c.t0).X3.getBoolean("backgroundConnection", false);
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

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, i8c i8cVar, int i, int i2) {
        return sendRequest(tLMethod, new pl(executor, i8cVar, (byte) 25), null, null, null, i2, i, 1, true);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, i8c i8cVar) {
        return sendRequestTypedAndProcessUpdates(tLMethod, executor, i8cVar, Integer.MAX_VALUE, 0);
    }

    public void setAppPaused(boolean z, boolean z2) {
        if (!z2) {
            this.appPaused = z;
            if (w01.a) {
                fa4.b("app paused = " + z);
            }
            int i = this.appResumeCount;
            if (z) {
                this.appResumeCount = i - 1;
            } else {
                this.appResumeCount = i + 1;
            }
            if (w01.a) {
                b00.p(this.appResumeCount, new StringBuilder("app resume count "));
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
            if (w01.a) {
                fa4.b("reset app pause time");
            }
            if (this.lastPauseTime != 0 && System.currentTimeMillis() - this.lastPauseTime > 5000) {
                qu2 contactsController = getContactsController();
                contactsController.getClass();
                Utilities.e.c(new wt2(contactsController, (byte) 3));
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
        gl.c3(new x6c((byte) 14, this, z));
    }

    public void setPushConnectionEnabled(boolean z) {
        native_setPushConnectionEnabled(this.currentAccount, z);
    }

    public void setUserId(long j) {
        native_setUserId(this.currentAccount, j);
    }

    public void switchBackend(boolean z) {
        na7.c1().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, i8c i8cVar, int i, int i2) {
        return sendRequestTyped(tLMethod, null, new p(this, executor, i8cVar, (byte) 7), i, i2);
    }

    public void cancelRequest(int i, boolean z) {
        cancelRequest(i, z, null);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, i8c i8cVar) {
        return sendRequestTyped(tLMethod, executor, i8cVar, Integer.MAX_VALUE, 0);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, i8c i8cVar, int i) {
        return sendRequestTyped(tLMethod, executor, i8cVar, Integer.MAX_VALUE, i);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, i8c i8cVar) {
        return sendRequestTyped(tLMethod, null, i8cVar);
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
