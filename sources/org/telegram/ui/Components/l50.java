package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class l50 extends v4.u0 {
    public final v4.c0 f37031a;
    public final x50 f37032b;

    public l50(x50 x50Var, v4.c0 c0Var) {
        this.f37032b = x50Var;
        this.f37031a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        x50 x50Var = this.f37032b;
        x50.J0(x50Var);
        if (x50Var.M1 && !x50Var.L1) {
            if (x50Var.N1 - this.f37031a.N0() < 10) {
                x50Var.L0();
            }
        }
    }
}
