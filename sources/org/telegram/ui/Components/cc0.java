package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class cc0 extends l91 {
    public final Context f24918a;
    public final zc0 f24919b;

    public cc0(zc0 zc0Var, Context context) {
        this.f24919b = zc0Var;
        this.f24918a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        tc0 tc0Var = (tc0) view;
        tc0Var.h();
        tc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new tc0(this.f24919b, this.f24918a, i10);
    }

    @Override
    public final int e() {
        return this.f24919b.f33333e.f32712a.size();
    }

    @Override
    public final int h(int i10) {
        return ((wc0) this.f24919b.f33333e.f32712a.get(i10)).f32356a;
    }
}
