package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class k70 extends s4.t0 {
    public final s4.d0 f27774a;
    public final w70 f27775b;

    public k70(w70 w70Var, s4.d0 d0Var) {
        this.f27775b = w70Var;
        this.f27774a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        w70 w70Var = this.f27775b;
        w70.P(w70Var);
        if (w70Var.R && !w70Var.Q) {
            if (w70Var.S - this.f27774a.N0() < 10) {
                w70Var.Y();
            }
        }
    }
}
