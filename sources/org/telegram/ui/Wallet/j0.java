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
import org.telegram.ui.mb1;
public final class j0 {
    public boolean f35050g;
    public final k0 f35052j;
    public final w2 f35045a = new w2();
    public final ArrayList f35046b = new ArrayList();
    public final ArrayList f35047c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap f35048e = new HashMap();
    public String f35049f = "";
    public int h = -1;
    public int f35051i = -1;

    public j0(k0 k0Var) {
        this.f35052j = k0Var;
    }

    public static TL_wallet.walletTransaction b(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f20300id, str)) {
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
        int i10 = this.f35052j.f35093a;
        if (this.f35051i >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f35051i, true);
            this.f35051i = -1;
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
            arrayList = this.f35046b;
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
        this.h = ConnectionsManager.getInstance(this.f35052j.f35093a).sendRequestTyped(gettransactions, new Object(), new i0(this, gettransactions, 0));
    }

    public final void e() {
        if (this.f35050g) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f35049f;
        this.f35051i = ConnectionsManager.getInstance(this.f35052j.f35093a).sendRequestTyped(gettransactions, new Object(), new i0(this, gettransactions, 1));
    }

    public final void f() {
        k0 k0Var = this.f35052j;
        NotificationCenter.getInstance(k0Var.f35093a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, k0Var);
    }

    public final void h() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        k0 k0Var = this.f35052j;
        ArrayList arrayList2 = k0Var.f35106p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f35046b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f20300id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f20300id) && TextUtils.equals(wallettransaction.f20300id, wallettransaction2.f20300id)) || (wallettransaction.incoming == wallettransaction2.incoming && (k0.Y(wallettransaction.tx_hash, wallettransaction2.tx_hash) || k0.Y(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        arrayList2.remove(size);
                        m0 m0Var = (m0) k0Var.f35109s.remove(wallettransaction);
                        if (m0Var != null) {
                            m0Var.b();
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f35047c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new mb1(3));
        w2 w2Var = this.f35045a;
        HashSet hashSet = w2Var.f35589a;
        HashSet hashSet2 = w2Var.f35589a;
        HashMap hashMap = w2Var.f35590b;
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
        w2Var.b(4, new ArrayList(hashSet2));
    }
}
