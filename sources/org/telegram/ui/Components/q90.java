package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class q90 extends n61 {
    public final Context f38590a;
    public final ja0 f38591b;

    public q90(ja0 ja0Var, Context context) {
        this.f38591b = ja0Var;
        this.f38590a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        da0 da0Var = (da0) view;
        da0Var.i();
        da0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new da0(this.f38591b, this.f38590a, i7);
    }

    @Override
    public final int e() {
        return this.f38591b.f35951e.f35208a.size();
    }

    @Override
    public final int h(int i7) {
        return ((ga0) this.f38591b.f35951e.f35208a.get(i7)).f34876a;
    }
}
