package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class i60 extends f2.a1 {
    public final f2.j0 f27677a;
    public final u60 f27678b;

    public i60(u60 u60Var, f2.j0 j0Var) {
        this.f27678b = u60Var;
        this.f27677a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u60 u60Var = this.f27678b;
        u60.O(u60Var);
        if (u60Var.O && !u60Var.N) {
            if (u60Var.P - this.f27677a.N0() < 10) {
                u60Var.X();
            }
        }
    }
}
