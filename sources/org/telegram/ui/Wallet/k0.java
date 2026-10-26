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
import org.telegram.ui.bv;
public final class k0 {
    public boolean h;
    public boolean f36766i;
    public final l0 f36769l;
    public final e3 f36761a = new e3();
    public final ArrayList f36762b = new ArrayList();
    public final ArrayList f36763c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public final HashMap f36764f = new HashMap();
    public String f36765g = "";
    public int f36767j = -1;
    public int f36768k = -1;

    public k0(l0 l0Var) {
        this.f36769l = l0Var;
    }

    public static TL_wallet.walletTransaction d(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f22291id, str)) {
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
        int i10 = this.f36769l.f36807a;
        if (this.f36768k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f36768k, true);
            this.f36768k = -1;
        }
        if (this.f36767j >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f36767j, true);
            this.f36767j = -1;
        }
        this.f36766i = false;
    }

    public final boolean b(TL_wallet.walletTransaction wallettransaction) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36762b;
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
        TL_wallet.walletTransaction d = d(wallettransaction.f22291id, this.f36762b);
        if (d != null) {
            return d;
        }
        String str = wallettransaction.f22291id;
        HashMap hashMap = this.f36764f;
        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) hashMap.get(str);
        if (wallettransaction2 != null && b(wallettransaction2)) {
            return wallettransaction2;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) hashMap.get((String) it.next());
            if (wallettransaction3 != null && b(wallettransaction3) && l0.f0(wallettransaction3, wallettransaction)) {
                return wallettransaction3;
            }
        }
        return null;
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.f22291id;
        HashMap hashMap = this.e;
        hashMap.remove(str);
        String str2 = wallettransaction.f22291id;
        HashMap hashMap2 = this.f36764f;
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
            if (TextUtils.equals(str3, wallettransaction.f22291id) || (wallettransaction3 != null && (wallettransaction3 == wallettransaction2 || l0.f0(wallettransaction3, wallettransaction)))) {
                hashSet.remove(str3);
                hashMap.remove(str3);
            }
        }
    }

    public final void f(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f36762b;
            if (i10 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i10)).date < wallettransaction.date) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, wallettransaction);
    }

    public final void g() {
        if (this.f36766i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f36766i = true;
        this.f36767j = ConnectionsManager.getInstance(this.f36769l.f36807a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 0));
    }

    public final void h() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f36765g;
        this.f36768k = ConnectionsManager.getInstance(this.f36769l.f36807a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 1));
    }

    public final void i() {
        l0 l0Var = this.f36769l;
        NotificationCenter.getInstance(l0Var.f36807a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, l0Var);
    }

    public final void k() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        l0 l0Var = this.f36769l;
        ArrayList arrayList2 = l0Var.f36819p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f36762b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f22291id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f22291id) && TextUtils.equals(wallettransaction.f22291id, wallettransaction2.f22291id)) || (wallettransaction.incoming == wallettransaction2.incoming && (l0.a0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || l0.a0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        n0 n0Var = (n0) l0Var.f36823t.remove(wallettransaction);
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
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i11)).f22291id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        ArrayList arrayList3 = this.f36763c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new bv(14));
        e3 e3Var = this.f36761a;
        HashSet hashSet2 = e3Var.f36511a;
        HashSet hashSet3 = e3Var.f36511a;
        HashMap hashMap = e3Var.f36512b;
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
