package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ai0 extends v4.u0 {
    public final v4.c0 f33533a;
    public final gi0 f33534b;

    public ai0(gi0 gi0Var, v4.c0 c0Var) {
        this.f33534b = gi0Var;
        this.f33533a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        gi0 gi0Var = this.f33534b;
        if (gi0Var.f35589x && gi0Var.f35590y && !gi0Var.f35588w) {
            int N0 = this.f33533a.N0();
            loadCount = gi0Var.getLoadCount();
            if (N0 >= (gi0Var.f35584f.b() - 1) - loadCount) {
                gi0Var.c();
            }
        }
    }
}
