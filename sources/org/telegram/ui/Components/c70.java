package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class c70 extends s4.u0 {
    public final s4.c0 f27085a;
    public final o70 f27086b;

    public c70(o70 o70Var, s4.c0 c0Var) {
        this.f27086b = o70Var;
        this.f27085a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        o70 o70Var = this.f27086b;
        o70.O(o70Var);
        if (o70Var.R && !o70Var.Q) {
            if (o70Var.S - this.f27085a.N0() < 10) {
                o70Var.Y();
            }
        }
    }
}
