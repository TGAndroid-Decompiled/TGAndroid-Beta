package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class y6 implements org.telegram.ui.ActionBar.l0, sj0 {
    public final int f42337a;
    public final f8 f42338b;

    public y6(f8 f8Var, int i7) {
        this.f42337a = i7;
        this.f42338b = f8Var;
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        f8 f8Var = this.f42338b;
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
        switch (this.f42337a) {
            case 0:
                f8 f8Var = this.f42338b;
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
                f8 f8Var2 = this.f42338b;
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
                    f8Var2.f35135u1.f();
                    if (z10 != org.telegram.messenger.bz.O0) {
                        f8Var2.f35131s1.C0();
                        f8Var2.T0(false);
                    }
                }
                f8Var2.d1();
                return;
            default:
                this.f42338b.Q0(i7);
                return;
        }
    }
}
