package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class tj0 extends f2.a1 {
    public final f2.j0 f31366a;
    public final zj0 f31367b;

    public tj0(zj0 zj0Var, f2.j0 j0Var) {
        this.f31367b = zj0Var;
        this.f31366a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        zj0 zj0Var = this.f31367b;
        if (zj0Var.f33957w && zj0Var.f33958x && !zj0Var.v) {
            int N0 = this.f31366a.N0();
            loadCount = zj0Var.getLoadCount();
            if (N0 >= (zj0Var.f33953f.h() - 1) - loadCount) {
                zj0Var.c();
            }
        }
    }
}
