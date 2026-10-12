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
    public final int f27754a;
    public final int f27755b;
    public final Object f27756c;

    public o(Object obj, int i10, int i11) {
        this.f27754a = i11;
        this.f27756c = obj;
        this.f27755b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        boolean z10;
        String a2;
        int i10 = this.f27754a;
        int i11 = 0;
        int i12 = this.f27755b;
        Object obj3 = this.f27756c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f28467h0[i12] = aicomposetoneexample;
                    qVar.f28465f0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (l0Var.d && l0Var.e == i12) {
                    l0Var.f33419g = -1;
                    AndroidUtilities.cancelRunOnUIThread(l0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(l0Var.f33415a);
                    sb2.append(" msg_hash=");
                    sb2.append(l0Var.f33416b);
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
                        org.telegram.ui.cs0 cs0Var = l0Var.f33417c;
                        org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) cs0Var.f35068b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) cs0Var.f35069c;
                        int i13 = j0Var.f33319a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            MessagesController.getInstance(i13).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i13).putChats(wallettransactions.chats, false);
                            j0Var.c(wallettransaction, it.next());
                            j0Var.B();
                            l0Var.b();
                            return;
                        }
                    }
                    if (l0Var.d && l0Var.e == i12) {
                        l0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                z61 z61Var = (z61) obj2;
                org.telegram.ui.Wallet.z4 z4Var = ((org.telegram.ui.Wallet.w3) obj3).f33794a;
                if (i12 == 0) {
                    z61Var.U();
                    org.telegram.ui.Wallet.i0 i0Var = z4Var.f33950z0;
                    if (i0Var != null && !i0Var.f33275c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i14 = 0; i14 < z4Var.f33950z0.f33275c.size(); i14++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) z4Var.f33950z0.f33275c.get(i14);
                            org.telegram.ui.Wallet.w2 w2Var = z4Var.f33950z0.f33273a;
                            int i15 = org.telegram.ui.Wallet.v2.f33771a;
                            l61 J = l61.J(org.telegram.ui.Wallet.v2.class);
                            org.telegram.ui.Wallet.u2 u2Var = new org.telegram.ui.Wallet.u2(wallettransaction2);
                            u2Var.set(wallettransaction2);
                            u2Var.f19476id = wallettransaction2.f19476id;
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
                            J.f26954l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.i0 i0Var2 = z4Var.f33950z0;
                    if (i0Var2 != null && !i0Var2.f33277g) {
                        arrayList.add(l61.o(-1, 37));
                        arrayList.add(l61.o(-2, 37));
                        arrayList.add(l61.o(-3, 37));
                    }
                    z61Var.T();
                    if (z10) {
                        long j10 = z4Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(l61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.j0.q(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (z4Var.A0 != null) {
                    z61Var.U();
                    ArrayList arrayList2 = z4Var.A0.f32940a;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj5 = arrayList2.get(i11);
                        i11++;
                        int i16 = org.telegram.ui.Wallet.b.f32939a;
                        l61 J2 = l61.J(org.telegram.ui.Wallet.b.class);
                        J2.G = (TL_wallet.nftItem) obj5;
                        arrayList.add(J2);
                    }
                    org.telegram.ui.Wallet.b0 b0Var = z4Var.A0;
                    if (b0Var.f32945i) {
                        arrayList.add(l61.o(-1, 38));
                    } else if (b0Var.f32947k != null) {
                        arrayList.add(l61.e(-10001, LocaleController.getString(R.string.Retry)));
                    }
                    z61Var.T();
                    return;
                } else {
                    return;
                }
        }
    }
}
