package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class fc extends org.telegram.ui.Components.dk0 {
    public final Context f47660c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final int f47661e;
    public final hc f47662f;

    public fc(hc hcVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f47662f = hcVar;
        this.f47660c = context;
        this.d = h6Var;
        this.f47661e = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.f47661e).f25795t4;
        if (cpVar == null) {
            return 0;
        }
        return cpVar.f23426c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        gc gcVar = (gc) f1Var.f59161a;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, gcVar, this.d);
        if (i7 == this.f47662f.f48313e) {
            z10 = true;
        } else {
            z10 = false;
        }
        gcVar.f48039s = z10;
        gcVar.f48040w.f(z10, true);
        gcVar.invalidate();
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.f47661e).f25795t4;
        if (cpVar != null) {
            ArrayList arrayList = cpVar.f23426c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                gcVar.a((org.telegram.messenger.bp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new gc(this.f47662f, this.f47660c));
    }
}
