package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class uj0 extends s4.s0 {
    public final s4.c0 f28720a;
    public final ak0 f28721b;

    public uj0(ak0 ak0Var, s4.c0 c0Var) {
        this.f28721b = ak0Var;
        this.f28720a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ak0 ak0Var = this.f28721b;
        if (ak0Var.f22645w && ak0Var.f22646x && !ak0Var.v) {
            int N0 = this.f28720a.N0();
            loadCount = ak0Var.getLoadCount();
            if (N0 >= (ak0Var.f22641f.h() - 1) - loadCount) {
                ak0Var.c();
            }
        }
    }
}
