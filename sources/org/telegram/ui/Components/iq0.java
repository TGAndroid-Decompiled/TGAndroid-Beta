package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class iq0 extends v4.s0 {
    public final zp0 f34721a;
    public final aq0 f34722b;
    public final xs0 f34723c;

    public iq0(xs0 xs0Var, zp0 zp0Var, aq0 aq0Var) {
        this.f34723c = xs0Var;
        this.f34721a = zp0Var;
        this.f34722b = aq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f34723c.f40366d1 = z9;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        xs0 xs0Var = this.f34723c;
        ms0[] ms0VarArr = xs0Var.f40418v1;
        aq0 aq0Var = this.f34722b;
        zp0 zp0Var = this.f34721a;
        xs0Var.O(zp0Var, (pj0) recyclerView, aq0Var);
        if (i10 != 0 && ((i12 = xs0Var.m0[0].E) == 0 || i12 == 5)) {
            ms0VarArr[0].f36047a.isEmpty();
        }
        if (i10 != 0 && ((i11 = zp0Var.E) == 0 || xs0.z0(i11))) {
            xs0.s(zp0Var, ms0VarArr, true);
        }
        zp0Var.h.L0(true);
        if (zp0Var.F != null) {
            zp0Var.invalidate();
        }
    }
}
