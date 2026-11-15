package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class d50 extends v4.t0 {
    public final v4.b0 f33842a;
    public final p50 f33843b;

    public d50(p50 p50Var, v4.b0 b0Var) {
        this.f33843b = p50Var;
        this.f33842a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        p50 p50Var = this.f33843b;
        p50.I0(p50Var);
        if (p50Var.M1 && !p50Var.L1) {
            if (p50Var.N1 - this.f33842a.N0() < 10) {
                p50Var.K0();
            }
        }
    }
}
