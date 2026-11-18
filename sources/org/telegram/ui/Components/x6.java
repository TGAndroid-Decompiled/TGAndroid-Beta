package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class x6 implements org.telegram.ui.ActionBar.m0, qj0 {
    public final int f41923a;
    public final g8 f41924b;

    public x6(g8 g8Var, int i7) {
        this.f41923a = i7;
        this.f41924b = g8Var;
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        g8 g8Var = this.f41924b;
        if (z10) {
            if (!g8Var.P0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                g8Var.Y0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        g8Var.getClass();
        return false;
    }

    @Override
    public void g(int i7) {
        switch (this.f41923a) {
            case 0:
                g8 g8Var = this.f41924b;
                g8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = g8.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        g8Var.b1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g8 g8Var2 = this.f41924b;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 4) {
                        if (org.telegram.messenger.bz.S0 == 1) {
                            org.telegram.messenger.bz.E(0);
                        } else {
                            org.telegram.messenger.bz.E(1);
                        }
                    } else if (org.telegram.messenger.bz.S0 == 2) {
                        org.telegram.messenger.bz.E(0);
                    } else {
                        org.telegram.messenger.bz.E(2);
                    }
                } else {
                    boolean z10 = org.telegram.messenger.bz.O0;
                    if ((z10 && i7 == 1) || (org.telegram.messenger.bz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    g8Var2.f35412u1.f();
                    if (z10 != org.telegram.messenger.bz.O0) {
                        g8Var2.f35408s1.C0();
                        g8Var2.T0(false);
                    }
                }
                g8Var2.d1();
                return;
            default:
                this.f41924b.Q0(i7);
                return;
        }
    }
}
