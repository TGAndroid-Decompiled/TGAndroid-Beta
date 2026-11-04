package org.telegram.ui.Wallet;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.LruCache;
import ci.wb;
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
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.o31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.na1;
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
    public final int f42718a;
    public WalletEngine2 f42719b;
    public o0 f42720c;
    public String d;
    public TL_wallet.WalletState f42721e;
    public TL_update.TL_updateWalletGaslessInfo f42722f;
    public final c2 f42723g;
    public final f h;
    public Boolean f42724i;
    public String f42725j;
    public long f42726k;
    public boolean f42727l;
    public boolean f42728m;
    public j0 f42729n;
    public c0 f42730o;
    public x0 f42734s;
    public String f42736u;
    public String f42738x;
    public int f42739y;
    public final ArrayList f42731p = new ArrayList();
    public final HashMap f42732q = new HashMap();
    public final ArrayList f42733r = new ArrayList();
    public final HashMap f42735t = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ArrayList f42737w = new ArrayList();
    public final h f42740z = new Runnable(this) {
        public final k0 f42596b;

        {
            this.f42596b = this;
        }

        @Override
        public final void run() {
            c0 c0Var;
            j0 j0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    k0 k0Var = this.f42596b;
                    if (!TextUtils.isEmpty(k0Var.f42738x) && (c0Var = k0Var.f42730o) != null && c0Var.d(k0Var.f42738x) && (j0Var = k0Var.f42729n) != null) {
                        ArrayList arrayList = j0Var.f42680b;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.f42738x)) {
                                return;
                            }
                        }
                    }
                    if (k0Var.f42730o == null) {
                        k0Var.f42730o = new c0(k0Var);
                    }
                    c0 c0Var2 = k0Var.f42730o;
                    if (!c0Var2.f42367j) {
                        c0Var2.b();
                        c0Var2.f(true);
                    }
                    k0Var.B().g();
                    k0Var.E();
                    int i10 = k0Var.f42739y;
                    long[] jArr = k0.P;
                    if (i10 < 7) {
                        h hVar = k0Var.f42740z;
                        k0Var.f42739y = i10 + 1;
                        org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                        return;
                    }
                    return;
                case 1:
                    k0 k0Var2 = this.f42596b;
                    x0 x0Var = k0Var2.f42734s;
                    if (x0Var != null && x0Var.d) {
                        k0Var2.E();
                        return;
                    }
                    return;
                default:
                    k0 k0Var3 = this.f42596b;
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
        public final k0 f42596b;

        {
            this.f42596b = this;
        }

        @Override
        public final void run() {
            c0 c0Var;
            j0 j0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    k0 k0Var = this.f42596b;
                    if (!TextUtils.isEmpty(k0Var.f42738x) && (c0Var = k0Var.f42730o) != null && c0Var.d(k0Var.f42738x) && (j0Var = k0Var.f42729n) != null) {
                        ArrayList arrayList = j0Var.f42680b;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.f42738x)) {
                                return;
                            }
                        }
                    }
                    if (k0Var.f42730o == null) {
                        k0Var.f42730o = new c0(k0Var);
                    }
                    c0 c0Var2 = k0Var.f42730o;
                    if (!c0Var2.f42367j) {
                        c0Var2.b();
                        c0Var2.f(true);
                    }
                    k0Var.B().g();
                    k0Var.E();
                    int i10 = k0Var.f42739y;
                    long[] jArr = k0.P;
                    if (i10 < 7) {
                        h hVar = k0Var.f42740z;
                        k0Var.f42739y = i10 + 1;
                        org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                        return;
                    }
                    return;
                case 1:
                    k0 k0Var2 = this.f42596b;
                    x0 x0Var = k0Var2.f42734s;
                    if (x0Var != null && x0Var.d) {
                        k0Var2.E();
                        return;
                    }
                    return;
                default:
                    k0 k0Var3 = this.f42596b;
                    k0Var3.W();
                    k0Var3.L();
                    return;
            }
        }
    };

    public k0(int i3) {
        boolean z10 = false;
        this.C = -1;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        this.J = new Runnable(this) {
            public final k0 f42596b;

            {
                this.f42596b = this;
            }

            @Override
            public final void run() {
                c0 c0Var;
                j0 j0Var;
                TL_wallet.nftItem nftitem;
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f42596b;
                        if (!TextUtils.isEmpty(k0Var.f42738x) && (c0Var = k0Var.f42730o) != null && c0Var.d(k0Var.f42738x) && (j0Var = k0Var.f42729n) != null) {
                            ArrayList arrayList2 = j0Var.f42680b;
                            int size = arrayList2.size();
                            int i32 = 0;
                            while (i32 < size) {
                                Object obj = arrayList2.get(i32);
                                i32++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, k0Var.f42738x)) {
                                    return;
                                }
                            }
                        }
                        if (k0Var.f42730o == null) {
                            k0Var.f42730o = new c0(k0Var);
                        }
                        c0 c0Var2 = k0Var.f42730o;
                        if (!c0Var2.f42367j) {
                            c0Var2.b();
                            c0Var2.f(true);
                        }
                        k0Var.B().g();
                        k0Var.E();
                        int i10 = k0Var.f42739y;
                        long[] jArr = k0.P;
                        if (i10 < 7) {
                            h hVar = k0Var.f42740z;
                            k0Var.f42739y = i10 + 1;
                            org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var2 = this.f42596b;
                        x0 x0Var = k0Var2.f42734s;
                        if (x0Var != null && x0Var.d) {
                            k0Var2.E();
                            return;
                        }
                        return;
                    default:
                        k0 k0Var3 = this.f42596b;
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
        this.f42718a = i3;
        try {
            this.f42728m = w().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e10) {
            k("failed to load prefs", e10);
        }
        this.h = new f(this);
        Y();
        X();
        H("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.f42718a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new c3.b(1), new i(this, 0));
        this.f42723g = new c2(this);
        h hVar = this.J;
        Object obj = o0.f42982f;
        synchronized (o0.class) {
            try {
                Iterator it = o0.f42984i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        o0.f42984i.remove(weakReference);
                    } else if (runnable == hVar) {
                        z10 = true;
                    }
                }
                if (hVar != null && !z10) {
                    o0.f42984i.add(new WeakReference(hVar));
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
            int i3 = 0;
            while (i3 < size) {
                TLRPC.Update update2 = arrayList.get(i3);
                i3++;
                TLRPC.Update update3 = update2;
                if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                    return (TL_update.TL_updateSentWalletTransaction) update3;
                }
            }
            return null;
        }
        return null;
    }

    public static void D(IdentityHashMap identityHashMap, HashMap hashMap, int i3, TL_wallet.walletTransaction wallettransaction, boolean z10) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z10) {
            if (treeSet == null) {
                treeSet = new TreeSet();
                identityHashMap.put(wallettransaction, treeSet);
            }
            treeSet.add(Integer.valueOf(i3));
        } else if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i3));
        }
        ArrayList h02 = h0(wallettransaction);
        int size = h02.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = h02.get(i10);
            i10++;
            String str = (String) obj;
            TreeSet treeSet2 = (TreeSet) hashMap.get(str);
            if (z10) {
                if (treeSet2 == null) {
                    treeSet2 = new TreeSet();
                    hashMap.put(str, treeSet2);
                }
                treeSet2.add(Integer.valueOf(i3));
            } else if (treeSet2 != null) {
                treeSet2.remove(Integer.valueOf(i3));
            }
        }
    }

    public static void H(String str) {
        org.telegram.messenger.a8.b("[gram-wallet] " + str);
    }

    public static boolean I(zi ziVar, TL_wallet.walletTransaction wallettransaction) {
        if (ziVar != null && ziVar.f26868k != null && wallettransaction != null && ziVar.Q3()) {
            TLRPC.Message message = ziVar.f26868k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j10 = wallettransaction.random_id;
                if (j10 == 0 || message.random_id != j10) {
                    if (wallettransaction.localMessageId == 0 || ziVar.f1() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f27265id) && TextUtils.equals(wallettransaction.f27265id, tL_messageActionGramTransfer.transaction_id)) {
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
            int i3 = 0;
            for (byte b10 : bArr) {
                if (h0.e(b10)) {
                    if (i3 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    if (z10) {
                        if (i3 != 215) {
                            int i10 = i3 + 1;
                            bArr2[i3] = 32;
                            i3 = i10;
                            z10 = false;
                        } else {
                            throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                        }
                    }
                    if (i3 != 215) {
                        bArr2[i3] = b10;
                        i3++;
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
                    for (int i3 = 0; i3 < 32; i3++) {
                        int i10 = i3 * 2;
                        bArr[i3 + 2] = (byte) Integer.parseInt(substring.substring(i10, i10 + 2), 16);
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

    public static void a(ArrayList arrayList, char c2, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String g02 = g0(str);
        if (g02 != null) {
            str2 = c2 + "x" + g02;
        } else {
            str2 = c2 + "r" + str;
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
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr2[2][i3] = (byte) ((bArr[i3] ^ bArr2[0][i3]) ^ bArr2[1][i3]);
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
            wallettransactionpeeraddress.user_id = user.f27150id;
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

    public static b2 h(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
            str = V(stargiftdepositpayload.nft_address, true);
        } else {
            str = stargiftdepositpayload.nft_address;
        }
        return new b2(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static ArrayList h0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.f27265id)) {
                arrayList.add("i" + wallettransaction.f27265id);
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
        if ((TextUtils.isEmpty(wallettransaction.f27265id) || !TextUtils.equals(wallettransaction.f27265id, wallettransaction2.f27265id)) && !c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !c0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
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
            for (int i3 = 2; i3 < 34; i3++) {
                sb2.append(Character.forDigit((decode[i3] >> 4) & 15, 16));
                sb2.append(Character.forDigit(decode[i3] & 15, 16));
            }
            return sb2.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void k(String str, Throwable th2) {
        org.telegram.messenger.a8.e("[gram-wallet] " + str, th2);
    }

    public static SpannableStringBuilder l(String str, CharSequence charSequence, int i3) {
        long abs;
        String replace = charSequence.toString().replace((char) 8211, '-');
        String M0 = bd.M0(i3, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                if (parseLong >= -2147483647L && parseLong <= 2147483647L) {
                    abs = Math.abs(parseLong);
                } else {
                    abs = Math.abs(parseLong % 100) + 100;
                }
                M0 = bd.K0((int) abs, str);
            } catch (NumberFormatException unused) {
            }
        }
        return org.telegram.messenger.g0.K2(M0, charSequence, "%1$s");
    }

    public static SpannableStringBuilder n(long j10, boolean z10) {
        return l("GramCapital", o(j10, z10), 2131749527);
    }

    public static String o(long j10, boolean z10) {
        if ((j10 > -10000000 && j10 < 10000000) || z10) {
            return wb.P0(j10);
        }
        if (R == null) {
            R = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return R.format(j10 / 1.0E9d);
    }

    public static String p(long j10, boolean z10) {
        boolean z11;
        int i3;
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
            i3 = 4;
        } else if (z11) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        BigDecimal scale = BigDecimal.valueOf(j10, 9).setScale(i3, RoundingMode.DOWN);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static SpannableStringBuilder q(String str, float f10) {
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i3 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), i3, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder r(long j10) {
        return s(j10, false);
    }

    public static SpannableStringBuilder s(long j10, boolean z10) {
        return l("Grams", o(j10, z10), 2131749515);
    }

    public static Context w() {
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null && T.getContext() != null) {
            return T.getContext();
        }
        return org.telegram.messenger.t0.f25457b;
    }

    public static k0 x(int i3) {
        k0 k0Var;
        k0 k0Var2 = O[i3];
        if (k0Var2 == null) {
            synchronized (k0.class) {
                try {
                    k0Var = O[i3];
                    if (k0Var == null) {
                        k0[] k0VarArr = O;
                        k0 k0Var3 = new k0(i3);
                        k0VarArr[i3] = k0Var3;
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
        if (this.f42729n == null) {
            this.f42729n = new j0(this);
        }
        return this.f42729n;
    }

    public final void C(boolean z10, boolean z11, h0 h0Var, u10 u10Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(h0Var)) {
                u10Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(h0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(h0Var);
            h0 b10 = h0Var.b();
            H("import wallet: requesting proof challenge");
            g3.a(this.f42718a, null, new q(this, b10, u10Var, secretPhraseToAnchorPublicKey, 2), null, null, new s(this, u10Var, secretPhraseToPublicKey, b10), z10, z11, new cg.u0(new l(b10, 2), 2));
        } catch (Exception unused2) {
            u10Var.a("INVALID_PHRASE");
        }
    }

    public final void E() {
        j0 j0Var = this.f42729n;
        if (j0Var != null) {
            j0Var.g();
        }
        if (this.A >= 0) {
            return;
        }
        Y();
    }

    public final boolean F() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f42722f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.f42721e instanceof TL_wallet.TL_walletState) && this.f42719b != null && this.f42720c != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        o0 o0Var;
        boolean z10;
        if (!(this.f42721e instanceof TL_wallet.TL_walletState) || (o0Var = this.f42720c) == null) {
            return false;
        }
        synchronized (o0.f42982f) {
            try {
                try {
                    z10 = o0Var.r().f33202c;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
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
        if (this.f42728m && !az.f21661s.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void L() {
        hs.f(this.f42718a).k(hs.f23200a4, this);
    }

    public final void M(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k0.M(org.json.JSONObject):void");
    }

    public final void N() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.f42721e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        o0 o0Var = this.f42720c;
        if (o0Var != null && !TextUtils.equals(o0Var.f42987c, str)) {
            if (str == null) {
                H("received empty state, leaving wallet storage of " + this.f42720c.f42987c);
            } else {
                StringBuilder u10 = a1.g.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.f42720c.f42987c);
                H(u10.toString());
            }
            this.f42720c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f42720c == null) {
            H("setting up wallet storage of " + str);
            this.f42720c = new o0(this.f42718a, org.telegram.messenger.t0.f25457b, str);
            H("storage public keys = " + this.f42720c.m().length);
        }
        c0 c0Var = this.f42730o;
        if (c0Var != null && !TextUtils.equals(c0Var.f42363e, str)) {
            c0Var.f42363e = str;
            c0Var.c();
        }
        if (this.f42719b != null && !TextUtils.equals(this.d, str)) {
            this.f42719b.close();
            this.f42719b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f42719b == null || !TextUtils.equals(this.d, str))) {
            if (this.f42719b != null) {
                H("closing wallet-engine of " + this.d);
                this.f42719b.close();
                this.f42719b = null;
            }
            H("creating wallet-engine for " + str);
            try {
                int i3 = this.f42718a;
                this.d = str;
                this.f42719b = new WalletEngine2(i3, str, bArr);
            } catch (Exception e10) {
                k("failed to create engine!", e10);
                this.d = null;
            }
        }
        int i10 = 0;
        if ((this.f42721e instanceof TL_wallet.TL_walletState) && this.f42719b != null) {
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
        if ((this.f42721e instanceof TL_wallet.TL_walletState) && this.f42719b != null && this.f42722f != null) {
            ArrayList arrayList2 = this.f42737w;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.g0.h3(runnable2);
                }
            }
            this.f42737w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            W();
        }
        S();
    }

    public final void O(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && g0(str) != null) {
            ArrayList arrayList = this.f42731p;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
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
        this.f42722f = tL_updateWalletGaslessInfo;
        N();
        L();
    }

    public final void Q(TL_update.TL_updateWalletState tL_updateWalletState) {
        l0(tL_updateWalletState.state);
    }

    public final void R() {
        f0();
        this.f42731p.clear();
        ArrayList arrayList = this.f42733r;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            h0 h0Var = ((e0) obj).f42449b;
            if (h0Var != null) {
                h0Var.close();
            }
        }
        arrayList.clear();
        j0 j0Var = this.f42729n;
        if (j0Var != null) {
            j0Var.a();
            j0Var.f42680b.clear();
            j0Var.d.clear();
            j0Var.f42682e.clear();
            j0Var.f42683f.clear();
            j0Var.f42684g = "";
            j0Var.h = false;
            j0Var.k();
            this.f42729n.k();
            this.f42729n.i();
        }
        S();
        this.f42722f = null;
        X();
    }

    public final void S() {
        boolean z10;
        boolean z11;
        if (!TextUtils.equals(this.f42736u, t())) {
            f0();
            this.f42736u = t();
        }
        boolean G = G();
        int i3 = this.f42718a;
        if (G && !TextUtils.isEmpty(t())) {
            HashMap hashMap = this.f42735t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((m0) hashMap.get(wallettransaction)).f42810b, wallettransaction.messageHash)) {
                    ((m0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.f42731p;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    m0 m0Var = new m0(i3, str, new na1(2, this, wallettransaction2));
                    hashMap.put(wallettransaction2, m0Var);
                    if (!m0Var.d && !TextUtils.isEmpty(str)) {
                        m0Var.d = true;
                        m0Var.f42813f = 0;
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
        x0 x0Var = this.f42734s;
        if (x0Var != null && x0Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && x0Var != null && !TextUtils.equals(x0Var.f43371b, t()))) {
            if (z10) {
                x0 x0Var2 = this.f42734s;
                if (x0Var2 != null && !TextUtils.equals(x0Var2.f43371b, t())) {
                    this.f42734s.h();
                    this.f42734s = null;
                }
                if (this.f42734s == null) {
                    this.f42734s = new x0(i3, t(), this);
                }
                x0 x0Var3 = this.f42734s;
                boolean z12 = x0Var3.d;
                if (!z12) {
                    String str2 = x0Var3.f43371b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        x0Var3.d("starting; address=" + str2);
                        x0Var3.d = true;
                        x0Var3.f43377j = 0;
                        x0Var3.e();
                        return;
                    }
                    x0Var3.d("start ignored: running=" + x0Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            x0 x0Var4 = this.f42734s;
            if (x0Var4 != null) {
                x0Var4.h();
            }
            org.telegram.messenger.g0.r(this.F);
        }
    }

    public final void U(h0 h0Var, boolean z10, n10 n10Var) {
        h0 b10 = h0Var.b();
        H("requesting proof challenge");
        ConnectionsManager.getInstance(this.f42718a).sendRequestTyped(new TL_wallet.getProofChallenge(), new c3.b(1), new v(this, b10, n10Var, z10, 0));
    }

    public final void W() {
        int i3;
        this.I = t();
        ArrayList n4 = o0.n(org.telegram.messenger.t0.f25457b, h10.i(this.f42718a).e());
        n4.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            hashMap.put(g0Var.f42556a, g0Var);
        }
        this.G.clear();
        int size2 = n4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = n4.get(i11);
            i11++;
            String str = (String) obj2;
            g0 g0Var2 = (g0) hashMap.get(str);
            if (g0Var2 == null) {
                g0Var2 = new g0(new o0(this.f42718a, org.telegram.messenger.t0.f25457b, str));
            }
            o0 o0Var = g0Var2.f42560f;
            synchronized (o0.f42982f) {
                try {
                    try {
                        i3 = o0Var.r().f33201b;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        i3 = 0;
                    }
                } finally {
                }
            }
            g0Var2.f42557b = i3;
            this.G.add(g0Var2);
            u(str, null);
            k0((b0) this.N.get(str));
        }
        Collections.sort(this.G, new d80(23));
    }

    public final void X() {
        H("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.f42718a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new c3.b(1), new i(this, 2));
    }

    public final void Y() {
        H("requesting state");
        this.A = ConnectionsManager.getInstance(this.f42718a).sendRequestTyped(new TL_wallet.getState(), new c3.b(1), new i(this, 1));
    }

    public final void Z(n10 n10Var, String str) {
        if (str == null) {
            n10Var.a(null, null);
            return;
        }
        HashMap hashMap = this.M;
        if (hashMap.containsKey(str)) {
            n10Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f42718a).sendRequestTyped(getuseraddresses, new c3.b(1), new j((Object) this, (Object) str, (Object) n10Var, 0));
    }

    public final void a0(TLRPC.User user, n10 n10Var) {
        if (user == null) {
            n10Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f27150id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            n10Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f27150id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f27262id;
        int i3 = this.f42718a;
        arrayList.add(hp.s1(i3).q1(user));
        ConnectionsManager.getInstance(i3).sendRequestTyped(getuseraddresses, new c3.b(1), new j(this, (Object) n10Var, (Object) user, 2));
    }

    public final void b0(String str, u10 u10Var) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.w0.R0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i3 = this.f42718a;
        ConnectionsManager.getInstance(i3).sendRequestTyped(performapirequest, new c3.b(1), new ai.q4(this, str, u10Var), hp.s1(i3).O3, 0);
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

    public final void d0(TLRPC.User user, String str, long j10, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, u10 u10Var, u10 u10Var2, b2 b2Var) {
        String t10 = t();
        H("send to " + str + ", amount " + j10 + ", when ready...");
        m0(new o(this, str, u10Var, nftitem, t10, str2, bArr, j10, b2Var, user, str3, u10Var2, 0));
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.f42721e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            o0 o0Var = this.f42720c;
            if (o0Var == null || !o0Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        o0 o0Var;
        TL_wallet.WalletState walletState = this.f42721e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((o0Var = this.f42720c) != null && o0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void f0() {
        HashMap hashMap = this.f42735t;
        for (m0 m0Var : hashMap.values()) {
            m0Var.b();
        }
        hashMap.clear();
    }

    public final l i(String str, long j10, String str2, byte[] bArr, n10 n10Var) {
        y yVar = new y(this, str, j10, str2, bArr, n10Var);
        m0(yVar);
        return new l(yVar, 0);
    }

    public final void k0(b0 b0Var) {
        if (b0Var != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                g0 g0Var = (g0) obj;
                if (TextUtils.equals(g0Var.f42556a, b0Var.f42211a)) {
                    g0Var.f42558c = b0Var.f42212b;
                    boolean z10 = true;
                    g0Var.d = !b0Var.f42214e;
                    byte[] bArr = b0Var.f42213c;
                    if (bArr == null || bArr.length <= 0 || g0Var.f42560f.f(bArr)) {
                        z10 = false;
                    }
                    g0Var.f42559e = z10;
                }
            }
        }
    }

    public final void l0(TL_wallet.WalletState walletState) {
        boolean z10;
        j0 j0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.f42721e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.f42721e = walletState;
                    N();
                    L();
                    if (!z10 && (j0Var = this.f42729n) != null) {
                        j0Var.g();
                        return;
                    }
                }
            }
            z10 = false;
            this.f42721e = walletState;
            N();
            L();
            if (!z10) {
            }
        }
    }

    public final CharSequence m(long j10, boolean z10) {
        BigDecimal scale;
        int i3;
        char charAt;
        String C;
        f fVar = this.h;
        String g7 = fVar.g();
        TL_wallet.currencyRate j11 = fVar.j();
        String str = "";
        if (j11 != null) {
            String str2 = j11.symbol;
            String str3 = j11.thousandsSeparator;
            String str4 = j11.decimalSeparator;
            boolean z11 = j11.symbolLeft;
            boolean z12 = j11.spaceBetween;
            boolean z13 = j11.dropZeros;
            int i10 = j11.exp;
            double d = j11.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d10 = d * ((org.telegram.messenger.i0) hp.s1(this.f42718a).f23167x7.f24665l.f14429b).f23413a;
                boolean z14 = false;
                int max = Math.max(0, Math.min(i10, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(BigDecimal.valueOf(d10)).movePointLeft(9);
                if (z10 && movePointLeft.signum() != 0) {
                    BigDecimal round = movePointLeft.round(new MathContext(3, RoundingMode.HALF_UP));
                    if (round.signum() == 0) {
                        scale = new BigDecimal(BigInteger.ZERO, 0);
                    } else {
                        scale = round.stripTrailingZeros();
                    }
                    i3 = Math.max(max, Math.min(20, Math.max(0, scale.scale())));
                } else {
                    scale = movePointLeft.setScale(max, RoundingMode.HALF_UP);
                    i3 = max;
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
                decimalFormat.setMaximumFractionDigits(i3);
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                if (scale.signum() < 0) {
                    z14 = true;
                }
                String format = decimalFormat.format(scale.abs());
                if (!TextUtils.isEmpty(str2)) {
                    g7 = str2;
                }
                if (z12) {
                    str = " ";
                }
                if (z11) {
                    C = a1.g.C(g7, str, format);
                } else {
                    C = a1.g.C(format, str, g7);
                }
                if (z14) {
                    C = t4.c.f("-", C);
                }
                int indexOf = C.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C);
                    spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
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
        TL_wallet.WalletState walletState = this.f42721e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final b0 u(final String str, p pVar) {
        HashMap hashMap = this.N;
        b0 b0Var = (b0) hashMap.get(str);
        if (b0Var != null && !b0Var.f42214e) {
            if (pVar != null) {
                b0Var.f42215f.add(pVar);
            }
            return null;
        }
        int i3 = this.f42718a;
        if (b0Var != null && b0Var.f42214e && ConnectionsManager.getInstance(i3).getCurrentTime() < b0Var.d + 300) {
            if (pVar != null) {
                pVar.a(b0Var);
            }
            return b0Var;
        }
        final ?? obj = new Object();
        obj.f42212b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f42215f = arrayList;
        obj.f42211a = str;
        obj.d = ConnectionsManager.getInstance(i3).getCurrentTime();
        if (pVar != null) {
            arrayList.add(pVar);
        }
        hashMap.put(str, obj);
        Utilities.B(new g(this, str, (Object) obj, 1), new u10(this) {
            public final k0 f42903b;

            {
                this.f42903b = this;
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
                        k0 k0Var = this.f42903b;
                        int i10 = k0Var.f42718a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new c3.b(1), new q(k0Var, obj, str2, runnable, 0), hp.s1(i10).O3, 0);
                        return;
                    default:
                        k0 k0Var2 = this.f42903b;
                        b0 b0Var2 = obj;
                        String str3 = str;
                        k0Var2.b0(str3, new p(k0Var2, b0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new u10(this) {
            public final k0 f42903b;

            {
                this.f42903b = this;
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
                        k0 k0Var = this.f42903b;
                        int i10 = k0Var.f42718a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new c3.b(1), new q(k0Var, obj, str2, runnable, 0), hp.s1(i10).O3, 0);
                        return;
                    default:
                        k0 k0Var2 = this.f42903b;
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
        TL_wallet.WalletState walletState = this.f42721e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final byte[] y() {
        TL_wallet.WalletState walletState = this.f42721e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void z(n10 n10Var, boolean z10, boolean z11) {
        H("getSecretPhrase: whenReady...");
        m0(new g2.p0(this, n10Var, z10, z11, 5));
    }
}
