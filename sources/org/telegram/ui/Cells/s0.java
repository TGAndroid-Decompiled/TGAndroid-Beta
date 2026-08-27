package org.telegram.ui.Cells;

import java.util.ArrayList;

public final class s0 implements Runnable {

    public final int f25251a;

    public final v0 f25252b;

    public s0(v0 v0Var, int i10) {
        this.f25251a = i10;
        this.f25252b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f25251a) {
            case 0:
                this.f25252b.K();
                break;
            case 1:
                v0 v0Var = this.f25252b;
                t0 t0Var = v0Var.T0;
                if (t0Var != null) {
                    t0Var.q1(v0Var);
                }
                break;
            case 2:
                v0 v0Var2 = this.f25252b;
                v0Var2.post(new s0(v0Var2, 4));
                break;
            case 3:
                this.f25252b.requestLayout();
                break;
            default:
                v0 v0Var3 = this.f25252b;
                v0Var3.C = false;
                v0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = v0Var3.f25746g1.f630e;
                if (arrayList != null) {
                    arrayList.clear();
                }
                v0Var3.invalidate();
                break;
        }
    }
}
