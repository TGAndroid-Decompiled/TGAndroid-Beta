package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

public final class aj0 extends f2.b1 {

    public final f2.k0 f26752a;

    public final gj0 f26753b;

    public aj0(gj0 gj0Var, f2.k0 k0Var) {
        this.f26753b = gj0Var;
        this.f26752a = k0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        gj0 gj0Var = this.f26753b;
        if (!gj0Var.f28731w || !gj0Var.f28732x || gj0Var.v || this.f26752a.N0() < (gj0Var.f28727f.h() - 1) - gj0Var.getLoadCount()) {
            return;
        }
        gj0Var.c();
    }
}
