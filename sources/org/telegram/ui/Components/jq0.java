package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class jq0 extends v4.s0 {
    public final zp0 f35044a;
    public final aq0 f35045b;
    public final ys0 f35046c;

    public jq0(ys0 ys0Var, zp0 zp0Var, aq0 aq0Var) {
        this.f35046c = ys0Var;
        this.f35044a = zp0Var;
        this.f35045b = aq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f35046c.f40661d1 = z9;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        ys0 ys0Var = this.f35046c;
        ns0[] ns0VarArr = ys0Var.f40713v1;
        aq0 aq0Var = this.f35045b;
        zp0 zp0Var = this.f35044a;
        ys0Var.O(zp0Var, (pj0) recyclerView, aq0Var);
        if (i10 != 0 && ((i12 = ys0Var.m0[0].E) == 0 || i12 == 5)) {
            ns0VarArr[0].f36369a.isEmpty();
        }
        if (i10 != 0 && ((i11 = zp0Var.E) == 0 || ys0.z0(i11))) {
            ys0.s(zp0Var, ns0VarArr, true);
        }
        zp0Var.h.L0(true);
        if (zp0Var.F != null) {
            zp0Var.invalidate();
        }
    }
}
