package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class pf0 implements b5.h {
    public final org.telegram.ui.ru0 f37146a;

    public pf0(org.telegram.ui.ru0 ru0Var) {
        this.f37146a = ru0Var;
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        org.telegram.ui.ru0 ru0Var = this.f37146a;
        int i10 = ru0Var.f39105p1;
        int i11 = 0;
        if (i3 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 != i10) {
            ru0Var.f39105p1 = i3;
        }
        org.telegram.messenger.po poVar = ru0Var.T0;
        if (poVar != null) {
            uf0 uf0Var = ru0Var.E0;
            if (uf0Var != null) {
                i11 = uf0Var.j();
            }
            poVar.b(i3 - i11, z10);
        }
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        org.telegram.messenger.ac acVar;
        org.telegram.ui.ru0 ru0Var = this.f37146a;
        ru0Var.B(f10, i3);
        if (i10 == 0) {
            int k10 = ru0Var.E0.k(i3);
            ru0Var.getCurrentItemView();
            int childCount = ru0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ru0Var.getChildAt(i11);
                if (childAt instanceof k9) {
                    uf0 uf0Var = ru0Var.E0;
                    int k11 = uf0Var.k(uf0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((k9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.f21272u0;
                    if (k11 >= 0 && k11 < ru0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.f21272u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) ru0Var.X0.get(k11);
                            if (acVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(ru0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = acVar2.f21488f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.y4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            t5 m10 = imageReceiver.m();
                            if (m10 != null && (acVar = (org.telegram.messenger.ac) ru0Var.X0.get(k11)) != null) {
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
