package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class sj0 extends f2.z0 {
    public final f2.i0 f28756a;
    public final yj0 f28757b;

    public sj0(yj0 yj0Var, f2.i0 i0Var) {
        this.f28757b = yj0Var;
        this.f28756a = i0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        yj0 yj0Var = this.f28757b;
        if (yj0Var.f31039w && yj0Var.f31040x && !yj0Var.v) {
            int N0 = this.f28756a.N0();
            loadCount = yj0Var.getLoadCount();
            if (N0 >= (yj0Var.f31035f.h() - 1) - loadCount) {
                yj0Var.c();
            }
        }
    }
}
