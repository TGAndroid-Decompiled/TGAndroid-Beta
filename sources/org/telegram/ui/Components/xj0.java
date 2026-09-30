package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class xj0 extends s4.s0 {
    public final s4.c0 f30343a;
    public final dk0 f30344b;

    public xj0(dk0 dk0Var, s4.c0 c0Var) {
        this.f30344b = dk0Var;
        this.f30343a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        dk0 dk0Var = this.f30344b;
        if (dk0Var.f23672w && dk0Var.f23673x && !dk0Var.v) {
            int N0 = this.f30343a.N0();
            loadCount = dk0Var.getLoadCount();
            if (N0 >= (dk0Var.f23668f.h() - 1) - loadCount) {
                dk0Var.c();
            }
        }
    }
}
