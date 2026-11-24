package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class b {
    public boolean h;
    public boolean i;
    public boolean k;
    public final c m;
    public final kyb a = new kyb();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public String g = "";
    public int j = -1;
    public int l = -1;

    public b(c cVar) {
        this.m = cVar;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i)).id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i);
            }
        }
        return null;
    }

    public static String j(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return tb4.p(optString, ":", optString2);
        }
        return null;
    }

    public final void a() {
        int i = this.m.a;
        if (this.l >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.l, true);
            this.l = -1;
        }
        if (this.j >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.j, true);
            this.j = -1;
        }
        this.k = false;
        this.i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (arrayList.get(i) == wallettransaction) {
                return true;
            }
            i++;
        }
    }

    public final TL_wallet.walletTransaction c(TL_wallet.walletTransaction wallettransaction) {
        TL_wallet.walletTransaction d = d(wallettransaction.id, this.b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.id;
        HashMap hashMap = this.f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap.get(str);
        if (wallettransaction2 != null && b(wallettransaction2)) {
            return wallettransaction2;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap.get((String) it.next());
            if (wallettransaction3 != null && b(wallettransaction3) && c.t0(wallettransaction3, wallettransaction)) {
                return wallettransaction3;
            }
        }
        return null;
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.id;
        HashMap hashMap = this.e;
        hashMap.remove(str);
        String str2 = wallettransaction.id;
        HashMap hashMap2 = this.f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap2.get(str2);
        HashSet hashSet = this.d;
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str3 = (String) obj;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap2.get(str3);
            if (TextUtils.equals(str3, wallettransaction.id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || c.t0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.b;
            if (i >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i)).date < wallettransaction.date) {
                break;
            }
            i++;
        }
        arrayList.add(i, wallettransaction);
    }

    public final void g() {
        if (this.i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.i = true;
        this.j = ConnectionsManager.getInstance(this.m.a).sendRequestTyped(gettransactions, new hc((byte) 0), new z05(this, gettransactions, (byte) 1));
    }

    public final void h() {
        if (this.k || this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.g;
        this.k = true;
        this.l = ConnectionsManager.getInstance(this.m.a).sendRequestTyped(gettransactions, new hc((byte) 0), new z05(this, gettransactions, (byte) 0));
    }

    public final void i() {
        c cVar = this.m;
        kk7.f(cVar.a).k(kk7.d4, this, cVar);
    }

    public final void k() {
        int i;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        kyb kybVar = this.a;
        HashMap hashMap = kybVar.b;
        HashSet hashSet = kybVar.a;
        c cVar = this.m;
        ArrayList arrayList2 = cVar.p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i = 0;
            arrayList = this.b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.id) && TextUtils.equals(wallettransaction.id, wallettransaction2.id)) || (wallettransaction.incoming == wallettransaction2.incoming && (c.k0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || c.k0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        c15 c15Var = (c15) cVar.u.remove(wallettransaction);
                        if (c15Var != null) {
                            c15Var.c();
                        }
                    }
                }
            }
        }
        HashSet hashSet2 = new HashSet();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i2)).id;
            if (!TextUtils.isEmpty(str2) && !hashSet2.add(str2)) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        ArrayList arrayList3 = this.c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new mz2((byte) 21));
        hashSet.clear();
        hashMap.clear();
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
            if (wallettransaction3 != null && (walletTransactionPeer = wallettransaction3.peer) != null && (str = walletTransactionPeer.address) != null && !str.isEmpty()) {
                hashSet.add(str);
            }
        }
        hashMap.clear();
        kybVar.b(4, new ArrayList(hashSet));
    }
}
