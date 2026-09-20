package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class n60 extends s4.s0 {
    public final s4.c0 f26596a;
    public final z60 f26597b;

    public n60(z60 z60Var, s4.c0 c0Var) {
        this.f26597b = z60Var;
        this.f26596a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        z60 z60Var = this.f26597b;
        z60.O(z60Var);
        if (z60Var.R && !z60Var.Q) {
            if (z60Var.S - this.f26596a.N0() < 10) {
                z60Var.X();
            }
        }
    }
}
