package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ba0 extends y61 {
    public final Context f33618a;
    public final ua0 f33619b;

    public ba0(ua0 ua0Var, Context context) {
        this.f33619b = ua0Var;
        this.f33618a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        oa0 oa0Var = (oa0) view;
        oa0Var.i();
        oa0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new oa0(this.f33619b, this.f33618a, i7);
    }

    @Override
    public final int e() {
        return this.f33619b.f40280e.f39546a.size();
    }

    @Override
    public final int h(int i7) {
        return ((ra0) this.f33619b.f40280e.f39546a.get(i7)).f39081a;
    }
}
