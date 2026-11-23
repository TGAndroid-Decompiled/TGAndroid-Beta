package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class zf0 implements c5.h {
    public final gg0 f42846a;

    public zf0(gg0 gg0Var) {
        this.f42846a = gg0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        gg0 gg0Var = this.f42846a;
        int i10 = gg0Var.f35426p1;
        int i11 = 0;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != i10) {
            gg0Var.getClass();
            gg0Var.f35426p1 = i7;
        }
        org.telegram.messenger.uo uoVar = gg0Var.T0;
        if (uoVar != null) {
            fg0 fg0Var = gg0Var.E0;
            if (fg0Var != null) {
                i11 = fg0Var.j();
            }
            uoVar.b(i7 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.fc fcVar;
        gg0 gg0Var = this.f42846a;
        gg0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = gg0Var.E0.k(i7);
            if (gg0Var.f35422j1) {
                k10--;
            }
            gg0Var.getCurrentItemView();
            int childCount = gg0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = gg0Var.getChildAt(i11);
                if (childAt instanceof p9) {
                    fg0 fg0Var = gg0Var.E0;
                    int k11 = fg0Var.k(fg0Var.d.indexOf(childAt));
                    if (gg0Var.f35422j1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f22762u0;
                    if (k11 >= 0 && k11 < gg0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f22762u0 = true;
                                imageReceiver.Q0(false);
                            }
                            org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) gg0Var.X0.get(k11);
                            if (fcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(gg0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = fcVar2.f23976f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            b6 m10 = imageReceiver.m();
                            if (m10 != null && (fcVar = (org.telegram.messenger.fc) gg0Var.X0.get(k11)) != null) {
                                m10.y(fcVar.f23979j, false, true);
                            }
                            imageReceiver.f22762u0 = false;
                            imageReceiver.R0();
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
