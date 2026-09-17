package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jj0 extends s4.s0 {
    public final s4.c0 f27519a;
    public final pj0 f27520b;

    public jj0(pj0 pj0Var, s4.c0 c0Var) {
        this.f27520b = pj0Var;
        this.f27519a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        pj0 pj0Var = this.f27520b;
        if (pj0Var.f29406w && pj0Var.f29407x && !pj0Var.v) {
            int N0 = this.f27519a.N0();
            loadCount = pj0Var.getLoadCount();
            if (N0 >= (pj0Var.f29402f.h() - 1) - loadCount) {
                pj0Var.c();
            }
        }
    }
}
