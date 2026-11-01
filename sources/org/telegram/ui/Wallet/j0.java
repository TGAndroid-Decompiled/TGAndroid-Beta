package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.at;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.dx0;
public final class j0 {
    public boolean h;
    public boolean f34739i;
    public final k0 f34742l;
    public final v3 f34734a = new v3();
    public final ArrayList f34735b = new ArrayList();
    public final ArrayList f34736c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public final HashMap f34737f = new HashMap();
    public String f34738g = "";
    public int f34740j = -1;
    public int f34741k = -1;

    public j0(k0 k0Var) {
        this.f34742l = k0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f20057id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i10);
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
        int i10 = this.f34742l.f34781a;
        if (this.f34741k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34741k, true);
            this.f34741k = -1;
        }
        if (this.f34740j >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34740j, true);
            this.f34740j = -1;
        }
        this.f34739i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34735b;
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
        TL_wallet.walletTransaction d = d(wallettransaction.f20057id, this.f34735b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.f20057id;
        HashMap hashMap = this.f34737f;
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
        String str = wallettransaction.f20057id;
        HashMap hashMap = this.e;
        hashMap.remove(str);
        String str2 = wallettransaction.f20057id;
        HashMap hashMap2 = this.f34737f;
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
            if (TextUtils.equals(str3, wallettransaction.f20057id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || k0.i0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f34735b;
            if (i10 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i10)).date < wallettransaction.date) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, wallettransaction);
    }

    public final void g() {
        if (this.f34739i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f34739i = true;
        this.f34740j = ConnectionsManager.getInstance(this.f34742l.f34781a).sendRequestTyped(gettransactions, new a3.b(1), new i0(this, gettransactions, 1));
    }

    public final void h() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f34738g;
        this.f34741k = ConnectionsManager.getInstance(this.f34742l.f34781a).sendRequestTyped(gettransactions, new a3.b(1), new i0(this, gettransactions, 0));
    }

    public final void i() {
        k0 k0Var = this.f34742l;
        at.f(k0Var.f34781a).k(at.f14684b4, this, k0Var);
    }

    public final void k() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        k0 k0Var = this.f34742l;
        ArrayList arrayList2 = k0Var.f34793p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f34735b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f20057id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f20057id) && TextUtils.equals(wallettransaction.f20057id, wallettransaction2.f20057id)) || (wallettransaction.incoming == wallettransaction2.incoming && (k0.c0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || k0.c0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        m0 m0Var = (m0) k0Var.f34797t.remove(wallettransaction);
                        if (m0Var != null) {
                            m0Var.b();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i11)).f20057id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        ArrayList arrayList3 = this.f34736c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new dx0(6));
        v3 v3Var = this.f34734a;
        HashSet hashSet2 = v3Var.f35309a;
        HashSet hashSet3 = v3Var.f35309a;
        HashMap hashMap = v3Var.f35310b;
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
        v3Var.b(4, new ArrayList(hashSet3));
    }
}
