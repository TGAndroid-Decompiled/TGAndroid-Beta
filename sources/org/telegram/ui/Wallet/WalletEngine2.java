package org.telegram.ui.Wallet;

import android.util.Base64;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c01;
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
    private l7 pendingSend;
    private long ptr;
    public final byte[] publicKey;
    private ScheduledFuture<?> resolutionTask;
    private final HttpTransport transport;
    private final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor(new h2.l0(5));
    private long nextAuxiliaryRequestId = -1;

    public static class HttpTransport {
        private boolean closed;
        public final int currentAccount;
        private final HashMap<Long, k7> pending = new HashMap<>();

        public static class HostException extends RuntimeException {
            final int kind;

            public HostException(int i7) {
                super("Wallet provider request failed");
                this.kind = i7;
            }
        }

        public HttpTransport(int i7) {
            this.currentAccount = i7;
        }

        private ConnectionsManager getConnectionsManager() {
            return ConnectionsManager.getInstance(this.currentAccount);
        }

        public static void lambda$execute$0(k7 k7Var, TL_toncenter.apiResponse apiresponse, TLRPC.TL_error tL_error) {
            TLRPC.TL_dataJSON tL_dataJSON;
            String str;
            if (tL_error != null) {
                k7Var.a(null, new HostException(3));
            } else if (apiresponse != null && (tL_dataJSON = apiresponse.response) != null && (str = tL_dataJSON.data) != null) {
                k7Var.a(str.getBytes(StandardCharsets.UTF_8), null);
            } else {
                k7Var.a(null, new HostException(7));
            }
        }

        public void cancel(long j3) {
            synchronized (this.pending) {
                try {
                    k7 k7Var = this.pending.get(Long.valueOf(j3));
                    if (k7Var != null) {
                        k7Var.a(null, new HostException(6));
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
                    for (k7 k7Var : this.pending.values()) {
                        k7Var.a(null, new HostException(6));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public byte[] execute(long j3, String str, boolean z9, byte[] bArr, long j10) {
            String str2;
            int i7;
            HashMap<Long, k7> hashMap;
            try {
                URI create = URI.create(str);
                if ("https".equalsIgnoreCase(create.getScheme()) && "toncenter.com".equalsIgnoreCase(create.getHost()) && create.getRawUserInfo() == null && create.getRawFragment() == null && ((create.getPort() == -1 || create.getPort() == 443) && j10 > 0)) {
                    TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                    performapirequest.post = z9;
                    performapirequest.endpoint = create.getRawPath();
                    performapirequest.query = create.getRawQuery();
                    if (bArr.length == 0) {
                        str2 = null;
                    } else {
                        str2 = new String(bArr, StandardCharsets.UTF_8);
                    }
                    performapirequest.payload = str2;
                    k7 k7Var = new k7();
                    long nanoTime = System.nanoTime();
                    try {
                        try {
                            HashMap<Long, k7> hashMap2 = this.pending;
                            try {
                                synchronized (hashMap2) {
                                    try {
                                        try {
                                            if (!this.closed) {
                                                try {
                                                    this.pending.put(Long.valueOf(j3), k7Var);
                                                    try {
                                                        k7Var.f42709b = getConnectionsManager().sendRequestTyped(performapirequest, new d3.b(3), new d(k7Var, 9), qp.s1(this.currentAccount).N3, 0);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        hashMap = hashMap2;
                                                        i7 = 6;
                                                        try {
                                                            throw th;
                                                        } catch (InterruptedException unused) {
                                                            Thread.currentThread().interrupt();
                                                            k7Var.a(null, new HostException(i7));
                                                            throw new HostException(i7);
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
                                        i7 = 6;
                                        hashMap = hashMap2;
                                    }
                                }
                                try {
                                    if (!k7Var.f42708a.await(Math.max(0L, TimeUnit.MILLISECONDS.toNanos(j10) - (System.nanoTime() - nanoTime)), TimeUnit.NANOSECONDS)) {
                                        k7Var.a(null, new HostException(2));
                                    }
                                    HostException hostException = k7Var.d;
                                    if (hostException == null) {
                                        byte[] bArr2 = k7Var.f42710c;
                                        synchronized (this.pending) {
                                            try {
                                                this.pending.remove(Long.valueOf(j3));
                                                if (k7Var.d != null && k7Var.f42709b != 0) {
                                                    getConnectionsManager().cancelRequest(k7Var.f42709b, true);
                                                }
                                            } finally {
                                            }
                                        }
                                        return bArr2;
                                    }
                                    throw hostException;
                                } catch (InterruptedException unused2) {
                                    i7 = 6;
                                    Thread.currentThread().interrupt();
                                    k7Var.a(null, new HostException(i7));
                                    throw new HostException(i7);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            synchronized (this.pending) {
                                try {
                                    this.pending.remove(Long.valueOf(j3));
                                    if (k7Var.d != null && k7Var.f42709b != 0) {
                                        getConnectionsManager().cancelRequest(k7Var.f42709b, true);
                                    }
                                    throw th7;
                                } finally {
                                }
                            }
                        }
                    } catch (InterruptedException unused3) {
                        i7 = 6;
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

        private ImportedWalletProof(byte[] bArr, int i7, byte[] bArr2) {
            this.publicKey = bArr;
            this.timestamp = i7;
            this.signature = bArr2;
        }
    }

    public static class PreparedRotation {
        final byte[] newPublicKey;
        final k0 newSecretPhrase;
        final TL_wallet.sendTransfer transfer;

        public PreparedRotation(String str, String str2, byte[] bArr, byte[] bArr2) {
            if (bArr2 != null) {
                try {
                    if (bArr2.length == 32 && bArr != null && bArr.length != 0) {
                        this.transfer = new PreparedSend(str, str2, null).transfer;
                        this.newSecretPhrase = new k0(bArr);
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
            sendtransfer.random_id = Utilities.f21331b.nextLong();
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
        private final v10 onReplacement;

        public RotationCallbacks(final v10 v10Var, v10 v10Var2) {
            super(new x10() {
                @Override
                public final void a(Object obj, Object obj2, Object obj3) {
                    String str = (String) obj3;
                    v10.this.a((WalletEngine2.SendPhase) obj, (String) obj2);
                }
            });
            this.onReplacement = v10Var2;
        }

        private void lambda$replacement$1(byte[] bArr, k0 k0Var) {
            this.onReplacement.a(k0Var, bArr);
        }

        public Void lambda$replacement$2(byte[] bArr, byte[] bArr2) {
            k0 k0Var = new k0(bArr);
            try {
                lambda$replacement$1(bArr2, k0Var);
                k0Var.close();
                return null;
            } catch (Throwable th2) {
                k0Var.close();
                throw th2;
            }
        }

        private void replacement(final byte[] bArr, final byte[] bArr2) {
            boolean z9;
            try {
                FutureTask futureTask = new FutureTask(new Callable() {
                    @Override
                    public final Object call() {
                        Void lambda$replacement$2;
                        lambda$replacement$2 = WalletEngine2.RotationCallbacks.this.lambda$replacement$2(bArr, bArr2);
                        return lambda$replacement$2;
                    }
                });
                org.telegram.messenger.g0.h3(futureTask);
                z9 = false;
                while (true) {
                    try {
                        try {
                            futureTask.get();
                            break;
                        } catch (InterruptedException unused) {
                            z9 = true;
                        } catch (ExecutionException unused2) {
                            throw new IllegalStateException("Could not save replacement recovery phrase");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Arrays.fill(bArr, (byte) 0);
                        if (z9) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (!z9) {
                    Arrays.fill(bArr, (byte) 0);
                    if (z9) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Key rotation was interrupted before submission");
            } catch (Throwable th3) {
                th = th3;
                z9 = false;
            }
        }
    }

    public static class SendCallbacks {
        final x10 callback;
        String error;
        SendPhase phase = SendPhase.IDLE;
        String transactionHash;

        public SendCallbacks(x10 x10Var) {
            this.callback = x10Var;
        }

        public void lambda$dispatch$0(SendPhase sendPhase, String str, String str2) {
            this.callback.a(sendPhase, str, str2);
        }

        public void dispatch(SendPhase sendPhase, String str, String str2) {
            org.telegram.messenger.g0.h3(new g7((Object) this, (Object) sendPhase, str, (Object) str2, 2));
        }

        public synchronized void failed(String str) {
            SendPhase sendPhase = this.phase;
            if (sendPhase != SendPhase.SUBMISSION_UNKNOWN) {
                sendPhase = SendPhase.FAILED;
            }
            state(sendPhase.nativeValue, str, null);
        }

        public synchronized void state(int i7, String str, String str2) {
            SendPhase fromNative = SendPhase.fromNative(i7);
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

        SendPhase(int i7) {
            this.nativeValue = i7;
        }

        public static SendPhase fromNative(int i7) {
            SendPhase[] values;
            for (SendPhase sendPhase : values()) {
                if (sendPhase.nativeValue == i7) {
                    return sendPhase;
                }
            }
            throw new IllegalArgumentException(jg.g.j(i7, "Unknown native send phase: "));
        }
    }

    public static class SendResolution {
        final String error;
        final String operationId;
        final SendPhase phase;
        final long retryAfterMs;
        final String transactionHash;

        public SendResolution(String str, int i7, String str2, String str3, long j3) {
            this.operationId = str;
            this.phase = SendPhase.fromNative(i7);
            this.transactionHash = str2;
            this.error = str3;
            this.retryAfterMs = j3;
        }
    }

    public WalletEngine2(int i7, String str, byte[] bArr) {
        this.currentAccount = i7;
        this.address = str;
        byte[] bArr2 = (byte[]) bArr.clone();
        this.publicKey = bArr2;
        HttpTransport httpTransport = new HttpTransport(i7);
        this.transport = httpTransport;
        this.ptr = nativeCreate(i7, str, bArr2, httpTransport, org.telegram.messenger.t0.f25563b.getNoBackupFilesDir().getAbsolutePath() + "/wallet-engine");
    }

    public static ImportedWalletProof createImportProof(k0 k0Var, String str, String str2, int i7) {
        return createProof(k0Var, str, str2, i7, true);
    }

    public static ImportedWalletProof createOwnershipProof(k0 k0Var, String str, String str2, int i7) {
        return createProof(k0Var, str, str2, i7, false);
    }

    private static ImportedWalletProof createProof(k0 k0Var, String str, String str2, int i7, boolean z9) {
        if (k0Var != null && !k0Var.d()) {
            if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && i7 > 0) {
                byte[] c10 = k0Var.c();
                try {
                    Charset charset = StandardCharsets.UTF_8;
                    return nativeCreateImportProof(c10, str.getBytes(charset), str2.getBytes(charset), i7, z9);
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

    public static String decryptComment(k0 k0Var, String str, String str2) {
        byte[] bArr;
        if (k0Var != null && !k0Var.d()) {
            if (isValidAddress(str)) {
                String encryptedCommentBody = encryptedCommentBody(decodeEncryptedComment(str2));
                byte[] c10 = k0Var.c();
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
                RuntimeException e10 = null;
                String str = null;
                int i7 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i11);
                    JSONObject optJSONObject = jSONObject.optJSONObject("in_msg");
                    if (isEncryptedComment(optJSONObject)) {
                        i7++;
                        try {
                            str = decryptMessageComment(bArr, optJSONObject);
                            i10++;
                        } catch (RuntimeException e11) {
                            e10 = e11;
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("out_msgs");
                    if (optJSONArray2 != null) {
                        for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i12);
                            if (isEncryptedComment(jSONObject2)) {
                                i7++;
                                try {
                                    str = decryptMessageComment(bArr, jSONObject2);
                                    i10++;
                                } catch (RuntimeException e12) {
                                    e10 = e12;
                                }
                            }
                        }
                    }
                }
                if (i7 != 0) {
                    if (i10 == 0) {
                        if (e10 != null) {
                            throw e10;
                        }
                        throw new IllegalStateException("Transaction comment could not be decrypted");
                    } else if (i10 == 1) {
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
        int i7;
        int i10;
        int i11;
        int D = jg.g.D(bArr.length, -91, 127, 1);
        int length = (D * 2) + bArr.length + 4 + D;
        int i12 = length - 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length + 11);
        byteArrayOutputStream.write(new byte[]{-75, -18, -100, 114, 1, 2, (byte) D, 1, 0, (byte) (i12 >> 8), (byte) i12, 0}, 0, 12);
        int i13 = 0;
        int i14 = 0;
        while (i13 < D) {
            if (i13 == 0) {
                i7 = 35;
            } else {
                i7 = 127;
            }
            int min = Math.min(i7, bArr.length - i14);
            int i15 = i13 + 1;
            if (i15 < D) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            byteArrayOutputStream.write(i10);
            if (i13 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            byteArrayOutputStream.write((i11 + min) * 2);
            if (i13 == 0) {
                byteArrayOutputStream.write(33);
                byteArrayOutputStream.write(103);
                byteArrayOutputStream.write(218);
                byteArrayOutputStream.write(75);
            }
            byteArrayOutputStream.write(bArr, i14, min);
            if (i10 != 0) {
                byteArrayOutputStream.write(i15);
            }
            i14 += min;
            i13 = i15;
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static java.lang.String encryptedCommentPayload(java.lang.String r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.encryptedCommentPayload(java.lang.String):java.lang.String");
    }

    private static byte[] encryptedCommentPreview(int i7) {
        int i10;
        int i11;
        int i12;
        if (i7 <= 960) {
            int i13 = ((16 - (i7 % 16)) % 16) + i7 + 64;
            int D = jg.g.D(i13, -91, 127, 1);
            int i14 = (D * 2) + i13 + 4 + D;
            int i15 = i14 - 1;
            ByteBuffer allocate = ByteBuffer.allocate(i14 + 11);
            allocate.putInt(-1242653582);
            allocate.put((byte) 1);
            allocate.put((byte) 2);
            allocate.put((byte) D).put((byte) 1).put((byte) 0);
            allocate.putShort((short) i15).put((byte) 0);
            int i16 = 0;
            while (i16 < D) {
                if (i16 == 0) {
                    i10 = 35;
                } else {
                    i10 = 127;
                }
                int min = Math.min(i13, i10);
                int i17 = i16 + 1;
                if (i17 < D) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                allocate.put((byte) i11);
                if (i16 == 0) {
                    i12 = 4;
                } else {
                    i12 = 0;
                }
                allocate.put((byte) ((i12 + min) * 2));
                if (i16 == 0) {
                    allocate.putInt(560454219);
                }
                allocate.position(allocate.position() + min);
                if (i11 != 0) {
                    allocate.put((byte) i17);
                }
                i13 -= min;
                i16 = i17;
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

    public static boolean isTgWalletSecretPhrase(k0 k0Var) {
        try {
            secretPhraseToPublicKey(k0Var);
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

    public void lambda$balance$14(v10 v10Var) {
        String message;
        Long l10 = null;
        try {
            message = null;
            l10 = Long.valueOf(nativeBalance(this.ptr));
        } catch (RuntimeException e10) {
            if (e10.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e10.getMessage();
            }
        }
        org.telegram.messenger.g0.h3(new g(v10Var, (Serializable) l10, (Serializable) message, 18));
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

    public void lambda$decryptTransactionComment$45(String str, byte[] bArr, v10 v10Var) {
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
            } catch (Exception e10) {
                if (e10.getMessage() == null) {
                    message = "Could not decrypt transaction comment";
                } else {
                    message = e10.getMessage();
                }
                Arrays.fill(bArr, (byte) 0);
            }
            org.telegram.messenger.g0.h3(new g(v10Var, (Serializable) str2, (Serializable) message, 16));
        } catch (Throwable th2) {
            Arrays.fill(bArr, (byte) 0);
            throw th2;
        }
    }

    public void lambda$emulateRotateKey$29(v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        v10Var.a(wallettransaction, str);
    }

    public void lambda$emulateRotateKey$30(v10 v10Var) {
        String errorMessage;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e10) {
            errorMessage = errorMessage(e10);
            wallettransaction = null;
        }
        if (!this.closed) {
            wallettransaction = nativeEmulateRotateKey(this.ptr, this.address);
            errorMessage = null;
            org.telegram.messenger.g0.h3(new d7(this, v10Var, wallettransaction, errorMessage, 1));
            return;
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public static void lambda$emulateSend$15(AtomicBoolean atomicBoolean, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str) {
        if (!atomicBoolean.get()) {
            v10Var.a(wallettransaction, str);
        }
    }

    public Void lambda$emulateSend$16(AtomicBoolean atomicBoolean, byte[] bArr, byte[] bArr2, String str, long j3, v10 v10Var) {
        boolean z9;
        TL_wallet.walletTransaction nativeEmulateSend;
        String str2;
        if (atomicBoolean.get()) {
            return null;
        }
        if (bArr != null && bArr2 != null) {
            try {
                bArr = encryptedCommentPreview(bArr.length);
            } catch (RuntimeException e10) {
                str2 = errorMessage(e10);
                nativeEmulateSend = null;
            }
        }
        byte[] bArr3 = bArr;
        long j10 = this.ptr;
        if (bArr2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        nativeEmulateSend = nativeEmulateSend(j10, str, j3, bArr3, z9);
        str2 = null;
        org.telegram.messenger.g0.h3(new g7(atomicBoolean, v10Var, nativeEmulateSend, str2, 16));
        return null;
    }

    public static void lambda$emulateSend$17(AtomicBoolean atomicBoolean, v10 v10Var) {
        if (!atomicBoolean.get()) {
            v10Var.a(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSend$18(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    public void lambda$emulateSendNFT$19(AtomicBoolean atomicBoolean, v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str) {
        if (!atomicBoolean.get()) {
            if (this.closed) {
                wallettransaction = null;
            }
            if (this.closed) {
                str = "NO_WALLET_ENGINE";
            }
            v10Var.a(wallettransaction, str);
        }
    }

    public Void lambda$emulateSendNFT$20(AtomicBoolean atomicBoolean, String str, String str2, String str3, v10 v10Var) {
        TL_wallet.walletTransaction wallettransaction;
        String errorMessage;
        byte[] bytes;
        if (atomicBoolean.get()) {
            return null;
        }
        try {
        } catch (RuntimeException e10) {
            e = e10;
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
            } catch (RuntimeException e11) {
                e = e11;
                errorMessage = errorMessage(e);
                org.telegram.messenger.g0.h3(new c01(this, atomicBoolean, v10Var, wallettransaction, errorMessage, 6));
                return null;
            }
            org.telegram.messenger.g0.h3(new c01(this, atomicBoolean, v10Var, wallettransaction, errorMessage, 6));
            return null;
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public static void lambda$emulateSendNFT$21(AtomicBoolean atomicBoolean, v10 v10Var) {
        if (!atomicBoolean.get()) {
            v10Var.a(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSendNFT$22(AtomicBoolean atomicBoolean, v10 v10Var) {
        if (!atomicBoolean.get()) {
            v10Var.a(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSendNFT$23(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    public void lambda$getTransactionByHash$39(String str, c20 c20Var) {
        TL_wallet.walletTransaction wallettransaction;
        try {
            HttpTransport httpTransport = this.transport;
            long j3 = this.nextAuxiliaryRequestId;
            this.nextAuxiliaryRequestId = j3 - 1;
            wallettransaction = parseTransactionResponse(httpTransport.execute(j3, "https://toncenter.com/api/v3/transactions?hash=" + URLEncoder.encode(str, "UTF-8") + "&limit=1", false, new byte[0], 15000L));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            wallettransaction = null;
        }
        org.telegram.messenger.g0.h3(new n(18, c20Var, wallettransaction));
    }

    public static Thread lambda$new$0(Runnable runnable) {
        return new Thread(runnable, "WalletEngine2");
    }

    public void lambda$prepareRotateKey$34(z10 z10Var, PreparedRotation preparedRotation, String str) {
        try {
            if (this.closed) {
                z10Var.a(null, null, null, "NO_WALLET_ENGINE");
            } else if (preparedRotation == null) {
                z10Var.a(null, null, null, str);
            } else {
                z10Var.a(preparedRotation.transfer, preparedRotation.newSecretPhrase, preparedRotation.newPublicKey, null);
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

    public void lambda$prepareRotateKey$35(byte[] bArr, String str, z10 z10Var) {
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
        } catch (RuntimeException e10) {
            e = e10;
        }
        if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
            PreparedRotation nativePrepareRotateKey = nativePrepareRotateKey(this.ptr, bArr, str);
            if (nativePrepareRotateKey != null) {
                Arrays.fill(bArr, (byte) 0);
                preparedRotation = nativePrepareRotateKey;
                str2 = null;
                org.telegram.messenger.g0.h3(new g7(this, z10Var, preparedRotation, str2, 0));
                return;
            }
            try {
                throw new IllegalStateException("Could not prepare key rotation");
            } catch (RuntimeException e11) {
                e = e11;
                preparedRotation2 = nativePrepareRotateKey;
                String errorMessage = errorMessage(e);
                Arrays.fill(bArr, (byte) 0);
                str2 = errorMessage;
                preparedRotation = preparedRotation2;
                org.telegram.messenger.g0.h3(new g7(this, z10Var, preparedRotation, str2, 0));
                return;
            }
        }
        throw new IllegalStateException("Previous wallet send is still unresolved");
    }

    public void lambda$prepareSend$49(x10 x10Var, TL_wallet.sendTransfer sendtransfer, String str, String str2) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "NO_WALLET_ENGINE";
        }
        x10Var.a(sendtransfer, str, str2);
    }

    public void lambda$prepareSend$50(byte[] r14, java.lang.String r15, long r16, byte[] r18, byte[] r19, java.lang.String r20, org.telegram.messenger.x10 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.lambda$prepareSend$50(byte[], java.lang.String, long, byte[], byte[], java.lang.String, org.telegram.messenger.x10):void");
    }

    public void lambda$prepareSendNFT$24(v10 v10Var) {
        String str;
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        } else {
            str = "Recovery phrase is required";
        }
        v10Var.a(null, str);
    }

    public void lambda$prepareSendNFT$25(v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        v10Var.a(sendtransfer, str);
    }

    public void lambda$prepareSendNFT$26(String str, String str2, String str3, byte[] bArr, v10 v10Var) {
        byte[] bArr2;
        String str4;
        TL_wallet.sendTransfer sendtransfer;
        String uuid;
        byte[] bytes;
        TL_wallet.sendTransfer sendtransfer2 = null;
        try {
            try {
                try {
                } catch (RuntimeException e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
                Arrays.fill(bArr, (byte) 0);
                throw th;
            }
        } catch (RuntimeException e11) {
            e = e11;
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
                    } catch (RuntimeException e12) {
                        e = e12;
                        sendtransfer2 = sendtransfer3;
                        String errorMessage = errorMessage(e);
                        Arrays.fill(bArr2, (byte) 0);
                        str4 = errorMessage;
                        sendtransfer = sendtransfer2;
                        org.telegram.messenger.g0.h3(new x6(this, v10Var, sendtransfer, str4, 1));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new x6(this, v10Var, sendtransfer, str4, 1));
                    return;
                }
                throw new IllegalStateException("Could not prepare NFT transfer");
            }
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public void lambda$prepareTonConnectTransfer$4(v10 v10Var, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        v10Var.a(sendtransfer, str);
    }

    public void lambda$prepareTonConnectTransfer$5(byte[] bArr, e2 e2Var, String str, v10 v10Var) {
        String str2;
        TL_wallet.sendTransfer sendtransfer;
        try {
            try {
                try {
                } catch (RuntimeException e10) {
                    e = e10;
                    String i7 = f2.i("wallet-engine transaction", e);
                    Arrays.fill(bArr, (byte) 0);
                    str2 = i7;
                    sendtransfer = null;
                    org.telegram.messenger.g0.h3(new x6(this, v10Var, sendtransfer, str2, 0));
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th3;
            }
        } catch (RuntimeException e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th32;
        }
        if (!this.closed) {
            resolveBeforeNewSend();
            if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                TL_wallet.sendTransfer sendtransfer2 = nativePrepareTonConnectTransfer(this.ptr, bArr, e2Var.a(), e2Var.f42414a, str).transfer;
                Arrays.fill(bArr, (byte) 0);
                sendtransfer = sendtransfer2;
                str2 = null;
                org.telegram.messenger.g0.h3(new x6(this, v10Var, sendtransfer, str2, 0));
                return;
            }
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$previewSignMessage$7(c20 c20Var, String str) {
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        c20Var.a(str);
    }

    public void lambda$previewSignMessage$8(e2 e2Var, c20 c20Var) {
        String i7;
        try {
        } catch (RuntimeException e10) {
            i7 = f2.i("preview signing", e10);
        }
        if (!this.closed) {
            nativePreviewSignMessage(this.ptr, e2Var.a(), e2Var.f42414a);
            i7 = null;
            org.telegram.messenger.g0.h3(new f7(this, c20Var, i7));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$previewTonConnect$1(v10 v10Var, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        v10Var.a(wallettransaction, str);
    }

    public void lambda$previewTonConnect$2(e2 e2Var, v10 v10Var) {
        String i7;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e10) {
            i7 = f2.i("wallet-engine transaction", e10);
            wallettransaction = null;
        }
        if (!this.closed) {
            wallettransaction = nativePreviewTonConnect(this.ptr, e2Var.a(), e2Var.f42414a);
            i7 = null;
            org.telegram.messenger.g0.h3(new d7(this, v10Var, wallettransaction, i7, 0));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$rotateKey$52(RotationCallbacks rotationCallbacks, byte[] bArr, String str) {
        try {
            resolveBeforeNewSend();
            rotationCallbacks.state(SendPhase.VALIDATING.nativeValue, null, null);
            nativeRotateKey(this.ptr, bArr, str, rotationCallbacks);
        } catch (RuntimeException e10) {
            rotationCallbacks.failed(errorMessage(e10));
        } finally {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public void lambda$signMessage$10(v10 v10Var, String str, String str2) {
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "Wallet engine is closed";
        }
        v10Var.a(str, str2);
    }

    public void lambda$signMessage$11(byte[] bArr, e2 e2Var, String str, v10 v10Var) {
        String str2;
        String str3;
        try {
            try {
                try {
                } catch (RuntimeException e10) {
                    e = e10;
                    String i7 = f2.i("sign message", e);
                    Arrays.fill(bArr, (byte) 0);
                    str2 = i7;
                    str3 = null;
                    org.telegram.messenger.g0.h3(new g7((Object) this, (Object) v10Var, str3, (Object) str2, 14));
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th3;
            }
        } catch (RuntimeException e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th32;
        }
        if (!this.closed) {
            String nativeSignMessage = nativeSignMessage(this.ptr, bArr, e2Var.a(), e2Var.f42414a, str);
            Arrays.fill(bArr, (byte) 0);
            str3 = nativeSignMessage;
            str2 = null;
            org.telegram.messenger.g0.h3(new g7((Object) this, (Object) v10Var, str3, (Object) str2, 14));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    private static native String[] mnemonicWordlist();

    private static native long nativeBalance(long j3);

    private static native void nativeClose(long j3);

    private static native long nativeCreate(int i7, String str, byte[] bArr, HttpTransport httpTransport, String str2);

    private static native ImportedWalletProof nativeCreateImportProof(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, boolean z9);

    private static native byte[] nativeDecryptComment(long j3, byte[] bArr, String str, String str2);

    private static native byte[] nativeDecryptRawComment(byte[] bArr, String str, String str2);

    private static native TL_wallet.walletTransaction nativeEmulateRotateKey(long j3, String str);

    private static native TL_wallet.walletTransaction nativeEmulateSend(long j3, String str, long j10, byte[] bArr, boolean z9);

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
        boolean z9;
        String str;
        SendPhase sendPhase;
        JSONArray jSONArray = new JSONObject(new String(bArr, StandardCharsets.UTF_8)).getJSONArray("transactions");
        JSONObject jSONObject = null;
        boolean z10 = true;
        if (jSONArray.length() != 1) {
            return null;
        }
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        JSONObject optJSONObject = jSONObject2.optJSONObject("in_msg");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("out_msgs");
        String str2 = "source";
        if (optJSONObject != null && !optJSONObject.isNull("source") && !optJSONObject.getString("source").isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        int length = jSONArray2.length();
        if (!z9 ? length != 1 : length != 0) {
            return null;
        }
        if (!z9) {
            optJSONObject = jSONArray2.getJSONObject(0);
        }
        if (!z9) {
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
        createTransaction.incoming = z9;
        createTransaction.tx_hash = jSONObject2.getString("hash");
        StringBuilder sb2 = new StringBuilder("chain:");
        sb2.append(createTransaction.tx_hash);
        if (z9) {
            str = ":in:0";
        } else {
            str = ":out:0";
        }
        sb2.append(str);
        createTransaction.f27216id = sb2.toString();
        long j3 = jSONObject2.getLong("now");
        int i7 = (int) j3;
        if (j3 == i7) {
            createTransaction.date = i7;
            createTransaction.fee = parseLong2;
            if (!jSONObject2.getJSONObject("description").getBoolean("aborted") && !optJSONObject.optBoolean("bounced", false)) {
                z10 = false;
            }
            createTransaction.failed = z10;
            if (z10) {
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

    private static int readBocInt(ByteBuffer byteBuffer, int i7) {
        if (i7 >= 1 && i7 <= 4) {
            long j3 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
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

    public static String secretPhraseToAddress(k0 k0Var) {
        if (k0Var != null && !k0Var.d()) {
            byte[] c10 = k0Var.c();
            try {
                return nativeSecretPhraseToAddress(c10);
            } finally {
                Arrays.fill(c10, (byte) 0);
            }
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    public static byte[] secretPhraseToAnchorPublicKey(k0 k0Var) {
        k0 k0Var2;
        if (k0Var != null && !k0Var.d()) {
            int g10 = k0Var.g();
            if (g10 != 12 && g10 != 24) {
                throw new IllegalArgumentException("Recovery phrase must contain 12 or 24 words");
            }
            synchronized (k0Var) {
                try {
                    k0Var.a();
                    int i7 = 0;
                    while (true) {
                        byte[] bArr = k0Var.f42687a;
                        if (i7 >= bArr.length || !k0.e(bArr[i7])) {
                            break;
                        }
                        i7++;
                    }
                    int i10 = 0;
                    int i11 = i7;
                    while (i10 < 12) {
                        if (i11 != k0Var.f42687a.length) {
                            while (true) {
                                byte[] bArr2 = k0Var.f42687a;
                                if (i11 >= bArr2.length || k0.e(bArr2[i11])) {
                                    break;
                                }
                                i11++;
                            }
                            i10++;
                            if (i10 < 12) {
                                while (true) {
                                    byte[] bArr3 = k0Var.f42687a;
                                    if (i11 < bArr3.length && k0.e(bArr3[i11])) {
                                        i11++;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Not enough recovery words");
                        }
                    }
                    byte[] copyOfRange = Arrays.copyOfRange(k0Var.f42687a, i7, i11);
                    k0Var2 = new k0(copyOfRange);
                    Arrays.fill(copyOfRange, (byte) 0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                byte[] secretPhraseToPublicKey = secretPhraseToPublicKey(k0Var2);
                k0Var2.close();
                return secretPhraseToPublicKey;
            } catch (Throwable th3) {
                try {
                    k0Var2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    public static byte[] secretPhraseToPublicKey(k0 k0Var) {
        if (k0Var != null && !k0Var.d()) {
            byte[] c10 = k0Var.c();
            try {
                return nativeSecretPhraseToPublicKey(c10);
            } finally {
                Arrays.fill(c10, (byte) 0);
            }
        }
        throw new IllegalArgumentException("Recovery phrase is required");
    }

    private static void setTransactionPhase(TL_wallet.walletTransaction wallettransaction, int i7) {
        boolean z9;
        SendPhase fromNative = SendPhase.fromNative(i7);
        wallettransaction.phase = fromNative;
        wallettransaction.failed = isFailedPhase(fromNative);
        if (!wallettransaction.preview && isPendingPhase(wallettransaction.phase)) {
            z9 = true;
        } else {
            z9 = false;
        }
        wallettransaction.pending = z9;
    }

    public static JSONObject signData(k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7) {
        JSONObject jSONObject2 = tonConnectCrypto(k0Var, tonconnectsession, str, bArr, new JSONObject().put("signData", jSONObject).put("signDomain", str2).put("timestamp", i7));
        return new JSONObject().put("signature", jSONObject2.getString("signature")).put("address", jSONObject2.getString("address")).put("timestamp", i7).put("domain", str2).put("payload", jSONObject);
    }

    public static java.lang.String textCommentFromBody(java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.textCommentFromBody(java.lang.String):java.lang.String");
    }

    public static String toUserFriendlyAddress(String str) {
        return nativeTransactionAddress(str);
    }

    public static JSONObject tonConnectCrypto(k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject) {
        String str2;
        if (tonconnectsession != null && tonconnectsession.nonce != null && (str2 = tonconnectsession.dapp_client_id) != null && k0Var != null && str != null && bArr != null) {
            jSONObject.put("dappClientId", str2);
            jSONObject.put("sessionNonce", Base64.encodeToString(tonconnectsession.nonce, 2));
            jSONObject.put("clientId", tonconnectsession.client_id);
            jSONObject.put("walletPublicKey", Base64.encodeToString(bArr, 2));
            jSONObject.put("walletAddress", str);
            byte[] c10 = k0Var.c();
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

    public synchronized void balance(v10 v10Var) {
        this.worker.execute(new b7(this, v10Var, 1));
    }

    @Override
    public synchronized void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.transport.close();
        this.worker.execute(new l(this, 10));
    }

    public void decryptTransactionComment(k0 k0Var, String str, v10 v10Var) {
        if (v10Var != null) {
            if (k0Var != null && !k0Var.d()) {
                if (str != null && !str.isEmpty()) {
                    if (this.closed) {
                        org.telegram.messenger.g0.h3(new a7(v10Var, 5));
                        return;
                    }
                    byte[] c10 = k0Var.c();
                    try {
                        this.worker.execute(new g7(this, str, c10, v10Var));
                        return;
                    } catch (RejectedExecutionException unused) {
                        Arrays.fill(c10, (byte) 0);
                        org.telegram.messenger.g0.h3(new a7(v10Var, 6));
                        return;
                    }
                }
                org.telegram.messenger.g0.h3(new a7(v10Var, 4));
                return;
            }
            org.telegram.messenger.g0.h3(new a7(v10Var, 3));
            return;
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public void emulateRotateKey(v10 v10Var) {
        if (v10Var != null) {
            if (this.closed) {
                org.telegram.messenger.g0.h3(new a7(v10Var, 1));
                return;
            }
            try {
                this.worker.execute(new b7(this, v10Var, 0));
                return;
            } catch (RejectedExecutionException unused) {
                org.telegram.messenger.g0.h3(new a7(v10Var, 2));
                return;
            }
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public Runnable emulateSend(final String str, final long j3, String str2, final byte[] bArr, final v10 v10Var) {
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
                lambda$emulateSend$16 = WalletEngine2.this.lambda$emulateSend$16(atomicBoolean, bArr2, bArr, str, j3, v10Var);
                return lambda$emulateSend$16;
            }
        });
        try {
            this.worker.execute(futureTask);
        } catch (RejectedExecutionException unused) {
            org.telegram.messenger.g0.h3(new i7(atomicBoolean, v10Var, 0));
        }
        return new j7(atomicBoolean, futureTask, 0);
    }

    public synchronized Runnable emulateSendNFT(String str, String str2, v10 v10Var) {
        return emulateSendNFT(str, str2, null, v10Var);
    }

    public void getTransactionByHash(String str, c20 c20Var) {
        if (c20Var != null) {
            if (str != null && !str.isEmpty() && !this.closed) {
                try {
                    this.worker.execute(new f7(this, str, c20Var));
                    return;
                } catch (RejectedExecutionException unused) {
                    org.telegram.messenger.g0.h3(new c7(c20Var, 2));
                    return;
                }
            }
            org.telegram.messenger.g0.h3(new c7(c20Var, 1));
            return;
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public void prepareRotateKey(k0 k0Var, String str, final z10 z10Var) {
        if (z10Var != null) {
            if (this.closed) {
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z10Var.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                z10Var.a(null, null, null, "Recovery phrase is required");
                                return;
                            default:
                                z10Var.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            } else if (k0Var != null && !k0Var.d()) {
                byte[] c10 = k0Var.c();
                try {
                    this.worker.execute(new g7(this, c10, str, z10Var));
                    return;
                } catch (RejectedExecutionException unused) {
                    Arrays.fill(c10, (byte) 0);
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    z10Var.a(null, null, null, "NO_WALLET_ENGINE");
                                    return;
                                case 1:
                                    z10Var.a(null, null, null, "Recovery phrase is required");
                                    return;
                                default:
                                    z10Var.a(null, null, null, "NO_WALLET_ENGINE");
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else {
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z10Var.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                z10Var.a(null, null, null, "Recovery phrase is required");
                                return;
                            default:
                                z10Var.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public void prepareSend(k0 k0Var, String str, long j3, String str2, byte[] bArr, String str3, final x10 x10Var) {
        byte[] bArr2;
        if (x10Var != null) {
            if (this.closed) {
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                x10Var.a(null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                x10Var.a(null, null, "Recovery phrase is required");
                                return;
                            default:
                                x10Var.a(null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            } else if (k0Var != null && !k0Var.d()) {
                byte[] bArr3 = null;
                if (bArr == null) {
                    bArr2 = null;
                } else {
                    bArr2 = (byte[]) bArr.clone();
                }
                byte[] c10 = k0Var.c();
                if (str2 != null) {
                    bArr3 = str2.getBytes(StandardCharsets.UTF_8);
                }
                try {
                    this.worker.execute(new bi.m4(this, c10, str, j3, bArr3, bArr2, str3, x10Var));
                    return;
                } catch (RejectedExecutionException unused) {
                    Arrays.fill(c10, (byte) 0);
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    x10Var.a(null, null, "NO_WALLET_ENGINE");
                                    return;
                                case 1:
                                    x10Var.a(null, null, "Recovery phrase is required");
                                    return;
                                default:
                                    x10Var.a(null, null, "NO_WALLET_ENGINE");
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else {
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                x10Var.a(null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                x10Var.a(null, null, "Recovery phrase is required");
                                return;
                            default:
                                x10Var.a(null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalArgumentException("Result callback is required");
    }

    public synchronized void prepareSendNFT(k0 k0Var, String str, String str2, v10 v10Var) {
        prepareSendNFT(k0Var, str, str2, null, v10Var);
    }

    public void prepareTonConnectTransfer(k0 k0Var, e2 e2Var, String str, v10 v10Var) {
        v10 v10Var2;
        byte[] c10 = k0Var.c();
        try {
            v10Var2 = v10Var;
        } catch (RejectedExecutionException e10) {
            e = e10;
            v10Var2 = v10Var;
        }
        try {
            this.worker.execute(new z6(this, c10, e2Var, str, v10Var2, 1));
        } catch (RejectedExecutionException e11) {
            e = e11;
            RejectedExecutionException rejectedExecutionException = e;
            Arrays.fill(c10, (byte) 0);
            org.telegram.messenger.g0.h3(new z11(f2.i("schedule transaction signing", rejectedExecutionException), 1, v10Var2));
        }
    }

    public void previewSignMessage(e2 e2Var, c20 c20Var) {
        try {
            this.worker.execute(new g(this, e2Var, c20Var, 17));
        } catch (RejectedExecutionException unused) {
            org.telegram.messenger.g0.h3(new c7(c20Var, 0));
        }
    }

    public void previewTonConnect(e2 e2Var, v10 v10Var) {
        try {
            this.worker.execute(new g(this, e2Var, v10Var, 19));
        } catch (RejectedExecutionException e10) {
            org.telegram.messenger.g0.h3(new z11(f2.i("schedule transaction preview", e10), 2, v10Var));
        }
    }

    public void rotateKey(k0 k0Var, v10 v10Var, v10 v10Var2) {
        RotationCallbacks rotationCallbacks = new RotationCallbacks(v10Var2, v10Var);
        if (k0Var != null && !k0Var.d() && v10Var != null) {
            byte[] c10 = k0Var.c();
            try {
                this.worker.execute(new g7(this, rotationCallbacks, c10, UUID.randomUUID().toString(), 1));
                return;
            } catch (RejectedExecutionException unused) {
                Arrays.fill(c10, (byte) 0);
                rotationCallbacks.failed("NO_WALLET_ENGINE");
                return;
            }
        }
        rotationCallbacks.failed("Current recovery phrase and replacement callback are required");
    }

    public void signMessage(k0 k0Var, e2 e2Var, String str, v10 v10Var) {
        v10 v10Var2;
        byte[] c10 = k0Var.c();
        try {
            v10Var2 = v10Var;
        } catch (RejectedExecutionException unused) {
            v10Var2 = v10Var;
        }
        try {
            this.worker.execute(new z6(this, c10, e2Var, str, v10Var2, 0));
        } catch (RejectedExecutionException unused2) {
            Arrays.fill(c10, (byte) 0);
            org.telegram.messenger.g0.h3(new a7(v10Var2, 0));
        }
    }

    public synchronized Runnable emulateSendNFT(String str, String str2, String str3, v10 v10Var) {
        try {
            try {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                FutureTask futureTask = new FutureTask(new ab.i0(this, atomicBoolean, str, str2, str3, v10Var, 1));
                if (this.closed) {
                    org.telegram.messenger.g0.h3(new i7(atomicBoolean, v10Var, 1));
                } else {
                    try {
                        this.worker.execute(futureTask);
                    } catch (RejectedExecutionException unused) {
                        org.telegram.messenger.g0.h3(new i7(atomicBoolean, v10Var, 2));
                    }
                }
                return new j7(atomicBoolean, futureTask, 1);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized void prepareSendNFT(k0 k0Var, String str, String str2, String str3, v10 v10Var) {
        v10 v10Var2;
        try {
            try {
                if (!this.closed && k0Var != null && !k0Var.d()) {
                    byte[] c10 = k0Var.c();
                    try {
                        v10Var2 = v10Var;
                        try {
                            this.worker.execute(new bi.a3(this, str, str2, str3, c10, v10Var2, 24));
                        } catch (RejectedExecutionException unused) {
                            Arrays.fill(c10, (byte) 0);
                            org.telegram.messenger.g0.h3(new a7(v10Var2, 7));
                            return;
                        }
                    } catch (RejectedExecutionException unused2) {
                        v10Var2 = v10Var;
                    }
                    return;
                }
                org.telegram.messenger.g0.h3(new b7(this, v10Var, 2));
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
