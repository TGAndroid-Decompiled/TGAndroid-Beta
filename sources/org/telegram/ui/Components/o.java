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
    public final int f27456a;
    public final int f27457b;
    public final Object f27458c;

    public o(Object obj, int i10, int i11) {
        this.f27456a = i11;
        this.f27458c = obj;
        this.f27457b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        boolean z10;
        String a2;
        int i10 = this.f27456a;
        int i11 = 0;
        int i12 = this.f27457b;
        Object obj3 = this.f27458c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f28149h0[i12] = aicomposetoneexample;
                    qVar.f28147f0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (m0Var.d && m0Var.e == i12) {
                    m0Var.f33185g = -1;
                    AndroidUtilities.cancelRunOnUIThread(m0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(m0Var.f33181a);
                    sb2.append(" msg_hash=");
                    sb2.append(m0Var.f33182b);
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
                        org.telegram.ui.bs0 bs0Var = m0Var.f33183c;
                        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) bs0Var.f34381b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) bs0Var.f34382c;
                        int i13 = k0Var.f33092a;
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
                    if (m0Var.d && m0Var.e == i12) {
                        m0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                org.telegram.ui.Wallet.a5 a5Var = ((org.telegram.ui.Wallet.x3) obj3).f33583a;
                if (i12 == 0) {
                    a71Var.U();
                    org.telegram.ui.Wallet.j0 j0Var = a5Var.f32667z0;
                    if (j0Var != null && !j0Var.f33048c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i14 = 0; i14 < a5Var.f32667z0.f33048c.size(); i14++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) a5Var.f32667z0.f33048c.get(i14);
                            org.telegram.ui.Wallet.x2 x2Var = a5Var.f32667z0.f33046a;
                            int i15 = org.telegram.ui.Wallet.w2.f33545a;
                            m61 J = m61.J(org.telegram.ui.Wallet.w2.class);
                            org.telegram.ui.Wallet.v2 v2Var = new org.telegram.ui.Wallet.v2(wallettransaction2);
                            v2Var.set(wallettransaction2);
                            v2Var.f19176id = wallettransaction2.f19176id;
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
                            J.f26946l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.j0 j0Var2 = a5Var.f32667z0;
                    if (j0Var2 != null && !j0Var2.f33050g) {
                        arrayList.add(m61.o(-1, 37));
                        arrayList.add(m61.o(-2, 37));
                        arrayList.add(m61.o(-3, 37));
                    }
                    a71Var.T();
                    if (z10) {
                        long j10 = a5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(m61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.k0.q(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (a5Var.A0 != null) {
                    a71Var.U();
                    ArrayList arrayList2 = a5Var.A0.f32716a;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj5 = arrayList2.get(i11);
                        i11++;
                        int i16 = org.telegram.ui.Wallet.b.f32680a;
                        m61 J2 = m61.J(org.telegram.ui.Wallet.b.class);
                        J2.G = (TL_wallet.nftItem) obj5;
                        arrayList.add(J2);
                    }
                    org.telegram.ui.Wallet.c0 c0Var = a5Var.A0;
                    if (c0Var.f32721i) {
                        arrayList.add(m61.o(-1, 38));
                    } else if (c0Var.f32723k != null) {
                        arrayList.add(m61.e(-10001, LocaleController.getString(R.string.Retry)));
                    }
                    a71Var.T();
                    return;
                } else {
                    return;
                }
        }
    }
}
