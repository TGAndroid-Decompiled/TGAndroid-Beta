package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class g60 extends f2.z0 {
    public final f2.i0 f25062a;
    public final s60 f25063b;

    public g60(s60 s60Var, f2.i0 i0Var) {
        this.f25063b = s60Var;
        this.f25062a = i0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s60 s60Var = this.f25063b;
        s60.O(s60Var);
        if (s60Var.O && !s60Var.N) {
            if (s60Var.P - this.f25062a.N0() < 10) {
                s60Var.X();
            }
        }
    }
}
