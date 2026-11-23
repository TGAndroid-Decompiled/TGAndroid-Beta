package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class y6 implements org.telegram.ui.ActionBar.l0, sj0 {
    public final int f42329a;
    public final f8 f42330b;

    public y6(f8 f8Var, int i7) {
        this.f42329a = i7;
        this.f42330b = f8Var;
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        f8 f8Var = this.f42330b;
        if (z10) {
            if (!f8Var.P0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                f8Var.Y0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        f8Var.getClass();
        return false;
    }

    @Override
    public void g(int i7) {
        switch (this.f42329a) {
            case 0:
                f8 f8Var = this.f42330b;
                f8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = f8.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        f8Var.b1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f8 f8Var2 = this.f42330b;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 4) {
                        if (org.telegram.messenger.cz.S0 == 1) {
                            org.telegram.messenger.cz.E(0);
                        } else {
                            org.telegram.messenger.cz.E(1);
                        }
                    } else if (org.telegram.messenger.cz.S0 == 2) {
                        org.telegram.messenger.cz.E(0);
                    } else {
                        org.telegram.messenger.cz.E(2);
                    }
                } else {
                    boolean z10 = org.telegram.messenger.cz.O0;
                    if ((z10 && i7 == 1) || (org.telegram.messenger.cz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    f8Var2.f35137u1.f();
                    if (z10 != org.telegram.messenger.cz.O0) {
                        f8Var2.f35133s1.C0();
                        f8Var2.T0(false);
                    }
                }
                f8Var2.d1();
                return;
            default:
                this.f42330b.Q0(i7);
                return;
        }
    }
}
