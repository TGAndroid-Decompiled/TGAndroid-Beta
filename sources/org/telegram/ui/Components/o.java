package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class o implements org.telegram.messenger.s10 {
    public final int f37770a;
    public final int f37771b;
    public final Object f37772c;

    public o(Object obj, int i7, int i10) {
        this.f37770a = i10;
        this.f37772c = obj;
        this.f37771b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a10;
        int i7 = this.f37770a;
        int i10 = this.f37771b;
        Object obj3 = this.f37772c;
        switch (i7) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f38454e2[i10] = aicomposetoneexample;
                    qVar.f38453c2.O(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.f44171e == i10) {
                    n0Var.f44173g = -1;
                    org.telegram.messenger.g0.r(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.f44168a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.f44169b);
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
                        org.telegram.ui.xi0 xi0Var = n0Var.f44170c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) xi0Var.f53250b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) xi0Var.f53251c;
                        int i11 = l0Var.f44078a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            org.telegram.messenger.np.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.np.s1(i11).S3(wallettransactions.chats, false);
                            l0Var.c(wallettransaction, it.next());
                            l0Var.E();
                            n0Var.b();
                            return;
                        }
                    }
                    if (n0Var.d && n0Var.f44171e == i10) {
                        n0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((di.f4) obj3).f8532c;
                if (i10 == 0) {
                    p41Var.V();
                    org.telegram.ui.Wallet.k0 k0Var = y5Var.E0;
                    if (k0Var != null && !k0Var.f44044c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i12 = 0; i12 < y5Var.E0.f44044c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) y5Var.E0.f44044c.get(i12);
                            org.telegram.ui.Wallet.u3 u3Var = y5Var.E0.f44042a;
                            int i13 = org.telegram.ui.Wallet.t3.f44512b;
                            b41 K = b41.K(org.telegram.ui.Wallet.t3.class);
                            org.telegram.ui.Wallet.s3 s3Var = new org.telegram.ui.Wallet.s3(wallettransaction2);
                            s3Var.set(wallettransaction2);
                            s3Var.f28314id = wallettransaction2.f28314id;
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
                            K.f33181l = a10;
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = y5Var.E0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(b41.q(-1, 37));
                        arrayList.add(b41.q(-2, 37));
                        arrayList.add(b41.q(-3, 37));
                    }
                    p41Var.U();
                    if (z10) {
                        long j3 = ((org.telegram.messenger.l0) y5Var.getMessagesController().f25448y7.f25856l0.f14544b).f24785c;
                        if (j3 > 0) {
                            arrayList.add(b41.C(org.telegram.messenger.hd.V(null, null, 2131743098, org.telegram.ui.Wallet.l0.s(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.d0 d0Var = y5Var.F0;
                if (d0Var != null) {
                    ArrayList arrayList2 = d0Var.f43712a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj5 = arrayList2.get(i14);
                        i14++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (y5Var.f44740l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(y5Var.f44740l0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.c8 c8Var = y5Var.f44739k0;
                                int i15 = org.telegram.ui.Wallet.o7.f44269b;
                                b41 K2 = b41.K(org.telegram.ui.Wallet.o7.class);
                                K2.f33190u = 1;
                                K2.G = nftitem;
                                K2.H = c8Var;
                                arrayList.add(K2);
                            } else {
                                int i16 = org.telegram.ui.Wallet.b.f43490b;
                                b41 K3 = b41.K(org.telegram.ui.Wallet.b.class);
                                K3.G = nftitem;
                                K3.f33190u = 1;
                                arrayList.add(K3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !y5Var.f44740l0.isEmpty()) {
                        org.telegram.ui.Wallet.d0 d0Var2 = y5Var.F0;
                        if (!d0Var2.f43718i && d0Var2.f43717g) {
                            arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131748167, null)));
                        }
                    }
                    org.telegram.ui.Wallet.d0 d0Var3 = y5Var.F0;
                    if (d0Var3.f43718i) {
                        for (int i17 = 0; i17 < 3; i17++) {
                            b41 q10 = b41.q((-1) - i17, 35);
                            q10.f33190u = 1;
                            arrayList.add(q10);
                        }
                        return;
                    } else if (d0Var3.f43720k != null) {
                        arrayList.add(b41.e(-10001, org.telegram.messenger.hd.M0(2131746052, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
