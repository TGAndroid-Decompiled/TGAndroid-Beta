package org.telegram.ui.Cells;

import java.util.ArrayList;
public final class s0 implements Runnable {
    public final int f20790a;
    public final w0 f20791b;

    public s0(w0 w0Var, int i10) {
        this.f20790a = i10;
        this.f20791b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f20790a) {
            case 0:
                this.f20791b.K();
                return;
            case 1:
                w0 w0Var = this.f20791b;
                t0 t0Var = w0Var.X0;
                if (t0Var != null) {
                    t0Var.y1(w0Var);
                    return;
                }
                return;
            case 2:
                w0 w0Var2 = this.f20791b;
                w0Var2.post(new s0(w0Var2, 4));
                return;
            case 3:
                this.f20791b.requestLayout();
                return;
            default:
                w0 w0Var3 = this.f20791b;
                w0Var3.G = false;
                w0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = w0Var3.f21500k1.f21387c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                w0Var3.invalidate();
                return;
        }
    }
}
