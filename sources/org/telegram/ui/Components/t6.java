package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class t6 implements org.telegram.ui.ActionBar.m0, dj0 {
    public final int f38269a;
    public final b8 f38270b;

    public t6(b8 b8Var, int i7) {
        this.f38269a = i7;
        this.f38270b = b8Var;
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w;
        b8 b8Var = this.f38270b;
        if (z9) {
            if (!b8Var.O0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                b8Var.X0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        b8Var.getClass();
        return false;
    }

    @Override
    public void i(int i7) {
        switch (this.f38269a) {
            case 0:
                b8 b8Var = this.f38270b;
                b8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = b8.Q2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        b8Var.a1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b8 b8Var2 = this.f38270b;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 4) {
                        if (org.telegram.messenger.iz.S0 == 1) {
                            org.telegram.messenger.iz.E(0);
                        } else {
                            org.telegram.messenger.iz.E(1);
                        }
                    } else if (org.telegram.messenger.iz.S0 == 2) {
                        org.telegram.messenger.iz.E(0);
                    } else {
                        org.telegram.messenger.iz.E(2);
                    }
                } else {
                    boolean z9 = org.telegram.messenger.iz.O0;
                    if ((z9 && i7 == 1) || (org.telegram.messenger.iz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    b8Var2.f32104q1.f();
                    if (z9 != org.telegram.messenger.iz.O0) {
                        b8Var2.f32100o1.C0();
                        b8Var2.S0(false);
                    }
                }
                b8Var2.c1();
                return;
            default:
                this.f38270b.P0(i7);
                return;
        }
    }
}
