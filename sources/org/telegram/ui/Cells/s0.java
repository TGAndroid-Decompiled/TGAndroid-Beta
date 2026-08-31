package org.telegram.ui.Cells;

import java.util.ArrayList;
public final class s0 implements Runnable {
    public final int f23609a;
    public final v0 f23610b;

    public s0(v0 v0Var, int i10) {
        this.f23609a = i10;
        this.f23610b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f23609a) {
            case 0:
                this.f23610b.J();
                return;
            case 1:
                v0 v0Var = this.f23610b;
                t0 t0Var = v0Var.U0;
                if (t0Var != null) {
                    t0Var.F1(v0Var);
                    return;
                }
                return;
            case 2:
                v0 v0Var2 = this.f23610b;
                v0Var2.post(new s0(v0Var2, 4));
                return;
            case 3:
                this.f23610b.requestLayout();
                return;
            default:
                v0 v0Var3 = this.f23610b;
                v0Var3.D = false;
                v0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = v0Var3.f24259h1.f6477e;
                if (arrayList != null) {
                    arrayList.clear();
                }
                v0Var3.invalidate();
                return;
        }
    }
}
