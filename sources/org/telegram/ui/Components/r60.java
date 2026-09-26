package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class r60 extends s4.s0 {
    public final s4.c0 f27841a;
    public final d70 f27842b;

    public r60(d70 d70Var, s4.c0 c0Var) {
        this.f27842b = d70Var;
        this.f27841a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        d70 d70Var = this.f27842b;
        d70.O(d70Var);
        if (d70Var.R && !d70Var.Q) {
            if (d70Var.S - this.f27841a.N0() < 10) {
                d70Var.X();
            }
        }
    }
}
