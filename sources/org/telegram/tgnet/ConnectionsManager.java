package org.telegram.tgnet;

import a8.p0;
import ai.m0;
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
import bi.k1;
import bi.r3;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import di.d2;
import fi.v5;
import hi.j2;
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
import l2.a0;
import l2.y;
import l2.z0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.b3;
import org.telegram.messenger.b4;
import org.telegram.messenger.c1;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.g9;
import org.telegram.messenger.hp;
import org.telegram.messenger.i7;
import org.telegram.messenger.id;
import org.telegram.messenger.ip;
import org.telegram.messenger.iz;
import org.telegram.messenger.jz;
import org.telegram.messenger.k4;
import org.telegram.messenger.n6;
import org.telegram.messenger.oj;
import org.telegram.messenger.p10;
import org.telegram.messenger.pj;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.rj;
import org.telegram.messenger.t0;
import org.telegram.messenger.tk;
import org.telegram.messenger.v10;
import org.telegram.messenger.vj;
import org.telegram.messenger.voip.k0;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.messenger.z2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.ce0;
import org.telegram.ui.jo0;
public class ConnectionsManager extends c1 {
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

        public GoogleDnsLoadTask(int i7) {
            this.currentAccount = i7;
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
            a8.b("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i7 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i7, nativeByteBuffer.address, p10.i(org.telegram.messenger.c.a(i7).f21765a).d(), this.responseDate);
                return;
            }
            if (r2.f25212a) {
                a8.b("failed to get google result");
                a8.b("start mozilla task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(this.currentAccount);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            a8.b("4. currentTask = mozilla");
            AsyncTask unused2 = ConnectionsManager.currentTask = mozillaDnsLoadTask;
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            int read;
            boolean z9 = false;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : qp.s1(org.telegram.messenger.c.a(this.currentAccount).f21765a).M3;
                int nextInt = Utilities.f21334b.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i7 = 0; i7 < nextInt; i7++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.f21334b.nextInt(62)));
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
                            } catch (Throwable th2) {
                                a8.g(th2, true);
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
                                z9 = true;
                            }
                            a8.g(th, z9);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    a8.g(th4, true);
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
                                    a8.g(th5, true);
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
            Utilities.d.c(new j(this, nativeByteBuffer, 0));
        }
    }

    public interface INativeTlTest {
        boolean test(long j3);
    }

    public static class MozillaDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public MozillaDnsLoadTask(int i7) {
            this.currentAccount = i7;
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
            a8.b("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i7 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i7, nativeByteBuffer.address, p10.i(org.telegram.messenger.c.a(i7).f21765a).d(), this.responseDate);
            } else if (r2.f25212a) {
                a8.b("failed to get mozilla txt result");
            }
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            int read;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : qp.s1(org.telegram.messenger.c.a(this.currentAccount).f21765a).M3;
                int nextInt = Utilities.f21334b.nextInt(116) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i7 = 0; i7 < nextInt; i7++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.f21334b.nextInt(62)));
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
                        } catch (Throwable th3) {
                            a8.g(th3, true);
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
                        a8.g(th, false);
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
                                a8.g(th5, true);
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
            Utilities.d.c(new j(this, nativeByteBuffer, 1));
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

        public void addAddress(long j3) {
            if (this.addresses.contains(Long.valueOf(j3))) {
                return;
            }
            this.addresses.add(Long.valueOf(j3));
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
                            for (int i7 = 0; i7 < length; i7++) {
                                arrayList.add(jSONArray.getJSONObject(i7).getString("data"));
                            }
                            ResolvedDomain resolvedDomain = new ResolvedDomain(arrayList, SystemClock.elapsedRealtime());
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                a8.g(th2, false);
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
                            a8.g(th3, false);
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                            return null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            a8.g(th, false);
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
                                a8.g(e10, false);
                                return null;
                            }
                        } finally {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th5) {
                                    a8.g(th5, false);
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
            int i7 = 0;
            if (resolvedDomain != null) {
                ConnectionsManager.dnsCache.put(this.currentHostName, resolvedDomain);
                int size = this.addresses.size();
                while (i7 < size) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i7).longValue(), resolvedDomain.getAddress());
                    i7++;
                }
            } else {
                int size2 = this.addresses.size();
                while (i7 < size2) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i7).longValue(), "");
                    i7++;
                }
            }
            ConnectionsManager.resolvingHostnameTasks.remove(this.currentHostName);
        }
    }

    public static class ResolvedDomain {
        public ArrayList<String> addresses;
        long ttl;

        public ResolvedDomain(ArrayList<String> arrayList, long j3) {
            this.addresses = arrayList;
            this.ttl = j3;
        }

        public String getAddress() {
            ArrayList<String> arrayList = this.addresses;
            return arrayList.get(Utilities.f21334b.nextInt(arrayList.size()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        CORE_POOL_SIZE = max;
        int i7 = (availableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i7;
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
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i7, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    public ConnectionsManager(int i7) {
        super(i7);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        SharedPreferences sharedPreferences;
        int i10;
        String str8;
        int i11;
        File P0;
        String str9 = "";
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File h = t0.h();
        if (i7 != 0) {
            File file = new File(h, jg.g.j(i7, "account"));
            file.mkdirs();
            h = file;
        }
        String file2 = h.toString();
        boolean isPushConnectionEnabled = isPushConnectionEnabled();
        try {
            str4 = id.Q0().toLowerCase();
            str5 = id.J0().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = t0.f25566b.getPackageManager().getPackageInfo(t0.f25566b.getPackageName(), 0);
            boolean z9 = r2.f25212a;
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
        Typeface typeface = g0.f22535a;
        try {
            byte[] encoded = ((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(t0.f25566b.getPackageManager().getPackageInfo(t0.f25566b.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded();
            Pattern pattern = Utilities.f21333a;
            str7 = Utilities.f(Utilities.o(encoded.length, encoded));
        } catch (Throwable unused2) {
            str7 = "";
        }
        int dSTSavings = (TimeZone.getDefault().getDSTSavings() + TimeZone.getDefault().getRawOffset()) / 1000;
        if (this.currentAccount == 0) {
            sharedPreferences = t0.f25566b.getSharedPreferences("mainconfig", 0);
        } else {
            sharedPreferences = t0.f25566b.getSharedPreferences("mainconfig" + this.currentAccount, 0);
        }
        this.forceTryIpV6 = sharedPreferences.getBoolean("forceTryIpV6", false);
        boolean z10 = getUserConfig().f() != null ? getUserConfig().f().premium : false;
        int d = iz.d();
        String str12 = str10;
        int i12 = r2.d;
        boolean z11 = a8.f21395j;
        if (r2.f25212a) {
            try {
                P0 = g0.P0();
            } catch (Throwable th2) {
                th = th2;
                i10 = d;
            }
            if (P0 != null) {
                a8 j3 = a8.j();
                StringBuilder sb2 = new StringBuilder();
                i10 = d;
                try {
                    str8 = str11;
                    i11 = i12;
                    try {
                        sb2.append(a8.j().f21400c.format(System.currentTimeMillis()));
                        sb2.append("_net.txt");
                        j3.f21402f = new File(P0, sb2.toString());
                        str9 = a8.j().f21402f.getAbsolutePath();
                    } catch (Throwable th3) {
                        th = th3;
                        th.printStackTrace();
                        init(i10, 233, i11, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z10, isPushConnectionEnabled);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str8 = str11;
                    i11 = i12;
                    th.printStackTrace();
                    init(i10, 233, i11, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z10, isPushConnectionEnabled);
                }
                init(i10, 233, i11, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z10, isPushConnectionEnabled);
            }
        }
        i10 = d;
        str8 = str11;
        i11 = i12;
        init(i10, 233, i11, str8, str, str6, str5, str12, file2, str9, regId, str7, dSTSavings, getUserConfig().e(), z10, isPushConnectionEnabled);
    }

    public void checkWebProxyInternal(ui.a aVar, int i7, RequestTimeDelegate requestTimeDelegate) {
        native_checkProxy(this.currentAccount, "127.0.0.1", i7, "", "", aVar.f56919f, requestTimeDelegate);
    }

    public static int generateClassGuid() {
        int i7 = lastClassGuid;
        lastClassGuid = i7 + 1;
        return i7;
    }

    public static void getHostByName(String str, long j3) {
        g0.h3(new r3(str, j3, 18));
    }

    public static int getInitFlags() {
        if (n6.h(t0.f25566b).f()) {
            if (r2.f25212a) {
                a8.b("detected emu");
                return 1024;
            }
            return 1024;
        }
        return 0;
    }

    public static ConnectionsManager getInstance(int i7) {
        ConnectionsManager connectionsManager;
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager2 = connectionsManagerArr[i7];
        if (connectionsManager2 == null) {
            synchronized (ConnectionsManager.class) {
                try {
                    connectionsManager = connectionsManagerArr[i7];
                    if (connectionsManager == null) {
                        connectionsManager = new ConnectionsManager(i7);
                        connectionsManagerArr[i7] = connectionsManager;
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
        String str2 = iz.f23402g;
        if (!TextUtils.isEmpty(str2) && iz.f23399f == 13) {
            str2 = rf.b.i("huawei://", str2);
        }
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(iz.h)) {
            str2 = iz.h;
        }
        if (TextUtils.isEmpty(str2)) {
            if (iz.f23399f == 2) {
                str = "FIREBASE";
            } else {
                str = "HUAWEI";
            }
            StringBuilder u10 = p0.u("__", str, "_GENERATING_SINCE_");
            u10.append(getCurrentTime());
            u10.append("__");
            String sb2 = u10.toString();
            iz.h = sb2;
            return sb2;
        }
        return str2;
    }

    public void lambda$cancelRequest$10(Runnable runnable, int i7, boolean z9) {
        if (runnable != null) {
            listenCancel(i7, new d2(3, runnable));
        }
        native_cancelRequest(this.currentAccount, i7, z9);
    }

    public static void lambda$cancelRequest$9(Runnable runnable) {
        Utilities.d.c(runnable);
    }

    public void lambda$cancelRequestsForGuid$11(int i7) {
        native_cancelRequestsForGuid(this.currentAccount, i7);
    }

    public void lambda$discardConnection$0(int i7, int i10) {
        native_discardConnection(this.currentAccount, i7, i10);
    }

    public void lambda$failNotRunningRequest$1(int i7) {
        native_failNotRunningRequest(this.currentAccount, i7);
    }

    public static void lambda$getHostByName$20(String str, long j3) {
        ResolvedDomain resolvedDomain = dnsCache.get(str);
        if (resolvedDomain != null && SystemClock.elapsedRealtime() - resolvedDomain.ttl < 300000) {
            native_onHostNameResolved(str, j3, resolvedDomain.getAddress());
            return;
        }
        ResolveHostByNameTask resolveHostByNameTask = resolvingHostnameTasks.get(str);
        if (resolveHostByNameTask == null) {
            resolveHostByNameTask = new ResolveHostByNameTask(str);
            try {
                resolveHostByNameTask.executeOnExecutor(DNS_THREAD_POOL_EXECUTOR, null, null, null);
                resolvingHostnameTasks.put(str, resolveHostByNameTask);
            } catch (Throwable th2) {
                a8.g(th2, true);
                native_onHostNameResolved(str, j3, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j3);
    }

    public static void lambda$onCaptchaCheck$28(final int i7, final int i10, final int i11, final String str, String str2) {
        final b3 b3Var = new b3(i7, i10, i11);
        Activity u02 = g0.u0();
        if (u02 == null) {
            a8.d("CaptchaController: no activity found");
            b3.a(b3Var, "RECAPTCHA_FAILED_NO_ACTIVITY");
            return;
        }
        Recaptcha.getTasksClient(u02.getApplication(), str2).addOnSuccessListener(new OnSuccessListener() {
            @Override
            public final void onSuccess(Object obj) {
                RecaptchaAction recaptchaAction;
                RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
                String str3 = str;
                str3.getClass();
                char c10 = 65535;
                switch (str3.hashCode()) {
                    case -1849137896:
                        if (str3.equals("SIGNUP")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -902467304:
                        if (str3.equals("signup")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 72611657:
                        if (str3.equals("LOGIN")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 103149417:
                        if (str3.equals("login")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
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
                final int i12 = i7;
                final int i13 = i10;
                final int i14 = i11;
                final b3 b3Var2 = b3Var;
                executeTask.addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public final void onSuccess(Object obj2) {
                        String str4;
                        String str5 = (String) obj2;
                        if (r2.f25212a) {
                            int i15 = 0;
                            if (str5 == null) {
                                str4 = "null";
                            } else {
                                str4 = str5.substring(0, Math.min(24, str5.length())) + "...";
                            }
                            StringBuilder o4 = jg.g.o("CaptchaController: got token for account=", i12, ", request=", i13, ", generation=");
                            o4.append(i14);
                            o4.append(", token=");
                            o4.append(str4);
                            o4.append(", length=");
                            if (str5 != null) {
                                i15 = str5.length();
                            }
                            jg.g.s(i15, o4);
                        }
                        b3 b3Var3 = b3Var2;
                        if (str5 == null) {
                            b3.a(b3Var3, "RECAPTCHA_FAILED_TOKEN_NULL");
                        } else {
                            b3.a(b3Var3, str5);
                        }
                    }
                }).addOnFailureListener(new z2(b3Var2, 1));
            }
        }).addOnFailureListener(new z2(b3Var, 0));
    }

    public static void lambda$onConnectionStateChanged$15(int i7, int i10) {
        getInstance(i7).connectionState = i10;
        qs.f(org.telegram.messenger.c.a(i7).f21765a).k(qs.T1, new Object[0]);
    }

    public static void lambda$onIntegrityCheckClassic$25(int i7, long j3, int i10, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder n10 = jg.g.n(i7, "account", ": integrity check gave null token in ");
            n10.append(System.currentTimeMillis() - j3);
            n10.append("ms");
            a8.d(n10.toString());
            native_receivedIntegrityCheckClassic(i7, i10, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        a8.b("account" + i7 + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j3) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i7, i10, str, str2);
        } catch (Exception e10) {
            a8.e("receivedIntegrityCheckClassic failed", e10);
        }
    }

    public static void lambda$onIntegrityCheckClassic$26(int i7, long j3, int i10, String str, Exception exc) {
        StringBuilder n10 = jg.g.n(i7, "account", ": integrity check failed to give a token in ");
        n10.append(System.currentTimeMillis() - j3);
        n10.append("ms");
        a8.e(n10.toString(), exc);
        native_receivedIntegrityCheckClassic(i7, i10, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + ce0.x1(exc));
    }

    public static void lambda$onIntegrityCheckClassic$27(int i7, String str, String str2, int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("account");
        sb2.append(i7);
        sb2.append(": server requests integrity classic check with project = ");
        sb2.append(str);
        sb2.append(" nonce = ");
        f1.u(str2, sb2);
        try {
            IntegrityManagerFactory.create(t0.f25566b).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new f(i7, currentTimeMillis, str2, i10)).addOnFailureListener(new f(i7, currentTimeMillis, str2, i10));
        } catch (Exception unused) {
            a8.b("account" + i7 + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i7, i10, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    public static void lambda$onLogout$16(int i7) {
        int i10 = org.telegram.messenger.c.a(i7).f21765a;
        if (p10.i(i10).e() != 0) {
            p10.i(i10).b();
            qp.s1(i10).A3(0);
        }
    }

    public static void lambda$onPremiumFloodWait$23(boolean z9, int i7, int i10) {
        boolean z10;
        i7 i7Var = null;
        y8 y8Var = null;
        if (z9) {
            Iterator it = w7.G(i7).h.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                y8 y8Var2 = (y8) it.next();
                if (y8Var2 != null && y8Var2.f26613q.contains(Integer.valueOf(i10))) {
                    y8Var = y8Var2;
                    break;
                }
            }
            if (y8Var != null) {
                z10 = !y8Var.T;
                y8Var.T = true;
            }
            z10 = false;
        } else {
            Iterator it2 = w7.G(i7).f26271w.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                i7 i7Var2 = (i7) it2.next();
                if (i7Var2 != null && i7Var2.F0.contains(Integer.valueOf(i10))) {
                    i7Var = i7Var2;
                    break;
                }
            }
            if (i7Var != null) {
                z10 = !i7Var.f23097l;
                i7Var.f23097l = true;
            }
            z10 = false;
        }
        if (z10) {
            qs.f(i7).k(qs.f25080t3, new Object[0]);
        }
    }

    public static void lambda$onPremiumFloodWait$24(int i7, boolean z9, int i10) {
        if (p10.f24470s0 != i7) {
            return;
        }
        g0.h3(new b(z9, i7, i10));
    }

    public static void lambda$onProxyError$19() {
        qs.e().k(qs.M0, 3);
    }

    public static void lambda$onRequestNewServerIpAndPort$17(int i7, boolean z9, int i10) {
        a8.b("13. currentTask == " + currentTask);
        if (currentTask == null && ((i7 != 0 || Math.abs(lastDnsRequestTime - System.currentTimeMillis()) >= 10000) && z9)) {
            lastDnsRequestTime = System.currentTimeMillis();
            if (i7 == 2) {
                if (r2.f25212a) {
                    a8.b("start mozilla txt task");
                }
                MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i10);
                mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                a8.b("9. currentTask = mozilla");
                currentTask = mozillaDnsLoadTask;
                return;
            }
            if (r2.f25212a) {
                a8.b("start google txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i10);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            a8.b("11. currentTask = dnstxt");
            currentTask = googleDnsLoadTask;
        } else if (r2.f25212a) {
            a8.b("don't start task, current task = " + currentTask + " next task = " + i7 + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + t0.s());
        }
    }

    public static void lambda$onRequestNewServerIpAndPort$18(int i7, int i10) {
        Utilities.d.c(new b(i7, i10, 2, t0.s()));
    }

    public static void lambda$onSessionCreated$14(int i7) {
        qp.s1(org.telegram.messenger.c.a(i7).f21765a).X0();
    }

    public static void lambda$onUnparsedMessageReceived$12(int i7, TLRPC.Updates updates) {
        qp.s1(org.telegram.messenger.c.a(i7).f21765a).O3(updates, false);
    }

    public static void lambda$onUpdate$13(int i7) {
        int i10;
        long j3;
        long j10;
        int i11;
        long j11;
        int i12;
        int i13;
        boolean z9;
        qp s12 = qp.s1(org.telegram.messenger.c.a(i7).f21765a);
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        s12.I(false);
        ArrayList arrayList = s12.R1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = s12.P1;
        int size = arrayList2.size();
        int i15 = 0;
        while (true) {
            i10 = 1;
            if (i15 >= size) {
                break;
            }
            ip ipVar = (ip) arrayList2.get(i15);
            if (ipVar.f23352f <= elapsedRealtime) {
                s12.R(ipVar);
                arrayList2.remove(i15);
                s12.Q1.l(ipVar.f23348a);
                i15--;
                size--;
            }
            i15++;
        }
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            ip ipVar2 = (ip) arrayList.get(i16);
            if (ipVar2.f23352f <= elapsedRealtime) {
                s12.R(ipVar2);
                arrayList.remove(i16);
                s12.S1.remove(ipVar2.f23348a + "_" + ipVar2.f23349b);
                i16 += -1;
                size2 += -1;
            }
            i16++;
        }
        long j12 = 1000;
        long j13 = 0;
        if (s12.getUserConfig().p()) {
            if (!s12.f24793g7 && s12.getConnectionsManager().getPauseTime() == 0 && t0.f25573w && !t0.E) {
                if (t0.G != 0 && Math.abs(t0.G - System.currentTimeMillis()) > 1000 && s12.L2 != 1 && (s12.J2 == 0 || Math.abs(System.currentTimeMillis() - s12.J2) >= 55000 || s12.M2)) {
                    s12.L2 = 1;
                    if (s12.K2 != 0) {
                        s12.getConnectionsManager().cancelRequest(s12.K2, true);
                    }
                    TL_account.updateStatus updatestatus = new TL_account.updateStatus();
                    updatestatus.offline = false;
                    s12.K2 = s12.getConnectionsManager().sendRequest(updatestatus, new rj(s12, 9));
                }
            } else if (s12.L2 != 2 && !s12.M2 && Math.abs(System.currentTimeMillis() - s12.getConnectionsManager().getPauseTime()) >= 2000) {
                s12.L2 = 2;
                if (s12.K2 != 0) {
                    s12.getConnectionsManager().cancelRequest(s12.K2, true);
                }
                TL_account.updateStatus updatestatus2 = new TL_account.updateStatus();
                updatestatus2.offline = true;
                s12.K2 = s12.getConnectionsManager().sendRequest(updatestatus2, new rj(s12, 10));
            }
            if (s12.W0.m() != 0) {
                for (int i17 = 0; i17 < s12.W0.m(); i17++) {
                    long j14 = s12.W0.j(i17);
                    if (Math.abs(currentTimeMillis - s12.X0.valueAt(i17)) >= 1500) {
                        if (r2.f25212a) {
                            a8.b("QUEUE CHANNEL " + j14 + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        }
                        s12.F3(0, j14);
                    }
                }
            }
            for (int i18 = 0; i18 < 3; i18++) {
                if (s12.Z1(i18) != 0 && Math.abs(currentTimeMillis - s12.Z1(i18)) >= 1500) {
                    if (r2.f25212a) {
                        a8.b(i18 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    s12.P3(i18, 0);
                }
            }
        }
        int currentTime = s12.getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - s12.M0) >= 5000) {
            s12.M0 = System.currentTimeMillis();
            if (s12.J0.m() != 0) {
                int i19 = 0;
                while (i19 < s12.J0.m()) {
                    long j15 = s12.J0.j(i19);
                    TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = new TLRPC.TL_messages_getMessagesViews();
                    tL_messages_getMessagesViews.peer = s12.j1(j15);
                    tL_messages_getMessagesViews.f27054id = (ArrayList) s12.J0.n(i19);
                    if (i19 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    tL_messages_getMessagesViews.increment = z9;
                    s12.getConnectionsManager().sendRequest(tL_messages_getMessagesViews, new oj(s12, j15, tL_messages_getMessagesViews, 3));
                    i19++;
                    j12 = j12;
                }
                j3 = j12;
                s12.J0.b();
            } else {
                j3 = 1000;
            }
            if (s12.L0 > 0) {
                g0.h3(new tk(s12, currentTime, 2));
            }
        } else {
            j3 = 1000;
        }
        if (!s12.Z.isEmpty()) {
            ArrayList arrayList3 = null;
            for (Map.Entry entry : s12.Z.entrySet()) {
                if (((Integer) entry.getValue()).intValue() < currentTime - 30) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add((Long) entry.getKey());
                }
            }
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj = arrayList3.get(i20);
                    i20++;
                    s12.Z.remove((Long) obj);
                }
                g0.h3(new vj(s12, 18));
            }
        }
        if (s12.f24954z0.size() != 0) {
            int i21 = 0;
            while (i21 < s12.f24954z0.size()) {
                long keyAt = s12.f24954z0.keyAt(i21);
                if (s12.f24954z0.valueAt(i21) < System.currentTimeMillis() / j3) {
                    s12.f24954z0.delete(keyAt);
                    i21--;
                    if (s12.A0.h(keyAt) >= 0) {
                        s12.I0(keyAt);
                    }
                }
                i21++;
            }
        }
        if (s12.B0.size() != 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() / j3;
            int i22 = 0;
            while (i22 < s12.B0.size()) {
                long keyAt2 = s12.B0.keyAt(i22);
                if (s12.B0.valueAt(i22) < elapsedRealtime2) {
                    if (s12.A0.h(keyAt2) >= 0) {
                        s12.B0.put(keyAt2, (int) (300 + elapsedRealtime2));
                    } else {
                        s12.B0.delete(keyAt2);
                        i22--;
                    }
                    TLRPC.TL_messages_getOnlines tL_messages_getOnlines = new TLRPC.TL_messages_getOnlines();
                    tL_messages_getOnlines.peer = s12.j1(-keyAt2);
                    s12.getConnectionsManager().sendRequest(tL_messages_getOnlines, new pj(s12, keyAt2, 12));
                }
                i22++;
            }
        }
        if (s12.V.isEmpty() && s12.f24739b0 == s12.V.size()) {
            j10 = currentTimeMillis;
            i11 = 1;
            j11 = 0;
        } else {
            ArrayList arrayList4 = new ArrayList(s12.V.keySet());
            int i23 = 0;
            int i24 = 0;
            while (i23 < arrayList4.size()) {
                Long l10 = (Long) arrayList4.get(i23);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s12.V.get(l10);
                if (concurrentHashMap != null) {
                    ArrayList arrayList5 = new ArrayList(concurrentHashMap.keySet());
                    int i25 = i14;
                    while (i25 < arrayList5.size()) {
                        Integer num = (Integer) arrayList5.get(i25);
                        ArrayList arrayList6 = (ArrayList) concurrentHashMap.get(num);
                        long j16 = j13;
                        if (arrayList6 != null) {
                            int i26 = i14;
                            while (i26 < arrayList6.size()) {
                                hp hpVar = (hp) arrayList6.get(i26);
                                if (hpVar.f22950c instanceof TLRPC.TL_sendMessageGamePlayAction) {
                                    i13 = 30000;
                                } else {
                                    i13 = 5900;
                                }
                                int i27 = i10;
                                int i28 = i25;
                                long j17 = currentTimeMillis;
                                if (hpVar.f22948a + i13 < j17) {
                                    arrayList6.remove(hpVar);
                                    i26--;
                                    i24 = i27;
                                }
                                i26++;
                                i10 = i27;
                                i25 = i28;
                                currentTimeMillis = j17;
                            }
                        }
                        long j18 = currentTimeMillis;
                        int i29 = i10;
                        int i30 = i25;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            i12 = i30;
                        } else {
                            concurrentHashMap.remove(num);
                            arrayList5.remove(i30);
                            i12 = i30 - 1;
                        }
                        i25 = i12 + 1;
                        j13 = j16;
                        i10 = i29;
                        currentTimeMillis = j18;
                        i14 = 0;
                    }
                }
                long j19 = currentTimeMillis;
                int i31 = i10;
                long j20 = j13;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    s12.V.remove(l10);
                    arrayList4.remove(i23);
                    i23--;
                }
                i23++;
                j13 = j20;
                i10 = i31;
                currentTimeMillis = j19;
                i14 = 0;
            }
            j10 = currentTimeMillis;
            i11 = i10;
            j11 = j13;
            s12.n5();
            if (i24 != 0) {
                g0.h3(new vj(s12, 19));
            }
        }
        if (k6.f28046o == i11 && Math.abs(j10 - qp.A8) >= 60) {
            g0.h3(s12.H2);
            qp.A8 = j10;
        }
        if (s12.getUserConfig().f24486j0 != null && Math.abs(j10 - qp.B8) >= 60) {
            g0.h3(s12.I2);
            qp.B8 = j10;
        }
        if (s12.f24821k2 != j11 && Math.abs(SystemClock.elapsedRealtime() - s12.f24821k2) >= 10800000) {
            PushListenerController.sendRegistrationToServer(iz.f23399f, iz.f23402g);
        }
        s12.getLocationController().t();
        s12.N(false);
        if (s12.F2 <= s12.getConnectionsManager().getCurrentTime() && !s12.E2 && s12.getUserConfig().p()) {
            s12.E2 = true;
            s12.getConnectionsManager().sendRequest(new TLRPC.TL_help_getTermsOfServiceUpdate(), new rj(s12, 3));
        }
    }

    public static void lambda$onUpdateConfig$21(int i7, TLRPC.TL_config tL_config) {
        g0.h3(new b4(8, qp.s1(org.telegram.messenger.c.a(i7).f21765a), tL_config));
    }

    public void lambda$sendRequestInternal$7(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j3);
        } else if (tLObject instanceof TLRPC.Updates) {
            CountDownLatch countDownLatch = KeepAliveJob.f21238a;
            Utilities.f21336e.c(new m0(27));
            qp.s1(org.telegram.messenger.c.a(this.currentAccount).f21765a).O3((TLRPC.Updates) tLObject, false);
        }
        if (tLObject != null) {
            tLObject.freeResources();
        }
    }

    public void lambda$sendRequestInternal$8(org.telegram.tgnet.TLObject r17, int r18, long r19, org.telegram.tgnet.RequestDelegate r21, org.telegram.tgnet.RequestDelegateTimestamp r22, org.telegram.tgnet.QuickAckDelegate r23, org.telegram.tgnet.WriteToSocketDelegate r24, int r25, int r26, boolean r27, int r28, long r29, int r31, java.lang.String r32, int r33, long r34, long r36, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.ConnectionsManager.lambda$sendRequestInternal$8(org.telegram.tgnet.TLObject, int, long, org.telegram.tgnet.RequestDelegate, org.telegram.tgnet.RequestDelegateTimestamp, org.telegram.tgnet.QuickAckDelegate, org.telegram.tgnet.WriteToSocketDelegate, int, int, boolean, int, long, int, java.lang.String, int, long, long, int):void");
    }

    public static void lambda$sendRequestTyped$3(Executor executor, v10 v10Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new z0(v10Var, tLObject, tL_error, 16));
        } else {
            v10Var.a(tLObject, tL_error);
        }
    }

    public void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, v10 v10Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().O3(updates, false);
        }
        if (executor != null) {
            executor.execute(new z0(v10Var, updates, tL_error, 17));
        } else {
            v10Var.a(updates, tL_error);
        }
    }

    public void lambda$setIsUpdating$22(boolean z9) {
        if (this.isUpdating != z9) {
            this.isUpdating = z9;
            if (this.connectionState == 3) {
                qs.f(org.telegram.messenger.c.a(this.currentAccount).f21765a).k(qs.T1, new Object[0]);
            }
        }
    }

    private void listen(int i7, RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
        this.requestCallbacks.put(Integer.valueOf(i7), new RequestCallbacks(requestDelegateInternal, quickAckDelegate, writeToSocketDelegate));
    }

    private void listenCancel(int i7, Runnable runnable) {
        RequestCallbacks requestCallbacks = this.requestCallbacks.get(Integer.valueOf(i7));
        if (requestCallbacks != null) {
            requestCallbacks.onCancelled = runnable;
        }
    }

    public static native byte[] nativeTestGenerateClientHello(String str);

    public static native void native_applyDatacenterAddress(int i7, int i10, String str, int i11);

    public static native void native_applyDnsConfig(int i7, long j3, String str, int i10);

    public static native void native_bindRequestToGuid(int i7, int i10, int i11);

    public static native void native_cancelRequest(int i7, int i10, boolean z9);

    public static native void native_cancelRequestsForGuid(int i7, int i10);

    public static native long native_checkProxy(int i7, String str, int i10, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate);

    public static native void native_cleanUp(int i7, boolean z9);

    public static native void native_discardConnection(int i7, int i10, int i11);

    public static native void native_failNotRunningRequest(int i7, int i10);

    public static native int native_getConnectionState(int i7);

    public static native long native_getCurrentAuthKeyId(int i7);

    public static native int native_getCurrentDatacenterId(int i7);

    public static native int native_getCurrentPingTime(int i7);

    public static native int native_getCurrentTime(int i7);

    public static native long native_getCurrentTimeMillis(int i7);

    public static native int native_getTimeDifference(int i7);

    public static native void native_init(int i7, int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i13, long j3, boolean z9, boolean z10, boolean z11, int i14, int i15);

    public static native boolean native_isGoodPrime(byte[] bArr, int i7);

    public static native int native_isTestBackend(int i7);

    public static native void native_moveDatacenter(int i7, int i10);

    public static native void native_onHostNameResolved(String str, long j3, String str2);

    public static native void native_pauseNetwork(int i7);

    public static native void native_receivedCaptchaResult(int i7, int i10, int i11, String str);

    public static native void native_receivedIntegrityCheckClassic(int i7, int i10, String str, String str2);

    public static native void native_resumeNetwork(int i7, boolean z9);

    public static native void native_sendRequest(int i7, long j3, int i10, int i11, int i12, boolean z9, int i13, int i14);

    public static native void native_setIpStrategy(int i7, byte b10);

    public static native void native_setJava(boolean z9);

    public static native void native_setLangCode(int i7, String str);

    public static native void native_setNetworkAvailable(int i7, boolean z9, int i10, boolean z10);

    public static native void native_setProxySettings(int i7, String str, int i10, String str2, String str3, String str4);

    public static native void native_setPushConnectionEnabled(int i7, boolean z9);

    public static native void native_setRegId(int i7, String str);

    public static native void native_setSystemLangCode(int i7, String str);

    public static native void native_setUserId(int i7, long j3);

    public static native void native_switchBackend(int i7, boolean z9);

    public static native boolean native_test_AuthAuthorization(long j3);

    public static native void native_updateDcSettings(int i7);

    public static void onBytesReceived(int i7, int i10, int i11) {
        try {
            jz.e(i11).h(i10, 6, i7);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void onBytesSent(int i7, int i10, int i11) {
        try {
            jz.e(org.telegram.messenger.c.a(i11).f21765a).j(i10, 6, i7);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void onCaptchaCheck(int i7, int i10, int i11, String str, String str2) {
        g0.h3(new v5(i7, i10, i11, str, str2, 2));
    }

    public static void onConnectionStateChanged(int i7, int i10) {
        g0.h3(new g9(i10, i7, 4));
    }

    public static void onIntegrityCheckClassic(int i7, int i10, String str, String str2) {
        g0.h3(new a0(i7, i10, str, str2));
    }

    public static void onInternalPushReceived(int i7) {
        CountDownLatch countDownLatch = KeepAliveJob.f21238a;
        Utilities.f21336e.c(new m0(28));
    }

    public static void onLogout(int i7) {
        g0.h3(new j2(i7, 10));
    }

    public static void onPremiumFloodWait(int i7, int i10, boolean z9) {
        g0.h3(new b(i7, i10, 0, z9));
    }

    public static void onProxyError() {
        g0.h3(new Object());
    }

    public static void onRequestClear(int i7, int i10, boolean z9) {
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10));
            if (z9) {
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

    public static void onRequestComplete(int i7, int i10, long j3, int i11, String str, int i12, long j10, long j11, int i13) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager != null) {
            RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10));
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i10));
            if (requestCallbacks != null && (requestDelegateInternal = requestCallbacks.onComplete) != null) {
                requestDelegateInternal.run(j3, i11, str, i12, j10, j11, i13);
            }
        }
    }

    public static void onRequestNewServerIpAndPort(int i7, int i10) {
        Utilities.f21336e.c(new g9(i7, i10, 5));
    }

    public static void onRequestQuickAck(int i7, int i10) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10))) != null && (quickAckDelegate = requestCallbacks.onQuickAck) != null) {
            quickAckDelegate.run();
        }
    }

    public static void onRequestWriteToSocket(int i7, int i10) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager != null && (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10))) != null && (writeToSocketDelegate = requestCallbacks.onWriteToSocket) != null) {
            writeToSocketDelegate.run();
        }
    }

    public static void onSessionCreated(int i7) {
        Utilities.d.c(new j2(i7, 9));
    }

    public static void onUnparsedMessageReceived(long j3, int i7, long j10) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j3);
            wrap.setDataSourceType(TLDataSourceType.NETWORK);
            wrap.reused = true;
            int readInt32 = wrap.readInt32(true);
            TLRPC.Updates TLdeserialize = TLRPC.Updates.TLdeserialize(wrap, readInt32, true);
            boolean z9 = a8.f21395j;
            boolean z10 = r2.f25212a;
            if (TLdeserialize != null) {
                if (r2.f25212a) {
                    a8.b("java received " + TLdeserialize);
                }
                CountDownLatch countDownLatch = KeepAliveJob.f21238a;
                Utilities.f21336e.c(new m0(27));
                Utilities.d.c(new g(i7, TLdeserialize, 0));
            } else if (r2.f25212a) {
                a8.b(String.format("java received unknown constructor 0x%x", Integer.valueOf(readInt32)));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void onUpdate(int i7) {
        Utilities.d.c(new j2(i7, 8));
    }

    public static void onUpdateConfig(long j3, int i7) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j3);
            wrap.reused = true;
            TLRPC.TL_config TLdeserialize = TLRPC.TL_config.TLdeserialize(wrap, wrap.readInt32(true), true);
            if (TLdeserialize != null) {
                Utilities.d.c(new bg.m0(i7, TLdeserialize, 16));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i7, final int i10, final int i11, final boolean z9, final int i12) {
        long j3;
        int i13;
        if (r2.f25212a) {
            a8.b("send request " + tLObject + " with token = " + i12);
        }
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer);
            tLObject.freeResources();
            if ((i11 & 2) != 0) {
                j3 = System.currentTimeMillis();
            } else {
                j3 = 0;
            }
            final long j10 = j3;
            listen(i12, new RequestDelegateInternal() {
                @Override
                public final void run(long j11, int i14, String str, int i15, long j12, long j13, int i16) {
                    ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i11, j10, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i7, i10, z9, i12, j11, i14, str, i15, j12, j13, i16);
                }
            }, quickAckDelegate, writeToSocketDelegate);
            if ((i7 & 262144) != 0 && (i11 & 65535) == 2) {
                if (tLObject instanceof TLRPC.TL_upload_getFile) {
                    i13 = ((TLRPC.TL_upload_getFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getWebFile) {
                    i13 = ((TLRPC.TL_upload_getWebFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getCdnFile) {
                    i13 = ((TLRPC.TL_upload_getCdnFile) tLObject).limit;
                }
                native_sendRequest(this.currentAccount, nativeByteBuffer.address, i7, i10, i11, z9, i12, i13);
            }
            i13 = 0;
            native_sendRequest(this.currentAccount, nativeByteBuffer.address, i7, i10, i11, z9, i12, i13);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i7 = 0; i7 < 4; i7++) {
            native_setLangCode(i7, lowerCase);
        }
    }

    public static void setProxySettings(boolean z9, ui.a aVar) {
        String str;
        String str2;
        String str3;
        int i7;
        String str4;
        int i10;
        String str5 = "";
        if (z9 && aVar != null && aVar.g()) {
            String str6 = aVar.f56916b;
            int i11 = aVar.f56917c;
            String str7 = aVar.d;
            String str8 = aVar.f56918e;
            String str9 = aVar.f56919f;
            if (aVar.f56915a == 3) {
                i7 = ui.i.o(str6, str9);
                if (i7 == 0) {
                    i7 = 9;
                }
                str2 = "";
                str3 = str9;
                str5 = "127.0.0.1";
                str = str2;
            } else {
                synchronized (ui.i.f56939y) {
                    try {
                        ui.i iVar = ui.i.f56940z;
                        if (iVar != null) {
                            iVar.q();
                            ui.i.f56940z = null;
                        }
                    } finally {
                    }
                }
                str5 = str6;
                i7 = i11;
                str = str7;
                str2 = str8;
                str3 = str9;
            }
        } else {
            ui.i.p();
            str = "";
            str2 = str;
            str3 = str2;
            i7 = 0;
        }
        int i12 = 0;
        while (i12 < 4) {
            if (z9 && aVar != null && aVar.g()) {
                str4 = str5;
                i10 = i12;
                native_setProxySettings(i10, str4, i7, str, str2, str3);
            } else {
                str4 = str5;
                i10 = i12;
                native_setProxySettings(i10, "", 1080, "", "", "");
            }
            int i13 = org.telegram.messenger.c.a(i10).f21765a;
            if (p10.i(i13).p()) {
                Utilities.d.c(new vj(qp.s1(i13), 27));
            }
            i12 = i10 + 1;
            str5 = str4;
        }
    }

    public static void setRegId(String str, int i7, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && i7 == 13) {
            str = rf.b.i("huawei://", str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            if (i7 == 2) {
                str3 = "FIREBASE";
            } else {
                str3 = "HUAWEI";
            }
            StringBuilder u10 = p0.u("__", str3, "_GENERATING_SINCE_");
            u10.append(getInstance(0).getCurrentTime());
            u10.append("__");
            str2 = u10.toString();
            iz.h = str2;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            native_setRegId(i10, str2);
        }
    }

    public static void setSystemLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i7 = 0; i7 < 4; i7++) {
            native_setSystemLangCode(i7, lowerCase);
        }
    }

    public static boolean testNativeTlScheme(NativeByteBuffer nativeByteBuffer, INativeTlTest iNativeTlTest) {
        return iNativeTlTest.test(nativeByteBuffer.address);
    }

    public void applyDatacenterAddress(int i7, String str, int i10) {
        native_applyDatacenterAddress(this.currentAccount, i7, str, i10);
    }

    public void bindRequestToGuid(int i7, int i10) {
        if (i10 == 0) {
            return;
        }
        native_bindRequestToGuid(this.currentAccount, i7, i10);
    }

    public void cancelRequest(int i7, boolean z9) {
        cancelRequest(i7, z9, null);
    }

    public void cancelRequestsForGuid(int i7) {
        Utilities.d.c(new a(this, i7, 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (r2.f25212a) {
            a8.b("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, t0.s(), t0.f(), t0.p());
    }

    public long checkProxy(ui.a aVar, RequestTimeDelegate requestTimeDelegate) {
        if (aVar != null && aVar.g()) {
            if (aVar.f56915a == 3) {
                ui.e eVar = ui.e.f56928f;
                if (eVar == null) {
                    synchronized (ui.e.class) {
                        try {
                            eVar = ui.e.f56928f;
                            if (eVar == null) {
                                eVar = new ui.e(0);
                                ui.e.f56928f = eVar;
                            }
                        } finally {
                        }
                    }
                }
                ui.e eVar2 = eVar;
                y yVar = new y(this, 22);
                if (aVar.f56915a == 3 && aVar.g() && requestTimeDelegate != null) {
                    g0.h3(new jo0(eVar2, yVar, aVar, requestTimeDelegate, 29));
                    return 0L;
                } else if (requestTimeDelegate != null) {
                    requestTimeDelegate.run(-1L);
                    return 0L;
                }
            } else {
                return native_checkProxy(this.currentAccount, aVar.f56916b, aVar.f56917c, aVar.d, aVar.f56918e, aVar.f56919f, requestTimeDelegate);
            }
        }
        return 0L;
    }

    public void cleanup(boolean z9) {
        native_cleanUp(this.currentAccount, z9);
    }

    public void discardConnection(int i7, int i10) {
        Utilities.d.c(new jg.r(this, i7, i10, 8));
    }

    public void failNotRunningRequest(int i7) {
        Utilities.d.c(new a(this, i7, 0));
    }

    public int getConnectionState() {
        int i7 = this.connectionState;
        if (i7 == 3 && this.isUpdating) {
            return 5;
        }
        return i7;
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
        if (r2.f25212a) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback() && !nextElement.getInterfaceAddresses().isEmpty()) {
                        if (r2.f25212a) {
                            a8.b("valid interface: " + nextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                        for (int i7 = 0; i7 < interfaceAddresses.size(); i7++) {
                            InetAddress address = interfaceAddresses.get(i7).getAddress();
                            if (r2.f25212a) {
                                a8.b("address: " + address.getHostAddress());
                            }
                            if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress() && r2.f25212a) {
                                a8.b("address is good");
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (networkInterfaces2.hasMoreElements()) {
                NetworkInterface nextElement2 = networkInterfaces2.nextElement();
                if (nextElement2.isUp() && !nextElement2.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses2 = nextElement2.getInterfaceAddresses();
                    for (int i10 = 0; i10 < interfaceAddresses2.size(); i10++) {
                        InetAddress address2 = interfaceAddresses2.get(i10).getAddress();
                        if (!address2.isLinkLocalAddress() && !address2.isLoopbackAddress() && !address2.isMulticastAddress()) {
                            if (address2 instanceof Inet6Address) {
                                z9 = true;
                            } else if (address2 instanceof Inet4Address) {
                                if (!address2.getHostAddress().startsWith("192.0.0.")) {
                                    z11 = true;
                                } else {
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z9) {
                if (!this.forceTryIpV6) {
                    if (z10) {
                        return (byte) 2;
                    }
                    if (!z11) {
                    }
                }
                return (byte) 1;
            }
        } catch (Throwable th3) {
            a8.g(th3, true);
        }
        return (byte) 0;
    }

    public long getPauseTime() {
        return this.lastPauseTime;
    }

    public int getTimeDifference() {
        return native_getTimeDifference(this.currentAccount);
    }

    public void init(int i7, int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, long j3, boolean z9, boolean z10) {
        String str10;
        String str11;
        Context context;
        SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("mainconfig", 0);
        ui.a c10 = ui.a.c(sharedPreferences);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && c10.g()) {
            if (c10.f56915a == 3) {
                int o4 = ui.i.o(c10.f56916b, c10.f56919f);
                int i13 = this.currentAccount;
                if (o4 == 0) {
                    o4 = 9;
                }
                native_setProxySettings(i13, "127.0.0.1", o4, "", "", c10.f56919f);
            } else {
                native_setProxySettings(this.currentAccount, c10.f56916b, c10.f56917c, c10.d, c10.f56918e, c10.f56919f);
            }
        }
        try {
            context = t0.f25566b;
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
            str11 = t0.f25566b.getPackageName();
        } catch (Throwable unused3) {
            str11 = "";
        }
        native_init(this.currentAccount, i7, i10, i11, str, str2, str3, str4, str5, str6, str7, str8, str9, str12, str11 == null ? "" : str11, i12, j3, z9, z10, t0.s(), t0.f(), iz.v());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences f12 = qp.f1();
        if (f12.contains("pushConnection")) {
            return f12.getBoolean("pushConnection", true);
        }
        return qp.s1(p10.f24470s0).f24774e7.getBoolean("backgroundConnection", false);
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

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i7, int i10, int i11, boolean z9) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$6(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i7, i10, i11, z9, andIncrement);
        return andIncrement;
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, v10 v10Var) {
        return sendRequestTyped(tLMethod, null, v10Var);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, v10 v10Var) {
        return sendRequestTypedAndProcessUpdates(tLMethod, executor, v10Var, Integer.MAX_VALUE, 0);
    }

    public void setAppPaused(boolean z9, boolean z10) {
        if (!z10) {
            this.appPaused = z9;
            if (r2.f25212a) {
                a8.b("app paused = " + z9);
            }
            if (z9) {
                this.appResumeCount--;
            } else {
                this.appResumeCount++;
            }
            if (r2.f25212a) {
                jg.g.s(this.appResumeCount, new StringBuilder("app resume count "));
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
            if (r2.f25212a) {
                a8.b("reset app pause time");
            }
            if (this.lastPauseTime != 0 && System.currentTimeMillis() - this.lastPauseTime > 5000) {
                g5 contactsController = getContactsController();
                contactsController.getClass();
                Utilities.f21336e.c(new k4(contactsController, 3));
            }
            this.lastPauseTime = 0L;
            native_resumeNetwork(this.currentAccount, false);
        }
    }

    public void setDefaultDatacenterId(int i7) {
        native_moveDatacenter(this.currentAccount, i7);
    }

    public void setForceTryIpV6(boolean z9) {
        if (this.forceTryIpV6 != z9) {
            this.forceTryIpV6 = z9;
            checkConnection();
        }
    }

    public void setIsUpdating(boolean z9) {
        g0.h3(new k1(17, this, z9));
    }

    public void setPushConnectionEnabled(boolean z9) {
        native_setPushConnectionEnabled(this.currentAccount, z9);
    }

    public void setUserId(long j3) {
        native_setUserId(this.currentAccount, j3);
    }

    public void switchBackend(boolean z9) {
        qp.e1().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z9);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public void cancelRequest(int i7, boolean z9, Runnable runnable) {
        Utilities.d.c(new k0(i7, 1, this, runnable, z9));
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i7) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i7, Integer.MAX_VALUE, 1, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, v10 v10Var) {
        return sendRequestTyped(tLMethod, executor, v10Var, Integer.MAX_VALUE, 0);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, v10 v10Var, int i7, int i10) {
        return sendRequestTyped(tLMethod, null, new bi.t0(this, executor, v10Var, 2), i7, i10);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i7, int i10) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i7, Integer.MAX_VALUE, i10, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, v10 v10Var, int i7) {
        return sendRequestTyped(tLMethod, executor, v10Var, Integer.MAX_VALUE, i7);
    }

    public int sendRequest(TLObject tLObject, RequestDelegateTimestamp requestDelegateTimestamp, int i7, int i10, int i11) {
        return sendRequest(tLObject, null, requestDelegateTimestamp, null, null, i7, i11, i10, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, final Executor executor, final v10 v10Var, int i7, int i10) {
        return sendRequest(tLMethod, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ConnectionsManager.lambda$sendRequestTyped$3(executor, v10Var, tLObject, tL_error);
            }
        }, null, null, null, i10, i7, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, int i7) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, null, i7, Integer.MAX_VALUE, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i7, int i10, int i11, boolean z9) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i7, i10, i11, z9);
    }

    public int sendRequest(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i7, final int i10, final int i11, final boolean z9) {
        final int andIncrement = this.lastRequestToken.getAndIncrement();
        Utilities.d.c(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.this.lambda$sendRequest$6(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i7, i10, i11, z9, andIncrement);
            }
        });
        return andIncrement;
    }
}
