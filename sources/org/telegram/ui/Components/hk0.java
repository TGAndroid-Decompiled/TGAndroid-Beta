package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class hk0 extends s4.r0 {
    public final s4.b0 f26914a;
    public final nk0 f26915b;

    public hk0(nk0 nk0Var, s4.b0 b0Var) {
        this.f26915b = nk0Var;
        this.f26914a = b0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        nk0 nk0Var = this.f26915b;
        if (nk0Var.f28838w && nk0Var.f28839x && !nk0Var.v) {
            int N0 = this.f26914a.N0();
            loadCount = nk0Var.getLoadCount();
            if (N0 >= (nk0Var.f28834f.h() - 1) - loadCount) {
                nk0Var.c();
            }
        }
    }
}
