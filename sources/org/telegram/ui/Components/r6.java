package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class r6 implements org.telegram.ui.ActionBar.l0, ij0 {
    public final int f38890a;
    public final y7 f38891b;

    public r6(y7 y7Var, int i7) {
        this.f38890a = i7;
        this.f38891b = y7Var;
    }

    @Override
    public boolean b(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        y7 y7Var = this.f38891b;
        if (z10) {
            if (!y7Var.O0()) {
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
                y7Var.X0(wVar, wVar.getMessageObject());
                return true;
            }
            return false;
        }
        y7Var.getClass();
        return false;
    }

    @Override
    public void g(int i7) {
        switch (this.f38890a) {
            case 0:
                y7 y7Var = this.f38891b;
                y7Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = y7.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        y7Var.a1(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y7 y7Var2 = this.f38891b;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 4) {
                        if (org.telegram.messenger.gz.S0 == 1) {
                            org.telegram.messenger.gz.E(0);
                        } else {
                            org.telegram.messenger.gz.E(1);
                        }
                    } else if (org.telegram.messenger.gz.S0 == 2) {
                        org.telegram.messenger.gz.E(0);
                    } else {
                        org.telegram.messenger.gz.E(2);
                    }
                } else {
                    boolean z10 = org.telegram.messenger.gz.O0;
                    if ((z10 && i7 == 1) || (org.telegram.messenger.gz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    y7Var2.f41920u1.f();
                    if (z10 != org.telegram.messenger.gz.O0) {
                        y7Var2.f41916s1.C0();
                        y7Var2.S0(false);
                    }
                }
                y7Var2.c1();
                return;
            default:
                this.f38891b.P0(i7);
                return;
        }
    }
}
