package org.telegram.ui.Wallet;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.LruCache;
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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.y41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.dx0;
import org.telegram.ui.z90;
public final class k0 {
    public static volatile k0[] O = new k0[4];
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
    public final int f34781a;
    public WalletEngine2 f34782b;
    public p0 f34783c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f34784f;
    public final e2 f34785g;
    public final f h;
    public Boolean f34786i;
    public String f34787j;
    public long f34788k;
    public boolean f34789l;
    public boolean f34790m;
    public j0 f34791n;
    public c0 f34792o;
    public z0 f34796s;
    public String f34798u;
    public String f34800x;
    public int f34801y;
    public final ArrayList f34793p = new ArrayList();
    public final HashMap f34794q = new HashMap();
    public final ArrayList f34795r = new ArrayList();
    public final HashMap f34797t = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ArrayList f34799w = new ArrayList();
    public final h f34802z = new Runnable(this) {
        public final k0 f34613b;

        {
            this.f34613b = this;
        }

        @Override
        public final void run() {
            c0 c0Var;
            j0 j0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    k0 k0Var = this.f34613b;
                    if (!TextUtils.isEmpty(k0Var.f34800x) && (c0Var = k0Var.f34792o) != null && c0Var.d(k0Var.f34800x) && (j0Var = k0Var.f34791n) != null) {
                        ArrayList arrayList = j0Var.f34735b;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.f34800x)) {
                                return;
                            }
                        }
                    }
                    if (k0Var.f34792o == null) {
                        k0Var.f34792o = new c0(k0Var);
                    }
                    c0 c0Var2 = k0Var.f34792o;
                    if (!c0Var2.f34304j) {
                        c0Var2.b();
                        c0Var2.f(true);
                    }
                    k0Var.B().g();
                    k0Var.E();
                    int i11 = k0Var.f34801y;
                    long[] jArr = k0.P;
                    if (i11 < 7) {
                        h hVar = k0Var.f34802z;
                        k0Var.f34801y = i11 + 1;
                        org.telegram.messenger.i0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 1:
                    k0 k0Var2 = this.f34613b;
                    z0 z0Var = k0Var2.f34796s;
                    if (z0Var != null && z0Var.d) {
                        k0Var2.E();
                        return;
                    }
                    return;
                default:
                    k0 k0Var3 = this.f34613b;
                    k0Var3.W();
                    k0Var3.L();
                    return;
            }
        }
    };
    public int A = -1;
    public int B = -1;
    public int D = 0;
    public final HashSet E = new HashSet();
    public final h F = new Runnable(this) {
        public final k0 f34613b;

        {
            this.f34613b = this;
        }

        @Override
        public final void run() {
            c0 c0Var;
            j0 j0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    k0 k0Var = this.f34613b;
                    if (!TextUtils.isEmpty(k0Var.f34800x) && (c0Var = k0Var.f34792o) != null && c0Var.d(k0Var.f34800x) && (j0Var = k0Var.f34791n) != null) {
                        ArrayList arrayList = j0Var.f34735b;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.f34800x)) {
                                return;
                            }
                        }
                    }
                    if (k0Var.f34792o == null) {
                        k0Var.f34792o = new c0(k0Var);
                    }
                    c0 c0Var2 = k0Var.f34792o;
                    if (!c0Var2.f34304j) {
                        c0Var2.b();
                        c0Var2.f(true);
                    }
                    k0Var.B().g();
                    k0Var.E();
                    int i11 = k0Var.f34801y;
                    long[] jArr = k0.P;
                    if (i11 < 7) {
                        h hVar = k0Var.f34802z;
                        k0Var.f34801y = i11 + 1;
                        org.telegram.messenger.i0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 1:
                    k0 k0Var2 = this.f34613b;
                    z0 z0Var = k0Var2.f34796s;
                    if (z0Var != null && z0Var.d) {
                        k0Var2.E();
                        return;
                    }
                    return;
                default:
                    k0 k0Var3 = this.f34613b;
                    k0Var3.W();
                    k0Var3.L();
                    return;
            }
        }
    };

    public k0(int i10) {
        boolean z10 = false;
        this.C = -1;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        this.J = new Runnable(this) {
            public final k0 f34613b;

            {
                this.f34613b = this;
            }

            @Override
            public final void run() {
                c0 c0Var;
                j0 j0Var;
                TL_wallet.nftItem nftitem;
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f34613b;
                        if (!TextUtils.isEmpty(k0Var.f34800x) && (c0Var = k0Var.f34792o) != null && c0Var.d(k0Var.f34800x) && (j0Var = k0Var.f34791n) != null) {
                            ArrayList arrayList2 = j0Var.f34735b;
                            int size = arrayList2.size();
                            int i102 = 0;
                            while (i102 < size) {
                                Object obj = arrayList2.get(i102);
                                i102++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.f34800x)) {
                                    return;
                                }
                            }
                        }
                        if (k0Var.f34792o == null) {
                            k0Var.f34792o = new c0(k0Var);
                        }
                        c0 c0Var2 = k0Var.f34792o;
                        if (!c0Var2.f34304j) {
                            c0Var2.b();
                            c0Var2.f(true);
                        }
                        k0Var.B().g();
                        k0Var.E();
                        int i11 = k0Var.f34801y;
                        long[] jArr = k0.P;
                        if (i11 < 7) {
                            h hVar = k0Var.f34802z;
                            k0Var.f34801y = i11 + 1;
                            org.telegram.messenger.i0.h3(hVar, jArr[i11]);
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var2 = this.f34613b;
                        z0 z0Var = k0Var2.f34796s;
                        if (z0Var != null && z0Var.d) {
                            k0Var2.E();
                            return;
                        }
                        return;
                    default:
                        k0 k0Var3 = this.f34613b;
                        k0Var3.W();
                        k0Var3.L();
                        return;
                }
            }
        };
        this.K = new HashMap();
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = new HashMap();
        this.f34781a = i10;
        try {
            this.f34790m = w().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e) {
            k("failed to load prefs", e);
        }
        this.h = new f(this);
        Y();
        X();
        H("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.f34781a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new a3.b(1), new i(this, 0));
        this.f34785g = new e2(this);
        h hVar = this.J;
        Object obj = p0.f35003f;
        synchronized (p0.class) {
            try {
                Iterator it = p0.f35005i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        p0.f35005i.remove(weakReference);
                    } else if (runnable == hVar) {
                        z10 = true;
                    }
                }
                if (hVar != null && !z10) {
                    p0.f35005i.add(new WeakReference(hVar));
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

    public static void D(IdentityHashMap identityHashMap, HashMap hashMap, int i10, TL_wallet.walletTransaction wallettransaction, boolean z10) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z10) {
            if (treeSet == null) {
                treeSet = new TreeSet();
                identityHashMap.put(wallettransaction, treeSet);
            }
            treeSet.add(Integer.valueOf(i10));
        } else if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i10));
        }
        ArrayList h02 = h0(wallettransaction);
        int size = h02.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = h02.get(i11);
            i11++;
            String str = (String) obj;
            TreeSet treeSet2 = (TreeSet) hashMap.get(str);
            if (z10) {
                if (treeSet2 == null) {
                    treeSet2 = new TreeSet();
                    hashMap.put(str, treeSet2);
                }
                treeSet2.add(Integer.valueOf(i10));
            } else if (treeSet2 != null) {
                treeSet2.remove(Integer.valueOf(i10));
            }
        }
    }

    public static void H(String str) {
        org.telegram.messenger.f8.b("[gram-wallet] " + str);
    }

    public static boolean I(kj kjVar, TL_wallet.walletTransaction wallettransaction) {
        if (kjVar != null && kjVar.f16690k != null && wallettransaction != null && kjVar.P3()) {
            TLRPC.Message message = kjVar.f16690k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j10 = wallettransaction.random_id;
                if (j10 == 0 || message.random_id != j10) {
                    if (wallettransaction.localMessageId == 0 || kjVar.f1() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f20057id) && TextUtils.equals(wallettransaction.f20057id, tL_messageActionGramTransfer.transaction_id)) {
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
            boolean z10 = false;
            int i10 = 0;
            for (byte b10 : bArr) {
                if (h0.e(b10)) {
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

    public static String V(String str, boolean z10) {
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

    public static TL_wallet.WalletTransactionPeer g(TLRPC.User user, String str, String str2) {
        TL_wallet.WalletTransactionPeer wallettransactionpeeraddress;
        if (user != null) {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeraddress.user_id = user.f19943id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
    }

    public static java.lang.String g0(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k0.g0(java.lang.String):java.lang.String");
    }

    public static d2 h(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
            str = V(stargiftdepositpayload.nft_address, true);
        } else {
            str = stargiftdepositpayload.nft_address;
        }
        return new d2(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static ArrayList h0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.f20057id)) {
                arrayList.add("i" + wallettransaction.f20057id);
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
        if ((TextUtils.isEmpty(wallettransaction.f20057id) || !TextUtils.equals(wallettransaction.f20057id, wallettransaction2.f20057id)) && !c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !c0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
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
        org.telegram.messenger.f8.d("[gram-wallet] " + str);
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
            for (int i10 = 2; i10 < 34; i10++) {
                sb2.append(Character.forDigit((decode[i10] >> 4) & 15, 16));
                sb2.append(Character.forDigit(decode[i10] & 15, 16));
            }
            return sb2.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void k(String str, Throwable th2) {
        org.telegram.messenger.f8.e("[gram-wallet] " + str, th2);
    }

    public static SpannableStringBuilder l(String str, CharSequence charSequence, int i10) {
        long abs;
        String replace = charSequence.toString().replace((char) 8211, '-');
        String L0 = dd.L0(i10, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                if (parseLong >= -2147483647L && parseLong <= 2147483647L) {
                    abs = Math.abs(parseLong);
                } else {
                    abs = Math.abs(parseLong % 100) + 100;
                }
                L0 = dd.J0((int) abs, str);
            } catch (NumberFormatException unused) {
            }
        }
        return org.telegram.messenger.i0.J2(L0, charSequence, "%1$s");
    }

    public static SpannableStringBuilder n(long j10, boolean z10) {
        return l("GramCapital", o(j10, z10), 2131749528);
    }

    public static String o(long j10, boolean z10) {
        if ((j10 > -10000000 && j10 < 10000000) || z10) {
            return rh.h8.P0(j10);
        }
        if (R == null) {
            R = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return R.format(j10 / 1.0E9d);
    }

    public static String p(long j10, boolean z10) {
        boolean z11;
        int i10;
        BigDecimal stripTrailingZeros;
        if (j10 > -1000000000 && j10 < 1000000000) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 && z11) {
            return o(j10, true);
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

    public static SpannableStringBuilder q(String str, float f7) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i10 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), i10, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder r(long j10) {
        return s(j10, false);
    }

    public static SpannableStringBuilder s(long j10, boolean z10) {
        return l("Grams", o(j10, z10), 2131749516);
    }

    public static Context w() {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null && T.getContext() != null) {
            return T.getContext();
        }
        return org.telegram.messenger.w0.f18945b;
    }

    public static k0 x(int i10) {
        k0 k0Var;
        k0 k0Var2 = O[i10];
        if (k0Var2 == null) {
            synchronized (k0.class) {
                try {
                    k0Var = O[i10];
                    if (k0Var == null) {
                        k0[] k0VarArr = O;
                        k0 k0Var3 = new k0(i10);
                        k0VarArr[i10] = k0Var3;
                        k0Var = k0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k0Var;
        }
        return k0Var2;
    }

    public final j0 B() {
        if (this.f34791n == null) {
            this.f34791n = new j0(this);
        }
        return this.f34791n;
    }

    public final void C(boolean z10, boolean z11, h0 h0Var, r20 r20Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(h0Var)) {
                r20Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(h0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(h0Var);
            h0 b10 = h0Var.b();
            H("import wallet: requesting proof challenge");
            i3.a(this.f34781a, null, new q(this, b10, r20Var, secretPhraseToAnchorPublicKey, 2), null, null, new s(this, r20Var, secretPhraseToPublicKey, b10), z10, z11, new z90(new l(b10, 2), 1));
        } catch (Exception unused2) {
            r20Var.a("INVALID_PHRASE");
        }
    }

    public final void E() {
        j0 j0Var = this.f34791n;
        if (j0Var != null) {
            j0Var.g();
        }
        if (this.A >= 0) {
            return;
        }
        Y();
    }

    public final boolean F() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f34784f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f34782b != null && this.f34783c != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        p0 p0Var;
        boolean z10;
        if (!(this.e instanceof TL_wallet.TL_walletState) || (p0Var = this.f34783c) == null) {
            return false;
        }
        synchronized (p0.f35003f) {
            try {
                try {
                    z10 = p0Var.r().f27590c;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
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

    public final boolean K() {
        if (this.f34790m && !uz.f18549s.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void L() {
        at.f(this.f34781a).k(at.f14678a4, this);
    }

    public final void M(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k0.M(org.json.JSONObject):void");
    }

    public final void N() {
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
        p0 p0Var = this.f34783c;
        if (p0Var != null && !TextUtils.equals(p0Var.f35008c, str)) {
            if (str == null) {
                H("received empty state, leaving wallet storage of " + this.f34783c.f35008c);
            } else {
                StringBuilder u10 = a1.g.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.f34783c.f35008c);
                H(u10.toString());
            }
            this.f34783c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f34783c == null) {
            H("setting up wallet storage of " + str);
            this.f34783c = new p0(this.f34781a, org.telegram.messenger.w0.f18945b, str);
            H("storage public keys = " + this.f34783c.m().length);
        }
        c0 c0Var = this.f34792o;
        if (c0Var != null && !TextUtils.equals(c0Var.e, str)) {
            c0Var.e = str;
            c0Var.c();
        }
        if (this.f34782b != null && !TextUtils.equals(this.d, str)) {
            this.f34782b.close();
            this.f34782b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f34782b == null || !TextUtils.equals(this.d, str))) {
            if (this.f34782b != null) {
                H("closing wallet-engine of " + this.d);
                this.f34782b.close();
                this.f34782b = null;
            }
            H("creating wallet-engine for " + str);
            try {
                int i10 = this.f34781a;
                this.d = str;
                this.f34782b = new WalletEngine2(i10, str, bArr);
            } catch (Exception e) {
                k("failed to create engine!", e);
                this.d = null;
            }
        }
        int i11 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f34782b != null) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                }
            }
            this.v.clear();
        }
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f34782b != null && this.f34784f != null) {
            ArrayList arrayList2 = this.f34799w;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.i0.g3(runnable2);
                }
            }
            this.f34799w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            W();
        }
        S();
    }

    public final void O(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && g0(str) != null) {
            ArrayList arrayList = this.f34793p;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
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
        this.f34784f = tL_updateWalletGaslessInfo;
        N();
        L();
    }

    public final void Q(TL_update.TL_updateWalletState tL_updateWalletState) {
        l0(tL_updateWalletState.state);
    }

    public final void R() {
        f0();
        this.f34793p.clear();
        ArrayList arrayList = this.f34795r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = ((e0) obj).f34443b;
            if (h0Var != null) {
                h0Var.close();
            }
        }
        arrayList.clear();
        j0 j0Var = this.f34791n;
        if (j0Var != null) {
            j0Var.a();
            j0Var.f34735b.clear();
            j0Var.d.clear();
            j0Var.e.clear();
            j0Var.f34737f.clear();
            j0Var.f34738g = "";
            j0Var.h = false;
            j0Var.k();
            this.f34791n.k();
            this.f34791n.i();
        }
        S();
        this.f34784f = null;
        X();
    }

    public final void S() {
        boolean z10;
        boolean z11;
        if (!TextUtils.equals(this.f34798u, t())) {
            f0();
            this.f34798u = t();
        }
        boolean G = G();
        int i10 = this.f34781a;
        if (G && !TextUtils.isEmpty(t())) {
            HashMap hashMap = this.f34797t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((m0) hashMap.get(wallettransaction)).f34883b, wallettransaction.messageHash)) {
                    ((m0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.f34793p;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    m0 m0Var = new m0(i10, str, new cp0(23, this, wallettransaction2));
                    hashMap.put(wallettransaction2, m0Var);
                    if (!m0Var.d && !TextUtils.isEmpty(str)) {
                        m0Var.d = true;
                        m0Var.f34885f = 0;
                        m0Var.a();
                    }
                }
            }
        } else {
            f0();
        }
        if (G() && !TextUtils.isEmpty(t()) && !this.E.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        z0 z0Var = this.f34796s;
        if (z0Var != null && z0Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && z0Var != null && !TextUtils.equals(z0Var.f35439b, t()))) {
            if (z10) {
                z0 z0Var2 = this.f34796s;
                if (z0Var2 != null && !TextUtils.equals(z0Var2.f35439b, t())) {
                    this.f34796s.h();
                    this.f34796s = null;
                }
                if (this.f34796s == null) {
                    this.f34796s = new z0(i10, t(), this);
                }
                z0 z0Var3 = this.f34796s;
                boolean z12 = z0Var3.d;
                if (!z12) {
                    String str2 = z0Var3.f35439b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        z0Var3.d("starting; address=" + str2);
                        z0Var3.d = true;
                        z0Var3.f35444j = 0;
                        z0Var3.e();
                        return;
                    }
                    z0Var3.d("start ignored: running=" + z0Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            z0 z0Var4 = this.f34796s;
            if (z0Var4 != null) {
                z0Var4.h();
            }
            org.telegram.messenger.i0.r(this.F);
        }
    }

    public final void U(h0 h0Var, boolean z10, k20 k20Var) {
        h0 b10 = h0Var.b();
        H("requesting proof challenge");
        ConnectionsManager.getInstance(this.f34781a).sendRequestTyped(new TL_wallet.getProofChallenge(), new a3.b(1), new v(this, b10, k20Var, z10, 0));
    }

    public final void W() {
        int i10;
        this.I = t();
        ArrayList n10 = p0.n(org.telegram.messenger.w0.f18945b, e20.i(this.f34781a).e());
        n10.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g0 g0Var = (g0) obj;
            hashMap.put(g0Var.f34531a, g0Var);
        }
        this.G.clear();
        int size2 = n10.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = n10.get(i12);
            i12++;
            String str = (String) obj2;
            g0 g0Var2 = (g0) hashMap.get(str);
            if (g0Var2 == null) {
                g0Var2 = new g0(new p0(this.f34781a, org.telegram.messenger.w0.f18945b, str));
            }
            p0 p0Var = g0Var2.f34534f;
            synchronized (p0.f35003f) {
                try {
                    try {
                        i10 = p0Var.r().f27589b;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        i10 = 0;
                    }
                } finally {
                }
            }
            g0Var2.f34532b = i10;
            this.G.add(g0Var2);
            u(str, null);
            k0((b0) this.N.get(str));
        }
        Collections.sort(this.G, new dx0(5));
    }

    public final void X() {
        H("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.f34781a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new a3.b(1), new i(this, 2));
    }

    public final void Y() {
        H("requesting state");
        this.A = ConnectionsManager.getInstance(this.f34781a).sendRequestTyped(new TL_wallet.getState(), new a3.b(1), new i(this, 1));
    }

    public final void Z(k20 k20Var, String str) {
        if (str == null) {
            k20Var.a(null, null);
            return;
        }
        HashMap hashMap = this.M;
        if (hashMap.containsKey(str)) {
            k20Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f34781a).sendRequestTyped(getuseraddresses, new a3.b(1), new j((Object) this, (Object) str, (Object) k20Var, 0));
    }

    public final void a0(TLRPC.User user, k20 k20Var) {
        if (user == null) {
            k20Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f19943id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            k20Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f19943id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f20054id;
        int i10 = this.f34781a;
        arrayList.add(wp.r1(i10).p1(user));
        ConnectionsManager.getInstance(i10).sendRequestTyped(getuseraddresses, new a3.b(1), new j(this, (Object) k20Var, (Object) user, 2));
    }

    public final void b0(String str, r20 r20Var) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.z0.Q0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i10 = this.f34781a;
        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new a3.b(1), new ih.s(this, str, r20Var), wp.r1(i10).P3, 0);
    }

    public final void c(org.telegram.tgnet.tl.TL_wallet.walletTransaction r10, org.telegram.tgnet.tl.TL_wallet.walletTransaction r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k0.c(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.tgnet.tl.TL_wallet$walletTransaction):void");
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

    public final void d0(TLRPC.User user, String str, long j10, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, r20 r20Var, r20 r20Var2, d2 d2Var) {
        String t10 = t();
        H("send to " + str + ", amount " + j10 + ", when ready...");
        m0(new o(this, str, r20Var, nftitem, t10, str2, bArr, j10, d2Var, user, str3, r20Var2, 0));
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            p0 p0Var = this.f34783c;
            if (p0Var == null || !p0Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        p0 p0Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((p0Var = this.f34783c) != null && p0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void f0() {
        HashMap hashMap = this.f34797t;
        for (m0 m0Var : hashMap.values()) {
            m0Var.b();
        }
        hashMap.clear();
    }

    public final l i(String str, long j10, String str2, byte[] bArr, k20 k20Var) {
        y yVar = new y(this, str, j10, str2, bArr, k20Var);
        m0(yVar);
        return new l(yVar, 0);
    }

    public final void k0(b0 b0Var) {
        if (b0Var != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                g0 g0Var = (g0) obj;
                if (TextUtils.equals(g0Var.f34531a, b0Var.f34220a)) {
                    g0Var.f34533c = b0Var.f34221b;
                    boolean z10 = true;
                    g0Var.d = !b0Var.e;
                    byte[] bArr = b0Var.f34222c;
                    if (bArr == null || bArr.length <= 0 || g0Var.f34534f.f(bArr)) {
                        z10 = false;
                    }
                    g0Var.e = z10;
                }
            }
        }
    }

    public final void l0(TL_wallet.WalletState walletState) {
        boolean z10;
        j0 j0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.e = walletState;
                    N();
                    L();
                    if (!z10 && (j0Var = this.f34791n) != null) {
                        j0Var.g();
                        return;
                    }
                }
            }
            z10 = false;
            this.e = walletState;
            N();
            L();
            if (!z10) {
            }
        }
    }

    public final CharSequence m(long j10, boolean z10) {
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
                double d10 = d * ((org.telegram.messenger.k0) wp.r1(this.f34781a).f19300y7.f18036l.f13481b).f16536a;
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
                    C = sc.e.h("-", C);
                }
                int indexOf = C.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C);
                    spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return C;
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
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final b0 u(final String str, p pVar) {
        HashMap hashMap = this.N;
        b0 b0Var = (b0) hashMap.get(str);
        if (b0Var != null && !b0Var.e) {
            if (pVar != null) {
                b0Var.f34223f.add(pVar);
            }
            return null;
        }
        int i10 = this.f34781a;
        if (b0Var != null && b0Var.e && ConnectionsManager.getInstance(i10).getCurrentTime() < b0Var.d + 300) {
            if (pVar != null) {
                pVar.a(b0Var);
            }
            return b0Var;
        }
        final ?? obj = new Object();
        obj.f34221b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f34223f = arrayList;
        obj.f34220a = str;
        obj.d = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (pVar != null) {
            arrayList.add(pVar);
        }
        hashMap.put(str, obj);
        Utilities.B(new g(this, str, (Object) obj, 1), new r20(this) {
            public final k0 f34917b;

            {
                this.f34917b = this;
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
                        k0 k0Var = this.f34917b;
                        int i11 = k0Var.f34781a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new a3.b(1), new q(k0Var, obj, str2, runnable, 0), wp.r1(i11).P3, 0);
                        return;
                    default:
                        k0 k0Var2 = this.f34917b;
                        b0 b0Var2 = obj;
                        String str3 = str;
                        k0Var2.b0(str3, new p(k0Var2, b0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new r20(this) {
            public final k0 f34917b;

            {
                this.f34917b = this;
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
                        k0 k0Var = this.f34917b;
                        int i11 = k0Var.f34781a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new a3.b(1), new q(k0Var, obj, str2, runnable, 0), wp.r1(i11).P3, 0);
                        return;
                    default:
                        k0 k0Var2 = this.f34917b;
                        b0 b0Var2 = obj;
                        String str3 = str;
                        k0Var2.b0(str3, new p(k0Var2, b0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        });
        return null;
    }

    public final long v() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final byte[] y() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void z(k20 k20Var, boolean z10, boolean z11) {
        H("getSecretPhrase: whenReady...");
        m0(new e2.n0(this, k20Var, z10, z11, 5));
    }
}
