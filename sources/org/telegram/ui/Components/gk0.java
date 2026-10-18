package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class gk0 extends s4.r0 {
    public final s4.b0 f26587a;
    public final mk0 f26588b;

    public gk0(mk0 mk0Var, s4.b0 b0Var) {
        this.f26588b = mk0Var;
        this.f26587a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        mk0 mk0Var = this.f26588b;
        if (mk0Var.f28551w && mk0Var.f28552x && !mk0Var.v) {
            int N0 = this.f26587a.N0();
            loadCount = mk0Var.getLoadCount();
            if (N0 >= (mk0Var.f28547f.h() - 1) - loadCount) {
                mk0Var.c();
            }
        }
    }
}
