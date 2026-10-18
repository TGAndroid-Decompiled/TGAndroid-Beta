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
import org.telegram.ui.kg0;
public final class l0 {
    public boolean h;
    public boolean f34420i;
    public final m0 f34423l;
    public final e3 f34415a = new e3();
    public final ArrayList f34416b = new ArrayList();
    public final ArrayList f34417c = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public final HashMap f34418f = new HashMap();
    public String f34419g = "";
    public int f34421j = -1;
    public int f34422k = -1;

    public l0(m0 m0Var) {
        this.f34423l = m0Var;
    }

    public static TL_wallet.walletTransaction c(String str, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (TextUtils.equals(((TL_wallet.walletTransaction) arrayList.get(i10)).f20531id, str)) {
                return (TL_wallet.walletTransaction) arrayList.get(i10);
            }
        }
        return null;
    }

    public static String i(JSONObject jSONObject) {
        String optString = jSONObject.optString("lt", "");
        String optString2 = jSONObject.optString("hash", "");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return a1.g.C(optString, ":", optString2);
        }
        return null;
    }

    public final void a() {
        int i10 = this.f34423l.f34451a;
        if (this.f34422k >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34422k, true);
            this.f34422k = -1;
        }
        if (this.f34421j >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34421j, true);
            this.f34421j = -1;
        }
        this.f34420i = false;
    }

    public final org.telegram.tgnet.tl.TL_wallet.walletTransaction b(org.telegram.tgnet.tl.TL_wallet.walletTransaction r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l0.b(org.telegram.tgnet.tl.TL_wallet$walletTransaction):org.telegram.tgnet.tl.TL_wallet$walletTransaction");
    }

    public final void d(TL_wallet.walletTransaction wallettransaction) {
        String str = wallettransaction.f20531id;
        HashMap hashMap = this.e;
        hashMap.remove(str);
        HashSet hashSet = this.d;
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = (String) obj;
            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f34418f.get(str2);
            if (TextUtils.equals(str2, wallettransaction.f20531id) || (wallettransaction2 != null && m0.f0(wallettransaction2, wallettransaction))) {
                hashSet.remove(str2);
                hashMap.remove(str2);
            }
        }
    }

    public final void e(TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f34416b;
            if (i10 >= arrayList.size() || ((TL_wallet.walletTransaction) arrayList.get(i10)).date < wallettransaction.date) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, wallettransaction);
    }

    public final void f() {
        if (this.f34420i) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = "";
        this.f34420i = true;
        this.f34421j = ConnectionsManager.getInstance(this.f34423l.f34451a).sendRequestTyped(gettransactions, new Object(), new k0(this, gettransactions, 0));
    }

    public final void g() {
        if (this.h) {
            return;
        }
        TL_wallet.getTransactions gettransactions = new TL_wallet.getTransactions();
        gettransactions.inbound = true;
        gettransactions.outbound = true;
        gettransactions.limit = 10;
        gettransactions.offset = this.f34419g;
        this.f34422k = ConnectionsManager.getInstance(this.f34423l.f34451a).sendRequestTyped(gettransactions, new Object(), new k0(this, gettransactions, 1));
    }

    public final void h() {
        m0 m0Var = this.f34423l;
        NotificationCenter.getInstance(m0Var.f34451a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletTransactionsUpdate, this, m0Var);
    }

    public final void j() {
        int i10;
        ArrayList arrayList;
        TL_wallet.WalletTransactionPeer walletTransactionPeer;
        String str;
        m0 m0Var = this.f34423l;
        ArrayList arrayList2 = m0Var.f34463p;
        int size = arrayList2.size();
        while (true) {
            size--;
            i10 = 0;
            arrayList = this.f34416b;
            if (size < 0) {
                break;
            }
            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size);
            if (!TextUtils.isEmpty(wallettransaction.f20531id) || !TextUtils.isEmpty(wallettransaction.tx_hash) || !TextUtils.isEmpty(wallettransaction.messageHash)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                    if ((!TextUtils.isEmpty(wallettransaction.f20531id) && TextUtils.equals(wallettransaction.f20531id, wallettransaction2.f20531id)) || (wallettransaction.incoming == wallettransaction2.incoming && (m0.a0(wallettransaction.tx_hash, wallettransaction2.tx_hash) || m0.a0(wallettransaction.messageHash, wallettransaction2.messageHash)))) {
                        if (TextUtils.isEmpty(wallettransaction2.gaslessMessageBodyHash)) {
                            wallettransaction2.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
                        }
                        if (TextUtils.isEmpty(wallettransaction2.normalMessageBodyHash)) {
                            wallettransaction2.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
                        }
                        arrayList2.remove(size);
                        o0 o0Var = (o0) m0Var.f34467t.remove(wallettransaction);
                        if (o0Var != null) {
                            o0Var.b();
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            String str2 = ((TL_wallet.walletTransaction) arrayList.get(i11)).f20531id;
            if (!TextUtils.isEmpty(str2) && !hashSet.add(str2)) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        ArrayList arrayList3 = this.f34417c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(arrayList);
        List.EL.sort(arrayList3, new kg0(10));
        e3 e3Var = this.f34415a;
        HashSet hashSet2 = e3Var.f34120a;
        HashSet hashSet3 = e3Var.f34120a;
        HashMap hashMap = e3Var.f34121b;
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
