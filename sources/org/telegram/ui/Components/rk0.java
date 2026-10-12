package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class rk0 extends s4.t0 {
    public final s4.d0 f30175a;
    public final xk0 f30176b;

    public rk0(xk0 xk0Var, s4.d0 d0Var) {
        this.f30176b = xk0Var;
        this.f30175a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        xk0 xk0Var = this.f30176b;
        if (xk0Var.f32802w && xk0Var.f32803x && !xk0Var.v) {
            int N0 = this.f30175a.N0();
            loadCount = xk0Var.getLoadCount();
            if (N0 >= (xk0Var.f32798f.h() - 1) - loadCount) {
                xk0Var.c();
            }
        }
    }
}
