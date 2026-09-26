package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class uj0 extends s4.s0 {
    public final s4.c0 f28801a;
    public final ak0 f28802b;

    public uj0(ak0 ak0Var, s4.c0 c0Var) {
        this.f28802b = ak0Var;
        this.f28801a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ak0 ak0Var = this.f28802b;
        if (ak0Var.f22720w && ak0Var.f22721x && !ak0Var.v) {
            int N0 = this.f28801a.N0();
            loadCount = ak0Var.getLoadCount();
            if (N0 >= (ak0Var.f22716f.h() - 1) - loadCount) {
                ak0Var.c();
            }
        }
    }
}
