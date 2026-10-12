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
import org.telegram.ui.es0;
public final class i0 {
    public boolean f33277g;
    public final j0 f33279j;
    public final w2 f33273a = new w2();
    public final ArrayList f33274b = new ArrayList();
    public final ArrayList f33275c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public String f33276f = "";
    public int h = -1;
    public int f33278i = -1;

    public i0(j0 j0Var) {
        this.f33279j = j0Var;
    }

    public static TL_wallet.walletTransaction b(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f19476id, str)) {
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
        int i10 = this.f33279j.f33319a;
        if (this.f33278i >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f33278i, true);
            this.f33278i = -1;
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
            arrayList = this.f33274b;
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
        this.h = ConnectionsManager.getInstance(this.f33279j.f33319a).sendRequestTyped(gettransactions, new Object(), new h0(this, gettransactions, 0));
    }

    public final void e() {
        if (this.f33277g) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f33276f;
        this.f33278i = ConnectionsManager.getInstance(this.f33279j.f33319a).sendRequestTyped(gettransactions, new Object(), new h0(this, gettransactions, 1));
    }

    public final void f() {
        j0 j0Var = this.f33279j;
        NotificationCenter.getInstance(j0Var.f33319a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, j0Var);
    }

    public final void h() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        j0 j0Var = this.f33279j;
        ArrayList arrayList2 = j0Var.f33331p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f33274b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f19476id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f19476id) && TextUtils.equals(wallettransaction.f19476id, wallettransaction2.f19476id)) || (wallettransaction.incoming == wallettransaction2.incoming && (j0.Y(wallettransaction.tx_hash, wallettransaction2.tx_hash) || j0.Y(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        arrayList2.remove(size);
                        l0 l0Var = (l0) j0Var.f33334s.remove(wallettransaction);
                        if (l0Var != null) {
                            l0Var.b();
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = this.f33275c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new es0(7));
        w2 w2Var = this.f33273a;
        HashSet hashSet = w2Var.f33792a;
        HashSet hashSet2 = w2Var.f33792a;
        HashMap hashMap = w2Var.f33793b;
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
