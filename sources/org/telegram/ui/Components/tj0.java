package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class tj0 extends s4.s0 {
    public final s4.c0 f27418a;
    public final zj0 f27419b;

    public tj0(zj0 zj0Var, s4.c0 c0Var) {
        this.f27419b = zj0Var;
        this.f27418a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        zj0 zj0Var = this.f27419b;
        if (zj0Var.f29708w && zj0Var.f29709x && !zj0Var.v) {
            int N0 = this.f27418a.N0();
            loadCount = zj0Var.getLoadCount();
            if (N0 >= (zj0Var.f29704f.h() - 1) - loadCount) {
                zj0Var.c();
            }
        }
    }
}
