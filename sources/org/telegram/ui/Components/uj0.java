package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class uj0 extends f2.a1 {
    public final f2.j0 f31685a;
    public final ak0 f31686b;

    public uj0(ak0 ak0Var, f2.j0 j0Var) {
        this.f31686b = ak0Var;
        this.f31685a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ak0 ak0Var = this.f31686b;
        if (ak0Var.f25279w && ak0Var.f25280x && !ak0Var.v) {
            int N0 = this.f31685a.N0();
            loadCount = ak0Var.getLoadCount();
            if (N0 >= (ak0Var.f25275f.h() - 1) - loadCount) {
                ak0Var.c();
            }
        }
    }
}
