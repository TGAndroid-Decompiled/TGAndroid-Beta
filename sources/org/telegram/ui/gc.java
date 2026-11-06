package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class gc extends org.telegram.ui.Components.oj0 {
    public final Context f45942c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int f45943e;
    public final ic f45944f;

    public gc(ic icVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        this.f45944f = icVar;
        this.f45942c = context;
        this.d = f6Var;
        this.f45943e = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f45943e).f24867q4;
        if (gpVar == null) {
            return 0;
        }
        return gpVar.f22684c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        hc hcVar = (hc) d1Var.f56951a;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, hcVar, this.d);
        if (i7 == this.f45944f.f46643e) {
            z9 = true;
        } else {
            z9 = false;
        }
        hcVar.f46324s = z9;
        hcVar.f46325w.f(z9, true);
        hcVar.invalidate();
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f45943e).f24867q4;
        if (gpVar != null) {
            ArrayList arrayList = gpVar.f22684c;
            if (i7 >= 0 && i7 < arrayList.size()) {
                hcVar.a((org.telegram.messenger.fp) arrayList.get(i7));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new hc(this.f45944f, this.f45942c));
    }
}
