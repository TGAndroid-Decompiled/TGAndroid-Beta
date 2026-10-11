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
    public final int f29322a;
    public final int f29323b;
    public final Object f29324c;

    public o(Object obj, int i10, int i11) {
        this.f29322a = i11;
        this.f29324c = obj;
        this.f29323b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        boolean z10;
        String a2;
        int i10 = this.f29322a;
        int i11 = 0;
        int i12 = this.f29323b;
        Object obj3 = this.f29324c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f30013h0[i12] = aicomposetoneexample;
                    qVar.f30011f0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.f35338e == i12) {
                    n0Var.f35340g = -1;
                    AndroidUtilities.cancelRunOnUIThread(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.f35335a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.f35336b);
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
                        org.telegram.ui.js0 js0Var = n0Var.f35337c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) js0Var.f39152b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) js0Var.f39153c;
                        int i13 = l0Var.f35219a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            MessagesController.getInstance(i13).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i13).putChats(wallettransactions.chats, false);
                            l0Var.c(wallettransaction, it.next());
                            l0Var.B();
                            n0Var.b();
                            return;
                        }
                    }
                    if (n0Var.d && n0Var.f35338e == i12) {
                        n0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                d71 d71Var = (d71) obj2;
                org.telegram.ui.Wallet.c5 c5Var = ((org.telegram.ui.Wallet.y3) obj3).f35765a;
                if (i12 == 0) {
                    d71Var.U();
                    org.telegram.ui.Wallet.k0 k0Var = c5Var.f34805z0;
                    if (k0Var != null && !k0Var.f35176c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i14 = 0; i14 < c5Var.f34805z0.f35176c.size(); i14++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) c5Var.f34805z0.f35176c.get(i14);
                            org.telegram.ui.Wallet.y2 y2Var = c5Var.f34805z0.f35174a;
                            int i15 = org.telegram.ui.Wallet.x2.f35723a;
                            q61 J = q61.J(org.telegram.ui.Wallet.x2.class);
                            org.telegram.ui.Wallet.w2 w2Var = new org.telegram.ui.Wallet.w2(wallettransaction2);
                            w2Var.set(wallettransaction2);
                            w2Var.f20330id = wallettransaction2.f20330id;
                            w2Var.random_id = wallettransaction2.random_id;
                            w2Var.gasless = wallettransaction2.gasless;
                            w2Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            w2Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            w2Var.nft = wallettransaction2.nft;
                            J.G = w2Var;
                            J.H = y2Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = y2Var.a(walletTransactionPeer.address);
                            }
                            J.f30167l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = c5Var.f34805z0;
                    if (k0Var2 != null && !k0Var2.f35179g) {
                        arrayList.add(q61.o(-1, 37));
                        arrayList.add(q61.o(-2, 37));
                        arrayList.add(q61.o(-3, 37));
                    }
                    d71Var.T();
                    if (z10) {
                        long j3 = c5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j3 > 0) {
                            arrayList.add(q61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.l0.q(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (c5Var.A0 != null) {
                    d71Var.U();
                    ArrayList arrayList2 = c5Var.A0.f34821a;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj5 = arrayList2.get(i11);
                        i11++;
                        int i16 = org.telegram.ui.Wallet.b.f34702a;
                        q61 J2 = q61.J(org.telegram.ui.Wallet.b.class);
                        J2.G = (TL_wallet.nftItem) obj5;
                        arrayList.add(J2);
                    }
                    org.telegram.ui.Wallet.d0 d0Var = c5Var.A0;
                    if (d0Var.f34827i) {
                        arrayList.add(q61.o(-1, 38));
                    } else if (d0Var.f34829k != null) {
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
