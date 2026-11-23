package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class x6 implements org.telegram.ui.ActionBar.l0, sj0 {
    public final int f41857a;
    public final e8 f41858b;

    public x6(e8 e8Var, int i7) {
        this.f41857a = i7;
        this.f41858b = e8Var;
    }

    @Override
    public boolean b(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        e8 e8Var = this.f41858b;
        if (z10) {
            if (!e8Var.P0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                e8Var.Y0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        e8Var.getClass();
        return false;
    }

    @Override
    public void h(int i7) {
        switch (this.f41857a) {
            case 0:
                e8 e8Var = this.f41858b;
                e8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = e8.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        e8Var.b1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e8 e8Var2 = this.f41858b;
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
                    e8Var2.f34618u1.f();
                    if (z10 != org.telegram.messenger.bz.O0) {
                        e8Var2.f34614s1.C0();
                        e8Var2.T0(false);
                    }
                }
                e8Var2.d1();
                return;
            default:
                this.f41858b.Q0(i7);
                return;
        }
    }
}
