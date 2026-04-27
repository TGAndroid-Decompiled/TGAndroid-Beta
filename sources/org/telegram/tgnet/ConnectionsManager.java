package org.telegram.tgnet;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
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
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CaptchaController;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.StatsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.LoginActivity;

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

    public interface INativeTlTest {
        boolean test(long j);
    }

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

    public static native void native_receivedCaptchaResult(int i, int[] iArr, String str);

    public static native void native_receivedIntegrityCheckClassic(int i, int i2, String str, String str2);

    public static native void native_resumeNetwork(int i, boolean z);

    public static native void native_sendRequest(int i, long j, int i2, int i3, int i4, boolean z, int i5);

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

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        CORE_POOL_SIZE = iMax;
        int i = (iAvailableProcessors * 2) + 1;
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
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    public void setForceTryIpV6(boolean z) {
        if (this.forceTryIpV6 != z) {
            this.forceTryIpV6 = z;
            checkConnection();
        }
    }

    public void discardConnection(final int i, final int i2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$discardConnection$0(i, i2);
            }
        });
    }

    public void lambda$discardConnection$0(int i, int i2) {
        native_discardConnection(this.currentAccount, i, i2);
    }

    public void failNotRunningRequest(final int i) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$failNotRunningRequest$1(i);
            }
        });
    }

    public void lambda$failNotRunningRequest$1(int i) {
        native_failNotRunningRequest(this.currentAccount, i);
    }

    private static class ResolvedDomain {
        public ArrayList<String> addresses;
        long ttl;

        public ResolvedDomain(ArrayList<String> arrayList, long j) {
            this.addresses = arrayList;
            this.ttl = j;
        }

        public String getAddress() {
            ArrayList<String> arrayList = this.addresses;
            return arrayList.get(Utilities.random.nextInt(arrayList.size()));
        }
    }

    public static ConnectionsManager getInstance(int i) {
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager = connectionsManagerArr[i];
        if (connectionsManager == null) {
            synchronized (ConnectionsManager.class) {
                try {
                    connectionsManager = connectionsManagerArr[i];
                    if (connectionsManager == null) {
                        connectionsManager = new ConnectionsManager(i);
                        connectionsManagerArr[i] = connectionsManager;
                    }
                } finally {
                }
            }
        }
        return connectionsManager;
    }

    public ConnectionsManager(int i) throws PackageManager.NameNotFoundException {
        String str;
        String str2;
        String str3;
        String str4;
        String lowerCase;
        SharedPreferences sharedPreferences;
        super(i);
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (i != 0) {
            File file = new File(filesDirFixed, "account" + i);
            file.mkdirs();
            filesDirFixed = file;
        }
        String string = filesDirFixed.toString();
        boolean zIsPushConnectionEnabled = isPushConnectionEnabled();
        try {
            lowerCase = LocaleController.getSystemLocaleStringIso639().toLowerCase();
            String lowerCase2 = LocaleController.getLocaleStringIso639().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str5 = str5 + " pbeta";
            } else if (BuildVars.DEBUG_VERSION) {
                str5 = str5 + " beta";
            }
            str = "SDK " + Build.VERSION.SDK_INT;
            String str6 = str5;
            str4 = lowerCase2;
            str2 = str6;
        } catch (Exception unused) {
            str = "SDK " + Build.VERSION.SDK_INT;
            str2 = "App version unknown";
            str3 = "Android unknown";
            str4 = "";
            lowerCase = "en";
        }
        String str7 = lowerCase.trim().length() == 0 ? "en" : lowerCase;
        str3 = str3.trim().length() == 0 ? "Android unknown" : str3;
        str2 = str2.trim().length() == 0 ? "App version unknown" : str2;
        String str8 = str.trim().length() == 0 ? "SDK Unknown" : str;
        getUserConfig().loadConfig();
        String regId = getRegId();
        String certificateSHA256Fingerprint = AndroidUtilities.getCertificateSHA256Fingerprint();
        int rawOffset = (TimeZone.getDefault().getRawOffset() + TimeZone.getDefault().getDSTSavings()) / 1000;
        if (this.currentAccount == 0) {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        } else {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig" + this.currentAccount, 0);
        }
        this.forceTryIpV6 = sharedPreferences.getBoolean("forceTryIpV6", false);
        init(SharedConfig.buildVersion(), 225, BuildVars.APP_ID, str3, str8, str2, str4, str7, string, FileLog.getNetworkLogPath(), regId, certificateSHA256Fingerprint, rawOffset, getUserConfig().getClientUserId(), getUserConfig().getCurrentUser() != null ? getUserConfig().getCurrentUser().premium : false, zIsPushConnectionEnabled);
    }

    private String getRegId() {
        String str = SharedConfig.pushString;
        if (!TextUtils.isEmpty(str) && SharedConfig.pushType == 13) {
            str = "huawei://" + str;
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(SharedConfig.pushStringStatus)) {
            str = SharedConfig.pushStringStatus;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "__" + (SharedConfig.pushType == 2 ? "FIREBASE" : "HUAWEI") + "_GENERATING_SINCE_" + getCurrentTime() + "__";
        SharedConfig.pushStringStatus = str2;
        return str2;
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        if (globalNotificationsSettings.contains("pushConnection")) {
            return globalNotificationsSettings.getBoolean("pushConnection", true);
        }
        return MessagesController.getMainSettings(UserConfig.selectedAccount).getBoolean("backgroundConnection", false);
    }

    public long getCurrentTimeMillis() {
        return native_getCurrentTimeMillis(this.currentAccount);
    }

    public int getCurrentTime() {
        return native_getCurrentTime(this.currentAccount);
    }

    public int getCurrentDatacenterId() {
        return native_getCurrentDatacenterId(this.currentAccount);
    }

    public long getCurrentAuthKeyId() {
        return native_getCurrentAuthKeyId(this.currentAccount);
    }

    public int getTimeDifference() {
        return native_getTimeDifference(this.currentAccount);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Utilities.Callback2<T, TLRPC.TL_error> callback2) {
        return sendRequestTyped(tLMethod, null, callback2);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> callback2) {
        return sendRequestTyped(tLMethod, executor, callback2, Integer.MAX_VALUE, 0);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, Utilities.Callback2<T, TLRPC.TL_error> callback2, int i) {
        return sendRequestTyped(tLMethod, executor, callback2, Integer.MAX_VALUE, i);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, final Executor executor, final Utilities.Callback2<T, TLRPC.TL_error> callback2, int i, int i2) {
        return sendRequest(tLMethod, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ConnectionsManager.lambda$sendRequestTyped$3(executor, callback2, tLObject, tL_error);
            }
        }, null, null, null, i2, i, 1, true);
    }

    public static void lambda$sendRequestTyped$3(Executor executor, final Utilities.Callback2 callback2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(tLObject, tL_error);
                }
            });
        } else {
            callback2.run(tLObject, tL_error);
        }
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate) {
        return sendRequest(tLObject, requestDelegate, (QuickAckDelegate) null, 0);
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

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i, int i2, int i3, boolean z) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$4(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i, i2, i3, z, andIncrement);
        return andIncrement;
    }

    public int sendRequest(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i, final int i2, final int i3, final boolean z) {
        final int andIncrement = this.lastRequestToken.getAndIncrement();
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendRequest$4(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i, i2, i3, z, andIncrement);
            }
        });
        return andIncrement;
    }

    public void lambda$sendRequest$4(final org.telegram.tgnet.TLObject r18, final org.telegram.tgnet.RequestDelegate r19, final org.telegram.tgnet.RequestDelegateTimestamp r20, final org.telegram.tgnet.QuickAckDelegate r21, final org.telegram.tgnet.WriteToSocketDelegate r22, final int r23, final int r24, final int r25, final boolean r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.ConnectionsManager.lambda$sendRequest$4(org.telegram.tgnet.TLObject, org.telegram.tgnet.RequestDelegate, org.telegram.tgnet.RequestDelegateTimestamp, org.telegram.tgnet.QuickAckDelegate, org.telegram.tgnet.WriteToSocketDelegate, int, int, int, boolean, int):void");
    }

    public void lambda$sendRequestInternal$6(TLObject tLObject, int i, long j, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i2, int i3, boolean z, int i4, long j2, int i5, String str, int i6, final long j3, long j4, int i7) throws Exception {
        TLObject tLObjectDeserializeResponse;
        TLRPC.TL_error tL_error;
        int iLimit;
        String str2;
        try {
            if (j2 != 0) {
                NativeByteBuffer nativeByteBufferWrap = NativeByteBuffer.wrap(j2);
                nativeByteBufferWrap.setDataSourceType(TLDataSourceType.NETWORK);
                nativeByteBufferWrap.reused = true;
                iLimit = nativeByteBufferWrap.limit();
                try {
                    tLObjectDeserializeResponse = tLObject.deserializeResponse(nativeByteBufferWrap, nativeByteBufferWrap.readInt32(true), true);
                    tL_error = null;
                } catch (Exception e) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        throw e;
                    }
                    FileLog.fatal(e);
                    return;
                }
            } else {
                if (str != null) {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.code = i5;
                    tL_error2.text = str;
                    if (BuildVars.LOGS_ENABLED && i5 != -2000) {
                        FileLog.e(tLObject + " got error " + tL_error2.code + " " + tL_error2.text);
                    }
                    tLObjectDeserializeResponse = null;
                    tL_error = tL_error2;
                } else {
                    tLObjectDeserializeResponse = null;
                    tL_error = null;
                }
                iLimit = 0;
            }
            if ((i & 2) != 0 && VideoPlayer.activePlayers.isEmpty()) {
                DefaultBandwidthMeter.getSingletonInstance(ApplicationLoader.applicationContext).onTransfer(iLimit, Math.max(0L, (System.currentTimeMillis() - j) - native_getCurrentPingTime(this.currentAccount)));
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION && !getUserConfig().isClientActivated() && tL_error != null && tL_error.code == 400 && Objects.equals(tL_error.text, "CONNECTION_NOT_INITED")) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("Cleanup keys for " + this.currentAccount + " because of CONNECTION_NOT_INITED");
                }
                cleanup(true);
                sendRequest(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i2, i3, i, z);
                return;
            }
            if (tLObjectDeserializeResponse != null) {
                tLObjectDeserializeResponse.networkType = i6;
            }
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder();
                sb.append("java received ");
                sb.append(tLObjectDeserializeResponse);
                if (tL_error != null) {
                    str2 = " error = " + tL_error;
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(" messageId = 0x");
                sb.append(Long.toHexString(j4));
                FileLog.d(sb.toString());
                FileLog.dumpResponseAndRequest(this.currentAccount, tLObject, tLObjectDeserializeResponse, tL_error, j4, j, i4);
            }
            final TLObject tLObject2 = tLObjectDeserializeResponse;
            final TLRPC.TL_error tL_error3 = tL_error;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendRequestInternal$5(requestDelegate, tLObject2, tL_error3, requestDelegateTimestamp, j3);
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$sendRequestInternal$5(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j);
        } else if (tLObject instanceof TLRPC.Updates) {
            KeepAliveJob.finishJob();
            AccountInstance.getInstance(this.currentAccount).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (tLObject != null) {
            tLObject.freeResources();
        }
    }

    private static class RequestCallbacks {
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

    private void listen(int i, RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
        this.requestCallbacks.put(Integer.valueOf(i), new RequestCallbacks(requestDelegateInternal, quickAckDelegate, writeToSocketDelegate));
    }

    private void listenCancel(int i, Runnable runnable) {
        RequestCallbacks requestCallbacks = this.requestCallbacks.get(Integer.valueOf(i));
        if (requestCallbacks != null) {
            requestCallbacks.onCancelled = runnable;
        }
    }

    public static void onRequestClear(int i, int i2, boolean z) {
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2));
        if (!z) {
            if (requestCallbacks != null) {
                connectionsManager.requestCallbacks.remove(Integer.valueOf(i2));
            }
        } else if (requestCallbacks != null) {
            Runnable runnable = requestCallbacks.onCancelled;
            if (runnable != null) {
                runnable.run();
            }
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i2));
        }
    }

    public static void onRequestComplete(int i, int i2, long j, int i3, String str, int i4, long j2, long j3, int i5) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2));
        connectionsManager.requestCallbacks.remove(Integer.valueOf(i2));
        if (requestCallbacks == null || (requestDelegateInternal = requestCallbacks.onComplete) == null) {
            return;
        }
        requestDelegateInternal.run(j, i3, str, i4, j2, j3, i5);
    }

    public static void onRequestQuickAck(int i, int i2) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2))) == null || (quickAckDelegate = requestCallbacks.onQuickAck) == null) {
            return;
        }
        quickAckDelegate.run();
    }

    public static void onRequestWriteToSocket(int i, int i2) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i2))) == null || (writeToSocketDelegate = requestCallbacks.onWriteToSocket) == null) {
            return;
        }
        writeToSocketDelegate.run();
    }

    public void cancelRequest(int i, boolean z) {
        cancelRequest(i, z, null);
    }

    public void cancelRequest(final int i, final boolean z, final Runnable runnable) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cancelRequest$8(runnable, i, z);
            }
        });
    }

    public void lambda$cancelRequest$8(final Runnable runnable, int i, boolean z) {
        if (runnable != null) {
            listenCancel(i, new Runnable() {
                @Override
                public final void run() {
                    ConnectionsManager.lambda$cancelRequest$7(runnable);
                }
            });
        }
        native_cancelRequest(this.currentAccount, i, z);
    }

    public static void lambda$cancelRequest$7(Runnable runnable) {
        Utilities.stageQueue.postRunnable(runnable);
    }

    public void cleanup(boolean z) {
        native_cleanUp(this.currentAccount, z);
    }

    public void cancelRequestsForGuid(final int i) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cancelRequestsForGuid$9(i);
            }
        });
    }

    public void lambda$cancelRequestsForGuid$9(int i) {
        native_cancelRequestsForGuid(this.currentAccount, i);
    }

    public void bindRequestToGuid(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        native_bindRequestToGuid(this.currentAccount, i, i2);
    }

    public void applyDatacenterAddress(int i, String str, int i2) {
        native_applyDatacenterAddress(this.currentAccount, i, str, i2);
    }

    public int getConnectionState() {
        int i = this.connectionState;
        if (i == 3 && this.isUpdating) {
            return 5;
        }
        return i;
    }

    public void setUserId(long j) {
        native_setUserId(this.currentAccount, j);
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, ApplicationLoader.isNetworkOnline(), ApplicationLoader.getCurrentNetworkType(), ApplicationLoader.isConnectionSlow());
    }

    public void setPushConnectionEnabled(boolean z) {
        native_setPushConnectionEnabled(this.currentAccount, z);
    }

    public void init(int r29, int r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, long r42, boolean r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.ConnectionsManager.init(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, boolean):void");
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i = 0; i < 4; i++) {
            native_setLangCode(i, lowerCase);
        }
    }

    public static void setRegId(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str) && i == 13) {
            str = "huawei://" + str;
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "__" + (i == 2 ? "FIREBASE" : "HUAWEI") + "_GENERATING_SINCE_" + getInstance(0).getCurrentTime() + "__";
            SharedConfig.pushStringStatus = str2;
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

    public void switchBackend(boolean z) {
        MessagesController.getGlobalMainSettings().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z);
    }

    public boolean isTestBackend() {
        return native_isTestBackend(this.currentAccount) != 0;
    }

    public void resumeNetworkMaybe() {
        native_resumeNetwork(this.currentAccount, true);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public void setDefaultDatacenterId(int i) {
        native_moveDatacenter(this.currentAccount, i);
    }

    public long getPauseTime() {
        return this.lastPauseTime;
    }

    public long checkProxy(String str, int i, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return native_checkProxy(this.currentAccount, str == null ? "" : str, i, str2 == null ? "" : str2, str3 == null ? "" : str3, str4 == null ? "" : str4, requestTimeDelegate);
    }

    public void setAppPaused(boolean z, boolean z2) {
        if (!z2) {
            this.appPaused = z;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app paused = " + z);
            }
            if (z) {
                this.appResumeCount--;
            } else {
                this.appResumeCount++;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app resume count " + this.appResumeCount);
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

    public static void onUnparsedMessageReceived(long j, final int i, long j2) {
        try {
            NativeByteBuffer nativeByteBufferWrap = NativeByteBuffer.wrap(j);
            nativeByteBufferWrap.setDataSourceType(TLDataSourceType.NETWORK);
            nativeByteBufferWrap.reused = true;
            int int32 = nativeByteBufferWrap.readInt32(true);
            final TLObject tLObjectTLdeserialize = TLClassStore.Instance().TLdeserialize(nativeByteBufferWrap, int32, true);
            FileLog.dumpUnparsedMessage(tLObjectTLdeserialize, j2, i);
            if (tLObjectTLdeserialize instanceof TLRPC.Updates) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("java received " + tLObjectTLdeserialize);
                }
                KeepAliveJob.finishJob();
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        ConnectionsManager.lambda$onUnparsedMessageReceived$10(i, tLObjectTLdeserialize);
                    }
                });
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d(String.format("java received unknown constructor 0x%x", Integer.valueOf(int32)));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$onUnparsedMessageReceived$10(int i, TLObject tLObject) {
        AccountInstance.getInstance(i).getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    public static void lambda$onUpdate$11(int i) {
        AccountInstance.getInstance(i).getMessagesController().updateTimerProc();
    }

    public static void onUpdate(final int i) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onUpdate$11(i);
            }
        });
    }

    public static void lambda$onSessionCreated$12(int i) {
        AccountInstance.getInstance(i).getMessagesController().getDifference();
    }

    public static void onSessionCreated(final int i) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onSessionCreated$12(i);
            }
        });
    }

    public static void onConnectionStateChanged(final int i, final int i2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onConnectionStateChanged$13(i2, i);
            }
        });
    }

    public static void lambda$onConnectionStateChanged$13(int i, int i2) {
        getInstance(i).connectionState = i2;
        AccountInstance.getInstance(i).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateConnectionState, new Object[0]);
    }

    public static void onLogout(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onLogout$14(i);
            }
        });
    }

    public static void lambda$onLogout$14(int i) {
        AccountInstance accountInstance = AccountInstance.getInstance(i);
        if (accountInstance.getUserConfig().getClientUserId() != 0) {
            accountInstance.getUserConfig().clearConfig();
            accountInstance.getMessagesController().performLogout(0);
        }
    }

    public static int getInitFlags() {
        if (!EmuDetector.with(ApplicationLoader.applicationContext).detect()) {
            return 0;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("detected emu");
        }
        return 1024;
    }

    public static void onBytesSent(int i, int i2, int i3) {
        try {
            AccountInstance.getInstance(i3).getStatsController().incrementSentBytesCount(i2, 6, i);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void onRequestNewServerIpAndPort(final int i, final int i2) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$16(i, i2);
            }
        });
    }

    public static void lambda$onRequestNewServerIpAndPort$16(final int i, final int i2) {
        final boolean zIsNetworkOnline = ApplicationLoader.isNetworkOnline();
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$15(i, zIsNetworkOnline, i2);
            }
        });
    }

    public static void lambda$onRequestNewServerIpAndPort$15(int i, boolean z, int i2) {
        FileLog.d("13. currentTask == " + currentTask);
        if (currentTask != null || ((i == 0 && Math.abs(lastDnsRequestTime - System.currentTimeMillis()) < 10000) || !z)) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("don't start task, current task = " + currentTask + " next task = " + i + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + ApplicationLoader.isNetworkOnline());
                return;
            }
            return;
        }
        lastDnsRequestTime = System.currentTimeMillis();
        if (i == 2) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start mozilla txt task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i2);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("9. currentTask = mozilla");
            currentTask = mozillaDnsLoadTask;
            return;
        }
        if (i == 1) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start google txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i2);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("11. currentTask = dnstxt");
            currentTask = googleDnsLoadTask;
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start firebase task");
        }
        FirebaseTask firebaseTask = new FirebaseTask(i2);
        firebaseTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
        FileLog.d("12. currentTask = firebase");
        currentTask = firebaseTask;
    }

    public static void lambda$onProxyError$17() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 3);
    }

    public static void onProxyError() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onProxyError$17();
            }
        });
    }

    public static void getHostByName(final String str, final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$getHostByName$18(str, j);
            }
        });
    }

    public static void lambda$getHostByName$18(String str, long j) {
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
                FileLog.e(th);
                native_onHostNameResolved(str, j, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j);
    }

    public static void onBytesReceived(int i, int i2, int i3) {
        try {
            StatsController.getInstance(i3).incrementReceivedBytesCount(i2, 6, i);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void onUpdateConfig(long j, final int i) {
        try {
            NativeByteBuffer nativeByteBufferWrap = NativeByteBuffer.wrap(j);
            nativeByteBufferWrap.reused = true;
            final TLRPC.TL_config tL_configTLdeserialize = TLRPC.TL_config.TLdeserialize(nativeByteBufferWrap, nativeByteBufferWrap.readInt32(true), true);
            if (tL_configTLdeserialize != null) {
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        ConnectionsManager.lambda$onUpdateConfig$19(i, tL_configTLdeserialize);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$onUpdateConfig$19(int i, TLRPC.TL_config tL_config) {
        AccountInstance.getInstance(i).getMessagesController().updateConfig(tL_config);
    }

    public static void onInternalPushReceived(int i) {
        KeepAliveJob.startJob();
    }

    public static void setProxySettings(boolean z, String str, int i, String str2, String str3, String str4) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (z && !TextUtils.isEmpty(str)) {
                native_setProxySettings(i2, str, i, str2, str3, str4);
            } else {
                native_setProxySettings(i2, "", 1080, "", "", "");
            }
            AccountInstance accountInstance = AccountInstance.getInstance(i2);
            if (accountInstance.getUserConfig().isClientActivated()) {
                accountInstance.getMessagesController().checkPromoInfo(true);
            }
        }
    }

    public static boolean testNativeTlScheme(NativeByteBuffer nativeByteBuffer, INativeTlTest iNativeTlTest) {
        return iNativeTlTest.test(nativeByteBuffer.address);
    }

    public static int generateClassGuid() {
        int i = lastClassGuid;
        lastClassGuid = i + 1;
        return i;
    }

    public void setIsUpdating(final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setIsUpdating$20(z);
            }
        });
    }

    public void lambda$setIsUpdating$20(boolean z) {
        if (this.isUpdating == z) {
            return;
        }
        this.isUpdating = z;
        if (this.connectionState == 3) {
            AccountInstance.getInstance(this.currentAccount).getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateConnectionState, new Object[0]);
        }
    }

    protected byte getIpStrategy() {
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
                        for (int i = 0; i < interfaceAddresses.size(); i++) {
                            InetAddress address = interfaceAddresses.get(i).getAddress();
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
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (networkInterfaces2.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement2 = networkInterfaces2.nextElement();
                if (networkInterfaceNextElement2.isUp() && !networkInterfaceNextElement2.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses2 = networkInterfaceNextElement2.getInterfaceAddresses();
                    for (int i2 = 0; i2 < interfaceAddresses2.size(); i2++) {
                        InetAddress address2 = interfaceAddresses2.get(i2).getAddress();
                        if (!address2.isLinkLocalAddress() && !address2.isLoopbackAddress() && !address2.isMulticastAddress()) {
                            if (address2 instanceof Inet6Address) {
                                z = true;
                            } else if (address2 instanceof Inet4Address) {
                                if (address2.getHostAddress().startsWith("192.0.0.")) {
                                    z2 = true;
                                } else {
                                    z3 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                if (this.forceTryIpV6) {
                    return (byte) 1;
                }
                if (z2) {
                    return (byte) 2;
                }
                if (!z3) {
                    return (byte) 1;
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        return (byte) 0;
    }

    private static class ResolveHostByNameTask extends AsyncTask<Void, Void, ResolvedDomain> {
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
        public ResolvedDomain doInBackground(Void... voidArr) throws IOException {
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
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                byteArrayOutputStream = null;
            }
            try {
                byte[] bArr = new byte[32768];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                JSONObject jSONObject = new JSONObject(new String(byteArrayOutputStream.toByteArray()));
                if (!jSONObject.has("Answer") || (length = (jSONArray = jSONObject.getJSONArray("Answer")).length()) <= 0) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        FileLog.e(th3, false);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused) {
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(jSONArray.getJSONObject(i2).getString("data"));
                }
                ResolvedDomain resolvedDomain = new ResolvedDomain(arrayList, SystemClock.elapsedRealtime());
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    FileLog.e(th4, false);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused2) {
                }
                return resolvedDomain;
            } catch (Throwable th5) {
                th = th5;
                try {
                    FileLog.e(th, false);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th6) {
                            FileLog.e(th6, false);
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
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                } finally {
                }
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

    static class GoogleDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public GoogleDnsLoadTask(int i) {
            this.currentAccount = i;
        }

        @Override
        public org.telegram.tgnet.NativeByteBuffer doInBackground(java.lang.Void... r11) throws java.io.IOException {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.ConnectionsManager.GoogleDnsLoadTask.doInBackground(java.lang.Void[]):org.telegram.tgnet.NativeByteBuffer");
        }

        public static int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        @Override
        public void onPostExecute(final NativeByteBuffer nativeByteBuffer) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$1(nativeByteBuffer);
                }
            });
        }

        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            FileLog.d("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i, nativeByteBuffer.address, AccountInstance.getInstance(i).getUserConfig().getClientPhone(), this.responseDate);
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
    }

    static class MozillaDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public MozillaDnsLoadTask(int i) {
            this.currentAccount = i;
        }

        @Override
        public org.telegram.tgnet.NativeByteBuffer doInBackground(java.lang.Void... r11) throws java.io.IOException {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.ConnectionsManager.MozillaDnsLoadTask.doInBackground(java.lang.Void[]):org.telegram.tgnet.NativeByteBuffer");
        }

        public static int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        @Override
        public void onPostExecute(final NativeByteBuffer nativeByteBuffer) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$1(nativeByteBuffer);
                }
            });
        }

        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            FileLog.d("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i, nativeByteBuffer.address, AccountInstance.getInstance(i).getUserConfig().getClientPhone(), this.responseDate);
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to get mozilla txt result");
            }
        }
    }

    static class FirebaseTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private FirebaseRemoteConfig firebaseRemoteConfig;

        @Override
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
        }

        public FirebaseTask(int i) {
            this.currentAccount = i;
        }

        @Override
        public NativeByteBuffer doInBackground(Void... voidArr) {
            try {
                if (ConnectionsManager.native_isTestBackend(this.currentAccount) != 0) {
                    throw new Exception("test backend");
                }
                FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
                this.firebaseRemoteConfig = firebaseRemoteConfig;
                String string = firebaseRemoteConfig.getString("ipconfigv3");
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current firebase value = " + string);
                }
                this.firebaseRemoteConfig.fetch(0L).addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public final void onComplete(Task task) {
                        this.f$0.lambda$doInBackground$2(task);
                    }
                });
                return null;
            } catch (Throwable th) {
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$doInBackground$3();
                    }
                });
                FileLog.e(th, false);
                return null;
            }
        }

        public void lambda$doInBackground$2(Task task) {
            final boolean zIsSuccessful = task.isSuccessful();
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$doInBackground$1(zIsSuccessful);
                }
            });
        }

        public void lambda$doInBackground$1(boolean z) {
            if (z) {
                this.firebaseRemoteConfig.activate().addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public final void onComplete(Task task) {
                        this.f$0.lambda$doInBackground$0(task);
                    }
                });
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to get firebase result 2");
                FileLog.d("start dns txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(this.currentAccount);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("7. currentTask = GoogleDnsLoadTask");
            AsyncTask unused = ConnectionsManager.currentTask = googleDnsLoadTask;
        }

        public void lambda$doInBackground$0(Task task) {
            FileLog.d("6. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            String string = this.firebaseRemoteConfig.getString("ipconfigv3");
            if (!TextUtils.isEmpty(string)) {
                byte[] bArrDecode = Base64.decode(string, 0);
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(bArrDecode.length);
                    nativeByteBuffer.writeBytes(bArrDecode);
                    int fetchTimeMillis = (int) (this.firebaseRemoteConfig.getInfo().getFetchTimeMillis() / 1000);
                    int i = this.currentAccount;
                    ConnectionsManager.native_applyDnsConfig(i, nativeByteBuffer.address, AccountInstance.getInstance(i).getUserConfig().getClientPhone(), fetchTimeMillis);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to get firebase result");
                FileLog.d("start dns txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(this.currentAccount);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("7. currentTask = GoogleDnsLoadTask");
            AsyncTask unused2 = ConnectionsManager.currentTask = googleDnsLoadTask;
        }

        public void lambda$doInBackground$3() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to get firebase result");
                FileLog.d("start dns txt task");
            }
            GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(this.currentAccount);
            googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            FileLog.d("8. currentTask = GoogleDnsLoadTask");
            AsyncTask unused = ConnectionsManager.currentTask = googleDnsLoadTask;
        }
    }

    public static void onPremiumFloodWait(final int i, final int i2, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onPremiumFloodWait$22(i, z, i2);
            }
        });
    }

    public static void lambda$onPremiumFloodWait$22(final int i, final boolean z, final int i2) {
        if (UserConfig.selectedAccount != i) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.lambda$onPremiumFloodWait$21(z, i, i2);
            }
        });
    }

    public static void lambda$onPremiumFloodWait$21(boolean r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.ConnectionsManager.lambda$onPremiumFloodWait$21(boolean, int, int):void");
    }

    public static void onIntegrityCheckClassic(final int i, final int i2, final String str, final String str2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                ConnectionsManager.lambda$onIntegrityCheckClassic$25(i, str, str2, i2);
            }
        });
    }

    public static void lambda$onIntegrityCheckClassic$25(final int i, String str, final String str2, final int i2) throws NumberFormatException {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        FileLog.d("account" + i + ": server requests integrity classic check with project = " + str + " nonce = " + str2);
        try {
            IntegrityManagerFactory.create(ApplicationLoader.applicationContext).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new OnSuccessListener() {
                @Override
                public final void onSuccess(Object obj) {
                    ConnectionsManager.lambda$onIntegrityCheckClassic$23(i, jCurrentTimeMillis, i2, str2, (IntegrityTokenResponse) obj);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public final void onFailure(Exception exc) {
                    ConnectionsManager.lambda$onIntegrityCheckClassic$24(i, jCurrentTimeMillis, i2, str2, exc);
                }
            });
        } catch (Exception unused) {
            FileLog.d("account" + i + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i, i2, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    public static void lambda$onIntegrityCheckClassic$23(int i, long j, int i2, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.e("account" + i + ": integrity check gave null token in " + (System.currentTimeMillis() - j) + "ms");
            native_receivedIntegrityCheckClassic(i, i2, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        FileLog.d("account" + i + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i, i2, str, str2);
        } catch (Exception e) {
            FileLog.e("receivedIntegrityCheckClassic failed", e);
        }
    }

    public static void lambda$onIntegrityCheckClassic$24(int i, long j, int i2, String str, Exception exc) {
        FileLog.e("account" + i + ": integrity check failed to give a token in " + (System.currentTimeMillis() - j) + "ms", exc);
        StringBuilder sb = new StringBuilder();
        sb.append("PLAYINTEGRITY_FAILED_EXCEPTION_");
        sb.append(LoginActivity.errorString(exc));
        native_receivedIntegrityCheckClassic(i, i2, str, sb.toString());
    }

    public static void onCaptchaCheck(int i, int i2, String str, String str2) {
        CaptchaController.request(i, i2, str, str2);
    }
}
