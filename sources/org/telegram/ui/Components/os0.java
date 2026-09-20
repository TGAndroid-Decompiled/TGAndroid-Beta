package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class os0 extends s4.s0 {
    public final fs0 f27036a;
    public final gs0 f27037b;
    public final jv0 f27038c;

    public os0(jv0 jv0Var, fs0 fs0Var, gs0 gs0Var) {
        this.f27038c = jv0Var;
        this.f27036a = fs0Var;
        this.f27037b = gs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27038c.f25483b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        jv0 jv0Var = this.f27038c;
        yu0[] yu0VarArr = jv0Var.f25524t1;
        gs0 gs0Var = this.f27037b;
        fs0 fs0Var = this.f27036a;
        jv0Var.G(fs0Var, (vl0) recyclerView, gs0Var);
        if (i11 != 0 && ((i13 = jv0Var.f25504k0[0].F) == 0 || i13 == 5)) {
            yu0VarArr[0].f30612a.isEmpty();
        }
        if (i11 != 0 && ((i12 = fs0Var.F) == 0 || jv0.p0(i12))) {
            jv0.q(fs0Var, yu0VarArr, true);
        }
        fs0Var.h.M0(true);
        if (fs0Var.G != null) {
            fs0Var.invalidate();
        }
        jv0Var.o0();
    }
}
