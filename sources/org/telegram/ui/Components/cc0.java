package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class cc0 extends l91 {
    public final Context f24923a;
    public final zc0 f24924b;

    public cc0(zc0 zc0Var, Context context) {
        this.f24924b = zc0Var;
        this.f24923a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        tc0 tc0Var = (tc0) view;
        tc0Var.h();
        tc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new tc0(this.f24924b, this.f24923a, i10);
    }

    @Override
    public final int e() {
        return this.f24924b.f33327e.f32713a.size();
    }

    @Override
    public final int h(int i10) {
        return ((wc0) this.f24924b.f33327e.f32713a.get(i10)).f32370a;
    }
}
