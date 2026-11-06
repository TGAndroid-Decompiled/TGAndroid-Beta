package org.telegram.ui.Wallet;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.LruCache;
import bi.dd;
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
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lk0;
import org.telegram.ui.rv0;
public final class n0 {
    public static volatile n0[] O = new n0[4];
    public static final long[] P = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache Q = new LruCache(4096);
    public static DecimalFormat R;
    public int C;
    public final ArrayList G;
    public final List H;
    public String I;
    public final h J;
    public final HashMap K;
    public final HashMap L;
    public final HashMap M;
    public final HashMap N;
    public final int f42768a;
    public WalletEngine2 f42769b;
    public r0 f42770c;
    public String d;
    public TL_wallet.WalletState f42771e;
    public TL_update.TL_updateWalletGaslessInfo f42772f;
    public final f2 f42773g;
    public final f h;
    public Boolean f42774i;
    public String f42775j;
    public long f42776k;
    public boolean f42777l;
    public boolean f42778m;
    public m0 f42779n;
    public f0 f42780o;
    public a1 f42784s;
    public String f42786u;
    public String f42788x;
    public int f42789y;
    public final ArrayList f42781p = new ArrayList();
    public final HashMap f42782q = new HashMap();
    public final ArrayList f42783r = new ArrayList();
    public final HashMap f42785t = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ArrayList f42787w = new ArrayList();
    public final h f42790z = new Runnable(this) {
        public final n0 f42521b;

        {
            this.f42521b = this;
        }

        @Override
        public final void run() {
            f0 f0Var;
            m0 m0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f42521b;
                    if (!TextUtils.isEmpty(n0Var.f42788x) && (f0Var = n0Var.f42780o) != null && f0Var.d(n0Var.f42788x) && (m0Var = n0Var.f42779n) != null) {
                        ArrayList arrayList = m0Var.f42731b;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && n0.b(nftitem.address, n0Var.f42788x)) {
                                return;
                            }
                        }
                    }
                    if (n0Var.f42780o == null) {
                        n0Var.f42780o = new f0(n0Var);
                    }
                    f0 f0Var2 = n0Var.f42780o;
                    if (!f0Var2.f42425j) {
                        f0Var2.b();
                        f0Var2.f(true);
                    }
                    n0Var.B().g();
                    n0Var.E();
                    int i10 = n0Var.f42789y;
                    long[] jArr = n0.P;
                    if (i10 < 7) {
                        h hVar = n0Var.f42790z;
                        n0Var.f42789y = i10 + 1;
                        org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f42521b;
                    a1 a1Var = n0Var2.f42784s;
                    if (a1Var != null && a1Var.d) {
                        n0Var2.E();
                        return;
                    }
                    return;
                default:
                    n0 n0Var3 = this.f42521b;
                    n0Var3.W();
                    n0Var3.L();
                    return;
            }
        }
    };
    public int A = -1;
    public int B = -1;
    public int D = 0;
    public final HashSet E = new HashSet();
    public final h F = new Runnable(this) {
        public final n0 f42521b;

        {
            this.f42521b = this;
        }

        @Override
        public final void run() {
            f0 f0Var;
            m0 m0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f42521b;
                    if (!TextUtils.isEmpty(n0Var.f42788x) && (f0Var = n0Var.f42780o) != null && f0Var.d(n0Var.f42788x) && (m0Var = n0Var.f42779n) != null) {
                        ArrayList arrayList = m0Var.f42731b;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && n0.b(nftitem.address, n0Var.f42788x)) {
                                return;
                            }
                        }
                    }
                    if (n0Var.f42780o == null) {
                        n0Var.f42780o = new f0(n0Var);
                    }
                    f0 f0Var2 = n0Var.f42780o;
                    if (!f0Var2.f42425j) {
                        f0Var2.b();
                        f0Var2.f(true);
                    }
                    n0Var.B().g();
                    n0Var.E();
                    int i10 = n0Var.f42789y;
                    long[] jArr = n0.P;
                    if (i10 < 7) {
                        h hVar = n0Var.f42790z;
                        n0Var.f42789y = i10 + 1;
                        org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f42521b;
                    a1 a1Var = n0Var2.f42784s;
                    if (a1Var != null && a1Var.d) {
                        n0Var2.E();
                        return;
                    }
                    return;
                default:
                    n0 n0Var3 = this.f42521b;
                    n0Var3.W();
                    n0Var3.L();
                    return;
            }
        }
    };

    public n0(int i7) {
        boolean z9 = false;
        this.C = -1;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        this.J = new Runnable(this) {
            public final n0 f42521b;

            {
                this.f42521b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                m0 m0Var;
                TL_wallet.nftItem nftitem;
                switch (r2) {
                    case 0:
                        n0 n0Var = this.f42521b;
                        if (!TextUtils.isEmpty(n0Var.f42788x) && (f0Var = n0Var.f42780o) != null && f0Var.d(n0Var.f42788x) && (m0Var = n0Var.f42779n) != null) {
                            ArrayList arrayList2 = m0Var.f42731b;
                            int size = arrayList2.size();
                            int i72 = 0;
                            while (i72 < size) {
                                Object obj = arrayList2.get(i72);
                                i72++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && n0.b(nftitem.address, n0Var.f42788x)) {
                                    return;
                                }
                            }
                        }
                        if (n0Var.f42780o == null) {
                            n0Var.f42780o = new f0(n0Var);
                        }
                        f0 f0Var2 = n0Var.f42780o;
                        if (!f0Var2.f42425j) {
                            f0Var2.b();
                            f0Var2.f(true);
                        }
                        n0Var.B().g();
                        n0Var.E();
                        int i10 = n0Var.f42789y;
                        long[] jArr = n0.P;
                        if (i10 < 7) {
                            h hVar = n0Var.f42790z;
                            n0Var.f42789y = i10 + 1;
                            org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                            return;
                        }
                        return;
                    case 1:
                        n0 n0Var2 = this.f42521b;
                        a1 a1Var = n0Var2.f42784s;
                        if (a1Var != null && a1Var.d) {
                            n0Var2.E();
                            return;
                        }
                        return;
                    default:
                        n0 n0Var3 = this.f42521b;
                        n0Var3.W();
                        n0Var3.L();
                        return;
                }
            }
        };
        this.K = new HashMap();
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = new HashMap();
        this.f42768a = i7;
        try {
            this.f42778m = w().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e10) {
            k("failed to load prefs", e10);
        }
        this.h = new f(this);
        Y();
        X();
        H("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.f42768a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new d3.b(1), new i(this, 0));
        this.f42773g = new f2(this);
        h hVar = this.J;
        Object obj = r0.f43054f;
        synchronized (r0.class) {
            try {
                Iterator it = r0.f43056i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        r0.f43056i.remove(weakReference);
                    } else if (runnable == hVar) {
                        z9 = true;
                    }
                }
                if (hVar != null && !z9) {
                    r0.f43056i.add(new WeakReference(hVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        W();
    }

    public static TL_update.TL_updateSentWalletTransaction A(TLRPC.Updates updates) {
        if (updates != null) {
            TLRPC.Update update = updates.update;
            if (update instanceof TL_update.TL_updateSentWalletTransaction) {
                return (TL_update.TL_updateSentWalletTransaction) update;
            }
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.Update update2 = arrayList.get(i7);
                i7++;
                TLRPC.Update update3 = update2;
                if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                    return (TL_update.TL_updateSentWalletTransaction) update3;
                }
            }
            return null;
        }
        return null;
    }

    public static void D(IdentityHashMap identityHashMap, HashMap hashMap, int i7, TL_wallet.walletTransaction wallettransaction, boolean z9) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z9) {
            if (treeSet == null) {
                treeSet = new TreeSet();
                identityHashMap.put(wallettransaction, treeSet);
            }
            treeSet.add(Integer.valueOf(i7));
        } else if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i7));
        }
        ArrayList h02 = h0(wallettransaction);
        int size = h02.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = h02.get(i10);
            i10++;
            String str = (String) obj;
            TreeSet treeSet2 = (TreeSet) hashMap.get(str);
            if (z9) {
                if (treeSet2 == null) {
                    treeSet2 = new TreeSet();
                    hashMap.put(str, treeSet2);
                }
                treeSet2.add(Integer.valueOf(i7));
            } else if (treeSet2 != null) {
                treeSet2.remove(Integer.valueOf(i7));
            }
        }
    }

    public static void H(String str) {
        org.telegram.messenger.a8.b("[gram-wallet] " + str);
    }

    public static boolean I(ij ijVar, TL_wallet.walletTransaction wallettransaction) {
        if (ijVar != null && ijVar.f23237k != null && wallettransaction != null && ijVar.Q3()) {
            TLRPC.Message message = ijVar.f23237k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j3 = wallettransaction.random_id;
                if (j3 == 0 || message.random_id != j3) {
                    if (wallettransaction.localMessageId == 0 || ijVar.f1() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f27215id) && TextUtils.equals(wallettransaction.f27215id, tL_messageActionGramTransfer.transaction_id)) {
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

    public static byte[] T(byte[] bArr) {
        byte[] bArr2 = new byte[215];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z9 = false;
            int i7 = 0;
            for (byte b10 : bArr) {
                if (k0.e(b10)) {
                    if (i7 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    if (z9) {
                        if (i7 != 215) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 32;
                            i7 = i10;
                            z9 = false;
                        } else {
                            throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                        }
                    }
                    if (i7 != 215) {
                        bArr2[i7] = b10;
                        i7++;
                    } else {
                        throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                    }
                }
            }
            return bArr2;
        } catch (RuntimeException e10) {
            Arrays.fill(bArr2, (byte) 0);
            throw e10;
        }
    }

    public static String V(String str, boolean z9) {
        byte b10;
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    if (z9) {
                        b10 = 17;
                    } else {
                        b10 = 81;
                    }
                    bArr[0] = b10;
                    bArr[1] = (byte) parseInt;
                    for (int i7 = 0; i7 < 32; i7++) {
                        int i10 = i7 * 2;
                        bArr[i7 + 2] = (byte) Integer.parseInt(substring.substring(i10, i10 + 2), 16);
                    }
                    int i11 = 0;
                    for (int i12 = 0; i12 < 34; i12++) {
                        i11 ^= (bArr[i12] & 255) << 8;
                        for (int i13 = 0; i13 < 8; i13++) {
                            int i14 = 32768 & i11;
                            int i15 = i11 << 1;
                            if (i14 != 0) {
                                i15 ^= 4129;
                            }
                            i11 = i15 & 65535;
                        }
                    }
                    bArr[34] = (byte) (i11 >>> 8);
                    bArr[35] = (byte) i11;
                    return Base64.encodeToString(bArr, 11);
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(ArrayList arrayList, char c10, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String g02 = g0(str);
        if (g02 != null) {
            str2 = c10 + "x" + g02;
        } else {
            str2 = c10 + "r" + str;
        }
        arrayList.add(str2);
    }

    public static boolean b(String str, String str2) {
        String j02 = j0(str);
        String j03 = j0(str2);
        if (j02 != null && j02.equals(j03)) {
            return true;
        }
        return false;
    }

    public static boolean c0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            String g02 = g0(str);
            if (g02 != null && g02.equals(g0(str2))) {
                return true;
            }
        }
        return false;
    }

    public static byte[][] e0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length == 215) {
            byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, 3, 215);
            try {
                secureRandom.nextBytes(bArr2[0]);
                secureRandom.nextBytes(bArr2[1]);
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    bArr2[2][i7] = (byte) ((bArr[i7] ^ bArr2[0][i7]) ^ bArr2[1][i7]);
                }
                return bArr2;
            } catch (RuntimeException e10) {
                for (byte[] bArr3 : bArr2) {
                    Arrays.fill(bArr3, (byte) 0);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException("INVALID_MNEMONIC_BACKUP_SIZE");
    }

    public static TL_wallet.WalletTransactionPeer g(TLRPC.User user, String str, String str2) {
        TL_wallet.WalletTransactionPeer wallettransactionpeeraddress;
        if (user != null) {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeraddress.user_id = user.f27101id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
    }

    public static java.lang.String g0(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n0.g0(java.lang.String):java.lang.String");
    }

    public static e2 h(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
            str = V(stargiftdepositpayload.nft_address, true);
        } else {
            str = stargiftdepositpayload.nft_address;
        }
        return new e2(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static ArrayList h0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.f27215id)) {
                arrayList.add("i" + wallettransaction.f27215id);
            }
            a(arrayList, 't', wallettransaction.tx_hash);
            a(arrayList, 'm', wallettransaction.messageHash);
            if (!wallettransaction.incoming) {
                a(arrayList, 'g', wallettransaction.gaslessMessageBodyHash);
                a(arrayList, 'n', wallettransaction.normalMessageBodyHash);
            }
        }
        return arrayList;
    }

    public static boolean i0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((TextUtils.isEmpty(wallettransaction.f27215id) || !TextUtils.equals(wallettransaction.f27215id, wallettransaction2.f27215id)) && !c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !c0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            if (!wallettransaction.incoming && !wallettransaction2.incoming) {
                if (!c0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) && !c0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static void j(String str) {
        org.telegram.messenger.a8.d("[gram-wallet] " + str);
    }

    public static String j0(String str) {
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
            for (int i7 = 2; i7 < 34; i7++) {
                sb2.append(Character.forDigit((decode[i7] >> 4) & 15, 16));
                sb2.append(Character.forDigit(decode[i7] & 15, 16));
            }
            return sb2.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void k(String str, Throwable th2) {
        org.telegram.messenger.a8.e("[gram-wallet] " + str, th2);
    }

    public static SpannableStringBuilder l(String str, CharSequence charSequence, int i7) {
        long abs;
        String replace = charSequence.toString().replace((char) 8211, '-');
        String M0 = hd.M0(i7, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                if (parseLong >= -2147483647L && parseLong <= 2147483647L) {
                    abs = Math.abs(parseLong);
                } else {
                    abs = Math.abs(parseLong % 100) + 100;
                }
                M0 = hd.K0((int) abs, str);
            } catch (NumberFormatException unused) {
            }
        }
        return org.telegram.messenger.g0.K2(M0, charSequence, "%1$s");
    }

    public static SpannableStringBuilder n(long j3, boolean z9) {
        return l("GramCapital", o(j3, z9), 2131749518);
    }

    public static String o(long j3, boolean z9) {
        if ((j3 > -10000000 && j3 < 10000000) || z9) {
            return dd.P0(j3);
        }
        if (R == null) {
            R = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return R.format(j3 / 1.0E9d);
    }

    public static String p(long j3, boolean z9) {
        boolean z10;
        int i7;
        BigDecimal stripTrailingZeros;
        if (j3 > -1000000000 && j3 < 1000000000) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 && z10) {
            return o(j3, true);
        }
        if (z9) {
            i7 = 4;
        } else if (z10) {
            i7 = 2;
        } else {
            i7 = 3;
        }
        BigDecimal scale = BigDecimal.valueOf(j3, 9).setScale(i7, RoundingMode.DOWN);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static SpannableStringBuilder q(String str, float f10) {
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i7 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), i7, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder r(long j3) {
        return s(j3, false);
    }

    public static SpannableStringBuilder s(long j3, boolean z9) {
        return l("Grams", o(j3, z9), 2131749506);
    }

    public static Context w() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null && T.getContext() != null) {
            return T.getContext();
        }
        return org.telegram.messenger.t0.f25555b;
    }

    public static n0 x(int i7) {
        n0 n0Var;
        n0 n0Var2 = O[i7];
        if (n0Var2 == null) {
            synchronized (n0.class) {
                try {
                    n0Var = O[i7];
                    if (n0Var == null) {
                        n0[] n0VarArr = O;
                        n0 n0Var3 = new n0(i7);
                        n0VarArr[i7] = n0Var3;
                        n0Var = n0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return n0Var;
        }
        return n0Var2;
    }

    public final m0 B() {
        if (this.f42779n == null) {
            this.f42779n = new m0(this);
        }
        return this.f42779n;
    }

    public final void C(boolean z9, boolean z10, k0 k0Var, c20 c20Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(k0Var)) {
                c20Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(k0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(k0Var);
            k0 b10 = k0Var.b();
            H("import wallet: requesting proof challenge");
            i3.a(this.f42768a, null, new r(this, b10, c20Var, secretPhraseToAnchorPublicKey, 2), null, null, new u(this, c20Var, secretPhraseToPublicKey, b10), z9, z10, new bg.v0(new l(b10, 2), 2));
        } catch (Exception unused2) {
            c20Var.a("INVALID_PHRASE");
        }
    }

    public final void E() {
        m0 m0Var = this.f42779n;
        if (m0Var != null) {
            m0Var.g();
        }
        if (this.A >= 0) {
            return;
        }
        Y();
    }

    public final boolean F() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f42772f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.f42771e instanceof TL_wallet.TL_walletState) && this.f42769b != null && this.f42770c != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        r0 r0Var;
        boolean z9;
        if (!(this.f42771e instanceof TL_wallet.TL_walletState) || (r0Var = this.f42770c) == null) {
            return false;
        }
        synchronized (r0.f43054f) {
            try {
                try {
                    z9 = r0Var.r().f33345c;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    z9 = true;
                }
            } finally {
            }
        }
        if (!z9) {
            return false;
        }
        return true;
    }

    public final boolean K() {
        if (this.f42778m && !iz.f23406s.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void L() {
        qs.f(this.f42768a).k(qs.f24954a4, this);
    }

    public final void M(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n0.M(org.json.JSONObject):void");
    }

    public final void N() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.f42771e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        r0 r0Var = this.f42770c;
        if (r0Var != null && !TextUtils.equals(r0Var.f43059c, str)) {
            if (str == null) {
                H("received empty state, leaving wallet storage of " + this.f42770c.f43059c);
            } else {
                StringBuilder u10 = a8.p0.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.f42770c.f43059c);
                H(u10.toString());
            }
            this.f42770c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f42770c == null) {
            H("setting up wallet storage of " + str);
            this.f42770c = new r0(this.f42768a, org.telegram.messenger.t0.f25555b, str);
            H("storage public keys = " + this.f42770c.m().length);
        }
        f0 f0Var = this.f42780o;
        if (f0Var != null && !TextUtils.equals(f0Var.f42421e, str)) {
            f0Var.f42421e = str;
            f0Var.c();
        }
        if (this.f42769b != null && !TextUtils.equals(this.d, str)) {
            this.f42769b.close();
            this.f42769b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f42769b == null || !TextUtils.equals(this.d, str))) {
            if (this.f42769b != null) {
                H("closing wallet-engine of " + this.d);
                this.f42769b.close();
                this.f42769b = null;
            }
            H("creating wallet-engine for " + str);
            try {
                int i7 = this.f42768a;
                this.d = str;
                this.f42769b = new WalletEngine2(i7, str, bArr);
            } catch (Exception e10) {
                k("failed to create engine!", e10);
                this.d = null;
            }
        }
        int i10 = 0;
        if ((this.f42771e instanceof TL_wallet.TL_walletState) && this.f42769b != null) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                }
            }
            this.v.clear();
        }
        if ((this.f42771e instanceof TL_wallet.TL_walletState) && this.f42769b != null && this.f42772f != null) {
            ArrayList arrayList2 = this.f42787w;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.g0.h3(runnable2);
                }
            }
            this.f42787w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            W();
        }
        S();
    }

    public final void O(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && g0(str) != null) {
            ArrayList arrayList = this.f42781p;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = wallettransaction.messageHash;
                String str3 = tL_updateSentWalletTransaction.msg_hash;
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && c0(str2, str3)) {
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
                B().k();
                B().i();
            }
        }
    }

    public final void P(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f42772f = tL_updateWalletGaslessInfo;
        N();
        L();
    }

    public final void Q(TL_update.TL_updateWalletState tL_updateWalletState) {
        l0(tL_updateWalletState.state);
    }

    public final void R() {
        f0();
        this.f42781p.clear();
        ArrayList arrayList = this.f42783r;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            k0 k0Var = ((h0) obj).f42523b;
            if (k0Var != null) {
                k0Var.close();
            }
        }
        arrayList.clear();
        m0 m0Var = this.f42779n;
        if (m0Var != null) {
            m0Var.a();
            m0Var.f42731b.clear();
            m0Var.d.clear();
            m0Var.f42733e.clear();
            m0Var.f42734f.clear();
            m0Var.f42735g = "";
            m0Var.h = false;
            m0Var.k();
            this.f42779n.k();
            this.f42779n.i();
        }
        S();
        this.f42772f = null;
        X();
    }

    public final void S() {
        boolean z9;
        boolean z10;
        if (!TextUtils.equals(this.f42786u, t())) {
            f0();
            this.f42786u = t();
        }
        boolean G = G();
        int i7 = this.f42768a;
        if (G && !TextUtils.isEmpty(t())) {
            HashMap hashMap = this.f42785t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((p0) hashMap.get(wallettransaction)).f42941b, wallettransaction.messageHash)) {
                    ((p0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.f42781p;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    p0 p0Var = new p0(i7, str, new lk0(24, this, wallettransaction2));
                    hashMap.put(wallettransaction2, p0Var);
                    if (!p0Var.d && !TextUtils.isEmpty(str)) {
                        p0Var.d = true;
                        p0Var.f42944f = 0;
                        p0Var.a();
                    }
                }
            }
        } else {
            f0();
        }
        if (G() && !TextUtils.isEmpty(t()) && !this.E.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        a1 a1Var = this.f42784s;
        if (a1Var != null && a1Var.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9 || (z10 && a1Var != null && !TextUtils.equals(a1Var.f42058b, t()))) {
            if (z9) {
                a1 a1Var2 = this.f42784s;
                if (a1Var2 != null && !TextUtils.equals(a1Var2.f42058b, t())) {
                    this.f42784s.h();
                    this.f42784s = null;
                }
                if (this.f42784s == null) {
                    this.f42784s = new a1(i7, t(), this);
                }
                a1 a1Var3 = this.f42784s;
                boolean z11 = a1Var3.d;
                if (!z11) {
                    String str2 = a1Var3.f42058b;
                    if (!z11 && !TextUtils.isEmpty(str2)) {
                        a1Var3.d("starting; address=" + str2);
                        a1Var3.d = true;
                        a1Var3.f42064j = 0;
                        a1Var3.e();
                        return;
                    }
                    a1Var3.d("start ignored: running=" + a1Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            a1 a1Var4 = this.f42784s;
            if (a1Var4 != null) {
                a1Var4.h();
            }
            org.telegram.messenger.g0.r(this.F);
        }
    }

    public final void U(k0 k0Var, boolean z9, v10 v10Var) {
        k0 b10 = k0Var.b();
        H("requesting proof challenge");
        ConnectionsManager.getInstance(this.f42768a).sendRequestTyped(new TL_wallet.getProofChallenge(), new d3.b(1), new x(this, b10, v10Var, z9, 0));
    }

    public final void W() {
        int i7;
        this.I = t();
        ArrayList n10 = r0.n(org.telegram.messenger.t0.f25555b, p10.i(this.f42768a).e());
        n10.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0 j0Var = (j0) obj;
            hashMap.put(j0Var.f42610a, j0Var);
        }
        this.G.clear();
        int size2 = n10.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = n10.get(i11);
            i11++;
            String str = (String) obj2;
            j0 j0Var2 = (j0) hashMap.get(str);
            if (j0Var2 == null) {
                j0Var2 = new j0(new r0(this.f42768a, org.telegram.messenger.t0.f25555b, str));
            }
            r0 r0Var = j0Var2.f42614f;
            synchronized (r0.f43054f) {
                try {
                    try {
                        i7 = r0Var.r().f33344b;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        i7 = 0;
                    }
                } finally {
                }
            }
            j0Var2.f42611b = i7;
            this.G.add(j0Var2);
            u(str, null);
            k0((e0) this.N.get(str));
        }
        Collections.sort(this.G, new rv0(5));
    }

    public final void X() {
        H("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.f42768a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new d3.b(1), new i(this, 2));
    }

    public final void Y() {
        H("requesting state");
        this.A = ConnectionsManager.getInstance(this.f42768a).sendRequestTyped(new TL_wallet.getState(), new d3.b(1), new i(this, 1));
    }

    public final void Z(v10 v10Var, String str) {
        if (str == null) {
            v10Var.a(null, null);
            return;
        }
        HashMap hashMap = this.M;
        if (hashMap.containsKey(str)) {
            v10Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f42768a).sendRequestTyped(getuseraddresses, new d3.b(1), new j((Object) this, (Object) str, (Object) v10Var, 0));
    }

    public final void a0(TLRPC.User user, v10 v10Var) {
        if (user == null) {
            v10Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f27101id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            v10Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f27101id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f27213id;
        int i7 = this.f42768a;
        arrayList.add(qp.s1(i7).q1(user));
        ConnectionsManager.getInstance(i7).sendRequestTyped(getuseraddresses, new d3.b(1), new j(this, (Object) v10Var, (Object) user, 2));
    }

    public final void b0(String str, c20 c20Var) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z9 = org.telegram.ui.web.x0.Q0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i7 = this.f42768a;
        ConnectionsManager.getInstance(i7).sendRequestTyped(performapirequest, new d3.b(1), new bi.p5(this, str, c20Var), qp.s1(i7).N3, 0);
    }

    public final void c(org.telegram.tgnet.tl.TL_wallet.walletTransaction r10, org.telegram.tgnet.tl.TL_wallet.walletTransaction r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n0.c(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.tgnet.tl.TL_wallet$walletTransaction):void");
    }

    public final void d(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            c(wallettransaction, wallettransaction2);
        } else {
            S();
        }
    }

    public final void d0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, c20 c20Var, c20 c20Var2, e2 e2Var) {
        String t6 = t();
        H("send to " + str + ", amount " + j3 + ", when ready...");
        m0(new p(this, str, c20Var, nftitem, t6, str2, bArr, j3, e2Var, user, str3, c20Var2, 0));
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.f42771e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            r0 r0Var = this.f42770c;
            if (r0Var == null || !r0Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        r0 r0Var;
        TL_wallet.WalletState walletState = this.f42771e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((r0Var = this.f42770c) != null && r0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void f0() {
        HashMap hashMap = this.f42785t;
        for (p0 p0Var : hashMap.values()) {
            p0Var.b();
        }
        hashMap.clear();
    }

    public final l i(String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        b0 b0Var = new b0(this, str, j3, str2, bArr, v10Var);
        m0(b0Var);
        return new l(b0Var, 0);
    }

    public final void k0(e0 e0Var) {
        if (e0Var != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                j0 j0Var = (j0) obj;
                if (TextUtils.equals(j0Var.f42610a, e0Var.f42379a)) {
                    j0Var.f42612c = e0Var.f42380b;
                    boolean z9 = true;
                    j0Var.d = !e0Var.f42382e;
                    byte[] bArr = e0Var.f42381c;
                    if (bArr == null || bArr.length <= 0 || j0Var.f42614f.f(bArr)) {
                        z9 = false;
                    }
                    j0Var.f42613e = z9;
                }
            }
        }
    }

    public final void l0(TL_wallet.WalletState walletState) {
        boolean z9;
        m0 m0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.f42771e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z9 = true;
                    this.f42771e = walletState;
                    N();
                    L();
                    if (!z9 && (m0Var = this.f42779n) != null) {
                        m0Var.g();
                        return;
                    }
                }
            }
            z9 = false;
            this.f42771e = walletState;
            N();
            L();
            if (!z9) {
            }
        }
    }

    public final CharSequence m(long j3, boolean z9) {
        BigDecimal scale;
        int i7;
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
            boolean z10 = j10.symbolLeft;
            boolean z11 = j10.spaceBetween;
            boolean z12 = j10.dropZeros;
            int i10 = j10.exp;
            double d = j10.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d2 = d * ((org.telegram.messenger.i0) qp.s1(this.f42768a).f24927x7.f24438l.f14323b).f23003a;
                boolean z13 = false;
                int max = Math.max(0, Math.min(i10, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(BigDecimal.valueOf(d2)).movePointLeft(9);
                if (z9 && movePointLeft.signum() != 0) {
                    BigDecimal round = movePointLeft.round(new MathContext(3, RoundingMode.HALF_UP));
                    if (round.signum() == 0) {
                        scale = new BigDecimal(BigInteger.ZERO, 0);
                    } else {
                        scale = round.stripTrailingZeros();
                    }
                    i7 = Math.max(max, Math.min(20, Math.max(0, scale.scale())));
                } else {
                    scale = movePointLeft.setScale(max, RoundingMode.HALF_UP);
                    i7 = max;
                }
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z14 = !isEmpty;
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
                decimalFormat.setGroupingUsed(z14);
                if (z12) {
                    max = 0;
                }
                decimalFormat.setMinimumFractionDigits(max);
                decimalFormat.setMaximumFractionDigits(i7);
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                if (scale.signum() < 0) {
                    z13 = true;
                }
                String format = decimalFormat.format(scale.abs());
                if (!TextUtils.isEmpty(str2)) {
                    g10 = str2;
                }
                if (z11) {
                    str = " ";
                }
                if (z10) {
                    D = a8.p0.D(g10, str, format);
                } else {
                    D = a8.p0.D(format, str, g10);
                }
                if (z13) {
                    D = rf.b.i("-", D);
                }
                int indexOf = D.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D);
                    spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return D;
            }
        }
        return "";
    }

    public final void m0(Runnable runnable) {
        if (G()) {
            runnable.run();
            return;
        }
        this.v.add(new WeakReference(runnable));
    }

    public final String t() {
        TL_wallet.WalletState walletState = this.f42771e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final e0 u(final String str, q qVar) {
        HashMap hashMap = this.N;
        e0 e0Var = (e0) hashMap.get(str);
        if (e0Var != null && !e0Var.f42382e) {
            if (qVar != null) {
                e0Var.f42383f.add(qVar);
            }
            return null;
        }
        int i7 = this.f42768a;
        if (e0Var != null && e0Var.f42382e && ConnectionsManager.getInstance(i7).getCurrentTime() < e0Var.d + 300) {
            if (qVar != null) {
                qVar.a(e0Var);
            }
            return e0Var;
        }
        final ?? obj = new Object();
        obj.f42380b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f42383f = arrayList;
        obj.f42379a = str;
        obj.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (qVar != null) {
            arrayList.add(qVar);
        }
        hashMap.put(str, obj);
        Utilities.B(new g(this, str, (Object) obj, 1), new c20(this) {
            public final n0 f42853b;

            {
                this.f42853b = this;
            }

            @Override
            public final void a(Object obj2) {
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
                        n0 n0Var = this.f42853b;
                        int i10 = n0Var.f42768a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new r(n0Var, obj, str2, runnable, 0), qp.s1(i10).N3, 0);
                        return;
                    default:
                        n0 n0Var2 = this.f42853b;
                        e0 e0Var2 = obj;
                        String str3 = str;
                        n0Var2.b0(str3, new q(n0Var2, e0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new c20(this) {
            public final n0 f42853b;

            {
                this.f42853b = this;
            }

            @Override
            public final void a(Object obj2) {
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
                        n0 n0Var = this.f42853b;
                        int i10 = n0Var.f42768a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new r(n0Var, obj, str2, runnable, 0), qp.s1(i10).N3, 0);
                        return;
                    default:
                        n0 n0Var2 = this.f42853b;
                        e0 e0Var2 = obj;
                        String str3 = str;
                        n0Var2.b0(str3, new q(n0Var2, e0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        });
        return null;
    }

    public final long v() {
        TL_wallet.WalletState walletState = this.f42771e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final byte[] y() {
        TL_wallet.WalletState walletState = this.f42771e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void z(v10 v10Var, boolean z9, boolean z10) {
        H("getSecretPhrase: whenReady...");
        m0(new h2.o0(this, v10Var, z9, z10, 5));
    }
}
