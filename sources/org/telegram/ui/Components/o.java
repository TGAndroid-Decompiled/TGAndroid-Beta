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
    public final int f29085a;
    public final int f29086b;
    public final Object f29087c;

    public o(Object obj, int i10, int i11) {
        this.f29085a = i11;
        this.f29087c = obj;
        this.f29086b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a2;
        int i10 = this.f29085a;
        int i11 = this.f29086b;
        Object obj3 = this.f29087c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f29701i0[i11] = aicomposetoneexample;
                    qVar.f29699g0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.e == i11) {
                    n0Var.f34894g = -1;
                    AndroidUtilities.cancelRunOnUIThread(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.f34890a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.f34891b);
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
                        org.telegram.ui.pl0 pl0Var = n0Var.f34892c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) pl0Var.f40595b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) pl0Var.f40596c;
                        int i12 = l0Var.f34743a;
                        Iterator<TL_wallet.walletTransaction> it = wallettransactions.transactions.iterator();
                        if (it.hasNext()) {
                            MessagesController.getInstance(i12).putUsers(wallettransactions.users, false);
                            MessagesController.getInstance(i12).putChats(wallettransactions.chats, false);
                            l0Var.b(wallettransaction, it.next());
                            l0Var.C();
                            n0Var.b();
                            return;
                        }
                    }
                    if (n0Var.d && n0Var.e == i11) {
                        n0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.i4) obj3).f34602b;
                if (i11 == 0) {
                    a71Var.U();
                    org.telegram.ui.Wallet.k0 k0Var = o5Var.C0;
                    if (k0Var != null && !k0Var.f34691c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i13 = 0; i13 < o5Var.C0.f34691c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) o5Var.C0.f34691c.get(i13);
                            org.telegram.ui.Wallet.e3 e3Var = o5Var.C0.f34689a;
                            int i14 = org.telegram.ui.Wallet.d3.f34403a;
                            l61 J = l61.J(org.telegram.ui.Wallet.d3.class);
                            org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(wallettransaction2);
                            c3Var.set(wallettransaction2);
                            c3Var.f20603id = wallettransaction2.f20603id;
                            c3Var.random_id = wallettransaction2.random_id;
                            c3Var.gasless = wallettransaction2.gasless;
                            c3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            c3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            c3Var.nft = wallettransaction2.nft;
                            J.G = c3Var;
                            J.H = e3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = e3Var.a(walletTransactionPeer.address);
                            }
                            J.f28227l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = o5Var.C0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(l61.o(-1, 37));
                        arrayList.add(l61.o(-2, 37));
                        arrayList.add(l61.o(-3, 37));
                    }
                    a71Var.T();
                    if (z10) {
                        long j10 = o5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(l61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.l0.r(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.d0 d0Var = o5Var.D0;
                if (d0Var != null) {
                    ArrayList arrayList2 = d0Var.f34387a;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj5 = arrayList2.get(i15);
                        i15++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (o5Var.f34945j0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(o5Var.f34945j0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.t7 t7Var = o5Var.f34944i0;
                                int i16 = org.telegram.ui.Wallet.f7.f34516a;
                                l61 J2 = l61.J(org.telegram.ui.Wallet.f7.class);
                                J2.f28236u = 1;
                                J2.G = nftitem;
                                J2.H = t7Var;
                                arrayList.add(J2);
                            } else {
                                int i17 = org.telegram.ui.Wallet.b.f34316a;
                                l61 J3 = l61.J(org.telegram.ui.Wallet.b.class);
                                J3.G = nftitem;
                                J3.f28236u = 1;
                                arrayList.add(J3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !o5Var.f34945j0.isEmpty()) {
                        org.telegram.ui.Wallet.d0 d0Var2 = o5Var.D0;
                        if (!d0Var2.f34392i && d0Var2.f34391g) {
                            arrayList.add(l61.q(LocaleController.getString(R.string.NoResult)));
                        }
                    }
                    org.telegram.ui.Wallet.d0 d0Var3 = o5Var.D0;
                    if (d0Var3.f34392i) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            l61 o10 = l61.o((-1) - i18, 35);
                            o10.f28236u = 1;
                            arrayList.add(o10);
                        }
                        return;
                    } else if (d0Var3.f34394k != null) {
                        arrayList.add(l61.e(-10001, LocaleController.getString(R.string.Retry)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
