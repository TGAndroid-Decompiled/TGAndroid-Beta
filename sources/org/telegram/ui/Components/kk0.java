package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class kk0 extends s4.u0 {
    public final s4.c0 f29978a;
    public final qk0 f29979b;

    public kk0(qk0 qk0Var, s4.c0 c0Var) {
        this.f29979b = qk0Var;
        this.f29978a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        qk0 qk0Var = this.f29979b;
        if (qk0Var.f31927w && qk0Var.f31928x && !qk0Var.v) {
            int N0 = this.f29978a.N0();
            loadCount = qk0Var.getLoadCount();
            if (N0 >= (qk0Var.f31923f.h() - 1) - loadCount) {
                qk0Var.c();
            }
        }
    }
}
