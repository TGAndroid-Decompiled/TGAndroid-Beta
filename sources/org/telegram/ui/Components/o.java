package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
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
    public final int f28899a;
    public final int f28900b;
    public final Object f28901c;

    public o(Object obj, int i10, int i11) {
        this.f28899a = i11;
        this.f28901c = obj;
        this.f28900b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a2;
        int i10 = this.f28899a;
        int i11 = this.f28900b;
        Object obj3 = this.f28901c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f29424h0[i11] = aicomposetoneexample;
                    qVar.f29422f0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (o0Var.d && o0Var.e == i11) {
                    o0Var.f34629g = -1;
                    AndroidUtilities.cancelRunOnUIThread(o0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(o0Var.f34625a);
                    sb2.append(" msg_hash=");
                    sb2.append(o0Var.f34626b);
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
                        org.telegram.ui.en0 en0Var = o0Var.f34627c;
                        org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) en0Var.f36691b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) en0Var.f36692c;
                        int i12 = m0Var.f34476a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            MessagesController.getInstance(i12).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i12).putChats(wallettransactions.chats, false);
                            m0Var.b(wallettransaction, it.next());
                            m0Var.C();
                            o0Var.b();
                            return;
                        }
                    }
                    if (o0Var.d && o0Var.e == i11) {
                        o0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.k4) obj3).f34422b;
                if (i11 == 0) {
                    u61Var.U();
                    org.telegram.ui.Wallet.l0 l0Var = o5Var.C0;
                    if (l0Var != null && !l0Var.f34448c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i13 = 0; i13 < o5Var.C0.f34448c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) o5Var.C0.f34448c.get(i13);
                            org.telegram.ui.Wallet.f3 f3Var = o5Var.C0.f34446a;
                            int i14 = org.telegram.ui.Wallet.e3.f34148a;
                            h61 J = h61.J(org.telegram.ui.Wallet.e3.class);
                            org.telegram.ui.Wallet.d3 d3Var = new org.telegram.ui.Wallet.d3(wallettransaction2);
                            d3Var.set(wallettransaction2);
                            d3Var.f20535id = wallettransaction2.f20535id;
                            d3Var.random_id = wallettransaction2.random_id;
                            d3Var.gasless = wallettransaction2.gasless;
                            d3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            d3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            d3Var.nft = wallettransaction2.nft;
                            J.G = d3Var;
                            J.H = f3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = f3Var.a(walletTransactionPeer.address);
                            }
                            J.f26782l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.l0 l0Var2 = o5Var.C0;
                    if (l0Var2 != null && !l0Var2.h) {
                        arrayList.add(h61.o(-1, 37));
                        arrayList.add(h61.o(-2, 37));
                        arrayList.add(h61.o(-3, 37));
                    }
                    u61Var.T();
                    if (z10) {
                        long j10 = o5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(h61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.m0.r(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.e0 e0Var = o5Var.D0;
                if (e0Var != null) {
                    ArrayList arrayList2 = e0Var.f34132a;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj5 = arrayList2.get(i15);
                        i15++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (o5Var.f34651j0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(o5Var.f34651j0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.t7 t7Var = o5Var.f34650i0;
                                int i16 = org.telegram.ui.Wallet.f7.f34217a;
                                h61 J2 = h61.J(org.telegram.ui.Wallet.f7.class);
                                J2.f26791u = 1;
                                J2.G = nftitem;
                                J2.H = t7Var;
                                arrayList.add(J2);
                            } else {
                                int i17 = org.telegram.ui.Wallet.b.f34009a;
                                h61 J3 = h61.J(org.telegram.ui.Wallet.b.class);
                                J3.G = nftitem;
                                J3.f26791u = 1;
                                arrayList.add(J3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !o5Var.f34651j0.isEmpty()) {
                        org.telegram.ui.Wallet.e0 e0Var2 = o5Var.D0;
                        if (!e0Var2.f34137i && e0Var2.f34136g) {
                            arrayList.add(h61.q(LocaleController.getString(R.string.NoResult)));
                        }
                    }
                    org.telegram.ui.Wallet.e0 e0Var3 = o5Var.D0;
                    if (e0Var3.f34137i) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            h61 o10 = h61.o((-1) - i18, 35);
                            o10.f26791u = 1;
                            arrayList.add(o10);
                        }
                        return;
                    } else if (e0Var3.f34139k != null) {
                        arrayList.add(h61.e(-10001, LocaleController.getString(R.string.Retry)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
