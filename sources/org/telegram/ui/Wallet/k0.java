package org.telegram.ui.Wallet;

import android.text.TextUtils;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ob1;
public final class k0 {
    public boolean f34955g;
    public final l0 f34957j;
    public final y2 f34950a = new y2();
    public final ArrayList f34951b = new ArrayList();
    public final ArrayList f34952c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap f34953e = new HashMap();
    public String f34954f = "";
    public int h = -1;
    public int f34956i = -1;

    public k0(l0 l0Var) {
        this.f34957j = l0Var;
    }

    public static TL_wallet.walletTransaction b(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f20067id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i10);
            }
        }
        return null;
    }

    public static String g(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return a1.g.D(optString, ":", optString2);
        }
        return null;
    }

    public final void a() {
        int i10 = this.f34957j.f34996a;
        if (this.f34956i >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34956i, true);
            this.f34956i = -1;
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f34951b;
            if (i10 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i10)).date < wallettransaction.date) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, wallettransaction);
    }

    public final void d() {
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.h = ConnectionsManager.getInstance(this.f34957j.f34996a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 0));
    }

    public final void e() {
        if (this.f34955g) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f34954f;
        this.f34956i = ConnectionsManager.getInstance(this.f34957j.f34996a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 1));
    }

    public final void f() {
        l0 l0Var = this.f34957j;
        NotificationCenter.getInstance(l0Var.f34996a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, l0Var);
    }

    public final void h() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        l0 l0Var = this.f34957j;
        ArrayList arrayList2 = l0Var.f35009p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f34951b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f20067id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f20067id) && TextUtils.equals(wallettransaction.f20067id, wallettransaction2.f20067id)) || (wallettransaction.incoming == wallettransaction2.incoming && (l0.Y(wallettransaction.tx_hash, wallettransaction2.tx_hash) || l0.Y(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        arrayList2.remove(size);
                        n0 n0Var = (n0) l0Var.f35012s.remove(wallettransaction);
                        if (n0Var != null) {
                            n0Var.b();
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f34952c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new ob1(3));
        y2 y2Var = this.f34950a;
        HashSet hashSet = y2Var.f35541a;
        HashSet hashSet2 = y2Var.f35541a;
        HashMap hashMap = y2Var.f35542b;
        hashSet.clear();
        hashMap.clear();
        int size3 = arrayList3.size();
        while (i10 < size3) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj2;
            if (wallettransaction3 != null && (walletTransactionPeer = wallettransaction3.peer) != null && (str = walletTransactionPeer.address) != null && !str.isEmpty()) {
                hashSet2.add(str);
            }
        }
        hashMap.clear();
        y2Var.b(4, new ArrayList(hashSet2));
    }
}
