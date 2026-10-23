package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class a70 extends s4.r0 {
    public final s4.b0 f24656a;
    public final m70 f24657b;

    public a70(m70 m70Var, s4.b0 b0Var) {
        this.f24657b = m70Var;
        this.f24656a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m70 m70Var = this.f24657b;
        m70.O(m70Var);
        if (m70Var.R && !m70Var.Q) {
            if (m70Var.S - this.f24656a.N0() < 10) {
                m70Var.Y();
            }
        }
    }
}
