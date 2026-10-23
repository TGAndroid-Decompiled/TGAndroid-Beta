package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sb0 extends d91 {
    public final Context f30452a;
    public final rc0 f30453b;

    public sb0(rc0 rc0Var, Context context) {
        this.f30453b = rc0Var;
        this.f30452a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        lc0 lc0Var = (lc0) view;
        lc0Var.i();
        lc0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new lc0(this.f30453b, this.f30452a, i10);
    }

    @Override
    public final int e() {
        return this.f30453b.e.f29511a.size();
    }

    @Override
    public final int h(int i10) {
        return ((oc0) this.f30453b.e.f29511a.get(i10)).f29156a;
    }
}
