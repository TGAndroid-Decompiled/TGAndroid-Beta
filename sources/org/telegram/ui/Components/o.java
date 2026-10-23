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
    public final int f29048a;
    public final int f29049b;
    public final Object f29050c;

    public o(Object obj, int i10, int i11) {
        this.f29048a = i11;
        this.f29050c = obj;
        this.f29049b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a2;
        int i10 = this.f29048a;
        int i11 = this.f29049b;
        Object obj3 = this.f29050c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f29712i0[i11] = aicomposetoneexample;
                    qVar.f29710g0.N(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.e == i11) {
                    n0Var.f34892g = -1;
                    AndroidUtilities.cancelRunOnUIThread(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.f34888a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.f34889b);
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
                        org.telegram.ui.ql0 ql0Var = n0Var.f34890c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) ql0Var.f40863b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) ql0Var.f40864c;
                        int i12 = l0Var.f34741a;
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
                b71 b71Var = (b71) obj2;
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.i4) obj3).f34600b;
                if (i11 == 0) {
                    b71Var.U();
                    org.telegram.ui.Wallet.k0 k0Var = o5Var.C0;
                    if (k0Var != null && !k0Var.f34689c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i13 = 0; i13 < o5Var.C0.f34689c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) o5Var.C0.f34689c.get(i13);
                            org.telegram.ui.Wallet.e3 e3Var = o5Var.C0.f34687a;
                            int i14 = org.telegram.ui.Wallet.d3.f34401a;
                            m61 J = m61.J(org.telegram.ui.Wallet.d3.class);
                            org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(wallettransaction2);
                            c3Var.set(wallettransaction2);
                            c3Var.f20602id = wallettransaction2.f20602id;
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
                            J.f28559l = a2;
                            arrayList.add(J);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = o5Var.C0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(m61.o(-1, 37));
                        arrayList.add(m61.o(-2, 37));
                        arrayList.add(m61.o(-3, 37));
                    }
                    b71Var.T();
                    if (z10) {
                        long j10 = o5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(m61.B(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.l0.r(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.d0 d0Var = o5Var.D0;
                if (d0Var != null) {
                    ArrayList arrayList2 = d0Var.f34385a;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj5 = arrayList2.get(i15);
                        i15++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (o5Var.f34943j0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(o5Var.f34943j0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.t7 t7Var = o5Var.f34942i0;
                                int i16 = org.telegram.ui.Wallet.f7.f34514a;
                                m61 J2 = m61.J(org.telegram.ui.Wallet.f7.class);
                                J2.f28568u = 1;
                                J2.G = nftitem;
                                J2.H = t7Var;
                                arrayList.add(J2);
                            } else {
                                int i17 = org.telegram.ui.Wallet.b.f34314a;
                                m61 J3 = m61.J(org.telegram.ui.Wallet.b.class);
                                J3.G = nftitem;
                                J3.f28568u = 1;
                                arrayList.add(J3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !o5Var.f34943j0.isEmpty()) {
                        org.telegram.ui.Wallet.d0 d0Var2 = o5Var.D0;
                        if (!d0Var2.f34390i && d0Var2.f34389g) {
                            arrayList.add(m61.q(LocaleController.getString(R.string.NoResult)));
                        }
                    }
                    org.telegram.ui.Wallet.d0 d0Var3 = o5Var.D0;
                    if (d0Var3.f34390i) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            m61 o10 = m61.o((-1) - i18, 35);
                            o10.f28568u = 1;
                            arrayList.add(o10);
                        }
                        return;
                    } else if (d0Var3.f34392k != null) {
                        arrayList.add(m61.e(-10001, LocaleController.getString(R.string.Retry)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
