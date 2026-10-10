package org.telegram.ui.Wallet;

import android.util.Base64;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.dw;
import org.telegram.ui.g90;
import org.telegram.ui.ii1;
public class WalletEngine2 implements AutoCloseable {
    private static final long NFT_ATTACHED_NANOGRAMS = 100000000;
    private static final long NFT_FORWARD_NANOGRAMS = 10000000;
    private static String[] mnemonicWordlist;
    public final String address;
    private volatile boolean closed;
    public final int currentAccount;
    private String nftPreviewAddress;
    private String nftPreviewComment;
    private String nftPreviewOperationId;
    private String nftPreviewRecipient;
    private u6 pendingSend;
    private long ptr;
    public final byte[] publicKey;
    private ScheduledFuture<?> resolutionTask;
    private final HttpTransport transport;
    private final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor(new e2.c0(6));
    private long nextAuxiliaryRequestId = -1;

    public static class HttpTransport {
        private boolean closed;
        public final int currentAccount;
        private final HashMap<Long, t6> pending = new HashMap<>();

        public static class HostException extends RuntimeException {
            final int kind;

            public HostException(int i10) {
                super("Wallet provider request failed");
                this.kind = i10;
            }
        }

        public HttpTransport(int i10) {
            this.currentAccount = i10;
        }

        private ConnectionsManager getConnectionsManager() {
            return ConnectionsManager.getInstance(this.currentAccount);
        }

        public static void lambda$execute$0(t6 t6Var, TL_toncenter.apiResponse apiresponse, TLRPC.TL_error tL_error) {
            TLRPC.TL_dataJSON tL_dataJSON;
            String str;
            if (tL_error != null) {
                t6Var.a(null, new HostException(3));
            } else if (apiresponse != null && (tL_dataJSON = apiresponse.response) != null && (str = tL_dataJSON.data) != null) {
                t6Var.a(str.getBytes(StandardCharsets.UTF_8), null);
            } else {
                t6Var.a(null, new HostException(7));
            }
        }

