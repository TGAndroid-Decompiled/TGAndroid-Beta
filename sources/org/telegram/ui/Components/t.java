package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements org.telegram.messenger.p10 {
    public final int f39762a;
    public final int f39763b;
    public final Object f39764c;

    public t(Object obj, int i7, int i10) {
        this.f39762a = i10;
        this.f39764c = obj;
        this.f39763b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        boolean z10;
        int i7 = this.f39762a;
        int i10 = this.f39763b;
        Object obj3 = this.f39764c;
        switch (i7) {
            case 0:
                v vVar = (v) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    vVar.f40519e2[i10] = aicomposetoneexample;
                    vVar.f40518c2.O(true);
                    return;
                }
                vVar.getClass();
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) ((di.i4) obj3).f8999c;
                if (i10 == 0) {
                    b51Var.V();
                    org.telegram.ui.Wallet.u0 u0Var = o6Var.G0;
                    if (u0Var != null && !u0Var.f45215c.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        for (int i11 = 0; i11 < o6Var.G0.f45215c.size(); i11++) {
                            arrayList.add(org.telegram.ui.Wallet.e4.i((TL_wallet.walletTransaction) o6Var.G0.f45215c.get(i11), o6Var.G0.f45213a));
                        }
                    }
                    org.telegram.ui.Wallet.u0 u0Var2 = o6Var.G0;
                    if (u0Var2 != null && (u0Var2.f45221k || !u0Var2.h)) {
                        arrayList.add(n41.q(-1, 37));
                        arrayList.add(n41.q(-2, 37));
                        arrayList.add(n41.q(-3, 37));
                    }
                    b51Var.U();
                    if (z10) {
                        long j3 = ((org.telegram.messenger.l0) o6Var.getMessagesController().A7.f26258r0.f17372b).f25429c;
                        if (j3 > 0) {
                            arrayList.add(n41.C(org.telegram.messenger.gd.V(null, null, 2131742846, org.telegram.ui.Wallet.v0.x(j3, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Wallet.m0 m0Var = o6Var.H0;
                if (m0Var != null) {
                    ArrayList arrayList2 = m0Var.f44629a;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                        if (o6Var.f44806l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(o6Var.f44806l0))) {
                            if (nftitem.gift != null) {
                                org.telegram.ui.Wallet.s8 s8Var = o6Var.f44805k0;
                                int i13 = org.telegram.ui.Wallet.e8.f44222b;
                                n41 K = n41.K(org.telegram.ui.Wallet.e8.class);
                                K.v = 1;
                                K.H = nftitem;
                                K.I = s8Var;
                                arrayList.add(K);
                            } else {
                                int i14 = org.telegram.ui.Wallet.b.f44075b;
                                n41 K2 = n41.K(org.telegram.ui.Wallet.b.class);
                                K2.H = nftitem;
                                K2.v = 1;
                                arrayList.add(K2);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !o6Var.f44806l0.isEmpty()) {
                        org.telegram.ui.Wallet.m0 m0Var2 = o6Var.H0;
                        if (!m0Var2.f44635i && m0Var2.f44634g) {
                            arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131747974, null)));
                        }
                    }
                    org.telegram.ui.Wallet.m0 m0Var3 = o6Var.H0;
                    if (m0Var3.f44635i) {
                        for (int i15 = 0; i15 < 3; i15++) {
                            int i16 = org.telegram.ui.Wallet.d.f44151b;
                            n41 K3 = n41.K(org.telegram.ui.Wallet.d.class);
                            K3.v = 1;
                            K3.d = (-1) - i15;
                            arrayList.add(K3);
                        }
                        return;
                    } else if (m0Var3.f44639m != null) {
                        arrayList.add(n41.e(-10001, org.telegram.messenger.gd.N0(2131745856, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
