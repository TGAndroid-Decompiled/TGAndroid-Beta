package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bg0 implements c5.h {
    public final org.telegram.ui.bv0 f33821a;

    public bg0(org.telegram.ui.bv0 bv0Var) {
        this.f33821a = bv0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        org.telegram.ui.bv0 bv0Var = this.f33821a;
        int i10 = bv0Var.f35844p1;
        int i11 = 0;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != i10) {
            bv0Var.f35844p1 = i7;
        }
        org.telegram.messenger.vo voVar = bv0Var.T0;
        if (voVar != null) {
            gg0 gg0Var = bv0Var.E0;
            if (gg0Var != null) {
                i11 = gg0Var.j();
            }
            voVar.b(i7 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.gc gcVar;
        org.telegram.ui.bv0 bv0Var = this.f33821a;
        bv0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = bv0Var.E0.k(i7);
            bv0Var.getCurrentItemView();
            int childCount = bv0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = bv0Var.getChildAt(i11);
                if (childAt instanceof q9) {
                    gg0 gg0Var = bv0Var.E0;
                    int k11 = gg0Var.k(gg0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((q9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f22659u0;
                    if (k11 >= 0 && k11 < bv0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f22659u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) bv0Var.X0.get(k11);
                            if (gcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(bv0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gcVar2.f24080f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            c6 m10 = imageReceiver.m();
                            if (m10 != null && (gcVar = (org.telegram.messenger.gc) bv0Var.X0.get(k11)) != null) {
                                m10.y(gcVar.f24083j, false, true);
                            }
                            imageReceiver.f22659u0 = false;
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
