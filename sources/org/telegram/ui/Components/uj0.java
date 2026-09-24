package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class uj0 extends s4.s0 {
    public final s4.c0 f28789a;
    public final ak0 f28790b;

    public uj0(ak0 ak0Var, s4.c0 c0Var) {
        this.f28790b = ak0Var;
        this.f28789a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ak0 ak0Var = this.f28790b;
        if (ak0Var.f22702w && ak0Var.f22703x && !ak0Var.v) {
            int N0 = this.f28789a.N0();
            loadCount = ak0Var.getLoadCount();
            if (N0 >= (ak0Var.f22698f.h() - 1) - loadCount) {
                ak0Var.c();
            }
        }
    }
}
