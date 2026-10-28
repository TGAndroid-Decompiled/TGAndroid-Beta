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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.r61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.dv;
public final class l0 {
    public static volatile l0[] O = new l0[4];
    public static final long[] P = {1500, 2500, 4000, 6000, 10000, 15000, 20000};
    public static final LruCache Q = new LruCache(4096);
    public static DecimalFormat R;
    public int C;
    public final ArrayList G;
    public final List H;
    public String I;
    public final g J;
    public final HashMap K;
    public final HashMap L;
    public final HashMap M;
    public final HashMap N;
    public final int f36834a;
    public WalletEngine2 f36835b;
    public p0 f36836c;
    public String d;
    public TL_wallet.WalletState e;
    public TL_update.TL_updateWalletGaslessInfo f36837f;
    public final e2 f36838g;
    public final f h;
    public Boolean f36839i;
    public String f36840j;
    public long f36841k;
    public boolean f36842l;
    public boolean f36843m;
    public k0 f36844n;
    public d0 f36845o;
    public z0 f36849s;
    public String f36851u;
    public String f36853x;
    public int f36854y;
    public final ArrayList f36846p = new ArrayList();
    public final HashMap f36847q = new HashMap();
    public final ArrayList f36848r = new ArrayList();
    public final HashMap f36850t = new HashMap();
    public final ArrayList v = new ArrayList();
    public final ArrayList f36852w = new ArrayList();
    public final g f36855z = new Runnable(this) {
        public final l0 f36608b;

        {
            this.f36608b = this;
        }

        @Override
        public final void run() {
            d0 d0Var;
            k0 k0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    l0 l0Var = this.f36608b;
                    if (!TextUtils.isEmpty(l0Var.f36853x) && (d0Var = l0Var.f36845o) != null && d0Var.d(l0Var.f36853x) && (k0Var = l0Var.f36844n) != null) {
                        ArrayList arrayList = k0Var.f36788b;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && l0.b(nftitem.address, l0Var.f36853x)) {
                                return;
                            }
                        }
                    }
                    if (l0Var.f36845o == null) {
                        l0Var.f36845o = new d0(l0Var);
                    }
                    d0 d0Var2 = l0Var.f36845o;
                    if (!d0Var2.f36472j) {
                        d0Var2.b();
                        d0Var2.f(true);
                    }
                    l0Var.B().g();
                    l0Var.E();
                    int i11 = l0Var.f36854y;
                    long[] jArr = l0.P;
                    if (i11 < 7) {
                        g gVar = l0Var.f36855z;
                        l0Var.f36854y = i11 + 1;
                        AndroidUtilities.runOnUIThread(gVar, jArr[i11]);
                        return;
                    }
                    return;
                case 1:
                    l0 l0Var2 = this.f36608b;
                    z0 z0Var = l0Var2.f36849s;
                    if (z0Var != null && z0Var.d) {
                        l0Var2.E();
                        return;
                    }
                    return;
                default:
                    l0 l0Var3 = this.f36608b;
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
    public final g F = new Runnable(this) {
        public final l0 f36608b;

        {
            this.f36608b = this;
        }

        @Override
        public final void run() {
            d0 d0Var;
            k0 k0Var;
            TL_wallet.nftItem nftitem;
            switch (r2) {
                case 0:
                    l0 l0Var = this.f36608b;
                    if (!TextUtils.isEmpty(l0Var.f36853x) && (d0Var = l0Var.f36845o) != null && d0Var.d(l0Var.f36853x) && (k0Var = l0Var.f36844n) != null) {
                        ArrayList arrayList = k0Var.f36788b;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && l0.b(nftitem.address, l0Var.f36853x)) {
                                return;
                            }
                        }
                    }
                    if (l0Var.f36845o == null) {
                        l0Var.f36845o = new d0(l0Var);
                    }
                    d0 d0Var2 = l0Var.f36845o;
                    if (!d0Var2.f36472j) {
                        d0Var2.b();
                        d0Var2.f(true);
                    }
                    l0Var.B().g();
                    l0Var.E();
                    int i11 = l0Var.f36854y;
                    long[] jArr = l0.P;
                    if (i11 < 7) {
                        g gVar = l0Var.f36855z;
                        l0Var.f36854y = i11 + 1;
                        AndroidUtilities.runOnUIThread(gVar, jArr[i11]);
                        return;
                    }
                    return;
                case 1:
                    l0 l0Var2 = this.f36608b;
                    z0 z0Var = l0Var2.f36849s;
                    if (z0Var != null && z0Var.d) {
                        l0Var2.E();
                        return;
                    }
                    return;
                default:
                    l0 l0Var3 = this.f36608b;
                    l0Var3.W();
                    l0Var3.L();
                    return;
            }
        }
    };

    public l0(int i10) {
        boolean z10 = false;
        this.C = -1;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = DesugarCollections.unmodifiableList(arrayList);
        this.J = new Runnable(this) {
            public final l0 f36608b;

            {
                this.f36608b = this;
            }

            @Override
            public final void run() {
                d0 d0Var;
                k0 k0Var;
                TL_wallet.nftItem nftitem;
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f36608b;
                        if (!TextUtils.isEmpty(l0Var.f36853x) && (d0Var = l0Var.f36845o) != null && d0Var.d(l0Var.f36853x) && (k0Var = l0Var.f36844n) != null) {
                            ArrayList arrayList2 = k0Var.f36788b;
                            int size = arrayList2.size();
                            int i102 = 0;
                            while (i102 < size) {
                                Object obj = arrayList2.get(i102);
                                i102++;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                if (wallettransaction.incoming && (nftitem = wallettransaction.nft) != null && l0.b(nftitem.address, l0Var.f36853x)) {
                                    return;
                                }
                            }
                        }
                        if (l0Var.f36845o == null) {
                            l0Var.f36845o = new d0(l0Var);
                        }
                        d0 d0Var2 = l0Var.f36845o;
                        if (!d0Var2.f36472j) {
                            d0Var2.b();
                            d0Var2.f(true);
                        }
                        l0Var.B().g();
                        l0Var.E();
                        int i11 = l0Var.f36854y;
                        long[] jArr = l0.P;
                        if (i11 < 7) {
                            g gVar = l0Var.f36855z;
                            l0Var.f36854y = i11 + 1;
                            AndroidUtilities.runOnUIThread(gVar, jArr[i11]);
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var2 = this.f36608b;
                        z0 z0Var = l0Var2.f36849s;
                        if (z0Var != null && z0Var.d) {
                            l0Var2.E();
                            return;
                        }
                        return;
                    default:
                        l0 l0Var3 = this.f36608b;
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
        this.f36834a = i10;
        try {
            this.f36843m = w().getSharedPreferences("gram_wallet", 0).getBoolean("passcode", true);
        } catch (Exception e) {
            k("failed to load prefs", e);
        }
        this.h = new f(this);
        Y();
        X();
        H("requesting has walt balance");
        this.C = ConnectionsManager.getInstance(this.f36834a).sendRequestTyped(new TL_wallet.getExistingWaltBalance(), new Object(), new i(this, 0));
        this.f36838g = new e2(this);
        g gVar = this.J;
        Object obj = p0.f37097f;
        synchronized (p0.class) {
            try {
                Iterator it = p0.f37099i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        p0.f37099i.remove(weakReference);
                    } else if (runnable == gVar) {
                        z10 = true;
                    }
                }
                if (gVar != null && !z10) {
                    p0.f37099i.add(new WeakReference(gVar));
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
        FileLog.d("[gram-wallet] " + str);
    }

    public static boolean I(MessageObject messageObject, TL_wallet.walletTransaction wallettransaction) {
        if (messageObject != null && messageObject.messageOwner != null && wallettransaction != null && messageObject.isOutOwner()) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                long j10 = wallettransaction.random_id;
                if (j10 == 0 || message.random_id != j10) {
                    if (wallettransaction.localMessageId == 0 || messageObject.getId() != wallettransaction.localMessageId) {
                        if (!TextUtils.isEmpty(wallettransaction.f22292id) && TextUtils.equals(wallettransaction.f22292id, tL_messageActionGramTransfer.transaction_id)) {
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
            wallettransactionpeeraddress.user_id = user.f22177id;
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
            if (!TextUtils.isEmpty(wallettransaction.f22292id)) {
                arrayList.add("i" + wallettransaction.f22292id);
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
        if ((TextUtils.isEmpty(wallettransaction.f22292id) || !TextUtils.equals(wallettransaction.f22292id, wallettransaction2.f22292id)) && !c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) && !c0(wallettransaction.messageHash, wallettransaction2.messageHash)) {
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
        FileLog.e("[gram-wallet] " + str);
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
        FileLog.e("[gram-wallet] " + str, th2);
    }

    public static SpannableStringBuilder l(String str, CharSequence charSequence, int i10) {
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

    public static SpannableStringBuilder n(long j10, boolean z10) {
        return l("GramCapital", o(j10, z10), R.string.GramCapital_other);
    }

    public static String o(long j10, boolean z10) {
        if ((j10 > -10000000 && j10 < 10000000) || z10) {
            return dd.L0(j10);
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
        return l("Grams", o(j10, z10), R.string.Grams_other);
    }

    public static Context w() {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            return U.getContext();
        }
        return ApplicationLoader.applicationContext;
    }

    public static l0 x(int i10) {
        l0 l0Var;
        l0 l0Var2 = O[i10];
        if (l0Var2 == null) {
            synchronized (l0.class) {
                try {
                    l0Var = O[i10];
                    if (l0Var == null) {
                        l0[] l0VarArr = O;
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

    public final k0 B() {
        if (this.f36844n == null) {
            this.f36844n = new k0(this);
        }
        return this.f36844n;
    }

    public final void C(boolean z10, boolean z11, i0 i0Var, Utilities.Callback callback) {
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
            H("import wallet: requesting proof challenge");
            r2.a(this.f36834a, null, new p(this, b10, callback, secretPhraseToAnchorPublicKey, 2), null, null, new t(this, callback, secretPhraseToPublicKey, b10), z10, z11, new ag.b1(new m(b10, 2), 2));
        } catch (Exception unused2) {
            callback.run("INVALID_PHRASE");
        }
    }

    public final void E() {
        k0 k0Var = this.f36844n;
        if (k0Var != null) {
            k0Var.g();
        }
        if (this.A >= 0) {
            return;
        }
        Y();
    }

    public final boolean F() {
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = this.f36837f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available && tL_updateWalletGaslessInfo.left > 0 && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f36835b != null && this.f36836c != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        p0 p0Var;
        boolean z10;
        if (!(this.e instanceof TL_wallet.TL_walletState) || (p0Var = this.f36836c) == null) {
            return false;
        }
        p0Var.getClass();
        synchronized (p0.f37097f) {
            try {
                try {
                    z10 = p0Var.r().f29792c;
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

    public final boolean K() {
        if (this.f36843m && !SharedConfig.passcodeHash.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void L() {
        NotificationCenter.getInstance(this.f36834a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this);
    }

    public final void M(org.json.JSONObject r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l0.M(org.json.JSONObject):void");
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
        p0 p0Var = this.f36836c;
        if (p0Var != null && !TextUtils.equals(p0Var.f37102c, str)) {
            if (str == null) {
                H("received empty state, leaving wallet storage of " + this.f36836c.f37102c);
            } else {
                StringBuilder v = a1.g.v("received new state of ", str, ", leaving wallet storage of ");
                v.append(this.f36836c.f37102c);
                H(v.toString());
            }
            this.f36836c = null;
        }
        if (!TextUtils.isEmpty(str) && this.f36836c == null) {
            H("setting up wallet storage of " + str);
            this.f36836c = new p0(ApplicationLoader.applicationContext, str, this.f36834a);
            H("storage public keys = " + this.f36836c.m().length);
        }
        d0 d0Var = this.f36845o;
        if (d0Var != null && !TextUtils.equals(d0Var.e, str)) {
            d0Var.e = str;
            d0Var.c();
        }
        if (this.f36835b != null && !TextUtils.equals(this.d, str)) {
            this.f36835b.close();
            this.f36835b = null;
            this.d = null;
        }
        if (!TextUtils.isEmpty(str) && bArr != null && (this.f36835b == null || !TextUtils.equals(this.d, str))) {
            if (this.f36835b != null) {
                H("closing wallet-engine of " + this.d);
                this.f36835b.close();
                this.f36835b = null;
            }
            H("creating wallet-engine for " + str);
            try {
                int i10 = this.f36834a;
                this.d = str;
                this.f36835b = new WalletEngine2(i10, str, bArr);
            } catch (Exception e) {
                k("failed to create engine!", e);
                this.d = null;
            }
        }
        int i11 = 0;
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f36835b != null) {
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
        if ((this.e instanceof TL_wallet.TL_walletState) && this.f36835b != null && this.f36837f != null) {
            ArrayList arrayList2 = this.f36852w;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                Runnable runnable2 = (Runnable) ((WeakReference) obj2).get();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
            this.f36852w.clear();
        }
        if (!TextUtils.equals(this.I, str)) {
            W();
        }
        S();
    }

    public final void O(TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction) {
        String str = tL_updateSentWalletTransaction.msg_hash;
        if (!TextUtils.isEmpty(str) && g0(str) != null) {
            ArrayList arrayList = this.f36846p;
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
        this.f36837f = tL_updateWalletGaslessInfo;
        N();
        L();
    }

    public final void Q(TL_update.TL_updateWalletState tL_updateWalletState) {
        l0(tL_updateWalletState.state);
    }

    public final void R() {
        f0();
        this.f36846p.clear();
        ArrayList arrayList = this.f36848r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = ((f0) obj).f36560b;
            if (i0Var != null) {
                i0Var.close();
            }
        }
        arrayList.clear();
        k0 k0Var = this.f36844n;
        if (k0Var != null) {
            k0Var.a();
            k0Var.f36788b.clear();
            k0Var.d.clear();
            k0Var.e.clear();
            k0Var.f36790f.clear();
            k0Var.f36791g = "";
            k0Var.h = false;
            k0Var.k();
            this.f36844n.k();
            this.f36844n.i();
        }
        S();
        this.f36837f = null;
        X();
    }

    public final void S() {
        boolean z10;
        boolean z11;
        if (!TextUtils.equals(this.f36851u, t())) {
            f0();
            this.f36851u = t();
        }
        boolean G = G();
        int i10 = this.f36834a;
        if (G && !TextUtils.isEmpty(t())) {
            HashMap hashMap = this.f36850t;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!wallettransaction.pending || !TextUtils.equals(((n0) hashMap.get(wallettransaction)).f37004b, wallettransaction.messageHash)) {
                    ((n0) hashMap.remove(wallettransaction)).b();
                }
            }
            ArrayList arrayList2 = this.f36846p;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                if (wallettransaction2.pending && !TextUtils.isEmpty(wallettransaction2.messageHash) && !hashMap.containsKey(wallettransaction2)) {
                    String str = wallettransaction2.messageHash;
                    n0 n0Var = new n0(i10, str, new bh1(1, this, wallettransaction2));
                    hashMap.put(wallettransaction2, n0Var);
                    if (!n0Var.d && !TextUtils.isEmpty(str)) {
                        n0Var.d = true;
                        n0Var.f37006f = 0;
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
        z0 z0Var = this.f36849s;
        if (z0Var != null && z0Var.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10 || (z11 && z0Var != null && !TextUtils.equals(z0Var.f37562b, t()))) {
            if (z10) {
                z0 z0Var2 = this.f36849s;
                if (z0Var2 != null && !TextUtils.equals(z0Var2.f37562b, t())) {
                    this.f36849s.h();
                    this.f36849s = null;
                }
                if (this.f36849s == null) {
                    this.f36849s = new z0(i10, t(), this);
                }
                z0 z0Var3 = this.f36849s;
                boolean z12 = z0Var3.d;
                if (!z12) {
                    String str2 = z0Var3.f37562b;
                    if (!z12 && !TextUtils.isEmpty(str2)) {
                        z0Var3.d("starting; address=" + str2);
                        z0Var3.d = true;
                        z0Var3.f37567j = 0;
                        z0Var3.e();
                        return;
                    }
                    z0Var3.d("start ignored: running=" + z0Var3.d + ", emptyAddress=" + TextUtils.isEmpty(str2));
                    return;
                }
                return;
            }
            z0 z0Var4 = this.f36849s;
            if (z0Var4 != null) {
                z0Var4.h();
            }
            AndroidUtilities.cancelRunOnUIThread(this.F);
        }
    }

    public final void U(i0 i0Var, boolean z10, Utilities.Callback2 callback2) {
        i0 b10 = i0Var.b();
        H("requesting proof challenge");
        ConnectionsManager.getInstance(this.f36834a).sendRequestTyped(new TL_wallet.getProofChallenge(), new Object(), new w(this, b10, callback2, z10, 0));
    }

    public final void W() {
        int i10;
        this.I = t();
        ArrayList n10 = p0.n(ApplicationLoader.applicationContext, UserConfig.getInstance(this.f36834a).getClientUserId());
        n10.remove(this.I);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h0 h0Var = (h0) obj;
            hashMap.put(h0Var.f36643a, h0Var);
        }
        this.G.clear();
        int size2 = n10.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = n10.get(i12);
            i12++;
            String str = (String) obj2;
            h0 h0Var2 = (h0) hashMap.get(str);
            if (h0Var2 == null) {
                h0Var2 = new h0(new p0(ApplicationLoader.applicationContext, str, this.f36834a));
            }
            p0 p0Var = h0Var2.f36646f;
            synchronized (p0.f37097f) {
                try {
                    try {
                        i10 = p0Var.r().f29791b;
                    } catch (Exception e) {
                        FileLog.e(e);
                        i10 = 0;
                    }
                } finally {
                }
            }
            h0Var2.f36644b = i10;
            this.G.add(h0Var2);
            u(str, null);
            k0((c0) this.N.get(str));
        }
        Collections.sort(this.G, new dv(13));
    }

    public final void X() {
        H("requesting gasless info");
        this.B = ConnectionsManager.getInstance(this.f36834a).sendRequestTyped(new TL_wallet.getGaslessInfo(), new Object(), new i(this, 2));
    }

    public final void Y() {
        H("requesting state");
        this.A = ConnectionsManager.getInstance(this.f36834a).sendRequestTyped(new TL_wallet.getState(), new Object(), new i(this, 1));
    }

    public final void Z(String str, Utilities.Callback2 callback2) {
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
        ConnectionsManager.getInstance(this.f36834a).sendRequestTyped(getuseraddresses, new Object(), new j((Object) this, (Object) str, (Object) callback2, 0));
    }

    public final void a0(TLRPC.User user, Utilities.Callback2 callback2) {
        if (user == null) {
            callback2.run(null, null);
            return;
        }
        Long valueOf = Long.valueOf(user.f22177id);
        HashMap hashMap = this.L;
        if (hashMap.containsKey(valueOf)) {
            callback2.run((TL_wallet.walletUserAddress) hashMap.get(Long.valueOf(user.f22177id)), null);
            return;
        }
        TL_wallet.getUserAddresses getuseraddresses = new TL_wallet.getUserAddresses();
        getuseraddresses.force = true;
        ArrayList<TLRPC.InputUser> arrayList = getuseraddresses.f22289id;
        int i10 = this.f36834a;
        arrayList.add(MessagesController.getInstance(i10).getInputUser(user));
        ConnectionsManager.getInstance(i10).sendRequestTyped(getuseraddresses, new Object(), new j(this, (Object) callback2, (Object) user, 1));
    }

    public final void b0(String str, Utilities.Callback callback) {
        JSONObject jSONObject;
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.post = true;
        performapirequest.endpoint = "/api/v2/runGetMethod";
        JSONArray jSONArray = new JSONArray();
        boolean z10 = org.telegram.ui.web.a1.Q0;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("address", str);
            jSONObject.put("method", "get_public_key");
            jSONObject.put("stack", jSONArray);
        } catch (Exception unused) {
            jSONObject = null;
        }
        performapirequest.payload = jSONObject.toString();
        int i10 = this.f36834a;
        ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new Object(), new bi.m5(this, str, callback), MessagesController.getInstance(i10).webFileDatacenterId, 0);
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

    public final void d0(TLRPC.User user, String str, long j10, String str2, byte[] bArr, TL_wallet.nftItem nftitem, String str3, Utilities.Callback callback, Utilities.Callback callback2, d2 d2Var) {
        String t10 = t();
        H("send to " + str + ", amount " + j10 + ", when ready...");
        m0(new q(this, str, callback, nftitem, t10, str2, bArr, j10, d2Var, user, str3, callback2, 0));
    }

    public final boolean e() {
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return false;
        }
        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
        if (!tL_walletState.backup_enabled) {
            p0 p0Var = this.f36836c;
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
        if (tL_walletState.backup_enabled || ((p0Var = this.f36836c) != null && p0Var.f(tL_walletState.public_key))) {
            return false;
        }
        return true;
    }

    public final void f0() {
        HashMap hashMap = this.f36850t;
        for (n0 n0Var : hashMap.values()) {
            n0Var.b();
        }
        hashMap.clear();
    }

    public final m i(String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        z zVar = new z(this, str, j10, str2, bArr, callback2);
        m0(zVar);
        return new m(zVar, 0);
    }

    public final void k0(c0 c0Var) {
        if (c0Var != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h0 h0Var = (h0) obj;
                if (TextUtils.equals(h0Var.f36643a, c0Var.f36439a)) {
                    h0Var.f36645c = c0Var.f36440b;
                    boolean z10 = true;
                    h0Var.d = !c0Var.e;
                    byte[] bArr = c0Var.f36441c;
                    if (bArr == null || bArr.length <= 0 || h0Var.f36646f.f(bArr)) {
                        z10 = false;
                    }
                    h0Var.e = z10;
                }
            }
        }
    }

    public final void l0(TL_wallet.WalletState walletState) {
        boolean z10;
        k0 k0Var;
        if (walletState != null) {
            if (walletState instanceof TL_wallet.TL_walletState) {
                TL_wallet.WalletState walletState2 = this.e;
                if (!(walletState2 instanceof TL_wallet.TL_walletState) || ((TL_wallet.TL_walletState) walletState2).balance != ((TL_wallet.TL_walletState) walletState).balance) {
                    z10 = true;
                    this.e = walletState;
                    N();
                    L();
                    if (!z10 && (k0Var = this.f36844n) != null) {
                        k0Var.g();
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
        String D;
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
            int i11 = j11.exp;
            double d = j11.rate;
            if (d > 0.0d && !Double.isNaN(d) && !Double.isInfinite(d)) {
                double d10 = MessagesController.getInstance(this.f36834a).config.tonUsdRate.get() * d;
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
                    g7 = str2;
                }
                if (z12) {
                    str = " ";
                }
                if (z11) {
                    D = a1.g.D(g7, str, format);
                } else {
                    D = a1.g.D(format, str, g7);
                }
                if (z14) {
                    D = b10.j("-", D);
                }
                int indexOf = D.indexOf(8387);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D);
                    spannableStringBuilder.setSpan(new r61(AndroidUtilities.getTypeface("fonts/gram.ttf")), indexOf, indexOf + 1, 33);
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
        TL_wallet.WalletState walletState = this.e;
        if (!(walletState instanceof TL_wallet.TL_walletState)) {
            return null;
        }
        return ((TL_wallet.TL_walletState) walletState).address;
    }

    public final c0 u(final String str, c8 c8Var) {
        HashMap hashMap = this.N;
        c0 c0Var = (c0) hashMap.get(str);
        if (c0Var != null && !c0Var.e) {
            if (c8Var != null) {
                c0Var.f36442f.add(c8Var);
            }
            return null;
        }
        int i10 = this.f36834a;
        if (c0Var != null && c0Var.e && ConnectionsManager.getInstance(i10).getCurrentTime() < c0Var.d + 300) {
            if (c8Var != null) {
                c8Var.run(c0Var);
            }
            return c0Var;
        }
        final ?? obj = new Object();
        obj.f36440b = -1L;
        ArrayList arrayList = new ArrayList();
        obj.f36442f = arrayList;
        obj.f36439a = str;
        obj.d = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (c8Var != null) {
            arrayList.add(c8Var);
        }
        hashMap.put(str, obj);
        Utilities.raceCallbacks(new h(this, str, (Object) obj, 1), new Utilities.Callback(this) {
            public final l0 f36832b;

            {
                this.f36832b = this;
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
                        l0 l0Var = this.f36832b;
                        int i11 = l0Var.f36834a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new p(l0Var, obj, str2, runnable, 0), MessagesController.getInstance(i11).webFileDatacenterId, 0);
                        return;
                    default:
                        l0 l0Var2 = this.f36832b;
                        c0 c0Var2 = obj;
                        String str3 = str;
                        l0Var2.b0(str3, new n(l0Var2, c0Var2, str3, (Runnable) obj2));
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final l0 f36832b;

            {
                this.f36832b = this;
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
                        l0 l0Var = this.f36832b;
                        int i11 = l0Var.f36834a;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new p(l0Var, obj, str2, runnable, 0), MessagesController.getInstance(i11).webFileDatacenterId, 0);
                        return;
                    default:
                        l0 l0Var2 = this.f36832b;
                        c0 c0Var2 = obj;
                        String str3 = str;
                        l0Var2.b0(str3, new n(l0Var2, c0Var2, str3, (Runnable) obj2));
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

    public final void z(Utilities.Callback2 callback2, boolean z10, boolean z11) {
        H("getSecretPhrase: whenReady...");
        m0(new e2.p0(this, callback2, z10, z11, 4));
    }
}
