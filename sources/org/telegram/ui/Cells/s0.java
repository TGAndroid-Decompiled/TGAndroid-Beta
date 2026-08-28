package org.telegram.ui.Cells;

import java.util.ArrayList;
public final class s0 implements Runnable {
    public final int f25138a;
    public final w0 f25139b;

    public s0(w0 w0Var, int i9) {
        this.f25138a = i9;
        this.f25139b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f25138a) {
            case 0:
                this.f25139b.J();
                return;
            case 1:
                w0 w0Var = this.f25139b;
                t0 t0Var = w0Var.T0;
                if (t0Var != null) {
                    t0Var.p1(w0Var);
                    return;
                }
                return;
            case 2:
                w0 w0Var2 = this.f25139b;
                w0Var2.post(new s0(w0Var2, 4));
                return;
            case 3:
                this.f25139b.requestLayout();
                return;
            default:
                w0 w0Var3 = this.f25139b;
                w0Var3.C = false;
                w0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = w0Var3.f25843g1.f25722c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                w0Var3.invalidate();
                return;
        }
    }
}
