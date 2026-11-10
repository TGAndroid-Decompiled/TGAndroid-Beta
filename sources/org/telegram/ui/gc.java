package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class gc extends org.telegram.ui.Components.oj0 {
    public final Context f46065c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final int f46066e;
    public final ic f46067f;

    public gc(ic icVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f46067f = icVar;
        this.f46065c = context;
        this.d = h6Var;
        this.f46066e = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f46066e).f24878q4;
        if (gpVar == null) {
            return 0;
        }
        return gpVar.f22710c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        hc hcVar = (hc) d1Var.f57052a;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, hcVar, this.d);
        if (i7 == this.f46067f.f46612e) {
            z9 = true;
        } else {
            z9 = false;
        }
        hcVar.f46303s = z9;
        hcVar.f46304w.f(z9, true);
        hcVar.invalidate();
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f46066e).f24878q4;
        if (gpVar != null) {
            ArrayList arrayList = gpVar.f22710c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                hcVar.a((org.telegram.messenger.fp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new hc(this.f46067f, this.f46065c));
    }
}
