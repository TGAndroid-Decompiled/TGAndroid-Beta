package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class gk0 extends s4.r0 {
    public final s4.b0 f26580a;
    public final mk0 f26581b;

    public gk0(mk0 mk0Var, s4.b0 b0Var) {
        this.f26581b = mk0Var;
        this.f26580a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        mk0 mk0Var = this.f26581b;
        if (mk0Var.f28544w && mk0Var.f28545x && !mk0Var.v) {
            int N0 = this.f26580a.N0();
            loadCount = mk0Var.getLoadCount();
            if (N0 >= (mk0Var.f28540f.h() - 1) - loadCount) {
                mk0Var.c();
            }
        }
    }
}
