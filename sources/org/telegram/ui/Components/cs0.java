package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class cs0 extends f2.a1 {
    public final tr0 f26035a;
    public final ur0 f26036b;
    public final yu0 f26037c;

    public cs0(yu0 yu0Var, tr0 tr0Var, ur0 ur0Var) {
        this.f26037c = yu0Var;
        this.f26035a = tr0Var;
        this.f26036b = ur0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f26037c.Y0 = z4;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        yu0 yu0Var = this.f26037c;
        nu0[] nu0VarArr = yu0Var.f33643q1;
        ur0 ur0Var = this.f26036b;
        tr0 tr0Var = this.f26035a;
        yu0Var.G(tr0Var, (sl0) recyclerView, ur0Var);
        if (i11 != 0 && ((i13 = yu0Var.f33625h0[0].C) == 0 || i13 == 5)) {
            nu0VarArr[0].f29580a.isEmpty();
        }
        if (i11 != 0 && ((i12 = tr0Var.C) == 0 || yu0.p0(i12))) {
            yu0.q(tr0Var, nu0VarArr, true);
        }
        tr0Var.h.K0(true);
        if (tr0Var.D != null) {
            tr0Var.invalidate();
        }
        yu0Var.o0();
    }
}
