package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class p6 implements org.telegram.ui.ActionBar.o0, jk0 {
    public final int f29364a;
    public final w7 f29365b;

    public p6(w7 w7Var, int i10) {
        this.f29364a = i10;
        this.f29365b = w7Var;
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        w7 w7Var = this.f29365b;
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
        switch (this.f29364a) {
            case 0:
                w7 w7Var = this.f29365b;
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
                w7 w7Var2 = this.f29365b;
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 4) {
                        if (org.telegram.messenger.uz.S0 == 1) {
                            org.telegram.messenger.uz.E(0);
                        } else {
                            org.telegram.messenger.uz.E(1);
                        }
                    } else if (org.telegram.messenger.uz.S0 == 2) {
                        org.telegram.messenger.uz.E(0);
                    } else {
                        org.telegram.messenger.uz.E(2);
                    }
                } else {
                    boolean z10 = org.telegram.messenger.uz.O0;
                    if ((z10 && i10 == 1) || (org.telegram.messenger.uz.N0 && i10 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i10);
                    }
                    w7Var2.f32114q1.f();
                    if (z10 != org.telegram.messenger.uz.O0) {
                        w7Var2.f32110o1.C0();
                        w7Var2.S0(false);
                    }
                }
                w7Var2.c1();
                return;
            default:
                this.f29365b.P0(i10);
                return;
        }
    }
}
