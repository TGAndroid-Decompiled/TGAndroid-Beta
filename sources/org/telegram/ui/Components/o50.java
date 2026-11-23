package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class o50 extends v4.u0 {
    public final v4.c0 f38107a;
    public final a60 f38108b;

    public o50(a60 a60Var, v4.c0 c0Var) {
        this.f38108b = a60Var;
        this.f38107a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        a60 a60Var = this.f38108b;
        a60.J0(a60Var);
        if (a60Var.M1 && !a60Var.L1) {
            if (a60Var.N1 - this.f38107a.N0() < 10) {
                a60Var.L0();
            }
        }
    }
}
