package org.telegram.ui.Cells;

import java.util.ArrayList;
public final class s0 implements Runnable {
    public final int f19916a;
    public final w0 f19917b;

    public s0(w0 w0Var, int i10) {
        this.f19916a = i10;
        this.f19917b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f19916a) {
            case 0:
                this.f19917b.K();
                return;
            case 1:
                w0 w0Var = this.f19917b;
                t0 t0Var = w0Var.X0;
                if (t0Var != null) {
                    t0Var.x1(w0Var);
                    return;
                }
                return;
            case 2:
                w0 w0Var2 = this.f19917b;
                w0Var2.post(new s0(w0Var2, 4));
                return;
            case 3:
                this.f19917b.requestLayout();
                return;
            default:
                w0 w0Var3 = this.f19917b;
                w0Var3.G = false;
                w0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = w0Var3.f20614k1.f20466c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                w0Var3.invalidate();
                return;
        }
    }
}
