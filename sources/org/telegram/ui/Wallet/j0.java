package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class j0 implements s10 {
    public final int f44000a;
    public final k0 f44001b;
    public final TL_wallet.getTransactions f44002c;

    public j0(k0 k0Var, TL_wallet.getTransactions gettransactions, int i7) {
        this.f44000a = i7;
        this.f44001b = k0Var;
        this.f44002c = gettransactions;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f44000a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0 k0Var = this.f44001b;
                int i7 = k0Var.f44051l.f44078a;
                k0Var.f44050k = -1;
                if (wallettransactions != null) {
                    int i10 = 0;
                    np.s1(i7).Y3(wallettransactions.users, false);
                    np.s1(i7).S3(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = k0Var.c(wallettransaction2);
                            k0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.f28314id, wallettransaction2.f28314id)) {
                                    c10.f28314id = wallettransaction2.f28314id;
                                }
                            } else {
                                k0Var.f44043b.add(wallettransaction2);
                            }
                        }
                    }
                    k0Var.f44047g = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.f44002c.limit) {
                        k0Var.h = true;
                    }
                } else {
                    k0Var.h = true;
                }
                k0Var.k();
                k0Var.i();
                return;
            default:
                k0 k0Var2 = this.f44001b;
                HashMap hashMap = k0Var2.f44046f;
                HashSet hashSet = k0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i11 = k0Var2.f44051l.f44078a;
                ArrayList arrayList2 = k0Var2.f44043b;
                k0Var2.f44049j = -1;
                boolean z12 = false;
                k0Var2.f44048i = false;
                if (wallettransactions2 != null) {
                    np.s1(i11).Y3(wallettransactions2.users, false);
                    np.s1(i11).S3(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (k0Var2.c(wallettransaction3) != null) {
                                boolean z13 = false;
                                for (int size3 = wallettransactions2.transactions.size() - 1; size3 >= 0; size3--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size3);
                                    TL_wallet.walletTransaction c11 = k0Var2.c(wallettransaction4);
                                    k0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean z14 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.f28314id, wallettransaction4.f28314id)) {
                                            c11.f28314id = wallettransaction4.f28314id;
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
                                k0Var2.e(wallettransaction6);
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
                                    k0Var2.f(wallettransaction7);
                                }
                            }
                            k0Var2.f44047g = wallettransactions2.next_offset;
                            if (wallettransactions2.transactions.size() < this.f44002c.limit) {
                                z12 = true;
                            }
                            k0Var2.h = z12;
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    k0Var2.k();
                    k0Var2.i();
                    return;
                }
                return;
        }
    }
}
