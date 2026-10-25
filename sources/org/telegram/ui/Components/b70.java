package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class b70 extends s4.u0 {
    public final s4.c0 f26768a;
    public final n70 f26769b;

    public b70(n70 n70Var, s4.c0 c0Var) {
        this.f26769b = n70Var;
        this.f26768a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n70 n70Var = this.f26769b;
        n70.O(n70Var);
        if (n70Var.R && !n70Var.Q) {
            if (n70Var.S - this.f26768a.N0() < 10) {
                n70Var.Y();
            }
        }
    }
}
