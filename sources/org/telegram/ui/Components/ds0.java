package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ds0 extends f2.a1 {
    public final ur0 f26317a;
    public final vr0 f26318b;
    public final zu0 f26319c;

    public ds0(zu0 zu0Var, ur0 ur0Var, vr0 vr0Var) {
        this.f26319c = zu0Var;
        this.f26317a = ur0Var;
        this.f26318b = vr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f26319c.Y0 = z4;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        zu0 zu0Var = this.f26319c;
        ou0[] ou0VarArr = zu0Var.f33998q1;
        vr0 vr0Var = this.f26318b;
        ur0 ur0Var = this.f26317a;
        zu0Var.G(ur0Var, (tl0) recyclerView, vr0Var);
        if (i11 != 0 && ((i13 = zu0Var.f33980h0[0].C) == 0 || i13 == 5)) {
            ou0VarArr[0].f29851a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ur0Var.C) == 0 || zu0.p0(i12))) {
            zu0.q(ur0Var, ou0VarArr, true);
        }
        ur0Var.h.K0(true);
        if (ur0Var.D != null) {
            ur0Var.invalidate();
        }
        zu0Var.o0();
    }
}
