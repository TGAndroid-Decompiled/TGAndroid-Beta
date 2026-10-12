package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class rk0 extends s4.t0 {
    public final s4.d0 f30171a;
    public final xk0 f30172b;

    public rk0(xk0 xk0Var, s4.d0 d0Var) {
        this.f30172b = xk0Var;
        this.f30171a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        xk0 xk0Var = this.f30172b;
        if (xk0Var.f32792w && xk0Var.f32793x && !xk0Var.v) {
            int N0 = this.f30171a.N0();
            loadCount = xk0Var.getLoadCount();
            if (N0 >= (xk0Var.f32788f.h() - 1) - loadCount) {
                xk0Var.c();
            }
        }
    }
}
