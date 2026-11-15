package org.telegram.ui.Wallet;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.LruCache;
import di.mb;
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
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qv0;
import org.telegram.ui.xi0;
public final class l0 {
    public static volatile l0[] O = new l0[4];
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
    public final int f44078a;
    public WalletEngine2 f44079b;
    public p0 f44080c;
    public String d;
    public TL_wallet.WalletState f44081e;
    public TL_update.TL_updateWalletGaslessInfo f44082f;
    public final d2 f44083g;
    public final f h;
    public Boolean f44084i;
    public String f44085j;
    public long f44086k;
    public boolean f44087l;
    public boolean f44088m;
    public k0 f44089n;
    public d0 f44090o;
    public y0 f44094s;
    public String f44096u;
    public String f44098x;
    public int f44099y;
    public final ArrayList f44091p = new ArrayList();
    public final HashMap f44092q = new HashMap();
    public final ArrayList f44093r = new ArrayList();
    public final HashMap f44095t = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ArrayList f44097w = new ArrayList();
    public final h f44100z = new Runnable(this) {
        public final l0 f43889b;

        {
            this.f43889b = this;
        }

        @Override
        public final void run() {
            d0 d0Var;
            k0 k0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    l0 l0Var = this.f43889b;
                    if (!TextUtils.isEmpty(l0Var.f44098x) && (d0Var = l0Var.f44090o) != null && d0Var.d(l0Var.f44098x) && (k0Var = l0Var.f44089n) != null) {
                        ArrayList arrayList = k0Var.f44043b;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && l0.b(nftitem.address, l0Var.f44098x)) {
                                return;
                            }
                        }
                    }
                    if (l0Var.f44090o == null) {
                        l0Var.f44090o = new d0(l0Var);
                    }
                    d0 d0Var2 = l0Var.f44090o;
                    if (!d0Var2.f43719j) {
                        d0Var2.b();
                        d0Var2.f(true);
                    }
                    l0Var.B().g();
                    l0Var.E();
                    int i10 = l0Var.f44099y;
                    long[] jArr = l0.P;
                    if (i10 < 7) {
                        h hVar = l0Var.f44100z;
                        l0Var.f44099y = i10 + 1;
                        org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                        return;
                    }
                    return;
                case 1:
                    l0 l0Var2 = this.f43889b;
                    y0 y0Var = l0Var2.f44094s;
                    if (y0Var != null && y0Var.d) {
                        l0Var2.E();
                        return;
                    }
                    return;
                default:
                    l0 l0Var3 = this.f43889b;
                    l0Var3.W();
                    l0Var3.L();
                    return;
            }
        }
    };
    public int A = -1;
    public int B = -1;
    public int D = 0;
    public final HashSet E = new HashSet();
    public final h F = new Runnable(this) {
        public final l0 f43889b;

        {
            this.f43889b = this;
        }

        @Override
        public final void run() {
            d0 d0Var;
            k0 k0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    l0 l0Var = this.f43889b;
                    if (!TextUtils.isEmpty(l0Var.f44098x) && (d0Var = l0Var.f44090o) != null && d0Var.d(l0Var.f44098x) && (k0Var = l0Var.f44089n) != null) {
                        ArrayList arrayList = k0Var.f44043b;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && l0.b(nftitem.address, l0Var.f44098x)) {
                                return;
                            }
                        }
                    }
                    if (l0Var.f44090o == null) {
                        l0Var.f44090o = new d0(l0Var);
                    }
                    d0 d0Var2 = l0Var.f44090o;
                    if (!d0Var2.f43719j) {
                        d0Var2.b();
                        d0Var2.f(true);
                    }
                    l0Var.B().g();
                    l0Var.E();
                    int i10 = l0Var.f44099y;
                    long[] jArr = l0.P;
                    if (i10 < 7) {
                        h hVar = l0Var.f44100z;
                        l0Var.f44099y = i10 + 1;
                        org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                        return;
                    }
                    return;
                case 1:
                    l0 l0Var2 = this.f43889b;
                    y0 y0Var = l0Var2.f44094s;
                    if (y0Var != null && y0Var.d) {
                        l0Var2.E();
                        return;
                    }
                    return;
                default:
                    l0 l0Var3 = this.f43889b;
                    l0Var3.W();
                    l0Var3.L();
                    return;
            }
        }
    };

    public l0(int i7) {
        boolean z10 = false;
        this.C = -1;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        this.J = new Runnable(this) {
            public final l0 f43889b;

            {
                this.f43889b = this;
            }

            @Override
            public final void run() {
                d0 d0Var;
                k0 k0Var;
                TL_wallet.nftItem nftitem;
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f43889b;
                        if (!TextUtils.isEmpty(l0Var.f44098x) && (d0Var = l0Var.f44090o) != null && d0Var.d(l0Var.f44098x) && (k0Var = l0Var.f44089n) != null) {
                            ArrayList arrayList2 = k0Var.f44043b;
                            int size = arrayList2.size();
                            int i72 = 0;
                            while (i72 < size) {
                                Object obj = arrayList2.get(i72);
                                i72++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && l0.b(nftitem.address, l0Var.f44098x)) {
                                    return;
                                }
                            }
                        }
                        if (l0Var.f44090o == null) {
                            l0Var.f44090o = new d0(l0Var);
                        }
                        d0 d0Var2 = l0Var.f44090o;
                        if (!d0Var2.f43719j) {
                            d0Var2.b();
                            d0Var2.f(true);
                        }
                        l0Var.B().g();
                        l0Var.E();
                        int i10 = l0Var.f44099y;
                        long[] jArr = l0.P;
                        if (i10 < 7) {
                            h hVar = l0Var.f44100z;
                            l0Var.f44099y = i10 + 1;
                            org.telegram.messenger.g0.i3(hVar, jArr[i10]);
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var2 = this.f43889b;
                        y0 y0Var = l0Var2.f44094s;
                        if (y0Var != null && y0Var.d) {
                            l0Var2.E();
                            return;
                        }
                        return;
                    default:
                        l0 l0Var3 = this.f43889b;
                        l0Var3.W();
                        l0Var3.L();
                        return;
                }
            }
        };
        this.K = new HashMap();
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = new HashMap();
        this.f44078a = i7;
        try {
            this.f44088m = w().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e10) {
            k("failed to load prefs", e10);
        }
        this.h = new f(this);
        Y();
        X();
        H("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.f44078a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new d3.b(1), new i(this, 0));
        this.f44083g = new d2(this);
        h hVar = this.J;
        Object obj = p0.f44289f;
        synchronized (p0.class) {
            try {
                Iterator it = p0.f44291i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        p0.f44291i.remove(weakReference);
                    } else if (runnable == hVar) {
                        z10 = true;
                    }
                }
                if (hVar != null && !z10) {
                    p0.f44291i.add(new WeakReference(hVar));
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

    public static void D(IdentityHashMap identityHashMap, HashMap hashMap, int i7, TL_wallet.walletTransaction wallettransaction, boolean z10) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z10) {
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
            if (z10) {
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

    public static boolean I(gj gjVar, TL_wallet.walletTransaction wallettransaction) {
        if (gjVar != null && gjVar.f23817k != null && wallettransaction != null && gjVar.P3()) {
            TLRPC.Message message = gjVar.f23817k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j3 = wallettransaction.random_id;
                if (j3 == 0 || message.random_id != j3) {
                    if (wallettransaction.localMessageId == 0 || gjVar.e1() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f28314id) && TextUtils.equals(wallettransaction.f28314id, tL_messageActionGramTransfer.transaction_id)) {
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
            int i7 = 0;
            for (byte b10 : bArr) {
                if (i0.e(b10)) {
                    if (i7 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    if (z10) {
                        if (i7 != 215) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 32;
                            i7 = i10;
                            z10 = false;
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
            wallettransactionpeeraddress.user_id = user.f28200id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
    }

    public static java.lang.String g0(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l0.g0(java.lang.String):java.lang.String");
    }

    public static c2 h(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
            str = V(stargiftdepositpayload.nft_address, true);
        } else {
            str = stargiftdepositpayload.nft_address;
        }
        return new c2(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static ArrayList h0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.f28314id)) {
                arrayList.add("i" + wallettransaction.f28314id);
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
        if ((TextUtils.isEmpty(wallettransaction.f28314id) || !TextUtils.equals(wallettransaction.f28314id, wallettransaction2.f28314id)) && !c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !c0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
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

    public static SpannableStringBuilder n(long j3, boolean z10) {
        return l("GramCapital", o(j3, z10), 2131749519);
    }

    public static String o(long j3, boolean z10) {
        if ((j3 > -10000000 && j3 < 10000000) || z10) {
            return mb.P0(j3);
        }
        if (R == null) {
            R = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return R.format(j3 / 1.0E9d);
    }

    public static String p(long j3, boolean z10) {
        boolean z11;
        int i7;
        BigDecimal stripTrailingZeros;
        if (j3 > -1000000000 && j3 < 1000000000) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 && z11) {
            return o(j3, true);
        }
        if (z10) {
            i7 = 4;
        } else if (z11) {
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

    public static SpannableStringBuilder s(long j3, boolean z10) {
        return l("Grams", o(j3, z10), 2131749507);
    }

    public static Context w() {
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null && T.getContext() != null) {
            return T.getContext();
        }
        return org.telegram.messenger.t0.f26600b;
    }

    public static l0 x(int i7) {
        l0 l0Var;
        l0 l0Var2 = O[i7];
        if (l0Var2 == null) {
            synchronized (l0.class) {
                try {
                    l0Var = O[i7];
                    if (l0Var == null) {
                        l0[] l0VarArr = O;
                        l0 l0Var3 = new l0(i7);
                        l0VarArr[i7] = l0Var3;
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

    public final k0 B() {
        if (this.f44089n == null) {
            this.f44089n = new k0(this);
        }
        return this.f44089n;
    }

    public final void C(boolean z10, boolean z11, i0 i0Var, z10 z10Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(i0Var)) {
                z10Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(i0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(i0Var);
            i0 b10 = i0Var.b();
            H("import wallet: requesting proof challenge");
            f3.a(this.f44078a, null, new q(this, b10, z10Var, secretPhraseToAnchorPublicKey, 2), null, null, new t(this, z10Var, secretPhraseToPublicKey, b10), z10, z11, new bg.u0(new l(b10, 2), 2));
        } catch (Exception unused2) {
            z10Var.a("INVALID_PHRASE");
        }
    }

    public final void E() {
        k0 k0Var = this.f44089n;
        if (k0Var != null) {
            k0Var.g();
        }
        if (this.A >= 0) {
            return;
        }
        Y();
    }

    public final boolean F() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f44082f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.f44081e instanceof TL_wallet.TL_walletState) && this.f44079b != null && this.f44080c != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        p0 p0Var;
        boolean z10;
        if (!(this.f44081e instanceof TL_wallet.TL_walletState) || (p0Var = this.f44080c) == null) {
            return false;
        }
        synchronized (p0.f44289f) {
            try {
                try {
                    z10 = p0Var.r().f35366c;
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
        if (this.f44088m && !gz.f23978s.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void L() {
        ns.f(this.f44078a).k(ns.f25467a4, this);
    }

    public final void M(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l0.M(org.json.JSONObject):void");
    }

    public final void N() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.f44081e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        p0 p0Var = this.f44080c;
        if (p0Var != null && !TextUtils.equals(p0Var.f44294c, str)) {
            if (str == null) {
                H("received empty state, leaving wallet storage of " + this.f44080c.f44294c);
            } else {
                StringBuilder u10 = a8.p0.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.f44080c.f44294c);
                H(u10.toString());
            }
            this.f44080c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f44080c == null) {
            H("setting up wallet storage of " + str);
            this.f44080c = new p0(this.f44078a, org.telegram.messenger.t0.f26600b, str);
            H("storage public keys = " + this.f44080c.m().length);
        }
        d0 d0Var = this.f44090o;
        if (d0Var != null && !TextUtils.equals(d0Var.f43715e, str)) {
            d0Var.f43715e = str;
            d0Var.c();
        }
        if (this.f44079b != null && !TextUtils.equals(this.d, str)) {
            this.f44079b.close();
            this.f44079b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f44079b == null || !TextUtils.equals(this.d, str))) {
            if (this.f44079b != null) {
                H("closing wallet-engine of " + this.d);
                this.f44079b.close();
                this.f44079b = null;
            }
            H("creating wallet-engine for " + str);
            try {
                int i7 = this.f44078a;
                this.d = str;
                this.f44079b = new WalletEngine2(i7, str, bArr);
            } catch (Exception e10) {
                k("failed to create engine!", e10);
                this.d = null;
            }
        }
        int i10 = 0;
        if ((this.f44081e instanceof TL_wallet.TL_walletState) && this.f44079b != null) {
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
        if ((this.f44081e instanceof TL_wallet.TL_walletState) && this.f44079b != null && this.f44082f != null) {
            ArrayList arrayList2 = this.f44097w;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.g0.h3(runnable2);
                }
            }
            this.f44097w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            W();
        }
        S();
    }

    public final void O(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && g0(str) != null) {
            ArrayList arrayList = this.f44091p;
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
        this.f44082f = tL_updateWalletGaslessInfo;
        N();
        L();
    }

    public final void Q(TL_update.TL_updateWalletState tL_updateWalletState) {
        l0(tL_updateWalletState.state);
    }

    public final void R() {
        f0();
        this.f44091p.clear();
        ArrayList arrayList = this.f44093r;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            i0 i0Var = ((f0) obj).f43816b;
            if (i0Var != null) {
                i0Var.close();
            }
        }
        arrayList.clear();
        k0 k0Var = this.f44089n;
        if (k0Var != null) {
            k0Var.a();
            k0Var.f44043b.clear();
            k0Var.d.clear();
            k0Var.f44045e.clear();
            k0Var.f44046f.clear();
            k0Var.f44047g = "";
            k0Var.h = false;
            k0Var.k();
            this.f44089n.k();
            this.f44089n.i();
        }
        S();
        this.f44082f = null;
        X();
    }

    public final void S() {
        boolean z10;
        boolean z11;
        if (!TextUtils.equals(this.f44096u, t())) {
            f0();
            this.f44096u = t();
        }
        boolean G = G();
        int i7 = this.f44078a;
        if (G && !TextUtils.isEmpty(t())) {
            HashMap hashMap = this.f44095t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((n0) hashMap.get(wallettransaction)).f44169b, wallettransaction.messageHash)) {
                    ((n0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.f44091p;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    n0 n0Var = new n0(i7, str, new xi0(28, this, wallettransaction2));
                    hashMap.put(wallettransaction2, n0Var);
                    if (!n0Var.d && !TextUtils.isEmpty(str)) {
                        n0Var.d = true;
                        n0Var.f44172f = 0;
                        n0Var.a();
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
        y0 y0Var = this.f44094s;
        if (y0Var != null && y0Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && y0Var != null && !TextUtils.equals(y0Var.f44692b, t()))) {
            if (z10) {
                y0 y0Var2 = this.f44094s;
                if (y0Var2 != null && !TextUtils.equals(y0Var2.f44692b, t())) {
                    this.f44094s.h();
                    this.f44094s = null;
                }
                if (this.f44094s == null) {
                    this.f44094s = new y0(i7, t(), this);
                }
                y0 y0Var3 = this.f44094s;
                boolean z12 = y0Var3.d;
                if (!z12) {
                    String str2 = y0Var3.f44692b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        y0Var3.d("starting; address=" + str2);
                        y0Var3.d = true;
                        y0Var3.f44698j = 0;
                        y0Var3.e();
                        return;
                    }
                    y0Var3.d("start ignored: running=" + y0Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            y0 y0Var4 = this.f44094s;
            if (y0Var4 != null) {
                y0Var4.h();
            }
            org.telegram.messenger.g0.r(this.F);
        }
    }

    public final void U(i0 i0Var, boolean z10, s10 s10Var) {
        i0 b10 = i0Var.b();
        H("requesting proof challenge");
        ConnectionsManager.getInstance(this.f44078a).sendRequestTyped(new TL_wallet.getProofChallenge(), new d3.b(1), new w(this, b10, s10Var, z10, 0));
    }

    public final void W() {
        int i7;
        this.I = t();
        ArrayList n10 = p0.n(org.telegram.messenger.t0.f26600b, m10.i(this.f44078a).e());
        n10.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            hashMap.put(h0Var.f43890a, h0Var);
        }
        this.G.clear();
        int size2 = n10.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = n10.get(i11);
            i11++;
            String str = (String) obj2;
            h0 h0Var2 = (h0) hashMap.get(str);
            if (h0Var2 == null) {
                h0Var2 = new h0(new p0(this.f44078a, org.telegram.messenger.t0.f26600b, str));
            }
            p0 p0Var = h0Var2.f43894f;
            synchronized (p0.f44289f) {
                try {
                    try {
                        i7 = p0Var.r().f35365b;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        i7 = 0;
                    }
                } finally {
                }
            }
            h0Var2.f43891b = i7;
            this.G.add(h0Var2);
            u(str, null);
            k0((c0) this.N.get(str));
        }
        Collections.sort(this.G, new qv0(5));
    }

    public final void X() {
        H("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.f44078a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new d3.b(1), new i(this, 2));
    }

    public final void Y() {
        H("requesting state");
        this.A = ConnectionsManager.getInstance(this.f44078a).sendRequestTyped(new TL_wallet.getState(), new d3.b(1), new i(this, 1));
    }

    public final void Z(s10 s10Var, String str) {
        if (str == null) {
            s10Var.a(null, null);
            return;
        }
        HashMap hashMap = this.M;
        if (hashMap.containsKey(str)) {
            s10Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f44078a).sendRequestTyped(getuseraddresses, new d3.b(1), new j((Object) this, (Object) str, (Object) s10Var, 0));
    }

    public final void a0(TLRPC.User user, s10 s10Var) {
        if (user == null) {
            s10Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f28200id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            s10Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f28200id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f28312id;
        int i7 = this.f44078a;
        arrayList.add(np.s1(i7).q1(user));
        ConnectionsManager.getInstance(i7).sendRequestTyped(getuseraddresses, new d3.b(1), new j(this, (Object) s10Var, (Object) user, 2));
    }

    public final void b0(String str, z10 z10Var) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.v0.R0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i7 = this.f44078a;
        ConnectionsManager.getInstance(i7).sendRequestTyped(performapirequest, new d3.b(1), new bi.e4(this, str, z10Var), np.s1(i7).O3, 0);
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
            S();
        }
    }

    public final void d0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, z10 z10Var, z10 z10Var2, c2 c2Var) {
        String t6 = t();
        H("send to " + str + ", amount " + j3 + ", when ready...");
        m0(new o(this, str, z10Var, nftitem, t6, str2, bArr, j3, c2Var, user, str3, z10Var2, 0));
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.f44081e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            p0 p0Var = this.f44080c;
            if (p0Var == null || !p0Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        p0 p0Var;
        TL_wallet.WalletState walletState = this.f44081e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((p0Var = this.f44080c) != null && p0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void f0() {
        HashMap hashMap = this.f44095t;
        for (n0 n0Var : hashMap.values()) {
            n0Var.b();
        }
        hashMap.clear();
    }

    public final l i(String str, long j3, String str2, byte[] bArr, s10 s10Var) {
        z zVar = new z(this, str, j3, str2, bArr, s10Var);
        m0(zVar);
        return new l(zVar, 0);
    }

    public final void k0(c0 c0Var) {
        if (c0Var != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                h0 h0Var = (h0) obj;
                if (TextUtils.equals(h0Var.f43890a, c0Var.f43547a)) {
                    h0Var.f43892c = c0Var.f43548b;
                    boolean z10 = true;
                    h0Var.d = !c0Var.f43550e;
                    byte[] bArr = c0Var.f43549c;
                    if (bArr == null || bArr.length <= 0 || h0Var.f43894f.f(bArr)) {
                        z10 = false;
                    }
                    h0Var.f43893e = z10;
                }
            }
        }
    }

    public final void l0(TL_wallet.WalletState walletState) {
        boolean z10;
        k0 k0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.f44081e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.f44081e = walletState;
                    N();
                    L();
                    if (!z10 && (k0Var = this.f44089n) != null) {
                        k0Var.g();
                        return;
                    }
                }
            }
            z10 = false;
            this.f44081e = walletState;
            N();
            L();
            if (!z10) {
            }
        }
    }

    public final CharSequence m(long j3, boolean z10) {
        BigDecimal scale;
        int i7;
        char charAt;
        String E;
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
            int i10 = j10.exp;
            double d = j10.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d2 = d * ((org.telegram.messenger.i0) np.s1(this.f44078a).f25448y7.f25855l.f13134b).f24257a;
                boolean z14 = false;
                int max = Math.max(0, Math.min(i10, 20));
                BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(BigDecimal.valueOf(d2)).movePointLeft(9);
                if (z10 && movePointLeft.signum() != 0) {
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
                decimalFormat.setMaximumFractionDigits(i7);
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
                    E = a8.p0.E(g10, str, format);
                } else {
                    E = a8.p0.E(format, str, g10);
                }
                if (z14) {
                    E = r.b.k("-", E);
                }
                int indexOf = E.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(E);
                    spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return E;
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
        TL_wallet.WalletState walletState = this.f44081e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final c0 u(final String str, p pVar) {
        HashMap hashMap = this.N;
        c0 c0Var = (c0) hashMap.get(str);
        if (c0Var != null && !c0Var.f43550e) {
            if (pVar != null) {
                c0Var.f43551f.add(pVar);
            }
            return null;
        }
        int i7 = this.f44078a;
        if (c0Var != null && c0Var.f43550e && ConnectionsManager.getInstance(i7).getCurrentTime() < c0Var.d + 300) {
            if (pVar != null) {
                pVar.a(c0Var);
            }
            return c0Var;
        }
        final ?? obj = new Object();
        obj.f43548b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f43551f = arrayList;
        obj.f43547a = str;
        obj.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (pVar != null) {
            arrayList.add(pVar);
        }
        hashMap.put(str, obj);
        Utilities.B(new g(this, str, (Object) obj, 1), new z10(this) {
            public final l0 f44165b;

            {
                this.f44165b = this;
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
                        l0 l0Var = this.f44165b;
                        int i10 = l0Var.f44078a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new q(l0Var, obj, str2, runnable, 0), np.s1(i10).O3, 0);
                        return;
                    default:
                        l0 l0Var2 = this.f44165b;
                        c0 c0Var2 = obj;
                        String str3 = str;
                        l0Var2.b0(str3, new p(l0Var2, c0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new z10(this) {
            public final l0 f44165b;

            {
                this.f44165b = this;
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
                        l0 l0Var = this.f44165b;
                        int i10 = l0Var.f44078a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new q(l0Var, obj, str2, runnable, 0), np.s1(i10).O3, 0);
                        return;
                    default:
                        l0 l0Var2 = this.f44165b;
                        c0 c0Var2 = obj;
                        String str3 = str;
                        l0Var2.b0(str3, new p(l0Var2, c0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        });
        return null;
    }

    public final long v() {
        TL_wallet.WalletState walletState = this.f44081e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final byte[] y() {
        TL_wallet.WalletState walletState = this.f44081e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void z(s10 s10Var, boolean z10, boolean z11) {
        H("getSecretPhrase: whenReady...");
        m0(new h2.n0(this, s10Var, z10, z11, 5));
    }
}
