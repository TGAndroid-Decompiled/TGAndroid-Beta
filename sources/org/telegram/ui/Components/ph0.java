package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ph0 extends v4.t0 {
    public final v4.b0 f38304a;
    public final vh0 f38305b;

    public ph0(vh0 vh0Var, v4.b0 b0Var) {
        this.f38305b = vh0Var;
        this.f38304a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        vh0 vh0Var = this.f38305b;
        if (vh0Var.f40425x && vh0Var.f40426y && !vh0Var.f40424w) {
            int N0 = this.f38304a.N0();
            loadCount = vh0Var.getLoadCount();
            if (N0 >= (vh0Var.f40420f.b() - 1) - loadCount) {
                vh0Var.c();
            }
        }
    }
}
