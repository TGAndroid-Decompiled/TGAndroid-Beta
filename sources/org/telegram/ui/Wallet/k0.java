package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class k0 implements Utilities.Callback2 {
    public final int f34388a;
    public final l0 f34389b;
    public final TL_wallet.getTransactions f34390c;

    public k0(l0 l0Var, TL_wallet.getTransactions gettransactions, int i10) {
        this.f34388a = i10;
        this.f34389b = l0Var;
        this.f34390c = gettransactions;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f34388a) {
            case 0:
                l0 l0Var = this.f34389b;
                HashMap hashMap = l0Var.f34418f;
                HashSet hashSet = l0Var.d;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i10 = l0Var.f34423l.f34451a;
                ArrayList arrayList = l0Var.f34416b;
                l0Var.f34421j = -1;
                boolean z12 = false;
                l0Var.f34420i = false;
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
                            if (l0Var.b(wallettransaction) != null) {
                                boolean z13 = false;
                                for (int size2 = wallettransactions.transactions.size() - 1; size2 >= 0; size2--) {
                                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(size2);
                                    TL_wallet.walletTransaction b10 = l0Var.b(wallettransaction2);
                                    l0Var.d(wallettransaction2);
                                    if (b10 != null) {
                                        boolean z14 = b10.set(wallettransaction2);
                                        if (!TextUtils.equals(b10.f20531id, wallettransaction2.f20531id)) {
                                            b10.f20531id = wallettransaction2.f20531id;
                                            z14 = true;
                                        }
                                        if (!z14) {
                                        }
                                    } else {
                                        arrayList.add(0, wallettransaction2);
                                    }
                                    z13 = true;
                                }
                                z12 = z13;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int size3 = arrayList.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                Object obj3 = arrayList.get(i12);
                                i12++;
                                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (hashMap.get((String) it.next()) == wallettransaction3) {
                                            z11 = true;
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                }
                                if (z11) {
                                    arrayList3.add(wallettransaction3);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList4 = wallettransactions.transactions;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                TL_wallet.walletTransaction wallettransaction4 = arrayList4.get(i13);
                                i13++;
                                l0Var.d(wallettransaction4);
                            }
                            arrayList.clear();
                            arrayList.addAll(wallettransactions.transactions);
                            int size5 = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                Object obj4 = arrayList3.get(i14);
                                i14++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (hashMap.get((String) it2.next()) == wallettransaction5) {
                                            z10 = true;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (z10) {
                                    l0Var.e(wallettransaction5);
                                }
                            }
                            l0Var.f34419g = wallettransactions.next_offset;
                            if (wallettransactions.transactions.size() < this.f34390c.limit) {
                                z12 = true;
                            }
                            l0Var.h = z12;
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    l0Var.j();
                    l0Var.h();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0 l0Var2 = this.f34389b;
                int i15 = l0Var2.f34423l.f34451a;
                l0Var2.f34422k = -1;
                if (wallettransactions2 != null) {
                    int i16 = 0;
                    MessagesController.getInstance(i15).putUsers(wallettransactions2.users, false);
                    MessagesController.getInstance(i15).putChats(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                    int size6 = arrayList5.size();
                    while (i16 < size6) {
                        TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i16);
                        i16++;
                        TL_wallet.walletTransaction wallettransaction7 = wallettransaction6;
                        if (wallettransaction7 != null) {
                            TL_wallet.walletTransaction b11 = l0Var2.b(wallettransaction7);
                            l0Var2.d(wallettransaction7);
                            if (b11 != null) {
                                b11.set(wallettransaction7);
                                if (!TextUtils.equals(b11.f20531id, wallettransaction7.f20531id)) {
                                    b11.f20531id = wallettransaction7.f20531id;
                                }
                            } else {
                                l0Var2.f34416b.add(wallettransaction7);
                            }
                        }
                    }
                    l0Var2.f34419g = wallettransactions2.next_offset;
                    if (wallettransactions2.transactions.size() < this.f34390c.limit) {
                        l0Var2.h = true;
                    }
                } else {
                    l0Var2.h = true;
                }
                l0Var2.j();
                l0Var2.h();
                return;
        }
    }
}
