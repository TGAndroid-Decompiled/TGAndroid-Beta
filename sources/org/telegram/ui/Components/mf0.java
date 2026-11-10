package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mf0 implements c5.g {
    public final org.telegram.ui.dv0 f35953a;

    public mf0(org.telegram.ui.dv0 dv0Var) {
        this.f35953a = dv0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        org.telegram.ui.dv0 dv0Var = this.f35953a;
        int i10 = dv0Var.f37981o1;
        int i11 = 0;
        if (i7 >= i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 != i10) {
            dv0Var.f37981o1 = i7;
        }
        org.telegram.messenger.yo yoVar = dv0Var.S0;
        if (yoVar != null) {
            rf0 rf0Var = dv0Var.D0;
            if (rf0Var != null) {
                i11 = rf0Var.j();
            }
            yoVar.b(i7 - i11, z9);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.hc hcVar;
        org.telegram.ui.dv0 dv0Var = this.f35953a;
        dv0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = dv0Var.D0.k(i7);
            dv0Var.getCurrentItemView();
            int childCount = dv0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = dv0Var.getChildAt(i11);
                if (childAt instanceof k9) {
                    rf0 rf0Var = dv0Var.D0;
                    int k11 = rf0Var.k(rf0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((k9) childAt).getImageReceiver();
                    boolean z9 = imageReceiver.f21225t0;
                    if (k11 >= 0 && k11 < dv0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z9) {
                                imageReceiver.f21225t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) dv0Var.W0.get(k11);
                            if (hcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(dv0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar2.f22873f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.J.c(new org.telegram.messenger.x4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z9) {
                            u5 m10 = imageReceiver.m();
                            if (m10 != null && (hcVar = (org.telegram.messenger.hc) dv0Var.W0.get(k11)) != null) {
                                m10.y(hcVar.f22876j, false, true);
                            }
                            imageReceiver.f21225t0 = false;
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
