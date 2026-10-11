package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class j0 implements Utilities.Callback2 {
    public final int f35096a;
    public final k0 f35097b;
    public final TL_wallet.getTransactions f35098c;

    public j0(k0 k0Var, TL_wallet.getTransactions gettransactions, int i10) {
        this.f35096a = i10;
        this.f35097b = k0Var;
        this.f35098c = gettransactions;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f35096a) {
            case 0:
                k0 k0Var = this.f35097b;
                HashMap hashMap = k0Var.f35143e;
                int i10 = k0Var.f35147j.f35185a;
                HashSet hashSet = k0Var.d;
                ArrayList arrayList = k0Var.f35141b;
                k0Var.h = -1;
                boolean z10 = false;
                if (wallettransactions != null) {
                    MessagesController.getInstance(i10).putUsers(wallettransactions.users, false);
                    MessagesController.getInstance(i10).putChats(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList2 = wallettransactions.transactions;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            TL_wallet.walletTransaction wallettransaction = arrayList2.get(i11);
                            i11++;
                            if (k0.b(wallettransaction.f20294id, arrayList) != null) {
                                boolean z11 = false;
                                for (int size2 = wallettransactions.transactions.size() - 1; size2 >= 0; size2--) {
                                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(size2);
                                    hashSet.remove(wallettransaction2.f20294id);
                                    hashMap.remove(wallettransaction2.f20294id);
                                    TL_wallet.walletTransaction b10 = k0.b(wallettransaction2.f20294id, arrayList);
                                    if (b10 != null) {
                                        if (!b10.set(wallettransaction2)) {
                                        }
                                    } else {
                                        arrayList.add(0, wallettransaction2);
                                    }
                                    z11 = true;
                                }
                                z10 = z11;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int size3 = arrayList.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                Object obj3 = arrayList.get(i12);
                                i12++;
                                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj3;
                                if (hashSet.contains(wallettransaction3.f20294id)) {
                                    arrayList3.add(wallettransaction3);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList4 = wallettransactions.transactions;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                TL_wallet.walletTransaction wallettransaction4 = arrayList4.get(i13);
                                i13++;
                                TL_wallet.walletTransaction wallettransaction5 = wallettransaction4;
                                hashSet.remove(wallettransaction5.f20294id);
                                hashMap.remove(wallettransaction5.f20294id);
                            }
                            arrayList.clear();
                            arrayList.addAll(wallettransactions.transactions);
                            int size5 = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                Object obj4 = arrayList3.get(i14);
                                i14++;
                                TL_wallet.walletTransaction wallettransaction6 = (TL_wallet.walletTransaction) obj4;
                                if (hashSet.contains(wallettransaction6.f20294id)) {
                                    k0Var.c(wallettransaction6);
                                }
                            }
                            k0Var.f35144f = wallettransactions.next_offset;
                            if (wallettransactions.transactions.size() < this.f35098c.limit) {
                                z10 = true;
                            }
                            k0Var.f35145g = z10;
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    k0Var.h();
                    k0Var.f();
                    return;
                }
                return;
            default:
                k0 k0Var2 = this.f35097b;
                int i15 = k0Var2.f35147j.f35185a;
                k0Var2.f35146i = -1;
                if (wallettransactions != null) {
                    MessagesController.getInstance(i15).putUsers(wallettransactions.users, false);
                    MessagesController.getInstance(i15).putChats(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions.transactions;
                    int size6 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size6) {
                        TL_wallet.walletTransaction wallettransaction7 = arrayList5.get(i16);
                        i16++;
                        TL_wallet.walletTransaction wallettransaction8 = wallettransaction7;
                        ArrayList arrayList6 = k0Var2.f35141b;
                        if (wallettransaction8 != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList6.size()) {
                                    TL_wallet.walletTransaction wallettransaction9 = (TL_wallet.walletTransaction) arrayList6.get(i17);
                                    if (TextUtils.equals(wallettransaction9.f20294id, wallettransaction8.f20294id)) {
                                        k0Var2.d.remove(wallettransaction8.f20294id);
                                        k0Var2.f35143e.remove(wallettransaction8.f20294id);
                                        wallettransaction9.set(wallettransaction8);
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    arrayList6.add(wallettransaction8);
                                }
                            }
                        }
                    }
                    k0Var2.f35144f = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.f35098c.limit) {
                        k0Var2.f35145g = true;
                    }
                } else {
                    k0Var2.f35145g = true;
                }
                k0Var2.h();
                k0Var2.f();
                return;
        }
    }
}
