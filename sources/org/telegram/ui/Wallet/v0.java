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
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.ow0;
public final class v0 {
    public static volatile v0[] R = new v0[4];
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
    public final int f45255a;
    public WalletEngine2 f45256b;
    public a1 f45257c;
    public String d;
    public TL_wallet.WalletState f45258e;
    public TL_update.TL_updateWalletGaslessInfo f45259f;
    public final m2 f45260g;
    public final g h;
    public Boolean f45261i;
    public String f45262j;
    public long f45263k;
    public boolean f45264l;
    public boolean f45265m;
    public u0 f45266n;
    public m0 f45267o;
    public j1 f45272t;
    public String v;
    public String f45276y;
    public String f45277z;
    public final ArrayList f45268p = new ArrayList();
    public final HashMap f45269q = new HashMap();
    public final HashMap f45270r = new HashMap();
    public final ArrayList f45271s = new ArrayList();
    public final HashMap f45273u = new HashMap();
    public final ArrayList f45274w = new ArrayList();
    public final ArrayList f45275x = new ArrayList();
    public final h B = new Runnable(this) {
        public final v0 f44409b;

        {
            this.f44409b = this;
        }

        @Override
        public final void run() {
            m0 m0Var;
            switch (r2) {
                case 0:
                    v0 v0Var = this.f44409b;
                    v0Var.f0();
                    v0Var.T();
                    return;
                case 1:
                    v0 v0Var2 = this.f44409b;
                    if ((!TextUtils.isEmpty(v0Var2.f45276y) || !TextUtils.isEmpty(v0Var2.f45277z)) && (m0Var = v0Var2.f45267o) != null && v0Var2.f45266n != null) {
                        ArrayList arrayList = m0Var.f44630b;
                        int size = arrayList.size();
                        int i7 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (v0Var2.O((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = v0Var2.f45266n.f45214b;
                                    int size2 = arrayList2.size();
                                    while (i7 < size2) {
                                        Object obj2 = arrayList2.get(i7);
                                        i7++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && v0Var2.O(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    v0Var2.B().e();
                    v0Var2.H().g();
                    v0Var2.K();
                    int i11 = v0Var2.A;
                    long[] jArr = v0.S;
                    if (i11 < 7) {
                        h hVar = v0Var2.B;
                        v0Var2.A = i11 + 1;
                        org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 2:
                    v0 v0Var3 = this.f44409b;
                    j1 j1Var = v0Var3.f45272t;
                    if (j1Var != null && j1Var.d) {
                        v0Var3.K();
                        return;
                    }
                    return;
                default:
                    v0 v0Var4 = this.f44409b;
                    int i12 = v0Var4.f45255a;
                    m0 m0Var2 = v0Var4.f45267o;
                    if (m0Var2 != null) {
                        m0Var2.e();
                    }
                    di.y8.y(i12, false).O(i10.i(i12).e());
                    return;
            }
        }
    };
    public int C = -1;
    public int D = -1;
    public int F = 0;
    public final HashSet G = new HashSet();
    public final h H = new Runnable(this) {
        public final v0 f44409b;

        {
            this.f44409b = this;
        }

        @Override
        public final void run() {
            m0 m0Var;
            switch (r2) {
                case 0:
                    v0 v0Var = this.f44409b;
                    v0Var.f0();
                    v0Var.T();
                    return;
                case 1:
                    v0 v0Var2 = this.f44409b;
                    if ((!TextUtils.isEmpty(v0Var2.f45276y) || !TextUtils.isEmpty(v0Var2.f45277z)) && (m0Var = v0Var2.f45267o) != null && v0Var2.f45266n != null) {
                        ArrayList arrayList = m0Var.f44630b;
                        int size = arrayList.size();
                        int i7 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (v0Var2.O((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = v0Var2.f45266n.f45214b;
                                    int size2 = arrayList2.size();
                                    while (i7 < size2) {
                                        Object obj2 = arrayList2.get(i7);
                                        i7++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && v0Var2.O(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    v0Var2.B().e();
                    v0Var2.H().g();
                    v0Var2.K();
                    int i11 = v0Var2.A;
                    long[] jArr = v0.S;
                    if (i11 < 7) {
                        h hVar = v0Var2.B;
                        v0Var2.A = i11 + 1;
                        org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 2:
                    v0 v0Var3 = this.f44409b;
                    j1 j1Var = v0Var3.f45272t;
                    if (j1Var != null && j1Var.d) {
                        v0Var3.K();
                        return;
                    }
                    return;
                default:
                    v0 v0Var4 = this.f44409b;
                    int i12 = v0Var4.f45255a;
                    m0 m0Var2 = v0Var4.f45267o;
                    if (m0Var2 != null) {
                        m0Var2.e();
                    }
                    di.y8.y(i12, false).O(i10.i(i12).e());
                    return;
            }
        }
    };
    public final h I = new Runnable(this) {
        public final v0 f44409b;

        {
            this.f44409b = this;
        }

        @Override
        public final void run() {
            m0 m0Var;
            switch (r2) {
                case 0:
                    v0 v0Var = this.f44409b;
                    v0Var.f0();
                    v0Var.T();
                    return;
                case 1:
                    v0 v0Var2 = this.f44409b;
                    if ((!TextUtils.isEmpty(v0Var2.f45276y) || !TextUtils.isEmpty(v0Var2.f45277z)) && (m0Var = v0Var2.f45267o) != null && v0Var2.f45266n != null) {
                        ArrayList arrayList = m0Var.f44630b;
                        int size = arrayList.size();
                        int i7 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (v0Var2.O((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = v0Var2.f45266n.f45214b;
                                    int size2 = arrayList2.size();
                                    while (i7 < size2) {
                                        Object obj2 = arrayList2.get(i7);
                                        i7++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && v0Var2.O(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    v0Var2.B().e();
                    v0Var2.H().g();
                    v0Var2.K();
                    int i11 = v0Var2.A;
                    long[] jArr = v0.S;
                    if (i11 < 7) {
                        h hVar = v0Var2.B;
                        v0Var2.A = i11 + 1;
                        org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                        return;
                    }
                    return;
                case 2:
                    v0 v0Var3 = this.f44409b;
                    j1 j1Var = v0Var3.f45272t;
                    if (j1Var != null && j1Var.d) {
                        v0Var3.K();
                        return;
                    }
                    return;
                default:
                    v0 v0Var4 = this.f44409b;
                    int i12 = v0Var4.f45255a;
                    m0 m0Var2 = v0Var4.f45267o;
                    if (m0Var2 != null) {
                        m0Var2.e();
                    }
                    di.y8.y(i12, false).O(i10.i(i12).e());
                    return;
            }
        }
    };

    public v0(int i7) {
        this.E = -1;
        boolean z10 = false;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = DesugarCollections.unmodifiableList(arrayList);
        this.M = new Runnable(this) {
            public final v0 f44409b;

            {
                this.f44409b = this;
            }

            @Override
            public final void run() {
                m0 m0Var;
                switch (r2) {
                    case 0:
                        v0 v0Var = this.f44409b;
                        v0Var.f0();
                        v0Var.T();
                        return;
                    case 1:
                        v0 v0Var2 = this.f44409b;
                        if ((!TextUtils.isEmpty(v0Var2.f45276y) || !TextUtils.isEmpty(v0Var2.f45277z)) && (m0Var = v0Var2.f45267o) != null && v0Var2.f45266n != null) {
                            ArrayList arrayList2 = m0Var.f44630b;
                            int size = arrayList2.size();
                            int i72 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i10 < size) {
                                    Object obj = arrayList2.get(i10);
                                    i10++;
                                    if (v0Var2.O((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList22 = v0Var2.f45266n.f45214b;
                                        int size2 = arrayList22.size();
                                        while (i72 < size2) {
                                            Object obj2 = arrayList22.get(i72);
                                            i72++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && v0Var2.O(wallettransaction.nft)) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        v0Var2.B().e();
                        v0Var2.H().g();
                        v0Var2.K();
                        int i11 = v0Var2.A;
                        long[] jArr = v0.S;
                        if (i11 < 7) {
                            h hVar = v0Var2.B;
                            v0Var2.A = i11 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i11]);
                            return;
                        }
                        return;
                    case 2:
                        v0 v0Var3 = this.f44409b;
                        j1 j1Var = v0Var3.f45272t;
                        if (j1Var != null && j1Var.d) {
                            v0Var3.K();
                            return;
                        }
                        return;
                    default:
                        v0 v0Var4 = this.f44409b;
                        int i12 = v0Var4.f45255a;
                        m0 m0Var2 = v0Var4.f45267o;
                        if (m0Var2 != null) {
                            m0Var2.e();
                        }
                        di.y8.y(i12, false).O(i10.i(i12).e());
                        return;
                }
            }
        };
        this.N = new HashMap();
        this.O = new HashMap();
        this.P = new HashMap();
        this.Q = new HashMap();
        this.f45255a = i7;
        try {
            this.f45265m = C().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e10) {
            o("failed to load prefs", e10);
        }
        this.h = new g(this);
        h0();
        g0();
        P("requesting has walt balance");
        this.E = ConnectionsManager.getInstance(this.f45255a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new d3.b(1), new i(this, 0));
        this.f45260g = new m2(this);
        h hVar = this.M;
        Object obj = a1.f44034g;
        synchronized (a1.class) {
            try {
                Iterator it = a1.f44036j.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        a1.f44036j.remove(weakReference);
                    } else if (runnable == hVar) {
                        z10 = true;
                    }
                }
                if (hVar != null && !z10) {
                    a1.f44036j.add(new WeakReference(hVar));
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
        return org.telegram.messenger.t0.f27013b;
    }

    public static v0 D(int i7) {
        v0 v0Var;
        v0 v0Var2 = R[i7];
        if (v0Var2 == null) {
            synchronized (v0.class) {
                try {
                    v0Var = R[i7];
                    if (v0Var == null) {
                        v0[] v0VarArr = R;
                        v0 v0Var3 = new v0(i7);
                        v0VarArr[i7] = v0Var3;
                        v0Var = v0Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return v0Var;
        }
        return v0Var2;
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

    public static boolean Q(fj fjVar, TL_wallet.walletTransaction wallettransaction) {
        if (fjVar != null && fjVar.f24073k != null && wallettransaction != null && fjVar.P3()) {
            TLRPC.Message message = fjVar.f24073k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j3 = wallettransaction.random_id;
                if (j3 == 0 || message.random_id != j3) {
                    if (wallettransaction.localMessageId == 0 || fjVar.e1() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f28755id) && TextUtils.equals(wallettransaction.f28755id, tL_messageActionGramTransfer.transaction_id)) {
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
                if (s0.e(b10)) {
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

    public static l2 c0(q0 q0Var) {
        boolean z10;
        JSONArray jSONArray = new JSONArray();
        List<q0> list = q0Var.f44908g;
        if (list == null) {
            list = Collections.singletonList(q0Var);
        }
        for (q0 q0Var2 : list) {
            int i7 = q0Var2.f44906e;
            byte[] bArr = q0Var2.d;
            String str = q0Var2.f44903a;
            if (i7 == 3) {
                if (str.indexOf(58) >= 0) {
                    if (bArr == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str = e0(str, z10);
                }
                JSONObject put = new JSONObject().put("address", str).put("amount", Long.toString(q0Var2.f44904b));
                byte[] bArr2 = q0Var2.f44905c;
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
        return new l2(new JSONObject().put("messages", jSONArray));
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
            wallettransactionpeeraddress.user_id = user.f28641id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
    }

    public static l2 j(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
            str = e0(stargiftdepositpayload.nft_address, true);
        } else {
            str = stargiftdepositpayload.nft_address;
        }
        return new l2(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
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
                if (wallettransaction != null && !TextUtils.isEmpty(wallettransaction.f28755id)) {
                    int i10 = i7 + 1;
                    while (i10 < arrayList.size()) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList.get(i10);
                        if (wallettransaction2 != null && TextUtils.equals(wallettransaction2.f28755id, wallettransaction.f28755id)) {
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
        String N0 = gd.N0(i7, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                if (parseLong >= -2147483647L && parseLong <= 2147483647L) {
                    abs = Math.abs(parseLong);
                } else {
                    abs = Math.abs(parseLong % 100) + 100;
                }
                N0 = gd.K0((int) abs, str);
            } catch (NumberFormatException unused) {
            }
        }
        return org.telegram.messenger.g0.K2(N0, charSequence, "%1$s");
    }

    public static java.lang.String r0(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.v0.r0(java.lang.String):java.lang.String");
    }

    public static SpannableStringBuilder s(long j3, boolean z10) {
        return q("GramCapital", t(j3, z10), 2131749343);
    }

    public static ArrayList s0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.f28755id)) {
                arrayList.add("i" + wallettransaction.f28755id);
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
        if ((TextUtils.isEmpty(wallettransaction.f28755id) || !TextUtils.equals(wallettransaction.f28755id, wallettransaction2.f28755id)) && !l0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !l0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
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
        TL_wallet.WalletState walletState = this.f45258e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }

    public final m0 B() {
        if (this.f45267o == null) {
            this.f45267o = new m0(this);
        }
        return this.f45267o;
    }

    public final byte[] E() {
        TL_wallet.WalletState walletState = this.f45258e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void F(boolean z10, boolean z11, boolean z12, p10 p10Var) {
        P("getSecretPhrase: whenReady...");
        x0(new org.telegram.messenger.k4(this, p10Var, z12, z10, z11, 2));
    }

    public final u0 H() {
        if (this.f45266n == null) {
            this.f45266n = new u0(this);
        }
        return this.f45266n;
    }

    public final void I(boolean z10, boolean z11, s0 s0Var, w10 w10Var) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(s0Var)) {
                w10Var.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(s0Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(s0Var);
            s0 b10 = s0Var.b();
            P("import wallet: requesting proof challenge");
            o3.a(this.f45255a, null, new t(this, b10, w10Var, secretPhraseToAnchorPublicKey, 1), null, null, new w(this, w10Var, secretPhraseToPublicKey, b10), z10, z11, new m.b3(new m(b10, 1), null));
        } catch (Exception unused2) {
            w10Var.a("INVALID_PHRASE");
        }
    }

    public final void K() {
        u0 u0Var = this.f45266n;
        if (u0Var != null) {
            u0Var.g();
        }
        if (this.C >= 0) {
            return;
        }
        h0();
    }

    public final boolean M() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f45259f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.f45258e instanceof TL_wallet.TL_walletState) && this.f45256b != null && this.f45257c != null) {
            return true;
        }
        return false;
    }

    public final boolean O(TL_wallet.nftItem nftitem) {
        if (nftitem == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f45276y)) {
            return c(nftitem.address, this.f45276y);
        }
        TL_stars.StarGift starGift = nftitem.gift;
        if (!(starGift instanceof TL_stars.TL_starGiftUnique) || !TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, this.f45277z)) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.v0.R():boolean");
    }

    public final boolean S() {
        if (this.f45265m && !bz.f23319s.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void T() {
        ks.f(this.f45255a).k(ks.f25201d4, this);
    }

    public final void U(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.v0.U(org.json.JSONObject):void");
    }

    public final void V() {
        byte[] bArr;
        String str;
        TL_wallet.WalletState walletState = this.f45258e;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            str = tL_walletState.address;
            bArr = tL_walletState.public_key;
        } else {
            bArr = null;
            str = null;
        }
        a1 a1Var = this.f45257c;
        if (a1Var != null && !TextUtils.equals(a1Var.f44039c, str)) {
            if (str == null) {
                P("received empty state, leaving wallet storage of " + this.f45257c.f44039c);
            } else {
                StringBuilder u10 = a8.p0.u("received new state of ", str, ", leaving wallet storage of ");
                u10.append(this.f45257c.f44039c);
                P(u10.toString());
            }
            this.f45257c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f45257c == null) {
            P("setting up wallet storage of " + str);
            this.f45257c = new a1(this.f45255a, org.telegram.messenger.t0.f27013b, str);
            P("storage public keys = " + this.f45257c.n().length);
        }
        m0 m0Var = this.f45267o;
        if (m0Var != null && !TextUtils.equals(m0Var.f44632e, str)) {
            m0Var.f44632e = str;
            m0Var.c();
        }
        if (this.f45256b != null && !TextUtils.equals(this.d, str)) {
            this.f45256b.close();
            this.f45256b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f45256b == null || !TextUtils.equals(this.d, str))) {
            if (this.f45256b != null) {
                P("closing wallet-engine of " + this.d);
                this.f45256b.close();
                this.f45256b = null;
            }
            P("creating wallet-engine for " + str);
            try {
                int i7 = this.f45255a;
                this.d = str;
                this.f45256b = new WalletEngine2(i7, str, bArr);
            } catch (Exception e10) {
                o("failed to create engine!", e10);
                this.d = null;
            }
        }
        int i10 = 0;
        if ((this.f45258e instanceof TL_wallet.TL_walletState) && this.f45256b != null) {
            ArrayList arrayList = this.f45274w;
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
            this.f45274w.clear();
        }
        if ((this.f45258e instanceof TL_wallet.TL_walletState) && this.f45256b != null && this.f45259f != null) {
            ArrayList arrayList2 = this.f45275x;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    org.telegram.messenger.g0.g3(runnable2);
                }
            }
            this.f45275x.clear();
        }
        if (!TextUtils.equals(this.L, str)) {
            f0();
        }
        a0();
    }

    public final void W(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && r0(str) != null) {
            ArrayList arrayList = this.f45268p;
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
        this.f45259f = tL_updateWalletGaslessInfo;
        V();
        T();
    }

    public final void Y(TL_update.TL_updateWalletState tL_updateWalletState) {
        w0(tL_updateWalletState.state);
    }

    public final void Z() {
        q0();
        this.f45268p.clear();
        ArrayList arrayList = this.f45271s;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s0 s0Var = ((o0) obj).f44783b;
            if (s0Var != null) {
                s0Var.close();
            }
        }
        arrayList.clear();
        u0 u0Var = this.f45266n;
        if (u0Var != null) {
            u0Var.a();
            u0Var.f45214b.clear();
            u0Var.d.clear();
            u0Var.f45216e.clear();
            u0Var.f45217f.clear();
            u0Var.f45218g = "";
            u0Var.h = false;
            u0Var.k();
            this.f45266n.k();
            this.f45266n.i();
        }
        a0();
        this.f45259f = null;
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
            HashMap hashMap = this.f45273u;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((y0) hashMap.get(wallettransaction)).f45406b, wallettransaction.messageHash)) {
                    ((y0) hashMap.remove(wallettransaction)).c();
                }
            }
            ArrayList arrayList2 = this.f45268p;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    String y10 = y();
                    y0 y0Var = new y0(this.f45255a, str, y10, new l(this, wallettransaction2), new l(this, wallettransaction2));
                    hashMap.put(wallettransaction2, y0Var);
                    if (!y0Var.f45409f && !TextUtils.isEmpty(str)) {
                        y0Var.f45409f = true;
                        y0Var.h = 0;
                        y0Var.b();
                        if (!TextUtils.isEmpty(y10)) {
                            org.telegram.messenger.g0.h3(y0Var.f45415m, 8000L);
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
        j1 j1Var = this.f45272t;
        if (j1Var != null && j1Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && j1Var != null && !TextUtils.equals(j1Var.f44500b, y()))) {
            if (z10) {
                j1 j1Var2 = this.f45272t;
                if (j1Var2 != null && !TextUtils.equals(j1Var2.f44500b, y())) {
                    this.f45272t.h();
                    this.f45272t = null;
                }
                if (this.f45272t == null) {
                    this.f45272t = new j1(this.f45255a, y(), this);
                }
                j1 j1Var3 = this.f45272t;
                boolean z12 = j1Var3.d;
                if (!z12) {
                    String str2 = j1Var3.f44500b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        j1Var3.d("starting; address=" + str2);
                        j1Var3.d = true;
                        j1Var3.f44506j = 0;
                        j1Var3.e();
                        return;
                    }
                    j1Var3.d("start ignored: running=" + j1Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            j1 j1Var4 = this.f45272t;
            if (j1Var4 != null) {
                j1Var4.h();
            }
            org.telegram.messenger.g0.r(this.H);
        }
    }

    public final void d(org.telegram.tgnet.tl.TL_wallet.walletTransaction r7, org.telegram.tgnet.tl.TL_wallet.walletTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.v0.d(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.tgnet.tl.TL_wallet$walletTransaction):void");
    }

    public final void d0(s0 s0Var, boolean z10, p10 p10Var) {
        s0 b10 = s0Var.b();
        P("requesting proof challenge");
        ConnectionsManager.getInstance(this.f45255a).sendRequestTyped(new TL_wallet.getProofChallenge(), new d3.b(1), new d0(this, b10, p10Var, z10, 0));
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
        TL_wallet.WalletState walletState = this.f45258e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            a1 a1Var = this.f45257c;
            if (a1Var == null || !a1Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void f0() {
        int i7;
        this.L = y();
        ArrayList o4 = a1.o(org.telegram.messenger.t0.f27013b, i10.i(this.f45255a).e());
        o4.remove(this.L);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r0 r0Var = (r0) obj;
            hashMap.put(r0Var.f44977a, r0Var);
        }
        this.J.clear();
        int size2 = o4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = o4.get(i11);
            i11++;
            String str = (String) obj2;
            r0 r0Var2 = (r0) hashMap.get(str);
            if (r0Var2 == null) {
                r0Var2 = new r0(new a1(this.f45255a, org.telegram.messenger.t0.f27013b, str));
            }
            a1 a1Var = r0Var2.f44981f;
            synchronized (a1.f44034g) {
                try {
                    try {
                        i7 = a1Var.s().f38598b;
                    } catch (Exception e10) {
                        a1Var.m(e10);
                        i7 = 0;
                    }
                } finally {
                }
            }
            r0Var2.f44978b = i7;
            this.J.add(r0Var2);
            z(str, null);
            v0((k0) this.Q.get(str));
        }
        Collections.sort(this.J, new ow0(4));
    }

    public final boolean g() {
        a1 a1Var;
        TL_wallet.WalletState walletState = this.f45258e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((a1Var = this.f45257c) != null && a1Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void g0() {
        P("requesting gasless info");
        this.D = ConnectionsManager.getInstance(this.f45255a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new d3.b(1), new i(this, 2));
    }

    public final void h(TL_wallet.walletTransaction wallettransaction, boolean z10, String str) {
        o0 o0Var;
        if (!wallettransaction.pending) {
            return;
        }
        u0 H = H();
        wallettransaction.failed = !z10;
        int i7 = 0;
        wallettransaction.pending = false;
        if (!TextUtils.isEmpty(str)) {
            wallettransaction.tx_hash = str;
        }
        if (wallettransaction.key_change) {
            ArrayList arrayList = this.f45271s;
            int size = arrayList.size();
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    o0Var = (o0) obj;
                    if (TextUtils.equals(o0Var.f44782a, wallettransaction.messageHash)) {
                        break;
                    }
                } else {
                    o0Var = null;
                    break;
                }
            }
            if (o0Var != null) {
                if (z10) {
                    o0Var.a();
                } else {
                    s0 s0Var = o0Var.f44783b;
                    if (s0Var != null) {
                        s0Var.close();
                    }
                }
                arrayList.remove(o0Var);
            }
        }
        w10 w10Var = (w10) this.f45269q.remove(wallettransaction);
        if (w10Var != null) {
            w10Var.a(Boolean.valueOf(z10));
        }
        P("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.f28755id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z10);
        H.k();
        H.i();
        a0();
    }

    public final void h0() {
        P("requesting state");
        this.C = ConnectionsManager.getInstance(this.f45255a).sendRequestTyped(new TL_wallet.getState(), new d3.b(1), new i(this, 1));
    }

    public final void i0(p10 p10Var, String str) {
        if (str == null) {
            p10Var.a(null, null);
            return;
        }
        HashMap hashMap = this.P;
        if (hashMap.containsKey(str)) {
            p10Var.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.f45255a).sendRequestTyped(getuseraddresses, new d3.b(1), new j((Object) this, (Object) str, (Object) p10Var, 0));
    }

    public final void j0(TLRPC.User user, p10 p10Var) {
        if (user == null) {
            p10Var.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f28641id);
        HashMap hashMap = this.O;
        if (hashMap.containsKey(valueOf)) {
            p10Var.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f28641id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f28753id;
        int i7 = this.f45255a;
        arrayList.add(mp.u1(i7).s1(user));
        ConnectionsManager.getInstance(i7).sendRequestTyped(getuseraddresses, new d3.b(1), new j(this, (Object) p10Var, (Object) user, 1));
    }

    public final Runnable k(TL_stars.starGiftDepositPayload stargiftdepositpayload, p10 p10Var) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new y(this, zArr, p10Var, j(stargiftdepositpayload), 1));
            return new z(1, zArr);
        } catch (Exception e10) {
            o("emulateDepositNFT: invalid payload", e10);
            org.telegram.messenger.g0.g3(new x(p10Var, e10, 1));
            return new cd0(8);
        }
    }

    public final void k0(String str, w10 w10Var) {
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
        int i7 = this.f45255a;
        ConnectionsManager.getInstance(i7).sendRequestTyped(performapirequest, new d3.b(1), new bi.r6(this, str, w10Var), mp.u1(i7).Q3, 0);
    }

    public final Runnable l(q0 q0Var, p10 p10Var) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new y(this, zArr, p10Var, c0(q0Var), 0));
            return new z(0, zArr);
        } catch (Exception e10) {
            o("emulatePreparedMessage: invalid message", e10);
            org.telegram.messenger.g0.g3(new x(p10Var, e10, 0));
            return new cd0(8);
        }
    }

    public final m m(String str, long j3, String str2, byte[] bArr, p10 p10Var) {
        h0 h0Var = new h0(this, str, j3, str2, bArr, p10Var);
        x0(h0Var);
        return new m(h0Var, 0);
    }

    public final void m0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, w10 w10Var, w10 w10Var2) {
        n0(user, str, j3, str2, bArr, nftitem, str3, w10Var, w10Var2, null, null, null);
    }

    public final void n0(TLRPC.User user, String str, long j3, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, w10 w10Var, w10 w10Var2, l2 l2Var, l2 l2Var2, q0 q0Var) {
        String y10 = y();
        P("send to " + str + ", amount " + j3 + ", when ready...");
        x0(new n(this, str, w10Var, nftitem, y10, str2, bArr, j3, q0Var, l2Var, user, str3, w10Var2, l2Var2, 0));
    }

    public final void o0(q0 q0Var, w10 w10Var, w10 w10Var2, Runnable runnable) {
        String message;
        l2 c02;
        try {
            l2 c03 = c0(q0Var);
            String str = ((k2) c03.f44607b.get(0)).f44556a;
            q0 q0Var2 = q0Var.f44907f;
            if (q0Var2 != null) {
                try {
                    c02 = c0(q0Var2);
                } catch (Exception e10) {
                    o("sendPreparedMessage: invalid gasless message, sending the normal one", e10);
                }
                n0(null, str, q0Var.f44904b, null, null, null, null, w10Var, new o(this, w10Var2, runnable, 1), c03, c02, q0Var);
            }
            c02 = null;
            n0(null, str, q0Var.f44904b, null, null, null, null, w10Var, new o(this, w10Var2, runnable, 1), c03, c02, q0Var);
        } catch (Exception e11) {
            o("sendPreparedMessage: invalid message", e11);
            if (e11.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e11.getMessage();
            }
            w10Var.a(message);
        }
    }

    public final void q0() {
        HashMap hashMap = this.f45273u;
        for (y0 y0Var : hashMap.values()) {
            y0Var.c();
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
                double d2 = d * ((org.telegram.messenger.i0) mp.u1(this.f45255a).A7.f26246l.f13936b).f24630a;
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
                    spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return E;
            }
        }
        return "";
    }

    public final void v0(k0 k0Var) {
        if (k0Var != null) {
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                r0 r0Var = (r0) obj;
                if (TextUtils.equals(r0Var.f44977a, k0Var.f44545a)) {
                    r0Var.f44979c = k0Var.f44546b;
                    boolean z10 = true;
                    r0Var.d = !k0Var.f44548e;
                    byte[] bArr = k0Var.f44547c;
                    if (bArr == null || bArr.length <= 0 || r0Var.f44981f.f(bArr)) {
                        z10 = false;
                    }
                    r0Var.f44980e = z10;
                }
            }
        }
    }

    public final void w0(TL_wallet.WalletState walletState) {
        boolean z10;
        u0 u0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.f45258e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.f45258e = walletState;
                    V();
                    T();
                    if (!z10 && (u0Var = this.f45266n) != null) {
                        u0Var.g();
                        return;
                    }
                }
            }
            z10 = false;
            this.f45258e = walletState;
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
        this.f45274w.add(new WeakReference(runnable));
    }

    public final String y() {
        TL_wallet.WalletState walletState = this.f45258e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final k0 z(final String str, s sVar) {
        HashMap hashMap = this.Q;
        k0 k0Var = (k0) hashMap.get(str);
        if (k0Var != null && !k0Var.f44548e) {
            if (sVar != null) {
                k0Var.f44549f.add(sVar);
            }
            return null;
        }
        int i7 = this.f45255a;
        if (k0Var != null && k0Var.f44548e && ConnectionsManager.getInstance(i7).getCurrentTime() < k0Var.d + 300) {
            if (sVar != null) {
                sVar.a(k0Var);
            }
            return k0Var;
        }
        final ?? obj = new Object();
        obj.f44546b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f44549f = arrayList;
        obj.f44545a = str;
        obj.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (sVar != null) {
            arrayList.add(sVar);
        }
        hashMap.put(str, obj);
        Utilities.B(new p(this, str, (Object) obj, 0), new w10(this) {
            public final v0 f44901b;

            {
                this.f44901b = this;
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
                        v0 v0Var = this.f44901b;
                        int i10 = v0Var.f45255a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new t(v0Var, obj, str2, runnable, 0), mp.u1(i10).Q3, 0);
                        return;
                    default:
                        v0 v0Var2 = this.f44901b;
                        k0 k0Var2 = obj;
                        String str3 = str;
                        v0Var2.k0(str3, new s(v0Var2, k0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new w10(this) {
            public final v0 f44901b;

            {
                this.f44901b = this;
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
                        v0 v0Var = this.f44901b;
                        int i10 = v0Var.f45255a;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new t(v0Var, obj, str2, runnable, 0), mp.u1(i10).Q3, 0);
                        return;
                    default:
                        v0 v0Var2 = this.f44901b;
                        k0 k0Var2 = obj;
                        String str3 = str;
                        v0Var2.k0(str3, new s(v0Var2, k0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        });
        return null;
    }
}
