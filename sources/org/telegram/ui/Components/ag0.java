package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ag0 implements c5.h {
    public final hg0 f33503a;

    public ag0(hg0 hg0Var) {
        this.f33503a = hg0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        hg0 hg0Var = this.f33503a;
        int i10 = hg0Var.f35898p1;
        int i11 = 0;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != i10) {
            hg0Var.getClass();
            hg0Var.f35898p1 = i7;
        }
        org.telegram.messenger.uo uoVar = hg0Var.T0;
        if (uoVar != null) {
            gg0 gg0Var = hg0Var.E0;
            if (gg0Var != null) {
                i11 = gg0Var.j();
            }
            uoVar.b(i7 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.fc fcVar;
        hg0 hg0Var = this.f33503a;
        hg0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = hg0Var.E0.k(i7);
            if (hg0Var.f35894j1) {
                k10--;
            }
            hg0Var.getCurrentItemView();
            int childCount = hg0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = hg0Var.getChildAt(i11);
                if (childAt instanceof q9) {
                    gg0 gg0Var = hg0Var.E0;
                    int k11 = gg0Var.k(gg0Var.d.indexOf(childAt));
                    if (hg0Var.f35894j1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((q9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f22692u0;
                    if (k11 >= 0 && k11 < hg0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f22692u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) hg0Var.X0.get(k11);
                            if (fcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(hg0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = fcVar2.f23896f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            c6 m10 = imageReceiver.m();
                            if (m10 != null && (fcVar = (org.telegram.messenger.fc) hg0Var.X0.get(k11)) != null) {
                                m10.y(fcVar.f23899j, false, true);
                            }
                            imageReceiver.f22692u0 = false;
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
