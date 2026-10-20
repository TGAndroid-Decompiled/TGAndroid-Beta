package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class z60 extends s4.r0 {
    public final s4.b0 f32850a;
    public final l70 f32851b;

    public z60(l70 l70Var, s4.b0 b0Var) {
        this.f32851b = l70Var;
        this.f32850a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l70 l70Var = this.f32851b;
        l70.P(l70Var);
        if (l70Var.R && !l70Var.Q) {
            if (l70Var.S - this.f32850a.N0() < 10) {
                l70Var.Y();
            }
        }
    }
}
