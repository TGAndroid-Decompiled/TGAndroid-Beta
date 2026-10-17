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
    public final int f28846a;
    public final int f28847b;
    public final Object f28848c;

    public o(Object obj, int i10, int i11) {
        this.f28846a = i11;
        this.f28848c = obj;
        this.f28847b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a2;
        int i10 = this.f28846a;
        int i11 = this.f28847b;
        Object obj3 = this.f28848c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f29480h0[i11] = aicomposetoneexample;
                    qVar.f29478f0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (o0Var.d && o0Var.e == i11) {
                    o0Var.f34662g = -1;
                    AndroidUtilities.cancelRunOnUIThread(o0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(o0Var.f34658a);
                    sb2.append(" msg_hash=");
                    sb2.append(o0Var.f34659b);
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
                        org.telegram.ui.fr0 fr0Var = o0Var.f34660c;
                        org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) fr0Var.f37034b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) fr0Var.f37035c;
                        int i12 = m0Var.f34551a;
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
                s61 s61Var = (s61) obj2;
                org.telegram.ui.Wallet.l5 l5Var = ((org.telegram.ui.Wallet.h4) obj3).f34259b;
                if (i11 == 0) {
                    s61Var.U();
                    org.telegram.ui.Wallet.l0 l0Var = l5Var.E0;
                    if (l0Var != null && !l0Var.f34457c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i13 = 0; i13 < l5Var.E0.f34457c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) l5Var.E0.f34457c.get(i13);
                            org.telegram.ui.Wallet.c3 c3Var = l5Var.E0.f34455a;
                            int i14 = org.telegram.ui.Wallet.b3.f34034a;
                            f61 J = f61.J(org.telegram.ui.Wallet.b3.class);
                            org.telegram.ui.Wallet.a3 a3Var = new org.telegram.ui.Wallet.a3(wallettransaction2);
                            a3Var.set(wallettransaction2);
                            a3Var.f20531id = wallettransaction2.f20531id;
                            a3Var.random_id = wallettransaction2.random_id;
                            a3Var.gasless = wallettransaction2.gasless;
                            a3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            a3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            a3Var.nft = wallettransaction2.nft;
                            J.G = a3Var;
                            J.H = c3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = c3Var.a(walletTransactionPeer.address);
                            }
                            J.f26140l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.l0 l0Var2 = l5Var.E0;
                    if (l0Var2 != null && !l0Var2.h) {
                        arrayList.add(f61.o(-1, 37));
                        arrayList.add(f61.o(-2, 37));
                        arrayList.add(f61.o(-3, 37));
                    }
                    s61Var.T();
                    if (z10) {
                        long j10 = l5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(f61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.m0.r(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.e0 e0Var = l5Var.F0;
                if (e0Var != null) {
                    ArrayList arrayList2 = e0Var.f34146a;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj5 = arrayList2.get(i15);
                        i15++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (l5Var.f34492l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(l5Var.f34492l0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.w7 w7Var = l5Var.f34491k0;
                                int i16 = org.telegram.ui.Wallet.i7.f34325a;
                                f61 J2 = f61.J(org.telegram.ui.Wallet.i7.class);
                                J2.f26149u = 1;
                                J2.G = nftitem;
                                J2.H = w7Var;
                                arrayList.add(J2);
                            } else {
                                int i17 = org.telegram.ui.Wallet.b.f34013a;
                                f61 J3 = f61.J(org.telegram.ui.Wallet.b.class);
                                J3.G = nftitem;
                                J3.f26149u = 1;
                                arrayList.add(J3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !l5Var.f34492l0.isEmpty()) {
                        org.telegram.ui.Wallet.e0 e0Var2 = l5Var.F0;
                        if (!e0Var2.f34151i && e0Var2.f34150g) {
                            arrayList.add(f61.q(LocaleController.getString(R.string.NoResult)));
                        }
                    }
                    org.telegram.ui.Wallet.e0 e0Var3 = l5Var.F0;
                    if (e0Var3.f34151i) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            f61 o10 = f61.o((-1) - i18, 35);
                            o10.f26149u = 1;
                            arrayList.add(o10);
                        }
                        return;
                    } else if (e0Var3.f34153k != null) {
                        arrayList.add(f61.e(-10001, LocaleController.getString(R.string.Retry)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
