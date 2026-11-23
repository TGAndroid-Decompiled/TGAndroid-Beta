package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class aa0 extends c71 {
    public final Context f33450a;
    public final ta0 f33451b;

    public aa0(ta0 ta0Var, Context context) {
        this.f33451b = ta0Var;
        this.f33450a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        na0 na0Var = (na0) view;
        na0Var.i();
        na0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new na0(this.f33451b, this.f33450a, i7);
    }

    @Override
    public final int e() {
        return this.f33451b.f39884e.f39258a.size();
    }

    @Override
    public final int h(int i7) {
        return ((qa0) this.f33451b.f39884e.f39258a.get(i7)).f38750a;
    }
}
