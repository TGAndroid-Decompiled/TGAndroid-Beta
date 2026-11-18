package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements org.telegram.messenger.q10 {
    public final int f39870a;
    public final int f39871b;
    public final Object f39872c;

    public t(Object obj, int i7, int i10) {
        this.f39870a = i10;
        this.f39872c = obj;
        this.f39871b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        boolean z10;
        int i7 = this.f39870a;
        int i10 = this.f39871b;
        Object obj3 = this.f39872c;
        switch (i7) {
            case 0:
                v vVar = (v) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    vVar.f40457e2[i10] = aicomposetoneexample;
                    vVar.f40456c2.O(true);
                    return;
                }
                vVar.getClass();
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) ((di.i4) obj3).f9008c;
                if (i10 == 0) {
                    z41Var.V();
                    org.telegram.ui.Wallet.t0 t0Var = n6Var.G0;
                    if (t0Var != null && !t0Var.f45043c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i11 = 0; i11 < n6Var.G0.f45043c.size(); i11++) {
                            arrayList.add(org.telegram.ui.Wallet.d4.i((TL_wallet.walletTransaction) n6Var.G0.f45043c.get(i11), n6Var.G0.f45041a));
                        }
                    }
                    org.telegram.ui.Wallet.t0 t0Var2 = n6Var.G0;
                    if (t0Var2 != null && (t0Var2.f45049k || !t0Var2.h)) {
                        arrayList.add(l41.q(-1, 37));
                        arrayList.add(l41.q(-2, 37));
                        arrayList.add(l41.q(-3, 37));
                    }
                    z41Var.U();
                    if (z10) {
                        long j3 = ((org.telegram.messenger.l0) n6Var.getMessagesController().A7.f26163r0.f13998b).f25308c;
                        if (j3 > 0) {
                            arrayList.add(l41.C(org.telegram.messenger.gd.V(null, null, 2131742859, org.telegram.ui.Wallet.u0.x(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.l0 l0Var = n6Var.H0;
                if (l0Var != null) {
                    ArrayList arrayList2 = l0Var.f44460a;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                        if (n6Var.f44634l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(n6Var.f44634l0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.r8 r8Var = n6Var.f44633k0;
                                int i13 = org.telegram.ui.Wallet.d8.f44050b;
                                l41 K = l41.K(org.telegram.ui.Wallet.d8.class);
                                K.v = 1;
                                K.H = nftitem;
                                K.I = r8Var;
                                arrayList.add(K);
                            } else {
                                int i14 = org.telegram.ui.Wallet.b.f43941b;
                                l41 K2 = l41.K(org.telegram.ui.Wallet.b.class);
                                K2.H = nftitem;
                                K2.v = 1;
                                arrayList.add(K2);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !n6Var.f44634l0.isEmpty()) {
                        org.telegram.ui.Wallet.l0 l0Var2 = n6Var.H0;
                        if (!l0Var2.f44466i && l0Var2.f44465g) {
                            arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131747975, null)));
                        }
                    }
                    org.telegram.ui.Wallet.l0 l0Var3 = n6Var.H0;
                    if (l0Var3.f44466i) {
                        for (int i15 = 0; i15 < 3; i15++) {
                            int i16 = org.telegram.ui.Wallet.d.f44017b;
                            l41 K3 = l41.K(org.telegram.ui.Wallet.d.class);
                            K3.v = 1;
                            K3.d = (-1) - i15;
                            arrayList.add(K3);
                        }
                        return;
                    } else if (l0Var3.f44470m != null) {
                        arrayList.add(l41.e(-10001, org.telegram.messenger.gd.M0(2131745857, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
