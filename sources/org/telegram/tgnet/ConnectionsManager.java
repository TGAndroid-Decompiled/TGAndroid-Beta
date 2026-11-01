package org.telegram.tgnet;

import ag.f3;
import ag.q0;
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
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.Recaptcha;
import i2.a0;
import j$.util.Objects;
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
import java.util.HashSet;
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
import org.telegram.messenger.a5;
import org.telegram.messenger.ak;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.c3;
import org.telegram.messenger.cl;
import org.telegram.messenger.d3;
import org.telegram.messenger.d9;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.e3;
import org.telegram.messenger.e4;
import org.telegram.messenger.f1;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.i5;
import org.telegram.messenger.k20;
import org.telegram.messenger.ks;
import org.telegram.messenger.m7;
import org.telegram.messenger.np;
import org.telegram.messenger.o6;
import org.telegram.messenger.op;
import org.telegram.messenger.rj;
import org.telegram.messenger.tj;
import org.telegram.messenger.ud;
import org.telegram.messenger.uj;
import org.telegram.messenger.uz;
import org.telegram.messenger.v2;
import org.telegram.messenger.voip.p0;
import org.telegram.messenger.vz;
import org.telegram.messenger.w0;
import org.telegram.messenger.wp;
import org.telegram.messenger.xd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.gf0;
public class ConnectionsManager extends f1 {
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

