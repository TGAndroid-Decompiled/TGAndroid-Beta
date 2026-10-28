package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.dv;
public final class k0 {
    public boolean h;
    public boolean f36792i;
    public final l0 f36795l;
    public final e3 f36787a = new e3();
    public final ArrayList f36788b = new ArrayList();
    public final ArrayList f36789c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public final HashMap f36790f = new HashMap();
    public String f36791g = "";
    public int f36793j = -1;
    public int f36794k = -1;

    public k0(l0 l0Var) {
        this.f36795l = l0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f22292id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i10);
            }
        }
        return null;
    }

    public static String j(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return a1.g.D(optString, ":", optString2);
        }
        return null;
    }

    public final void a() {
        int i10 = this.f36795l.f36834a;
        if (this.f36794k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f36794k, true);
            this.f36794k = -1;
        }
        if (this.f36793j >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f36793j, true);
            this.f36793j = -1;
        }
        this.f36792i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36788b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (arrayList.get(i10) == wallettransaction) {
                return true;
            }
            i10++;
        }
    }

    public final TL_wallet.walletTransaction c(TL_wallet.walletTransaction wallettransaction) {
        TL_wallet.walletTransaction d = d(wallettransaction.f22292id, this.f36788b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.f22292id;
        HashMap hashMap = this.f36790f;
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
        String str = wallettransaction.f22292id;
        HashMap hashMap = this.e;
        hashMap.remove(str);
        String str2 = wallettransaction.f22292id;
        HashMap hashMap2 = this.f36790f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap2.get(str2);
        HashSet hashSet = this.d;
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str3 = (String) obj;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap2.get(str3);
            if (TextUtils.equals(str3, wallettransaction.f22292id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || l0.i0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f36788b;
            if (i10 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i10)).date < wallettransaction.date) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, wallettransaction);
    }

    public final void g() {
        if (this.f36792i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f36792i = true;
        this.f36793j = ConnectionsManager.getInstance(this.f36795l.f36834a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 0));
    }

    public final void h() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f36791g;
        this.f36794k = ConnectionsManager.getInstance(this.f36795l.f36834a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 1));
    }

    public final void i() {
        l0 l0Var = this.f36795l;
        NotificationCenter.getInstance(l0Var.f36834a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, l0Var);
    }

    public final void k() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        l0 l0Var = this.f36795l;
        ArrayList arrayList2 = l0Var.f36846p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f36788b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f22292id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f22292id) && TextUtils.equals(wallettransaction.f22292id, wallettransaction2.f22292id)) || (wallettransaction.incoming == wallettransaction2.incoming && (l0.c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || l0.c0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        n0 n0Var = (n0) l0Var.f36850t.remove(wallettransaction);
                        if (n0Var != null) {
                            n0Var.b();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i11)).f22292id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        ArrayList arrayList3 = this.f36789c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new dv(14));
        e3 e3Var = this.f36787a;
        HashSet hashSet2 = e3Var.f36518a;
        HashSet hashSet3 = e3Var.f36518a;
        HashMap hashMap = e3Var.f36519b;
        hashSet2.clear();
        hashMap.clear();
        int size3 = arrayList3.size();
        while (i10 < size3) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
            if (wallettransaction3 != null && (walletTransactionPeer = wallettransaction3.peer) != null && (str = walletTransactionPeer.address) != null && !str.isEmpty()) {
                hashSet3.add(str);
            }
        }
        hashMap.clear();
        e3Var.b(4, new ArrayList(hashSet3));
    }
}
