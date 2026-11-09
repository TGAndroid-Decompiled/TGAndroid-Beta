package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class b50 extends v4.s0 {
    public final v4.b0 f32105a;
    public final n50 f32106b;

    public b50(n50 n50Var, v4.b0 b0Var) {
        this.f32106b = n50Var;
        this.f32105a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        n50 n50Var = this.f32106b;
        n50.I0(n50Var);
        if (n50Var.I1 && !n50Var.H1) {
            if (n50Var.J1 - this.f32105a.N0() < 10) {
                n50Var.K0();
            }
        }
    }
}
