package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class q implements org.telegram.messenger.v10 {
    public final int f37133a;
    public final int f37134b;
    public final Object f37135c;

    public q(Object obj, int i7, int i10) {
        this.f37133a = i10;
        this.f37135c = obj;
        this.f37134b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z9;
        String a10;
        int i7 = this.f37133a;
        int i10 = this.f37134b;
        Object obj3 = this.f37135c;
        switch (i7) {
            case 0:
                s sVar = (s) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    sVar.f37811a2[i10] = aicomposetoneexample;
                    sVar.Y1.O(true);
                    return;
                }
                sVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (o0Var.d && o0Var.f42929e == i10) {
                    o0Var.f42931g = -1;
                    org.telegram.messenger.g0.r(o0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(o0Var.f42926a);
                    sb2.append(" msg_hash=");
                    sb2.append(o0Var.f42927b);
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
                        org.telegram.ui.lk0 lk0Var = o0Var.f42928c;
                        org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) lk0Var.f47551b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) lk0Var.f47552c;
                        int i11 = m0Var.f42762a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            org.telegram.messenger.qp.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.qp.s1(i11).S3(wallettransactions.chats, false);
                            m0Var.c(wallettransaction, it.next());
                            m0Var.E();
                            o0Var.b();
                            return;
                        }
                    }
                    if (o0Var.d && o0Var.f42929e == i10) {
                        o0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) ((bi.g5) obj3).f3941c;
                if (i10 == 0) {
                    l41Var.V();
                    org.telegram.ui.Wallet.l0 l0Var = x5Var.D0;
                    if (l0Var != null && !l0Var.f42726c.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        for (int i12 = 0; i12 < x5Var.D0.f42726c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) x5Var.D0.f42726c.get(i12);
                            org.telegram.ui.Wallet.u3 u3Var = x5Var.D0.f42724a;
                            int i13 = org.telegram.ui.Wallet.t3.f43169b;
                            x31 K = x31.K(org.telegram.ui.Wallet.t3.class);
                            org.telegram.ui.Wallet.s3 s3Var = new org.telegram.ui.Wallet.s3(wallettransaction2);
                            s3Var.set(wallettransaction2);
                            s3Var.f27219id = wallettransaction2.f27219id;
                            s3Var.random_id = wallettransaction2.random_id;
                            s3Var.gasless = wallettransaction2.gasless;
                            s3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            s3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            s3Var.nft = wallettransaction2.nft;
                            K.G = s3Var;
                            K.H = u3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a10 = null;
                            } else {
                                a10 = u3Var.a(walletTransactionPeer.address);
                            }
                            K.f40180l = a10;
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.l0 l0Var2 = x5Var.D0;
                    if (l0Var2 != null && !l0Var2.h) {
                        arrayList.add(x31.q(-1, 37));
                        arrayList.add(x31.q(-2, 37));
                        arrayList.add(x31.q(-3, 37));
                    }
                    l41Var.U();
                    if (z9) {
                        long j3 = ((org.telegram.messenger.l0) x5Var.getMessagesController().f24942x7.f24450l0.f13889b).f23818c;
                        if (j3 > 0) {
                            arrayList.add(x31.C(org.telegram.messenger.id.V(null, null, 2131743101, org.telegram.ui.Wallet.m0.s(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.e0 e0Var = x5Var.E0;
                if (e0Var != null) {
                    ArrayList arrayList2 = e0Var.f42410a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj5 = arrayList2.get(i14);
                        i14++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (x5Var.f43343k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(x5Var.f43343k0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.b8 b8Var = x5Var.f43342j0;
                                int i15 = org.telegram.ui.Wallet.n7.f42898b;
                                x31 K2 = x31.K(org.telegram.ui.Wallet.n7.class);
                                K2.f40189u = 1;
                                K2.G = nftitem;
                                K2.H = b8Var;
                                arrayList.add(K2);
                            } else {
                                int i16 = org.telegram.ui.Wallet.b.f42171b;
                                x31 K3 = x31.K(org.telegram.ui.Wallet.b.class);
                                K3.G = nftitem;
                                K3.f40189u = 1;
                                arrayList.add(K3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !x5Var.f43343k0.isEmpty()) {
                        org.telegram.ui.Wallet.e0 e0Var2 = x5Var.E0;
                        if (!e0Var2.f42416i && e0Var2.f42415g) {
                            arrayList.add(x31.r(org.telegram.messenger.id.M0(2131748168, null)));
                        }
                    }
                    org.telegram.ui.Wallet.e0 e0Var3 = x5Var.E0;
                    if (e0Var3.f42416i) {
                        for (int i17 = 0; i17 < 3; i17++) {
                            x31 q10 = x31.q((-1) - i17, 35);
                            q10.f40189u = 1;
                            arrayList.add(q10);
                        }
                        return;
                    } else if (e0Var3.f42418k != null) {
                        arrayList.add(x31.e(-10001, org.telegram.messenger.id.M0(2131746055, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
