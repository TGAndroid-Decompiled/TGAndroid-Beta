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
import org.telegram.ui.rv0;
public final class m0 {
    public boolean h;
    public boolean f42736i;
    public final n0 f42739l;
    public final v3 f42730a = new v3();
    public final ArrayList f42731b = new ArrayList();
    public final ArrayList f42732c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap f42733e = new HashMap();
    public final HashMap f42734f = new HashMap();
    public String f42735g = "";
    public int f42737j = -1;
    public int f42738k = -1;

    public m0(n0 n0Var) {
        this.f42739l = n0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i7)).f27215id, str)) {
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
        int i7 = this.f42739l.f42768a;
        if (this.f42738k >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f42738k, true);
            this.f42738k = -1;
        }
        if (this.f42737j >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f42737j, true);
            this.f42737j = -1;
        }
        this.f42736i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f42731b;
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
        TL_wallet.walletTransaction d = d(wallettransaction.f27215id, this.f42731b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.f27215id;
        HashMap hashMap = this.f42734f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap.get(str);
        if (wallettransaction2 != null && b(wallettransaction2)) {
            return wallettransaction2;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap.get((String) it.next());
            if (wallettransaction3 != null && b(wallettransaction3) && n0.i0(wallettransaction3, wallettransaction)) {
                return wallettransaction3;
            }
        }
        return null;
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.f27215id;
        HashMap hashMap = this.f42733e;
        hashMap.remove(str);
        String str2 = wallettransaction.f27215id;
        HashMap hashMap2 = this.f42734f;
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
            if (TextUtils.equals(str3, wallettransaction.f27215id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || n0.i0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f42731b;
            if (i7 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i7)).date < wallettransaction.date) {
                break;
            }
            i7++;
        }
        arrayList.add(i7, wallettransaction);
    }

    public final void g() {
        if (this.f42736i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f42736i = true;
        this.f42737j = ConnectionsManager.getInstance(this.f42739l.f42768a).sendRequestTyped(gettransactions, new d3.b(1), new l0(this, gettransactions, 1));
    }

    public final void h() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f42735g;
        this.f42738k = ConnectionsManager.getInstance(this.f42739l.f42768a).sendRequestTyped(gettransactions, new d3.b(1), new l0(this, gettransactions, 0));
    }

    public final void i() {
        n0 n0Var = this.f42739l;
        qs.f(n0Var.f42768a).k(qs.f24960b4, this, n0Var);
    }

    public final void k() {
        int i7;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        n0 n0Var = this.f42739l;
        ArrayList arrayList2 = n0Var.f42781p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i7 = 0;
            arrayList = this.f42731b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f27215id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f27215id) && TextUtils.equals(wallettransaction.f27215id, wallettransaction2.f27215id)) || (wallettransaction.incoming == wallettransaction2.incoming && (n0.c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || n0.c0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        p0 p0Var = (p0) n0Var.f42785t.remove(wallettransaction);
                        if (p0Var != null) {
                            p0Var.b();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i10)).f27215id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        ArrayList arrayList3 = this.f42732c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new rv0(6));
        v3 v3Var = this.f42730a;
        HashSet hashSet2 = v3Var.f43207a;
        HashSet hashSet3 = v3Var.f43207a;
        HashMap hashMap = v3Var.f43208b;
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
