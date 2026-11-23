package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.ls;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.qw0;
public final class t0 {
    public boolean h;
    public boolean f45091i;
    public boolean f45093k;
    public final u0 f45095m;
    public final e4 f45085a = new e4();
    public final ArrayList f45086b = new ArrayList();
    public final ArrayList f45087c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap f45088e = new HashMap();
    public final HashMap f45089f = new HashMap();
    public String f45090g = "";
    public int f45092j = -1;
    public int f45094l = -1;

    public t0(u0 u0Var) {
        this.f45095m = u0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i7)).f28697id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i7);
            }
        }
        return null;
    }

    public static String j(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return a8.p0.E(optString, ":", optString2);
        }
        return null;
    }

    public final void a() {
        int i7 = this.f45094l;
        u0 u0Var = this.f45095m;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(u0Var.f45127a).cancelRequest(this.f45094l, true);
            this.f45094l = -1;
        }
        if (this.f45092j >= 0) {
            ConnectionsManager.getInstance(u0Var.f45127a).cancelRequest(this.f45092j, true);
            this.f45092j = -1;
        }
        this.f45093k = false;
        this.f45091i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f45086b;
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
        TL_wallet.walletTransaction d = d(wallettransaction.f28697id, this.f45086b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.f28697id;
        HashMap hashMap = this.f45089f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap.get(str);
        if (wallettransaction2 != null && b(wallettransaction2)) {
            return wallettransaction2;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap.get((String) it.next());
            if (wallettransaction3 != null && b(wallettransaction3) && u0.t0(wallettransaction3, wallettransaction)) {
                return wallettransaction3;
            }
        }
        return null;
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.f28697id;
        HashMap hashMap = this.f45088e;
        hashMap.remove(str);
        String str2 = wallettransaction.f28697id;
        HashMap hashMap2 = this.f45089f;
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
            if (TextUtils.equals(str3, wallettransaction.f28697id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || u0.t0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f45086b;
            if (i7 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i7)).date < wallettransaction.date) {
                break;
            }
            i7++;
        }
        arrayList.add(i7, wallettransaction);
    }

    public final void g() {
        if (this.f45091i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f45091i = true;
        this.f45092j = ConnectionsManager.getInstance(this.f45095m.f45127a).sendRequestTyped(gettransactions, new d3.b(1), new s0(this, gettransactions, 1));
    }

    public final void h() {
        if (this.f45093k || this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f45090g;
        this.f45093k = true;
        this.f45094l = ConnectionsManager.getInstance(this.f45095m.f45127a).sendRequestTyped(gettransactions, new d3.b(1), new s0(this, gettransactions, 0));
    }

    public final void i() {
        u0 u0Var = this.f45095m;
        ls.f(u0Var.f45127a).k(ls.f25302e4, this, u0Var);
    }

    public final void k() {
        int i7;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        u0 u0Var = this.f45095m;
        ArrayList arrayList2 = u0Var.f45140p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i7 = 0;
            arrayList = this.f45086b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f28697id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f28697id) && TextUtils.equals(wallettransaction.f28697id, wallettransaction2.f28697id)) || (wallettransaction.incoming == wallettransaction2.incoming && (u0.l0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || u0.l0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        x0 x0Var = (x0) u0Var.f45145u.remove(wallettransaction);
                        if (x0Var != null) {
                            x0Var.c();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i10)).f28697id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        ArrayList arrayList3 = this.f45087c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new qw0(5));
        e4 e4Var = this.f45085a;
        HashSet hashSet2 = e4Var.f44152a;
        HashSet hashSet3 = e4Var.f44152a;
        HashMap hashMap = e4Var.f44153b;
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
        e4Var.b(4, new ArrayList(hashSet3));
    }
}
