package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class q implements org.telegram.messenger.v10 {
    public final int f37091a;
    public final int f37092b;
    public final Object f37093c;

    public q(Object obj, int i7, int i10) {
        this.f37091a = i10;
        this.f37093c = obj;
        this.f37092b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z9;
        String a10;
        int i7 = this.f37091a;
        int i10 = this.f37092b;
        Object obj3 = this.f37093c;
        switch (i7) {
            case 0:
                s sVar = (s) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    sVar.f37843a2[i10] = aicomposetoneexample;
                    sVar.Y1.O(true);
                    return;
                }
                sVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (p0Var.d && p0Var.f42968e == i10) {
                    p0Var.f42970g = -1;
                    org.telegram.messenger.g0.r(p0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(p0Var.f42965a);
                    sb2.append(" msg_hash=");
                    sb2.append(p0Var.f42966b);
                    sb2.append(" transactions=");
                    Object obj4 = "none";
                    if (wallettransactions == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(wallettransactions.transactions.size());
                    }
                    sb2.append(valueOf);
                    sb2.append(" errorCode=");
                    if (tL_error2 != null) {
                        obj4 = Integer.valueOf(tL_error2.code);
                    }
                    sb2.append(obj4);
                    org.telegram.messenger.a8.b(sb2.toString());
                    if (tL_error2 == null && wallettransactions != null) {
                        org.telegram.ui.lk0 lk0Var = p0Var.f42967c;
                        org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) lk0Var.f47555b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) lk0Var.f47556c;
                        int i11 = n0Var.f42793a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            org.telegram.messenger.qp.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.qp.s1(i11).S3(wallettransactions.chats, false);
                            n0Var.c(wallettransaction, it.next());
                            n0Var.E();
                            p0Var.b();
                            return;
                        }
                    }
                    if (p0Var.d && p0Var.f42968e == i10) {
                        p0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                k41 k41Var = (k41) obj2;
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((bi.g5) obj3).f3941c;
                if (i10 == 0) {
                    k41Var.V();
                    org.telegram.ui.Wallet.m0 m0Var = y5Var.D0;
                    if (m0Var != null && !m0Var.f42757c.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        for (int i12 = 0; i12 < y5Var.D0.f42757c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) y5Var.D0.f42757c.get(i12);
                            org.telegram.ui.Wallet.v3 v3Var = y5Var.D0.f42755a;
                            int i13 = org.telegram.ui.Wallet.u3.f43201b;
                            w31 K = w31.K(org.telegram.ui.Wallet.u3.class);
                            org.telegram.ui.Wallet.t3 t3Var = new org.telegram.ui.Wallet.t3(wallettransaction2);
                            t3Var.set(wallettransaction2);
                            t3Var.f27215id = wallettransaction2.f27215id;
                            t3Var.random_id = wallettransaction2.random_id;
                            t3Var.gasless = wallettransaction2.gasless;
                            t3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            t3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            t3Var.nft = wallettransaction2.nft;
                            K.G = t3Var;
                            K.H = v3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a10 = null;
                            } else {
                                a10 = v3Var.a(walletTransactionPeer.address);
                            }
                            K.f39830l = a10;
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.m0 m0Var2 = y5Var.D0;
                    if (m0Var2 != null && !m0Var2.h) {
                        arrayList.add(w31.q(-1, 37));
                        arrayList.add(w31.q(-2, 37));
                        arrayList.add(w31.q(-3, 37));
                    }
                    k41Var.U();
                    if (z9) {
                        long j3 = ((org.telegram.messenger.l0) y5Var.getMessagesController().f24927x7.f24439l0.f13889b).f23806c;
                        if (j3 > 0) {
                            arrayList.add(w31.C(org.telegram.messenger.hd.V(null, null, 2131743099, org.telegram.ui.Wallet.n0.s(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.f0 f0Var = y5Var.E0;
                if (f0Var != null) {
                    ArrayList arrayList2 = f0Var.f42443a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj5 = arrayList2.get(i14);
                        i14++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (y5Var.f43378k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(y5Var.f43378k0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.c8 c8Var = y5Var.f43377j0;
                                int i15 = org.telegram.ui.Wallet.o7.f42929b;
                                w31 K2 = w31.K(org.telegram.ui.Wallet.o7.class);
                                K2.f39839u = 1;
                                K2.G = nftitem;
                                K2.H = c8Var;
                                arrayList.add(K2);
                            } else {
                                int i16 = org.telegram.ui.Wallet.b.f42113b;
                                w31 K3 = w31.K(org.telegram.ui.Wallet.b.class);
                                K3.G = nftitem;
                                K3.f39839u = 1;
                                arrayList.add(K3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !y5Var.f43378k0.isEmpty()) {
                        org.telegram.ui.Wallet.f0 f0Var2 = y5Var.E0;
                        if (!f0Var2.f42449i && f0Var2.f42448g) {
                            arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131748166, null)));
                        }
                    }
                    org.telegram.ui.Wallet.f0 f0Var3 = y5Var.E0;
                    if (f0Var3.f42449i) {
                        for (int i17 = 0; i17 < 3; i17++) {
                            w31 q10 = w31.q((-1) - i17, 35);
                            q10.f39839u = 1;
                            arrayList.add(q10);
                        }
                        return;
                    } else if (f0Var3.f42451k != null) {
                        arrayList.add(w31.e(-10001, org.telegram.messenger.hd.M0(2131746053, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
