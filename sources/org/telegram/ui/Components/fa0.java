package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fa0 extends e71 {
    public final Context f28370a;
    public final cb0 f28371b;

    public fa0(cb0 cb0Var, Context context) {
        this.f28371b = cb0Var;
        this.f28370a = context;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        wa0 wa0Var = (wa0) view;
        wa0Var.h();
        wa0Var.k(false);
    }

    @Override
    public final View d(int i9) {
        return new wa0(this.f28371b, this.f28370a, i9);
    }

    @Override
    public final int e() {
        return this.f28371b.f27457e.f26746a.size();
    }

    @Override
    public final int h(int i9) {
        return ((za0) this.f28371b.f27457e.f26746a.get(i9)).f35264a;
    }
}
