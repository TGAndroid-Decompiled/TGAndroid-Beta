package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class p implements org.telegram.messenger.v10 {
    public final int f36731a;
    public final int f36732b;
    public final Object f36733c;

    public p(Object obj, int i7, int i10) {
        this.f36731a = i10;
        this.f36733c = obj;
        this.f36732b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z9;
        String a10;
        int i7 = this.f36731a;
        int i10 = this.f36732b;
        Object obj3 = this.f36733c;
        switch (i7) {
            case 0:
                r rVar = (r) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    rVar.d2[i10] = aicomposetoneexample;
                    rVar.f37432b2.O(true);
                    return;
                }
                rVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.f42846e == i10) {
                    n0Var.f42848g = -1;
                    org.telegram.messenger.g0.r(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.f42843a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.f42844b);
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
                        org.telegram.ui.ok0 ok0Var = n0Var.f42845c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) ok0Var.f48540b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) ok0Var.f48541c;
                        int i11 = l0Var.f42749a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            org.telegram.messenger.qp.s1(i11).Y3(wallettransactions.users, false);
                            org.telegram.messenger.qp.s1(i11).S3(wallettransactions.chats, false);
                            l0Var.c(wallettransaction, it.next());
                            l0Var.E();
                            n0Var.b();
                            return;
                        }
                    }
                    if (n0Var.d && n0Var.f42846e == i10) {
                        n0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) ((bi.g5) obj3).f3938c;
                if (i10 == 0) {
                    m41Var.V();
                    org.telegram.ui.Wallet.k0 k0Var = z5Var.D0;
                    if (k0Var != null && !k0Var.f42699c.isEmpty()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        for (int i12 = 0; i12 < z5Var.D0.f42699c.size(); i12++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) z5Var.D0.f42699c.get(i12);
                            org.telegram.ui.Wallet.v3 v3Var = z5Var.D0.f42697a;
                            int i13 = org.telegram.ui.Wallet.u3.f43219b;
                            x31 K = x31.K(org.telegram.ui.Wallet.u3.class);
                            org.telegram.ui.Wallet.t3 t3Var = new org.telegram.ui.Wallet.t3(wallettransaction2);
                            t3Var.set(wallettransaction2);
                            t3Var.f27223id = wallettransaction2.f27223id;
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
                            K.f40156l = a10;
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = z5Var.D0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(x31.q(-1, 37));
                        arrayList.add(x31.q(-2, 37));
                        arrayList.add(x31.q(-3, 37));
                    }
                    m41Var.U();
                    if (z9) {
                        long j3 = ((org.telegram.messenger.l0) z5Var.getMessagesController().f24946x7.f24454l0.f13891b).f23822c;
                        if (j3 > 0) {
                            arrayList.add(x31.C(org.telegram.messenger.id.V(null, null, 2131743098, org.telegram.ui.Wallet.l0.s(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.d0 d0Var = z5Var.E0;
                if (d0Var != null) {
                    ArrayList arrayList2 = d0Var.f42269a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj5 = arrayList2.get(i14);
                        i14++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (z5Var.f43456k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(z5Var.f43456k0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.d8 d8Var = z5Var.f43455j0;
                                int i15 = org.telegram.ui.Wallet.p7.f43011b;
                                x31 K2 = x31.K(org.telegram.ui.Wallet.p7.class);
                                K2.f40165u = 1;
                                K2.G = nftitem;
                                K2.H = d8Var;
                                arrayList.add(K2);
                            } else {
                                int i16 = org.telegram.ui.Wallet.b.f42158b;
                                x31 K3 = x31.K(org.telegram.ui.Wallet.b.class);
                                K3.G = nftitem;
                                K3.f40165u = 1;
                                arrayList.add(K3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !z5Var.f43456k0.isEmpty()) {
                        org.telegram.ui.Wallet.d0 d0Var2 = z5Var.E0;
                        if (!d0Var2.f42275i && d0Var2.f42274g) {
                            arrayList.add(x31.r(org.telegram.messenger.id.M0(2131748167, null)));
                        }
                    }
                    org.telegram.ui.Wallet.d0 d0Var3 = z5Var.E0;
                    if (d0Var3.f42275i) {
                        for (int i17 = 0; i17 < 3; i17++) {
                            x31 q10 = x31.q((-1) - i17, 35);
                            q10.f40165u = 1;
                            arrayList.add(q10);
                        }
                        return;
                    } else if (d0Var3.f42277k != null) {
                        arrayList.add(x31.e(-10001, org.telegram.messenger.id.M0(2131746052, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
