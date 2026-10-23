package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ct0 extends s4.r0 {
    public final ts0 f25423a;
    public final us0 f25424b;
    public final xv0 f25425c;

    public ct0(xv0 xv0Var, ts0 ts0Var, us0 us0Var) {
        this.f25425c = xv0Var;
        this.f25423a = ts0Var;
        this.f25424b = us0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25425c.f32663b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        xv0 xv0Var = this.f25425c;
        mv0[] mv0VarArr = xv0Var.f32707t1;
        us0 us0Var = this.f25424b;
        ts0 ts0Var = this.f25423a;
        xv0Var.H(ts0Var, (mm0) recyclerView, us0Var);
        if (i11 != 0 && ((i13 = xv0Var.f32687k0[0].F) == 0 || i13 == 5)) {
            mv0VarArr[0].f28757a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ts0Var.F) == 0 || xv0.r0(i12))) {
            xv0.r(ts0Var, mv0VarArr, true);
        }
        ts0Var.h.L0(true);
        if (ts0Var.G != null) {
            ts0Var.invalidate();
        }
        xv0Var.q0();
    }
}
