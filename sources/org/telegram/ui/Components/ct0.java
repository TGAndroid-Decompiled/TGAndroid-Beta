package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ct0 extends s4.r0 {
    public final ts0 f24210a;
    public final us0 f24211b;
    public final xv0 f24212c;

    public ct0(xv0 xv0Var, ts0 ts0Var, us0 us0Var) {
        this.f24212c = xv0Var;
        this.f24210a = ts0Var;
        this.f24211b = us0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24212c.f31343b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        xv0 xv0Var = this.f24212c;
        mv0[] mv0VarArr = xv0Var.f31384t1;
        us0 us0Var = this.f24211b;
        ts0 ts0Var = this.f24210a;
        xv0Var.G(ts0Var, (mm0) recyclerView, us0Var);
        if (i11 != 0 && ((i13 = xv0Var.f31364k0[0].F) == 0 || i13 == 5)) {
            mv0VarArr[0].f27508a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ts0Var.F) == 0 || xv0.p0(i12))) {
            xv0.q(ts0Var, mv0VarArr, true);
        }
        ts0Var.h.L0(true);
        if (ts0Var.G != null) {
            ts0Var.invalidate();
        }
        xv0Var.o0();
    }
}
