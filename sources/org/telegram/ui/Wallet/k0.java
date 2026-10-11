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
import org.telegram.ui.lb1;
public final class k0 {
    public boolean f35145g;
    public final l0 f35147j;
    public final y2 f35140a = new y2();
    public final ArrayList f35141b = new ArrayList();
    public final ArrayList f35142c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap f35143e = new HashMap();
    public String f35144f = "";
    public int h = -1;
    public int f35146i = -1;

    public k0(l0 l0Var) {
        this.f35147j = l0Var;
    }

    public static TL_wallet.walletTransaction b(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f20294id, str)) {
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
        int i10 = this.f35147j.f35185a;
        if (this.f35146i >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f35146i, true);
            this.f35146i = -1;
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
            arrayList = this.f35141b;
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
        this.h = ConnectionsManager.getInstance(this.f35147j.f35185a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 0));
    }

    public final void e() {
        if (this.f35145g) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f35144f;
        this.f35146i = ConnectionsManager.getInstance(this.f35147j.f35185a).sendRequestTyped(gettransactions, new Object(), new j0(this, gettransactions, 1));
    }

    public final void f() {
        l0 l0Var = this.f35147j;
        NotificationCenter.getInstance(l0Var.f35185a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, l0Var);
    }

    public final void h() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        l0 l0Var = this.f35147j;
        ArrayList arrayList2 = l0Var.f35198p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f35141b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f20294id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f20294id) && TextUtils.equals(wallettransaction.f20294id, wallettransaction2.f20294id)) || (wallettransaction.incoming == wallettransaction2.incoming && (l0.Y(wallettransaction.tx_hash, wallettransaction2.tx_hash) || l0.Y(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        arrayList2.remove(size);
                        n0 n0Var = (n0) l0Var.f35201s.remove(wallettransaction);
                        if (n0Var != null) {
                            n0Var.b();
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f35142c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new lb1(3));
        y2 y2Var = this.f35140a;
        HashSet hashSet = y2Var.f35729a;
        HashSet hashSet2 = y2Var.f35729a;
        HashMap hashMap = y2Var.f35730b;
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
