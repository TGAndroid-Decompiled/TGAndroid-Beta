package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class k0 implements v10 {
    public final int f42691a;
    public final l0 f42692b;
    public final TL_wallet.getTransactions f42693c;

    public k0(l0 l0Var, TL_wallet.getTransactions gettransactions, int i7) {
        this.f42691a = i7;
        this.f42692b = l0Var;
        this.f42693c = gettransactions;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        switch (this.f42691a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = this.f42692b;
                int i7 = l0Var.f42733l.f42762a;
                l0Var.f42732k = -1;
                if (wallettransactions != null) {
                    int i10 = 0;
                    qp.s1(i7).Y3(wallettransactions.users, false);
                    qp.s1(i7).S3(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = l0Var.c(wallettransaction2);
                            l0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.f27219id, wallettransaction2.f27219id)) {
                                    c10.f27219id = wallettransaction2.f27219id;
                                }
                            } else {
                                l0Var.f42725b.add(wallettransaction2);
                            }
                        }
                    }
                    l0Var.f42729g = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.f42693c.limit) {
                        l0Var.h = true;
                    }
                } else {
                    l0Var.h = true;
                }
                l0Var.k();
                l0Var.i();
                return;
            default:
                l0 l0Var2 = this.f42692b;
                HashMap hashMap = l0Var2.f42728f;
                HashSet hashSet = l0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i11 = l0Var2.f42733l.f42762a;
                ArrayList arrayList2 = l0Var2.f42725b;
                l0Var2.f42731j = -1;
                boolean z11 = false;
                l0Var2.f42730i = false;
                if (wallettransactions2 != null) {
                    qp.s1(i11).Y3(wallettransactions2.users, false);
                    qp.s1(i11).S3(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (l0Var2.c(wallettransaction3) != null) {
                                boolean z12 = false;
                                for (int size3 = wallettransactions2.transactions.size() - 1; size3 >= 0; size3--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size3);
                                    TL_wallet.walletTransaction c11 = l0Var2.c(wallettransaction4);
                                    l0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean z13 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.f27219id, wallettransaction4.f27219id)) {
                                            c11.f27219id = wallettransaction4.f27219id;
                                            z13 = true;
                                        }
                                        if (!z13) {
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                    }
                                    z12 = true;
                                }
                                z11 = z12;
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
                                            z10 = true;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (z10) {
                                    arrayList4.add(wallettransaction5);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                            int size5 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size5) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i14);
                                i14++;
                                l0Var2.e(wallettransaction6);
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
                                            z9 = true;
                                        }
                                    } else {
                                        z9 = false;
                                    }
                                }
                                if (z9) {
                                    l0Var2.f(wallettransaction7);
                                }
                            }
                            l0Var2.f42729g = wallettransactions2.next_offset;
                            if (wallettransactions2.transactions.size() < this.f42693c.limit) {
                                z11 = true;
                            }
                            l0Var2.h = z11;
                            z11 = true;
                        }
                    }
                }
                if (z11) {
                    l0Var2.k();
                    l0Var2.i();
                    return;
                }
                return;
        }
    }
}
