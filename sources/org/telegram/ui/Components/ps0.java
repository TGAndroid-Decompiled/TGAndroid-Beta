package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ps0 extends s4.s0 {
    public final gs0 f27313a;
    public final hs0 f27314b;
    public final kv0 f27315c;

    public ps0(kv0 kv0Var, gs0 gs0Var, hs0 hs0Var) {
        this.f27315c = kv0Var;
        this.f27313a = gs0Var;
        this.f27314b = hs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27315c.f25803b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        kv0 kv0Var = this.f27315c;
        zu0[] zu0VarArr = kv0Var.f25844t1;
        hs0 hs0Var = this.f27314b;
        gs0 gs0Var = this.f27313a;
        kv0Var.G(gs0Var, (wl0) recyclerView, hs0Var);
        if (i11 != 0 && ((i13 = kv0Var.f25824k0[0].F) == 0 || i13 == 5)) {
            zu0VarArr[0].f30877a.isEmpty();
        }
        if (i11 != 0 && ((i12 = gs0Var.F) == 0 || kv0.p0(i12))) {
            kv0.q(gs0Var, zu0VarArr, true);
        }
        gs0Var.h.M0(true);
        if (gs0Var.G != null) {
            gs0Var.invalidate();
        }
        kv0Var.o0();
    }
}
