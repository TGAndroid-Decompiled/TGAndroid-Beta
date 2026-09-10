package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class o60 extends s4.s0 {
    public final s4.c0 f25684a;
    public final a70 f25685b;

    public o60(a70 a70Var, s4.c0 c0Var) {
        this.f25685b = a70Var;
        this.f25684a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        a70 a70Var = this.f25685b;
        a70.O(a70Var);
        if (a70Var.R && !a70Var.Q) {
            if (a70Var.S - this.f25684a.N0() < 10) {
                a70Var.X();
            }
        }
    }
}
