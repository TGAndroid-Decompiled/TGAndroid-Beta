package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class w40 extends u4.t0 {
    public final u4.b0 f39883a;
    public final i50 f39884b;

    public w40(i50 i50Var, u4.b0 b0Var) {
        this.f39884b = i50Var;
        this.f39883a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        i50 i50Var = this.f39884b;
        i50.I0(i50Var);
        if (i50Var.J1 && !i50Var.I1) {
            if (i50Var.K1 - this.f39883a.N0() < 10) {
                i50Var.K0();
            }
        }
    }
}
