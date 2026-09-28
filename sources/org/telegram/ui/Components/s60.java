package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class s60 extends s4.s0 {
    public final s4.c0 f28141a;
    public final e70 f28142b;

    public s60(e70 e70Var, s4.c0 c0Var) {
        this.f28142b = e70Var;
        this.f28141a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e70 e70Var = this.f28142b;
        e70.O(e70Var);
        if (e70Var.R && !e70Var.Q) {
            if (e70Var.S - this.f28141a.N0() < 10) {
                e70Var.X();
            }
        }
    }
}
