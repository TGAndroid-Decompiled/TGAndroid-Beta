package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class p implements org.telegram.messenger.k20 {
    public final int f29258a;
    public final int f29259b;
    public final Object f29260c;

    public p(Object obj, int i10, int i11) {
        this.f29258a = i11;
        this.f29260c = obj;
        this.f29259b = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a2;
        int i10 = this.f29258a;
        int i11 = this.f29259b;
        Object obj3 = this.f29260c;
        switch (i10) {
            case 0:
                r rVar = (r) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    rVar.a2[i11] = aicomposetoneexample;
                    rVar.Y1.O(true);
                    return;
                }
                rVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.e == i11) {
                    m0Var.f34886g = -1;
                    org.telegram.messenger.i0.r(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.f34882a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.f34883b);
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
                    org.telegram.messenger.f8.b(sb2.toString());
                    if (tL_error2 == null && wallettransactions != null) {
                        org.telegram.ui.cp0 cp0Var = m0Var.f34884c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) cp0Var.f36386b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) cp0Var.f36387c;
                        int i12 = k0Var.f34781a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            org.telegram.messenger.wp.r1(i12).V3(wallettransactions.users, false);
                            org.telegram.messenger.wp.r1(i12).P3(wallettransactions.chats, false);
                            k0Var.c(wallettransaction, it.next());
                            k0Var.E();
                            m0Var.b();
                            return;
                        }
                    }
                    if (m0Var.d && m0Var.e == i11) {
                        m0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) ((mg.s) obj3).f13228c;
                if (i11 == 0) {
                    q51Var.V();
                    org.telegram.ui.Wallet.j0 j0Var = b6Var.D0;
                    if (j0Var != null && !j0Var.f34736c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i13 = 0; i13 < b6Var.D0.f34736c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) b6Var.D0.f34736c.get(i13);
                            org.telegram.ui.Wallet.v3 v3Var = b6Var.D0.f34734a;
                            int i14 = org.telegram.ui.Wallet.u3.f35275b;
                            b51 K = b51.K(org.telegram.ui.Wallet.u3.class);
                            org.telegram.ui.Wallet.t3 t3Var = new org.telegram.ui.Wallet.t3(wallettransaction2);
                            t3Var.set(wallettransaction2);
                            t3Var.f20057id = wallettransaction2.f20057id;
                            t3Var.random_id = wallettransaction2.random_id;
                            t3Var.gasless = wallettransaction2.gasless;
                            t3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            t3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            t3Var.nft = wallettransaction2.nft;
                            K.G = t3Var;
                            K.H = v3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = v3Var.a(walletTransactionPeer.address);
                            }
                            K.f24643l = a2;
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.j0 j0Var2 = b6Var.D0;
                    if (j0Var2 != null && !j0Var2.h) {
                        arrayList.add(b51.q(-1, 37));
                        arrayList.add(b51.q(-2, 37));
                        arrayList.add(b51.q(-3, 37));
                    }
                    q51Var.U();
                    if (z10) {
                        long j10 = b6Var.getMessagesController().f19300y7.f18037l0.f17366a.f17238c;
                        if (j10 > 0) {
                            arrayList.add(b51.C(org.telegram.messenger.dd.V(null, null, 2131743124, org.telegram.ui.Wallet.k0.s(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.c0 c0Var = b6Var.E0;
                if (c0Var != null) {
                    ArrayList arrayList2 = c0Var.f34298a;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj5 = arrayList2.get(i15);
                        i15++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (b6Var.f34254k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(b6Var.f34254k0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.h8 h8Var = b6Var.f34253j0;
                                int i16 = org.telegram.ui.Wallet.t7.f35252b;
                                b51 K2 = b51.K(org.telegram.ui.Wallet.t7.class);
                                K2.f24652u = 1;
                                K2.G = nftitem;
                                K2.H = h8Var;
                                arrayList.add(K2);
                            } else {
                                int i17 = org.telegram.ui.Wallet.b.f34219b;
                                b51 K3 = b51.K(org.telegram.ui.Wallet.b.class);
                                K3.G = nftitem;
                                K3.f24652u = 1;
                                arrayList.add(K3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !b6Var.f34254k0.isEmpty()) {
                        org.telegram.ui.Wallet.c0 c0Var2 = b6Var.E0;
                        if (!c0Var2.f34303i && c0Var2.f34302g) {
                            arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131748183, null)));
                        }
                    }
                    org.telegram.ui.Wallet.c0 c0Var3 = b6Var.E0;
                    if (c0Var3.f34303i) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            b51 q6 = b51.q((-1) - i18, 35);
                            q6.f24652u = 1;
                            arrayList.add(q6);
                        }
                        return;
                    } else if (c0Var3.f34305k != null) {
                        arrayList.add(b51.e(-10001, org.telegram.messenger.dd.L0(2131746069, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
