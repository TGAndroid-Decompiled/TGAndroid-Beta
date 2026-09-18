package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wa0 extends b81 {
    public final Context f29623a;
    public final vb0 f29624b;

    public wa0(vb0 vb0Var, Context context) {
        this.f29624b = vb0Var;
        this.f29623a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pb0 pb0Var = (pb0) view;
        pb0Var.h();
        pb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new pb0(this.f29624b, this.f29623a, i10);
    }

    @Override
    public final int e() {
        return this.f29624b.e.f28056a.size();
    }

    @Override
    public final int h(int i10) {
        return ((sb0) this.f29624b.e.f28056a.get(i10)).f27831a;
    }
}
