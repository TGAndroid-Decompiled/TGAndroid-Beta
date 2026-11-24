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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class c {
    public static volatile c[] R = new c[4];
    public static final long[] S = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache T = new LruCache(4096);
    public static DecimalFormat U;
    public int A;
    public int E;
    public final ArrayList J;
    public final List K;
    public String L;
    public final wz4 M;
    public final HashMap N;
    public final HashMap O;
    public final HashMap P;
    public final HashMap Q;
    public final int a;
    public WalletEngine2 b;
    public g15 c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f;
    public final w25 g;
    public final a43 h;
    public Boolean i;
    public String j;
    public long k;
    public boolean l;
    public boolean m;
    public b n;
    public t05 o;
    public p15 t;
    public String v;
    public String y;
    public String z;
    public final ArrayList p = new ArrayList();
    public final HashMap q = new HashMap();
    public final HashMap r = new HashMap();
    public final ArrayList s = new ArrayList();
    public final HashMap u = new HashMap();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final wz4 B = new Runnable(this) {
        public final c b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            t05 t05Var;
            byte b = r2;
            int i = 0;
            c cVar = this.b;
            switch (b) {
                case 0:
                    cVar.e0();
                    cVar.S();
                    return;
                case 1:
                    if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                        ArrayList arrayList = t05Var.b;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (cVar.N((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = cVar.n.b;
                                    int size2 = arrayList2.size();
                                    while (i < size2) {
                                        Object obj2 = arrayList2.get(i);
                                        i++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    cVar.A().d();
                    cVar.G().g();
                    cVar.J();
                    int i3 = cVar.A;
                    long[] jArr = c.S;
                    if (i3 < 7) {
                        wz4 wz4Var = cVar.B;
                        cVar.A = i3 + 1;
                        gl.d3(wz4Var, jArr[i3]);
                        return;
                    }
                    return;
                case 2:
                    p15 p15Var = cVar.t;
                    if (p15Var != null && p15Var.d) {
                        cVar.J();
                        return;
                    }
                    return;
                default:
                    int i4 = cVar.a;
                    t05 t05Var2 = cVar.o;
                    if (t05Var2 != null) {
                        t05Var2.d();
                    }
                    gta.v(i4, false).M(y6c.h(i4).e());
                    return;
            }
        }
    };
    public int C = -1;
    public int D = -1;
    public int F = 0;
    public final HashSet G = new HashSet();
    public final wz4 H = new Runnable(this) {
        public final c b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            t05 t05Var;
            byte b = r2;
            int i = 0;
            c cVar = this.b;
            switch (b) {
                case 0:
                    cVar.e0();
                    cVar.S();
                    return;
                case 1:
                    if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                        ArrayList arrayList = t05Var.b;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (cVar.N((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = cVar.n.b;
                                    int size2 = arrayList2.size();
                                    while (i < size2) {
                                        Object obj2 = arrayList2.get(i);
                                        i++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    cVar.A().d();
                    cVar.G().g();
                    cVar.J();
                    int i3 = cVar.A;
                    long[] jArr = c.S;
                    if (i3 < 7) {
                        wz4 wz4Var = cVar.B;
                        cVar.A = i3 + 1;
                        gl.d3(wz4Var, jArr[i3]);
                        return;
                    }
                    return;
                case 2:
                    p15 p15Var = cVar.t;
                    if (p15Var != null && p15Var.d) {
                        cVar.J();
                        return;
                    }
                    return;
                default:
                    int i4 = cVar.a;
                    t05 t05Var2 = cVar.o;
                    if (t05Var2 != null) {
                        t05Var2.d();
                    }
                    gta.v(i4, false).M(y6c.h(i4).e());
                    return;
            }
        }
    };
    public final wz4 I = new Runnable(this) {
        public final c b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            t05 t05Var;
            byte b = r2;
            int i = 0;
            c cVar = this.b;
            switch (b) {
                case 0:
                    cVar.e0();
                    cVar.S();
                    return;
                case 1:
                    if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                        ArrayList arrayList = t05Var.b;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (cVar.N((TL_wallet.nftItem) obj)) {
                                    ArrayList arrayList2 = cVar.n.b;
                                    int size2 = arrayList2.size();
                                    while (i < size2) {
                                        Object obj2 = arrayList2.get(i);
                                        i++;
                                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                        if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    cVar.A().d();
                    cVar.G().g();
                    cVar.J();
                    int i3 = cVar.A;
                    long[] jArr = c.S;
                    if (i3 < 7) {
                        wz4 wz4Var = cVar.B;
                        cVar.A = i3 + 1;
                        gl.d3(wz4Var, jArr[i3]);
                        return;
                    }
                    return;
                case 2:
                    p15 p15Var = cVar.t;
                    if (p15Var != null && p15Var.d) {
                        cVar.J();
                        return;
                    }
                    return;
                default:
                    int i4 = cVar.a;
                    t05 t05Var2 = cVar.o;
                    if (t05Var2 != null) {
                        t05Var2.d();
                    }
                    gta.v(i4, false).M(y6c.h(i4).e());
                    return;
            }
        }
    };

    public c(int i) {
        this.E = -1;
        boolean z = false;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = DesugarCollections.unmodifiableList(arrayList);
        this.M = new Runnable(this) {
            public final c b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                t05 t05Var;
                byte b = r2;
                int i2 = 0;
                c cVar = this.b;
                switch (b) {
                    case 0:
                        cVar.e0();
                        cVar.S();
                        return;
                    case 1:
                        if ((!TextUtils.isEmpty(cVar.y) || !TextUtils.isEmpty(cVar.z)) && (t05Var = cVar.o) != null && cVar.n != null) {
                            ArrayList arrayList2 = t05Var.b;
                            int size = arrayList2.size();
                            int i22 = 0;
                            while (true) {
                                if (i22 < size) {
                                    Object obj = arrayList2.get(i22);
                                    i22++;
                                    if (cVar.N((TL_wallet.nftItem) obj)) {
                                        ArrayList arrayList22 = cVar.n.b;
                                        int size2 = arrayList22.size();
                                        while (i2 < size2) {
                                            Object obj2 = arrayList22.get(i2);
                                            i2++;
                                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                                            if (wallettransaction.incoming && cVar.N(wallettransaction.nft)) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cVar.A().d();
                        cVar.G().g();
                        cVar.J();
                        int i3 = cVar.A;
                        long[] jArr = c.S;
                        if (i3 < 7) {
                            wz4 wz4Var = cVar.B;
                            cVar.A = i3 + 1;
                            gl.d3(wz4Var, jArr[i3]);
                            return;
                        }
                        return;
                    case 2:
                        p15 p15Var = cVar.t;
                        if (p15Var != null && p15Var.d) {
                            cVar.J();
                            return;
                        }
                        return;
                    default:
                        int i4 = cVar.a;
                        t05 t05Var2 = cVar.o;
                        if (t05Var2 != null) {
                            t05Var2.d();
                        }
                        gta.v(i4, false).M(y6c.h(i4).e());
                        return;
                }
            }
        };
        this.N = new HashMap();
        this.O = new HashMap();
        this.P = new HashMap();
        this.Q = new HashMap();
        this.a = i;
        try {
            this.m = B().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e) {
            n("failed to load prefs", e);
        }
        this.h = new a43(this);
        g0();
        f0();
        O("requesting has walt balance");
        this.E = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new hc((byte) 0), new xz4(this, (byte) 0));
        this.g = new w25(this);
        wz4 wz4Var = this.M;
        Object obj = g15.g;
        synchronized (g15.class) {
            Iterator it = g15.j.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable = (Runnable) weakReference.get();
                if (runnable == null) {
                    g15.j.remove(weakReference);
                } else if (runnable == wz4Var) {
                    z = true;
                }
            }
            if (wz4Var != null && !z) {
                g15.j.add(new WeakReference(wz4Var));
            }
        }
        e0();
    }

    public static Context B() {
        org.telegram.ui.ActionBar.d S2 = LaunchActivity.S();
        if (S2 != null && S2.getContext() != null) {
            return S2.getContext();
        }
        return org.telegram.messenger.a.b;
    }

    public static c C(int i) {
        c cVar;
        c cVar2 = R[i];
        if (cVar2 == null) {
            synchronized (c.class) {
                cVar = R[i];
                if (cVar == null) {
                    c[] cVarArr = R;
                    c cVar3 = new c(i);
                    cVarArr[i] = cVar3;
                    cVar = cVar3;
                }
            }
            return cVar;
        }
        return cVar2;
    }

    public static TL_update.TL_updateSentWalletTransaction F(TLRPC.Updates updates) {
        if (updates != null) {
            TLRPC.Update update = updates.update;
            if (update instanceof TL_update.TL_updateSentWalletTransaction) {
                return (TL_update.TL_updateSentWalletTransaction) update;
            }
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Update update2 = arrayList.get(i);
                i++;
                TLRPC.Update update3 = update2;
                if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                    return (TL_update.TL_updateSentWalletTransaction) update3;
                }
            }
            return null;
        }
        return null;
    }

    public static void I(IdentityHashMap identityHashMap, HashMap hashMap, int i, TL_wallet.walletTransaction wallettransaction, boolean z) {
        TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
        if (z) {
            if (treeSet == null) {
                treeSet = new TreeSet();
                identityHashMap.put(wallettransaction, treeSet);
            }
            treeSet.add(Integer.valueOf(i));
        } else if (treeSet != null) {
            treeSet.remove(Integer.valueOf(i));
        }
        ArrayList s0 = s0(wallettransaction);
        int size = s0.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = s0.get(i2);
            i2++;
            String str = (String) obj;
            TreeSet treeSet2 = (TreeSet) hashMap.get(str);
            if (z) {
                if (treeSet2 == null) {
                    treeSet2 = new TreeSet();
                    hashMap.put(str, treeSet2);
                }
                treeSet2.add(Integer.valueOf(i));
            } else if (treeSet2 != null) {
                treeSet2.remove(Integer.valueOf(i));
            }
        }
    }

    public static boolean K(String str) {
        if (!"WALLET_SEND_CANCELLED".equals(str) && !"PASSCODE_FAILED".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static void O(String str) {
        fa4.b("[gram-wallet] ".concat(str));
    }

    public static boolean P(k27 k27Var, TL_wallet.walletTransaction wallettransaction) {
        if (k27Var != null && k27Var.k != null && wallettransaction != null && k27Var.O3()) {
            TLRPC.Message message = k27Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j = wallettransaction.random_id;
                if (j == 0 || message.random_id != j) {
                    if (wallettransaction.localMessageId == 0 || k27Var.e1() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer.transaction_id)) {
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

    public static void a(ArrayList arrayList, char c, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String r0 = r0(str);
        if (r0 != null) {
            str2 = c + "x" + r0;
        } else {
            str2 = c + "r" + str;
        }
        arrayList.add(str2);
    }

    public static byte[] a0(byte[] bArr) {
        byte[] bArr2 = new byte[215];
        Arrays.fill(bArr2, (byte) 32);
        try {
            boolean z = false;
            int i = 0;
            for (byte b : bArr) {
                if (y05.e(b)) {
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    if (z) {
                        if (i != 215) {
                            int i2 = i + 1;
                            bArr2[i] = 32;
                            i = i2;
                            z = false;
                        } else {
                            throw new IllegalArgumentException("MNEMONIC_BACKUP_TOO_LONG");
                        }
                    }
                    if (i != 215) {
                        bArr2[i] = b;
                        i++;
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

    public static boolean b(String str, String str2) {
        String u0 = u0(str);
        String u02 = u0(str2);
        if (u0 != null && u0.equals(u02)) {
            return true;
        }
        return false;
    }

    public static v25 b0(w05 w05Var) {
        boolean z;
        JSONArray jSONArray = new JSONArray();
        List<w05> list = w05Var.g;
        if (list == null) {
            list = Collections.singletonList(w05Var);
        }
        for (w05 w05Var2 : list) {
            int i = w05Var2.e;
            byte[] bArr = w05Var2.d;
            String str = w05Var2.a;
            if (i == 3) {
                if (str.indexOf(58) >= 0) {
                    if (bArr == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    str = d0(str, z);
                }
                JSONObject put = new JSONObject().put("address", str).put("amount", Long.toString(w05Var2.b));
                byte[] bArr2 = w05Var2.c;
                if (bArr2 != null && bArr2.length > 0) {
                    put.put("payload", Base64.encodeToString(bArr2, 2));
                }
                if (bArr != null && bArr.length > 0) {
                    put.put("stateInit", Base64.encodeToString(bArr, 2));
                }
                jSONArray.put(put);
            } else {
                w26.j("WALLET_UNSUPPORTED_SEND_MODE");
                return null;
            }
        }
        return new v25(new JSONObject().put("messages", jSONArray));
    }

    public static String d0(String str, boolean z) {
        byte b;
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int parseInt = Integer.parseInt(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                if (substring.length() == 64) {
                    byte[] bArr = new byte[36];
                    if (z) {
                        b = 17;
                    } else {
                        b = 81;
                    }
                    bArr[0] = b;
                    bArr[1] = (byte) parseInt;
                    for (int i = 0; i < 32; i++) {
                        int i2 = i << 1;
                        bArr[i + 2] = (byte) Integer.parseInt(substring.substring(i2, i2 + 2), 16);
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < 34; i4++) {
                        i3 ^= (bArr[i4] & 255) << 8;
                        for (int i5 = 0; i5 < 8; i5++) {
                            int i6 = 32768 & i3;
                            int i7 = i3 << 1;
                            if (i6 != 0) {
                                i7 ^= 4129;
                            }
                            i3 = i7 & 65535;
                        }
                    }
                    bArr[34] = (byte) (i3 >>> 8);
                    bArr[35] = (byte) i3;
                    return Base64.encodeToString(bArr, 11);
                }
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static TL_wallet.WalletTransactionPeer h(TLRPC.User user, String str, String str2) {
        TL_wallet.WalletTransactionPeer wallettransactionpeeraddress;
        if (user != null) {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerUser();
            wallettransactionpeeraddress.user_id = user.id;
        } else {
            wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
        }
        wallettransactionpeeraddress.address = str;
        wallettransactionpeeraddress.domain = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? null : null;
        return wallettransactionpeeraddress;
    }

    public static v25 i(TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
        String str = stargiftdepositpayload.nft_address;
        if (indexOf >= 0) {
            str = d0(str, true);
        }
        return new v25(jSONObject.put("messages", jSONArray.put(jSONObject2.put("address", str).put("amount", Long.toString(stargiftdepositpayload.amount)).put("payload", Base64.encodeToString(stargiftdepositpayload.payload, 2)))));
    }

    public static boolean k0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            String r0 = r0(str);
            if (r0 != null && r0.equals(r0(str2))) {
                return true;
            }
        }
        return false;
    }

    public static void m(String str) {
        fa4.d("[gram-wallet] ".concat(str));
    }

    public static void n(String str, Throwable th) {
        fa4.e("[gram-wallet] ".concat(str), th);
    }

    public static void o(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() >= 2) {
            for (int i = 0; i < arrayList.size(); i++) {
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList.get(i);
                if (wallettransaction != null && !TextUtils.isEmpty(wallettransaction.id)) {
                    int i2 = i + 1;
                    while (i2 < arrayList.size()) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList.get(i2);
                        if (wallettransaction2 != null && TextUtils.equals(wallettransaction2.id, wallettransaction.id)) {
                            int i3 = i2 - 1;
                            arrayList.remove(i2);
                            if (wallettransaction.nft == null && wallettransaction2.nft != null) {
                                wallettransaction2.amount += wallettransaction.amount;
                                arrayList.set(i, wallettransaction2);
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
                            i2 = i3;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public static byte[][] o0(byte[] bArr, SecureRandom secureRandom) {
        if (bArr.length == 215) {
            byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, 3, 215);
            try {
                secureRandom.nextBytes(bArr2[0]);
                secureRandom.nextBytes(bArr2[1]);
                for (int i = 0; i < bArr.length; i++) {
                    bArr2[2][i] = (byte) ((bArr[i] ^ bArr2[0][i]) ^ bArr2[1][i]);
                }
                return bArr2;
            } catch (RuntimeException e) {
                for (byte[] bArr3 : bArr2) {
                    Arrays.fill(bArr3, (byte) 0);
                }
                throw e;
            }
        }
        w26.j("INVALID_MNEMONIC_BACKUP_SIZE");
        return null;
    }

    public static SpannableStringBuilder p(String str, CharSequence charSequence, int i) {
        long abs;
        String replace = charSequence.toString().replace((char) 8211, '-');
        String M0 = k96.M0(i, null);
        if (replace.indexOf(46) < 0) {
            try {
                long parseLong = Long.parseLong(replace);
                if (parseLong >= -2147483647L && parseLong <= 2147483647L) {
                    abs = Math.abs(parseLong);
                } else {
                    abs = Math.abs(parseLong % 100) + 100;
                }
                M0 = k96.J0((int) abs, str);
            } catch (NumberFormatException unused) {
            }
        }
        return gl.G2(M0, charSequence, "%1$s");
    }

    public static boolean q0(TL_wallet.walletTransaction wallettransaction) {
        if (!wallettransaction.pending) {
            if (wallettransaction.nft != null || (wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static SpannableStringBuilder r(long j, boolean z) {
        return p("GramCapital", s(j, z), 2131749344);
    }

    public static java.lang.String r0(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c.r0(java.lang.String):java.lang.String");
    }

    public static String s(long j, boolean z) {
        if ((j > -10000000 && j < 10000000) || z) {
            return jva.J0(j);
        }
        DecimalFormat decimalFormat = U;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));
            U = decimalFormat;
        }
        return decimalFormat.format(j / 1.0E9d);
    }

    public static ArrayList s0(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = new ArrayList(5);
        if (wallettransaction != null) {
            if (!TextUtils.isEmpty(wallettransaction.id)) {
                arrayList.add("i" + wallettransaction.id);
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

    public static String t(long j, boolean z) {
        boolean z2;
        int i;
        BigDecimal stripTrailingZeros;
        if (j > -1000000000 && j < 1000000000) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            if (z2) {
                return s(j, true);
            }
            i = 4;
        } else if (z2) {
            i = 2;
        } else {
            i = 3;
        }
        BigDecimal scale = BigDecimal.valueOf(j, 9).setScale(i, RoundingMode.DOWN);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static boolean t0(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        if ((TextUtils.isEmpty(wallettransaction.id) || !TextUtils.equals(wallettransaction.id, wallettransaction2.id)) && !k0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !k0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
            if (!wallettransaction.incoming && !wallettransaction2.incoming) {
                if (!k0(wallettransaction.gaslessMessageBodyHash, wallettransaction2.gaslessMessageBodyHash) && !k0(wallettransaction.normalMessageBodyHash, wallettransaction2.normalMessageBodyHash)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder u(String str, float f) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(46);
        if (indexOf >= 0 && (i = indexOf + 1) < str.length()) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(f), i, str.length(), 33);
        }
        return spannableStringBuilder;
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
            StringBuilder sb = new StringBuilder();
            sb.append((int) decode[1]);
            sb.append(':');
            for (int i = 2; i < 34; i++) {
                sb.append(Character.forDigit((decode[i] >> 4) & 15, 16));
                sb.append(Character.forDigit(decode[i] & 15, 16));
            }
            return sb.toString();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static SpannableStringBuilder v(long j) {
        return w(j, false);
    }

    public static SpannableStringBuilder w(long j, boolean z) {
        return p("Grams", s(j, z), 2131749315);
    }

    public final t05 A() {
        t05 t05Var = this.o;
        if (t05Var == null) {
            t05 t05Var2 = new t05(this);
            this.o = t05Var2;
            return t05Var2;
        }
        return t05Var;
    }

    public final byte[] D() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).public_key;
    }

    public final void E(boolean z, boolean z2, boolean z3, i8c i8cVar) {
        O("getSecretPhrase: whenReady...");
        x0(new ut2(this, i8cVar, z3, z, z2, (byte) 2));
    }

    public final b G() {
        b bVar = this.n;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.n = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final void H(boolean z, boolean z2, y05 y05Var, p8c p8cVar) {
        try {
            if (!WalletEngine2.isTgWalletSecretPhrase(y05Var)) {
                p8cVar.a("WRONG_CONTRACT");
                return;
            }
        } catch (Exception unused) {
        }
        try {
            byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(y05Var);
            byte[] secretPhraseToAnchorPublicKey = WalletEngine2.secretPhraseToAnchorPublicKey(y05Var);
            y05 b = y05Var.b();
            O("import wallet: requesting proof challenge");
            cy7.a(this.a, null, new eu0(this, b, p8cVar, secretPhraseToAnchorPublicKey, (byte) 3), null, null, new ev1(this, p8cVar, secretPhraseToPublicKey, b, (byte) 1), z, z2, new h24(new iu4(b, (byte) 7), (c05) null));
        } catch (Exception unused2) {
            p8cVar.a("INVALID_PHRASE");
        }
    }

    public final void J() {
        b bVar = this.n;
        if (bVar != null) {
            bVar.g();
        }
        if (this.C >= 0) {
            return;
        }
        g0();
    }

    public final boolean L() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null && this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean N(TL_wallet.nftItem nftitem) {
        if (nftitem == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.y)) {
            return b(nftitem.address, this.y);
        }
        TL_stars.StarGift starGift = nftitem.gift;
        if (!(starGift instanceof TL_stars.TL_starGiftUnique) || !TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, this.z)) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c.Q():boolean");
    }

    public final boolean R() {
        if (this.m && !gba.r.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void S() {
        kk7.f(this.a).k(kk7.c4, this);
    }

    public final void T(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c.T(org.json.JSONObject):void");
    }

    public final void U() {
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
        g15 g15Var = this.c;
        if (g15Var != null && !TextUtils.equals(g15Var.c, str)) {
            if (str == null) {
                O("received empty state, leaving wallet storage of " + this.c.c);
            } else {
                StringBuilder p = ug8.p("received new state of ", str, ", leaving wallet storage of ");
                p.append(this.c.c);
                O(p.toString());
            }
            this.c = null;
        }
        if (!TextUtils.isEmpty(str) && this.c == null) {
            O("setting up wallet storage of " + str);
            this.c = new g15(this.a, org.telegram.messenger.a.b, str);
            O("storage public keys = " + this.c.n().length);
        }
        t05 t05Var = this.o;
        if (t05Var != null && !TextUtils.equals(t05Var.e, str)) {
            t05Var.e = str;
            t05Var.b();
        }
        if (this.b != null && !TextUtils.equals(this.d, str)) {
            this.b.close();
            this.b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.b == null || !TextUtils.equals(this.d, str))) {
            if (this.b != null) {
                O("closing wallet-engine of " + this.d);
                this.b.close();
                this.b = null;
            }
            O("creating wallet-engine for " + str);
            try {
                int i = this.a;
                this.d = str;
                this.b = new WalletEngine2(i, str, bArr);
            } catch (Exception e) {
                n("failed to create engine!", e);
                this.d = null;
            }
        }
        int i2 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                Runnable runnable = (Runnable) ((WeakReference) obj).get();
                if (runnable != null) {
                    gl.c3(runnable);
                }
            }
            this.w.clear();
        }
        if ((this.e instanceof TL_wallet.TL_walletState) && this.b != null && this.f != null) {
            ArrayList arrayList2 = this.x;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    gl.c3(runnable2);
                }
            }
            this.x.clear();
        }
        if (!TextUtils.equals(this.L, str)) {
            e0();
        }
        Z();
    }

    public final void V(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && r0(str) != null) {
            ArrayList arrayList = this.p;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = wallettransaction.messageHash;
                String str3 = tL_updateSentWalletTransaction.msg_hash;
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && k0(str2, str3)) {
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
                G().k();
                G().i();
            }
        }
    }

    public final void W(TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo) {
        this.f = tL_updateWalletGaslessInfo;
        U();
        S();
    }

    public final void X(TL_update.TL_updateWalletState tL_updateWalletState) {
        w0(tL_updateWalletState.state);
    }

    public final void Y() {
        p0();
        this.p.clear();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y05 y05Var = ((a) obj).b;
            if (y05Var != null) {
                y05Var.close();
            }
        }
        arrayList.clear();
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
            bVar.b.clear();
            bVar.d.clear();
            bVar.e.clear();
            bVar.f.clear();
            bVar.g = "";
            bVar.h = false;
            bVar.k();
            this.n.k();
            this.n.i();
        }
        Z();
        this.f = null;
        f0();
    }

    public final void Z() {
        boolean z;
        boolean z2;
        if (!TextUtils.equals(this.v, x())) {
            p0();
            this.v = x();
        }
        if (M() && !TextUtils.isEmpty(x())) {
            HashMap hashMap = this.u;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((c15) hashMap.get(wallettransaction)).b, wallettransaction.messageHash)) {
                    ((c15) hashMap.remove(wallettransaction)).c();
                }
            }
            ArrayList arrayList2 = this.p;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    String x = x();
                    c15 c15Var = new c15(this.a, str, x, new yz4(this, wallettransaction2), new yz4(this, wallettransaction2));
                    hashMap.put(wallettransaction2, c15Var);
                    if (!c15Var.f && !TextUtils.isEmpty(str)) {
                        c15Var.f = true;
                        c15Var.h = 0;
                        c15Var.b();
                        if (!TextUtils.isEmpty(x)) {
                            gl.d3(c15Var.m, 8000L);
                        }
                    }
                }
            }
        } else {
            p0();
        }
        if (M() && !TextUtils.isEmpty(x()) && !this.G.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        p15 p15Var = this.t;
        if (p15Var != null && p15Var.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z || (z2 && p15Var != null && !TextUtils.equals(p15Var.b, x()))) {
            p15 p15Var2 = this.t;
            if (z) {
                if (p15Var2 != null && !TextUtils.equals(p15Var2.b, x())) {
                    this.t.h();
                    this.t = null;
                }
                p15 p15Var3 = this.t;
                if (p15Var3 == null) {
                    p15Var3 = new p15(this.a, x(), this);
                    this.t = p15Var3;
                }
                boolean z3 = p15Var3.d;
                if (!z3) {
                    String str2 = p15Var3.b;
                    if (!z3 && !TextUtils.isEmpty(str2)) {
                        p15Var3.d("starting; address=" + str2);
                        p15Var3.d = true;
                        p15Var3.j = 0;
                        p15Var3.e();
                        return;
                    }
                    p15Var3.d("start ignored: running=" + p15Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            if (p15Var2 != null) {
                p15Var2.h();
            }
            gl.r(this.H);
        }
    }

    public final void c(org.telegram.tgnet.tl.TL_wallet.walletTransaction r7, org.telegram.tgnet.tl.TL_wallet.walletTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c.c(org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.tgnet.tl.TL_wallet$walletTransaction):void");
    }

    public final void c0(y05 y05Var, boolean z, i8c i8cVar) {
        y05 b = y05Var.b();
        O("requesting proof challenge");
        ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getProofChallenge(), new hc((byte) 0), new k05(this, b, i8cVar, z, (byte) 0));
    }

    public final void d(TL_wallet.walletTransaction wallettransaction, TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        wallettransaction.messageHash = tL_updateSentWalletTransaction.msg_hash;
        wallettransaction.gasless = tL_updateSentWalletTransaction.gasless;
        TL_wallet.walletTransaction wallettransaction2 = tL_updateSentWalletTransaction.transaction;
        if (wallettransaction2 != null) {
            c(wallettransaction, wallettransaction2);
        } else {
            Z();
        }
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            g15 g15Var = this.c;
            if (g15Var == null || !g15Var.f(tL_walletState.public_key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void e0() {
        int i;
        this.L = x();
        ArrayList o = g15.o(org.telegram.messenger.a.b, y6c.h(this.a).e());
        o.remove(this.L);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            x05 x05Var = (x05) obj;
            hashMap.put(x05Var.a, x05Var);
        }
        this.J.clear();
        int size2 = o.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = o.get(i3);
            i3++;
            String str = (String) obj2;
            x05 x05Var2 = (x05) hashMap.get(str);
            if (x05Var2 == null) {
                x05Var2 = new x05(new g15(this.a, org.telegram.messenger.a.b, str));
            }
            g15 g15Var = x05Var2.f;
            synchronized (g15.g) {
                try {
                    i = g15Var.s().a;
                } catch (Exception e) {
                    g15Var.m(e);
                    i = 0;
                }
            }
            x05Var2.b = i;
            this.J.add(x05Var2);
            y(str, null);
            v0((r05) this.Q.get(str));
        }
        Collections.sort(this.J, new mz2((byte) 20));
    }

    public final boolean f() {
        g15 g15Var;
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (tL_walletState.backup_enabled || ((g15Var = this.c) != null && g15Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void f0() {
        O("requesting gasless info");
        this.D = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new hc((byte) 0), new xz4(this, (byte) 2));
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, boolean z, String str) {
        a aVar;
        if (!wallettransaction.pending) {
            return;
        }
        b G = G();
        wallettransaction.failed = !z;
        int i = 0;
        wallettransaction.pending = false;
        if (!TextUtils.isEmpty(str)) {
            wallettransaction.tx_hash = str;
        }
        if (wallettransaction.key_change) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    aVar = (a) obj;
                    if (TextUtils.equals(aVar.a, wallettransaction.messageHash)) {
                        break;
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                if (z) {
                    aVar.a();
                } else {
                    y05 y05Var = aVar.b;
                    if (y05Var != null) {
                        y05Var.close();
                    }
                }
                arrayList.remove(aVar);
            }
        }
        p8c p8cVar = (p8c) this.q.remove(wallettransaction);
        if (p8cVar != null) {
            p8cVar.a(Boolean.valueOf(z));
        }
        O("completed pending transaction: msg_hash=" + wallettransaction.messageHash + ", body_hash=" + wallettransaction.gaslessMessageBodyHash + ", transaction_id=" + wallettransaction.id + ", tx_hash=" + wallettransaction.tx_hash + ", success=" + z);
        G.k();
        G.i();
        Z();
    }

    public final void g0() {
        O("requesting state");
        this.C = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getState(), new hc((byte) 0), new xz4(this, (byte) 1));
    }

    public final void h0(i8c i8cVar, String str) {
        if (str == null) {
            i8cVar.a(null, null);
            return;
        }
        HashMap hashMap = this.P;
        if (hashMap.containsKey(str)) {
            i8cVar.a((TL_wallet.walletUserAddress) hashMap.get(str), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.addresses.add(str);
        ConnectionsManager.getInstance(this.a).sendRequestTyped(getuseraddresses, new hc((byte) 0), new p(this, str, i8cVar, (byte) 12));
    }

    public final void i0(TLRPC.User user, i8c i8cVar) {
        if (user == null) {
            i8cVar.a(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.id);
        HashMap hashMap = this.O;
        if (hashMap.containsKey(valueOf)) {
            i8cVar.a((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.id;
        int i = this.a;
        arrayList.add(na7.q1(i).o1(user));
        ConnectionsManager.getInstance(i).sendRequestTyped(getuseraddresses, new hc((byte) 0), new p(this, i8cVar, user, (byte) 13));
    }

    public final Runnable j(TL_stars.starGiftDepositPayload stargiftdepositpayload, i8c i8cVar) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new e05(this, zArr, i8cVar, i(stargiftdepositpayload), (byte) 1));
            return new il1(zArr, (byte) 4);
        } catch (Exception e) {
            n("emulateDepositNFT: invalid payload", e);
            gl.c3(new d05(i8cVar, e, (byte) 1));
            return new jc((byte) 10);
        }
    }

    public final void j0(p8c p8cVar, String str) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z = hv0.R0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i = this.a;
        ConnectionsManager.getInstance(i).sendRequestTyped(performapirequest, new hc((byte) 0), new ae2(this, str, p8cVar), na7.q1(i).r3, 0);
    }

    public final Runnable k(w05 w05Var, i8c i8cVar) {
        try {
            boolean[] zArr = new boolean[1];
            x0(new e05(this, zArr, i8cVar, b0(w05Var), (byte) 0));
            return new il1(zArr, (byte) 3);
        } catch (Exception e) {
            n("emulatePreparedMessage: invalid message", e);
            gl.c3(new d05(i8cVar, e, (byte) 0));
            return new jc((byte) 10);
        }
    }

    public final iu4 l(String str, long j, String str2, byte[] bArr, i8c i8cVar) {
        o05 o05Var = new o05(this, str, j, str2, bArr, i8cVar);
        x0(o05Var);
        return new iu4(o05Var, (byte) 6);
    }

    public final void l0(TLRPC.User user, String str, long j, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, p8c p8cVar, p8c p8cVar2) {
        m0(user, str, j, str2, bArr, nftitem, str3, p8cVar, p8cVar2, null, null, null);
    }

    public final void m0(TLRPC.User user, String str, long j, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, p8c p8cVar, p8c p8cVar2, v25 v25Var, v25 v25Var2, w05 w05Var) {
        String x = x();
        O("send to " + str + ", amount " + j + ", when ready...");
        x0(new zz4(this, str, p8cVar, nftitem, x, str2, bArr, j, w05Var, v25Var, user, str3, p8cVar2, v25Var2, (byte) 0));
    }

    public final void n0(w05 w05Var, p8c p8cVar, p8c p8cVar2, Runnable runnable) {
        String message;
        v25 b0;
        try {
            v25 b02 = b0(w05Var);
            String str = ((u25) b02.b.get(0)).a;
            w05 w05Var2 = w05Var.f;
            if (w05Var2 != null) {
                try {
                    b0 = b0(w05Var2);
                } catch (Exception e) {
                    n("sendPreparedMessage: invalid gasless message, sending the normal one", e);
                }
                m0(null, str, w05Var.b, null, null, null, null, p8cVar, new ht(this, p8cVar2, runnable, (byte) 19), b02, b0, w05Var);
            }
            b0 = null;
            m0(null, str, w05Var.b, null, null, null, null, p8cVar, new ht(this, p8cVar2, runnable, (byte) 19), b02, b0, w05Var);
        } catch (Exception e2) {
            n("sendPreparedMessage: invalid message", e2);
            if (e2.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e2.getMessage();
            }
            p8cVar.a(message);
        }
    }

    public final void p0() {
        HashMap hashMap = this.u;
        for (c15 c15Var : hashMap.values()) {
            c15Var.c();
        }
        hashMap.clear();
    }

    public final CharSequence q(long j, boolean z) {
        RoundingMode roundingMode;
        BigDecimal scale;
        int i;
        char charAt;
        String p;
        String g = this.h.g();
        TL_wallet.currencyRate j2 = this.h.j();
        String str = "";
        if (j2 != null) {
            String str2 = j2.symbol;
            String str3 = j2.thousandsSeparator;
            String str4 = j2.decimalSeparator;
            boolean z2 = j2.symbolLeft;
            boolean z3 = j2.spaceBetween;
            boolean z4 = j2.dropZeros;
            int i2 = j2.exp;
            double d = j2.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d2 = d * na7.q1(this.a).k4.k.i;
                int min = Math.min(i2, 20);
                boolean z5 = false;
                int max = Math.max(0, min);
                BigDecimal movePointLeft = BigDecimal.valueOf(j).multiply(BigDecimal.valueOf(d2)).movePointLeft(9);
                if (z && movePointLeft.signum() != 0) {
                    roundingMode = RoundingMode.HALF_UP;
                    BigDecimal round = movePointLeft.round(new MathContext(3, roundingMode));
                    if (round.signum() == 0) {
                        scale = new BigDecimal(BigInteger.ZERO, 0);
                    } else {
                        scale = round.stripTrailingZeros();
                    }
                    i = Math.max(max, Math.min(20, Math.max(0, scale.scale())));
                } else {
                    roundingMode = RoundingMode.HALF_UP;
                    scale = movePointLeft.setScale(max, roundingMode);
                    i = max;
                }
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z6 = !isEmpty;
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
                decimalFormat.setGroupingUsed(z6);
                if (z4) {
                    max = 0;
                }
                decimalFormat.setMinimumFractionDigits(max);
                decimalFormat.setMaximumFractionDigits(i);
                decimalFormat.setRoundingMode(roundingMode);
                if (scale.signum() < 0) {
                    z5 = true;
                }
                String format = decimalFormat.format(scale.abs());
                if (!TextUtils.isEmpty(str2)) {
                    g = str2;
                }
                if (z3) {
                    str = " ";
                }
                if (z2) {
                    p = tb4.p(g, str, format);
                } else {
                    p = tb4.p(format, str, g);
                }
                if (z5) {
                    p = "-".concat(p);
                }
                int indexOf = p.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p);
                    spannableStringBuilder.setSpan(new z3c(gl.n1("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
                    return spannableStringBuilder;
                }
                return p;
            }
        }
        return "";
    }

    public final void v0(r05 r05Var) {
        if (r05Var != null) {
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x05 x05Var = (x05) obj;
                if (TextUtils.equals(x05Var.a, r05Var.a)) {
                    x05Var.c = r05Var.b;
                    boolean z = true;
                    x05Var.d = !r05Var.e;
                    byte[] bArr = r05Var.c;
                    if (bArr == null || bArr.length <= 0 || x05Var.f.f(bArr)) {
                        z = false;
                    }
                    x05Var.e = z;
                }
            }
        }
    }

    public final void w0(TL_wallet.WalletState walletState) {
        boolean z;
        b bVar;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z = true;
                    this.e = walletState;
                    U();
                    S();
                    if (!z && (bVar = this.n) != null) {
                        bVar.g();
                        return;
                    }
                }
            }
            z = false;
            this.e = walletState;
            U();
            S();
            if (!z) {
            }
        }
    }

    public final String x() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final void x0(Runnable runnable) {
        if (M()) {
            runnable.run();
            return;
        }
        this.w.add(new WeakReference(runnable));
    }

    public final r05 y(final String str, au0 au0Var) {
        HashMap hashMap = this.Q;
        r05 r05Var = (r05) hashMap.get(str);
        int i = this.a;
        if (r05Var != null) {
            boolean z = r05Var.e;
            if (!z) {
                if (au0Var != null) {
                    r05Var.f.add(au0Var);
                }
                return null;
            } else if (z && ConnectionsManager.getInstance(i).getCurrentTime() < r05Var.d + 300) {
                if (au0Var != null) {
                    au0Var.a(r05Var);
                }
                return r05Var;
            }
        }
        final ?? obj = new Object();
        obj.b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f = arrayList;
        obj.a = str;
        obj.d = ConnectionsManager.getInstance(i).getCurrentTime();
        if (au0Var != null) {
            arrayList.add(au0Var);
        }
        hashMap.put(str, obj);
        Utilities.B(new jf4(this, str, (Object) obj, (byte) 7), new p8c(this) {
            public final c b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj2) {
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj2;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb = new StringBuilder("address=");
                        String str2 = str;
                        sb.append(Uri.encode(str2));
                        sb.append("&use_v2=false");
                        performapirequest.query = sb.toString();
                        c cVar = this.b;
                        int i2 = cVar.a;
                        ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new eu0(cVar, obj, str2, runnable, (byte) 2), na7.q1(i2).r3, 0);
                        return;
                    default:
                        c cVar2 = this.b;
                        r05 r05Var2 = obj;
                        String str3 = str;
                        cVar2.j0(new au0(cVar2, r05Var2, str3, (Runnable) obj2, (byte) 12), str3);
                        return;
                }
            }
        }, new p8c(this) {
            public final c b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj2) {
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj2;
                        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
                        performapirequest.endpoint = "/api/v3/walletInformation";
                        StringBuilder sb = new StringBuilder("address=");
                        String str2 = str;
                        sb.append(Uri.encode(str2));
                        sb.append("&use_v2=false");
                        performapirequest.query = sb.toString();
                        c cVar = this.b;
                        int i2 = cVar.a;
                        ConnectionsManager.getInstance(i2).sendRequestTyped(performapirequest, new hc((byte) 0), new eu0(cVar, obj, str2, runnable, (byte) 2), na7.q1(i2).r3, 0);
                        return;
                    default:
                        c cVar2 = this.b;
                        r05 r05Var2 = obj;
                        String str3 = str;
                        cVar2.j0(new au0(cVar2, r05Var2, str3, (Runnable) obj2, (byte) 12), str3);
                        return;
                }
            }
        });
        return null;
    }

    public final long z() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return 0L;
        }
        return ((TL_wallet.TL_walletState) walletState).balance;
    }
}
