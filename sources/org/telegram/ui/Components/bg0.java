package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bg0 implements c5.h {
    public final org.telegram.ui.av0 f33843a;

    public bg0(org.telegram.ui.av0 av0Var) {
        this.f33843a = av0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        org.telegram.ui.av0 av0Var = this.f33843a;
        int i10 = av0Var.f35891p1;
        int i11 = 0;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != i10) {
            av0Var.f35891p1 = i7;
        }
        org.telegram.messenger.vo voVar = av0Var.T0;
        if (voVar != null) {
            gg0 gg0Var = av0Var.E0;
            if (gg0Var != null) {
                i11 = gg0Var.j();
            }
            voVar.b(i7 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.gc gcVar;
        org.telegram.ui.av0 av0Var = this.f33843a;
        av0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = av0Var.E0.k(i7);
            av0Var.getCurrentItemView();
            int childCount = av0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = av0Var.getChildAt(i11);
                if (childAt instanceof q9) {
                    gg0 gg0Var = av0Var.E0;
                    int k11 = gg0Var.k(gg0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((q9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f22695u0;
                    if (k11 >= 0 && k11 < av0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f22695u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) av0Var.X0.get(k11);
                            if (gcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(av0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gcVar2.f24116f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            c6 m10 = imageReceiver.m();
                            if (m10 != null && (gcVar = (org.telegram.messenger.gc) av0Var.X0.get(k11)) != null) {
                                m10.y(gcVar.f24119j, false, true);
                            }
                            imageReceiver.f22695u0 = false;
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
