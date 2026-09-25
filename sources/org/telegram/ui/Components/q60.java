package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class q60 extends s4.s0 {
    public final s4.c0 f27522a;
    public final c70 f27523b;

    public q60(c70 c70Var, s4.c0 c0Var) {
        this.f27523b = c70Var;
        this.f27522a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c70 c70Var = this.f27523b;
        c70.O(c70Var);
        if (c70Var.R && !c70Var.Q) {
            if (c70Var.S - this.f27522a.N0() < 10) {
                c70Var.X();
            }
        }
    }
}
