package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class fc extends org.telegram.ui.Components.dk0 {
    public final Context f47664c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final int f47665e;
    public final hc f47666f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f47666f = hcVar;
        this.f47664c = context;
        this.d = h6Var;
        this.f47665e = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.f47665e).f25966t4;
        if (dpVar == null) {
            return 0;
        }
        return dpVar.f23593c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        gc gcVar = (gc) f1Var.f59165a;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, gcVar, this.d);
        if (i7 == this.f47666f.f48317e) {
            z10 = true;
        } else {
            z10 = false;
        }
        gcVar.f48043s = z10;
        gcVar.f48044w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.f47665e).f25966t4;
        if (dpVar != null) {
            ArrayList arrayList = dpVar.f23593c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                gcVar.a((org.telegram.messenger.cp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new gc(this.f47666f, this.f47664c));
    }
}
