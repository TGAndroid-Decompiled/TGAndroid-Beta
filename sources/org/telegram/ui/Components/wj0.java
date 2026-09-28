package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class wj0 extends s4.s0 {
    public final s4.c0 f30015a;
    public final ck0 f30016b;

    public wj0(ck0 ck0Var, s4.c0 c0Var) {
        this.f30016b = ck0Var;
        this.f30015a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ck0 ck0Var = this.f30016b;
        if (ck0Var.f23335w && ck0Var.f23336x && !ck0Var.v) {
            int N0 = this.f30015a.N0();
            loadCount = ck0Var.getLoadCount();
            if (N0 >= (ck0Var.f23331f.h() - 1) - loadCount) {
                ck0Var.c();
            }
        }
    }
}
