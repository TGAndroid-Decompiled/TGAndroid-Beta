package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class tq0 extends v4.u0 {
    public final jq0 f40132a;
    public final kq0 f40133b;
    public final it0 f40134c;

    public tq0(it0 it0Var, jq0 jq0Var, kq0 kq0Var) {
        this.f40134c = it0Var;
        this.f40132a = jq0Var;
        this.f40133b = kq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40134c.f36107e1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        it0 it0Var = this.f40134c;
        xs0[] xs0VarArr = it0Var.f36160w1;
        kq0 kq0Var = this.f40133b;
        jq0 jq0Var = this.f40132a;
        it0Var.O(jq0Var, (ek0) recyclerView, kq0Var);
        if (i10 != 0 && ((i12 = it0Var.f36133n0[0].F) == 0 || i12 == 5)) {
            xs0VarArr[0].f42165a.isEmpty();
        }
        if (i10 != 0 && ((i11 = jq0Var.F) == 0 || it0.z0(i11))) {
            it0.s(jq0Var, xs0VarArr, true);
        }
        jq0Var.h.L0(true);
        if (jq0Var.G != null) {
            jq0Var.invalidate();
        }
    }
}
