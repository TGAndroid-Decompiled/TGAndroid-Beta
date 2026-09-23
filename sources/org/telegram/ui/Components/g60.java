package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class g60 extends s4.s0 {
    public final s4.c0 f24175a;
    public final s60 f24176b;

    public g60(s60 s60Var, s4.c0 c0Var) {
        this.f24176b = s60Var;
        this.f24175a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s60 s60Var = this.f24176b;
        s60.O(s60Var);
        if (s60Var.R && !s60Var.Q) {
            if (s60Var.S - this.f24175a.N0() < 10) {
                s60Var.X();
            }
        }
    }
}
