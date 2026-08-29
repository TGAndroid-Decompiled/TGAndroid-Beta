package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ur0 extends f2.a1 {
    public final lr0 f33301a;
    public final mr0 f33302b;
    public final qu0 f33303c;

    public ur0(qu0 qu0Var, lr0 lr0Var, mr0 mr0Var) {
        this.f33303c = qu0Var;
        this.f33301a = lr0Var;
        this.f33302b = mr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33303c.X0 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        qu0 qu0Var = this.f33303c;
        fu0[] fu0VarArr = qu0Var.f32088p1;
        mr0 mr0Var = this.f33302b;
        lr0 lr0Var = this.f33301a;
        qu0Var.G(lr0Var, (jl0) recyclerView, mr0Var);
        if (i11 != 0 && ((i13 = qu0Var.f32070g0[0].B) == 0 || i13 == 5)) {
            fu0VarArr[0].f28534a.isEmpty();
        }
        if (i11 != 0 && ((i12 = lr0Var.B) == 0 || qu0.p0(i12))) {
            qu0.q(lr0Var, fu0VarArr, true);
        }
        lr0Var.h.K0(true);
        if (lr0Var.C != null) {
            lr0Var.invalidate();
        }
        qu0Var.o0();
    }
}
