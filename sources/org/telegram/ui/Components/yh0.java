package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class yh0 extends v4.u0 {
    public final v4.c0 f42501a;
    public final ei0 f42502b;

    public yh0(ei0 ei0Var, v4.c0 c0Var) {
        this.f42502b = ei0Var;
        this.f42501a = c0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        ei0 ei0Var = this.f42502b;
        if (ei0Var.f34719x && ei0Var.f34720y && !ei0Var.f34718w) {
            int N0 = this.f42501a.N0();
            loadCount = ei0Var.getLoadCount();
            if (N0 >= (ei0Var.f34714f.b() - 1) - loadCount) {
                ei0Var.c();
            }
        }
    }
}
