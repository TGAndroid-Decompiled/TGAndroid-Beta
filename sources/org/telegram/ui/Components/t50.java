package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

public final class t50 extends f2.b1 {

    public final f2.k0 f32653a;

    public final f60 f32654b;

    public t50(f60 f60Var, f2.k0 k0Var) {
        this.f32654b = f60Var;
        this.f32653a = k0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f60 f60Var = this.f32654b;
        f60.O(f60Var);
        if (!f60Var.N || f60Var.M) {
            return;
        }
        if (f60Var.O - this.f32653a.N0() < 10) {
            f60Var.X();
        }
    }
}
