package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class a50 extends v4.s0 {
    public final v4.b0 f31681a;
    public final m50 f31682b;

    public a50(m50 m50Var, v4.b0 b0Var) {
        this.f31682b = m50Var;
        this.f31681a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        m50 m50Var = this.f31682b;
        m50.I0(m50Var);
        if (m50Var.I1 && !m50Var.H1) {
            if (m50Var.J1 - this.f31681a.N0() < 10) {
                m50Var.K0();
            }
        }
    }
}
