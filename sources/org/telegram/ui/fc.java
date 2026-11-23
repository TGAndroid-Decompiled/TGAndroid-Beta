package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class fc extends org.telegram.ui.Components.dk0 {
    public final Context f47625c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final int f47626e;
    public final hc f47627f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f47627f = hcVar;
        this.f47625c = context;
        this.d = h6Var;
        this.f47626e = i7;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.f47626e).f25930t4;
        if (dpVar == null) {
            return 0;
        }
        return dpVar.f23557c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        gc gcVar = (gc) e1Var.f59111a;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, gcVar, this.d);
        if (i7 == this.f47627f.f48282e) {
            z10 = true;
        } else {
            z10 = false;
        }
        gcVar.f47987s = z10;
        gcVar.f47988w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.f47626e).f25930t4;
        if (dpVar != null) {
            ArrayList arrayList = dpVar.f23557c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                gcVar.a((org.telegram.messenger.cp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new gc(this.f47627f, this.f47625c));
    }
}
