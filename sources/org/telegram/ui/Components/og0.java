package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class og0 implements z4.e {
    public final vg0 f29137a;

    public og0(vg0 vg0Var) {
        this.f29137a = vg0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        vg0 vg0Var = this.f29137a;
        int i11 = vg0Var.f31298o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            vg0Var.getClass();
            vg0Var.f31298o1 = i10;
        }
        org.telegram.messenger.ep epVar = vg0Var.S0;
        if (epVar != null) {
            ug0 ug0Var = vg0Var.D0;
            if (ug0Var != null) {
                i12 = ug0Var.j();
            }
            epVar.b(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        org.telegram.messenger.jc jcVar;
        vg0 vg0Var = this.f29137a;
        vg0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = vg0Var.D0.k(i10);
            if (vg0Var.f31293i1) {
                k10--;
            }
            vg0Var.getCurrentItemView();
            int childCount = vg0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = vg0Var.getChildAt(i12);
                if (childAt instanceof g9) {
                    ug0 ug0Var = vg0Var.D0;
                    int k11 = ug0Var.k(ug0Var.d.indexOf(childAt));
                    if (vg0Var.f31293i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((g9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f14409t0;
                    if (k11 >= 0 && k11 < vg0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f14409t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.jc jcVar2 = (org.telegram.messenger.jc) vg0Var.W0.get(k11);
                            if (jcVar2 != null) {
                                org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(vg0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jcVar2.f16435f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.b8.J.c(new org.telegram.messenger.t6(7, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            s5 m10 = imageReceiver.m();
                            if (m10 != null && (jcVar = (org.telegram.messenger.jc) vg0Var.W0.get(k11)) != null) {
                                m10.y(jcVar.f16438j, false, true);
                            }
                            imageReceiver.f14409t0 = false;
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
