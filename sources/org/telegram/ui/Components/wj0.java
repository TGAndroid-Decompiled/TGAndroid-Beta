package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class wj0 extends s4.s0 {
    public final s4.c0 f32658a;
    public final ck0 f32659b;

    public wj0(ck0 ck0Var, s4.c0 c0Var) {
        this.f32659b = ck0Var;
        this.f32658a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ck0 ck0Var = this.f32659b;
        if (ck0Var.f25462w && ck0Var.f25463x && !ck0Var.v) {
            int N0 = this.f32658a.N0();
            loadCount = ck0Var.getLoadCount();
            if (N0 >= (ck0Var.f25458f.h() - 1) - loadCount) {
                ck0Var.c();
            }
        }
    }
}
