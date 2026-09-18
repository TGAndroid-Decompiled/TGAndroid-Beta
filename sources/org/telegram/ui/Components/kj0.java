package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kj0 extends s4.s0 {
    public final s4.c0 f25640a;
    public final qj0 f25641b;

    public kj0(qj0 qj0Var, s4.c0 c0Var) {
        this.f25641b = qj0Var;
        this.f25640a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        qj0 qj0Var = this.f25641b;
        if (qj0Var.f27334w && qj0Var.f27335x && !qj0Var.v) {
            int N0 = this.f25640a.N0();
            loadCount = qj0Var.getLoadCount();
            if (N0 >= (qj0Var.f27330f.h() - 1) - loadCount) {
                qj0Var.c();
            }
        }
    }
}
