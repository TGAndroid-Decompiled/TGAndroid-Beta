package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ng0 implements z4.e {
    public final ug0 f28790a;

    public ng0(ug0 ug0Var) {
        this.f28790a = ug0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        ug0 ug0Var = this.f28790a;
        int i11 = ug0Var.f30939o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            ug0Var.getClass();
            ug0Var.f30939o1 = i10;
        }
        org.telegram.messenger.dp dpVar = ug0Var.S0;
        if (dpVar != null) {
            tg0 tg0Var = ug0Var.D0;
            if (tg0Var != null) {
                i12 = tg0Var.j();
            }
            dpVar.b(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        org.telegram.messenger.ic icVar;
        ug0 ug0Var = this.f28790a;
        ug0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ug0Var.D0.k(i10);
            if (ug0Var.f30934i1) {
                k10--;
            }
            ug0Var.getCurrentItemView();
            int childCount = ug0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ug0Var.getChildAt(i12);
                if (childAt instanceof g9) {
                    tg0 tg0Var = ug0Var.D0;
                    int k11 = tg0Var.k(tg0Var.d.indexOf(childAt));
                    if (ug0Var.f30934i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((g9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f14408t0;
                    if (k11 >= 0 && k11 < ug0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f14408t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) ug0Var.W0.get(k11);
                            if (icVar2 != null) {
                                org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(ug0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = icVar2.f16100f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.b8.J.c(new org.telegram.messenger.t6(7, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            s5 m10 = imageReceiver.m();
                            if (m10 != null && (icVar = (org.telegram.messenger.ic) ug0Var.W0.get(k11)) != null) {
                                m10.y(icVar.f16103j, false, true);
                            }
                            imageReceiver.f14408t0 = false;
                            imageReceiver.Q0();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
    }
}
