package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ok0 extends s4.t0 {
    public final s4.d0 f29506a;
    public final uk0 f29507b;

    public ok0(uk0 uk0Var, s4.d0 d0Var) {
        this.f29507b = uk0Var;
        this.f29506a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        uk0 uk0Var = this.f29507b;
        if (uk0Var.f31529w && uk0Var.f31530x && !uk0Var.v) {
            int N0 = this.f29506a.N0();
            loadCount = uk0Var.getLoadCount();
            if (N0 >= (uk0Var.f31525f.h() - 1) - loadCount) {
                uk0Var.c();
            }
        }
    }
}
