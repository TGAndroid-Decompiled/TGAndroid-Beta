package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d80;
public final class j0 {
    public boolean h;
    public boolean f42685i;
    public final k0 f42688l;
    public final t3 f42679a = new t3();
    public final ArrayList f42680b = new ArrayList();
    public final ArrayList f42681c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap f42682e = new HashMap();
    public final HashMap f42683f = new HashMap();
    public String f42684g = "";
    public int f42686j = -1;
    public int f42687k = -1;

    public j0(k0 k0Var) {
        this.f42688l = k0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i3)).f27265id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i3);
            }
        }
        return null;
    }

    public static String j(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return a1.g.C(optString, ":", optString2);
        }
        return null;
    }

    public final void a() {
        int i3 = this.f42688l.f42718a;
        if (this.f42687k >= 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.f42687k, true);
            this.f42687k = -1;
        }
        if (this.f42686j >= 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.f42686j, true);
            this.f42686j = -1;
        }
        this.f42685i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f42680b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (arrayList.get(i3) == wallettransaction) {
                return true;
            }
            i3++;
        }
    }

    public final TL_wallet.walletTransaction c(TL_wallet.walletTransaction wallettransaction) {
        TL_wallet.walletTransaction d = d(wallettransaction.f27265id, this.f42680b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.f27265id;
        HashMap hashMap = this.f42683f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap.get(str);
        if (wallettransaction2 != null && b(wallettransaction2)) {
            return wallettransaction2;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap.get((String) it.next());
            if (wallettransaction3 != null && b(wallettransaction3) && k0.i0(wallettransaction3, wallettransaction)) {
                return wallettransaction3;
            }
        }
        return null;
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.f27265id;
        HashMap hashMap = this.f42682e;
        hashMap.remove(str);
        String str2 = wallettransaction.f27265id;
        HashMap hashMap2 = this.f42683f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap2.get(str2);
        HashSet hashSet = this.d;
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str3 = (String) obj;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap2.get(str3);
            if (TextUtils.equals(str3, wallettransaction.f27265id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || k0.i0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.f42680b;
            if (i3 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i3)).date < wallettransaction.date) {
                break;
            }
            i3++;
        }
        arrayList.add(i3, wallettransaction);
    }

    public final void g() {
        if (this.f42685i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f42685i = true;
        this.f42686j = ConnectionsManager.getInstance(this.f42688l.f42718a).sendRequestTyped(gettransactions, new c3.b(1), new i0(this, gettransactions, 1));
    }

    public final void h() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f42684g;
        this.f42687k = ConnectionsManager.getInstance(this.f42688l.f42718a).sendRequestTyped(gettransactions, new c3.b(1), new i0(this, gettransactions, 0));
    }

    public final void i() {
        k0 k0Var = this.f42688l;
        hs.f(k0Var.f42718a).k(hs.f23206b4, this, k0Var);
    }

    public final void k() {
        int i3;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        k0 k0Var = this.f42688l;
        ArrayList arrayList2 = k0Var.f42731p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i3 = 0;
            arrayList = this.f42680b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f27265id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f27265id) && TextUtils.equals(wallettransaction.f27265id, wallettransaction2.f27265id)) || (wallettransaction.incoming == wallettransaction2.incoming && (k0.c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || k0.c0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        m0 m0Var = (m0) k0Var.f42735t.remove(wallettransaction);
                        if (m0Var != null) {
                            m0Var.b();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i10)).f27265id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        ArrayList arrayList3 = this.f42681c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new d80(24));
        t3 t3Var = this.f42679a;
        HashSet hashSet2 = t3Var.f43198a;
        HashSet hashSet3 = t3Var.f43198a;
        HashMap hashMap = t3Var.f43199b;
        hashSet2.clear();
        hashMap.clear();
        int size3 = arrayList3.size();
        while (i3 < size3) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
            if (wallettransaction3 != null && (walletTransactionPeer = wallettransaction3.peer) != null && (str = walletTransactionPeer.address) != null && !str.isEmpty()) {
                hashSet3.add(str);
            }
        }
        hashMap.clear();
        t3Var.b(4, new ArrayList(hashSet3));
    }
}
