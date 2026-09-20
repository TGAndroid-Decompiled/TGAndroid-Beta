package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class tj0 extends s4.s0 {
    public final s4.c0 f28383a;
    public final zj0 f28384b;

    public tj0(zj0 zj0Var, s4.c0 c0Var) {
        this.f28384b = zj0Var;
        this.f28383a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        zj0 zj0Var = this.f28384b;
        if (zj0Var.f30847w && zj0Var.f30848x && !zj0Var.v) {
            int N0 = this.f28383a.N0();
            loadCount = zj0Var.getLoadCount();
            if (N0 >= (zj0Var.f30843f.h() - 1) - loadCount) {
                zj0Var.c();
            }
        }
    }
}