        public void cancel(long j3) {
            synchronized (this.pending) {
                try {
                    t6 t6Var = this.pending.get(Long.valueOf(j3));
                    if (t6Var != null) {
                        t6Var.a(null, new HostException(6));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void close() {
            synchronized (this.pending) {
                try {
                    this.closed = true;
                    for (t6 t6Var : this.pending.values()) {
                        t6Var.a(null, new HostException(6));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public byte[] execute(long j3, String str, boolean z10, byte[] bArr, long j10) {
            String str2;
            int i10;
            HashMap<Long, t6> hashMap;
            try {
                URI create = URI.create(str);
                if ("https".equalsIgnoreCase(create.getScheme()) && "toncenter.com".equalsIgnoreCase(create.getHost()) && create.getRawUserInfo() == null && create.getRawFragment() == null && ((create.getPort() == -1 || create.getPort() == 443) && j10 > 0)) {
                    TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                    performapirequest.post = z10;
                    performapirequest.endpoint = create.getRawPath();
                    performapirequest.query = create.getRawQuery();
                    if (bArr.length == 0) {
                        str2 = null;
                    } else {
                        str2 = new String(bArr, StandardCharsets.UTF_8);
                    }
                    performapirequest.payload = str2;
                    t6 t6Var = new t6();
                    long nanoTime = System.nanoTime();
                    try {
                        try {
                            HashMap<Long, t6> hashMap2 = this.pending;
                            try {
                                synchronized (hashMap2) {
                                    try {
                                        try {
                                            if (!this.closed) {
                                                try {
                                                    this.pending.put(Long.valueOf(j3), t6Var);
                                                    try {
                                                        t6Var.f35579b = getConnectionsManager().sendRequestTyped(performapirequest, new a3.b(2), new d(t6Var, 9), MessagesController.getInstance(this.currentAccount).webFileDatacenterId, 0);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        hashMap = hashMap2;
                                                        i10 = 6;
                                                        try {
                                                            throw th;
                                                        } catch (InterruptedException unused) {
                                                            Thread.currentThread().interrupt();
                                                            t6Var.a(null, new HostException(i10));
                                                            throw new HostException(i10);
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    hashMap = hashMap2;
                                                }
                                            } else {
                                                throw new HostException(6);
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i10 = 6;
                                        hashMap = hashMap2;
                                    }
                                }
                                try {
                                    if (!t6Var.f35578a.await(Math.max(0L, TimeUnit.MILLISECONDS.toNanos(j10) - (System.nanoTime() - nanoTime)), TimeUnit.NANOSECONDS)) {
                                        t6Var.a(null, new HostException(2));
                                    }
                                    HostException hostException = t6Var.d;
                                    if (hostException == null) {
                                        byte[] bArr2 = t6Var.f35580c;
                                        synchronized (this.pending) {
                                            try {
                                                this.pending.remove(Long.valueOf(j3));
                                                if (t6Var.d != null && t6Var.f35579b != 0) {
                                                    getConnectionsManager().cancelRequest(t6Var.f35579b, true);
                                                }
                                            } finally {
                                            }
                                        }
                                        return bArr2;
                                    }
                                    throw hostException;
                                } catch (InterruptedException unused2) {
                                    i10 = 6;
                                    Thread.currentThread().interrupt();
                                    t6Var.a(null, new HostException(i10));
                                    throw new HostException(i10);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            synchronized (this.pending) {
                                try {
                                    this.pending.remove(Long.valueOf(j3));
                                    if (t6Var.d != null && t6Var.f35579b != 0) {
                                        getConnectionsManager().cancelRequest(t6Var.f35579b, true);
                                    }
                                    throw th7;
                                } finally {
                                }
                            }
                        }
                    } catch (InterruptedException unused3) {
                        i10 = 6;
                    }
                } else {
                    throw new HostException(4);
                }
            } catch (IllegalArgumentException unused4) {
                throw new HostException(4);
            }
        }
    }

    public static final class ImportedWalletProof {
        public final byte[] publicKey;
        public final byte[] signature;
        public final int timestamp;

        private ImportedWalletProof(byte[] bArr, int i10, byte[] bArr2) {
            this.publicKey = bArr;
            this.timestamp = i10;
            this.signature = bArr2;
        }
    }

    public static class PreparedRotation {
        final byte[] newPublicKey;
        final h0 newSecretPhrase;
        final TL_wallet.sendTransfer transfer;

        public PreparedRotation(String str, String str2, byte[] bArr, byte[] bArr2) {
            if (bArr2 != null) {
                try {
                    if (bArr2.length == 32 && bArr != null && bArr.length != 0) {
                        this.transfer = new PreparedSend(str, str2, null).transfer;
                        this.newSecretPhrase = new h0(bArr);
                        this.newPublicKey = bArr2;
                        Arrays.fill(bArr, (byte) 0);
                        return;
                    }
                } catch (Throwable th2) {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    throw th2;
                }
            }
            throw new IllegalArgumentException("Invalid key rotation result");
        }
    }

    public static class PreparedSend {
        final String encryptedCommentBody;
        final TL_wallet.sendTransfer transfer;

        public PreparedSend(String str, String str2, String str3) {
            byte[] decodeTransferBoc;
            TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
            this.transfer = sendtransfer;
            sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
            sendtransfer.random_id = Utilities.random.nextLong();
            sendtransfer.data_normal = decodeTransferBoc(str);
            sendtransfer.normalMessageBodyHash = WalletEngine2.nativeMessageBodyHash(str);
            if (str2 == null) {
                decodeTransferBoc = null;
            } else {
                decodeTransferBoc = decodeTransferBoc(str2);
            }
            sendtransfer.data_gasless = decodeTransferBoc;
            if (decodeTransferBoc != null) {
                sendtransfer.gaslessMessageBodyHash = WalletEngine2.nativeMessageBodyHash(str2);
            }
            this.encryptedCommentBody = str3;
        }

        private static byte[] decodeTransferBoc(String str) {
            byte[] decode = Base64.decode(str, 0);
            if (decode.length != 0 && decode.length <= 16384) {
                return decode;
            }
            throw new IllegalArgumentException("WALLET_TRANSFER_DATA_INVALID");
        }
    }

    public static class RotationCallbacks extends SendCallbacks {
        private final Utilities.Callback2<h0, byte[]> onReplacement;

        public RotationCallbacks(final Utilities.Callback2<SendPhase, String> callback2, Utilities.Callback2<h0, byte[]> callback22) {
            super(new Utilities.Callback3() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3) {
                    String str = (String) obj3;
                    Utilities.Callback2.this.run((WalletEngine2.SendPhase) obj, (String) obj2);
                }
            });
            this.onReplacement = callback22;
        }

        private void lambda$replacement$1(byte[] bArr, h0 h0Var) {
            this.onReplacement.run(h0Var, bArr);
        }

        public Void lambda$replacement$2(byte[] bArr, byte[] bArr2) {
            h0 h0Var = new h0(bArr);
            try {
                lambda$replacement$1(bArr2, h0Var);
                h0Var.close();
                return null;
            } catch (Throwable th2) {
                h0Var.close();
                throw th2;
            }
        }

        private void replacement(final byte[] bArr, final byte[] bArr2) {
            boolean z10;
            try {
                FutureTask futureTask = new FutureTask(new Callable() {
                    @Override
                    public final Object call() {
                        Void lambda$replacement$2;
                        lambda$replacement$2 = WalletEngine2.RotationCallbacks.this.lambda$replacement$2(bArr, bArr2);
                        return lambda$replacement$2;
                    }
                });
                AndroidUtilities.runOnUIThread(futureTask);
                z10 = false;
                while (true) {
                    try {
                        try {
                            futureTask.get();
                            break;
                        } catch (InterruptedException unused) {
                            z10 = true;
                        } catch (ExecutionException unused2) {
                            throw new IllegalStateException("Could not save replacement recovery phrase");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Arrays.fill(bArr, (byte) 0);
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (!z10) {
                    Arrays.fill(bArr, (byte) 0);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Key rotation was interrupted before submission");
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
        }
    }

    public static class SendCallbacks {
        final Utilities.Callback3<SendPhase, String, String> callback;
        String error;
        SendPhase phase = SendPhase.IDLE;
        String transactionHash;

        public SendCallbacks(Utilities.Callback3<SendPhase, String, String> callback3) {
            this.callback = callback3;
        }

        public void lambda$dispatch$0(SendPhase sendPhase, String str, String str2) {
            this.callback.run(sendPhase, str, str2);
        }

        public void dispatch(SendPhase sendPhase, String str, String str2) {
            AndroidUtilities.runOnUIThread(new n6((Object) this, (Object) sendPhase, str, (Object) str2, 2));
        }

        public synchronized void failed(String str) {
            SendPhase sendPhase = this.phase;
            if (sendPhase != SendPhase.SUBMISSION_UNKNOWN) {
                sendPhase = SendPhase.FAILED;
            }
            state(sendPhase.nativeValue, str, null);
        }

        public synchronized void state(int i10, String str, String str2) {
            SendPhase fromNative = SendPhase.fromNative(i10);
            if (this.phase == fromNative && Objects.equals(this.error, str) && Objects.equals(this.transactionHash, str2)) {
                return;
            }
            this.phase = fromNative;
            this.error = str;
            this.transactionHash = str2;
            dispatch(fromNative, str, str2);
        }
    }

    public enum SendPhase {
        IDLE(1),
        VALIDATING(2),
        AUTHORIZING(3),
        PREPARING(4),
        PERSISTING(5),
        READY_TO_SUBMIT(6),
        SUBMITTING(7),
        SUBMISSION_UNKNOWN(8),
        SUBMITTED(9),
        HANDED_OFF(10),
        CONFIRMED(11),
        REPLACED(12),
        SEQUENCE_NUMBER_CONSUMED(13),
        EXPIRED(14),
        SUPERSEDED(15),
        FAILED(16),
        CANCELLED(17);
        
        private final int nativeValue;

        SendPhase(int i10) {
            this.nativeValue = i10;
        }

        public static SendPhase fromNative(int i10) {
            SendPhase[] values;
            for (SendPhase sendPhase : values()) {
                if (sendPhase.nativeValue == i10) {
                    return sendPhase;
                }
            }
            throw new IllegalArgumentException(hg.c.h(i10, "Unknown native send phase: "));
        }
    }

    public static class SendResolution {
        final String error;
        final String operationId;
        final SendPhase phase;
        final long retryAfterMs;
        final String transactionHash;

        public SendResolution(String str, int i10, String str2, String str3, long j3) {
            this.operationId = str;
            this.phase = SendPhase.fromNative(i10);
            this.transactionHash = str2;
            this.error = str3;
            this.retryAfterMs = j3;
        }
    }

    public WalletEngine2(int i10, String str, byte[] bArr) {
        this.currentAccount = i10;
        this.address = str;
        byte[] bArr2 = (byte[]) bArr.clone();
        this.publicKey = bArr2;
        HttpTransport httpTransport = new HttpTransport(i10);
        this.transport = httpTransport;
        this.ptr = nativeCreate(i10, str, bArr2, httpTransport, ApplicationLoader.applicationContext.getNoBackupFilesDir().getAbsolutePath() + "/wallet-engine");
    }

    public static ImportedWalletProof createImportProof(h0 h0Var, String str, String str2, int i10) {
        return createProof(h0Var, str, str2, i10, true);
    }

    public static ImportedWalletProof createOwnershipProof(h0 h0Var, String str, String str2, int i10) {
        return createProof(h0Var, str, str2, i10, false);
    }

    private static ImportedWalletProof createProof(h0 h0Var, String str, String str2, int i10, boolean z10) {
        if (h0Var != null && !h0Var.e()) {
            if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && i10 > 0) {
                byte[] c10 = h0Var.c();
                try {
                    Charset charset = StandardCharsets.UTF_8;
                    return nativeCreateImportProof(c10, str.getBytes(charset), str2.getBytes(charset), i10, z10);
                } finally {
                    Arrays.fill(c10, (byte) 0);
                }
            }
            throw new IllegalArgumentException("Challenge domain, payload and positive timestamp are required");
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    private static TL_wallet.walletTransaction createTransaction(String str, long j3) {
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        wallettransactionpeeraddress.address = nativeTransactionAddress(str);
        wallettransaction.peer = wallettransactionpeeraddress;
        wallettransaction.amount = j3;
        return wallettransaction;
    }

    private static byte[] decodeEncryptedComment(String str) {
        if (str != null && !str.isEmpty() && str.length() <= 1368 && str.matches("[A-Za-z0-9+/]+={0,2}")) {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length >= 64 && decode.length <= 1024 && decode.length % 16 == 0) {
                return decode;
            }
            throw new IllegalArgumentException("Invalid encrypted comment size");
        }
        throw new IllegalArgumentException("Invalid encrypted comment base64");
    }

    public static String decryptComment(h0 h0Var, String str, String str2) {
        byte[] bArr;
        if (h0Var != null && !h0Var.e()) {
            if (isValidAddress(str)) {
                String encryptedCommentBody = encryptedCommentBody(decodeEncryptedComment(str2));
                byte[] c10 = h0Var.c();
                try {
                    bArr = nativeDecryptRawComment(c10, str, encryptedCommentBody);
                } catch (Throwable th2) {
                    th = th2;
                    bArr = null;
                }
                try {
                    String str3 = new String(bArr, StandardCharsets.UTF_8);
                    Arrays.fill(c10, (byte) 0);
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    return str3;
                } catch (Throwable th3) {
                    th = th3;
                    Arrays.fill(c10, (byte) 0);
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    throw th;
                }
            }
            throw new IllegalArgumentException("Valid sender address is required");
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    private String decryptMessageComment(byte[] bArr, JSONObject jSONObject) {
        String str = null;
        String optString = jSONObject.optString("source", null);
        JSONObject optJSONObject = jSONObject.optJSONObject("message_content");
        if (optJSONObject != null) {
            str = optJSONObject.optString("body", null);
        }
        if (optString != null && !optString.isEmpty() && str != null && !str.isEmpty()) {
            return new String(nativeDecryptComment(this.ptr, bArr, optString, str), StandardCharsets.UTF_8);
        }
        throw new IllegalStateException("Encrypted transaction message is incomplete");
    }

    private String decryptTransactionCommentResponse(byte[] bArr, byte[] bArr2) {
        JSONArray optJSONArray = new JSONObject(new String(bArr2, StandardCharsets.UTF_8)).optJSONArray("transactions");
        if (optJSONArray != null) {
            if (optJSONArray.length() != 0) {
                RuntimeException e7 = null;
                String str = null;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i12);
                    JSONObject optJSONObject = jSONObject.optJSONObject("in_msg");
                    if (isEncryptedComment(optJSONObject)) {
                        i10++;
                        try {
                            str = decryptMessageComment(bArr, optJSONObject);
                            i11++;
                        } catch (RuntimeException e10) {
                            e7 = e10;
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("out_msgs");
                    if (optJSONArray2 != null) {
                        for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i13);
                            if (isEncryptedComment(jSONObject2)) {
                                i10++;
                                try {
                                    str = decryptMessageComment(bArr, jSONObject2);
                                    i11++;
                                } catch (RuntimeException e11) {
                                    e7 = e11;
                                }
                            }
                        }
                    }
                }
                if (i10 != 0) {
                    if (i11 == 0) {
                        if (e7 != null) {
                            throw e7;
                        }
                        throw new IllegalStateException("Transaction comment could not be decrypted");
                    } else if (i11 == 1) {
                        return str;
                    } else {
                        throw new IllegalStateException("Transaction contains multiple decryptable comments");
                    }
                }
                throw new IllegalStateException("Transaction has no encrypted comment");
            }
            throw new IllegalStateException("Transaction not found");
        }
        throw new IllegalStateException("Toncenter returned an invalid transaction response");
    }

    private static String encryptedCommentBody(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int z10 = hg.c.z(bArr.length, -91, 127, 1);
        int length = (z10 * 2) + bArr.length + 4 + z10;
        int i13 = length - 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length + 11);
        byteArrayOutputStream.write(new byte[]{-75, -18, -100, 114, 1, 2, (byte) z10, 1, 0, (byte) (i13 >> 8), (byte) i13, 0}, 0, 12);
        int i14 = 0;
        int i15 = 0;
        while (i14 < z10) {
            if (i14 == 0) {
                i10 = 35;
            } else {
                i10 = 127;
            }
            int min = Math.min(i10, bArr.length - i15);
            int i16 = i14 + 1;
            if (i16 < z10) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            byteArrayOutputStream.write(i11);
            if (i14 == 0) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            byteArrayOutputStream.write((i12 + min) * 2);
            if (i14 == 0) {
                byteArrayOutputStream.write(33);
                byteArrayOutputStream.write(103);
                byteArrayOutputStream.write(218);
                byteArrayOutputStream.write(75);
            }
            byteArrayOutputStream.write(bArr, i15, min);
            if (i11 != 0) {
                byteArrayOutputStream.write(i16);
            }
            i15 += min;
            i14 = i16;
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static java.lang.String encryptedCommentPayload(java.lang.String r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.encryptedCommentPayload(java.lang.String):java.lang.String");
    }

    private static byte[] encryptedCommentPreview(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 <= 960) {
            int i14 = ((16 - (i10 % 16)) % 16) + i10 + 64;
            int z10 = hg.c.z(i14, -91, 127, 1);
            int i15 = (z10 * 2) + i14 + 4 + z10;
            int i16 = i15 - 1;
            ByteBuffer allocate = ByteBuffer.allocate(i15 + 11);
            allocate.putInt(-1242653582);
            allocate.put((byte) 1);
            allocate.put((byte) 2);
            allocate.put((byte) z10).put((byte) 1).put((byte) 0);
            allocate.putShort((short) i16).put((byte) 0);
            int i17 = 0;
            while (i17 < z10) {
                if (i17 == 0) {
                    i11 = 35;
                } else {
                    i11 = 127;
                }
                int min = Math.min(i14, i11);
                int i18 = i17 + 1;
                if (i18 < z10) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                allocate.put((byte) i12);
                if (i17 == 0) {
                    i13 = 4;
                } else {
                    i13 = 0;
                }
                allocate.put((byte) ((i13 + min) * 2));
                if (i17 == 0) {
                    allocate.putInt(560454219);
                }
                allocate.position(allocate.position() + min);
                if (i12 != 0) {
                    allocate.put((byte) i18);
                }
                i14 -= min;
                i17 = i18;
            }
            return Base64.encode(allocate.array(), 2);
        }
        throw new IllegalArgumentException("The encrypted comment exceeds 960 UTF-8 bytes");
    }

    private static String errorMessage(Exception exc) {
        if (exc.getMessage() == null) {
            return "NULL_ERROR";
        }
        return exc.getMessage();
    }

    public static String[] getMnemonicWordlist() {
        if (mnemonicWordlist == null) {
            mnemonicWordlist = mnemonicWordlist();
        }
        return mnemonicWordlist;
    }

    public static boolean isEncryptedComment(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        Object opt = jSONObject.opt("opcode");
        if (opt instanceof Number) {
            if ((4294967295L & ((Number) opt).longValue()) != 560454219) {
                return false;
            }
            return true;
        } else if (!(opt instanceof String)) {
            return false;
        } else {
            if ((4294967295L & Long.decode((String) opt).longValue()) != 560454219) {
                return false;
            }
            return true;
        }
    }

    public static boolean isFailedPhase(SendPhase sendPhase) {
        if (sendPhase == null) {
            return false;
        }
        switch (sendPhase.ordinal()) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public static boolean isFinalPhase(SendPhase sendPhase) {
        if (sendPhase == null) {
            return false;
        }
        switch (sendPhase.ordinal()) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public static boolean isPendingPhase(SendPhase sendPhase) {
        if (sendPhase != null && sendPhase != SendPhase.IDLE && !isFinalPhase(sendPhase)) {
            return true;
        }
        return false;
    }

    public static boolean isTgWalletSecretPhrase(h0 h0Var) {
        try {
            secretPhraseToPublicKey(h0Var);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean isValidAddress(String str) {
        if (str != null && !str.isEmpty() && nativeIsValidAddress(str)) {
            return true;
        }
        return false;
    }

    public static native boolean isValidCellBoc(String str);

    public static boolean isValidRecipientAddress(String str) {
        if (!isValidAddress(str)) {
            return false;
        }
        if (str.indexOf(58) < 0 && (Base64.decode(str.replace('-', '+').replace('_', '/'), 2)[0] & 128) != 0) {
            return false;
        }
        return true;
    }

    public void lambda$balance$14(Utilities.Callback2 callback2) {
        String message;
        Long l4 = null;
        try {
            message = null;
            l4 = Long.valueOf(nativeBalance(this.ptr));
        } catch (RuntimeException e7) {
            if (e7.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e7.getMessage();
            }
        }
        AndroidUtilities.runOnUIThread(new l(14, callback2, l4, message));
    }

    public void lambda$close$53() {
        ScheduledFuture<?> scheduledFuture = this.resolutionTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        try {
            nativeClose(this.ptr);
        } finally {
            this.ptr = 0L;
            this.worker.shutdown();
        }
    }

    public void lambda$decryptTransactionComment$45(String str, byte[] bArr, Utilities.Callback2 callback2) {
        String message;
        String str2 = null;
        try {
            try {
                HttpTransport httpTransport = this.transport;
                long j3 = this.nextAuxiliaryRequestId;
                this.nextAuxiliaryRequestId = j3 - 1;
                String decryptTransactionCommentResponse = decryptTransactionCommentResponse(bArr, httpTransport.execute(j3, "https://toncenter.com/api/v3/transactions?hash=" + URLEncoder.encode(str, "UTF-8") + "&limit=1", false, new byte[0], 15000L));
                Arrays.fill(bArr, (byte) 0);
                str2 = decryptTransactionCommentResponse;
                message = null;
            } catch (Exception e7) {
                if (e7.getMessage() == null) {
                    message = "Could not decrypt transaction comment";
                } else {
                    message = e7.getMessage();
                }
                Arrays.fill(bArr, (byte) 0);
            }
            AndroidUtilities.runOnUIThread(new l(callback2, str2, message, 12));
        } catch (Throwable th2) {
            Arrays.fill(bArr, (byte) 0);
            throw th2;
        }
    }

    public void lambda$emulateRotateKey$29(Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        callback2.run(wallettransaction, str);
    }

    public void lambda$emulateRotateKey$30(Utilities.Callback2 callback2) {
        String errorMessage;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e7) {
            errorMessage = errorMessage(e7);
            wallettransaction = null;
        }
        if (!this.closed) {
            wallettransaction = nativeEmulateRotateKey(this.ptr, this.address);
            errorMessage = null;
            AndroidUtilities.runOnUIThread(new k6(this, callback2, wallettransaction, errorMessage, 1));
            return;
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public static void lambda$emulateSend$15(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str) {
        if (!atomicBoolean.get()) {
            callback2.run(wallettransaction, str);
        }
    }

    public Void lambda$emulateSend$16(AtomicBoolean atomicBoolean, byte[] bArr, byte[] bArr2, String str, long j3, Utilities.Callback2 callback2) {
        boolean z10;
        TL_wallet.walletTransaction nativeEmulateSend;
        String str2;
        if (atomicBoolean.get()) {
            return null;
        }
        if (bArr != null && bArr2 != null) {
            try {
                bArr = encryptedCommentPreview(bArr.length);
            } catch (RuntimeException e7) {
                str2 = errorMessage(e7);
                nativeEmulateSend = null;
            }
        }
        byte[] bArr3 = bArr;
        long j10 = this.ptr;
        if (bArr2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        nativeEmulateSend = nativeEmulateSend(j10, str, j3, bArr3, z10);
        str2 = null;
        AndroidUtilities.runOnUIThread(new n6(atomicBoolean, callback2, nativeEmulateSend, str2, 14));
        return null;
    }

    public static void lambda$emulateSend$17(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2) {
        if (!atomicBoolean.get()) {
            callback2.run(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSend$18(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    public void lambda$emulateSendNFT$19(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str) {
        if (!atomicBoolean.get()) {
            if (this.closed) {
                wallettransaction = null;
            }
            if (this.closed) {
                str = "NO_WALLET_ENGINE";
            }
            callback2.run(wallettransaction, str);
        }
    }

    public Void lambda$emulateSendNFT$20(AtomicBoolean atomicBoolean, String str, String str2, String str3, Utilities.Callback2 callback2) {
        TL_wallet.walletTransaction wallettransaction;
        String errorMessage;
        byte[] bytes;
        if (atomicBoolean.get()) {
            return null;
        }
        try {
        } catch (RuntimeException e7) {
            e = e7;
            wallettransaction = null;
        }
        if (!this.closed) {
            String uuid = UUID.randomUUID().toString();
            long j3 = this.ptr;
            if (str3 == null) {
                bytes = null;
            } else {
                bytes = str3.getBytes(StandardCharsets.UTF_8);
            }
            wallettransaction = nativeEmulateSendNFT(j3, str, str2, bytes, uuid, 100000000L, 10000000L);
            try {
                this.nftPreviewRecipient = str;
                this.nftPreviewAddress = str2;
                this.nftPreviewComment = str3;
                this.nftPreviewOperationId = uuid;
                errorMessage = null;
            } catch (RuntimeException e10) {
                e = e10;
                errorMessage = errorMessage(e);
                AndroidUtilities.runOnUIThread(new g90(this, atomicBoolean, callback2, wallettransaction, errorMessage, 29));
                return null;
            }
            AndroidUtilities.runOnUIThread(new g90(this, atomicBoolean, callback2, wallettransaction, errorMessage, 29));
            return null;
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public static void lambda$emulateSendNFT$21(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2) {
        if (!atomicBoolean.get()) {
            callback2.run(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSendNFT$22(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2) {
        if (!atomicBoolean.get()) {
            callback2.run(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSendNFT$23(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    public void lambda$getTransactionByHash$39(String str, Utilities.Callback callback) {
        TL_wallet.walletTransaction wallettransaction;
        try {
            HttpTransport httpTransport = this.transport;
            long j3 = this.nextAuxiliaryRequestId;
            this.nextAuxiliaryRequestId = j3 - 1;
            wallettransaction = parseTransactionResponse(httpTransport.execute(j3, "https://toncenter.com/api/v3/transactions?hash=" + URLEncoder.encode(str, "UTF-8") + "&limit=1", false, new byte[0], 15000L));
        } catch (Exception e7) {
            FileLog.e(e7);
            wallettransaction = null;
        }
        AndroidUtilities.runOnUIThread(new ii1(14, callback, wallettransaction));
    }

    public static Thread lambda$new$0(Runnable runnable) {
        return new Thread(runnable, "WalletEngine2");
    }

    public void lambda$prepareRotateKey$34(Utilities.Callback4 callback4, PreparedRotation preparedRotation, String str) {
        try {
            if (this.closed) {
                callback4.run(null, null, null, "NO_WALLET_ENGINE");
            } else if (preparedRotation == null) {
                callback4.run(null, null, null, str);
            } else {
                callback4.run(preparedRotation.transfer, preparedRotation.newSecretPhrase, preparedRotation.newPublicKey, null);
            }
            if (preparedRotation != null) {
                preparedRotation.newSecretPhrase.close();
            }
        } catch (Throwable th2) {
            if (preparedRotation != null) {
                preparedRotation.newSecretPhrase.close();
            }
            throw th2;
        }
    }

    public void lambda$prepareRotateKey$35(byte[] bArr, String str, Utilities.Callback4 callback4) {
        String str2;
        PreparedRotation preparedRotation;
        PreparedRotation preparedRotation2 = null;
        try {
            try {
                resolveBeforeNewSend();
            } catch (Throwable th2) {
                Arrays.fill(bArr, (byte) 0);
                throw th2;
            }
        } catch (RuntimeException e7) {
            e = e7;
        }
        if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
            PreparedRotation nativePrepareRotateKey = nativePrepareRotateKey(this.ptr, bArr, str);
            if (nativePrepareRotateKey != null) {
                Arrays.fill(bArr, (byte) 0);
                preparedRotation = nativePrepareRotateKey;
                str2 = null;
                AndroidUtilities.runOnUIThread(new n6(this, callback4, preparedRotation, str2, 0));
                return;
            }
            try {
                throw new IllegalStateException("Could not prepare key rotation");
            } catch (RuntimeException e10) {
                e = e10;
                preparedRotation2 = nativePrepareRotateKey;
                String errorMessage = errorMessage(e);
                Arrays.fill(bArr, (byte) 0);
                str2 = errorMessage;
                preparedRotation = preparedRotation2;
                AndroidUtilities.runOnUIThread(new n6(this, callback4, preparedRotation, str2, 0));
                return;
            }
        }
        throw new IllegalStateException("Previous wallet send is still unresolved");
    }

    public void lambda$prepareSend$49(Utilities.Callback3 callback3, TL_wallet.sendTransfer sendtransfer, String str, String str2) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "NO_WALLET_ENGINE";
        }
        callback3.run(sendtransfer, str, str2);
    }

    public void lambda$prepareSend$50(byte[] r14, java.lang.String r15, long r16, byte[] r18, byte[] r19, java.lang.String r20, org.telegram.messenger.Utilities.Callback3 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.lambda$prepareSend$50(byte[], java.lang.String, long, byte[], byte[], java.lang.String, org.telegram.messenger.Utilities$Callback3):void");
    }

    public void lambda$prepareSendNFT$24(Utilities.Callback2 callback2) {
        String str;
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        } else {
            str = "Recovery phrase is required";
        }
        callback2.run(null, str);
    }

    public void lambda$prepareSendNFT$25(Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        callback2.run(sendtransfer, str);
    }

    public void lambda$prepareSendNFT$26(String str, String str2, String str3, byte[] bArr, Utilities.Callback2 callback2) {
        byte[] bArr2;
        String str4;
        TL_wallet.sendTransfer sendtransfer;
        String uuid;
        byte[] bytes;
        TL_wallet.sendTransfer sendtransfer2 = null;
        try {
            try {
                try {
                } catch (RuntimeException e7) {
                    e = e7;
                }
            } catch (Throwable th2) {
                th = th2;
                Arrays.fill(bArr, (byte) 0);
                throw th;
            }
        } catch (RuntimeException e10) {
            e = e10;
            bArr2 = bArr;
        } catch (Throwable th3) {
            th = th3;
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
        if (!this.closed) {
            resolveBeforeNewSend();
            if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                if (this.nftPreviewOperationId != null && Objects.equals(str, this.nftPreviewRecipient) && Objects.equals(str2, this.nftPreviewAddress) && Objects.equals(str3, this.nftPreviewComment)) {
                    uuid = this.nftPreviewOperationId;
                } else {
                    uuid = UUID.randomUUID().toString();
                }
                String str5 = uuid;
                long j3 = this.ptr;
                if (str3 == null) {
                    bytes = null;
                } else {
                    bytes = str3.getBytes(StandardCharsets.UTF_8);
                }
                bArr2 = bArr;
                PreparedSend nativePrepareSendNFT = nativePrepareSendNFT(j3, bArr2, str, str2, bytes, str5, 100000000L, 10000000L);
                if (nativePrepareSendNFT != null) {
                    TL_wallet.sendTransfer sendtransfer3 = nativePrepareSendNFT.transfer;
                    try {
                        this.nftPreviewOperationId = null;
                        Arrays.fill(bArr2, (byte) 0);
                        sendtransfer = sendtransfer3;
                        str4 = null;
                    } catch (RuntimeException e11) {
                        e = e11;
                        sendtransfer2 = sendtransfer3;
                        String errorMessage = errorMessage(e);
                        Arrays.fill(bArr2, (byte) 0);
                        str4 = errorMessage;
                        sendtransfer = sendtransfer2;
                        AndroidUtilities.runOnUIThread(new e6(this, callback2, sendtransfer, str4, 1));
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new e6(this, callback2, sendtransfer, str4, 1));
                    return;
                }
                throw new IllegalStateException("Could not prepare NFT transfer");
            }
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public void lambda$prepareTonConnectTransfer$4(Utilities.Callback2 callback2, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        callback2.run(sendtransfer, str);
    }

    public void lambda$prepareTonConnectTransfer$5(byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2) {
        String str2;
        TL_wallet.sendTransfer sendtransfer;
        try {
            try {
                try {
                } catch (RuntimeException e7) {
                    e = e7;
                    String h = e2.h("wallet-engine transaction", e);
                    Arrays.fill(bArr, (byte) 0);
                    str2 = h;
                    sendtransfer = null;
                    AndroidUtilities.runOnUIThread(new e6(this, callback2, sendtransfer, str2, 0));
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th3;
            }
        } catch (RuntimeException e10) {
            e = e10;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th32;
        }
        if (!this.closed) {
            resolveBeforeNewSend();
            if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                TL_wallet.sendTransfer sendtransfer2 = nativePrepareTonConnectTransfer(this.ptr, bArr, d2Var.a(), d2Var.f34806a, str).transfer;
                Arrays.fill(bArr, (byte) 0);
                sendtransfer = sendtransfer2;
                str2 = null;
                AndroidUtilities.runOnUIThread(new e6(this, callback2, sendtransfer, str2, 0));
                return;
            }
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$previewSignMessage$7(Utilities.Callback callback, String str) {
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        callback.run(str);
    }

    public void lambda$previewSignMessage$8(d2 d2Var, Utilities.Callback callback) {
        String h;
        try {
        } catch (RuntimeException e7) {
            h = e2.h("preview signing", e7);
        }
        if (!this.closed) {
            nativePreviewSignMessage(this.ptr, d2Var.a(), d2Var.f34806a);
            h = null;
            AndroidUtilities.runOnUIThread(new m6(this, callback, h));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$previewTonConnect$1(Utilities.Callback2 callback2, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        callback2.run(wallettransaction, str);
    }

    public void lambda$previewTonConnect$2(d2 d2Var, Utilities.Callback2 callback2) {
        String h;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e7) {
            h = e2.h("wallet-engine transaction", e7);
            wallettransaction = null;
        }
        if (!this.closed) {
            wallettransaction = nativePreviewTonConnect(this.ptr, d2Var.a(), d2Var.f34806a);
            h = null;
            AndroidUtilities.runOnUIThread(new k6(this, callback2, wallettransaction, h, 0));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$rotateKey$52(RotationCallbacks rotationCallbacks, byte[] bArr, String str) {
        try {
            resolveBeforeNewSend();
            rotationCallbacks.state(SendPhase.VALIDATING.nativeValue, null, null);
            nativeRotateKey(this.ptr, bArr, str, rotationCallbacks);
        } catch (RuntimeException e7) {
            rotationCallbacks.failed(errorMessage(e7));
        } finally {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public void lambda$signMessage$10(Utilities.Callback2 callback2, String str, String str2) {
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "Wallet engine is closed";
        }
        callback2.run(str, str2);
    }

    public void lambda$signMessage$11(byte[] bArr, d2 d2Var, String str, Utilities.Callback2 callback2) {
        String str2;
        String str3;
        try {
            try {
                try {
                } catch (RuntimeException e7) {
                    e = e7;
                    String h = e2.h("sign message", e);
                    Arrays.fill(bArr, (byte) 0);
                    str2 = h;
                    str3 = null;
                    AndroidUtilities.runOnUIThread(new n6((Object) this, (Object) callback2, str3, (Object) str2, 12));
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th3;
            }
        } catch (RuntimeException e10) {
            e = e10;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th32;
        }
        if (!this.closed) {
            String nativeSignMessage = nativeSignMessage(this.ptr, bArr, d2Var.a(), d2Var.f34806a, str);
            Arrays.fill(bArr, (byte) 0);
            str3 = nativeSignMessage;
            str2 = null;
            AndroidUtilities.runOnUIThread(new n6((Object) this, (Object) callback2, str3, (Object) str2, 12));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    private static native String[] mnemonicWordlist();

    private static native long nativeBalance(long j3);

    private static native void nativeClose(long j3);

    private static native long nativeCreate(int i10, String str, byte[] bArr, HttpTransport httpTransport, String str2);

    private static native ImportedWalletProof nativeCreateImportProof(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, boolean z10);

    private static native byte[] nativeDecryptComment(long j3, byte[] bArr, String str, String str2);

    private static native byte[] nativeDecryptRawComment(byte[] bArr, String str, String str2);

    private static native TL_wallet.walletTransaction nativeEmulateRotateKey(long j3, String str);

    private static native TL_wallet.walletTransaction nativeEmulateSend(long j3, String str, long j10, byte[] bArr, boolean z10);

    private static native TL_wallet.walletTransaction nativeEmulateSendNFT(long j3, String str, String str2, byte[] bArr, String str3, long j10, long j11);

    private static native boolean nativeIsValidAddress(String str);

    public static native String nativeMessageBodyHash(String str);

    private static native PreparedRotation nativePrepareRotateKey(long j3, byte[] bArr, String str);

    private static native PreparedSend nativePrepareSend(long j3, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, String str3);

    private static native PreparedSend nativePrepareSendNFT(long j3, byte[] bArr, String str, String str2, byte[] bArr2, String str3, long j10, long j11);

    private static native PreparedSend nativePrepareTonConnectTransfer(long j3, byte[] bArr, String[] strArr, long j10, String str);

    private static native void nativePreviewSignMessage(long j3, String[] strArr, long j10);

    private static native TL_wallet.walletTransaction nativePreviewTonConnect(long j3, String[] strArr, long j10);

    private static native SendResolution nativeResolvePending(long j3);

    private static native void nativeRotateKey(long j3, byte[] bArr, String str, RotationCallbacks rotationCallbacks);

    private static native String nativeSecretPhraseToAddress(byte[] bArr);

    private static native byte[] nativeSecretPhraseToPublicKey(byte[] bArr);

    private static native TL_wallet.walletTransaction nativeSend(long j3, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, SendCallbacks sendCallbacks);

    private static native String nativeSignMessage(long j3, byte[] bArr, String[] strArr, long j10, String str);

    private static native byte[] nativeTonConnectCrypto(byte[] bArr, byte[] bArr2);

    private static native String nativeTransactionAddress(String str);

    private static TL_wallet.walletTransaction parseTransactionResponse(byte[] bArr) {
        boolean z10;
        String str;
        SendPhase sendPhase;
        JSONArray jSONArray = new JSONObject(new String(bArr, StandardCharsets.UTF_8)).getJSONArray("transactions");
        JSONObject jSONObject = null;
        boolean z11 = true;
        if (jSONArray.length() != 1) {
            return null;
        }
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        JSONObject optJSONObject = jSONObject2.optJSONObject("in_msg");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("out_msgs");
        String str2 = "source";
        if (optJSONObject != null && !optJSONObject.isNull("source") && !optJSONObject.getString("source").isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int length = jSONArray2.length();
        if (!z10 ? length != 1 : length != 0) {
            return null;
        }
        if (!z10) {
            optJSONObject = jSONArray2.getJSONObject(0);
        }
        if (!z10) {
            str2 = "destination";
        }
        if (optJSONObject.isNull(str2)) {
            return null;
        }
        long parseLong = Long.parseLong(optJSONObject.getString("value"));
        long parseLong2 = Long.parseLong(jSONObject2.getString("total_fees"));
        if (parseLong < 0 || parseLong2 < 0) {
            return null;
        }
        TL_wallet.walletTransaction createTransaction = createTransaction(optJSONObject.getString(str2), parseLong);
        createTransaction.incoming = z10;
        createTransaction.tx_hash = jSONObject2.getString("hash");
        StringBuilder sb2 = new StringBuilder("chain:");
        sb2.append(createTransaction.tx_hash);
        if (z10) {
            str = ":in:0";
        } else {
            str = ":out:0";
        }
        sb2.append(str);
        createTransaction.f20304id = sb2.toString();
        long j3 = jSONObject2.getLong("now");
        int i10 = (int) j3;
        if (j3 == i10) {
            createTransaction.date = i10;
            createTransaction.fee = parseLong2;
            if (!jSONObject2.getJSONObject("description").getBoolean("aborted") && !optJSONObject.optBoolean("bounced", false)) {
                z11 = false;
            }
            createTransaction.failed = z11;
            if (z11) {
                sendPhase = SendPhase.FAILED;
            } else {
                sendPhase = SendPhase.CONFIRMED;
            }
            createTransaction.phase = sendPhase;
            createTransaction.comment_encrypted = isEncryptedComment(optJSONObject);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("message_content");
            if (optJSONObject2 != null) {
                jSONObject = optJSONObject2.optJSONObject("decoded");
            }
            if (createTransaction.comment_encrypted) {
                createTransaction.comment = encryptedCommentPayload(optJSONObject2.getString("body"));
                return createTransaction;
            }
            if (jSONObject != null && "text_comment".equals(jSONObject.optString("type"))) {
                createTransaction.comment = jSONObject.getString("comment");
            }
            return createTransaction;
        }
        throw new ArithmeticException();
    }

    private static int readBocInt(ByteBuffer byteBuffer, int i10) {
        if (i10 >= 1 && i10 <= 4) {
            long j3 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                j3 = (j3 << 8) | (byteBuffer.get() & 255);
            }
            if (j3 <= 2147483647L) {
                return (int) j3;
            }
            throw new IllegalArgumentException("BOC integer overflow");
        }
        throw new IllegalArgumentException("Invalid BOC integer size");
    }

    private void resolveBeforeNewSend() {
        if (!this.closed) {
            return;
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    private long resolvePendingSend() {
        return 4000L;
    }

    public static boolean sameTonConnectAddress(String str, String str2) {
        if (isValidAddress(str) && isValidAddress(str2) && nativeTransactionAddress(str).equals(nativeTransactionAddress(str2))) {
            return true;
        }
        return false;
    }

    public static String secretPhraseToAddress(h0 h0Var) {
        if (h0Var != null && !h0Var.e()) {
            byte[] c10 = h0Var.c();
            try {
                return nativeSecretPhraseToAddress(c10);
            } finally {
                Arrays.fill(c10, (byte) 0);
            }
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    public static byte[] secretPhraseToAnchorPublicKey(h0 h0Var) {
        h0 h0Var2;
        if (h0Var != null && !h0Var.e()) {
            int h = h0Var.h();
            if (h != 12 && h != 24) {
                throw new IllegalArgumentException("Recovery phrase must contain 12 or 24 words");
            }
            synchronized (h0Var) {
                try {
                    h0Var.a();
                    int i10 = 0;
                    while (true) {
                        byte[] bArr = h0Var.f35038a;
                        if (i10 >= bArr.length || !h0.f(bArr[i10])) {
                            break;
                        }
                        i10++;
                    }
                    int i11 = 0;
                    int i12 = i10;
                    while (i11 < 12) {
                        if (i12 != h0Var.f35038a.length) {
                            while (true) {
                                byte[] bArr2 = h0Var.f35038a;
                                if (i12 >= bArr2.length || h0.f(bArr2[i12])) {
                                    break;
                                }
                                i12++;
                            }
                            i11++;
                            if (i11 < 12) {
                                while (true) {
                                    byte[] bArr3 = h0Var.f35038a;
                                    if (i12 < bArr3.length && h0.f(bArr3[i12])) {
                                        i12++;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Not enough recovery words");
                        }
                    }
                    byte[] copyOfRange = Arrays.copyOfRange(h0Var.f35038a, i10, i12);
                    h0Var2 = new h0(copyOfRange);
                    Arrays.fill(copyOfRange, (byte) 0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                byte[] secretPhraseToPublicKey = secretPhraseToPublicKey(h0Var2);
                h0Var2.close();
                return secretPhraseToPublicKey;
            } catch (Throwable th3) {
                try {
                    h0Var2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    public static byte[] secretPhraseToPublicKey(h0 h0Var) {
        if (h0Var != null && !h0Var.e()) {
            byte[] c10 = h0Var.c();
            try {
                return nativeSecretPhraseToPublicKey(c10);
            } finally {
                Arrays.fill(c10, (byte) 0);
            }
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    private static void setTransactionPhase(TL_wallet.walletTransaction wallettransaction, int i10) {
        boolean z10;
        SendPhase fromNative = SendPhase.fromNative(i10);
        wallettransaction.phase = fromNative;
        wallettransaction.failed = isFailedPhase(fromNative);
        if (!wallettransaction.preview && isPendingPhase(wallettransaction.phase)) {
            z10 = true;
        } else {
            z10 = false;
        }
        wallettransaction.pending = z10;
    }

    public static JSONObject signData(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject, String str2, int i10) {
        JSONObject jSONObject2 = tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("signData", jSONObject).put("signDomain", str2).put("timestamp", i10));
        return new JSONObject().put("signature", jSONObject2.getString("signature")).put("address", jSONObject2.getString("address")).put("timestamp", i10).put("domain", str2).put("payload", jSONObject);
    }

    public static java.lang.String textCommentFromBody(java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.textCommentFromBody(java.lang.String):java.lang.String");
    }

    public static String toUserFriendlyAddress(String str) {
        return nativeTransactionAddress(str);
    }

    public static JSONObject tonConnectCrypto(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject) {
        String str2;
        if (tonconnectsession != null && tonconnectsession.nonce != null && (str2 = tonconnectsession.dapp_client_id) != null && h0Var != null && str != null && bArr != null) {
            jSONObject.put("dappClientId", str2);
            jSONObject.put("sessionNonce", Base64.encodeToString(tonconnectsession.nonce, 2));
            jSONObject.put("clientId", tonconnectsession.client_id);
            jSONObject.put("walletPublicKey", Base64.encodeToString(bArr, 2));
            jSONObject.put("walletAddress", str);
            byte[] c10 = h0Var.c();
            byte[] bArr2 = null;
            try {
                String jSONObject2 = jSONObject.toString();
                Charset charset = StandardCharsets.UTF_8;
                bArr2 = nativeTonConnectCrypto(c10, jSONObject2.getBytes(charset));
                return new JSONObject(new String(bArr2, charset));
            } finally {
                Arrays.fill(c10, (byte) 0);
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
            }
        }
        throw new IllegalArgumentException("Missing TON Connect crypto parameters");
    }

    public synchronized void balance(Utilities.Callback2<Long, String> callback2) {
        this.worker.execute(new i6(this, callback2, 1));
    }

    @Override
    public synchronized void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.transport.close();
        this.worker.execute(new n(this, 10));
    }

    public void decryptTransactionComment(h0 h0Var, String str, Utilities.Callback2<String, String> callback2) {
        if (callback2 != null) {
            if (h0Var != null && !h0Var.e()) {
                if (str != null && !str.isEmpty()) {
                    if (this.closed) {
                        AndroidUtilities.runOnUIThread(new h6(5, callback2));
                        return;
                    }
                    byte[] c10 = h0Var.c();
                    try {
                        this.worker.execute(new n6(this, str, c10, callback2));
                        return;
                    } catch (RejectedExecutionException unused) {
                        Arrays.fill(c10, (byte) 0);
                        AndroidUtilities.runOnUIThread(new h6(6, callback2));
                        return;
                    }
                }
                AndroidUtilities.runOnUIThread(new h6(4, callback2));
                return;
            }
            AndroidUtilities.runOnUIThread(new h6(3, callback2));
            return;
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public void emulateRotateKey(Utilities.Callback2<TL_wallet.walletTransaction, String> callback2) {
        if (callback2 != null) {
            if (this.closed) {
                AndroidUtilities.runOnUIThread(new h6(1, callback2));
                return;
            }
            try {
                this.worker.execute(new i6(this, callback2, 0));
                return;
            } catch (RejectedExecutionException unused) {
                AndroidUtilities.runOnUIThread(new h6(2, callback2));
                return;
            }
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public Runnable emulateSend(final String str, final long j3, String str2, final byte[] bArr, final Utilities.Callback2<TL_wallet.walletTransaction, String> callback2) {
        byte[] bytes;
        if (str2 == null) {
            bytes = null;
        } else {
            bytes = str2.getBytes(StandardCharsets.UTF_8);
        }
        final byte[] bArr2 = bytes;
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public final Object call() {
                Void lambda$emulateSend$16;
                lambda$emulateSend$16 = WalletEngine2.this.lambda$emulateSend$16(atomicBoolean, bArr2, bArr, str, j3, callback2);
                return lambda$emulateSend$16;
            }
        });
        try {
            this.worker.execute(futureTask);
        } catch (RejectedExecutionException unused) {
            AndroidUtilities.runOnUIThread(new p6(atomicBoolean, callback2, 0));
        }
        return new q6(atomicBoolean, futureTask, 0);
    }

    public synchronized Runnable emulateSendNFT(String str, String str2, Utilities.Callback2<TL_wallet.walletTransaction, String> callback2) {
        return emulateSendNFT(str, str2, null, callback2);
    }

    public void getTransactionByHash(String str, Utilities.Callback<TL_wallet.walletTransaction> callback) {
        if (callback != null) {
            if (str != null && !str.isEmpty() && !this.closed) {
                try {
                    this.worker.execute(new m6(this, str, callback));
                    return;
                } catch (RejectedExecutionException unused) {
                    AndroidUtilities.runOnUIThread(new j6(2, callback));
                    return;
                }
            }
            AndroidUtilities.runOnUIThread(new j6(1, callback));
            return;
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public void prepareRotateKey(h0 h0Var, String str, final Utilities.Callback4<TL_wallet.sendTransfer, h0, byte[], String> callback4) {
        if (callback4 != null) {
            if (this.closed) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                callback4.run(null, null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                callback4.run(null, null, null, "Recovery phrase is required");
                                return;
                            default:
                                callback4.run(null, null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            } else if (h0Var != null && !h0Var.e()) {
                byte[] c10 = h0Var.c();
                try {
                    this.worker.execute(new n6(this, c10, str, callback4));
                    return;
                } catch (RejectedExecutionException unused) {
                    Arrays.fill(c10, (byte) 0);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    callback4.run(null, null, null, "NO_WALLET_ENGINE");
                                    return;
                                case 1:
                                    callback4.run(null, null, null, "Recovery phrase is required");
                                    return;
                                default:
                                    callback4.run(null, null, null, "NO_WALLET_ENGINE");
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                callback4.run(null, null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                callback4.run(null, null, null, "Recovery phrase is required");
                                return;
                            default:
                                callback4.run(null, null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public void prepareSend(h0 h0Var, String str, long j3, String str2, byte[] bArr, String str3, final Utilities.Callback3<TL_wallet.sendTransfer, String, String> callback3) {
        byte[] bArr2;
        if (callback3 != null) {
            if (this.closed) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                callback3.run(null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                callback3.run(null, null, "Recovery phrase is required");
                                return;
                            default:
                                callback3.run(null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            } else if (h0Var != null && !h0Var.e()) {
                byte[] bArr3 = null;
                if (bArr == null) {
                    bArr2 = null;
                } else {
                    bArr2 = (byte[]) bArr.clone();
                }
                byte[] c10 = h0Var.c();
                if (str2 != null) {
                    bArr3 = str2.getBytes(StandardCharsets.UTF_8);
                }
                try {
                    this.worker.execute(new dw(this, c10, str, j3, bArr3, bArr2, str3, callback3));
                    return;
                } catch (RejectedExecutionException unused) {
                    Arrays.fill(c10, (byte) 0);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    callback3.run(null, null, "NO_WALLET_ENGINE");
                                    return;
                                case 1:
                                    callback3.run(null, null, "Recovery phrase is required");
                                    return;
                                default:
                                    callback3.run(null, null, "NO_WALLET_ENGINE");
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                callback3.run(null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                callback3.run(null, null, "Recovery phrase is required");
                                return;
                            default:
                                callback3.run(null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public synchronized void prepareSendNFT(h0 h0Var, String str, String str2, Utilities.Callback2<TL_wallet.sendTransfer, String> callback2) {
        prepareSendNFT(h0Var, str, str2, null, callback2);
    }

    public void prepareTonConnectTransfer(h0 h0Var, d2 d2Var, String str, Utilities.Callback2<TL_wallet.sendTransfer, String> callback2) {
        Utilities.Callback2<TL_wallet.sendTransfer, String> callback22;
        byte[] c10 = h0Var.c();
        try {
            callback22 = callback2;
        } catch (RejectedExecutionException e7) {
            e = e7;
            callback22 = callback2;
        }
        try {
            this.worker.execute(new g6(this, c10, d2Var, str, callback22, 1));
        } catch (RejectedExecutionException e10) {
            e = e10;
            RejectedExecutionException rejectedExecutionException = e;
            Arrays.fill(c10, (byte) 0);
            AndroidUtilities.runOnUIThread(new r41(e2.h("schedule transaction signing", rejectedExecutionException), 1, callback22));
        }
    }

    public void previewSignMessage(d2 d2Var, Utilities.Callback<String> callback) {
        try {
            this.worker.execute(new l(this, d2Var, callback, 13));
        } catch (RejectedExecutionException unused) {
            AndroidUtilities.runOnUIThread(new j6(0, callback));
        }
    }

    public void previewTonConnect(d2 d2Var, Utilities.Callback2<TL_wallet.walletTransaction, String> callback2) {
        try {
            this.worker.execute(new l(this, d2Var, callback2, 15));
        } catch (RejectedExecutionException e7) {
            AndroidUtilities.runOnUIThread(new r41(e2.h("schedule transaction preview", e7), 2, callback2));
        }
    }

    public void rotateKey(h0 h0Var, Utilities.Callback2<h0, byte[]> callback2, Utilities.Callback2<SendPhase, String> callback22) {
        RotationCallbacks rotationCallbacks = new RotationCallbacks(callback22, callback2);
        if (h0Var != null && !h0Var.e() && callback2 != null) {
            byte[] c10 = h0Var.c();
            try {
                this.worker.execute(new n6(this, rotationCallbacks, c10, UUID.randomUUID().toString(), 1));
                return;
            } catch (RejectedExecutionException unused) {
                Arrays.fill(c10, (byte) 0);
                rotationCallbacks.failed("NO_WALLET_ENGINE");
                return;
            }
        }
        rotationCallbacks.failed("Current recovery phrase and replacement callback are required");
    }

    public void signMessage(h0 h0Var, d2 d2Var, String str, Utilities.Callback2<String, String> callback2) {
        Utilities.Callback2<String, String> callback22;
        byte[] c10 = h0Var.c();
        try {
            callback22 = callback2;
        } catch (RejectedExecutionException unused) {
            callback22 = callback2;
        }
        try {
            this.worker.execute(new g6(this, c10, d2Var, str, callback22, 0));
        } catch (RejectedExecutionException unused2) {
            Arrays.fill(c10, (byte) 0);
            AndroidUtilities.runOnUIThread(new h6(0, callback22));
        }
    }

    public synchronized Runnable emulateSendNFT(final String str, final String str2, final String str3, final Utilities.Callback2<TL_wallet.walletTransaction, String> callback2) {
        try {
            try {
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                FutureTask futureTask = new FutureTask(new Callable() {
                    @Override
                    public final Object call() {
                        Void lambda$emulateSendNFT$20;
                        lambda$emulateSendNFT$20 = WalletEngine2.this.lambda$emulateSendNFT$20(atomicBoolean, str, str2, str3, callback2);
                        return lambda$emulateSendNFT$20;
                    }
                });
                if (this.closed) {
                    AndroidUtilities.runOnUIThread(new p6(atomicBoolean, callback2, 1));
                } else {
                    try {
                        this.worker.execute(futureTask);
                    } catch (RejectedExecutionException unused) {
                        AndroidUtilities.runOnUIThread(new p6(atomicBoolean, callback2, 2));
                    }
                }
                return new q6(atomicBoolean, futureTask, 1);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized void prepareSendNFT(h0 h0Var, String str, String str2, String str3, Utilities.Callback2<TL_wallet.sendTransfer, String> callback2) {
        Utilities.Callback2<TL_wallet.sendTransfer, String> callback22;
        try {
            try {
                if (!this.closed && h0Var != null && !h0Var.e()) {
                    byte[] c10 = h0Var.c();
                    try {
                        callback22 = callback2;
                        try {
                            this.worker.execute(new ai.a9(this, str, str2, str3, c10, callback22, 17));
                        } catch (RejectedExecutionException unused) {
                            Arrays.fill(c10, (byte) 0);
                            AndroidUtilities.runOnUIThread(new h6(7, callback22));
                            return;
                        }
                    } catch (RejectedExecutionException unused2) {
                        callback22 = callback2;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new i6(this, callback2, 2));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
