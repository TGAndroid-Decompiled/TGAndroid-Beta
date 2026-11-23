package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class uq0 extends v4.u0 {
    public final kq0 f40561a;
    public final lq0 f40562b;
    public final jt0 f40563c;

    public uq0(jt0 jt0Var, kq0 kq0Var, lq0 lq0Var) {
        this.f40563c = jt0Var;
        this.f40561a = kq0Var;
        this.f40562b = lq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40563c.f36624e1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        jt0 jt0Var = this.f40563c;
        ys0[] ys0VarArr = jt0Var.f36677w1;
        lq0 lq0Var = this.f40562b;
        kq0 kq0Var = this.f40561a;
        jt0Var.O(kq0Var, (ek0) recyclerView, lq0Var);
        if (i10 != 0 && ((i12 = jt0Var.f36650n0[0].F) == 0 || i12 == 5)) {
            ys0VarArr[0].f42513a.isEmpty();
        }
        if (i10 != 0 && ((i11 = kq0Var.F) == 0 || jt0.z0(i11))) {
            jt0.s(kq0Var, ys0VarArr, true);
        }
        kq0Var.h.L0(true);
        if (kq0Var.G != null) {
            kq0Var.invalidate();
        }
    }
}
