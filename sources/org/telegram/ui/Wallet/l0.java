package org.telegram.ui.Wallet;

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
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb0;
import org.telegram.ui.js0;
import org.telegram.ui.lb1;
public final class l0 {
    public static volatile l0[] K = new l0[4];
    public static DecimalFormat L;
    public final ArrayList C;
    public final List D;
    public String E;
    public final g F;
    public final HashMap G;
    public final HashMap H;
    public final HashMap I;
    public final HashMap J;
    public final int f35185a;
    public WalletEngine2 f35186b;
    public q0 f35187c;
    public String d;
    public TL_wallet.WalletState f35188e;
    public TL_update.TL_updateWalletGaslessInfo f35189f;
    public final f2 f35190g;
    public final f h;
    public Boolean f35191i;
    public String f35192j;
    public long f35193k;
    public boolean f35194l;
    public boolean f35195m;
    public k0 f35196n;
    public d0 f35197o;
    public a1 f35200r;
    public String f35202t;
    public int f35206y;
    public final ArrayList f35198p = new ArrayList();
    public final ArrayList f35199q = new ArrayList();
    public final HashMap f35201s = new HashMap();
    public final ArrayList f35203u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f35204w = -1;
    public int f35205x = -1;
    public int f35207z = 0;
    public final HashSet A = new HashSet();
    public final g B = new Runnable(this) {
        public final l0 f34967b;

        {
            this.f34967b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    l0 l0Var = this.f34967b;
                    a1 a1Var = l0Var.f35200r;
                    if (a1Var != null && a1Var.d) {
                        l0Var.B();
                        return;
                    }
                    return;
                default:
                    l0 l0Var2 = this.f34967b;
                    l0Var2.S();
                    l0Var2.I();
                    return;
            }
        }
    };

    public l0(int i10) {
        this.f35206y = -1;
        boolean z10 = false;
        ArrayList arrayList = new ArrayList();
        this.C = arrayList;
        this.D = DesugarCollections.unmodifiableList(arrayList);
        this.F = new Runnable(this) {
            public final l0 f34967b;

            {
                this.f34967b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f34967b;
                        a1 a1Var = l0Var.f35200r;
                        if (a1Var != null && a1Var.d) {
                            l0Var.B();
                            return;
                        }
                        return;
                    default:
                        l0 l0Var2 = this.f34967b;
                        l0Var2.S();
                        l0Var2.I();
                        return;
                }
            }
        };
        this.G = new HashMap();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new HashMap();
        this.f35185a = i10;
        try {
            this.f35195m = u().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e7) {
            j("failed to load prefs", e7);
        }
        this.h = new f(this);
        U();
        T();
        E("requesting has walt balance");
        this.f35206y = ConnectionsManager.getInstance(this.f35185a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new Object(), new h(this, 0));
        this.f35190g = new f2(this);
        g gVar = this.F;
        Object obj = q0.f35436f;
        synchronized (q0.class) {
            try {
                Iterator it = q0.f35438i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        q0.f35438i.remove(weakReference);
                    } else if (runnable == gVar) {
                        z10 = true;
                    }
                }
                if (gVar != null && !z10) {
                    q0.f35438i.add(new WeakReference(gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        S();
    }

    public static void E(String str) {
        FileLog.d("[gram-wallet] " + str);
    }

    public static boolean F(MessageObject messageObject, TL_wallet.walletTransaction wallettransaction) {
        if (messageObject != null && messageObject.messageOwner != null && wallettransaction != null && messageObject.isOutOwner()) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j3 = wallettransaction.random_id;
                if (j3 == 0 || message.random_id != j3) {
                    if (wallettransaction.localMessageId == 0 || messageObject.getId() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f20294id) && TextUtils.equals(wallettransaction.f20294id, tL_messageActionGramTransfer.transaction_id)) {
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

    public static byte[] Q(byte[] bArr) {
        byte[] bArr2 = new byte[215];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z10 = false;
            int i10 = 0;
            for (byte b10 : bArr) {
                if (i0.f(b10)) {
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
        } catch (RuntimeException e7) {
            Arrays.fill(bArr2, (byte) 0);
            throw e7;
        }
    }

    public static boolean Y(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            try {
                return Arrays.equals(c0(str), c0(str2));
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public static String a(String str) {
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    bArr[0] = 81;
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

    public static byte[][] a0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length == 215) {
            byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, 3, 215);
            try {
                secureRandom.nextBytes(bArr2[0]);
                secureRandom.nextBytes(bArr2[1]);
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    bArr2[2][i10] = (byte) ((bArr[i10] ^ bArr2[0][i10]) ^ bArr2[1][i10]);
                }
                return bArr2;
            } catch (RuntimeException e7) {
                for (byte[] bArr3 : bArr2) {
                    Arrays.fill(bArr3, (byte) 0);
                }
                throw e7;
            }
        }
        throw new IllegalArgumentException("INVALID_MNEMONIC_BACKUP_SIZE");
    }

    public static boolean b(String str, String str2) {
        String e02 = e0(str);
        String e03 = e0(str2);
        if (e02 != null && e02.equals(e03)) {
            return true;
        }
        return false;
    }

    public static byte[] c0(String str) {
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

    public static boolean d0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((TextUtils.isEmpty(wallettransaction.f20294id) || !TextUtils.equals(wallettransaction.f20294id, wallettransaction2.f20294id)) && !Y(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !Y(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            if (!wallettransaction.incoming && !wallettransaction2.incoming) {
                if (!Y(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) && !Y(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static String e0(String str) {
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

    public static TL_wallet.WalletTransactionPeer g(TLRPC.User user, String str, String str2) {
        TL_wallet.WalletTransactionPeer wallettransactionpeeraddress;
        if (user != null) {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeraddress.user_id = user.f20179id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
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

    public static SpannableStringBuilder m(long j3, boolean z10) {
        return k("GramCapital", n(j3, z10), R.string.GramCapital_other);
    }

    public static String n(long j3, boolean z10) {
        if ((j3 > -10000000 && j3 < 10000000) || z10) {
            return yh.p7.N0(j3);
        }
        if (L == null) {
            L = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return L.format(j3 / 1.0E9d);
    }

    public static SpannableStringBuilder o(String str, float f7) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i10 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), i10, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder p(long j3) {
        return q(j3, false);
    }

    public static SpannableStringBuilder q(long j3, boolean z10) {
        return k("Grams", n(j3, z10), R.string.Grams_other);
    }

    public static Context u() {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            return U.getContext();
        }
        return ApplicationLoader.applicationContext;
    }

    public static l0 v(int i10) {
        l0 l0Var;
        l0 l0Var2 = K[i10];
        if (l0Var2 == null) {
            synchronized (l0.class) {
                try {
                    l0Var = K[i10];
                    if (l0Var == null) {
                        l0[] l0VarArr = K;
                        l0 l0Var3 = new l0(i10);
                        l0VarArr[i10] = l0Var3;
                        l0Var = l0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return l0Var;
        }
        return l0Var2;
    }

    public static TL_update.TL_updateSentWalletTransaction y(TLRPC.Updates updates) {
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

    public final void A(boolean z10, boolean z11, i0 i0Var, Utilities.Callback callback) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(i0Var)) {
                callback.run("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(i0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(i0Var);
            i0 b10 = i0Var.b();
            E("import wallet: requesting proof challenge");
            s2.a(this.f35185a, null, new p(this, b10, callback, secretPhraseToAnchorPublicKey, 2), null, null, new v(this, callback, secretPhraseToPublicKey, b10), z10, z11, new hb0(new o(b10, 2), 1));
        } catch (Exception unused2) {
            callback.run("INVALID_PHRASE");
        }
    }

    public final void B() {
        k0 k0Var = this.f35196n;
        if (k0Var != null) {
            k0Var.d();
        }
        if (this.f35204w >= 0) {
            return;
        }
        U();
    }

    public final boolean C() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f35189f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if ((this.f35188e instanceof TL_wallet.TL_walletState) && this.f35186b != null && this.f35187c != null) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        q0 q0Var;
        boolean z10;
        if (!(this.f35188e instanceof TL_wallet.TL_walletState) || (q0Var = this.f35187c) == null) {
            return false;
        }
        q0Var.getClass();
        synchronized (q0.f35436f) {
            try {
                try {
                    z10 = q0Var.r().f26531c;
                } catch (Exception e7) {
                    FileLog.e(e7);
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

    public final boolean H() {
        if (this.f35195m && !SharedConfig.passcodeHash.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void I() {
        NotificationCenter.getInstance(this.f35185a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this);
    }

    public final void J(org.json.JSONObject r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l0.J(org.json.JSONObject):void");
    }

    public final void K() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.f35188e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        q0 q0Var = this.f35187c;
        if (q0Var != null && !TextUtils.equals(q0Var.f35441c, str)) {
            if (str == null) {
                E("received empty state, leaving wallet storage of " + this.f35187c.f35441c);
            } else {
                StringBuilder w10 = a1.g.w("received new state of ", str, ", leaving wallet storage of ");
                w10.append(this.f35187c.f35441c);
                E(w10.toString());
            }
            this.f35187c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f35187c == null) {
            E("setting up wallet storage of " + str);
            this.f35187c = new q0(ApplicationLoader.applicationContext, str, this.f35185a);
            E("storage public keys = " + this.f35187c.m().length);
        }
        d0 d0Var = this.f35197o;
        if (d0Var != null && !TextUtils.equals(d0Var.f34790e, str)) {
            d0Var.f34790e = str;
            d0Var.c();
        }
        if (this.f35186b != null && !TextUtils.equals(this.d, str)) {
            this.f35186b.close();
            this.f35186b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f35186b == null || !TextUtils.equals(this.d, str))) {
            if (this.f35186b != null) {
                E("closing wallet-engine of " + this.d);
                this.f35186b.close();
                this.f35186b = null;
            }
            E("creating wallet-engine for " + str);
            try {
                int i10 = this.f35185a;
                this.d = str;
                this.f35186b = new WalletEngine2(i10, str, bArr);
            } catch (Exception e7) {
                j("failed to create engine!", e7);
                this.d = null;
            }
        }
        int i11 = 0;
        if ((this.f35188e instanceof TL_wallet.TL_walletState) && this.f35186b != null) {
            ArrayList arrayList = this.f35203u;
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
            this.f35203u.clear();
        }
        if ((this.f35188e instanceof TL_wallet.TL_walletState) && this.f35186b != null && this.f35189f != null) {
            ArrayList arrayList2 = this.v;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
            this.v.clear();
        }
        if (!TextUtils.equals(this.E, str)) {
            S();
        }
        P();
    }

    public final void L(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str)) {
            try {
                c0(str);
                ArrayList arrayList = this.f35198p;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = wallettransaction.messageHash;
                    String str3 = tL_updateSentWalletTransaction.msg_hash;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && Y(str2, str3)) {
                        d(wallettransaction, tL_updateSentWalletTransaction);
                        return;
                    }
                }
                TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
                if (wallettransaction2 != null) {
                    wallettransaction2.messageHash = tL_updateSentWalletTransaction.msg_hash;
                    wallettransaction2.gasless = tL_updateSentWalletTransaction.gasless;
                    wallettransaction2.pending = false;
                    arrayList.add(0, wallettransaction2);
                    z().h();
                    z().f();
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void M(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f35189f = tL_updateWalletGaslessInfo;
        K();
        I();
    }

    public final void N(TL_update.TL_updateWalletState tL_updateWalletState) {
        g0(tL_updateWalletState.state);
    }

    public final void O() {
        b0();
        this.f35198p.clear();
        ArrayList arrayList = this.f35199q;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = ((f0) obj).f34883b;
            if (i0Var != null) {
                i0Var.close();
            }
        }
        arrayList.clear();
        k0 k0Var = this.f35196n;
        if (k0Var != null) {
            k0Var.a();
            k0Var.f35141b.clear();
            k0Var.d.clear();
            k0Var.f35143e.clear();
            k0Var.f35144f = "";
            k0Var.f35145g = false;
            k0Var.h();
            this.f35196n.h();
            this.f35196n.f();
        }
        P();
        this.f35189f = null;
        T();
    }

    public final void P() {
        boolean z10;
        boolean z11;
        if (!TextUtils.equals(this.f35202t, r())) {
            b0();
            this.f35202t = r();
        }
        boolean D = D();
        int i10 = this.f35185a;
        if (D && !TextUtils.isEmpty(r())) {
            HashMap hashMap = this.f35201s;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((n0) hashMap.get(wallettransaction)).f35302b, wallettransaction.messageHash)) {
                    ((n0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.f35198p;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    n0 n0Var = new n0(i10, str, new js0(22, this, wallettransaction2));
                    hashMap.put(wallettransaction2, n0Var);
                    if (!n0Var.d && !TextUtils.isEmpty(str)) {
                        n0Var.d = true;
                        n0Var.f35305f = 0;
                        n0Var.a();
                    }
                }
            }
        } else {
            b0();
        }
        if (D() && !TextUtils.isEmpty(r()) && !this.A.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1 a1Var = this.f35200r;
        if (a1Var != null && a1Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && a1Var != null && !TextUtils.equals(a1Var.f34635b, r()))) {
            if (z10) {
                a1 a1Var2 = this.f35200r;
                if (a1Var2 != null && !TextUtils.equals(a1Var2.f34635b, r())) {
                    this.f35200r.h();
                    this.f35200r = null;
                }
                if (this.f35200r == null) {
                    this.f35200r = new a1(i10, r(), this);
                }
                a1 a1Var3 = this.f35200r;
                boolean z12 = a1Var3.d;
                if (!z12) {
                    String str2 = a1Var3.f34635b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        a1Var3.d("starting; address=" + str2);
                        a1Var3.d = true;
                        a1Var3.f34641j = 0;
                        a1Var3.e();
                        return;
                    }
                    a1Var3.d("start ignored: running=" + a1Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            a1 a1Var4 = this.f35200r;
            if (a1Var4 != null) {
                a1Var4.h();
            }
            AndroidUtilities.cancelRunOnUIThread(this.B);
        }
    }

    public final void R(i0 i0Var, boolean z10, Utilities.Callback2 callback2) {
        i0 b10 = i0Var.b();
        E("requesting proof challenge");
        ConnectionsManager.getInstance(this.f35185a).sendRequestTyped(new TL_wallet.getProofChallenge(), new Object(), new w(this, b10, callback2, z10, 0));
    }

    public final void S() {
        int i10;
        this.E = r();
        ArrayList n10 = q0.n(ApplicationLoader.applicationContext, UserConfig.getInstance(this.f35185a).getClientUserId());
        n10.remove(this.E);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h0 h0Var = (h0) obj;
            hashMap.put(h0Var.f35007a, h0Var);
        }
        this.C.clear();
        int size2 = n10.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = n10.get(i12);
            i12++;
            String str = (String) obj2;
            h0 h0Var2 = (h0) hashMap.get(str);
            if (h0Var2 == null) {
                h0Var2 = new h0(new q0(ApplicationLoader.applicationContext, str, this.f35185a));
            }
            q0 q0Var = h0Var2.f35011f;
            synchronized (q0.f35436f) {
                try {
                    try {
                        i10 = q0Var.r().f26530b;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        i10 = 0;
                    }
                } finally {
                }
            }
            h0Var2.f35008b = i10;
            this.C.add(h0Var2);
            s(str, null);
            f0((c0) this.J.get(str));
        }
        Collections.sort(this.C, new lb1(2));
    }

    public final void T() {
        E("requesting gasless info");
        this.f35205x = ConnectionsManager.getInstance(this.f35185a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new Object(), new h(this, 2));
    }

    public final void U() {
        E("requesting state");
        this.f35204w = ConnectionsManager.getInstance(this.f35185a).sendRequestTyped(new TL_wallet.getState(), new Object(), new h(this, 1));
    }

    public final void V(String str, Utilities.Callback2 callback2) {
        if (str == null) {
            callback2.run(null, null);
            return;
        }
        HashMap hashMap = this.I;
        if (hashMap.containsKey(str)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f35185a).sendRequestTyped(getuseraddresses, new Object(), new k((Object) this, (Object) str, (Object) callback2, 0));
    }

    public final void W(TLRPC.User user, Utilities.Callback2 callback2) {
        if (user == null) {
            callback2.run(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f20179id);
        HashMap hashMap = this.H;
        if (hashMap.containsKey(valueOf)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f20179id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f20291id;
        int i10 = this.f35185a;
        arrayList.add(MessagesController.getInstance(i10).getInputUser(user));
        ConnectionsManager.getInstance(i10).sendRequestTyped(getuseraddresses, new Object(), new k(this, (Object) callback2, (Object) user, 1));
    }

    public final void X(String str, Utilities.Callback callback) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.b1.P0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i10 = this.f35185a;
        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new Object(), new ai.m0(this, str, callback), MessagesController.getInstance(i10).webFileDatacenterId, 0);
    }

    public final void Z(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, Utilities.Callback callback, Utilities.Callback callback2) {
        String r10 = r();
        E("send to " + str + ", amount " + j3 + ", when ready...");
        h0(new r(this, str, callback, nftitem, r10, str2, bArr, j3, user, str3, callback2, 0));
    }

    public final void b0() {
        HashMap hashMap = this.f35201s;
        for (n0 n0Var : hashMap.values()) {
            n0Var.b();
        }
        hashMap.clear();
    }

    public final void c(org.telegram.tgnet.tl.TL_wallet.walletTransaction r10, org.telegram.tgnet.tl.TL_wallet.walletTransaction r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l0.c(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.tgnet.tl.TL_wallet$walletTransaction):void");
    }

    public final void d(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            c(wallettransaction, wallettransaction2);
        } else {
            P();
        }
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.f35188e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            q0 q0Var = this.f35187c;
            if (q0Var == null || !q0Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        q0 q0Var;
        TL_wallet.WalletState walletState = this.f35188e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((q0Var = this.f35187c) != null && q0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void f0(c0 c0Var) {
        if (c0Var != null) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h0 h0Var = (h0) obj;
                if (TextUtils.equals(h0Var.f35007a, c0Var.f34721a)) {
                    h0Var.f35009c = c0Var.f34722b;
                    boolean z10 = true;
                    h0Var.d = !c0Var.f34724e;
                    byte[] bArr = c0Var.f34723c;
                    if (bArr == null || bArr.length <= 0 || h0Var.f35011f.f(bArr)) {
                        z10 = false;
                    }
                    h0Var.f35010e = z10;
                }
            }
        }
    }

    public final void g0(TL_wallet.WalletState walletState) {
        boolean z10;
        k0 k0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.f35188e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.f35188e = walletState;
                    K();
                    I();
                    if (!z10 && (k0Var = this.f35196n) != null) {
                        k0Var.d();
                        return;
                    }
                }
            }
            z10 = false;
            this.f35188e = walletState;
            K();
            I();
            if (!z10) {
            }
        }
    }

    public final o h(String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        z zVar = new z(this, str, j3, str2, bArr, callback2);
        h0(zVar);
        return new o(zVar, 0);
    }

    public final void h0(Runnable runnable) {
        if (D()) {
            runnable.run();
            return;
        }
        this.f35203u.add(new WeakReference(runnable));
    }

    public final CharSequence l(long j3, boolean z10) {
        BigDecimal scale;
        int i10;
        char charAt;
        String D;
        f fVar = this.h;
        String g10 = fVar.g();
        TL_wallet.currencyRate j10 = fVar.j();
        String str = "";
        if (j10 != null) {
            String str2 = j10.symbol;
            String str3 = j10.thousandsSeparator;
            String str4 = j10.decimalSeparator;
            boolean z11 = j10.symbolLeft;
            boolean z12 = j10.spaceBetween;
            boolean z13 = j10.dropZeros;
            int i11 = j10.exp;
            double d = j10.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d10 = MessagesController.getInstance(this.f35185a).config.tonUsdRate.get() * d;
                boolean z14 = false;
                int max = Math.max(0, Math.min(i11, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(BigDecimal.valueOf(d10)).movePointLeft(9);
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
                    D = a1.g.D(g10, str, format);
                } else {
                    D = a1.g.D(format, str, g10);
                }
                if (z14) {
                    D = sc.v.i("-", D);
                }
                int indexOf = D.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D);
                    spannableStringBuilder.setSpan(new o61(AndroidUtilities.getTypeface("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return D;
            }
        }
        return "";
    }

    public final String r() {
        TL_wallet.WalletState walletState = this.f35188e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final c0 s(final String str, i7 i7Var) {
        HashMap hashMap = this.J;
        c0 c0Var = (c0) hashMap.get(str);
        if (c0Var != null && !c0Var.f34724e) {
            if (i7Var != null) {
                c0Var.f34725f.add(i7Var);
            }
            return null;
        }
        int i10 = this.f35185a;
        if (c0Var != null && c0Var.f34724e && ConnectionsManager.getInstance(i10).getCurrentTime() < c0Var.d + 300) {
            if (i7Var != null) {
                i7Var.run(c0Var);
            }
            return c0Var;
        }
        final ?? obj = new Object();
        obj.f34722b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f34725f = arrayList;
        obj.f34721a = str;
        obj.d = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (i7Var != null) {
            arrayList.add(i7Var);
        }
        hashMap.put(str, obj);
        Utilities.raceCallbacks(new m(this, str, (Object) obj, 0), new Utilities.Callback(this) {
            public final l0 f35298b;

            {
                this.f35298b = this;
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
                        l0 l0Var = this.f35298b;
                        int i11 = l0Var.f35185a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new p(l0Var, obj, str2, runnable, 0), MessagesController.getInstance(i11).webFileDatacenterId, 0);
                        return;
                    default:
                        l0 l0Var2 = this.f35298b;
                        c0 c0Var2 = obj;
                        String str3 = str;
                        l0Var2.X(str3, new s(l0Var2, c0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final l0 f35298b;

            {
                this.f35298b = this;
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
                        l0 l0Var = this.f35298b;
                        int i11 = l0Var.f35185a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new p(l0Var, obj, str2, runnable, 0), MessagesController.getInstance(i11).webFileDatacenterId, 0);
                        return;
                    default:
                        l0 l0Var2 = this.f35298b;
                        c0 c0Var2 = obj;
                        String str3 = str;
                        l0Var2.X(str3, new s(l0Var2, c0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        });
        return null;
    }

    public final long t() {
        TL_wallet.WalletState walletState = this.f35188e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final byte[] w() {
        TL_wallet.WalletState walletState = this.f35188e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void x(Utilities.Callback2 callback2, boolean z10, boolean z11) {
        E("getSecretPhrase: whenReady...");
        h0(new org.telegram.messenger.camera.i(this, callback2, z10, z11, 3));
    }

    public final k0 z() {
        if (this.f35196n == null) {
            this.f35196n = new k0(this);
        }
        return this.f35196n;
    }
}
