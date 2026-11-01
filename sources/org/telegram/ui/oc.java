package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class oc extends org.telegram.ui.Components.tk0 {
    public final Context f40128c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final int e;
    public final qc f40129f;

    public oc(qc qcVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.f40129f = qcVar;
        this.f40128c = context;
        this.d = p6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.mp mpVar = org.telegram.messenger.wp.r1(this.e).f19231r4;
        if (mpVar == null) {
            return 0;
        }
        return mpVar.f17166c.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        pc pcVar = (pc) c1Var.f47909a;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, pcVar, this.d);
        if (i10 == this.f40129f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        pcVar.f40453s = z10;
        pcVar.f40454w.f(z10, true);
        pcVar.invalidate();
        org.telegram.messenger.mp mpVar = org.telegram.messenger.wp.r1(this.e).f19231r4;
        if (mpVar != null) {
            ArrayList arrayList = mpVar.f17166c;
            if (i10 >= 0 && i10 < arrayList.size()) {
                pcVar.a((org.telegram.messenger.lp) arrayList.get(i10));
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new pc(this.f40129f, this.f40128c));
    }
}
