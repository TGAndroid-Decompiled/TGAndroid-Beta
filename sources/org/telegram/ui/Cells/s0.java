package org.telegram.ui.Cells;

import java.util.ArrayList;
public final class s0 implements Runnable {
    public final int f22752a;
    public final w0 f22753b;

    public s0(w0 w0Var, int i10) {
        this.f22752a = i10;
        this.f22753b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f22752a) {
            case 0:
                this.f22753b.I();
                return;
            case 1:
                w0 w0Var = this.f22753b;
                t0 t0Var = w0Var.X0;
                if (t0Var != null) {
                    t0Var.y1(w0Var);
                    return;
                }
                return;
            case 2:
                w0 w0Var2 = this.f22753b;
                w0Var2.post(new s0(w0Var2, 4));
                return;
            case 3:
                this.f22753b.requestLayout();
                return;
            default:
                w0 w0Var3 = this.f22753b;
                w0Var3.G = false;
                w0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = w0Var3.f23630k1.f23122c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                w0Var3.invalidate();
                return;
        }
    }
}
