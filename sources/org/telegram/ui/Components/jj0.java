package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jj0 extends s4.s0 {
    public final s4.c0 f27545a;
    public final pj0 f27546b;

    public jj0(pj0 pj0Var, s4.c0 c0Var) {
        this.f27546b = pj0Var;
        this.f27545a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        pj0 pj0Var = this.f27546b;
        if (pj0Var.f29432w && pj0Var.f29433x && !pj0Var.v) {
            int N0 = this.f27545a.N0();
            loadCount = pj0Var.getLoadCount();
            if (N0 >= (pj0Var.f29428f.h() - 1) - loadCount) {
                pj0Var.c();
            }
        }
    }
}
