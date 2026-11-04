package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class i0 implements n10 {
    public final int f42634a;
    public final j0 f42635b;
    public final TL_wallet.getTransactions f42636c;

    public i0(j0 j0Var, TL_wallet.getTransactions gettransactions, int i3) {
        this.f42634a = i3;
        this.f42635b = j0Var;
        this.f42636c = gettransactions;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f42634a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                j0 j0Var = this.f42635b;
                int i3 = j0Var.f42688l.f42718a;
                j0Var.f42687k = -1;
                if (wallettransactions != null) {
                    int i10 = 0;
                    hp.s1(i3).Y3(wallettransactions.users, false);
                    hp.s1(i3).S3(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c2 = j0Var.c(wallettransaction2);
                            j0Var.e(wallettransaction2);
                            if (c2 != null) {
                                c2.set(wallettransaction2);
                                if (!TextUtils.equals(c2.f27265id, wallettransaction2.f27265id)) {
                                    c2.f27265id = wallettransaction2.f27265id;
                                }
                            } else {
                                j0Var.f42680b.add(wallettransaction2);
                            }
                        }
                    }
                    j0Var.f42684g = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.f42636c.limit) {
                        j0Var.h = true;
                    }
                } else {
                    j0Var.h = true;
                }
                j0Var.k();
                j0Var.i();
                return;
            default:
                j0 j0Var2 = this.f42635b;
                HashMap hashMap = j0Var2.f42683f;
                HashSet hashSet = j0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i11 = j0Var2.f42688l.f42718a;
                ArrayList arrayList2 = j0Var2.f42680b;
                j0Var2.f42686j = -1;
                boolean z12 = false;
                j0Var2.f42685i = false;
                if (wallettransactions2 != null) {
                    hp.s1(i11).Y3(wallettransactions2.users, false);
                    hp.s1(i11).S3(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (j0Var2.c(wallettransaction3) != null) {
                                boolean z13 = false;
                                for (int size3 = wallettransactions2.transactions.size() - 1; size3 >= 0; size3--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size3);
                                    TL_wallet.walletTransaction c10 = j0Var2.c(wallettransaction4);
                                    j0Var2.e(wallettransaction4);
                                    if (c10 != null) {
                                        boolean z14 = c10.set(wallettransaction4);
                                        if (!TextUtils.equals(c10.f27265id, wallettransaction4.f27265id)) {
                                            c10.f27265id = wallettransaction4.f27265id;
                                            z14 = true;
                                        }
                                        if (!z14) {
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                    }
                                    z13 = true;
                                }
                                z12 = z13;
                            }
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            int size4 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Object obj3 = arrayList2.get(i13);
                                i13++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (hashMap.get((String) it.next()) == wallettransaction5) {
                                            z11 = true;
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                }
                                if (z11) {
                                    arrayList4.add(wallettransaction5);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                            int size5 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i14);
                                i14++;
                                j0Var2.e(wallettransaction6);
                            }
                            arrayList2.clear();
                            arrayList2.addAll(wallettransactions2.transactions);
                            int size6 = arrayList4.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                Object obj4 = arrayList4.get(i15);
                                i15++;
                                TL_wallet.walletTransaction wallettransaction7 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (hashMap.get((String) it2.next()) == wallettransaction7) {
                                            z10 = true;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (z10) {
                                    j0Var2.f(wallettransaction7);
                                }
                            }
                            j0Var2.f42684g = wallettransactions2.next_offset;
                            if (wallettransactions2.transactions.size() < this.f42636c.limit) {
                                z12 = true;
                            }
                            j0Var2.h = z12;
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    j0Var2.k();
                    j0Var2.i();
                    return;
                }
                return;
        }
    }
}
