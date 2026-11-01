package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.k20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class i0 implements k20 {
    public final int f34699a;
    public final j0 f34700b;
    public final TL_wallet.getTransactions f34701c;

    public i0(j0 j0Var, TL_wallet.getTransactions gettransactions, int i10) {
        this.f34699a = i10;
        this.f34700b = j0Var;
        this.f34701c = gettransactions;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f34699a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                j0 j0Var = this.f34700b;
                int i10 = j0Var.f34742l.f34781a;
                j0Var.f34741k = -1;
                if (wallettransactions != null) {
                    int i11 = 0;
                    wp.r1(i10).V3(wallettransactions.users, false);
                    wp.r1(i10).P3(wallettransactions.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i11);
                        i11++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = j0Var.c(wallettransaction2);
                            j0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.f20057id, wallettransaction2.f20057id)) {
                                    c10.f20057id = wallettransaction2.f20057id;
                                }
                            } else {
                                j0Var.f34735b.add(wallettransaction2);
                            }
                        }
                    }
                    j0Var.f34738g = wallettransactions.next_offset;
                    if (wallettransactions.transactions.size() < this.f34701c.limit) {
                        j0Var.h = true;
                    }
                } else {
                    j0Var.h = true;
                }
                j0Var.k();
                j0Var.i();
                return;
            default:
                j0 j0Var2 = this.f34700b;
                HashMap hashMap = j0Var2.f34737f;
                HashSet hashSet = j0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i12 = j0Var2.f34742l.f34781a;
                ArrayList arrayList2 = j0Var2.f34735b;
                j0Var2.f34740j = -1;
                boolean z12 = false;
                j0Var2.f34739i = false;
                if (wallettransactions2 != null) {
                    wp.r1(i12).V3(wallettransactions2.users, false);
                    wp.r1(i12).P3(wallettransactions2.chats, false);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i13);
                            i13++;
                            if (j0Var2.c(wallettransaction3) != null) {
                                boolean z13 = false;
                                for (int size3 = wallettransactions2.transactions.size() - 1; size3 >= 0; size3--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size3);
                                    TL_wallet.walletTransaction c11 = j0Var2.c(wallettransaction4);
                                    j0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean z14 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.f20057id, wallettransaction4.f20057id)) {
                                            c11.f20057id = wallettransaction4.f20057id;
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
                            int i14 = 0;
                            while (i14 < size4) {
                                Object obj3 = arrayList2.get(i14);
                                i14++;
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
                            int i15 = 0;
                            while (i15 < size5) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i15);
                                i15++;
                                j0Var2.e(wallettransaction6);
                            }
                            arrayList2.clear();
                            arrayList2.addAll(wallettransactions2.transactions);
                            int size6 = arrayList4.size();
                            int i16 = 0;
                            while (i16 < size6) {
                                Object obj4 = arrayList4.get(i16);
                                i16++;
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
                            j0Var2.f34738g = wallettransactions2.next_offset;
                            if (wallettransactions2.transactions.size() < this.f34701c.limit) {
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
