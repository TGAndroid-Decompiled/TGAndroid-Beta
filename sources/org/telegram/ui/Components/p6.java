package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class p6 implements org.telegram.ui.ActionBar.o0, ik0 {
    public final int f29300a;
    public final w7 f29301b;

    public p6(w7 w7Var, int i10) {
        this.f29300a = i10;
        this.f29301b = w7Var;
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        w7 w7Var = this.f29301b;
        if (z10) {
            if (!w7Var.O0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                w7Var.X0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        w7Var.getClass();
        return false;
    }

    @Override
    public void k(int i10) {
        switch (this.f29300a) {
            case 0:
                w7 w7Var = this.f29301b;
                w7Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = w7.Q2;
                    if (i10 < 6) {
                        MediaController.B().m0(true, fArr[i10]);
                        w7Var.a1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w7 w7Var2 = this.f29301b;
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 4) {
                        if (org.telegram.messenger.tz.S0 == 1) {
                            org.telegram.messenger.tz.E(0);
                        } else {
                            org.telegram.messenger.tz.E(1);
                        }
                    } else if (org.telegram.messenger.tz.S0 == 2) {
                        org.telegram.messenger.tz.E(0);
                    } else {
                        org.telegram.messenger.tz.E(2);
                    }
                } else {
                    boolean z10 = org.telegram.messenger.tz.O0;
                    if ((z10 && i10 == 1) || (org.telegram.messenger.tz.N0 && i10 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i10);
                    }
                    w7Var2.f32066q1.f();
                    if (z10 != org.telegram.messenger.tz.O0) {
                        w7Var2.f32062o1.C0();
                        w7Var2.S0(false);
                    }
                }
                w7Var2.c1();
                return;
            default:
                this.f29301b.P0(i10);
                return;
        }
    }
}
