package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class b60 extends f2.a1 {
    public final f2.j0 f26984a;
    public final n60 f26985b;

    public b60(n60 n60Var, f2.j0 j0Var) {
        this.f26985b = n60Var;
        this.f26984a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n60 n60Var = this.f26985b;
        n60.O(n60Var);
        if (n60Var.N && !n60Var.M) {
            if (n60Var.O - this.f26984a.N0() < 10) {
                n60Var.X();
            }
        }
    }
}
