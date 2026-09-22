package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class wj0 extends s4.s0 {
    public final s4.c0 f30030a;
    public final ck0 f30031b;

    public wj0(ck0 ck0Var, s4.c0 c0Var) {
        this.f30031b = ck0Var;
        this.f30030a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ck0 ck0Var = this.f30031b;
        if (ck0Var.f23393w && ck0Var.f23394x && !ck0Var.v) {
            int N0 = this.f30030a.N0();
            loadCount = ck0Var.getLoadCount();
            if (N0 >= (ck0Var.f23389f.h() - 1) - loadCount) {
                ck0Var.c();
            }
        }
    }
}
