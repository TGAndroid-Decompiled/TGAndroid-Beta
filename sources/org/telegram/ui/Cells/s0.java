package org.telegram.ui.Cells;

import java.util.ArrayList;
public final class s0 implements Runnable {
    public final int f25263a;
    public final v0 f25264b;

    public s0(v0 v0Var, int i10) {
        this.f25263a = i10;
        this.f25264b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f25263a) {
            case 0:
                this.f25264b.J();
                return;
            case 1:
                v0 v0Var = this.f25264b;
                t0 t0Var = v0Var.T0;
                if (t0Var != null) {
                    t0Var.y1(v0Var);
                    return;
                }
                return;
            case 2:
                v0 v0Var2 = this.f25264b;
                v0Var2.post(new s0(v0Var2, 4));
                return;
            case 3:
                this.f25264b.requestLayout();
                return;
            default:
                v0 v0Var3 = this.f25264b;
                v0Var3.C = false;
                v0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = v0Var3.f25776g1.f3254e;
                if (arrayList != null) {
                    arrayList.clear();
                }
                v0Var3.invalidate();
                return;
        }
    }
}
