package org.telegram.ui.Cells;

import java.util.ArrayList;
public final class s0 implements Runnable {
    public final int f21814a;
    public final v0 f21815b;

    public s0(v0 v0Var, int i10) {
        this.f21814a = i10;
        this.f21815b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f21814a) {
            case 0:
                this.f21815b.J();
                return;
            case 1:
                v0 v0Var = this.f21815b;
                t0 t0Var = v0Var.U0;
                if (t0Var != null) {
                    t0Var.B1(v0Var);
                    return;
                }
                return;
            case 2:
                v0 v0Var2 = this.f21815b;
                v0Var2.post(new s0(v0Var2, 4));
                return;
            case 3:
                this.f21815b.requestLayout();
                return;
            default:
                v0 v0Var3 = this.f21815b;
                v0Var3.D = false;
                v0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = v0Var3.f22447h1.e;
                if (arrayList != null) {
                    arrayList.clear();
                }
                v0Var3.invalidate();
                return;
        }
    }
}
