package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class gc extends org.telegram.ui.Components.pj0 {
    public final Context f45959c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final int f45960e;
    public final ic f45961f;

    public gc(ic icVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        this.f45961f = icVar;
        this.f45959c = context;
        this.d = g6Var;
        this.f45960e = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f45960e).f24874q4;
        if (gpVar == null) {
            return 0;
        }
        return gpVar.f22706c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        hc hcVar = (hc) d1Var.f57056a;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, hcVar, this.d);
        if (i7 == this.f45961f.f46568e) {
            z9 = true;
        } else {
            z9 = false;
        }
        hcVar.f46284s = z9;
        hcVar.f46285w.f(z9, true);
        hcVar.invalidate();
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f45960e).f24874q4;
        if (gpVar != null) {
            ArrayList arrayList = gpVar.f22706c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                hcVar.a((org.telegram.messenger.fp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new hc(this.f45961f, this.f45959c));
    }
}
