package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class y60 extends s4.r0 {
    public final s4.b0 f32827a;
    public final k70 f32828b;

    public y60(k70 k70Var, s4.b0 b0Var) {
        this.f32828b = k70Var;
        this.f32827a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k70 k70Var = this.f32828b;
        k70.O(k70Var);
        if (k70Var.R && !k70Var.Q) {
            if (k70Var.S - this.f32827a.N0() < 10) {
                k70Var.Y();
            }
        }
    }
}
