package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class yf0 implements c5.h {
    public final fg0 f42484a;

    public yf0(fg0 fg0Var) {
        this.f42484a = fg0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        fg0 fg0Var = this.f42484a;
        int i10 = fg0Var.f35091p1;
        int i11 = 0;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != i10) {
            fg0Var.getClass();
            fg0Var.f35091p1 = i7;
        }
        org.telegram.messenger.uo uoVar = fg0Var.T0;
        if (uoVar != null) {
            eg0 eg0Var = fg0Var.E0;
            if (eg0Var != null) {
                i11 = eg0Var.j();
            }
            uoVar.b(i7 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.fc fcVar;
        fg0 fg0Var = this.f42484a;
        fg0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = fg0Var.E0.k(i7);
            if (fg0Var.f35087j1) {
                k10--;
            }
            fg0Var.getCurrentItemView();
            int childCount = fg0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fg0Var.getChildAt(i11);
                if (childAt instanceof q9) {
                    eg0 eg0Var = fg0Var.E0;
                    int k11 = eg0Var.k(eg0Var.d.indexOf(childAt));
                    if (fg0Var.f35087j1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((q9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f22664u0;
                    if (k11 >= 0 && k11 < fg0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f22664u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) fg0Var.X0.get(k11);
                            if (fcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(fg0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = fcVar2.f23868f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            b6 m10 = imageReceiver.m();
                            if (m10 != null && (fcVar = (org.telegram.messenger.fc) fg0Var.X0.get(k11)) != null) {
                                m10.y(fcVar.f23871j, false, true);
                            }
                            imageReceiver.f22664u0 = false;
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
