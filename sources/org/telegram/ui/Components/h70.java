package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class h70 extends s4.t0 {
    public final s4.d0 f26986a;
    public final t70 f26987b;

    public h70(t70 t70Var, s4.d0 d0Var) {
        this.f26987b = t70Var;
        this.f26986a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t70 t70Var = this.f26987b;
        t70.P(t70Var);
        if (t70Var.R && !t70Var.Q) {
            if (t70Var.S - this.f26986a.N0() < 10) {
                t70Var.Y();
            }
        }
    }
}
