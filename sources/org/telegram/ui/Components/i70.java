package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class i70 extends s4.t0 {
    public final s4.d0 f27204a;
    public final u70 f27205b;

    public i70(u70 u70Var, s4.d0 d0Var) {
        this.f27205b = u70Var;
        this.f27204a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u70 u70Var = this.f27205b;
        u70.P(u70Var);
        if (u70Var.R && !u70Var.Q) {
            if (u70Var.S - this.f27204a.N0() < 10) {
                u70Var.Y();
            }
        }
    }
}
