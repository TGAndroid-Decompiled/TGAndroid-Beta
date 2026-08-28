package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class yi0 extends f2.d1 {
    public final f2.m0 f34978a;
    public final ej0 f34979b;

    public yi0(ej0 ej0Var, f2.m0 m0Var) {
        this.f34979b = ej0Var;
        this.f34978a = m0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int loadCount;
        ej0 ej0Var = this.f34979b;
        if (ej0Var.f28045w && ej0Var.f28046x && !ej0Var.v) {
            int N0 = this.f34978a.N0();
            loadCount = ej0Var.getLoadCount();
            if (N0 >= (ej0Var.f28041f.h() - 1) - loadCount) {
                ej0Var.c();
            }
        }
    }
}
