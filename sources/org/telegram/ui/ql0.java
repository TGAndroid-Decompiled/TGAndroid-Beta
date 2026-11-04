package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ql0 extends u4.t0 {
    public final int f48911a;
    public final wl0 f48912b;

    public ql0(wl0 wl0Var, int i3) {
        this.f48912b = wl0Var;
        this.f48911a = i3;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        ci.v8 v8Var;
        wl0 wl0Var = this.f48912b;
        cm0 cm0Var = wl0Var.f51221q0;
        wl0Var.h();
        if (wl0Var.L != null) {
            if (wl0Var.K != null && wl0Var.c()) {
                wl0Var.K.g(false);
                return;
            }
            return;
        }
        if (this.f48911a == 1) {
            v8Var = cm0Var.f44392c;
        } else {
            v8Var = cm0Var.f44390b;
        }
        if (v8Var != null && wl0Var.c()) {
            v8Var.a();
        }
    }
}
