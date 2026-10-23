package org.telegram.ui.Wallet;

import ai.md;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.en0;
import org.telegram.ui.jg0;
import org.telegram.ui.na0;
public final class m0 {
    public static volatile m0[] O = new m0[4];
    public static final long[] P = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static DecimalFormat Q;
    public int C;
    public final ArrayList G;
    public final List H;
    public String I;
    public final g J;
    public final HashMap K;
    public final HashMap L;
    public final HashMap M;
    public final HashMap N;
    public final int f34481a;
    public WalletEngine2 f34482b;
    public q0 f34483c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f34484f;
    public final f2 f34485g;
    public final f h;
    public Boolean f34486i;
    public String f34487j;
    public long f34488k;
    public boolean f34489l;
    public boolean f34490m;
    public l0 f34491n;
    public e0 f34492o;
    public a1 f34496s;
    public String f34498u;
    public String f34500x;
    public int f34501y;
    public final ArrayList f34493p = new ArrayList();
    public final HashMap f34494q = new HashMap();
    public final ArrayList f34495r = new ArrayList();
    public final HashMap f34497t = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ArrayList f34499w = new ArrayList();
    public final g f34502z = new Runnable(this) {
        public final m0 f34230b;

        {
            this.f34230b = this;
        }

        @Override
        public final void run() {
            e0 e0Var;
            l0 l0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    m0 m0Var = this.f34230b;
                    if (!TextUtils.isEmpty(m0Var.f34500x) && (e0Var = m0Var.f34492o) != null && e0Var.d(m0Var.f34500x) && (l0Var = m0Var.f34491n) != null) {
                        ArrayList arrayList = l0Var.f34452b;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, m0Var.f34500x)) {
                                return;
                            }
                        }
                    }
                    if (m0Var.f34492o == null) {
                        m0Var.f34492o = new e0(m0Var);
                    }
                    e0 e0Var2 = m0Var.f34492o;
                    if (!e0Var2.f34143j) {
                        e0Var2.b();
                        e0Var2.f(true);
                    }
                    m0Var.A().g();
                    m0Var.C();
                    int i11 = m0Var.f34501y;
                    if (i11 < 7) {
                        g gVar = m0Var.f34502z;
                        m0Var.f34501y = i11 + 1;
                        AndroidUtilities.runOnUIThread(gVar, m0.P[i11]);
                        return;
                    }
                    return;
                case 1:
                    m0 m0Var2 = this.f34230b;
                    a1 a1Var = m0Var2.f34496s;
                    if (a1Var != null && a1Var.d) {
                        m0Var2.C();
                        return;
                    }
                    return;
                default:
                    m0 m0Var3 = this.f34230b;
                    m0Var3.U();
                    m0Var3.J();
                    return;
            }
        }
    };
    public int A = -1;
    public int B = -1;
    public int D = 0;
    public final HashSet E = new HashSet();
    public final g F = new Runnable(this) {
        public final m0 f34230b;

        {
            this.f34230b = this;
        }

        @Override
        public final void run() {
            e0 e0Var;
            l0 l0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    m0 m0Var = this.f34230b;
                    if (!TextUtils.isEmpty(m0Var.f34500x) && (e0Var = m0Var.f34492o) != null && e0Var.d(m0Var.f34500x) && (l0Var = m0Var.f34491n) != null) {
                        ArrayList arrayList = l0Var.f34452b;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, m0Var.f34500x)) {
                                return;
                            }
                        }
                    }
                    if (m0Var.f34492o == null) {
                        m0Var.f34492o = new e0(m0Var);
                    }
                    e0 e0Var2 = m0Var.f34492o;
                    if (!e0Var2.f34143j) {
                        e0Var2.b();
                        e0Var2.f(true);
                    }
                    m0Var.A().g();
                    m0Var.C();
                    int i11 = m0Var.f34501y;
                    if (i11 < 7) {
                        g gVar = m0Var.f34502z;
                        m0Var.f34501y = i11 + 1;
                        AndroidUtilities.runOnUIThread(gVar, m0.P[i11]);
                        return;
                    }
                    return;
                case 1:
                    m0 m0Var2 = this.f34230b;
                    a1 a1Var = m0Var2.f34496s;
                    if (a1Var != null && a1Var.d) {
                        m0Var2.C();
                        return;
                    }
                    return;
                default:
                    m0 m0Var3 = this.f34230b;
                    m0Var3.U();
                    m0Var3.J();
                    return;
            }
        }
    };

    public m0(int i10) {
        boolean z10 = false;
        this.C = -1;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        this.J = new Runnable(this) {
            public final m0 f34230b;

            {
                this.f34230b = this;
            }

            @Override
            public final void run() {
                e0 e0Var;
                l0 l0Var;
                TL_wallet.nftItem nftitem;
                switch (r2) {
                    case 0:
                        m0 m0Var = this.f34230b;
                        if (!TextUtils.isEmpty(m0Var.f34500x) && (e0Var = m0Var.f34492o) != null && e0Var.d(m0Var.f34500x) && (l0Var = m0Var.f34491n) != null) {
                            ArrayList arrayList2 = l0Var.f34452b;
                            int size = arrayList2.size();
                            int i102 = 0;
                            while (i102 < size) {
                                Object obj = arrayList2.get(i102);
                                i102++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, m0Var.f34500x)) {
                                    return;
                                }
                            }
                        }
                        if (m0Var.f34492o == null) {
                            m0Var.f34492o = new e0(m0Var);
                        }
                        e0 e0Var2 = m0Var.f34492o;
                        if (!e0Var2.f34143j) {
                            e0Var2.b();
                            e0Var2.f(true);
                        }
                        m0Var.A().g();
                        m0Var.C();
                        int i11 = m0Var.f34501y;
                        if (i11 < 7) {
                            g gVar = m0Var.f34502z;
                            m0Var.f34501y = i11 + 1;
                            AndroidUtilities.runOnUIThread(gVar, m0.P[i11]);
                            return;
                        }
                        return;
                    case 1:
                        m0 m0Var2 = this.f34230b;
                        a1 a1Var = m0Var2.f34496s;
                        if (a1Var != null && a1Var.d) {
                            m0Var2.C();
                            return;
                        }
                        return;
                    default:
                        m0 m0Var3 = this.f34230b;
                        m0Var3.U();
                        m0Var3.J();
                        return;
                }
            }
        };
        this.K = new HashMap();
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = new HashMap();
        this.f34481a = i10;
        try {
            this.f34490m = v().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e) {
            j("failed to load prefs", e);
        }
        this.h = new f(this);
        W();
        V();
        F("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.f34481a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new Object(), new i(this, 0));
        this.f34485g = new f2(this);
        g gVar = this.J;
        Object obj = q0.f34757f;
        synchronized (q0.class) {
            try {
                Iterator it = q0.f34759i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        q0.f34759i.remove(weakReference);
                    } else if (runnable == gVar) {
                        z10 = true;
                    }
                }
                if (gVar != null && !z10) {
                    q0.f34759i.add(new WeakReference(gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        U();
    }

    public static void F(String str) {
        FileLog.d("[gram-wallet] " + str);
    }

    public static boolean G(MessageObject messageObject, TL_wallet.walletTransaction wallettransaction) {
        if (messageObject != null && messageObject.messageOwner != null && wallettransaction != null && messageObject.isOutOwner()) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j10 = wallettransaction.random_id;
                if (j10 == 0 || message.random_id != j10) {
                    if (wallettransaction.localMessageId == 0 || messageObject.getId() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f20539id) && TextUtils.equals(wallettransaction.f20539id, tL_messageActionGramTransfer.transaction_id)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] R(byte[] bArr) {
        byte[] bArr2 = new byte[215];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z10 = false;
            int i10 = 0;
            for (byte b10 : bArr) {
                if (j0.f(b10)) {
                    if (i10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    if (z10) {
                        if (i10 != 215) {
                            int i11 = i10 + 1;
                            bArr2[i10] = 32;
                            i10 = i11;
                            z10 = false;
                        } else {
                            throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                        }
                    }
                    if (i10 != 215) {
                        bArr2[i10] = b10;
                        i10++;
                    } else {
                        throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                    }
                }
            }
            return bArr2;
        } catch (RuntimeException e) {
            Arrays.fill(bArr2, (byte) 0);
            throw e;
        }
    }

    public static String T(String str, boolean z10) {
        byte b10;
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    if (z10) {
                        b10 = 17;
                    } else {
                        b10 = 81;
                    }
                    bArr[0] = b10;
                    bArr[1] = (byte) parseInt;
                    for (int i10 = 0; i10 < 32; i10++) {
                        int i11 = i10 * 2;
                        bArr[i10 + 2] = (byte) Integer.parseInt(substring.substring(i11, i11 + 2), 16);
                    }
                    int i12 = 0;
                    for (int i13 = 0; i13 < 34; i13++) {
                        i12 ^= (bArr[i13] & 255) << 8;
                        for (int i14 = 0; i14 < 8; i14++) {
                            int i15 = 32768 & i12;
                            int i16 = i12 << 1;
                            if (i15 != 0) {
                                i16 ^= 4129;
                            }
                            i12 = i16 & 65535;
                        }
                    }
                    bArr[34] = (byte) (i12 >>> 8);
                    bArr[35] = (byte) i12;
                    return Base64.encodeToString(bArr, 11);
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean a(String str, String str2) {
        String g02 = g0(str);
        String g03 = g0(str2);
        if (g02 != null && g02.equals(g03)) {
            return true;
        }
        return false;
    }

    public static boolean a0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            try {
                return Arrays.equals(e0(str), e0(str2));
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public static byte[][] c0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length == 215) {
            byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, 3, 215);
            try {
                secureRandom.nextBytes(bArr2[0]);
                secureRandom.nextBytes(bArr2[1]);
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    bArr2[2][i10] = (byte) ((bArr[i10] ^ bArr2[0][i10]) ^ bArr2[1][i10]);
                }
                return bArr2;
            } catch (RuntimeException e) {
                for (byte[] bArr3 : bArr2) {
                    Arrays.fill(bArr3, (byte) 0);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException("INVALID_MNEMONIC_BACKUP_SIZE");
    }

    public static byte[] e0(String str) {
        if (str.matches("[0-9a-fA-F]{64}")) {
            byte[] bArr = new byte[32];
            for (int i10 = 0; i10 < 32; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
            }
            return bArr;
        }
        byte[] decode = Base64.decode(str.replace('-', '+').replace('_', '/'), 0);
        if (decode.length == 32) {
            return decode;
        }
        throw new IllegalArgumentException("Invalid transaction hash");
    }

    public static TL_wallet.WalletTransactionPeer f(TLRPC.User user, String str, String str2) {
        TL_wallet.WalletTransactionPeer wallettransactionpeeraddress;
        if (user != null) {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeraddress.user_id = user.f20427id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
    }

    public static boolean f0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((TextUtils.isEmpty(wallettransaction.f20539id) || !TextUtils.equals(wallettransaction.f20539id, wallettransaction2.f20539id)) && !a0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !a0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            if (!wallettransaction.incoming && !wallettransaction2.incoming) {
                if (!a0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) && !a0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static e2 g(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
            str = T(stargiftdepositpayload.nft_address, true);
        } else {
            str = stargiftdepositpayload.nft_address;
        }
        return new e2(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static String g0(String str) {
        if (str == null) {
            return null;
        }
        if (str.matches("-?[0-9]+:[0-9a-fA-F]{64}")) {
            return str.toLowerCase(Locale.ROOT);
        }
        try {
            byte[] decode = Base64.decode(str.replace('-', '+').replace('_', '/'), 0);
            if (decode.length != 36) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) decode[1]);
            sb2.append(':');
            for (int i10 = 2; i10 < 34; i10++) {
                sb2.append(Character.forDigit((decode[i10] >> 4) & 15, 16));
                sb2.append(Character.forDigit(decode[i10] & 15, 16));
            }
            return sb2.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void i(String str) {
        FileLog.e("[gram-wallet] " + str);
    }

    public static void j(String str, Throwable th2) {
        FileLog.e("[gram-wallet] " + str, th2);
    }

    public static SpannableStringBuilder k(String str, CharSequence charSequence, int i10) {
        long abs;
        String replace = charSequence.toString().replace((char) 8211, '-');
        String string = LocaleController.getString(i10);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                if (parseLong >= -2147483647L && parseLong <= 2147483647L) {
                    abs = Math.abs(parseLong);
                } else {
                    abs = Math.abs(parseLong % 100) + 100;
                }
                string = LocaleController.getPluralString(str, (int) abs);
            } catch (NumberFormatException unused) {
            }
        }
        return AndroidUtilities.replaceCharSequence("%1$s", string, charSequence);
    }

    public static SpannableStringBuilder m(long j10, boolean z10) {
        return k("GramCapital", n(j10, z10), R.string.GramCapital_other);
    }

    public static String n(long j10, boolean z10) {
        if ((j10 > -10000000 && j10 < 10000000) || z10) {
            return md.N0(j10);
        }
        if (Q == null) {
            Q = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return Q.format(j10 / 1.0E9d);
    }

    public static String o(long j10, boolean z10) {
        boolean z11;
        int i10;
        BigDecimal stripTrailingZeros;
        if (j10 > -1000000000 && j10 < 1000000000) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 && z11) {
            return n(j10, true);
        }
        if (z10) {
            i10 = 4;
        } else if (z11) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        BigDecimal scale = BigDecimal.valueOf(j10, 9).setScale(i10, RoundingMode.DOWN);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static SpannableStringBuilder p(String str, float f7) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i10 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), i10, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder q(long j10) {
        return r(j10, false);
    }

    public static SpannableStringBuilder r(long j10, boolean z10) {
        return k("Grams", n(j10, z10), R.string.Grams_other);
    }

    public static Context v() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            return U.getContext();
        }
        return ApplicationLoader.applicationContext;
    }

    public static m0 w(int i10) {
        m0 m0Var;
        m0 m0Var2 = O[i10];
        if (m0Var2 == null) {
            synchronized (m0.class) {
                try {
                    m0Var = O[i10];
                    if (m0Var == null) {
                        m0[] m0VarArr = O;
                        m0 m0Var3 = new m0(i10);
                        m0VarArr[i10] = m0Var3;
                        m0Var = m0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m0Var;
        }
        return m0Var2;
    }

    public static TL_update.TL_updateSentWalletTransaction z(TLRPC.Updates updates) {
        if (updates != null) {
            TLRPC.Update update = updates.update;
            if (update instanceof TL_update.TL_updateSentWalletTransaction) {
                return (TL_update.TL_updateSentWalletTransaction) update;
            }
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Update update2 = arrayList.get(i10);
                i10++;
                TLRPC.Update update3 = update2;
                if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                    return (TL_update.TL_updateSentWalletTransaction) update3;
                }
            }
            return null;
        }
        return null;
    }

    public final l0 A() {
        if (this.f34491n == null) {
            this.f34491n = new l0(this);
        }
        return this.f34491n;
    }

    public final void B(boolean z10, boolean z11, j0 j0Var, Utilities.Callback callback) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(j0Var)) {
                callback.run("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(j0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(j0Var);
            j0 b10 = j0Var.b();
            F("import wallet: requesting proof challenge");
            s2.a(this.f34481a, null, new q(this, b10, callback, secretPhraseToAnchorPublicKey, 2), null, null, new t(this, callback, secretPhraseToPublicKey, b10), z10, z11, new na0(new n(b10, 2), 1));
        } catch (Exception unused2) {
            callback.run("INVALID_PHRASE");
        }
    }

    public final void C() {
        l0 l0Var = this.f34491n;
        if (l0Var != null) {
            l0Var.g();
        }
        if (this.A >= 0) {
            return;
        }
        W();
    }

    public final boolean D() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f34484f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f34482b != null && this.f34483c != null) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        q0 q0Var;
        boolean z10;
        if (!(this.e instanceof TL_wallet.TL_walletState) || (q0Var = this.f34483c) == null) {
            return false;
        }
        q0Var.getClass();
        synchronized (q0.f34757f) {
            try {
                try {
                    z10 = q0Var.r().f32285c;
                } catch (Exception e) {
                    FileLog.e(e);
                    z10 = true;
                }
            } finally {
            }
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final boolean I() {
        if (this.f34490m && !SharedConfig.passcodeHash.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void J() {
        NotificationCenter.getInstance(this.f34481a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this);
    }

    public final void K(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m0.K(org.json.JSONObject):void");
    }

    public final void L() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        q0 q0Var = this.f34483c;
        if (q0Var != null && !TextUtils.equals(q0Var.f34762c, str)) {
            if (str == null) {
                F("received empty state, leaving wallet storage of " + this.f34483c.f34762c);
            } else {
                StringBuilder v = a1.g.v("received new state of ", str, ", leaving wallet storage of ");
                v.append(this.f34483c.f34762c);
                F(v.toString());
            }
            this.f34483c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f34483c == null) {
            F("setting up wallet storage of " + str);
            this.f34483c = new q0(ApplicationLoader.applicationContext, str, this.f34481a);
            F("storage public keys = " + this.f34483c.m().length);
        }
        e0 e0Var = this.f34492o;
        if (e0Var != null && !TextUtils.equals(e0Var.e, str)) {
            e0Var.e = str;
            e0Var.c();
        }
        if (this.f34482b != null && !TextUtils.equals(this.d, str)) {
            this.f34482b.close();
            this.f34482b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f34482b == null || !TextUtils.equals(this.d, str))) {
            if (this.f34482b != null) {
                F("closing wallet-engine of " + this.d);
                this.f34482b.close();
                this.f34482b = null;
            }
            F("creating wallet-engine for " + str);
            try {
                int i10 = this.f34481a;
                this.d = str;
                this.f34482b = new WalletEngine2(i10, str, bArr);
            } catch (Exception e) {
                j("failed to create engine!", e);
                this.d = null;
            }
        }
        int i11 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f34482b != null) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
            }
            this.v.clear();
        }
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f34482b != null && this.f34484f != null) {
            ArrayList arrayList2 = this.f34499w;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
            this.f34499w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            U();
        }
        Q();
    }

    public final void M(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str)) {
            try {
                e0(str);
                ArrayList arrayList = this.f34493p;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = wallettransaction.messageHash;
                    String str3 = tL_updateSentWalletTransaction.msg_hash;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && a0(str2, str3)) {
                        c(wallettransaction, tL_updateSentWalletTransaction);
                        return;
                    }
                }
                TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
                if (wallettransaction2 != null) {
                    wallettransaction2.messageHash = tL_updateSentWalletTransaction.msg_hash;
                    wallettransaction2.gasless = tL_updateSentWalletTransaction.gasless;
                    wallettransaction2.pending = false;
                    arrayList.add(0, wallettransaction2);
                    A().k();
                    A().i();
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void N(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f34484f = tL_updateWalletGaslessInfo;
        L();
        J();
    }

    public final void O(TL_update.TL_updateWalletState tL_updateWalletState) {
        i0(tL_updateWalletState.state);
    }

    public final void P() {
        d0();
        this.f34493p.clear();
        ArrayList arrayList = this.f34495r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0 j0Var = ((g0) obj).f34232b;
            if (j0Var != null) {
                j0Var.close();
            }
        }
        arrayList.clear();
        l0 l0Var = this.f34491n;
        if (l0Var != null) {
            l0Var.a();
            l0Var.f34452b.clear();
            l0Var.d.clear();
            l0Var.e.clear();
            l0Var.f34454f.clear();
            l0Var.f34455g = "";
            l0Var.h = false;
            l0Var.k();
            this.f34491n.k();
            this.f34491n.i();
        }
        Q();
        this.f34484f = null;
        V();
    }

    public final void Q() {
        boolean z10;
        boolean z11;
        if (!TextUtils.equals(this.f34498u, s())) {
            d0();
            this.f34498u = s();
        }
        boolean E = E();
        int i10 = this.f34481a;
        if (E && !TextUtils.isEmpty(s())) {
            HashMap hashMap = this.f34497t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((o0) hashMap.get(wallettransaction)).f34631b, wallettransaction.messageHash)) {
                    ((o0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.f34493p;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    o0 o0Var = new o0(i10, str, new en0(25, this, wallettransaction2));
                    hashMap.put(wallettransaction2, o0Var);
                    if (!o0Var.d && !TextUtils.isEmpty(str)) {
                        o0Var.d = true;
                        o0Var.f34633f = 0;
                        o0Var.a();
                    }
                }
            }
        } else {
            d0();
        }
        if (E() && !TextUtils.isEmpty(s()) && !this.E.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1 a1Var = this.f34496s;
        if (a1Var != null && a1Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && a1Var != null && !TextUtils.equals(a1Var.f33976b, s()))) {
            if (z10) {
                a1 a1Var2 = this.f34496s;
                if (a1Var2 != null && !TextUtils.equals(a1Var2.f33976b, s())) {
                    this.f34496s.h();
                    this.f34496s = null;
                }
                if (this.f34496s == null) {
                    this.f34496s = new a1(i10, s(), this);
                }
                a1 a1Var3 = this.f34496s;
                boolean z12 = a1Var3.d;
                if (!z12) {
                    String str2 = a1Var3.f33976b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        a1Var3.d("starting; address=" + str2);
                        a1Var3.d = true;
                        a1Var3.f33981j = 0;
                        a1Var3.e();
                        return;
                    }
                    a1Var3.d("start ignored: running=" + a1Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            a1 a1Var4 = this.f34496s;
            if (a1Var4 != null) {
                a1Var4.h();
            }
            AndroidUtilities.cancelRunOnUIThread(this.F);
        }
    }

    public final void S(j0 j0Var, boolean z10, Utilities.Callback2 callback2) {
        j0 b10 = j0Var.b();
        F("requesting proof challenge");
        ConnectionsManager.getInstance(this.f34481a).sendRequestTyped(new TL_wallet.getProofChallenge(), new Object(), new w(this, b10, callback2, z10, 0));
    }

    public final void U() {
        int i10;
        this.I = s();
        ArrayList n10 = q0.n(ApplicationLoader.applicationContext, UserConfig.getInstance(this.f34481a).getClientUserId());
        n10.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            i0 i0Var = (i0) obj;
            hashMap.put(i0Var.f34319a, i0Var);
        }
        this.G.clear();
        int size2 = n10.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = n10.get(i12);
            i12++;
            String str = (String) obj2;
            i0 i0Var2 = (i0) hashMap.get(str);
            if (i0Var2 == null) {
                i0Var2 = new i0(new q0(ApplicationLoader.applicationContext, str, this.f34481a));
            }
            q0 q0Var = i0Var2.f34322f;
            synchronized (q0.f34757f) {
                try {
                    try {
                        i10 = q0Var.r().f32284b;
                    } catch (Exception e) {
                        FileLog.e(e);
                        i10 = 0;
                    }
                } finally {
                }
            }
            i0Var2.f34320b = i10;
            this.G.add(i0Var2);
            t(str, null);
            h0((d0) this.N.get(str));
        }
        Collections.sort(this.G, new jg0(9));
    }

    public final void V() {
        F("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.f34481a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new Object(), new i(this, 2));
    }

    public final void W() {
        F("requesting state");
        this.A = ConnectionsManager.getInstance(this.f34481a).sendRequestTyped(new TL_wallet.getState(), new Object(), new i(this, 1));
    }

    public final void X(String str, Utilities.Callback2 callback2) {
        if (str == null) {
            callback2.run(null, null);
            return;
        }
        HashMap hashMap = this.M;
        if (hashMap.containsKey(str)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f34481a).sendRequestTyped(getuseraddresses, new Object(), new k((Object) this, (Object) str, (Object) callback2, 0));
    }

    public final void Y(TLRPC.User user, Utilities.Callback2 callback2) {
        if (user == null) {
            callback2.run(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f20427id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f20427id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f20536id;
        int i10 = this.f34481a;
        arrayList.add(MessagesController.getInstance(i10).getInputUser(user));
        ConnectionsManager.getInstance(i10).sendRequestTyped(getuseraddresses, new Object(), new k(this, (Object) callback2, (Object) user, 1));
    }

    public final void Z(String str, Utilities.Callback callback) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.a1.P0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i10 = this.f34481a;
        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new Object(), new ai.r5(this, str, callback), MessagesController.getInstance(i10).webFileDatacenterId, 0);
    }

    public final void b(org.telegram.tgnet.tl.TL_wallet.walletTransaction r10, org.telegram.tgnet.tl.TL_wallet.walletTransaction r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m0.b(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.tgnet.tl.TL_wallet$walletTransaction):void");
    }

    public final void b0(TLRPC.User user, String str, long j10, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, Utilities.Callback callback, Utilities.Callback callback2, e2 e2Var) {
        String s10 = s();
        F("send to " + str + ", amount " + j10 + ", when ready...");
        j0(new r(this, str, callback, nftitem, s10, str2, bArr, j10, e2Var, user, str3, callback2, 0));
    }

    public final void c(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            b(wallettransaction, wallettransaction2);
        } else {
            Q();
        }
    }

    public final boolean d() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            q0 q0Var = this.f34483c;
            if (q0Var == null || !q0Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void d0() {
        HashMap hashMap = this.f34497t;
        for (o0 o0Var : hashMap.values()) {
            o0Var.b();
        }
        hashMap.clear();
    }

    public final boolean e() {
        q0 q0Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((q0Var = this.f34483c) != null && q0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final n h(String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        a0 a0Var = new a0(this, str, j10, str2, bArr, callback2);
        j0(a0Var);
        return new n(a0Var, 0);
    }

    public final void h0(d0 d0Var) {
        if (d0Var != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i0 i0Var = (i0) obj;
                if (TextUtils.equals(i0Var.f34319a, d0Var.f34093a)) {
                    i0Var.f34321c = d0Var.f34094b;
                    boolean z10 = true;
                    i0Var.d = !d0Var.e;
                    byte[] bArr = d0Var.f34095c;
                    if (bArr == null || bArr.length <= 0 || i0Var.f34322f.f(bArr)) {
                        z10 = false;
                    }
                    i0Var.e = z10;
                }
            }
        }
    }

    public final void i0(TL_wallet.WalletState walletState) {
        boolean z10;
        l0 l0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.e = walletState;
                    L();
                    J();
                    if (!z10 && (l0Var = this.f34491n) != null) {
                        l0Var.g();
                        return;
                    }
                }
            }
            z10 = false;
            this.e = walletState;
            L();
            J();
            if (!z10) {
            }
        }
    }

    public final void j0(Runnable runnable) {
        if (E()) {
            runnable.run();
            return;
        }
        this.v.add(new WeakReference(runnable));
    }

    public final CharSequence l(long j10, boolean z10) {
        BigDecimal scale;
        int i10;
        char charAt;
        String C;
        f fVar = this.h;
        String g10 = fVar.g();
        TL_wallet.currencyRate j11 = fVar.j();
        String str = "";
        if (j11 != null) {
            String str2 = j11.symbol;
            String str3 = j11.thousandsSeparator;
            String str4 = j11.decimalSeparator;
            boolean z11 = j11.symbolLeft;
            boolean z12 = j11.spaceBetween;
            boolean z13 = j11.dropZeros;
            int i11 = j11.exp;
            double d = j11.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d10 = MessagesController.getInstance(this.f34481a).config.tonUsdRate.get() * d;
                boolean z14 = false;
                int max = Math.max(0, Math.min(i11, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(BigDecimal.valueOf(d10)).movePointLeft(9);
                if (z10 && movePointLeft.signum() != 0) {
                    BigDecimal round = movePointLeft.round(new MathContext(3, RoundingMode.HALF_UP));
                    if (round.signum() == 0) {
                        scale = new BigDecimal(BigInteger.ZERO, 0);
                    } else {
                        scale = round.stripTrailingZeros();
                    }
                    i10 = Math.max(max, Math.min(20, Math.max(0, scale.scale())));
                } else {
                    scale = movePointLeft.setScale(max, RoundingMode.HALF_UP);
                    i10 = max;
                }
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z15 = !isEmpty;
                if (!isEmpty) {
                    decimalFormatSymbols.setGroupingSeparator(str3.charAt(0));
                }
                if (TextUtils.isEmpty(str4)) {
                    charAt = '.';
                } else {
                    charAt = str4.charAt(0);
                }
                decimalFormatSymbols.setDecimalSeparator(charAt);
                DecimalFormat decimalFormat = new DecimalFormat("#,##0", decimalFormatSymbols);
                decimalFormat.setGroupingUsed(z15);
                if (z13) {
                    max = 0;
                }
                decimalFormat.setMinimumFractionDigits(max);
                decimalFormat.setMaximumFractionDigits(i10);
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                if (scale.signum() < 0) {
                    z14 = true;
                }
                String format = decimalFormat.format(scale.abs());
                if (!TextUtils.isEmpty(str2)) {
                    g10 = str2;
                }
                if (z12) {
                    str = " ";
                }
                if (z11) {
                    C = a1.g.C(g10, str, format);
                } else {
                    C = a1.g.C(format, str, g10);
                }
                if (z14) {
                    C = r4.c.h("-", C);
                }
                int indexOf = C.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C);
                    spannableStringBuilder.setSpan(new e61(AndroidUtilities.getTypeface("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return C;
            }
        }
        return "";
    }

    public final String s() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final d0 t(final String str, c8 c8Var) {
        HashMap hashMap = this.N;
        d0 d0Var = (d0) hashMap.get(str);
        if (d0Var != null && !d0Var.e) {
            if (c8Var != null) {
                d0Var.f34096f.add(c8Var);
            }
            return null;
        }
        int i10 = this.f34481a;
        if (d0Var != null && d0Var.e && ConnectionsManager.getInstance(i10).getCurrentTime() < d0Var.d + 300) {
            if (c8Var != null) {
                c8Var.run(d0Var);
            }
            return d0Var;
        }
        final ?? obj = new Object();
        obj.f34094b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f34096f = arrayList;
        obj.f34093a = str;
        obj.d = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (c8Var != null) {
            arrayList.add(c8Var);
        }
        hashMap.put(str, obj);
        Utilities.raceCallbacks(new h(this, str, (Object) obj, 1), new Utilities.Callback(this) {
            public final m0 f34479b;

            {
                this.f34479b = this;
            }

            @Override
            public final void run(Object obj2) {
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj2;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb2 = new StringBuilder("address=");
                        String str2 = str;
                        sb2.append(Uri.encode(str2));
                        sb2.append("&use_v2=false");
                        performapirequest.query = sb2.toString();
                        m0 m0Var = this.f34479b;
                        int i11 = m0Var.f34481a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new q(m0Var, obj, str2, runnable, 0), MessagesController.getInstance(i11).webFileDatacenterId, 0);
                        return;
                    default:
                        m0 m0Var2 = this.f34479b;
                        d0 d0Var2 = obj;
                        String str3 = str;
                        m0Var2.Z(str3, new o(m0Var2, d0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final m0 f34479b;

            {
                this.f34479b = this;
            }

            @Override
            public final void run(Object obj2) {
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj2;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb2 = new StringBuilder("address=");
                        String str2 = str;
                        sb2.append(Uri.encode(str2));
                        sb2.append("&use_v2=false");
                        performapirequest.query = sb2.toString();
                        m0 m0Var = this.f34479b;
                        int i11 = m0Var.f34481a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new q(m0Var, obj, str2, runnable, 0), MessagesController.getInstance(i11).webFileDatacenterId, 0);
                        return;
                    default:
                        m0 m0Var2 = this.f34479b;
                        d0 d0Var2 = obj;
                        String str3 = str;
                        m0Var2.Z(str3, new o(m0Var2, d0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        });
        return null;
    }

    public final long u() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final byte[] x() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void y(Utilities.Callback2 callback2, boolean z10, boolean z11) {
        F("getSecretPhrase: whenReady...");
        j0(new e2.o0(this, callback2, z10, z11, 4));
    }
}
