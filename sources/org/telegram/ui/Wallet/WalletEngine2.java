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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
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
    private f pendingSend;
    private long ptr;
    public final byte[] publicKey;
    private ScheduledFuture<?> resolutionTask;
    private final HttpTransport transport;
    private final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor(new y20((byte) 10));
    private long nextAuxiliaryRequestId = -1;

    public static class HttpTransport {
        private boolean closed;
        public final int currentAccount;
        private final HashMap<Long, e> pending = new HashMap<>();

        public static class HostException extends RuntimeException {
            final int kind;

            public HostException(int i) {
                super("Wallet provider request failed");
                this.kind = i;
            }
        }

        public HttpTransport(int i) {
            this.currentAccount = i;
        }

        private ConnectionsManager getConnectionsManager() {
            return ConnectionsManager.getInstance(this.currentAccount);
        }

        public static void lambda$execute$0(e eVar, TL_toncenter.apiResponse apiresponse, TLRPC.TL_error tL_error) {
            TLRPC.TL_dataJSON tL_dataJSON;
            String str;
            if (tL_error != null) {
                eVar.a(null, new HostException(3));
            } else if (apiresponse != null && (tL_dataJSON = apiresponse.response) != null && (str = tL_dataJSON.data) != null) {
                eVar.a(str.getBytes(StandardCharsets.UTF_8), null);
            } else {
                eVar.a(null, new HostException(7));
            }
        }

        public void cancel(long j) {
            synchronized (this.pending) {
                e eVar = this.pending.get(Long.valueOf(j));
                if (eVar != null) {
                    eVar.a(null, new HostException(6));
                }
            }
        }

        public void close() {
            synchronized (this.pending) {
                this.closed = true;
                for (e eVar : this.pending.values()) {
                    eVar.a(null, new HostException(6));
                }
            }
        }

        public byte[] execute(long j, String str, boolean z, byte[] bArr, long j2) {
            String str2;
            int i;
            HashMap<Long, e> hashMap;
            try {
                URI create = URI.create(str);
                if ("https".equalsIgnoreCase(create.getScheme()) && "toncenter.com".equalsIgnoreCase(create.getHost()) && create.getRawUserInfo() == null && create.getRawFragment() == null && ((create.getPort() == -1 || create.getPort() == 443) && j2 > 0)) {
                    TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                    performapirequest.post = z;
                    performapirequest.endpoint = create.getRawPath();
                    performapirequest.query = create.getRawQuery();
                    if (bArr.length == 0) {
                        str2 = null;
                    } else {
                        str2 = new String(bArr, StandardCharsets.UTF_8);
                    }
                    performapirequest.payload = str2;
                    e eVar = new e();
                    long nanoTime = System.nanoTime();
                    try {
                        try {
                            HashMap<Long, e> hashMap2 = this.pending;
                            try {
                                synchronized (hashMap2) {
                                    try {
                                        try {
                                            if (!this.closed) {
                                                try {
                                                    this.pending.put(Long.valueOf(j), eVar);
                                                    try {
                                                        eVar.b = getConnectionsManager().sendRequestTyped(performapirequest, new ic((byte) 1), new l8b(eVar, (byte) 12), uc7.s1(this.currentAccount).r3, 0);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        hashMap = hashMap2;
                                                        i = 6;
                                                        try {
                                                            throw th;
                                                        } catch (InterruptedException unused) {
                                                            Thread.currentThread().interrupt();
                                                            eVar.a(null, new HostException(i));
                                                            throw new HostException(i);
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    hashMap = hashMap2;
                                                }
                                            } else {
                                                throw new HostException(6);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i = 6;
                                        hashMap = hashMap2;
                                    }
                                }
                                try {
                                    if (!eVar.a.await(Math.max(0L, TimeUnit.MILLISECONDS.toNanos(j2) - (System.nanoTime() - nanoTime)), TimeUnit.NANOSECONDS)) {
                                        eVar.a(null, new HostException(2));
                                    }
                                    HostException hostException = eVar.d;
                                    if (hostException == null) {
                                        byte[] bArr2 = eVar.c;
                                        synchronized (this.pending) {
                                            this.pending.remove(Long.valueOf(j));
                                            if (eVar.d != null && eVar.b != 0) {
                                                getConnectionsManager().cancelRequest(eVar.b, true);
                                            }
                                        }
                                        return bArr2;
                                    }
                                    throw hostException;
                                } catch (InterruptedException unused2) {
                                    i = 6;
                                    Thread.currentThread().interrupt();
                                    eVar.a(null, new HostException(i));
                                    throw new HostException(i);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (InterruptedException unused3) {
                            i = 6;
                        }
                    } catch (Throwable th6) {
                        synchronized (this.pending) {
                            this.pending.remove(Long.valueOf(j));
                            if (eVar.d != null && eVar.b != 0) {
                                getConnectionsManager().cancelRequest(eVar.b, true);
                            }
                            throw th6;
                        }
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

        private ImportedWalletProof(byte[] bArr, int i, byte[] bArr2) {
            this.publicKey = bArr;
            this.timestamp = i;
            this.signature = bArr2;
        }
    }

    public static class PreparedRotation {
        final byte[] newPublicKey;
        final c35 newSecretPhrase;
        final TL_wallet.sendTransfer transfer;

        public PreparedRotation(String str, String str2, byte[] bArr, byte[] bArr2) {
            if (bArr2 != null) {
                try {
                    if (bArr2.length == 32 && bArr != null && bArr.length != 0) {
                        this.transfer = new PreparedSend(str, str2, null).transfer;
                        this.newSecretPhrase = new c35(bArr);
                        this.newPublicKey = bArr2;
                        Arrays.fill(bArr, (byte) 0);
                        return;
                    }
                } catch (Throwable th) {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    throw th;
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
            sendtransfer.random_id = Utilities.b.nextLong();
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
            lq5.j("WALLET_TRANSFER_DATA_INVALID");
            return null;
        }
    }

    public static class RotationCallbacks extends SendCallbacks {
        private final icc onReplacement;

        public RotationCallbacks(final icc iccVar, icc iccVar2) {
            super(new kcc() {
                @Override
                public final void a(Object obj, Object obj2, Object obj3) {
                    String str = (String) obj3;
                    icc.this.a((WalletEngine2.SendPhase) obj, (String) obj2);
                }
            });
            this.onReplacement = iccVar2;
        }

        private void lambda$replacement$1(byte[] bArr, c35 c35Var) {
            this.onReplacement.a(c35Var, bArr);
        }

        public Void lambda$replacement$2(byte[] bArr, byte[] bArr2) {
            c35 c35Var = new c35(bArr);
            try {
                lambda$replacement$1(bArr2, c35Var);
                c35Var.close();
                return null;
            } catch (Throwable th) {
                c35Var.close();
                throw th;
            }
        }

        private void replacement(final byte[] bArr, final byte[] bArr2) {
            boolean z;
            try {
                FutureTask futureTask = new FutureTask(new Callable() {
                    @Override
                    public final Object call() {
                        Void lambda$replacement$2;
                        lambda$replacement$2 = WalletEngine2.RotationCallbacks.this.lambda$replacement$2(bArr, bArr2);
                        return lambda$replacement$2;
                    }
                });
                hl.c3(futureTask);
                z = false;
                while (true) {
                    try {
                        try {
                            futureTask.get();
                            break;
                        } catch (Throwable th) {
                            th = th;
                            Arrays.fill(bArr, (byte) 0);
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (ExecutionException unused2) {
                        throw new IllegalStateException("Could not save replacement recovery phrase");
                    }
                }
                if (!z) {
                    Arrays.fill(bArr, (byte) 0);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Key rotation was interrupted before submission");
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
    }

    public static class SendCallbacks {
        final kcc callback;
        String error;
        SendPhase phase = SendPhase.IDLE;
        String transactionHash;

        public SendCallbacks(kcc kccVar) {
            this.callback = kccVar;
        }

        public void lambda$dispatch$0(SendPhase sendPhase, String str, String str2) {
            this.callback.a(sendPhase, str, str2);
        }

        public void dispatch(SendPhase sendPhase, String str, String str2) {
            hl.c3(new d(this, sendPhase, str, str2));
        }

        public synchronized void failed(String str) {
            SendPhase sendPhase = this.phase;
            if (sendPhase != SendPhase.SUBMISSION_UNKNOWN) {
                sendPhase = SendPhase.FAILED;
            }
            state(sendPhase.nativeValue, str, null);
        }

        public synchronized void state(int i, String str, String str2) {
            SendPhase fromNative = SendPhase.fromNative(i);
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

        SendPhase(int i) {
            this.nativeValue = i;
        }

        public static SendPhase fromNative(int i) {
            SendPhase[] values;
            for (SendPhase sendPhase : values()) {
                if (sendPhase.nativeValue == i) {
                    return sendPhase;
                }
            }
            lq5.j(uh9.k(i, "Unknown native send phase: "));
            return null;
        }
    }

    public static class SendResolution {
        final String error;
        final String operationId;
        final SendPhase phase;
        final long retryAfterMs;
        final String transactionHash;

        public SendResolution(String str, int i, String str2, String str3, long j) {
            this.operationId = str;
            this.phase = SendPhase.fromNative(i);
            this.transactionHash = str2;
            this.error = str3;
            this.retryAfterMs = j;
        }
    }

    public WalletEngine2(int i, String str, byte[] bArr) {
        this.currentAccount = i;
        this.address = str;
        byte[] bArr2 = (byte[]) bArr.clone();
        this.publicKey = bArr2;
        HttpTransport httpTransport = new HttpTransport(i);
        this.transport = httpTransport;
        this.ptr = nativeCreate(i, str, bArr2, httpTransport, org.telegram.messenger.a.b.getNoBackupFilesDir().getAbsolutePath() + "/wallet-engine");
    }

    public static ImportedWalletProof createImportProof(c35 c35Var, String str, String str2, int i) {
        return createProof(c35Var, str, str2, i, true);
    }

    public static ImportedWalletProof createOwnershipProof(c35 c35Var, String str, String str2, int i) {
        return createProof(c35Var, str, str2, i, false);
    }

    private static ImportedWalletProof createProof(c35 c35Var, String str, String str2, int i, boolean z) {
        if (c35Var != null && !c35Var.d()) {
            if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && i > 0) {
                byte[] c = c35Var.c();
                try {
                    Charset charset = StandardCharsets.UTF_8;
                    return nativeCreateImportProof(c, str.getBytes(charset), str2.getBytes(charset), i, z);
                } finally {
                    Arrays.fill(c, (byte) 0);
                }
            }
            lq5.j("Challenge domain, payload and positive timestamp are required");
            return null;
        }
        lq5.j("Recovery phrase is required");
        return null;
    }

    private static TL_wallet.walletTransaction createTransaction(String str, long j) {
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        wallettransactionpeeraddress.address = nativeTransactionAddress(str);
        wallettransaction.peer = wallettransactionpeeraddress;
        wallettransaction.amount = j;
        return wallettransaction;
    }

    private static byte[] decodeEncryptedComment(String str) {
        if (str != null && !str.isEmpty() && str.length() <= 1368 && str.matches("[A-Za-z0-9+/]+={0,2}")) {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length >= 64 && decode.length <= 1024 && decode.length % 16 == 0) {
                return decode;
            }
            lq5.j("Invalid encrypted comment size");
            return null;
        }
        lq5.j("Invalid encrypted comment base64");
        return null;
    }

    public static String decryptComment(c35 c35Var, String str, String str2) {
        byte[] bArr = null;
        if (c35Var != null && !c35Var.d()) {
            if (isValidAddress(str)) {
                String encryptedCommentBody = encryptedCommentBody(decodeEncryptedComment(str2));
                byte[] c = c35Var.c();
                try {
                    bArr = nativeDecryptRawComment(c, str, encryptedCommentBody);
                    return new String(bArr, StandardCharsets.UTF_8);
                } finally {
                    Arrays.fill(c, (byte) 0);
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                }
            }
            lq5.j("Valid sender address is required");
            return null;
        }
        lq5.j("Recovery phrase is required");
        return null;
    }

    private String decryptMessageComment(byte[] bArr, JSONObject jSONObject) {
        String optString;
        String optString2 = jSONObject.optString("source", null);
        JSONObject optJSONObject = jSONObject.optJSONObject("message_content");
        if (optJSONObject == null) {
            optString = null;
        } else {
            optString = optJSONObject.optString("body", null);
        }
        if (optString2 != null && !optString2.isEmpty() && optString != null && !optString.isEmpty()) {
            return new String(nativeDecryptComment(this.ptr, bArr, optString2, optString), StandardCharsets.UTF_8);
        }
        grb.i("Encrypted transaction message is incomplete");
        return null;
    }

    private String decryptTransactionCommentResponse(byte[] bArr, byte[] bArr2) {
        JSONArray optJSONArray = new JSONObject(new String(bArr2, StandardCharsets.UTF_8)).optJSONArray("transactions");
        if (optJSONArray != null) {
            if (optJSONArray.length() != 0) {
                RuntimeException e = null;
                String str = null;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i3);
                    JSONObject optJSONObject = jSONObject.optJSONObject("in_msg");
                    if (isEncryptedComment(optJSONObject)) {
                        i++;
                        try {
                            str = decryptMessageComment(bArr, optJSONObject);
                            i2++;
                        } catch (RuntimeException e2) {
                            e = e2;
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("out_msgs");
                    if (optJSONArray2 != null) {
                        for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i4);
                            if (isEncryptedComment(jSONObject2)) {
                                i++;
                                try {
                                    str = decryptMessageComment(bArr, jSONObject2);
                                    i2++;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                }
                            }
                        }
                    }
                }
                if (i != 0) {
                    if (i2 == 0) {
                        if (e == null) {
                            throw new IllegalStateException("Transaction comment could not be decrypted");
                        }
                        throw e;
                    } else if (i2 == 1) {
                        return str;
                    } else {
                        grb.i("Transaction contains multiple decryptable comments");
                        return null;
                    }
                }
                grb.i("Transaction has no encrypted comment");
                return null;
            }
            grb.i("Transaction not found");
            return null;
        }
        grb.i("Toncenter returned an invalid transaction response");
        return null;
    }

    private static String encryptedCommentBody(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int g = ik8.g(bArr.length, -91, 127, 1);
        int length = bArr.length + 4 + (g << 1) + g;
        int i4 = length - 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length + 11);
        byteArrayOutputStream.write(new byte[]{-75, -18, -100, 114, 1, 2, (byte) g, 1, 0, (byte) (i4 >> 8), (byte) i4, 0}, 0, 12);
        int i5 = 0;
        int i6 = 0;
        while (i5 < g) {
            if (i5 == 0) {
                i = 35;
            } else {
                i = 127;
            }
            int min = Math.min(i, bArr.length - i6);
            int i7 = i5 + 1;
            if (i7 < g) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            byteArrayOutputStream.write(i2);
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            byteArrayOutputStream.write((i3 + min) << 1);
            if (i5 == 0) {
                byteArrayOutputStream.write(33);
                byteArrayOutputStream.write(103);
                byteArrayOutputStream.write(218);
                byteArrayOutputStream.write(75);
            }
            byteArrayOutputStream.write(bArr, i6, min);
            if (i2 != 0) {
                byteArrayOutputStream.write(i7);
            }
            i6 += min;
            i5 = i7;
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static java.lang.String encryptedCommentPayload(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.encryptedCommentPayload(java.lang.String):java.lang.String");
    }

    private static byte[] encryptedCommentPreview(int i) {
        int i2;
        int i3;
        int i4;
        if (i <= 960) {
            int i5 = ((16 - (i % 16)) % 16) + i + 64;
            int g = ik8.g(i5, -91, 127, 1);
            int i6 = i5 + 4 + (g << 1) + g;
            int i7 = i6 - 1;
            ByteBuffer allocate = ByteBuffer.allocate(i6 + 11);
            allocate.putInt(-1242653582);
            allocate.put((byte) 1);
            allocate.put((byte) 2);
            allocate.put((byte) g).put((byte) 1).put((byte) 0);
            allocate.putShort((short) i7).put((byte) 0);
            int i8 = 0;
            while (i8 < g) {
                if (i8 == 0) {
                    i2 = 35;
                } else {
                    i2 = 127;
                }
                int min = Math.min(i5, i2);
                int i9 = i8 + 1;
                if (i9 < g) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                allocate.put((byte) i3);
                if (i8 == 0) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                allocate.put((byte) ((i4 + min) << 1));
                if (i8 == 0) {
                    allocate.putInt(560454219);
                }
                allocate.position(allocate.position() + min);
                if (i3 != 0) {
                    allocate.put((byte) i9);
                }
                i5 -= min;
                i8 = i9;
            }
            return Base64.encode(allocate.array(), 2);
        }
        lq5.j("The encrypted comment exceeds 960 UTF-8 bytes");
        return null;
    }

    private static String errorMessage(Exception exc) {
        if (exc.getMessage() == null) {
            return "NULL_ERROR";
        }
        return exc.getMessage();
    }

    public static String[] getMnemonicWordlist() {
        String[] strArr = mnemonicWordlist;
        if (strArr == null) {
            String[] mnemonicWordlist2 = mnemonicWordlist();
            mnemonicWordlist = mnemonicWordlist2;
            return mnemonicWordlist2;
        }
        return strArr;
    }

    public static boolean isEncryptedComment(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        Object opt = jSONObject.opt("opcode");
        if (opt instanceof Number) {
            if ((((Number) opt).longValue() & 4294967295L) != 560454219) {
                return false;
            }
            return true;
        } else if (!(opt instanceof String)) {
            return false;
        } else {
            if ((Long.decode((String) opt).longValue() & 4294967295L) != 560454219) {
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

    public static boolean isTgWalletSecretPhrase(c35 c35Var) {
        try {
            secretPhraseToPublicKey(c35Var);
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

    public void lambda$balance$17(icc iccVar) {
        String message;
        Long l = null;
        try {
            l = Long.valueOf(nativeBalance(this.ptr));
            message = null;
        } catch (RuntimeException e) {
            if (e.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e.getMessage();
            }
        }
        hl.c3(new b6c(iccVar, l, message, (byte) 24));
    }

    public void lambda$close$56() {
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

    public void lambda$decryptTransactionComment$48(String str, byte[] bArr, icc iccVar) {
        String message;
        String str2 = null;
        try {
            try {
                HttpTransport httpTransport = this.transport;
                long j = this.nextAuxiliaryRequestId;
                this.nextAuxiliaryRequestId = j - 1;
                String decryptTransactionCommentResponse = decryptTransactionCommentResponse(bArr, httpTransport.execute(j, "https://toncenter.com/api/v3/transactions?hash=" + URLEncoder.encode(str, "UTF-8") + "&limit=1", false, new byte[0], 15000L));
                Arrays.fill(bArr, (byte) 0);
                str2 = decryptTransactionCommentResponse;
                message = null;
            } catch (Exception e) {
                if (e.getMessage() == null) {
                    message = "Could not decrypt transaction comment";
                } else {
                    message = e.getMessage();
                }
                Arrays.fill(bArr, (byte) 0);
            }
            hl.c3(new b6c(iccVar, str2, message, (byte) 25));
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
    }

    public void lambda$emulateRotateKey$32(icc iccVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        iccVar.a(wallettransaction, str);
    }

    public void lambda$emulateRotateKey$33(icc iccVar) {
        String errorMessage;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e) {
            errorMessage = errorMessage(e);
            wallettransaction = null;
        }
        if (!this.closed) {
            wallettransaction = nativeEmulateRotateKey(this.ptr, this.address);
            errorMessage = null;
            hl.c3(new dsc(this, iccVar, wallettransaction, errorMessage, (byte) 0));
            return;
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public static void lambda$emulateSend$18(AtomicBoolean atomicBoolean, icc iccVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (!atomicBoolean.get()) {
            iccVar.a(wallettransaction, str);
        }
    }

    public Void lambda$emulateSend$19(AtomicBoolean atomicBoolean, byte[] bArr, byte[] bArr2, String str, long j, icc iccVar) {
        boolean z;
        TL_wallet.walletTransaction nativeEmulateSend;
        String str2;
        if (atomicBoolean.get()) {
            return null;
        }
        if (bArr != null && bArr2 != null) {
            try {
                bArr = encryptedCommentPreview(bArr.length);
            } catch (RuntimeException e) {
                str2 = errorMessage(e);
                nativeEmulateSend = null;
            }
        }
        byte[] bArr3 = bArr;
        long j2 = this.ptr;
        if (bArr2 != null) {
            z = true;
        } else {
            z = false;
        }
        nativeEmulateSend = nativeEmulateSend(j2, str, j, bArr3, z);
        str2 = null;
        hl.c3(new ipc(atomicBoolean, iccVar, nativeEmulateSend, str2, (byte) 4));
        return null;
    }

    public static void lambda$emulateSend$20(AtomicBoolean atomicBoolean, icc iccVar) {
        if (!atomicBoolean.get()) {
            iccVar.a(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSend$21(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    public void lambda$emulateSendNFT$22(AtomicBoolean atomicBoolean, icc iccVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (!atomicBoolean.get()) {
            if (this.closed) {
                wallettransaction = null;
            }
            if (this.closed) {
                str = "NO_WALLET_ENGINE";
            }
            iccVar.a(wallettransaction, str);
        }
    }

    public Void lambda$emulateSendNFT$23(AtomicBoolean atomicBoolean, String str, String str2, String str3, icc iccVar) {
        TL_wallet.walletTransaction wallettransaction;
        String errorMessage;
        byte[] bytes;
        if (atomicBoolean.get()) {
            return null;
        }
        try {
        } catch (RuntimeException e) {
            e = e;
            wallettransaction = null;
        }
        if (!this.closed) {
            String uuid = UUID.randomUUID().toString();
            long j = this.ptr;
            if (str3 == null) {
                bytes = null;
            } else {
                bytes = str3.getBytes(StandardCharsets.UTF_8);
            }
            wallettransaction = nativeEmulateSendNFT(j, str, str2, bytes, uuid, 100000000L, 10000000L);
            try {
                this.nftPreviewRecipient = str;
                this.nftPreviewAddress = str2;
                this.nftPreviewComment = str3;
                this.nftPreviewOperationId = uuid;
                errorMessage = null;
            } catch (RuntimeException e2) {
                e = e2;
                errorMessage = errorMessage(e);
                hl.c3(new uwa(this, atomicBoolean, iccVar, wallettransaction, errorMessage));
                return null;
            }
            hl.c3(new uwa(this, atomicBoolean, iccVar, wallettransaction, errorMessage));
            return null;
        }
        throw new IllegalStateException("NO_WALLET_ENGINE");
    }

    public static void lambda$emulateSendNFT$24(AtomicBoolean atomicBoolean, icc iccVar) {
        if (!atomicBoolean.get()) {
            iccVar.a(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSendNFT$25(AtomicBoolean atomicBoolean, icc iccVar) {
        if (!atomicBoolean.get()) {
            iccVar.a(null, "NO_WALLET_ENGINE");
        }
    }

    public static void lambda$emulateSendNFT$26(AtomicBoolean atomicBoolean, FutureTask futureTask) {
        atomicBoolean.set(true);
        futureTask.cancel(false);
    }

    public void lambda$getTransactionByHash$42(String str, pcc pccVar) {
        TL_wallet.walletTransaction wallettransaction;
        try {
            HttpTransport httpTransport = this.transport;
            long j = this.nextAuxiliaryRequestId;
            this.nextAuxiliaryRequestId = j - 1;
            wallettransaction = parseTransactionResponse(httpTransport.execute(j, "https://toncenter.com/api/v3/transactions?hash=" + URLEncoder.encode(str, "UTF-8") + "&limit=1", false, new byte[0], 15000L));
        } catch (Exception e) {
            cc4.g(e, true);
            wallettransaction = null;
        }
        hl.c3(new vlc(pccVar, wallettransaction, (byte) 18));
    }

    public static Thread lambda$new$0(Runnable runnable) {
        return new Thread(runnable, "WalletEngine2");
    }

    public void lambda$prepareRotateKey$37(mcc mccVar, PreparedRotation preparedRotation, String str) {
        try {
            if (this.closed) {
                mccVar.a(null, null, null, "NO_WALLET_ENGINE");
            } else if (preparedRotation == null) {
                mccVar.a(null, null, null, str);
            } else {
                mccVar.a(preparedRotation.transfer, preparedRotation.newSecretPhrase, preparedRotation.newPublicKey, null);
            }
        } finally {
            if (preparedRotation != null) {
                preparedRotation.newSecretPhrase.close();
            }
        }
    }

    public void lambda$prepareRotateKey$38(byte[] bArr, String str, mcc mccVar) {
        String str2;
        PreparedRotation preparedRotation;
        PreparedRotation preparedRotation2 = null;
        try {
            try {
                resolveBeforeNewSend();
            } catch (RuntimeException e) {
                e = e;
            }
            if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                PreparedRotation nativePrepareRotateKey = nativePrepareRotateKey(this.ptr, bArr, str);
                if (nativePrepareRotateKey != null) {
                    Arrays.fill(bArr, (byte) 0);
                    preparedRotation = nativePrepareRotateKey;
                    str2 = null;
                    hl.c3(new d(this, mccVar, preparedRotation, str2, (byte) 0));
                    return;
                }
                try {
                    throw new IllegalStateException("Could not prepare key rotation");
                } catch (RuntimeException e2) {
                    e = e2;
                    preparedRotation2 = nativePrepareRotateKey;
                    String errorMessage = errorMessage(e);
                    Arrays.fill(bArr, (byte) 0);
                    str2 = errorMessage;
                    preparedRotation = preparedRotation2;
                    hl.c3(new d(this, mccVar, preparedRotation, str2, (byte) 0));
                    return;
                }
            }
            throw new IllegalStateException("Previous wallet send is still unresolved");
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
    }

    public void lambda$prepareSend$52(kcc kccVar, TL_wallet.sendTransfer sendtransfer, String str, String str2) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "NO_WALLET_ENGINE";
        }
        kccVar.a(sendtransfer, str, str2);
    }

    public void lambda$prepareSend$53(byte[] r14, java.lang.String r15, long r16, byte[] r18, byte[] r19, java.lang.String r20, defpackage.kcc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.lambda$prepareSend$53(byte[], java.lang.String, long, byte[], byte[], java.lang.String, kcc):void");
    }

    public void lambda$prepareSendNFT$27(icc iccVar) {
        String str;
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        } else {
            str = "Recovery phrase is required";
        }
        iccVar.a(null, str);
    }

    public void lambda$prepareSendNFT$28(icc iccVar, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "NO_WALLET_ENGINE";
        }
        iccVar.a(sendtransfer, str);
    }

    public void lambda$prepareSendNFT$29(java.lang.String r14, java.lang.String r15, java.lang.String r16, byte[] r17, defpackage.icc r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.lambda$prepareSendNFT$29(java.lang.String, java.lang.String, java.lang.String, byte[], icc):void");
    }

    public void lambda$prepareTonConnectTransfer$4(icc iccVar, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        iccVar.a(sendtransfer, str);
    }

    public void lambda$prepareTonConnectTransfer$5(byte[] bArr, z45 z45Var, String str, icc iccVar) {
        byte[] bArr2;
        RuntimeException runtimeException;
        String str2;
        TL_wallet.sendTransfer sendtransfer;
        TL_wallet.sendTransfer sendtransfer2 = null;
        try {
            try {
                try {
                } catch (RuntimeException e) {
                    e = e;
                    runtimeException = e;
                    String h = a55.h("wallet-engine transaction", runtimeException);
                    Arrays.fill(bArr2, (byte) 0);
                    str2 = h;
                    sendtransfer = sendtransfer2;
                    hl.c3(new zrc(this, iccVar, sendtransfer, str2, (byte) 0));
                    return;
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
            bArr2 = bArr;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th22;
        }
        if (!this.closed) {
            resolveBeforeNewSend();
            if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                bArr2 = bArr;
                TL_wallet.sendTransfer sendtransfer3 = nativePrepareTonConnectTransfer(this.ptr, bArr2, z45Var.a(), z45Var.a, str).transfer;
                try {
                    sendtransfer3.data_gasless = null;
                    sendtransfer3.gaslessMessageBodyHash = null;
                    Arrays.fill(bArr2, (byte) 0);
                    sendtransfer = sendtransfer3;
                    str2 = null;
                } catch (RuntimeException e3) {
                    runtimeException = e3;
                    sendtransfer2 = sendtransfer3;
                    String h2 = a55.h("wallet-engine transaction", runtimeException);
                    Arrays.fill(bArr2, (byte) 0);
                    str2 = h2;
                    sendtransfer = sendtransfer2;
                    hl.c3(new zrc(this, iccVar, sendtransfer, str2, (byte) 0));
                    return;
                }
                hl.c3(new zrc(this, iccVar, sendtransfer, str2, (byte) 0));
                return;
            }
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$prepareTonConnectTransferPair$7(icc iccVar, TL_wallet.sendTransfer sendtransfer, String str) {
        if (this.closed) {
            sendtransfer = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        iccVar.a(sendtransfer, str);
    }

    public void lambda$prepareTonConnectTransferPair$8(byte[] bArr, z45 z45Var, String str, z45 z45Var2, icc iccVar) {
        byte[] bArr2;
        RuntimeException runtimeException;
        String str2;
        TL_wallet.sendTransfer sendtransfer;
        String str3;
        TL_wallet.sendTransfer sendtransfer2 = null;
        try {
            try {
                try {
                } catch (RuntimeException e) {
                    e = e;
                    runtimeException = e;
                    String h = a55.h("wallet-engine transaction", runtimeException);
                    Arrays.fill(bArr2, (byte) 0);
                    str2 = h;
                    sendtransfer = sendtransfer2;
                    hl.c3(new zrc(this, iccVar, sendtransfer, str2, (byte) 1));
                    return;
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
            bArr2 = bArr;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th22;
        }
        if (!this.closed) {
            resolveBeforeNewSend();
            if (!isPendingPhase(nativeResolvePending(this.ptr).phase)) {
                bArr2 = bArr;
                TL_wallet.sendTransfer sendtransfer3 = nativePrepareTonConnectTransfer(this.ptr, bArr2, z45Var.a(), z45Var.a, str).transfer;
                try {
                    sendtransfer3.data_gasless = null;
                    sendtransfer3.gaslessMessageBodyHash = null;
                    try {
                        TL_wallet.sendTransfer sendtransfer4 = nativePrepareTonConnectTransfer(this.ptr, bArr2, z45Var2.a(), z45Var2.a, str + ":gasless").transfer;
                        sendtransfer3.data_gasless = sendtransfer4.data_gasless;
                        if (sendtransfer4.data_gasless == null) {
                            str3 = null;
                        } else {
                            str3 = sendtransfer4.gaslessMessageBodyHash;
                        }
                        sendtransfer3.gaslessMessageBodyHash = str3;
                    } catch (RuntimeException e3) {
                        cc4.g(e3, true);
                    }
                    Arrays.fill(bArr2, (byte) 0);
                    sendtransfer = sendtransfer3;
                    str2 = null;
                } catch (RuntimeException e4) {
                    runtimeException = e4;
                    sendtransfer2 = sendtransfer3;
                    String h2 = a55.h("wallet-engine transaction", runtimeException);
                    Arrays.fill(bArr2, (byte) 0);
                    str2 = h2;
                    sendtransfer = sendtransfer2;
                    hl.c3(new zrc(this, iccVar, sendtransfer, str2, (byte) 1));
                    return;
                }
                hl.c3(new zrc(this, iccVar, sendtransfer, str2, (byte) 1));
                return;
            }
            throw new IllegalStateException("Previous wallet send is still unresolved");
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$previewSignMessage$10(pcc pccVar, String str) {
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        pccVar.a(str);
    }

    public void lambda$previewSignMessage$11(z45 z45Var, pcc pccVar) {
        String h;
        try {
        } catch (RuntimeException e) {
            h = a55.h("preview signing", e);
        }
        if (!this.closed) {
            nativePreviewSignMessage(this.ptr, z45Var.a(), z45Var.a);
            h = null;
            hl.c3(new fsc(this, pccVar, h));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$previewTonConnect$1(icc iccVar, TL_wallet.walletTransaction wallettransaction, String str) {
        if (this.closed) {
            wallettransaction = null;
        }
        if (this.closed) {
            str = "Wallet engine is closed";
        }
        iccVar.a(wallettransaction, str);
    }

    public void lambda$previewTonConnect$2(z45 z45Var, icc iccVar) {
        String h;
        TL_wallet.walletTransaction wallettransaction;
        try {
        } catch (RuntimeException e) {
            h = a55.h("wallet-engine transaction", e);
            wallettransaction = null;
        }
        if (!this.closed) {
            wallettransaction = nativePreviewTonConnect(this.ptr, z45Var.a(), z45Var.a);
            h = null;
            hl.c3(new dsc(this, iccVar, wallettransaction, h, (byte) 1));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    public void lambda$rotateKey$55(RotationCallbacks rotationCallbacks, byte[] bArr, String str) {
        try {
            try {
                resolveBeforeNewSend();
                rotationCallbacks.state(SendPhase.VALIDATING.nativeValue, null, null);
                nativeRotateKey(this.ptr, bArr, str, rotationCallbacks);
            } catch (RuntimeException e) {
                rotationCallbacks.failed(errorMessage(e));
            }
        } finally {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public void lambda$signMessage$13(icc iccVar, String str, String str2) {
        if (this.closed) {
            str = null;
        }
        if (this.closed) {
            str2 = "Wallet engine is closed";
        }
        iccVar.a(str, str2);
    }

    public void lambda$signMessage$14(byte[] bArr, z45 z45Var, String str, icc iccVar) {
        String str2;
        String str3;
        try {
            try {
                try {
                } catch (RuntimeException e) {
                    e = e;
                    String h = a55.h("sign message", e);
                    Arrays.fill(bArr, (byte) 0);
                    str2 = h;
                    str3 = null;
                    hl.c3(new ipc(this, iccVar, str3, str2, (byte) 1));
                    return;
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Arrays.fill(bArr, (byte) 0);
                throw th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            Arrays.fill(bArr, (byte) 0);
            throw th22;
        }
        if (!this.closed) {
            String nativeSignMessage = nativeSignMessage(this.ptr, bArr, z45Var.a(), z45Var.a, str);
            Arrays.fill(bArr, (byte) 0);
            str3 = nativeSignMessage;
            str2 = null;
            hl.c3(new ipc(this, iccVar, str3, str2, (byte) 1));
            return;
        }
        throw new IllegalStateException("Wallet engine is closed");
    }

    private static native String[] mnemonicWordlist();

    private static native long nativeBalance(long j);

    private static native void nativeClose(long j);

    private static native long nativeCreate(int i, String str, byte[] bArr, HttpTransport httpTransport, String str2);

    private static native ImportedWalletProof nativeCreateImportProof(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z);

    private static native byte[] nativeDecryptComment(long j, byte[] bArr, String str, String str2);

    private static native byte[] nativeDecryptRawComment(byte[] bArr, String str, String str2);

    private static native TL_wallet.walletTransaction nativeEmulateRotateKey(long j, String str);

    private static native TL_wallet.walletTransaction nativeEmulateSend(long j, String str, long j2, byte[] bArr, boolean z);

    private static native TL_wallet.walletTransaction nativeEmulateSendNFT(long j, String str, String str2, byte[] bArr, String str3, long j2, long j3);

    private static native boolean nativeIsValidAddress(String str);

    public static native String nativeMessageBodyHash(String str);

    private static native PreparedRotation nativePrepareRotateKey(long j, byte[] bArr, String str);

    private static native PreparedSend nativePrepareSend(long j, byte[] bArr, String str, long j2, byte[] bArr2, byte[] bArr3, String str2, String str3);

    private static native PreparedSend nativePrepareSendNFT(long j, byte[] bArr, String str, String str2, byte[] bArr2, String str3, long j2, long j3);

    private static native PreparedSend nativePrepareTonConnectTransfer(long j, byte[] bArr, String[] strArr, long j2, String str);

    private static native void nativePreviewSignMessage(long j, String[] strArr, long j2);

    private static native TL_wallet.walletTransaction nativePreviewTonConnect(long j, String[] strArr, long j2);

    private static native SendResolution nativeResolvePending(long j);

    private static native void nativeRotateKey(long j, byte[] bArr, String str, RotationCallbacks rotationCallbacks);

    private static native String nativeSecretPhraseToAddress(byte[] bArr);

    private static native byte[] nativeSecretPhraseToPublicKey(byte[] bArr);

    private static native TL_wallet.walletTransaction nativeSend(long j, byte[] bArr, String str, long j2, byte[] bArr2, byte[] bArr3, String str2, SendCallbacks sendCallbacks);

    private static native String nativeSignMessage(long j, byte[] bArr, String[] strArr, long j2, String str);

    private static native byte[] nativeTonConnectCrypto(byte[] bArr, byte[] bArr2);

    private static native String nativeTransactionAddress(String str);

    private static org.telegram.tgnet.tl.TL_wallet.walletTransaction parseTransactionResponse(byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.parseTransactionResponse(byte[]):org.telegram.tgnet.tl.TL_wallet$walletTransaction");
    }

    private static int readBocInt(ByteBuffer byteBuffer, int i) {
        if (i >= 1 && i <= 4) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | (byteBuffer.get() & 255);
            }
            if (j <= 2147483647L) {
                return (int) j;
            }
            lq5.j("BOC integer overflow");
            return 0;
        }
        lq5.j("Invalid BOC integer size");
        return 0;
    }

    private void resolveBeforeNewSend() {
        if (!this.closed) {
            return;
        }
        grb.i("NO_WALLET_ENGINE");
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

    public static String secretPhraseToAddress(c35 c35Var) {
        if (c35Var != null && !c35Var.d()) {
            byte[] c = c35Var.c();
            try {
                return nativeSecretPhraseToAddress(c);
            } finally {
                Arrays.fill(c, (byte) 0);
            }
        }
        lq5.j("Recovery phrase is required");
        return null;
    }

    public static byte[] secretPhraseToAnchorPublicKey(c35 c35Var) {
        c35 c35Var2;
        if (c35Var != null && !c35Var.d()) {
            int g = c35Var.g();
            if (g != 12 && g != 24) {
                lq5.j("Recovery phrase must contain 12 or 24 words");
                return null;
            }
            synchronized (c35Var) {
                c35Var.a();
                int i = 0;
                while (true) {
                    byte[] bArr = c35Var.a;
                    if (i >= bArr.length || !c35.e(bArr[i])) {
                        break;
                    }
                    i++;
                }
                int i2 = 0;
                int i3 = i;
                while (true) {
                    byte[] bArr2 = c35Var.a;
                    if (i2 < 12) {
                        if (i3 != bArr2.length) {
                            while (true) {
                                byte[] bArr3 = c35Var.a;
                                if (i3 >= bArr3.length || c35.e(bArr3[i3])) {
                                    break;
                                }
                                i3++;
                            }
                            i2++;
                            if (i2 < 12) {
                                while (true) {
                                    byte[] bArr4 = c35Var.a;
                                    if (i3 < bArr4.length && c35.e(bArr4[i3])) {
                                        i3++;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Not enough recovery words");
                        }
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, i3);
                        c35Var2 = new c35(copyOfRange);
                        Arrays.fill(copyOfRange, (byte) 0);
                    }
                }
            }
            try {
                byte[] secretPhraseToPublicKey = secretPhraseToPublicKey(c35Var2);
                c35Var2.close();
                return secretPhraseToPublicKey;
            } catch (Throwable th) {
                try {
                    c35Var2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        lq5.j("Recovery phrase is required");
        return null;
    }

    public static byte[] secretPhraseToPublicKey(c35 c35Var) {
        if (c35Var != null && !c35Var.d()) {
            byte[] c = c35Var.c();
            try {
                return nativeSecretPhraseToPublicKey(c);
            } finally {
                Arrays.fill(c, (byte) 0);
            }
        }
        lq5.j("Recovery phrase is required");
        return null;
    }

    private static void setTransactionPhase(TL_wallet.walletTransaction wallettransaction, int i) {
        boolean z;
        SendPhase fromNative = SendPhase.fromNative(i);
        wallettransaction.phase = fromNative;
        wallettransaction.failed = isFailedPhase(fromNative);
        if (!wallettransaction.preview && isPendingPhase(wallettransaction.phase)) {
            z = true;
        } else {
            z = false;
        }
        wallettransaction.pending = z;
    }

    public static JSONObject signData(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject, String str2, int i) {
        JSONObject jSONObject2 = tonConnectCrypto(c35Var, tonconnectsession, str, bArr, new JSONObject().put("signData", jSONObject).put("signDomain", str2).put("timestamp", i));
        return new JSONObject().put("signature", jSONObject2.getString("signature")).put("address", jSONObject2.getString("address")).put("timestamp", i).put("domain", str2).put("payload", jSONObject);
    }

    public static java.lang.String textCommentFromBody(java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.WalletEngine2.textCommentFromBody(java.lang.String):java.lang.String");
    }

    public static String toUserFriendlyAddress(String str) {
        return nativeTransactionAddress(str);
    }

    public static JSONObject tonConnectCrypto(c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONObject jSONObject) {
        String str2;
        byte[] bArr2 = null;
        if (tonconnectsession != null && tonconnectsession.nonce != null && (str2 = tonconnectsession.dapp_client_id) != null && c35Var != null && str != null && bArr != null) {
            jSONObject.put("dappClientId", str2);
            jSONObject.put("sessionNonce", Base64.encodeToString(tonconnectsession.nonce, 2));
            jSONObject.put("clientId", tonconnectsession.client_id);
            jSONObject.put("walletPublicKey", Base64.encodeToString(bArr, 2));
            jSONObject.put("walletAddress", str);
            byte[] c = c35Var.c();
            try {
                String jSONObject2 = jSONObject.toString();
                Charset charset = StandardCharsets.UTF_8;
                bArr2 = nativeTonConnectCrypto(c, jSONObject2.getBytes(charset));
                return new JSONObject(new String(bArr2, charset));
            } finally {
                Arrays.fill(c, (byte) 0);
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
            }
        }
        lq5.j("Missing TON Connect crypto parameters");
        return null;
    }

    public synchronized void balance(icc iccVar) {
        this.worker.execute(new csc(this, iccVar, (byte) 2));
    }

    @Override
    public synchronized void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.transport.close();
        this.worker.execute(new olc(this, (byte) 11));
    }

    public void decryptTransactionComment(c35 c35Var, String str, icc iccVar) {
        icc iccVar2;
        if (iccVar != null) {
            if (c35Var != null && !c35Var.d()) {
                if (str != null && !str.isEmpty()) {
                    if (this.closed) {
                        hl.c3(new g25(iccVar, (byte) 13));
                        return;
                    }
                    byte[] c = c35Var.c();
                    try {
                        iccVar2 = iccVar;
                    } catch (RejectedExecutionException unused) {
                        iccVar2 = iccVar;
                    }
                    try {
                        this.worker.execute(new ipc(this, str, c, iccVar2, (byte) 2));
                        return;
                    } catch (RejectedExecutionException unused2) {
                        Arrays.fill(c, (byte) 0);
                        hl.c3(new g25(iccVar2, (byte) 14));
                        return;
                    }
                }
                hl.c3(new g25(iccVar, (byte) 12));
                return;
            }
            hl.c3(new g25(iccVar, (byte) 11));
            return;
        }
        lq5.j("Result callback is required");
    }

    public void emulateRotateKey(icc iccVar) {
        if (iccVar != null) {
            if (this.closed) {
                hl.c3(new g25(iccVar, (byte) 9));
                return;
            }
            try {
                this.worker.execute(new csc(this, iccVar, (byte) 0));
                return;
            } catch (RejectedExecutionException unused) {
                hl.c3(new g25(iccVar, (byte) 10));
                return;
            }
        }
        lq5.j("Result callback is required");
    }

    public Runnable emulateSend(final String str, final long j, String str2, final byte[] bArr, final icc iccVar) {
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
                Void lambda$emulateSend$19;
                lambda$emulateSend$19 = WalletEngine2.this.lambda$emulateSend$19(atomicBoolean, bArr2, bArr, str, j, iccVar);
                return lambda$emulateSend$19;
            }
        });
        try {
            this.worker.execute(futureTask);
        } catch (RejectedExecutionException unused) {
            hl.c3(new hsc(atomicBoolean, iccVar, (byte) 0));
        }
        return new isc(atomicBoolean, futureTask, (byte) 0);
    }

    public synchronized Runnable emulateSendNFT(String str, String str2, String str3, icc iccVar) {
        WalletEngine2 walletEngine2;
        try {
            try {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                walletEngine2 = this;
                FutureTask futureTask = new FutureTask(new p0c(walletEngine2, atomicBoolean, str, str2, str3, iccVar, (byte) 1));
                if (walletEngine2.closed) {
                    hl.c3(new hsc(atomicBoolean, iccVar, (byte) 1));
                } else {
                    try {
                        walletEngine2.worker.execute(futureTask);
                    } catch (RejectedExecutionException unused) {
                        hl.c3(new hsc(atomicBoolean, iccVar, (byte) 2));
                    }
                }
                isc iscVar = new isc(atomicBoolean, futureTask, (byte) 1);
                return iscVar;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            walletEngine2 = this;
            Throwable th22 = th;
            throw th22;
        }
    }

    public void getTransactionByHash(String str, pcc pccVar) {
        if (pccVar != null) {
            if (str != null && !str.isEmpty() && !this.closed) {
                try {
                    this.worker.execute(new fsc(this, str, pccVar));
                    return;
                } catch (RejectedExecutionException unused) {
                    hl.c3(new jn0(pccVar, (byte) 17));
                    return;
                }
            }
            hl.c3(new jn0(pccVar, (byte) 16));
            return;
        }
        lq5.j("Result callback is required");
    }

    public void prepareRotateKey(c35 c35Var, String str, final mcc mccVar) {
        final mcc mccVar2;
        if (mccVar != null) {
            if (this.closed) {
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        mcc mccVar3 = mccVar;
                        switch (b) {
                            case 0:
                                mccVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                mccVar3.a(null, null, null, "Recovery phrase is required");
                                return;
                            default:
                                mccVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
            } else if (c35Var != null && !c35Var.d()) {
                byte[] c = c35Var.c();
                try {
                    mccVar2 = mccVar;
                    try {
                        this.worker.execute(new ipc(this, c, str, mccVar2, (byte) 3));
                    } catch (RejectedExecutionException unused) {
                        Arrays.fill(c, (byte) 0);
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r2;
                                mcc mccVar3 = mccVar2;
                                switch (b) {
                                    case 0:
                                        mccVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                        return;
                                    case 1:
                                        mccVar3.a(null, null, null, "Recovery phrase is required");
                                        return;
                                    default:
                                        mccVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                        return;
                                }
                            }
                        });
                    }
                } catch (RejectedExecutionException unused2) {
                    mccVar2 = mccVar;
                }
            } else {
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        mcc mccVar3 = mccVar;
                        switch (b) {
                            case 0:
                                mccVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                mccVar3.a(null, null, null, "Recovery phrase is required");
                                return;
                            default:
                                mccVar3.a(null, null, null, "NO_WALLET_ENGINE");
                                return;
                        }
                    }
                });
            }
        } else {
            lq5.j("Result callback is required");
        }
    }

    public void prepareSend(c35 c35Var, String str, long j, String str2, byte[] bArr, String str3, final kcc kccVar) {
        byte[] bArr2;
        if (kccVar != null) {
            if (this.closed) {
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        kcc kccVar2 = kccVar;
                        switch (b) {
                            case 0:
                                kccVar2.a(null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                kccVar2.a(null, null, "NO_WALLET_ENGINE");
                                return;
                            default:
                                kccVar2.a(null, null, "Recovery phrase is required");
                                return;
                        }
                    }
                });
                return;
            } else if (c35Var != null && !c35Var.d()) {
                byte[] bArr3 = null;
                if (bArr == null) {
                    bArr2 = null;
                } else {
                    bArr2 = (byte[]) bArr.clone();
                }
                byte[] c = c35Var.c();
                if (str2 != null) {
                    bArr3 = str2.getBytes(StandardCharsets.UTF_8);
                }
                try {
                    this.worker.execute(new eh3(this, c, str, j, bArr3, bArr2, str3, kccVar, (byte) 4));
                    return;
                } catch (RejectedExecutionException unused) {
                    Arrays.fill(c, (byte) 0);
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b = r2;
                            kcc kccVar2 = kccVar;
                            switch (b) {
                                case 0:
                                    kccVar2.a(null, null, "NO_WALLET_ENGINE");
                                    return;
                                case 1:
                                    kccVar2.a(null, null, "NO_WALLET_ENGINE");
                                    return;
                                default:
                                    kccVar2.a(null, null, "Recovery phrase is required");
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else {
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        kcc kccVar2 = kccVar;
                        switch (b) {
                            case 0:
                                kccVar2.a(null, null, "NO_WALLET_ENGINE");
                                return;
                            case 1:
                                kccVar2.a(null, null, "NO_WALLET_ENGINE");
                                return;
                            default:
                                kccVar2.a(null, null, "Recovery phrase is required");
                                return;
                        }
                    }
                });
                return;
            }
        }
        lq5.j("Result callback is required");
    }

    public synchronized void prepareSendNFT(c35 c35Var, String str, String str2, String str3, icc iccVar) {
        WalletEngine2 walletEngine2;
        icc iccVar2;
        try {
            try {
                if (!this.closed && c35Var != null && !c35Var.d()) {
                    byte[] c = c35Var.c();
                    try {
                        walletEngine2 = this;
                        iccVar2 = iccVar;
                        try {
                            this.worker.execute(new esa(walletEngine2, str, str2, str3, c, iccVar2, (byte) 11));
                        } catch (RejectedExecutionException unused) {
                            Arrays.fill(c, (byte) 0);
                            hl.c3(new g25(iccVar2, (byte) 15));
                            return;
                        }
                    } catch (RejectedExecutionException unused2) {
                        walletEngine2 = this;
                        iccVar2 = iccVar;
                    }
                    return;
                }
                hl.c3(new csc(this, iccVar, (byte) 1));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void prepareTonConnectTransfer(c35 c35Var, z45 z45Var, String str, icc iccVar) {
        icc iccVar2;
        byte[] c = c35Var.c();
        try {
            iccVar2 = iccVar;
        } catch (RejectedExecutionException e) {
            e = e;
            iccVar2 = iccVar;
        }
        try {
            this.worker.execute(new bsc(this, c, z45Var, str, iccVar2, (byte) 1));
        } catch (RejectedExecutionException e2) {
            e = e2;
            RejectedExecutionException rejectedExecutionException = e;
            Arrays.fill(c, (byte) 0);
            hl.c3(new f3c(iccVar2, a55.h("schedule transaction signing", rejectedExecutionException), (byte) 2));
        }
    }

    public void prepareTonConnectTransferPair(c35 c35Var, z45 z45Var, z45 z45Var2, String str, icc iccVar) {
        icc iccVar2;
        byte[] c = c35Var.c();
        try {
            iccVar2 = iccVar;
        } catch (RejectedExecutionException e) {
            e = e;
            iccVar2 = iccVar;
        }
        try {
            this.worker.execute(new esa(this, c, z45Var, str, z45Var2, iccVar2, (byte) 10));
        } catch (RejectedExecutionException e2) {
            e = e2;
            RejectedExecutionException rejectedExecutionException = e;
            Arrays.fill(c, (byte) 0);
            hl.c3(new f3c(iccVar2, a55.h("schedule transaction signing", rejectedExecutionException), (byte) 1));
        }
    }

    public void previewSignMessage(z45 z45Var, pcc pccVar) {
        try {
            this.worker.execute(new b6c(this, z45Var, pccVar, (byte) 23));
        } catch (RejectedExecutionException unused) {
            hl.c3(new jn0(pccVar, (byte) 15));
        }
    }

    public void previewTonConnect(z45 z45Var, icc iccVar) {
        try {
            this.worker.execute(new b6c(this, z45Var, iccVar, (byte) 26));
        } catch (RejectedExecutionException e) {
            hl.c3(new f3c(iccVar, a55.h("schedule transaction preview", e), (byte) 3));
        }
    }

    public void rotateKey(c35 c35Var, icc iccVar, icc iccVar2) {
        RotationCallbacks rotationCallbacks = new RotationCallbacks(iccVar2, iccVar);
        if (c35Var != null && !c35Var.d() && iccVar != null) {
            byte[] c = c35Var.c();
            try {
                this.worker.execute(new d(this, rotationCallbacks, c, UUID.randomUUID().toString(), (byte) 1));
                return;
            } catch (RejectedExecutionException unused) {
                Arrays.fill(c, (byte) 0);
                rotationCallbacks.failed("NO_WALLET_ENGINE");
                return;
            }
        }
        rotationCallbacks.failed("Current recovery phrase and replacement callback are required");
    }

    public void signMessage(c35 c35Var, z45 z45Var, String str, icc iccVar) {
        icc iccVar2;
        byte[] c = c35Var.c();
        try {
            iccVar2 = iccVar;
        } catch (RejectedExecutionException unused) {
            iccVar2 = iccVar;
        }
        try {
            this.worker.execute(new bsc(this, c, z45Var, str, iccVar2, (byte) 0));
        } catch (RejectedExecutionException unused2) {
            Arrays.fill(c, (byte) 0);
            hl.c3(new g25(iccVar2, (byte) 8));
        }
    }

    public synchronized Runnable emulateSendNFT(String str, String str2, icc iccVar) {
        return emulateSendNFT(str, str2, null, iccVar);
    }

    public synchronized void prepareSendNFT(c35 c35Var, String str, String str2, icc iccVar) {
        prepareSendNFT(c35Var, str, str2, null, iccVar);
    }
}
