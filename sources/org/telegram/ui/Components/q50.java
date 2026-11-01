package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class q50 extends s4.s0 {
    public final s4.a0 f29634a;
    public final c60 f29635b;

    public q50(c60 c60Var, s4.a0 a0Var) {
        this.f29635b = c60Var;
        this.f29634a = a0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c60 c60Var = this.f29635b;
        c60.I0(c60Var);
        if (c60Var.I1 && !c60Var.H1) {
            if (c60Var.J1 - this.f29634a.N0() < 10) {
                c60Var.K0();
            }
        }
    }
}
