package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jj0 extends f2.a1 {
    public final f2.j0 f29672a;
    public final pj0 f29673b;

    public jj0(pj0 pj0Var, f2.j0 j0Var) {
        this.f29673b = pj0Var;
        this.f29672a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        pj0 pj0Var = this.f29673b;
        if (pj0Var.f31694w && pj0Var.f31695x && !pj0Var.v) {
            int N0 = this.f29672a.N0();
            loadCount = pj0Var.getLoadCount();
            if (N0 >= (pj0Var.f31690f.h() - 1) - loadCount) {
                pj0Var.c();
            }
        }
    }
}
