package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class qk0 extends s4.t0 {
    public final s4.d0 f30174a;
    public final wk0 f30175b;

    public qk0(wk0 wk0Var, s4.d0 d0Var) {
        this.f30175b = wk0Var;
        this.f30174a = d0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        wk0 wk0Var = this.f30175b;
        if (wk0Var.f32671w && wk0Var.f32672x && !wk0Var.v) {
            int N0 = this.f30174a.N0();
            loadCount = wk0Var.getLoadCount();
            if (N0 >= (wk0Var.f32667f.h() - 1) - loadCount) {
                wk0Var.c();
            }
        }
    }
}
