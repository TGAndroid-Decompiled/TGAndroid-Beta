package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class of0 implements b5.h {
    public final vf0 f36821a;

    public of0(vf0 vf0Var) {
        this.f36821a = vf0Var;
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        vf0 vf0Var = this.f36821a;
        int i10 = vf0Var.f39105p1;
        int i11 = 0;
        if (i3 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 != i10) {
            vf0Var.getClass();
            vf0Var.f39105p1 = i3;
        }
        org.telegram.messenger.po poVar = vf0Var.T0;
        if (poVar != null) {
            uf0 uf0Var = vf0Var.E0;
            if (uf0Var != null) {
                i11 = uf0Var.j();
            }
            poVar.b(i3 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        org.telegram.messenger.ac acVar;
        vf0 vf0Var = this.f36821a;
        vf0Var.B(f10, i3);
        if (i10 == 0) {
            int k10 = vf0Var.E0.k(i3);
            if (vf0Var.f39101j1) {
                k10--;
            }
            vf0Var.getCurrentItemView();
            int childCount = vf0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = vf0Var.getChildAt(i11);
                if (childAt instanceof k9) {
                    uf0 uf0Var = vf0Var.E0;
                    int k11 = uf0Var.k(uf0Var.d.indexOf(childAt));
                    if (vf0Var.f39101j1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((k9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f21272u0;
                    if (k11 >= 0 && k11 < vf0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f21272u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) vf0Var.X0.get(k11);
                            if (acVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(vf0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = acVar2.f21488f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.y4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            t5 m10 = imageReceiver.m();
                            if (m10 != null && (acVar = (org.telegram.messenger.ac) vf0Var.X0.get(k11)) != null) {
                                m10.y(acVar.f21491j, false, true);
                            }
                            imageReceiver.f21272u0 = false;
                            imageReceiver.Q0();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void c(int i3) {
    }
}
