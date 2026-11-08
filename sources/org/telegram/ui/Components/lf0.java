package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lf0 implements c5.g {
    public final sf0 f35688a;

    public lf0(sf0 sf0Var) {
        this.f35688a = sf0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        sf0 sf0Var = this.f35688a;
        int i10 = sf0Var.f38060o1;
        int i11 = 0;
        if (i7 >= i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 != i10) {
            sf0Var.getClass();
            sf0Var.f38060o1 = i7;
        }
        org.telegram.messenger.yo yoVar = sf0Var.S0;
        if (yoVar != null) {
            rf0 rf0Var = sf0Var.D0;
            if (rf0Var != null) {
                i11 = rf0Var.j();
            }
            yoVar.b(i7 - i11, z9);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.hc hcVar;
        sf0 sf0Var = this.f35688a;
        sf0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = sf0Var.D0.k(i7);
            if (sf0Var.f38056i1) {
                k10--;
            }
            sf0Var.getCurrentItemView();
            int childCount = sf0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = sf0Var.getChildAt(i11);
                if (childAt instanceof l9) {
                    rf0 rf0Var = sf0Var.D0;
                    int k11 = rf0Var.k(rf0Var.d.indexOf(childAt));
                    if (sf0Var.f38056i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((l9) childAt).getImageReceiver();
                    boolean z9 = imageReceiver.f21220t0;
                    if (k11 >= 0 && k11 < sf0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z9) {
                                imageReceiver.f21220t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) sf0Var.W0.get(k11);
                            if (hcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(sf0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar2.f22869f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.J.c(new org.telegram.messenger.x4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z9) {
                            v5 m10 = imageReceiver.m();
                            if (m10 != null && (hcVar = (org.telegram.messenger.hc) sf0Var.W0.get(k11)) != null) {
                                m10.y(hcVar.f22872j, false, true);
                            }
                            imageReceiver.f21220t0 = false;
                            imageReceiver.Q0();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void c(int i7) {
    }
}
