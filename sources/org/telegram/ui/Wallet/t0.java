package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t0 implements p10 {
    public final int f45140a;
    public final u0 f45141b;
    public final TL_wallet.getTransactions f45142c;

    public t0(u0 u0Var, TL_wallet.getTransactions gettransactions, int i7) {
        this.f45140a = i7;
        this.f45141b = u0Var;
        this.f45142c = gettransactions;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f45140a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u0 u0Var = this.f45141b;
                int i7 = u0Var.f45223m.f45255a;
                u0Var.f45222l = -1;
                int i10 = 0;
                u0Var.f45221k = false;
                if (wallettransactions != null) {
                    mp.u1(i7).f4(wallettransactions.users, false);
                    mp.u1(i7).Z3(wallettransactions.chats, false);
                    int size = wallettransactions.transactions.size();
                    v0.p(wallettransactions.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = u0Var.c(wallettransaction2);
                            u0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.f28755id, wallettransaction2.f28755id)) {
                                    c10.f28755id = wallettransaction2.f28755id;
                                }
                            } else {
                                u0Var.f45214b.add(wallettransaction2);
                            }
                        }
                    }
                    String str = wallettransactions.next_offset;
                    u0Var.f45218g = str;
                    if (size < this.f45142c.limit || TextUtils.isEmpty(str)) {
                        u0Var.h = true;
                    }
                } else {
                    u0Var.h = true;
                }
                u0Var.k();
                u0Var.i();
                return;
            default:
                u0 u0Var2 = this.f45141b;
                HashMap hashMap = u0Var2.f45217f;
                HashSet hashSet = u0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList2 = u0Var2.f45214b;
                v0 v0Var = u0Var2.f45223m;
                int i11 = v0Var.f45255a;
                h hVar = v0Var.I;
                u0Var2.f45220j = -1;
                u0Var2.f45219i = false;
                if (wallettransactions2 != null) {
                    mp.u1(i11).f4(wallettransactions2.users, false);
                    mp.u1(i11).Z3(wallettransactions2.chats, false);
                    int size3 = wallettransactions2.transactions.size();
                    v0.p(wallettransactions2.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size4 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size4) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (u0Var2.c(wallettransaction3) != null) {
                                boolean z15 = false;
                                for (int size5 = wallettransactions2.transactions.size() - 1; size5 >= 0; size5--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size5);
                                    TL_wallet.walletTransaction c11 = u0Var2.c(wallettransaction4);
                                    u0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean a10 = v0.a(c11);
                                        boolean z16 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.f28755id, wallettransaction4.f28755id)) {
                                            c11.f28755id = wallettransaction4.f28755id;
                                            z16 = true;
                                        }
                                        if (z16) {
                                            z15 = true;
                                        }
                                        if (!a10 && v0.a(c11)) {
                                            org.telegram.messenger.g0.r(hVar);
                                            org.telegram.messenger.g0.h3(hVar, 300L);
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                        if (v0.a(wallettransaction4)) {
                                            org.telegram.messenger.g0.r(hVar);
                                            org.telegram.messenger.g0.h3(hVar, 300L);
                                        }
                                        z15 = true;
                                    }
                                }
                                z10 = z15;
                            }
                        } else {
                            if (arrayList2.isEmpty() && !u0Var2.h) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            boolean z17 = u0Var2.f45221k;
                            if (z17) {
                                u0Var2.a();
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int size6 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size6) {
                                Object obj3 = arrayList2.get(i13);
                                i13++;
                                TL_wallet.walletTransaction wallettransaction5 = (TL_wallet.walletTransaction) obj3;
                                Iterator it = hashSet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (hashMap.get((String) it.next()) == wallettransaction5) {
                                            z14 = true;
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    arrayList4.add(wallettransaction5);
                                }
                            }
                            ArrayList<TL_wallet.walletTransaction> arrayList5 = wallettransactions2.transactions;
                            int size7 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size7) {
                                TL_wallet.walletTransaction wallettransaction6 = arrayList5.get(i14);
                                i14++;
                                TL_wallet.walletTransaction wallettransaction7 = wallettransaction6;
                                u0Var2.e(wallettransaction7);
                                if (z11 && v0.a(wallettransaction7)) {
                                    org.telegram.messenger.g0.r(hVar);
                                    org.telegram.messenger.g0.h3(hVar, 300L);
                                }
                            }
                            arrayList2.clear();
                            arrayList2.addAll(wallettransactions2.transactions);
                            int size8 = arrayList4.size();
                            int i15 = 0;
                            while (i15 < size8) {
                                Object obj4 = arrayList4.get(i15);
                                i15++;
                                TL_wallet.walletTransaction wallettransaction8 = (TL_wallet.walletTransaction) obj4;
                                Iterator it2 = hashSet.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (hashMap.get((String) it2.next()) == wallettransaction8) {
                                            z13 = true;
                                        }
                                    } else {
                                        z13 = false;
                                    }
                                }
                                if (z13) {
                                    u0Var2.f(wallettransaction8);
                                }
                            }
                            String str2 = wallettransactions2.next_offset;
                            u0Var2.f45218g = str2;
                            if (size3 >= this.f45142c.limit && !TextUtils.isEmpty(str2)) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            u0Var2.h = z12;
                            if (z17) {
                                u0Var2.h();
                            }
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    u0Var2.k();
                    u0Var2.i();
                    return;
                }
                return;
        }
    }
}
