package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kj0 extends s4.s0 {
    public final s4.c0 f25612a;
    public final qj0 f25613b;

    public kj0(qj0 qj0Var, s4.c0 c0Var) {
        this.f25613b = qj0Var;
        this.f25612a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        qj0 qj0Var = this.f25613b;
        if (qj0Var.f27371w && qj0Var.f27372x && !qj0Var.v) {
            int N0 = this.f25612a.N0();
            loadCount = qj0Var.getLoadCount();
            if (N0 >= (qj0Var.f27367f.h() - 1) - loadCount) {
                qj0Var.c();
            }
        }
    }
}
