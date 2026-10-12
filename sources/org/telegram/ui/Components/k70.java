package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class k70 extends s4.t0 {
    public final s4.d0 f27771a;
    public final w70 f27772b;

    public k70(w70 w70Var, s4.d0 d0Var) {
        this.f27772b = w70Var;
        this.f27771a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        w70 w70Var = this.f27772b;
        w70.P(w70Var);
        if (w70Var.R && !w70Var.Q) {
            if (w70Var.S - this.f27771a.N0() < 10) {
                w70Var.Y();
            }
        }
    }
}
