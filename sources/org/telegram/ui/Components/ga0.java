package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ga0 extends p71 {
    public final Context f26375a;
    public final ab0 f26376b;

    public ga0(ab0 ab0Var, Context context) {
        this.f26376b = ab0Var;
        this.f26375a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ua0 ua0Var = (ua0) view;
        ua0Var.i();
        ua0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new ua0(this.f26376b, this.f26375a, i10);
    }

    @Override
    public final int e() {
        return this.f26376b.e.f32793a.size();
    }

    @Override
    public final int h(int i10) {
        return ((xa0) this.f26376b.e.f32793a.get(i10)).f32531a;
    }
}
