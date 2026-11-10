package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.xn0;
public final class k0 {
    public boolean h;
    public boolean f42703i;
    public final l0 f42706l;
    public final v3 f42697a = new v3();
    public final ArrayList f42698b = new ArrayList();
    public final ArrayList f42699c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap f42700e = new HashMap();
    public final HashMap f42701f = new HashMap();
    public String f42702g = "";
    public int f42704j = -1;
    public int f42705k = -1;

    public k0(l0 l0Var) {
        this.f42706l = l0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i7)).f27223id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i7);
            }
        }
        return null;
    }

    public static String j(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return a8.p0.D(optString, ":", optString2);
        }
        return null;
    }

    public final void a() {
        int i7 = this.f42706l.f42749a;
        if (this.f42705k >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f42705k, true);
            this.f42705k = -1;
        }
        if (this.f42704j >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f42704j, true);
            this.f42704j = -1;
        }
        this.f42703i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f42698b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (arrayList.get(i7) == wallettransaction) {
                return true;
            }
            i7++;
        }
    }

    public final TL_wallet.walletTransaction c(TL_wallet.walletTransaction wallettransaction) {
        TL_wallet.walletTransaction d = d(wallettransaction.f27223id, this.f42698b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.f27223id;
        HashMap hashMap = this.f42701f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap.get(str);
        if (wallettransaction2 != null && b(wallettransaction2)) {
            return wallettransaction2;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap.get((String) it.next());
            if (wallettransaction3 != null && b(wallettransaction3) && l0.i0(wallettransaction3, wallettransaction)) {
                return wallettransaction3;
            }
        }
        return null;
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.f27223id;
        HashMap hashMap = this.f42700e;
        hashMap.remove(str);
        String str2 = wallettransaction.f27223id;
        HashMap hashMap2 = this.f42701f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap2.get(str2);
        HashSet hashSet = this.d;
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str3 = (String) obj;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap2.get(str3);
            if (TextUtils.equals(str3, wallettransaction.f27223id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || l0.i0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f42698b;
            if (i7 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i7)).date < wallettransaction.date) {
                break;
            }
            i7++;
        }
        arrayList.add(i7, wallettransaction);
    }

    public final void g() {
        if (this.f42703i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f42703i = true;
        this.f42704j = ConnectionsManager.getInstance(this.f42706l.f42749a).sendRequestTyped(gettransactions, new d3.b(1), new j0(this, gettransactions, 1));
    }

    public final void h() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f42702g;
        this.f42705k = ConnectionsManager.getInstance(this.f42706l.f42749a).sendRequestTyped(gettransactions, new d3.b(1), new j0(this, gettransactions, 0));
    }

    public final void i() {
        l0 l0Var = this.f42706l;
        qs.f(l0Var.f42749a).k(qs.f24981b4, this, l0Var);
    }

    public final void k() {
        int i7;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        l0 l0Var = this.f42706l;
        ArrayList arrayList2 = l0Var.f42762p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i7 = 0;
            arrayList = this.f42698b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f27223id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f27223id) && TextUtils.equals(wallettransaction.f27223id, wallettransaction2.f27223id)) || (wallettransaction.incoming == wallettransaction2.incoming && (l0.c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || l0.c0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        n0 n0Var = (n0) l0Var.f42766t.remove(wallettransaction);
                        if (n0Var != null) {
                            n0Var.b();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i10)).f27223id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        ArrayList arrayList3 = this.f42699c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new xn0(7));
        v3 v3Var = this.f42697a;
        HashSet hashSet2 = v3Var.f43252a;
        HashSet hashSet3 = v3Var.f43252a;
        HashMap hashMap = v3Var.f43253b;
        hashSet2.clear();
        hashMap.clear();
        int size3 = arrayList3.size();
        while (i7 < size3) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
            if (wallettransaction3 != null && (walletTransactionPeer = wallettransaction3.peer) != null && (str = walletTransactionPeer.address) != null && !str.isEmpty()) {
                hashSet3.add(str);
            }
        }
        hashMap.clear();
        v3Var.b(4, new ArrayList(hashSet3));
    }
}
