package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class qs0 extends s4.s0 {
    public final hs0 f27830a;
    public final is0 f27831b;
    public final lv0 f27832c;

    public qs0(lv0 lv0Var, hs0 hs0Var, is0 is0Var) {
        this.f27832c = lv0Var;
        this.f27830a = hs0Var;
        this.f27831b = is0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27832c.f26115b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        lv0 lv0Var = this.f27832c;
        av0[] av0VarArr = lv0Var.f26156t1;
        is0 is0Var = this.f27831b;
        hs0 hs0Var = this.f27830a;
        lv0Var.G(hs0Var, (yl0) recyclerView, is0Var);
        if (i11 != 0 && ((i13 = lv0Var.f26136k0[0].F) == 0 || i13 == 5)) {
            av0VarArr[0].f22731a.isEmpty();
        }
        if (i11 != 0 && ((i12 = hs0Var.F) == 0 || lv0.p0(i12))) {
            lv0.q(hs0Var, av0VarArr, true);
        }
        hs0Var.h.L0(true);
        if (hs0Var.G != null) {
            hs0Var.invalidate();
        }
        lv0Var.o0();
    }
}
