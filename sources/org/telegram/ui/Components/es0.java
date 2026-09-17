package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class es0 extends s4.s0 {
    public final vr0 f23667a;
    public final wr0 f23668b;
    public final zu0 f23669c;

    public es0(zu0 zu0Var, vr0 vr0Var, wr0 wr0Var) {
        this.f23669c = zu0Var;
        this.f23667a = vr0Var;
        this.f23668b = wr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23669c.f30611b1 = z10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        zu0 zu0Var = this.f23669c;
        ou0[] ou0VarArr = zu0Var.f30652t1;
        wr0 wr0Var = this.f23668b;
        vr0 vr0Var = this.f23667a;
        zu0Var.G(vr0Var, (ml0) recyclerView, wr0Var);
        if (i11 != 0 && ((i13 = zu0Var.f30632k0[0].F) == 0 || i13 == 5)) {
            ou0VarArr[0].f26849a.isEmpty();
        }
        if (i11 != 0 && ((i12 = vr0Var.F) == 0 || zu0.p0(i12))) {
            zu0.q(vr0Var, ou0VarArr, true);
        }
        vr0Var.h.M0(true);
        if (vr0Var.G != null) {
            vr0Var.invalidate();
        }
        zu0Var.o0();
    }
}
