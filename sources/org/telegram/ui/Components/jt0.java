package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jt0 extends s4.u0 {
    public final at0 f29720a;
    public final bt0 f29721b;
    public final aw0 f29722c;

    public jt0(aw0 aw0Var, at0 at0Var, bt0 bt0Var) {
        this.f29722c = aw0Var;
        this.f29720a = at0Var;
        this.f29721b = bt0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29722c.f26648d1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        aw0 aw0Var = this.f29722c;
        pv0[] pv0VarArr = aw0Var.f26698v1;
        bt0 bt0Var = this.f29721b;
        at0 at0Var = this.f29720a;
        aw0Var.M(at0Var, (mm0) recyclerView, bt0Var);
        if (i11 != 0 && ((i13 = aw0Var.m0[0].E) == 0 || i13 == 5)) {
            pv0VarArr[0].f31706a.isEmpty();
        }
        if (i11 != 0 && ((i12 = at0Var.E) == 0 || aw0.w0(i12))) {
            aw0.t(at0Var, pv0VarArr, true);
        }
        at0Var.h.L0(true);
        if (at0Var.F != null) {
            at0Var.invalidate();
        }
    }
}
