package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class o50 extends v4.t0 {
    public final v4.b0 f38074a;
    public final a60 f38075b;

    public o50(a60 a60Var, v4.b0 b0Var) {
        this.f38075b = a60Var;
        this.f38074a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        a60 a60Var = this.f38075b;
        a60.J0(a60Var);
        if (a60Var.M1 && !a60Var.L1) {
            if (a60Var.N1 - this.f38074a.N0() < 10) {
                a60Var.L0();
            }
        }
    }
}
