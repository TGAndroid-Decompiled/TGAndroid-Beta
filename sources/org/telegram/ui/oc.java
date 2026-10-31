package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class oc extends org.telegram.ui.Components.sk0 {
    public final Context f40222c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final int e;
    public final qc f40223f;

    public oc(qc qcVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.f40223f = qcVar;
        this.f40222c = context;
        this.d = p6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(this.e).f18888r4;
        if (lpVar == null) {
            return 0;
        }
        return lpVar.f16782c.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        pc pcVar = (pc) c1Var.f47898a;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, pcVar, this.d);
        if (i10 == this.f40223f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        pcVar.f40622s = z10;
        pcVar.f40623w.f(z10, true);
        pcVar.invalidate();
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(this.e).f18888r4;
        if (lpVar != null) {
            ArrayList arrayList = lpVar.f16782c;
            if (i10 >= 0 && i10 < arrayList.size()) {
                pcVar.a((org.telegram.messenger.kp) arrayList.get(i10));
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new pc(this.f40223f, this.f40222c));
    }
}
