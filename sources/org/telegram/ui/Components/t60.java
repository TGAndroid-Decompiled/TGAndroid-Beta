package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class t60 extends s4.s0 {
    public final s4.c0 f28434a;
    public final f70 f28435b;

    public t60(f70 f70Var, s4.c0 c0Var) {
        this.f28435b = f70Var;
        this.f28434a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f70 f70Var = this.f28435b;
        f70.O(f70Var);
        if (f70Var.R && !f70Var.Q) {
            if (f70Var.S - this.f28434a.N0() < 10) {
                f70Var.X();
            }
        }
    }
}
