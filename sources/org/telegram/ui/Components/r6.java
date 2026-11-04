package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class r6 implements org.telegram.ui.ActionBar.l0, hj0 {
    public final int f37659a;
    public final z7 f37660b;

    public r6(z7 z7Var, int i3) {
        this.f37659a = i3;
        this.f37660b = z7Var;
    }

    @Override
    public boolean f(int i3, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        z7 z7Var = this.f37660b;
        if (z10) {
            if (!z7Var.O0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                z7Var.X0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        z7Var.getClass();
        return false;
    }

    @Override
    public void i(int i3) {
        switch (this.f37659a) {
            case 0:
                z7 z7Var = this.f37660b;
                z7Var.getClass();
                if (i3 >= 0) {
                    float[] fArr = z7.R2;
                    if (i3 < 6) {
                        MediaController.B().m0(true, fArr[i3]);
                        z7Var.a1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                z7 z7Var2 = this.f37660b;
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 4) {
                        if (org.telegram.messenger.az.S0 == 1) {
                            org.telegram.messenger.az.E(0);
                        } else {
                            org.telegram.messenger.az.E(1);
                        }
                    } else if (org.telegram.messenger.az.S0 == 2) {
                        org.telegram.messenger.az.E(0);
                    } else {
                        org.telegram.messenger.az.E(2);
                    }
                } else {
                    boolean z10 = org.telegram.messenger.az.O0;
                    if ((z10 && i3 == 1) || (org.telegram.messenger.az.N0 && i3 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i3);
                    }
                    z7Var2.f40962r1.f();
                    if (z10 != org.telegram.messenger.az.O0) {
                        z7Var2.f40958p1.C0();
                        z7Var2.S0(false);
                    }
                }
                z7Var2.c1();
                return;
            default:
                this.f37660b.P0(i3);
                return;
        }
    }
}
