package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class u implements org.telegram.messenger.q10 {
    public final int f40185a;
    public final int f40186b;
    public final Object f40187c;

    public u(Object obj, int i7, int i10) {
        this.f40185a = i10;
        this.f40187c = obj;
        this.f40186b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        boolean z10;
        int i7 = this.f40185a;
        int i10 = this.f40186b;
        Object obj3 = this.f40187c;
        switch (i7) {
            case 0:
                w wVar = (w) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    wVar.f41605e2[i10] = aicomposetoneexample;
                    wVar.f41604c2.O(true);
                    return;
                }
                wVar.getClass();
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) ((di.i4) obj3).f9035c;
                if (i10 == 0) {
                    c51Var.V();
                    org.telegram.ui.Wallet.t0 t0Var = n6Var.G0;
                    if (t0Var != null && !t0Var.f45083c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i11 = 0; i11 < n6Var.G0.f45083c.size(); i11++) {
                            arrayList.add(org.telegram.ui.Wallet.d4.i((TL_wallet.walletTransaction) n6Var.G0.f45083c.get(i11), n6Var.G0.f45081a));
                        }
                    }
                    org.telegram.ui.Wallet.t0 t0Var2 = n6Var.G0;
                    if (t0Var2 != null && (t0Var2.f45089k || !t0Var2.h)) {
                        arrayList.add(o41.q(-1, 37));
                        arrayList.add(o41.q(-2, 37));
                        arrayList.add(o41.q(-3, 37));
                    }
                    c51Var.U();
                    if (z10) {
                        long j3 = ((org.telegram.messenger.l0) n6Var.getMessagesController().A7.f26191r0.f14027b).f25336c;
                        if (j3 > 0) {
                            arrayList.add(o41.C(org.telegram.messenger.gd.V(null, null, 2131742853, org.telegram.ui.Wallet.u0.x(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.l0 l0Var = n6Var.H0;
                if (l0Var != null) {
                    ArrayList arrayList2 = l0Var.f44500a;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                        if (n6Var.f44674l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(n6Var.f44674l0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.r8 r8Var = n6Var.f44673k0;
                                int i13 = org.telegram.ui.Wallet.d8.f44090b;
                                o41 K = o41.K(org.telegram.ui.Wallet.d8.class);
                                K.v = 1;
                                K.H = nftitem;
                                K.I = r8Var;
                                arrayList.add(K);
                            } else {
                                int i14 = org.telegram.ui.Wallet.b.f43982b;
                                o41 K2 = o41.K(org.telegram.ui.Wallet.b.class);
                                K2.H = nftitem;
                                K2.v = 1;
                                arrayList.add(K2);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !n6Var.f44674l0.isEmpty()) {
                        org.telegram.ui.Wallet.l0 l0Var2 = n6Var.H0;
                        if (!l0Var2.f44506i && l0Var2.f44505g) {
                            arrayList.add(o41.r(org.telegram.messenger.gd.N0(2131747974, null)));
                        }
                    }
                    org.telegram.ui.Wallet.l0 l0Var3 = n6Var.H0;
                    if (l0Var3.f44506i) {
                        for (int i15 = 0; i15 < 3; i15++) {
                            int i16 = org.telegram.ui.Wallet.d.f44057b;
                            o41 K3 = o41.K(org.telegram.ui.Wallet.d.class);
                            K3.v = 1;
                            K3.d = (-1) - i15;
                            arrayList.add(K3);
                        }
                        return;
                    } else if (l0Var3.f44510m != null) {
                        arrayList.add(o41.e(-10001, org.telegram.messenger.gd.N0(2131745856, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
