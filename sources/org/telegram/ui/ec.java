package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ec extends org.telegram.ui.Components.sj0 {
    public final Context f44959c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final int f44960e;
    public final gc f44961f;

    public ec(gc gcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        this.f44961f = gcVar;
        this.f44959c = context;
        this.d = e6Var;
        this.f44960e = i3;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.f44960e).f23099q4;
        if (xoVar == null) {
            return 0;
        }
        return xoVar.f26419c.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        fc fcVar = (fc) d1Var.f55540a;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, fcVar, this.d);
        if (i3 == this.f44961f.f45631e) {
            z10 = true;
        } else {
            z10 = false;
        }
        fcVar.f45244s = z10;
        fcVar.f45245w.f(z10, true);
        fcVar.invalidate();
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.f44960e).f23099q4;
        if (xoVar != null) {
            ArrayList arrayList = xoVar.f26419c;
            if (i3 >= 0 && i3 < arrayList.size()) {
                fcVar.a((org.telegram.messenger.wo) arrayList.get(i3));
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new fc(this.f44961f, this.f44959c));
    }
}
