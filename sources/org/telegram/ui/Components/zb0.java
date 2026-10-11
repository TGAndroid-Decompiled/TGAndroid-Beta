package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zb0 extends h91 {
    public final Context f33477a;
    public final wc0 f33478b;

    public zb0(wc0 wc0Var, Context context) {
        this.f33478b = wc0Var;
        this.f33477a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        qc0 qc0Var = (qc0) view;
        qc0Var.h();
        qc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new qc0(this.f33478b, this.f33477a, i10);
    }

    @Override
    public final int e() {
        return this.f33478b.f32615e.f31382a.size();
    }

    @Override
    public final int h(int i10) {
        return ((tc0) this.f33478b.f32615e.f31382a.get(i10)).f31080a;
    }
}
