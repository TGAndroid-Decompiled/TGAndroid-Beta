package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class s6 implements org.telegram.ui.ActionBar.m0, dj0 {
    public final int f37875a;
    public final a8 f37876b;

    public s6(a8 a8Var, int i7) {
        this.f37875a = i7;
        this.f37876b = a8Var;
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w;
        a8 a8Var = this.f37876b;
        if (z9) {
            if (!a8Var.O0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                a8Var.X0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        a8Var.getClass();
        return false;
    }

    @Override
    public void i(int i7) {
        switch (this.f37875a) {
            case 0:
                a8 a8Var = this.f37876b;
                a8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = a8.T2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        a8Var.a1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                a8 a8Var2 = this.f37876b;
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
                    a8Var2.f31758t1.f();
                    if (z9 != org.telegram.messenger.iz.O0) {
                        a8Var2.f31754r1.C0();
                        a8Var2.S0(false);
                    }
                }
                a8Var2.c1();
                return;
            default:
                this.f37876b.P0(i7);
                return;
        }
    }
}
