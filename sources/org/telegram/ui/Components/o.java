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
import org.telegram.ui.zg1;
public final class o implements Utilities.Callback2 {
    public final int f31110a;
    public final int f31111b;
    public final Object f31112c;

    public o(Object obj, int i10, int i11) {
        this.f31110a = i11;
        this.f31112c = obj;
        this.f31111b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Integer valueOf;
        String str;
        boolean z10;
        String a2;
        int i10 = this.f31110a;
        int i11 = this.f31111b;
        Object obj3 = this.f31112c;
        switch (i10) {
            case 0:
                q qVar = (q) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    qVar.f31748i0[i11] = aicomposetoneexample;
                    qVar.f31746g0.O(true);
                    return;
                }
                qVar.getClass();
                return;
            case 1:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (n0Var.d && n0Var.e == i11) {
                    n0Var.f36980g = -1;
                    AndroidUtilities.cancelRunOnUIThread(n0Var.h);
                    StringBuilder sb2 = new StringBuilder("[gram-wallet-polling] account=");
                    sb2.append(n0Var.f36976a);
                    sb2.append(" msg_hash=");
                    sb2.append(n0Var.f36977b);
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
                        zg1 zg1Var = n0Var.f36978c;
                        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) zg1Var.f46287b;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) zg1Var.f46288c;
                        int i12 = l0Var.f36804a;
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
                j71 j71Var = (j71) obj2;
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.h4) obj3).f36628b;
                if (i11 == 0) {
                    j71Var.V();
                    org.telegram.ui.Wallet.k0 k0Var = m5Var.D0;
                    if (k0Var != null && !k0Var.f36760c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i13 = 0; i13 < m5Var.D0.f36760c.size(); i13++) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) m5Var.D0.f36760c.get(i13);
                            org.telegram.ui.Wallet.e3 e3Var = m5Var.D0.f36758a;
                            int i14 = org.telegram.ui.Wallet.d3.f36455a;
                            t61 K = t61.K(org.telegram.ui.Wallet.d3.class);
                            org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(wallettransaction2);
                            c3Var.set(wallettransaction2);
                            c3Var.f22289id = wallettransaction2.f22289id;
                            c3Var.random_id = wallettransaction2.random_id;
                            c3Var.gasless = wallettransaction2.gasless;
                            c3Var.gaslessMessageBodyHash = wallettransaction2.gaslessMessageBodyHash;
                            c3Var.normalMessageBodyHash = wallettransaction2.normalMessageBodyHash;
                            c3Var.nft = wallettransaction2.nft;
                            K.G = c3Var;
                            K.H = e3Var;
                            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction2.peer;
                            if (walletTransactionPeer == null) {
                                a2 = null;
                            } else {
                                a2 = e3Var.a(walletTransactionPeer.address);
                            }
                            K.f32872l = a2;
                            arrayList.add(K);
                        }
                    }
                    org.telegram.ui.Wallet.k0 k0Var2 = m5Var.D0;
                    if (k0Var2 != null && !k0Var2.h) {
                        arrayList.add(t61.q(-1, 37));
                        arrayList.add(t61.q(-2, 37));
                        arrayList.add(t61.q(-3, 37));
                    }
                    j71Var.U();
                    if (z10) {
                        long j10 = m5Var.getMessagesController().config.walletTransferMinNanos.get();
                        if (j10 > 0) {
                            arrayList.add(t61.C(LocaleController.formatSpannable(R.string.WalletHiddenTransactions, org.telegram.ui.Wallet.l0.r(j10, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.d0 d0Var = m5Var.E0;
                if (d0Var != null) {
                    ArrayList arrayList2 = d0Var.f36439a;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj5 = arrayList2.get(i15);
                        i15++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj5;
                        if (m5Var.f36944k0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(m5Var.f36944k0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.t7 t7Var = m5Var.f36943j0;
                                int i16 = org.telegram.ui.Wallet.f7.f36572a;
                                t61 K2 = t61.K(org.telegram.ui.Wallet.f7.class);
                                K2.f32881u = 1;
                                K2.G = nftitem;
                                K2.H = t7Var;
                                arrayList.add(K2);
                            } else {
                                int i17 = org.telegram.ui.Wallet.b.f36374a;
                                t61 K3 = t61.K(org.telegram.ui.Wallet.b.class);
                                K3.G = nftitem;
                                K3.f32881u = 1;
                                arrayList.add(K3);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !m5Var.f36944k0.isEmpty()) {
                        org.telegram.ui.Wallet.d0 d0Var2 = m5Var.E0;
                        if (!d0Var2.f36444i && d0Var2.f36443g) {
                            arrayList.add(t61.r(LocaleController.getString(R.string.NoResult)));
                        }
                    }
                    org.telegram.ui.Wallet.d0 d0Var3 = m5Var.E0;
                    if (d0Var3.f36444i) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            t61 q5 = t61.q((-1) - i18, 35);
                            q5.f32881u = 1;
                            arrayList.add(q5);
                        }
                        return;
                    } else if (d0Var3.f36446k != null) {
                        arrayList.add(t61.e(-10001, LocaleController.getString(R.string.Retry)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
