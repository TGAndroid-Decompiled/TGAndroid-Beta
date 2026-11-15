package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class pf0 implements c5.h {
    public final org.telegram.ui.yu0 f38295a;

    public pf0(org.telegram.ui.yu0 yu0Var) {
        this.f38295a = yu0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        org.telegram.ui.yu0 yu0Var = this.f38295a;
        int i10 = yu0Var.f40406p1;
        int i11 = 0;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != i10) {
            yu0Var.f40406p1 = i7;
        }
        org.telegram.messenger.vo voVar = yu0Var.T0;
        if (voVar != null) {
            uf0 uf0Var = yu0Var.E0;
            if (uf0Var != null) {
                i11 = uf0Var.j();
            }
            voVar.b(i7 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.gc gcVar;
        org.telegram.ui.yu0 yu0Var = this.f38295a;
        yu0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = yu0Var.E0.k(i7);
            yu0Var.getCurrentItemView();
            int childCount = yu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = yu0Var.getChildAt(i11);
                if (childAt instanceof i9) {
                    uf0 uf0Var = yu0Var.E0;
                    int k11 = uf0Var.k(uf0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((i9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f22301u0;
                    if (k11 >= 0 && k11 < yu0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f22301u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) yu0Var.X0.get(k11);
                            if (gcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(yu0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gcVar2.f23717f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.x4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            t5 m10 = imageReceiver.m();
                            if (m10 != null && (gcVar = (org.telegram.messenger.gc) yu0Var.X0.get(k11)) != null) {
                                m10.y(gcVar.f23720j, false, true);
                            }
                            imageReceiver.f22301u0 = false;
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
