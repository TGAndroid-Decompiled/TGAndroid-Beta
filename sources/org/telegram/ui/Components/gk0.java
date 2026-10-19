package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class gk0 extends s4.r0 {
    public final s4.b0 f26609a;
    public final mk0 f26610b;

    public gk0(mk0 mk0Var, s4.b0 b0Var) {
        this.f26610b = mk0Var;
        this.f26609a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        mk0 mk0Var = this.f26610b;
        if (mk0Var.f28559w && mk0Var.f28560x && !mk0Var.v) {
            int N0 = this.f26609a.N0();
            loadCount = mk0Var.getLoadCount();
            if (N0 >= (mk0Var.f28555f.h() - 1) - loadCount) {
                mk0Var.c();
            }
        }
    }
}
