package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ta0 extends q71 {
    public final Context f32917a;
    public final rb0 f32918b;

    public ta0(rb0 rb0Var, Context context) {
        this.f32918b = rb0Var;
        this.f32917a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        lb0 lb0Var = (lb0) view;
        lb0Var.h();
        lb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new lb0(this.f32918b, this.f32917a, i10);
    }

    @Override
    public final int e() {
        return this.f32918b.f32252e.f31633a.size();
    }

    @Override
    public final int h(int i10) {
        return ((ob0) this.f32918b.f32252e.f31633a.get(i10)).f31331a;
    }
}
