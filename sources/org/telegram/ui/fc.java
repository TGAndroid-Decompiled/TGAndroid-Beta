package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class fc extends org.telegram.ui.Components.tj0 {
    public final Context f47093c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final int f47094e;
    public final hc f47095f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        this.f47095f = hcVar;
        this.f47093c = context;
        this.d = e6Var;
        this.f47094e = i7;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.f47094e).f25383r4;
        if (dpVar == null) {
            return 0;
        }
        return dpVar.f23126c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        gc gcVar = (gc) e1Var.f58535a;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, gcVar, this.d);
        if (i7 == this.f47095f.f47659e) {
            z10 = true;
        } else {
            z10 = false;
        }
        gcVar.f47398s = z10;
        gcVar.f47399w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.f47094e).f25383r4;
        if (dpVar != null) {
            ArrayList arrayList = dpVar.f23126c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                gcVar.a((org.telegram.messenger.cp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new gc(this.f47095f, this.f47093c));
    }
}
