package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class o50 extends f2.d1 {
    public final f2.m0 f31295a;
    public final a60 f31296b;

    public o50(a60 a60Var, f2.m0 m0Var) {
        this.f31296b = a60Var;
        this.f31295a = m0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        a60 a60Var = this.f31296b;
        a60.N(a60Var);
        if (a60Var.N && !a60Var.M) {
            if (a60Var.O - this.f31295a.N0() < 10) {
                a60Var.W();
            }
        }
    }
}
