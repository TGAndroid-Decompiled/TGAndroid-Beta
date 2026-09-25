package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class os0 extends s4.s0 {
    public final fs0 f27187a;
    public final gs0 f27188b;
    public final jv0 f27189c;

    public os0(jv0 jv0Var, fs0 fs0Var, gs0 gs0Var) {
        this.f27189c = jv0Var;
        this.f27187a = fs0Var;
        this.f27188b = gs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27189c.f25515b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        jv0 jv0Var = this.f27189c;
        yu0[] yu0VarArr = jv0Var.f25556t1;
        gs0 gs0Var = this.f27188b;
        fs0 fs0Var = this.f27187a;
        jv0Var.G(fs0Var, (wl0) recyclerView, gs0Var);
        if (i11 != 0 && ((i13 = jv0Var.f25536k0[0].F) == 0 || i13 == 5)) {
            yu0VarArr[0].f30693a.isEmpty();
        }
        if (i11 != 0 && ((i12 = fs0Var.F) == 0 || jv0.p0(i12))) {
            jv0.q(fs0Var, yu0VarArr, true);
        }
        fs0Var.h.L0(true);
        if (fs0Var.G != null) {
            fs0Var.invalidate();
        }
        jv0Var.o0();
    }
}
