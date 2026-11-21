package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class s0 implements q10 {
    public final int f45008a;
    public final t0 f45009b;
    public final TL_wallet.getTransactions f45010c;

    public s0(t0 t0Var, TL_wallet.getTransactions gettransactions, int i7) {
        this.f45008a = i7;
        this.f45009b = t0Var;
        this.f45010c = gettransactions;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f45008a) {
            case 0:
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                t0 t0Var = this.f45009b;
                int i7 = t0Var.f45091m.f45123a;
                t0Var.f45090l = -1;
                int i10 = 0;
                t0Var.f45089k = false;
                if (wallettransactions != null) {
                    mp.u1(i7).f4(wallettransactions.users, false);
                    mp.u1(i7).Z3(wallettransactions.chats, false);
                    int size = wallettransactions.transactions.size();
                    u0.p(wallettransactions.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList = wallettransactions.transactions;
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        TL_wallet.walletTransaction wallettransaction = arrayList.get(i10);
                        i10++;
                        TL_wallet.walletTransaction wallettransaction2 = wallettransaction;
                        if (wallettransaction2 != null) {
                            TL_wallet.walletTransaction c10 = t0Var.c(wallettransaction2);
                            t0Var.e(wallettransaction2);
                            if (c10 != null) {
                                c10.set(wallettransaction2);
                                if (!TextUtils.equals(c10.f28694id, wallettransaction2.f28694id)) {
                                    c10.f28694id = wallettransaction2.f28694id;
                                }
                            } else {
                                t0Var.f45082b.add(wallettransaction2);
                            }
                        }
                    }
                    String str = wallettransactions.next_offset;
                    t0Var.f45086g = str;
                    if (size < this.f45010c.limit || TextUtils.isEmpty(str)) {
                        t0Var.h = true;
                    }
                } else {
                    t0Var.h = true;
                }
                t0Var.k();
                t0Var.i();
                return;
            default:
                t0 t0Var2 = this.f45009b;
                HashMap hashMap = t0Var2.f45085f;
                HashSet hashSet = t0Var2.d;
                TL_wallet.walletTransactions wallettransactions2 = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList2 = t0Var2.f45082b;
                u0 u0Var = t0Var2.f45091m;
                int i11 = u0Var.f45123a;
                h hVar = u0Var.I;
                t0Var2.f45088j = -1;
                t0Var2.f45087i = false;
                if (wallettransactions2 != null) {
                    mp.u1(i11).f4(wallettransactions2.users, false);
                    mp.u1(i11).Z3(wallettransactions2.chats, false);
                    int size3 = wallettransactions2.transactions.size();
                    u0.p(wallettransactions2.transactions);
                    ArrayList<TL_wallet.walletTransaction> arrayList3 = wallettransactions2.transactions;
                    int size4 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size4) {
                            TL_wallet.walletTransaction wallettransaction3 = arrayList3.get(i12);
                            i12++;
                            if (t0Var2.c(wallettransaction3) != null) {
                                boolean z15 = false;
                                for (int size5 = wallettransactions2.transactions.size() - 1; size5 >= 0; size5--) {
                                    TL_wallet.walletTransaction wallettransaction4 = wallettransactions2.transactions.get(size5);
                                    TL_wallet.walletTransaction c11 = t0Var2.c(wallettransaction4);
                                    t0Var2.e(wallettransaction4);
                                    if (c11 != null) {
                                        boolean a10 = u0.a(c11);
                                        boolean z16 = c11.set(wallettransaction4);
                                        if (!TextUtils.equals(c11.f28694id, wallettransaction4.f28694id)) {
                                            c11.f28694id = wallettransaction4.f28694id;
                                            z16 = true;
                                        }
                                        if (z16) {
                                            z15 = true;
                                        }
                                        if (!a10 && u0.a(c11)) {
                                            org.telegram.messenger.g0.r(hVar);
                                            org.telegram.messenger.g0.h3(hVar, 300L);
                                        }
                                    } else {
                                        arrayList2.add(0, wallettransaction4);
                                        if (u0.a(wallettransaction4)) {
                                            org.telegram.messenger.g0.r(hVar);
                                            org.telegram.messenger.g0.h3(hVar, 300L);
                                        }
                                        z15 = true;
                                    }
                                }
                                z10 = z15;
                            }
                        } else {
                            if (arrayList2.isEmpty() && !t0Var2.h) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            boolean z17 = t0Var2.f45089k;
                            if (z17) {
                                t0Var2.a();
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
                                t0Var2.e(wallettransaction7);
                                if (z11 && u0.a(wallettransaction7)) {
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
                                    t0Var2.f(wallettransaction8);
                                }
                            }
                            String str2 = wallettransactions2.next_offset;
                            t0Var2.f45086g = str2;
                            if (size3 >= this.f45010c.limit && !TextUtils.isEmpty(str2)) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            t0Var2.h = z12;
                            if (z17) {
                                t0Var2.h();
                            }
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    t0Var2.k();
                    t0Var2.i();
                    return;
                }
                return;
        }
    }
}
