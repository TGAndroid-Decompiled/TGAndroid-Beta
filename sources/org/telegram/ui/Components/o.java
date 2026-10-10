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
    public final int f29280a;
    public final int f29281b;
    public final Object f29282c;

    public o(Object obj, int i10, int i11) {
        this.f29280a = i11;
        this.f29282c = obj;
        this.f29281b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        boolean z10;
        String a2;
        int i10 = this.f29280a;
        int i11 = 0;
        int i12 = this.f29281b;
        Object obj3 = this.f29282c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f29910h0[i12] = aicomposetoneexample;
                    qVar.f29908f0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.f35274e == i12) {
                    m0Var.f35276g = -1;
                    AndroidUtilities.cancelRunOnUIThread(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.f35271a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.f35272b);
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
                        org.telegram.ui.ls0 ls0Var = m0Var.f35273c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) ls0Var.f39715b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) ls0Var.f39716c;
                        int i13 = k0Var.f35155a;
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
                    if (m0Var.d && m0Var.f35274e == i12) {
                        m0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                d71 d71Var = (d71) obj2;
                org.telegram.ui.Wallet.b5 b5Var = ((org.telegram.ui.Wallet.x3) obj3).f35701a;
                if (i12 == 0) {
                    d71Var.U();
                    org.telegram.ui.Wallet.j0 j0Var = b5Var.f34740z0;
                    if (j0Var != null && !j0Var.f35112c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i14 = 0; i14 < b5Var.f34740z0.f35112c.size(); i14++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) b5Var.f34740z0.f35112c.get(i14);
                            org.telegram.ui.Wallet.x2 x2Var = b5Var.f34740z0.f35110a;
                            int i15 = org.telegram.ui.Wallet.w2.f35659a;
                            q61 J = q61.J(org.telegram.ui.Wallet.w2.class);
                            org.telegram.ui.Wallet.v2 v2Var = new org.telegram.ui.Wallet.v2(wallettransaction2);
                            v2Var.set(wallettransaction2);
                            v2Var.f20304id = wallettransaction2.f20304id;
                            v2Var.random_id = wallettransaction2.random_id;
                            v2Var.gasless = wallettransaction2.gasless;
                            v2Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            v2Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            v2Var.nft = wallettransaction2.nft;
                            J.G = v2Var;
                            J.H = x2Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = x2Var.a(walletTransactionPeer.address);
                            }
                            J.f30063l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.j0 j0Var2 = b5Var.f34740z0;
                    if (j0Var2 != null && !j0Var2.f35115g) {
                        arrayList.add(q61.o(-1, 37));
                        arrayList.add(q61.o(-2, 37));
                        arrayList.add(q61.o(-3, 37));
                    }
                    d71Var.T();
                    if (z10) {
                        long j3 = b5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j3 > 0) {
                            arrayList.add(q61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.k0.q(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (b5Var.A0 != null) {
                    d71Var.U();
                    ArrayList arrayList2 = b5Var.A0.f34758a;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj5 = arrayList2.get(i11);
                        i11++;
                        int i16 = org.telegram.ui.Wallet.b.f34689a;
                        q61 J2 = q61.J(org.telegram.ui.Wallet.b.class);
                        J2.G = (TL_wallet.nftItem) obj5;
                        arrayList.add(J2);
                    }
                    org.telegram.ui.Wallet.c0 c0Var = b5Var.A0;
                    if (c0Var.f34764i) {
                        arrayList.add(q61.o(-1, 38));
                    } else if (c0Var.f34766k != null) {
                        arrayList.add(q61.e(-10001, LocaleController.getString(R.string.Retry)));
                    }
                    d71Var.T();
                    return;
                } else {
                    return;
                }
        }
    }
}
