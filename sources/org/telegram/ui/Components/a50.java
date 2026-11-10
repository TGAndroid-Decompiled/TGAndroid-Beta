package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class a50 extends v4.s0 {
    public final v4.b0 f31710a;
    public final m50 f31711b;

    public a50(m50 m50Var, v4.b0 b0Var) {
        this.f31711b = m50Var;
        this.f31710a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        m50 m50Var = this.f31711b;
        m50.I0(m50Var);
        if (m50Var.L1 && !m50Var.K1) {
            if (m50Var.M1 - this.f31710a.N0() < 10) {
                m50Var.K0();
            }
        }
    }
}
