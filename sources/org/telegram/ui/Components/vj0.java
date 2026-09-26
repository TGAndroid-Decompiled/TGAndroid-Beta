package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class vj0 extends s4.s0 {
    public final s4.c0 f29113a;
    public final bk0 f29114b;

    public vj0(bk0 bk0Var, s4.c0 c0Var) {
        this.f29114b = bk0Var;
        this.f29113a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        bk0 bk0Var = this.f29114b;
        if (bk0Var.f23053w && bk0Var.f23054x && !bk0Var.v) {
            int N0 = this.f29113a.N0();
            loadCount = bk0Var.getLoadCount();
            if (N0 >= (bk0Var.f23049f.h() - 1) - loadCount) {
                bk0Var.c();
            }
        }
    }
}
