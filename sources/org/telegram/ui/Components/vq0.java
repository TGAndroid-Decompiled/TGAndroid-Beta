package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vq0 implements Runnable {
    public final int f32527a;
    public final zu0 f32528b;

    public vq0(zu0 zu0Var, int i10) {
        this.f32527a = i10;
        this.f32528b = zu0Var;
    }

    @Override
    public final void run() {
        switch (this.f32527a) {
            case 0:
                zu0 zu0Var = this.f32528b;
                ls lsVar = zu0Var.M0;
                zu0Var.Y1 = (int) lsVar.c(AndroidUtilities.dp(14.0f));
                pr0 pr0Var = zu0Var.S;
                if (pr0Var != null) {
                    pr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) lsVar.c(AndroidUtilities.dp(7.0f))));
                }
                rt0[] rt0VarArr = zu0Var.f33980h0;
                if (rt0VarArr != null) {
                    for (rt0 rt0Var : rt0VarArr) {
                        if (rt0Var != null) {
                            int paddingTop = rt0Var.h.getPaddingTop();
                            xr0 xr0Var = rt0Var.h;
                            int paddingLeft = xr0Var.getPaddingLeft();
                            int Z = zu0Var.Z(rt0Var.C);
                            int paddingRight = rt0Var.h.getPaddingRight();
                            xr0 xr0Var2 = rt0Var.h;
                            int Y = zu0Var.Y(zu0Var.v0());
                            xr0Var2.f30478b3 = Y;
                            xr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(rt0Var.h, new jm(rt0Var, paddingTop - rt0Var.h.getPaddingTop(), 6));
                        }
                    }
                    return;
                }
                return;
            case 1:
                zu0 zu0Var2 = this.f32528b;
                zu0Var2.b1(false);
                zu0Var2.D.h(true);
                zu0Var2.X0 = 0;
                return;
            default:
                this.f32528b.k0();
                return;
        }
    }
}
