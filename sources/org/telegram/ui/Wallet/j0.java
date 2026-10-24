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
public final class j0 implements Utilities.Callback2 {
    public final int f34634a;
    public final k0 f34635b;
    public final TL_wallet.getTransactions f34636c;

    public j0(k0 k0Var, TL_wallet.getTransactions gettransactions, int i10) {
        this.f34634a = i10;
        this.f34635b = k0Var;
        this.f34636c = gettransactions;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f34634a) {
            case 0:
                k0 k0Var = this.f34635b;
                HashMap hashMap = k0Var.f34692f;
                HashSet hashSet = k0Var.d;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i10 = k0Var.f34697l.f34743a;
                ArrayList arrayList = k0Var.f34690b;
                k0Var.f34695j = -1;
                boolean z12 = false;
                k0Var.f34694i = false;
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
                            if (k0Var.c(wallettransaction) != null) {
                                boolean z13 = false;
                                for (int size2 = wallettransactions.transactions.size() - 1; size2 >= 0; size2--) {
                                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(size2);
                                    TL_wallet.walletTransaction c10 = k0Var.c(wallettransaction2);
                                    k0Var.e(wallettransaction2);
                                    if (c10 != null) {
                                        boolean z14 = c10.set(wallettransaction2);
                                        if (!TextUtils.equals(c10.f20603id, wallettransaction2.f20603id)) {
                                            c10.f20603id = wallettransaction2.f20603id;
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
                                k0Var.e(wallettransaction4);
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
                                    k0Var.f(wallettransaction5);
                                }
                            }
                            k0Var.f34693g = wallettransactions.next_offset;
                            if (wallettransactions.transactions.size() < this.f34636c.limit) {
                                z12 = true;
                            }
                            k0Var.h = z12;
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    k0Var.k();
                    k0Var.i();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0 k0Var2 = this.f34635b;
                int i15 = k0Var2.f34697l.f34743a;
                k0Var2.f34696k = -1;
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
                            TL_wallet.walletTransaction c11 = k0Var2.c(wallettransaction7);
                            k0Var2.e(wallettransaction7);
                            if (c11 != null) {
                                c11.set(wallettransaction7);
                                if (!TextUtils.equals(c11.f20603id, wallettransaction7.f20603id)) {
                                    c11.f20603id = wallettransaction7.f20603id;
                                }
                            } else {
                                k0Var2.f34690b.add(wallettransaction7);
                            }
                        }
                    }
                    k0Var2.f34693g = wallettransactions2.next_offset;
                    if (wallettransactions2.transactions.size() < this.f34636c.limit) {
                        k0Var2.h = true;
                    }
                } else {
                    k0Var2.h = true;
                }
                k0Var2.k();
                k0Var2.i();
                return;
        }
    }
}
