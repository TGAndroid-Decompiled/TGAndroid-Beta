package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class s60 extends s4.s0 {
    public final s4.c0 f28139a;
    public final e70 f28140b;

    public s60(e70 e70Var, s4.c0 c0Var) {
        this.f28140b = e70Var;
        this.f28139a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e70 e70Var = this.f28140b;
        e70.O(e70Var);
        if (e70Var.R && !e70Var.Q) {
            if (e70Var.S - this.f28139a.N0() < 10) {
                e70Var.X();
            }
        }
    }
}
