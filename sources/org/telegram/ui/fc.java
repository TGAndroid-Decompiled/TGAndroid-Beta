package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class fc extends org.telegram.ui.Components.bk0 {
    public final Context f47591c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final int f47592e;
    public final hc f47593f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f47593f = hcVar;
        this.f47591c = context;
        this.d = i6Var;
        this.f47592e = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.f47592e).f25767t4;
        if (cpVar == null) {
            return 0;
        }
        return cpVar.f23398c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        gc gcVar = (gc) f1Var.f59123a;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, gcVar, this.d);
        if (i7 == this.f47593f.f48239e) {
            z10 = true;
        } else {
            z10 = false;
        }
        gcVar.f47966s = z10;
        gcVar.f47967w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.f47592e).f25767t4;
        if (cpVar != null) {
            ArrayList arrayList = cpVar.f23398c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                gcVar.a((org.telegram.messenger.bp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new gc(this.f47593f, this.f47591c));
    }
}