        public GoogleDnsLoadTask(int i10) {
            this.currentAccount = i10;
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
            f8.b("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i10 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i10, nativeByteBuffer.address, e20.i(org.telegram.messenger.c.a(i10).f15043a).d(), this.responseDate);
                return;
            }
            if (v2.f18578a) {
                f8.b("failed to get google result");
                f8.b("start mozilla task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(this.currentAccount);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            f8.b("4. currentTask = mozilla");
            AsyncTask unused2 = ConnectionsManager.currentTask = mozillaDnsLoadTask;
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            int read;
            boolean z10 = false;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : wp.r1(org.telegram.messenger.c.a(this.currentAccount).f15043a).O3;
                int nextInt = Utilities.f14520b.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i10 = 0; i10 < nextInt; i10++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.f14520b.nextInt(62)));
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
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            if (jSONObject.getInt("type") == 16) {
                                arrayList.add(jSONObject.getString("data"));
                            }
                        }
                        Collections.sort(arrayList, new j(0));
                        StringBuilder sb3 = new StringBuilder();
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            sb3.append(((String) arrayList.get(i12)).replace("\"", ""));
                        }
                        byte[] decode = Base64.decode(sb3.toString(), 0);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                        nativeByteBuffer.writeBytes(decode);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                f8.g(th2, true);
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
                            if (!(th instanceof SocketTimeoutException) && !(th instanceof SSLException)) {
                                z10 = true;
                            }
                            f8.g(th, z10);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    f8.g(th4, true);
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
                                } catch (Throwable th5) {
                                    f8.g(th5, true);
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
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th7) {
                th = th7;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.d.c(new k(this, nativeByteBuffer, 0));
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
            if (length < length2) {
                return 1;
            }
            return 0;
        }

        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            f8.b("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i10 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i10, nativeByteBuffer.address, e20.i(org.telegram.messenger.c.a(i10).f15043a).d(), this.responseDate);
            } else if (v2.f18578a) {
                f8.b("failed to get mozilla txt result");
            }
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            int read;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : wp.r1(org.telegram.messenger.c.a(this.currentAccount).f15043a).O3;
                int nextInt = Utilities.f14520b.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i10 = 0; i10 < nextInt; i10++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.f14520b.nextInt(62)));
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
                } catch (Throwable th2) {
                    th = th2;
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
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        if (jSONObject.getInt("type") == 16) {
                            arrayList.add(jSONObject.getString("data"));
                        }
                    }
                    Collections.sort(arrayList, new j(1));
                    StringBuilder sb3 = new StringBuilder();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sb3.append(((String) arrayList.get(i12)).replace("\"", ""));
                    }
                    byte[] decode = Base64.decode(sb3.toString(), 0);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                    nativeByteBuffer.writeBytes(decode);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th3) {
                            f8.g(th3, true);
                        }
                    }
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    return nativeByteBuffer;
                } catch (Throwable th4) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th4;
                    inputStream = inputStream2;
                    try {
                        f8.g(th, false);
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
                                f8.g(th5, true);
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
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.d.c(new k(this, nativeByteBuffer, 1));
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
                            for (int i10 = 0; i10 < length; i10++) {
                                arrayList.add(jSONArray.getJSONObject(i10).getString("data"));
                            }
                            ResolvedDomain resolvedDomain = new ResolvedDomain(arrayList, SystemClock.elapsedRealtime());
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                f8.g(th2, false);
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused) {
                            }
                            return resolvedDomain;
                        }
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            f8.g(th3, false);
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                            return null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            f8.g(th, false);
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
                                f8.g(e, false);
                                return null;
                            }
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th5) {
                                    f8.g(th5, false);
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
                } catch (Throwable th6) {
                    th = th6;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th7) {
                th = th7;
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
            return arrayList.get(Utilities.f14520b.nextInt(arrayList.size()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        CORE_POOL_SIZE = max;
        int i10 = (availableProcessors * 2) + 1;
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
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i10, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    public ConnectionsManager(int i10) {
        super(i10);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        SharedPreferences sharedPreferences;
        int i11;
        String str8;
        int i12;
        File P0;
        String str9 = "";
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File h = w0.h();
        if (i10 != 0) {
            File file = new File(h, i0.a.i(i10, "account"));
            file.mkdirs();
            h = file;
        }
        String file2 = h.toString();
        boolean isPushConnectionEnabled = isPushConnectionEnabled();
        try {
            str4 = dd.P0().toLowerCase();
            str5 = dd.I0().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = w0.f18945b.getPackageManager().getPackageInfo(w0.f18945b.getPackageName(), 0);
            boolean z10 = v2.f18578a;
            str2 = (packageInfo.versionName + " (" + packageInfo.versionCode + ")") + " beta";
            str = "SDK " + Build.VERSION.SDK_INT;
        } catch (Exception unused) {
            str = "SDK " + Build.VERSION.SDK_INT;
            str2 = "App version unknown";
            str3 = "Android unknown";
            str4 = "en";
            str5 = "";
        }
        String str10 = str4.trim().length() != 0 ? str4 : "en";
        String str11 = str3.trim().length() != 0 ? str3 : "Android unknown";
        if (str2.trim().length() == 0) {
            str6 = "App version unknown";
        } else {
            str6 = str2;
        }
        str = str.trim().length() == 0 ? "SDK Unknown" : str;
        getUserConfig().s();
        String regId = getRegId();
        Typeface typeface = i0.f16145a;
        try {
            byte[] encoded = ((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(w0.f18945b.getPackageManager().getPackageInfo(w0.f18945b.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded();
            Pattern pattern = Utilities.f14519a;
            str7 = Utilities.f(Utilities.o(encoded.length, encoded));
        } catch (Throwable unused2) {
            str7 = "";
        }
        int dSTSavings = (TimeZone.getDefault().getDSTSavings() + TimeZone.getDefault().getRawOffset()) / 1000;
        if (this.currentAccount == 0) {
            sharedPreferences = w0.f18945b.getSharedPreferences("mainconfig", 0);
        } else {
            sharedPreferences = w0.f18945b.getSharedPreferences("mainconfig" + this.currentAccount, 0);
        }
        this.forceTryIpV6 = sharedPreferences.getBoolean("forceTryIpV6", false);
        boolean z11 = getUserConfig().f() != null ? getUserConfig().f().premium : false;
        int d = uz.d();
        String str12 = str10;
        int i13 = v2.d;
        boolean z12 = f8.f15706j;
        if (v2.f18578a) {
            try {
                P0 = i0.P0();
            } catch (Throwable th2) {
                th = th2;
                i11 = d;
            }
            if (P0 != null) {
                f8 j10 = f8.j();
                StringBuilder sb2 = new StringBuilder();
                i11 = d;
                try {
                    str8 = str11;
                    i12 = i13;
                    try {
                        sb2.append(f8.j().f15711c.format(System.currentTimeMillis()));
                        sb2.append("_net.txt");
                        j10.f15712f = new File(P0, sb2.toString());
                        str9 = f8.j().f15712f.getAbsolutePath();
                    } catch (Throwable th3) {
                        th = th3;
                        th.printStackTrace();
                        init(i11, 233, i12, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str8 = str11;
                    i12 = i13;
                    th.printStackTrace();
                    init(i11, 233, i12, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
                }
                init(i11, 233, i12, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
            }
        }
        i11 = d;
        str8 = str11;
        i12 = i13;
        init(i11, 233, i12, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
    }

    public void checkWebProxyInternal(ji.b bVar, int i10, RequestTimeDelegate requestTimeDelegate) {
        native_checkProxy(this.currentAccount, "127.0.0.1", i10, "", "", bVar.f10431f, requestTimeDelegate);
    }

    public static int generateClassGuid() {
        int i10 = lastClassGuid;
        lastClassGuid = i10 + 1;
        return i10;
    }

    public static void getHostByName(String str, long j10) {
        i0.g3(new bi.e(str, j10, 7));
    }

    public static int getInitFlags() {
        if (o6.h(w0.f18945b).f()) {
            if (v2.f18578a) {
                f8.b("detected emu");
                return 1024;
            }
            return 1024;
        }
        return 0;
    }

    public static ConnectionsManager getInstance(int i10) {
        ConnectionsManager connectionsManager;
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager2 = connectionsManagerArr[i10];
        if (connectionsManager2 == null) {
            synchronized (ConnectionsManager.class) {
                try {
                    connectionsManager = connectionsManagerArr[i10];
                    if (connectionsManager == null) {
                        connectionsManager = new ConnectionsManager(i10);
                        connectionsManagerArr[i10] = connectionsManager;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return connectionsManager;
        }
        return connectionsManager2;
    }

    private String getRegId() {
        String str;
        String str2 = uz.f18516g;
        if (!TextUtils.isEmpty(str2) && uz.f18513f == 13) {
            str2 = sc.e.h("huawei://", str2);
        }
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(uz.h)) {
            str2 = uz.h;
        }
        if (TextUtils.isEmpty(str2)) {
            if (uz.f18513f == 2) {
                str = "FIREBASE";
            } else {
                str = "HUAWEI";
            }
            StringBuilder u10 = a1.g.u("__", str, "_GENERATING_SINCE_");
            u10.append(getCurrentTime());
            u10.append("__");
            String sb2 = u10.toString();
            uz.h = sb2;
            return sb2;
        }
        return str2;
    }

    public void lambda$cancelRequest$10(Runnable runnable, int i10, boolean z10) {
        if (runnable != null) {
            listenCancel(i10, new lg.b(1, runnable));
        }
        native_cancelRequest(this.currentAccount, i10, z10);
    }

    public static void lambda$cancelRequest$9(Runnable runnable) {
        Utilities.d.c(runnable);
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
            } catch (Throwable th2) {
                f8.g(th2, true);
                native_onHostNameResolved(str, j10, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j10);
    }

    public static void lambda$onConnectionStateChanged$15(int i10, int i11) {
        getInstance(i10).connectionState = i11;
        at.f(org.telegram.messenger.c.a(i10).f15043a).k(at.T1, new Object[0]);
    }

    public static void lambda$onIntegrityCheckClassic$25(int i10, long j10, int i11, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder l4 = i0.a.l(i10, "account", ": integrity check gave null token in ");
            l4.append(System.currentTimeMillis() - j10);
            l4.append("ms");
            f8.d(l4.toString());
            native_receivedIntegrityCheckClassic(i10, i11, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        f8.b("account" + i10 + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j10) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i10, i11, str, str2);
        } catch (Exception e) {
            f8.e("receivedIntegrityCheckClassic failed", e);
        }
    }

    public static void lambda$onIntegrityCheckClassic$26(int i10, long j10, int i11, String str, Exception exc) {
        StringBuilder l4 = i0.a.l(i10, "account", ": integrity check failed to give a token in ");
        l4.append(System.currentTimeMillis() - j10);
        l4.append("ms");
        f8.e(l4.toString(), exc);
        native_receivedIntegrityCheckClassic(i10, i11, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + gf0.o1(exc));
    }

    public static void lambda$onIntegrityCheckClassic$27(int i10, String str, String str2, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("account");
        sb2.append(i10);
        sb2.append(": server requests integrity classic check with project = ");
        sb2.append(str);
        sb2.append(" nonce = ");
        a1.g.z(str2, sb2);
        try {
            IntegrityManagerFactory.create(w0.f18945b).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new g(i10, currentTimeMillis, str2, i11)).addOnFailureListener(new g(i10, currentTimeMillis, str2, i11));
        } catch (Exception unused) {
            f8.b("account" + i10 + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i10, i11, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    public static void lambda$onLogout$16(int i10) {
        int i11 = org.telegram.messenger.c.a(i10).f15043a;
        if (e20.i(i11).e() != 0) {
            e20.i(i11).b();
            wp.r1(i11).x3(0);
        }
    }

    public static void lambda$onPremiumFloodWait$23(boolean z10, int i10, int i11) {
        boolean z11;
        m7 m7Var = null;
        d9 d9Var = null;
        if (z10) {
            Iterator it = b8.G(i10).h.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d9 d9Var2 = (d9) it.next();
                if (d9Var2 != null && d9Var2.f15323q.contains(Integer.valueOf(i11))) {
                    d9Var = d9Var2;
                    break;
                }
            }
            if (d9Var != null) {
                z11 = !d9Var.T;
                d9Var.T = true;
            }
            z11 = false;
        } else {
            Iterator it2 = b8.G(i10).f14946w.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                m7 m7Var2 = (m7) it2.next();
                if (m7Var2 != null && m7Var2.F0.contains(Integer.valueOf(i11))) {
                    m7Var = m7Var2;
                    break;
                }
            }
            if (m7Var != null) {
                z11 = !m7Var.f17071l;
                m7Var.f17071l = true;
            }
            z11 = false;
        }
        if (z11) {
            at.f(i10).k(at.f14790t3, new Object[0]);
        }
    }

    public static void lambda$onPremiumFloodWait$24(int i10, boolean z10, int i11) {
        if (e20.f15506s0 != i10) {
            return;
        }
        i0.g3(new b(z10, i10, i11));
    }

    public static void lambda$onProxyError$19() {
        at.e().k(at.M0, 3);
    }

    public static void lambda$onRequestNewServerIpAndPort$17(int i10, boolean z10, int i11) {
        f8.b("13. currentTask == " + currentTask);
        if (currentTask == null && ((i10 != 0 || Math.abs(lastDnsRequestTime - System.currentTimeMillis()) >= 10000) && z10)) {
            lastDnsRequestTime = System.currentTimeMillis();
            if (i10 == 2) {
                if (v2.f18578a) {
                    f8.b("start mozilla txt task");
                }
                MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i11);
                mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                f8.b("9. currentTask = mozilla");
                currentTask = mozillaDnsLoadTask;
                return;
            }
            if (v2.f18578a) {
                f8.b("start google txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i11);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            f8.b("11. currentTask = dnstxt");
            currentTask = googleDnsLoadTask;
        } else if (v2.f18578a) {
            f8.b("don't start task, current task = " + currentTask + " next task = " + i10 + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + w0.s());
        }
    }

    public static void lambda$onRequestNewServerIpAndPort$18(int i10, int i11) {
        Utilities.d.c(new b(i10, i11, 2, w0.s()));
    }

    public static void lambda$onSessionCreated$14(int i10) {
        wp.r1(org.telegram.messenger.c.a(i10).f15043a).W0();
    }

    public static void lambda$onUnparsedMessageReceived$12(int i10, TLRPC.Updates updates) {
        wp.r1(org.telegram.messenger.c.a(i10).f15043a).L3(updates, false);
    }

    public static void lambda$onUpdate$13(int i10) {
        int i11;
        long j10;
        long j11;
        int i12;
        long j12;
        int i13;
        int i14;
        boolean z10;
        wp r12 = wp.r1(org.telegram.messenger.c.a(i10).f15043a);
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        r12.I(false);
        ArrayList arrayList = r12.R1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = r12.P1;
        int size = arrayList2.size();
        int i16 = 0;
        while (true) {
            i11 = 1;
            if (i16 >= size) {
                break;
            }
            op opVar = (op) arrayList2.get(i16);
            if (opVar.f17496f <= elapsedRealtime) {
                r12.R(opVar);
                arrayList2.remove(i16);
                r12.Q1.l(opVar.f17493a);
                i16--;
                size--;
            }
            i16++;
        }
        int size2 = arrayList.size();
        int i17 = 0;
        while (i17 < size2) {
            op opVar2 = (op) arrayList.get(i17);
            if (opVar2.f17496f <= elapsedRealtime) {
                r12.R(opVar2);
                arrayList.remove(i17);
                r12.S1.remove(opVar2.f17493a + "_" + opVar2.f17494b);
                i17 += -1;
                size2 += -1;
            }
            i17++;
        }
        long j13 = 1000;
        long j14 = 0;
        if (r12.getUserConfig().p()) {
            if (!r12.f19147h7 && r12.getConnectionsManager().getPauseTime() == 0 && w0.f18951w && !w0.E) {
                if (w0.G != 0 && Math.abs(w0.G - System.currentTimeMillis()) > 1000 && r12.L2 != 1 && (r12.J2 == 0 || Math.abs(System.currentTimeMillis() - r12.J2) >= 55000 || r12.M2)) {
                    r12.L2 = 1;
                    if (r12.K2 != 0) {
                        r12.getConnectionsManager().cancelRequest(r12.K2, true);
                    }
                    TL_account.updateStatus updatestatus = new TL_account.updateStatus();
                    updatestatus.offline = false;
                    r12.K2 = r12.getConnectionsManager().sendRequest(updatestatus, new uj(r12, 9));
                }
            } else if (r12.L2 != 2 && !r12.M2 && Math.abs(System.currentTimeMillis() - r12.getConnectionsManager().getPauseTime()) >= 2000) {
                r12.L2 = 2;
                if (r12.K2 != 0) {
                    r12.getConnectionsManager().cancelRequest(r12.K2, true);
                }
                TL_account.updateStatus updatestatus2 = new TL_account.updateStatus();
                updatestatus2.offline = true;
                r12.K2 = r12.getConnectionsManager().sendRequest(updatestatus2, new uj(r12, 10));
            }
            if (r12.W0.m() != 0) {
                for (int i18 = 0; i18 < r12.W0.m(); i18++) {
                    long j15 = r12.W0.j(i18);
                    if (Math.abs(currentTimeMillis - r12.X0.valueAt(i18)) >= 1500) {
                        if (v2.f18578a) {
                            f8.b("QUEUE CHANNEL " + j15 + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        }
                        r12.C3(0, j15);
                    }
                }
            }
            for (int i19 = 0; i19 < 3; i19++) {
                if (r12.Y1(i19) != 0 && Math.abs(currentTimeMillis - r12.Y1(i19)) >= 1500) {
                    if (v2.f18578a) {
                        f8.b(i19 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    r12.M3(i19, 0);
                }
            }
        }
        int currentTime = r12.getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - r12.M0) >= 5000) {
            r12.M0 = System.currentTimeMillis();
            if (r12.J0.m() != 0) {
                int i20 = 0;
                while (i20 < r12.J0.m()) {
                    long j16 = r12.J0.j(i20);
                    TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = new TLRPC.TL_messages_getMessagesViews();
                    tL_messages_getMessagesViews.peer = r12.i1(j16);
                    tL_messages_getMessagesViews.f19892id = (ArrayList) r12.J0.n(i20);
                    if (i20 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tL_messages_getMessagesViews.increment = z10;
                    r12.getConnectionsManager().sendRequest(tL_messages_getMessagesViews, new rj(r12, j16, tL_messages_getMessagesViews, 3));
                    i20++;
                    j13 = j13;
                }
                j10 = j13;
                r12.J0.b();
            } else {
                j10 = 1000;
            }
            if (r12.L0 > 0) {
                i0.g3(new cl(r12, currentTime, 3));
            }
        } else {
            j10 = 1000;
        }
        if (!r12.Z.isEmpty()) {
            ArrayList arrayList3 = null;
            for (Map.Entry entry : r12.Z.entrySet()) {
                if (((Integer) entry.getValue()).intValue() < currentTime - 30) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add((Long) entry.getKey());
                }
            }
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj = arrayList3.get(i21);
                    i21++;
                    r12.Z.remove((Long) obj);
                }
                i0.g3(new ak(r12, 16));
            }
        }
        if (r12.f19302z0.size() != 0) {
            int i22 = 0;
            while (i22 < r12.f19302z0.size()) {
                long keyAt = r12.f19302z0.keyAt(i22);
                if (r12.f19302z0.valueAt(i22) < System.currentTimeMillis() / j10) {
                    r12.f19302z0.delete(keyAt);
                    i22--;
                    if (r12.A0.h(keyAt) >= 0) {
                        r12.H0(keyAt);
                    }
                }
                i22++;
            }
        }
        if (r12.B0.size() != 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() / j10;
            int i23 = 0;
            while (i23 < r12.B0.size()) {
                long keyAt2 = r12.B0.keyAt(i23);
                if (r12.B0.valueAt(i23) < elapsedRealtime2) {
                    if (r12.A0.h(keyAt2) >= 0) {
                        r12.B0.put(keyAt2, (int) (300 + elapsedRealtime2));
                    } else {
                        r12.B0.delete(keyAt2);
                        i23--;
                    }
                    TLRPC.TL_messages_getOnlines tL_messages_getOnlines = new TLRPC.TL_messages_getOnlines();
                    tL_messages_getOnlines.peer = r12.i1(-keyAt2);
                    r12.getConnectionsManager().sendRequest(tL_messages_getOnlines, new tj(r12, keyAt2, 12));
                }
                i23++;
            }
        }
        if (r12.V.isEmpty() && r12.f19086b0 == r12.V.size()) {
            j11 = currentTimeMillis;
            i12 = 1;
            j12 = 0;
        } else {
            ArrayList arrayList4 = new ArrayList(r12.V.keySet());
            int i24 = 0;
            int i25 = 0;
            while (i24 < arrayList4.size()) {
                Long l4 = (Long) arrayList4.get(i24);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) r12.V.get(l4);
                if (concurrentHashMap != null) {
                    ArrayList arrayList5 = new ArrayList(concurrentHashMap.keySet());
                    int i26 = i15;
                    while (i26 < arrayList5.size()) {
                        Integer num = (Integer) arrayList5.get(i26);
                        ArrayList arrayList6 = (ArrayList) concurrentHashMap.get(num);
                        long j17 = j14;
                        if (arrayList6 != null) {
                            int i27 = i15;
                            while (i27 < arrayList6.size()) {
                                np npVar = (np) arrayList6.get(i27);
                                if (npVar.f17328c instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                    i14 = 30000;
                                } else {
                                    i14 = 5900;
                                }
                                int i28 = i11;
                                int i29 = i26;
                                long j18 = currentTimeMillis;
                                if (npVar.f17326a + i14 < j18) {
                                    arrayList6.remove(npVar);
                                    i27--;
                                    i25 = i28;
                                }
                                i27++;
                                i11 = i28;
                                i26 = i29;
                                currentTimeMillis = j18;
                            }
                        }
                        long j19 = currentTimeMillis;
                        int i30 = i11;
                        int i31 = i26;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            i13 = i31;
                        } else {
                            concurrentHashMap.remove(num);
                            arrayList5.remove(i31);
                            i13 = i31 - 1;
                        }
                        i26 = i13 + 1;
                        j14 = j17;
                        i11 = i30;
                        currentTimeMillis = j19;
                        i15 = 0;
                    }
                }
                long j20 = currentTimeMillis;
                int i32 = i11;
                long j21 = j14;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    r12.V.remove(l4);
                    arrayList4.remove(i24);
                    i24--;
                }
                i24++;
                j14 = j21;
                i11 = i32;
                currentTimeMillis = j20;
                i15 = 0;
            }
            j11 = currentTimeMillis;
            i12 = i11;
            j12 = j14;
            r12.k5();
            if (i25 != 0) {
                i0.g3(new ak(r12, 17));
            }
        }
        if (t6.f21128o == i12 && Math.abs(j11 - wp.B8) >= 60) {
            i0.g3(r12.H2);
            wp.B8 = j11;
        }
        if (r12.getUserConfig().f15521j0 != null && Math.abs(j11 - wp.C8) >= 60) {
            i0.g3(r12.I2);
            wp.C8 = j11;
        }
        if (r12.f19169k2 != j12 && Math.abs(SystemClock.elapsedRealtime() - r12.f19169k2) >= 10800000) {
            PushListenerController.sendRegistrationToServer(uz.f18513f, uz.f18516g);
        }
        r12.getLocationController().t();
        r12.N(false);
        if (r12.F2 <= r12.getConnectionsManager().getCurrentTime() && !r12.E2 && r12.getUserConfig().p()) {
            r12.E2 = true;
            r12.getConnectionsManager().sendRequest(new TLRPC.TL_help_getTermsOfServiceUpdate(), new uj(r12, 3));
        }
    }

    public static void lambda$onUpdateConfig$21(int i10, TLRPC.TL_config tL_config) {
        i0.g3(new e4(6, wp.r1(org.telegram.messenger.c.a(i10).f15043a), tL_config));
    }

    public void lambda$sendRequestInternal$7(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j10);
        } else if (tLObject instanceof TLRPC.Updates) {
            CountDownLatch countDownLatch = KeepAliveJob.f14427a;
            Utilities.e.c(new f3(16));
            wp.r1(org.telegram.messenger.c.a(this.currentAccount).f15043a).L3((TLRPC.Updates) tLObject, false);
        }
        if (tLObject != null) {
            tLObject.freeResources();
        }
    }

    public void lambda$sendRequestInternal$8(org.telegram.tgnet.TLObject r17, int r18, long r19, org.telegram.tgnet.RequestDelegate r21, org.telegram.tgnet.RequestDelegateTimestamp r22, org.telegram.tgnet.QuickAckDelegate r23, org.telegram.tgnet.WriteToSocketDelegate r24, int r25, int r26, boolean r27, int r28, long r29, int r31, java.lang.String r32, int r33, long r34, long r36, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.ConnectionsManager.lambda$sendRequestInternal$8(org.telegram.tgnet.TLObject, int, long, org.telegram.tgnet.RequestDelegate, org.telegram.tgnet.RequestDelegateTimestamp, org.telegram.tgnet.QuickAckDelegate, org.telegram.tgnet.WriteToSocketDelegate, int, int, boolean, int, long, int, java.lang.String, int, long, long, int):void");
    }

    public static void lambda$sendRequestTyped$3(Executor executor, k20 k20Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new li.s(k20Var, tLObject, tL_error, 16));
        } else {
            k20Var.a(tLObject, tL_error);
        }
    }

    public void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, k20 k20Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().L3(updates, false);
        }
        if (executor != null) {
            executor.execute(new li.s(k20Var, updates, tL_error, 17));
        } else {
            k20Var.a(updates, tL_error);
        }
    }

    public void lambda$setIsUpdating$22(boolean z10) {
        if (this.isUpdating != z10) {
            this.isUpdating = z10;
            if (this.connectionState == 3) {
                at.f(org.telegram.messenger.c.a(this.currentAccount).f15043a).k(at.T1, new Object[0]);
            }
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

    public static native void native_sendRequest(int i10, long j10, int i11, int i12, int i13, boolean z10, int i14, int i15);

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
            vz.e(i12).h(i11, 6, i10);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void onBytesSent(int i10, int i11, int i12) {
        try {
            vz.e(org.telegram.messenger.c.a(i12).f15043a).j(i11, 6, i10);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void onCaptchaCheck(int i10, int i11, String str, String str2) {
        if (ks.e == null) {
            ks.e = new HashMap();
        }
        e3 e3Var = (e3) ks.e.get(Integer.valueOf(Objects.hash(Integer.valueOf(i10), str, str2)));
        if (e3Var != null) {
            e3Var.d.add(Integer.valueOf(i11));
            return;
        }
        ?? obj = new Object();
        HashSet hashSet = new HashSet();
        obj.d = hashSet;
        obj.f15535a = i10;
        obj.f15536b = str;
        obj.f15537c = str2;
        hashSet.add(Integer.valueOf(i11));
        Activity u02 = i0.u0();
        if (u02 == null) {
            f8.d("CaptchaController: no activity found");
            obj.a("RECAPTCHA_FAILED_NO_ACTIVITY");
            return;
        }
        Recaptcha.getTasksClient(u02.getApplication(), str2).addOnSuccessListener(new c3(str, str2, obj, 0)).addOnFailureListener(new d3(obj, 0));
    }

    public static void onConnectionStateChanged(int i10, int i11) {
        i0.g3(new ud(i11, i10, 3));
    }

    public static void onIntegrityCheckClassic(int i10, int i11, String str, String str2) {
        i0.g3(new a0(i10, i11, str, str2));
    }

    public static void onInternalPushReceived(int i10) {
        CountDownLatch countDownLatch = KeepAliveJob.f14427a;
        Utilities.e.c(new f3(17));
    }

    public static void onLogout(int i10) {
        i0.g3(new xd(i10, 8));
    }

    public static void onPremiumFloodWait(int i10, int i11, boolean z10) {
        i0.g3(new b(i10, i11, 0, z10));
    }

    public static void onProxyError() {
        i0.g3(new Object());
    }

    public static void onRequestClear(int i10, int i11, boolean z10) {
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11));
            if (z10) {
                if (requestCallbacks != null) {
                    Runnable runnable = requestCallbacks.onCancelled;
                    if (runnable != null) {
                        runnable.run();
                    }
                    connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
                }
            } else if (requestCallbacks != null) {
                connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
            }
        }
    }

    public static void onRequestComplete(int i10, int i11, long j10, int i12, String str, int i13, long j11, long j12, int i14) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11));
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
            if (requestCallbacks != null && (requestDelegateInternal = requestCallbacks.onComplete) != null) {
                requestDelegateInternal.run(j10, i12, str, i13, j11, j12, i14);
            }
        }
    }

    public static void onRequestNewServerIpAndPort(int i10, int i11) {
        Utilities.e.c(new ud(i10, i11, 2));
    }

    public static void onRequestQuickAck(int i10, int i11) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11))) != null && (quickAckDelegate = requestCallbacks.onQuickAck) != null) {
            quickAckDelegate.run();
        }
    }

    public static void onRequestWriteToSocket(int i10, int i11) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11))) != null && (writeToSocketDelegate = requestCallbacks.onWriteToSocket) != null) {
            writeToSocketDelegate.run();
        }
    }

    public static void onSessionCreated(int i10) {
        Utilities.d.c(new xd(i10, 7));
    }

    public static void onUnparsedMessageReceived(long j10, int i10, long j11) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j10);
            wrap.setDataSourceType(TLDataSourceType.NETWORK);
            wrap.reused = true;
            int readInt32 = wrap.readInt32(true);
            TLRPC.Updates TLdeserialize = TLRPC.Updates.TLdeserialize(wrap, readInt32, true);
            boolean z10 = f8.f15706j;
            boolean z11 = v2.f18578a;
            if (TLdeserialize != null) {
                if (v2.f18578a) {
                    f8.b("java received " + TLdeserialize);
                }
                CountDownLatch countDownLatch = KeepAliveJob.f14427a;
                Utilities.e.c(new f3(16));
                Utilities.d.c(new h(i10, TLdeserialize, 0));
            } else if (v2.f18578a) {
                f8.b(String.format("java received unknown constructor 0x%x", Integer.valueOf(readInt32)));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void onUpdate(int i10) {
        Utilities.d.c(new xd(i10, 6));
    }

    public static void onUpdateConfig(long j10, int i10) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j10);
            wrap.reused = true;
            TLRPC.TL_config TLdeserialize = TLRPC.TL_config.TLdeserialize(wrap, wrap.readInt32(true), true);
            if (TLdeserialize != null) {
                Utilities.d.c(new ag.d3(i10, TLdeserialize, 11));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i10, final int i11, final int i12, final boolean z10, final int i13) {
        long j10;
        int i14;
        if (v2.f18578a) {
            f8.b("send request " + tLObject + " with token = " + i13);
        }
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer);
            tLObject.freeResources();
            if ((i12 & 2) != 0) {
                j10 = System.currentTimeMillis();
            } else {
                j10 = 0;
            }
            final long j11 = j10;
            listen(i13, new RequestDelegateInternal() {
                @Override
                public final void run(long j12, int i15, String str, int i16, long j13, long j14, int i17) {
                    ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i12, j11, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i10, i11, z10, i13, j12, i15, str, i16, j13, j14, i17);
                }
            }, quickAckDelegate, writeToSocketDelegate);
            if ((i10 & 262144) != 0 && (i12 & 65535) == 2) {
                if (tLObject instanceof TLRPC.TL_upload_getFile) {
                    i14 = ((TLRPC.TL_upload_getFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getWebFile) {
                    i14 = ((TLRPC.TL_upload_getWebFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getCdnFile) {
                    i14 = ((TLRPC.TL_upload_getCdnFile) tLObject).limit;
                }
                native_sendRequest(this.currentAccount, nativeByteBuffer.address, i10, i11, i12, z10, i13, i14);
            }
            i14 = 0;
            native_sendRequest(this.currentAccount, nativeByteBuffer.address, i10, i11, i12, z10, i13, i14);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i10 = 0; i10 < 4; i10++) {
            native_setLangCode(i10, lowerCase);
        }
    }

    public static void setProxySettings(boolean z10, ji.b bVar) {
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        String str5 = "";
        if (z10 && bVar != null && bVar.f()) {
            String str6 = bVar.f10429b;
            int i12 = bVar.f10430c;
            String str7 = bVar.d;
            String str8 = bVar.e;
            String str9 = bVar.f10431f;
            if (bVar.f10428a == 3) {
                i10 = ji.k.o(str6, str9);
                if (i10 == 0) {
                    i10 = 9;
                }
                str2 = "";
                str3 = str9;
                str5 = "127.0.0.1";
                str = str2;
            } else {
                synchronized (ji.k.f10451y) {
                    try {
                        ji.k kVar = ji.k.f10452z;
                        if (kVar != null) {
                            kVar.q();
                            ji.k.f10452z = null;
                        }
                    } finally {
                    }
                }
                str5 = str6;
                i10 = i12;
                str = str7;
                str2 = str8;
                str3 = str9;
            }
        } else {
            ji.k.p();
            str = "";
            str2 = str;
            str3 = str2;
            i10 = 0;
        }
        int i13 = 0;
        while (i13 < 4) {
            if (z10 && bVar != null && bVar.f()) {
                str4 = str5;
                i11 = i13;
                native_setProxySettings(i11, str4, i10, str, str2, str3);
            } else {
                str4 = str5;
                i11 = i13;
                native_setProxySettings(i11, "", 1080, "", "", "");
            }
            int i14 = org.telegram.messenger.c.a(i11).f15043a;
            if (e20.i(i14).p()) {
                Utilities.d.c(new ak(wp.r1(i14), 25));
            }
            i13 = i11 + 1;
            str5 = str4;
        }
    }

    public static void setRegId(String str, int i10, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && i10 == 13) {
            str = sc.e.h("huawei://", str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            if (i10 == 2) {
                str3 = "FIREBASE";
            } else {
                str3 = "HUAWEI";
            }
            StringBuilder u10 = a1.g.u("__", str3, "_GENERATING_SINCE_");
            u10.append(getInstance(0).getCurrentTime());
            u10.append("__");
            str2 = u10.toString();
            uz.h = str2;
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
        Utilities.d.c(new a(this, i10, 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (v2.f18578a) {
            f8.b("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, w0.s(), w0.f(), w0.p());
    }

    public long checkProxy(ji.b bVar, RequestTimeDelegate requestTimeDelegate) {
        if (bVar != null && bVar.f()) {
            if (bVar.f10428a == 3) {
                ji.f fVar = ji.f.f10440f;
                if (fVar == null) {
                    synchronized (ji.f.class) {
                        try {
                            fVar = ji.f.f10440f;
                            if (fVar == null) {
                                fVar = new ji.f(0);
                                ji.f.f10440f = fVar;
                            }
                        } finally {
                        }
                    }
                }
                ji.f fVar2 = fVar;
                mg.l lVar = new mg.l(this, 5);
                if (bVar.f10428a == 3 && bVar.f() && requestTimeDelegate != null) {
                    i0.g3(new q0(fVar2, lVar, bVar, requestTimeDelegate, 7));
                    return 0L;
                } else if (requestTimeDelegate != null) {
                    requestTimeDelegate.run(-1L);
                    return 0L;
                }
            } else {
                return native_checkProxy(this.currentAccount, bVar.f10429b, bVar.f10430c, bVar.d, bVar.e, bVar.f10431f, requestTimeDelegate);
            }
        }
        return 0L;
    }

    public void cleanup(boolean z10) {
        native_cleanUp(this.currentAccount, z10);
    }

    public void discardConnection(int i10, int i11) {
        Utilities.d.c(new i2.u(this, i10, i11, 7));
    }

    public void failNotRunningRequest(int i10) {
        Utilities.d.c(new a(this, i10, 0));
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
        if (v2.f18578a) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback() && !nextElement.getInterfaceAddresses().isEmpty()) {
                        if (v2.f18578a) {
                            f8.b("valid interface: " + nextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                        for (int i10 = 0; i10 < interfaceAddresses.size(); i10++) {
                            InetAddress address = interfaceAddresses.get(i10).getAddress();
                            if (v2.f18578a) {
                                f8.b("address: " + address.getHostAddress());
                            }
                            if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress() && v2.f18578a) {
                                f8.b("address is good");
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
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
                    for (int i11 = 0; i11 < interfaceAddresses2.size(); i11++) {
                        InetAddress address2 = interfaceAddresses2.get(i11).getAddress();
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
                if (!this.forceTryIpV6) {
                    if (z11) {
                        return (byte) 2;
                    }
                    if (!z12) {
                    }
                }
                return (byte) 1;
            }
        } catch (Throwable th3) {
            f8.g(th3, true);
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
        String str10;
        String str11;
        Context context;
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("mainconfig", 0);
        ji.b c10 = ji.b.c(sharedPreferences);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && c10.f()) {
            if (c10.f10428a == 3) {
                int o10 = ji.k.o(c10.f10429b, c10.f10431f);
                int i14 = this.currentAccount;
                if (o10 == 0) {
                    o10 = 9;
                }
                native_setProxySettings(i14, "127.0.0.1", o10, "", "", c10.f10431f);
            } else {
                native_setProxySettings(this.currentAccount, c10.f10429b, c10.f10430c, c10.d, c10.e, c10.f10431f);
            }
        }
        try {
            context = w0.f18945b;
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
            str11 = w0.f18945b.getPackageName();
        } catch (Throwable unused3) {
            str11 = "";
        }
        native_init(this.currentAccount, i10, i11, i12, str, str2, str3, str4, str5, str6, str7, str8, str9, str12, str11 == null ? "" : str11, i13, j10, z10, z11, w0.s(), w0.f(), uz.v());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences e12 = wp.e1();
        if (e12.contains("pushConnection")) {
            return e12.getBoolean("pushConnection", true);
        }
        return wp.r1(e20.f15506s0).f7.getBoolean("backgroundConnection", false);
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

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i10, int i11, int i12, boolean z10) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$6(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10, andIncrement);
        return andIncrement;
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, k20 k20Var) {
        return sendRequestTyped(tLMethod, null, k20Var);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, k20 k20Var) {
        return sendRequestTypedAndProcessUpdates(tLMethod, executor, k20Var, Integer.MAX_VALUE, 0);
    }

    public void setAppPaused(boolean z10, boolean z11) {
        if (!z11) {
            this.appPaused = z10;
            if (v2.f18578a) {
                f8.b("app paused = " + z10);
            }
            if (z10) {
                this.appResumeCount--;
            } else {
                this.appResumeCount++;
            }
            if (v2.f18578a) {
                i0.a.p(this.appResumeCount, new StringBuilder("app resume count "));
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
            if (v2.f18578a) {
                f8.b("reset app pause time");
            }
            if (this.lastPauseTime != 0 && System.currentTimeMillis() - this.lastPauseTime > 5000) {
                i5 contactsController = getContactsController();
                contactsController.getClass();
                Utilities.e.c(new a5(contactsController, 4));
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
        i0.g3(new k2.v(7, this, z10));
    }

    public void setPushConnectionEnabled(boolean z10) {
        native_setPushConnectionEnabled(this.currentAccount, z10);
    }

    public void setUserId(long j10) {
        native_setUserId(this.currentAccount, j10);
    }

    public void switchBackend(boolean z10) {
        wp.d1().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z10);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public void cancelRequest(int i10, boolean z10, Runnable runnable) {
        Utilities.d.c(new p0(i10, 1, this, runnable, z10));
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i10) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i10, Integer.MAX_VALUE, 1, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, k20 k20Var) {
        return sendRequestTyped(tLMethod, executor, k20Var, Integer.MAX_VALUE, 0);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, k20 k20Var, int i10, int i11) {
        return sendRequestTyped(tLMethod, null, new e(this, executor, k20Var, 0), i10, i11);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i10, int i11) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i10, Integer.MAX_VALUE, i11, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, k20 k20Var, int i10) {
        return sendRequestTyped(tLMethod, executor, k20Var, Integer.MAX_VALUE, i10);
    }

    public int sendRequest(TLObject tLObject, RequestDelegateTimestamp requestDelegateTimestamp, int i10, int i11, int i12) {
        return sendRequest(tLObject, null, requestDelegateTimestamp, null, null, i10, i12, i11, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, final Executor executor, final k20 k20Var, int i10, int i11) {
        return sendRequest(tLMethod, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ConnectionsManager.lambda$sendRequestTyped$3(executor, k20Var, tLObject, tL_error);
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
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.this.lambda$sendRequest$6(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10, andIncrement);
            }
        });
        return andIncrement;
    }
}
