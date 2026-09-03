package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ab0 extends d81 {
    public final Context f25208a;
    public final yb0 f25209b;

    public ab0(yb0 yb0Var, Context context) {
        this.f25209b = yb0Var;
        this.f25208a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        sb0 sb0Var = (sb0) view;
        sb0Var.h();
        sb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new sb0(this.f25209b, this.f25208a, i10);
    }

    @Override
    public final int e() {
        return this.f25209b.f33456e.f32719a.size();
    }

    @Override
    public final int h(int i10) {
        return ((vb0) this.f25209b.f33456e.f32719a.get(i10)).f31855a;
    }
}
