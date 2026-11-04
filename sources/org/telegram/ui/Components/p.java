package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.na1;
public final class p implements org.telegram.messenger.n10 {
    public final int f36998a;
    public final int f36999b;
    public final Object f37000c;

    public p(Object obj, int i3, int i10) {
        this.f36998a = i10;
        this.f37000c = obj;
        this.f36999b = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a10;
        int i3 = this.f36998a;
        int i10 = this.f36999b;
        Object obj3 = this.f37000c;
        switch (i3) {
            case 0:
                r rVar = (r) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    rVar.f37579b2[i10] = aicomposetoneexample;
                    rVar.Z1.O(true);
                    return;
                }
                rVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.f42812e == i10) {
                    m0Var.f42814g = -1;
                    org.telegram.messenger.g0.r(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.f42809a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.f42810b);
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
                        na1 na1Var = m0Var.f42811c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) na1Var.f47927b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) na1Var.f47928c;
                        int i11 = k0Var.f42718a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            org.telegram.messenger.hp.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.hp.s1(i11).S3(wallettransactions.chats, false);
                            k0Var.c(wallettransaction, it.next());
                            k0Var.E();
                            m0Var.b();
                            return;
                        }
                    }
                    if (m0Var.d && m0Var.f42812e == i10) {
                        m0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) ((ci.o4) obj3).f5683c;
                if (i10 == 0) {
                    f41Var.V();
                    org.telegram.ui.Wallet.j0 j0Var = w5Var.E0;
                    if (j0Var != null && !j0Var.f42681c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i12 = 0; i12 < w5Var.E0.f42681c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) w5Var.E0.f42681c.get(i12);
                            org.telegram.ui.Wallet.t3 t3Var = w5Var.E0.f42679a;
                            int i13 = org.telegram.ui.Wallet.s3.f43150b;
                            r31 K = r31.K(org.telegram.ui.Wallet.s3.class);
                            org.telegram.ui.Wallet.r3 r3Var = new org.telegram.ui.Wallet.r3(wallettransaction2);
                            r3Var.set(wallettransaction2);
                            r3Var.f27265id = wallettransaction2.f27265id;
                            r3Var.random_id = wallettransaction2.random_id;
                            r3Var.gasless = wallettransaction2.gasless;
                            r3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            r3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            r3Var.nft = wallettransaction2.nft;
                            K.G = r3Var;
                            K.H = t3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a10 = null;
                            } else {
                                a10 = t3Var.a(walletTransactionPeer.address);
                            }
                            K.f37627l = a10;
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.j0 j0Var2 = w5Var.E0;
                    if (j0Var2 != null && !j0Var2.h) {
                        arrayList.add(r31.q(-1, 37));
                        arrayList.add(r31.q(-2, 37));
                        arrayList.add(r31.q(-3, 37));
                    }
                    f41Var.U();
                    if (z10) {
                        long j10 = ((org.telegram.messenger.l0) w5Var.getMessagesController().f23167x7.f24666l0.f13688b).f23921c;
                        if (j10 > 0) {
                            arrayList.add(r31.C(org.telegram.messenger.bd.V(null, null, 2131743108, org.telegram.ui.Wallet.k0.s(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.c0 c0Var = w5Var.F0;
                if (c0Var != null) {
                    ArrayList arrayList2 = c0Var.f42360a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj5 = arrayList2.get(i14);
                        i14++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (w5Var.f43332l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(w5Var.f43332l0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.b8 b8Var = w5Var.f43331k0;
                                int i15 = org.telegram.ui.Wallet.n7.f42947b;
                                r31 K2 = r31.K(org.telegram.ui.Wallet.n7.class);
                                K2.f37636u = 1;
                                K2.G = nftitem;
                                K2.H = b8Var;
                                arrayList.add(K2);
                            } else {
                                int i16 = org.telegram.ui.Wallet.b.f42210b;
                                r31 K3 = r31.K(org.telegram.ui.Wallet.b.class);
                                K3.G = nftitem;
                                K3.f37636u = 1;
                                arrayList.add(K3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !w5Var.f43332l0.isEmpty()) {
                        org.telegram.ui.Wallet.c0 c0Var2 = w5Var.F0;
                        if (!c0Var2.f42366i && c0Var2.f42365g) {
                            arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131748175, null)));
                        }
                    }
                    org.telegram.ui.Wallet.c0 c0Var3 = w5Var.F0;
                    if (c0Var3.f42366i) {
                        for (int i17 = 0; i17 < 3; i17++) {
                            r31 q10 = r31.q((-1) - i17, 35);
                            q10.f37636u = 1;
                            arrayList.add(q10);
                        }
                        return;
                    } else if (c0Var3.f42368k != null) {
                        arrayList.add(r31.e(-10001, org.telegram.messenger.bd.M0(2131746062, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
