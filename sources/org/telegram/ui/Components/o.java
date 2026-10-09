package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class o implements Utilities.Callback2 {
    public final int f29313a;
    public final int f29314b;
    public final Object f29315c;

    public o(Object obj, int i10, int i11) {
        this.f29313a = i11;
        this.f29315c = obj;
        this.f29314b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        boolean z10;
        String a2;
        int i10 = this.f29313a;
        int i11 = 0;
        int i12 = this.f29314b;
        Object obj3 = this.f29315c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f29977h0[i12] = aicomposetoneexample;
                    qVar.f29975f0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.f35206e == i12) {
                    m0Var.f35208g = -1;
                    AndroidUtilities.cancelRunOnUIThread(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.f35203a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.f35204b);
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
                    FileLog.d(sb2.toString());
                    if (tL_error2 == null && wallettransactions != null) {
                        org.telegram.ui.ls0 ls0Var = m0Var.f35205c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) ls0Var.f39669b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) ls0Var.f39670c;
                        int i13 = k0Var.f35093a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            MessagesController.getInstance(i13).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i13).putChats(wallettransactions.chats, false);
                            k0Var.c(wallettransaction, it.next());
                            k0Var.B();
                            m0Var.b();
                            return;
                        }
                    }
                    if (m0Var.d && m0Var.f35206e == i12) {
                        m0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                org.telegram.ui.Wallet.z4 z4Var = ((org.telegram.ui.Wallet.v3) obj3).f35551a;
                if (i12 == 0) {
                    c71Var.U();
                    org.telegram.ui.Wallet.j0 j0Var = z4Var.f35745z0;
                    if (j0Var != null && !j0Var.f35047c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i14 = 0; i14 < z4Var.f35745z0.f35047c.size(); i14++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) z4Var.f35745z0.f35047c.get(i14);
                            org.telegram.ui.Wallet.w2 w2Var = z4Var.f35745z0.f35045a;
                            int i15 = org.telegram.ui.Wallet.v2.f35550a;
                            p61 J = p61.J(org.telegram.ui.Wallet.v2.class);
                            org.telegram.ui.Wallet.u2 u2Var = new org.telegram.ui.Wallet.u2(wallettransaction2);
                            u2Var.set(wallettransaction2);
                            u2Var.f20300id = wallettransaction2.f20300id;
                            u2Var.random_id = wallettransaction2.random_id;
                            u2Var.gasless = wallettransaction2.gasless;
                            u2Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            u2Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            u2Var.nft = wallettransaction2.nft;
                            J.G = u2Var;
                            J.H = w2Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = w2Var.a(walletTransactionPeer.address);
                            }
                            J.f29734l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.j0 j0Var2 = z4Var.f35745z0;
                    if (j0Var2 != null && !j0Var2.f35050g) {
                        arrayList.add(p61.o(-1, 37));
                        arrayList.add(p61.o(-2, 37));
                        arrayList.add(p61.o(-3, 37));
                    }
                    c71Var.T();
                    if (z10) {
                        long j3 = z4Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j3 > 0) {
                            arrayList.add(p61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.k0.q(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (z4Var.A0 != null) {
                    c71Var.U();
                    ArrayList arrayList2 = z4Var.A0.f34691a;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj5 = arrayList2.get(i11);
                        i11++;
                        int i16 = org.telegram.ui.Wallet.b.f34635a;
                        p61 J2 = p61.J(org.telegram.ui.Wallet.b.class);
                        J2.G = (TL_wallet.nftItem) obj5;
                        arrayList.add(J2);
                    }
                    org.telegram.ui.Wallet.c0 c0Var = z4Var.A0;
                    if (c0Var.f34697i) {
                        arrayList.add(p61.o(-1, 38));
                    } else if (c0Var.f34699k != null) {
                        arrayList.add(p61.e(-10001, LocaleController.getString(R.string.Retry)));
                    }
                    c71Var.T();
                    return;
                } else {
                    return;
                }
        }
    }
}
