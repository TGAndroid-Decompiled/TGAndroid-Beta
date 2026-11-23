package org.telegram.ui.Wallet;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.LruCache;
import di.pb;
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
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.qw0;
public final class u0 {
    public static volatile u0[] R = new u0[4];
    public static final long[] S = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache T = new LruCache(4096);
    public static DecimalFormat U;
    public int A;
    public int E;
    public final ArrayList J;
    public final List K;
    public String L;
    public final h M;
    public final HashMap N;
    public final HashMap O;
    public final HashMap P;
    public final HashMap Q;
    public final int f45127a;
    public WalletEngine2 f45128b;
    public z0 f45129c;
    public String d;
    public TL_wallet.WalletState f45130e;
    public TL_update.TL_updateWalletGaslessInfo f45131f;
    public final l2 f45132g;
    public final g h;
    public Boolean f45133i;
    public String f45134j;
    public long f45135k;
    public boolean f45136l;
    public boolean f45137m;
    public t0 f45138n;
    public l0 f45139o;
    public i1 f45144t;
    public String v;
    public String f45148y;
    public String f45149z;
    public final ArrayList f45140p = new ArrayList();
    public final HashMap f45141q = new HashMap();
    public final HashMap f45142r = new HashMap();
    public final ArrayList f45143s = new ArrayList();
    public final HashMap f45145u = new HashMap();
    public final ArrayList f45146w = new ArrayList();
    public final ArrayList f45147x = new ArrayList();
    public final h B = new Runnable(this) {
        public final u0 f44326b;

        {
            this.f44326b = this;
        }

        @Override
        public final void run() {
            l0 l0Var;
            switch (r2) {
                case 0:
                    u0 u0Var = this.f44326b;
                    u0Var.f0();
                    u0Var.T();
                    return;
                case 1:
                    u0 u0Var2 = this.f44326b;
                    if ((!TextUtils.isEmpty(u0Var2.f45148y) || !TextUtils.isEmpty(u0Var2.f45149z)) && (l0Var = u0Var2.f45139o) != null && u0Var2.f45138n != null) {
                        ArrayList arrayList = l0Var.f44505b;
                        int size = arrayList.size();
                        int i7 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = u0Var2.f45138n.f45086b;
                                    int size2 = arrayList2.size();
                                    while (i7 < size2) {
                                        Object obj2 = arrayList2.get(i7);
                                        i7++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    u0Var2.B().e();
                    u0Var2.H().g();
                    u0Var2.K();
                    int i11 = u0Var2.A;
                    long[] jArr = u0.S;
                    if (i11 < 7) {
                        h hVar = u0Var2.B;
                        u0Var2.A = i11 + 1;
                        org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 2:
                    u0 u0Var3 = this.f44326b;
                    i1 i1Var = u0Var3.f45144t;
                    if (i1Var != null && i1Var.d) {
                        u0Var3.K();
                        return;
                    }
                    return;
                default:
                    u0 u0Var4 = this.f44326b;
                    int i12 = u0Var4.f45127a;
                    l0 l0Var2 = u0Var4.f45139o;
                    if (l0Var2 != null) {
                        l0Var2.e();
                    }
                    di.y8.y(i12, false).O(k10.i(i12).e());
                    return;
            }
        }
    };
    public int C = -1;
    public int D = -1;
    public int F = 0;
    public final HashSet G = new HashSet();
    public final h H = new Runnable(this) {
        public final u0 f44326b;

        {
            this.f44326b = this;
        }

        @Override
        public final void run() {
            l0 l0Var;
            switch (r2) {
                case 0:
                    u0 u0Var = this.f44326b;
                    u0Var.f0();
                    u0Var.T();
                    return;
                case 1:
                    u0 u0Var2 = this.f44326b;
                    if ((!TextUtils.isEmpty(u0Var2.f45148y) || !TextUtils.isEmpty(u0Var2.f45149z)) && (l0Var = u0Var2.f45139o) != null && u0Var2.f45138n != null) {
                        ArrayList arrayList = l0Var.f44505b;
                        int size = arrayList.size();
                        int i7 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = u0Var2.f45138n.f45086b;
                                    int size2 = arrayList2.size();
                                    while (i7 < size2) {
                                        Object obj2 = arrayList2.get(i7);
                                        i7++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    u0Var2.B().e();
                    u0Var2.H().g();
                    u0Var2.K();
                    int i11 = u0Var2.A;
                    long[] jArr = u0.S;
                    if (i11 < 7) {
                        h hVar = u0Var2.B;
                        u0Var2.A = i11 + 1;
                        org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 2:
                    u0 u0Var3 = this.f44326b;
                    i1 i1Var = u0Var3.f45144t;
                    if (i1Var != null && i1Var.d) {
                        u0Var3.K();
                        return;
                    }
                    return;
                default:
                    u0 u0Var4 = this.f44326b;
                    int i12 = u0Var4.f45127a;
                    l0 l0Var2 = u0Var4.f45139o;
                    if (l0Var2 != null) {
                        l0Var2.e();
                    }
                    di.y8.y(i12, false).O(k10.i(i12).e());
                    return;
            }
        }
    };
    public final h I = new Runnable(this) {
        public final u0 f44326b;

        {
            this.f44326b = this;
        }

        @Override
        public final void run() {
            l0 l0Var;
            switch (r2) {
                case 0:
                    u0 u0Var = this.f44326b;
                    u0Var.f0();
                    u0Var.T();
                    return;
                case 1:
                    u0 u0Var2 = this.f44326b;
                    if ((!TextUtils.isEmpty(u0Var2.f45148y) || !TextUtils.isEmpty(u0Var2.f45149z)) && (l0Var = u0Var2.f45139o) != null && u0Var2.f45138n != null) {
                        ArrayList arrayList = l0Var.f44505b;
                        int size = arrayList.size();
                        int i7 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = u0Var2.f45138n.f45086b;
                                    int size2 = arrayList2.size();
                                    while (i7 < size2) {
                                        Object obj2 = arrayList2.get(i7);
                                        i7++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    u0Var2.B().e();
                    u0Var2.H().g();
                    u0Var2.K();
                    int i11 = u0Var2.A;
                    long[] jArr = u0.S;
                    if (i11 < 7) {
                        h hVar = u0Var2.B;
                        u0Var2.A = i11 + 1;
                        org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 2:
                    u0 u0Var3 = this.f44326b;
                    i1 i1Var = u0Var3.f45144t;
                    if (i1Var != null && i1Var.d) {
                        u0Var3.K();
                        return;
                    }
                    return;
                default:
                    u0 u0Var4 = this.f44326b;
                    int i12 = u0Var4.f45127a;
                    l0 l0Var2 = u0Var4.f45139o;
                    if (l0Var2 != null) {
                        l0Var2.e();
                    }
                    di.y8.y(i12, false).O(k10.i(i12).e());
                    return;
            }
        }
    };

    public u0(int i7) {
        this.E = -1;
        boolean z10 = false;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = DesugarCollections.unmodifiableList(arrayList);
        this.M = new Runnable(this) {
            public final u0 f44326b;

            {
                this.f44326b = this;
            }

            @Override
            public final void run() {
                l0 l0Var;
                switch (r2) {
                    case 0:
                        u0 u0Var = this.f44326b;
                        u0Var.f0();
                        u0Var.T();
                        return;
                    case 1:
                        u0 u0Var2 = this.f44326b;
                        if ((!TextUtils.isEmpty(u0Var2.f45148y) || !TextUtils.isEmpty(u0Var2.f45149z)) && (l0Var = u0Var2.f45139o) != null && u0Var2.f45138n != null) {
                            ArrayList arrayList2 = l0Var.f44505b;
                            int size = arrayList2.size();
                            int i72 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i10 < size) {
                                    Object obj = arrayList2.get(i10);
                                    i10++;
                                    if (u0Var2.O((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList22 = u0Var2.f45138n.f45086b;
                                        int size2 = arrayList22.size();
                                        while (i72 < size2) {
                                            Object obj2 = arrayList22.get(i72);
                                            i72++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && u0Var2.O(wallettransaction.nft)) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        u0Var2.B().e();
                        u0Var2.H().g();
                        u0Var2.K();
                        int i11 = u0Var2.A;
                        long[] jArr = u0.S;
                        if (i11 < 7) {
                            h hVar = u0Var2.B;
                            u0Var2.A = i11 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                            return;
                        }
                        return;
                    case 2:
                        u0 u0Var3 = this.f44326b;
                        i1 i1Var = u0Var3.f45144t;
                        if (i1Var != null && i1Var.d) {
                            u0Var3.K();
                            return;
                        }
                        return;
                    default:
                        u0 u0Var4 = this.f44326b;
                        int i12 = u0Var4.f45127a;
                        l0 l0Var2 = u0Var4.f45139o;
                        if (l0Var2 != null) {
                            l0Var2.e();
                        }
                        di.y8.y(i12, false).O(k10.i(i12).e());
                        return;
                }
            }
        };
        this.N = new HashMap();
        this.O = new HashMap();
        this.P = new HashMap();
        this.Q = new HashMap();
        this.f45127a = i7;
        try {
            this.f45137m = C().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e10) {
            o("failed to load prefs", e10);
        }
        this.h = new g(this);
        h0();
        g0();
        P("requesting has walt balance");
        this.E = ConnectionsManager.getInstance(this.f45127a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new d3.b(1), new i(this, 0));
        this.f45132g = new l2(this);
        h hVar = this.M;
        Object obj = z0.f45376g;
        synchronized (z0.class) {
            try {
                Iterator it = z0.f45378j.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        z0.f45378j.remove(weakReference);
                    } else if (runnable == hVar) {
                        z10 = true;
                    }
                }
                if (hVar != null && !z10) {
                    z0.f45378j.add(new WeakReference(hVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f0();
    }

    public static Context C() {
        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
        if (T2 != null && T2.getContext() != null) {
            return T2.getContext();
        }
        return org.telegram.messenger.t0.f26931b;
    }

    public static u0 D(int i7) {
        u0 u0Var;
        u0 u0Var2 = R[i7];
        if (u0Var2 == null) {
            synchronized (u0.class) {
                try {
                    u0Var = R[i7];
                    if (u0Var == null) {
                        u0[] u0VarArr = R;
                        u0 u0Var3 = new u0(i7);
                        u0VarArr[i7] = u0Var3;
                        u0Var = u0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return u0Var;
        }
        return u0Var2;
    }

    public static TL_update.TL_updateSentWalletTransaction G(TLRPC.Updates updates) {
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

    public static void J(IdentityHashMap identityHashMap, HashMap hashMap, int i7, TL_wallet.walletTransaction wallettransaction, boolean z10) {
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
        ArrayList s02 = s0(wallettransaction);
        int size = s02.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = s02.get(i10);
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

    public static boolean L(String str) {
        if (!"WALLET_SEND_CANCELLED".equals(str) && !"PASSCODE_FAILED".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static void P(String str) {
        org.telegram.messenger.a8.b("[gram-wallet] " + str);
    }

    public static boolean Q(gj gjVar, TL_wallet.walletTransaction wallettransaction) {
        if (gjVar != null && gjVar.f24213k != null && wallettransaction != null && gjVar.P3()) {
            TLRPC.Message message = gjVar.f24213k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j3 = wallettransaction.random_id;
                if (j3 == 0 || message.random_id != j3) {
                    if (wallettransaction.localMessageId == 0 || gjVar.e1() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f28697id) && TextUtils.equals(wallettransaction.f28697id, tL_messageActionGramTransfer.transaction_id)) {
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

    public static boolean a(TL_wallet.walletTransaction wallettransaction) {
        if (!wallettransaction.pending) {
            if (wallettransaction.nft != null || (wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void b(ArrayList arrayList, char c10, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String r02 = r0(str);
        if (r02 != null) {
            str2 = c10 + "x" + r02;
        } else {
            str2 = c10 + "r" + str;
        }
        arrayList.add(str2);
    }

    public static byte[] b0(byte[] bArr) {
        byte[] bArr2 = new byte[215];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z10 = false;
            int i7 = 0;
            for (byte b10 : bArr) {
                if (r0.e(b10)) {
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

    public static boolean c(String str, String str2) {
        String u02 = u0(str);
        String u03 = u0(str2);
        if (u02 != null && u02.equals(u03)) {
            return true;
        }
        return false;
    }

    public static k2 c0(p0 p0Var) {
        boolean z10;
        JSONArray jSONArray = new JSONArray();
        List<p0> list = p0Var.f44780g;
        if (list == null) {
            list = Collections.singletonList(p0Var);
        }
        for (p0 p0Var2 : list) {
            int i7 = p0Var2.f44778e;
            byte[] bArr = p0Var2.d;
            String str = p0Var2.f44775a;
            if (i7 == 3) {
                if (str.indexOf(58) >= 0) {
                    if (bArr == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str = e0(str, z10);
                }
                JSONObject put = new JSONObject().put("address", str).put("amount", Long.toString(p0Var2.f44776b));
                byte[] bArr2 = p0Var2.f44777c;
                if (bArr2 != null && bArr2.length > 0) {
                    put.put("payload", Base64.encodeToString(bArr2, 2));
                }
                if (bArr != null && bArr.length > 0) {
                    put.put("stateInit", Base64.encodeToString(bArr, 2));
                }
                jSONArray.put(put);
            } else {
                throw new IllegalArgumentException("WALLET_UNSUPPORTED_SEND_MODE");
            }
        }
        return new k2(new JSONObject().put("messages", jSONArray));
    }

    public static String e0(String str, boolean z10) {
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

    public static TL_wallet.WalletTransactionPeer i(TLRPC.User user, String str, String str2) {
        TL_wallet.WalletTransactionPeer wallettransactionpeeraddress;
        if (user != null) {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeraddress.user_id = user.f28583id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
    }

    public static k2 j(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
            str = e0(stargiftdepositpayload.nft_address, true);
        } else {
            str = stargiftdepositpayload.nft_address;
        }
        return new k2(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static boolean l0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            String r02 = r0(str);
            if (r02 != null && r02.equals(r0(str2))) {
                return true;
            }
        }
        return false;
    }

    public static void n(String str) {
        org.telegram.messenger.a8.d("[gram-wallet] " + str);
    }

    public static void o(String str, Throwable th2) {
        org.telegram.messenger.a8.e("[gram-wallet] " + str, th2);
    }

    public static void p(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() >= 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList.get(i7);
                if (wallettransaction != null && !TextUtils.isEmpty(wallettransaction.f28697id)) {
                    int i10 = i7 + 1;
                    while (i10 < arrayList.size()) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList.get(i10);
                        if (wallettransaction2 != null && TextUtils.equals(wallettransaction2.f28697id, wallettransaction.f28697id)) {
                            int i11 = i10 - 1;
                            arrayList.remove(i10);
                            if (wallettransaction.nft == null && wallettransaction2.nft != null) {
                                wallettransaction2.amount += wallettransaction.amount;
                                arrayList.set(i7, wallettransaction2);
                            } else {
                                wallettransaction.amount += wallettransaction2.amount;
                                wallettransaction2 = wallettransaction;
                                wallettransaction = wallettransaction2;
                            }
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                            if ((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift) && !(wallettransaction2.peer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
                                wallettransaction2.peer = walletTransactionPeer;
                            }
                            wallettransaction = wallettransaction2;
                            i10 = i11;
                        }
                        i10++;
                    }
                }
            }
        }
    }

    public static byte[][] p0(byte[] bArr, SecureRandom secureRandom) {
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

    public static SpannableStringBuilder q(String str, CharSequence charSequence, int i7) {
        long abs;
        String replace = charSequence.toString().replace((char) 8211, '-');
        String N0 = hd.N0(i7, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                if (parseLong >= -2147483647L && parseLong <= 2147483647L) {
                    abs = Math.abs(parseLong);
                } else {
                    abs = Math.abs(parseLong % 100) + 100;
                }
                N0 = hd.K0((int) abs, str);
            } catch (NumberFormatException unused) {
            }
        }
        return org.telegram.messenger.g0.K2(N0, charSequence, "%1$s");
    }

    public static java.lang.String r0(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u0.r0(java.lang.String):java.lang.String");
    }

    public static SpannableStringBuilder s(long j3, boolean z10) {
        return q("GramCapital", t(j3, z10), 2131749343);
    }

    public static ArrayList s0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.f28697id)) {
                arrayList.add("i" + wallettransaction.f28697id);
            }
            b(arrayList, 't', wallettransaction.tx_hash);
            b(arrayList, 'm', wallettransaction.messageHash);
            if (!wallettransaction.incoming) {
                b(arrayList, 'g', wallettransaction.gaslessMessageBodyHash);
                b(arrayList, 'n', wallettransaction.normalMessageBodyHash);
            }
        }
        return arrayList;
    }

    public static String t(long j3, boolean z10) {
        if ((j3 > -10000000 && j3 < 10000000) || z10) {
            return pb.P0(j3);
        }
        if (U == null) {
            U = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
        }
        return U.format(j3 / 1.0E9d);
    }

    public static boolean t0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((TextUtils.isEmpty(wallettransaction.f28697id) || !TextUtils.equals(wallettransaction.f28697id, wallettransaction2.f28697id)) && !l0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !l0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            if (!wallettransaction.incoming && !wallettransaction2.incoming) {
                if (!l0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) && !l0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static String u(long j3, boolean z10) {
        boolean z11;
        int i7;
        BigDecimal stripTrailingZeros;
        if (j3 > -1000000000 && j3 < 1000000000) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 && z11) {
            return t(j3, true);
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

    public static String u0(String str) {
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

    public static SpannableStringBuilder v(String str, float f10) {
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i7 = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), i7, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder w(long j3) {
        return x(j3, false);
    }

    public static SpannableStringBuilder x(long j3, boolean z10) {
        return q("Grams", t(j3, z10), 2131749314);
    }

    public final long A() {
        TL_wallet.WalletState walletState = this.f45130e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final l0 B() {
        if (this.f45139o == null) {
            this.f45139o = new l0(this);
        }
        return this.f45139o;
    }

    public final byte[] E() {
        TL_wallet.WalletState walletState = this.f45130e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void F(boolean z10, boolean z11, boolean z12, r10 r10Var) {
        P("getSecretPhrase: whenReady...");
        x0(new org.telegram.messenger.k4(this, r10Var, z12, z10, z11, 2));
    }

    public final t0 H() {
        if (this.f45138n == null) {
            this.f45138n = new t0(this);
        }
        return this.f45138n;
    }

    public final void I(boolean z10, boolean z11, r0 r0Var, y10 y10Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(r0Var)) {
                y10Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(r0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(r0Var);
            r0 b10 = r0Var.b();
            P("import wallet: requesting proof challenge");
            n3.a(this.f45127a, null, new s(this, b10, y10Var, secretPhraseToAnchorPublicKey, 1), null, null, new v(this, y10Var, secretPhraseToPublicKey, b10), z10, z11, new m.b3(new m(b10, 1), null));
        } catch (Exception unused2) {
            y10Var.a("INVALID_PHRASE");
        }
    }

    public final void K() {
        t0 t0Var = this.f45138n;
        if (t0Var != null) {
            t0Var.g();
        }
        if (this.C >= 0) {
            return;
        }
        h0();
    }

    public final boolean M() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f45131f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.f45130e instanceof TL_wallet.TL_walletState) && this.f45128b != null && this.f45129c != null) {
            return true;
        }
        return false;
    }

    public final boolean O(TL_wallet.nftItem nftitem) {
        if (nftitem == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f45148y)) {
            return c(nftitem.address, this.f45148y);
        }
        TL_stars.StarGift starGift = nftitem.gift;
        if (!(starGift instanceof TL_stars.TL_starGiftUnique) || !TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, this.f45149z)) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u0.R():boolean");
    }

    public final boolean S() {
        if (this.f45137m && !cz.f23439s.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void T() {
        ls.f(this.f45127a).k(ls.f25296d4, this);
    }

    public final void U(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u0.U(org.json.JSONObject):void");
    }

    public final void V() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.f45130e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        z0 z0Var = this.f45129c;
        if (z0Var != null && !TextUtils.equals(z0Var.f45381c, str)) {
            if (str == null) {
                P("received empty state, leaving wallet storage of " + this.f45129c.f45381c);
            } else {
                StringBuilder u10 = a8.p0.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.f45129c.f45381c);
                P(u10.toString());
            }
            this.f45129c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f45129c == null) {
            P("setting up wallet storage of " + str);
            this.f45129c = new z0(this.f45127a, org.telegram.messenger.t0.f26931b, str);
            P("storage public keys = " + this.f45129c.n().length);
        }
        l0 l0Var = this.f45139o;
        if (l0Var != null && !TextUtils.equals(l0Var.f44507e, str)) {
            l0Var.f44507e = str;
            l0Var.c();
        }
        if (this.f45128b != null && !TextUtils.equals(this.d, str)) {
            this.f45128b.close();
            this.f45128b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f45128b == null || !TextUtils.equals(this.d, str))) {
            if (this.f45128b != null) {
                P("closing wallet-engine of " + this.d);
                this.f45128b.close();
                this.f45128b = null;
            }
            P("creating wallet-engine for " + str);
            try {
                int i7 = this.f45127a;
                this.d = str;
                this.f45128b = new WalletEngine2(i7, str, bArr);
            } catch (Exception e10) {
                o("failed to create engine!", e10);
                this.d = null;
            }
        }
        int i10 = 0;
        if ((this.f45130e instanceof TL_wallet.TL_walletState) && this.f45128b != null) {
            ArrayList arrayList = this.f45146w;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                }
            }
            this.f45146w.clear();
        }
        if ((this.f45130e instanceof TL_wallet.TL_walletState) && this.f45128b != null && this.f45131f != null) {
            ArrayList arrayList2 = this.f45147x;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.g0.g3(runnable2);
                }
            }
            this.f45147x.clear();
        }
        if (!TextUtils.equals(this.L, str)) {
            f0();
        }
        a0();
    }

    public final void W(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && r0(str) != null) {
            ArrayList arrayList = this.f45140p;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = wallettransaction.messageHash;
                String str3 = tL_updateSentWalletTransaction.msg_hash;
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && l0(str2, str3)) {
                    e(wallettransaction, tL_updateSentWalletTransaction);
                    return;
                }
            }
            TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
            if (wallettransaction2 != null) {
                wallettransaction2.messageHash = tL_updateSentWalletTransaction.msg_hash;
                wallettransaction2.gasless = tL_updateSentWalletTransaction.gasless;
                wallettransaction2.pending = false;
                arrayList.add(0, wallettransaction2);
                H().k();
                H().i();
            }
        }
    }

    public final void X(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f45131f = tL_updateWalletGaslessInfo;
        V();
        T();
    }

    public final void Y(TL_update.TL_updateWalletState tL_updateWalletState) {
        w0(tL_updateWalletState.state);
    }

    public final void Z() {
        q0();
        this.f45140p.clear();
        ArrayList arrayList = this.f45143s;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            r0 r0Var = ((n0) obj).f44651b;
            if (r0Var != null) {
                r0Var.close();
            }
        }
        arrayList.clear();
        t0 t0Var = this.f45138n;
        if (t0Var != null) {
            t0Var.a();
            t0Var.f45086b.clear();
            t0Var.d.clear();
            t0Var.f45088e.clear();
            t0Var.f45089f.clear();
            t0Var.f45090g = "";
            t0Var.h = false;
            t0Var.k();
            this.f45138n.k();
            this.f45138n.i();
        }
        a0();
        this.f45131f = null;
        g0();
    }

    public final void a0() {
        boolean z10;
        boolean z11;
        if (!TextUtils.equals(this.v, y())) {
            q0();
            this.v = y();
        }
        if (N() && !TextUtils.isEmpty(y())) {
            HashMap hashMap = this.f45145u;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((x0) hashMap.get(wallettransaction)).f45278b, wallettransaction.messageHash)) {
                    ((x0) hashMap.remove(wallettransaction)).c();
                }
            }
            ArrayList arrayList2 = this.f45140p;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    String y10 = y();
                    x0 x0Var = new x0(this.f45127a, str, y10, new l(this, wallettransaction2), new l(this, wallettransaction2));
                    hashMap.put(wallettransaction2, x0Var);
                    if (!x0Var.f45281f && !TextUtils.isEmpty(str)) {
                        x0Var.f45281f = true;
                        x0Var.h = 0;
                        x0Var.b();
                        if (!TextUtils.isEmpty(y10)) {
                            org.telegram.messenger.g0.h3(x0Var.f45287m, 8000L);
                        }
                    }
                }
            }
        } else {
            q0();
        }
        if (N() && !TextUtils.isEmpty(y()) && !this.G.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i1 i1Var = this.f45144t;
        if (i1Var != null && i1Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && i1Var != null && !TextUtils.equals(i1Var.f44372b, y()))) {
            if (z10) {
                i1 i1Var2 = this.f45144t;
                if (i1Var2 != null && !TextUtils.equals(i1Var2.f44372b, y())) {
                    this.f45144t.h();
                    this.f45144t = null;
                }
                if (this.f45144t == null) {
                    this.f45144t = new i1(this.f45127a, y(), this);
                }
                i1 i1Var3 = this.f45144t;
                boolean z12 = i1Var3.d;
                if (!z12) {
                    String str2 = i1Var3.f44372b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        i1Var3.d("starting; address=" + str2);
                        i1Var3.d = true;
                        i1Var3.f44378j = 0;
                        i1Var3.e();
                        return;
                    }
                    i1Var3.d("start ignored: running=" + i1Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            i1 i1Var4 = this.f45144t;
            if (i1Var4 != null) {
                i1Var4.h();
            }
            org.telegram.messenger.g0.r(this.H);
        }
    }

    public final void d(org.telegram.tgnet.tl.TL_wallet.walletTransaction r7, org.telegram.tgnet.tl.TL_wallet.walletTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u0.d(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.tgnet.tl.TL_wallet$walletTransaction):void");
    }

    public final void d0(r0 r0Var, boolean z10, r10 r10Var) {
        r0 b10 = r0Var.b();
        P("requesting proof challenge");
        ConnectionsManager.getInstance(this.f45127a).sendRequestTyped(new TL_wallet.getProofChallenge(), new d3.b(1), new c0(this, b10, r10Var, z10, 0));
    }

    public final void e(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            d(wallettransaction, wallettransaction2);
        } else {
            a0();
        }
    }

    public final boolean f() {
        TL_wallet.WalletState walletState = this.f45130e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            z0 z0Var = this.f45129c;
            if (z0Var == null || !z0Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void f0() {
        int i7;
        this.L = y();
        ArrayList o4 = z0.o(org.telegram.messenger.t0.f26931b, k10.i(this.f45127a).e());
        o4.remove(this.L);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q0 q0Var = (q0) obj;
            hashMap.put(q0Var.f44849a, q0Var);
        }
        this.J.clear();
        int size2 = o4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = o4.get(i11);
            i11++;
            String str = (String) obj2;
            q0 q0Var2 = (q0) hashMap.get(str);
            if (q0Var2 == null) {
                q0Var2 = new q0(new z0(this.f45127a, org.telegram.messenger.t0.f26931b, str));
            }
            z0 z0Var = q0Var2.f44853f;
            synchronized (z0.f45376g) {
                try {
                    try {
                        i7 = z0Var.s().f39006b;
                    } catch (Exception e10) {
                        z0Var.m(e10);
                        i7 = 0;
                    }
                } finally {
                }
            }
            q0Var2.f44850b = i7;
            this.J.add(q0Var2);
            z(str, null);
            v0((j0) this.Q.get(str));
        }
        Collections.sort(this.J, new qw0(4));
    }

    public final boolean g() {
        z0 z0Var;
        TL_wallet.WalletState walletState = this.f45130e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((z0Var = this.f45129c) != null && z0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void g0() {
        P("requesting gasless info");
        this.D = ConnectionsManager.getInstance(this.f45127a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new d3.b(1), new i(this, 2));
    }

    public final void h(TL_wallet.walletTransaction wallettransaction, boolean z10, String str) {
        n0 n0Var;
        if (!wallettransaction.pending) {
            return;
        }
        t0 H = H();
        wallettransaction.failed = !z10;
        int i7 = 0;
        wallettransaction.pending = false;
        if (!TextUtils.isEmpty(str)) {
            wallettransaction.tx_hash = str;
        }
        if (wallettransaction.key_change) {
            ArrayList arrayList = this.f45143s;
            int size = arrayList.size();
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    n0Var = (n0) obj;
                    if (TextUtils.equals(n0Var.f44650a, wallettransaction.messageHash)) {
                        break;
                    }
                } else {
                    n0Var = null;
                    break;
                }
            }
            if (n0Var != null) {
                if (z10) {
                    n0Var.a();
                } else {
                    r0 r0Var = n0Var.f44651b;
                    if (r0Var != null) {
                        r0Var.close();
                    }
                }
                arrayList.remove(n0Var);
            }
        }
        y10 y10Var = (y10) this.f45141q.remove(wallettransaction);
        if (y10Var != null) {
            y10Var.a(Boolean.valueOf(z10));
        }
        P("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.f28697id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z10);
        H.k();
        H.i();
        a0();
    }

    public final void h0() {
        P("requesting state");
        this.C = ConnectionsManager.getInstance(this.f45127a).sendRequestTyped(new TL_wallet.getState(), new d3.b(1), new i(this, 1));
    }

    public final void i0(r10 r10Var, String str) {
        if (str == null) {
            r10Var.a(null, null);
            return;
        }
        HashMap hashMap = this.P;
        if (hashMap.containsKey(str)) {
            r10Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f45127a).sendRequestTyped(getuseraddresses, new d3.b(1), new j((Object) this, (Object) str, (Object) r10Var, 0));
    }

    public final void j0(TLRPC.User user, r10 r10Var) {
        if (user == null) {
            r10Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f28583id);
        HashMap hashMap = this.O;
        if (hashMap.containsKey(valueOf)) {
            r10Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f28583id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f28695id;
        int i7 = this.f45127a;
        arrayList.add(np.u1(i7).s1(user));
        ConnectionsManager.getInstance(i7).sendRequestTyped(getuseraddresses, new d3.b(1), new j(this, (Object) r10Var, (Object) user, 1));
    }

    public final Runnable k(TL_stars.starGiftDepositPayload stargiftdepositpayload, r10 r10Var) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new x(this, zArr, r10Var, j(stargiftdepositpayload), 1));
            return new y(1, zArr);
        } catch (Exception e10) {
            o("emulateDepositNFT: invalid payload", e10);
            org.telegram.messenger.g0.g3(new w(r10Var, e10, 1));
            return new cd0(8);
        }
    }

    public final void k0(String str, y10 y10Var) {
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
        int i7 = this.f45127a;
        ConnectionsManager.getInstance(i7).sendRequestTyped(performapirequest, new d3.b(1), new bi.o6(this, str, y10Var), np.u1(i7).Q3, 0);
    }

    public final Runnable l(p0 p0Var, r10 r10Var) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new x(this, zArr, r10Var, c0(p0Var), 0));
            return new y(0, zArr);
        } catch (Exception e10) {
            o("emulatePreparedMessage: invalid message", e10);
            org.telegram.messenger.g0.g3(new w(r10Var, e10, 0));
            return new cd0(8);
        }
    }

    public final m m(String str, long j3, String str2, byte[] bArr, r10 r10Var) {
        g0 g0Var = new g0(this, str, j3, str2, bArr, r10Var);
        x0(g0Var);
        return new m(g0Var, 0);
    }

    public final void m0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, y10 y10Var, y10 y10Var2) {
        n0(user, str, j3, str2, bArr, nftitem, str3, y10Var, y10Var2, null, null, null);
    }

    public final void n0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, y10 y10Var, y10 y10Var2, k2 k2Var, k2 k2Var2, p0 p0Var) {
        String y10 = y();
        P("send to " + str + ", amount " + j3 + ", when ready...");
        x0(new n(this, str, y10Var, nftitem, y10, str2, bArr, j3, p0Var, k2Var, user, str3, y10Var2, k2Var2, 0));
    }

    public final void o0(p0 p0Var, y10 y10Var, y10 y10Var2, Runnable runnable) {
        String message;
        k2 c02;
        try {
            k2 c03 = c0(p0Var);
            String str = ((j2) c03.f44480b.get(0)).f44429a;
            p0 p0Var2 = p0Var.f44779f;
            if (p0Var2 != null) {
                try {
                    c02 = c0(p0Var2);
                } catch (Exception e10) {
                    o("sendPreparedMessage: invalid gasless message, sending the normal one", e10);
                }
                n0(null, str, p0Var.f44776b, null, null, null, null, y10Var, new o(this, y10Var2, runnable, 1), c03, c02, p0Var);
            }
            c02 = null;
            n0(null, str, p0Var.f44776b, null, null, null, null, y10Var, new o(this, y10Var2, runnable, 1), c03, c02, p0Var);
        } catch (Exception e11) {
            o("sendPreparedMessage: invalid message", e11);
            if (e11.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e11.getMessage();
            }
            y10Var.a(message);
        }
    }

    public final void q0() {
        HashMap hashMap = this.f45145u;
        for (x0 x0Var : hashMap.values()) {
            x0Var.c();
        }
        hashMap.clear();
    }

    public final CharSequence r(long j3, boolean z10) {
        BigDecimal scale;
        int i7;
        char charAt;
        String E;
        g gVar = this.h;
        String g10 = gVar.g();
        TL_wallet.currencyRate j10 = gVar.j();
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
                double d2 = d * ((org.telegram.messenger.i0) np.u1(this.f45127a).A7.f26231l.f15708b).f24565a;
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
                    E = p5.c.k("-", E);
                }
                int indexOf = E.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(E);
                    spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return E;
            }
        }
        return "";
    }

    public final void v0(j0 j0Var) {
        if (j0Var != null) {
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q0 q0Var = (q0) obj;
                if (TextUtils.equals(q0Var.f44849a, j0Var.f44418a)) {
                    q0Var.f44851c = j0Var.f44419b;
                    boolean z10 = true;
                    q0Var.d = !j0Var.f44421e;
                    byte[] bArr = j0Var.f44420c;
                    if (bArr == null || bArr.length <= 0 || q0Var.f44853f.f(bArr)) {
                        z10 = false;
                    }
                    q0Var.f44852e = z10;
                }
            }
        }
    }

    public final void w0(TL_wallet.WalletState walletState) {
        boolean z10;
        t0 t0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.f45130e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.f45130e = walletState;
                    V();
                    T();
                    if (!z10 && (t0Var = this.f45138n) != null) {
                        t0Var.g();
                        return;
                    }
                }
            }
            z10 = false;
            this.f45130e = walletState;
            V();
            T();
            if (!z10) {
            }
        }
    }

    public final void x0(Runnable runnable) {
        if (N()) {
            runnable.run();
            return;
        }
        this.f45146w.add(new WeakReference(runnable));
    }

    public final String y() {
        TL_wallet.WalletState walletState = this.f45130e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final j0 z(final String str, r rVar) {
        HashMap hashMap = this.Q;
        j0 j0Var = (j0) hashMap.get(str);
        if (j0Var != null && !j0Var.f44421e) {
            if (rVar != null) {
                j0Var.f44422f.add(rVar);
            }
            return null;
        }
        int i7 = this.f45127a;
        if (j0Var != null && j0Var.f44421e && ConnectionsManager.getInstance(i7).getCurrentTime() < j0Var.d + 300) {
            if (rVar != null) {
                rVar.a(j0Var);
            }
            return j0Var;
        }
        final ?? obj = new Object();
        obj.f44419b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f44422f = arrayList;
        obj.f44418a = str;
        obj.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (rVar != null) {
            arrayList.add(rVar);
        }
        hashMap.put(str, obj);
        Utilities.B(new p(this, str, (Object) obj, 0), new y10(this) {
            public final u0 f44847b;

            {
                this.f44847b = this;
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
                        u0 u0Var = this.f44847b;
                        int i10 = u0Var.f45127a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new s(u0Var, obj, str2, runnable, 0), np.u1(i10).Q3, 0);
                        return;
                    default:
                        u0 u0Var2 = this.f44847b;
                        j0 j0Var2 = obj;
                        String str3 = str;
                        u0Var2.k0(str3, new r(u0Var2, j0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new y10(this) {
            public final u0 f44847b;

            {
                this.f44847b = this;
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
                        u0 u0Var = this.f44847b;
                        int i10 = u0Var.f45127a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new s(u0Var, obj, str2, runnable, 0), np.u1(i10).Q3, 0);
                        return;
                    default:
                        u0 u0Var2 = this.f44847b;
                        j0 j0Var2 = obj;
                        String str3 = str;
                        u0Var2.k0(str3, new r(u0Var2, j0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        });
        return null;
    }
}
