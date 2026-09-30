package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class rs0 extends s4.s0 {
    public final is0 f28126a;
    public final js0 f28127b;
    public final mv0 f28128c;

    public rs0(mv0 mv0Var, is0 is0Var, js0 js0Var) {
        this.f28128c = mv0Var;
        this.f28126a = is0Var;
        this.f28127b = js0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28128c.f26404b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        mv0 mv0Var = this.f28128c;
        bv0[] bv0VarArr = mv0Var.f26445t1;
        js0 js0Var = this.f28127b;
        is0 is0Var = this.f28126a;
        mv0Var.G(is0Var, (zl0) recyclerView, js0Var);
        if (i11 != 0 && ((i13 = mv0Var.f26425k0[0].F) == 0 || i13 == 5)) {
            bv0VarArr[0].f23015a.isEmpty();
        }
        if (i11 != 0 && ((i12 = is0Var.F) == 0 || mv0.p0(i12))) {
            mv0.q(is0Var, bv0VarArr, true);
        }
        is0Var.h.M0(true);
        if (is0Var.G != null) {
            is0Var.invalidate();
        }
        mv0Var.o0();
    }
}
