package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class eb0 extends o81 {
    public final Context f23819a;
    public final dc0 f23820b;

    public eb0(dc0 dc0Var, Context context) {
        this.f23820b = dc0Var;
        this.f23819a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        xb0 xb0Var = (xb0) view;
        xb0Var.h();
        xb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new xb0(this.f23820b, this.f23819a, i10);
    }

    @Override
    public final int e() {
        return this.f23820b.e.f22956a.size();
    }

    @Override
    public final int h(int i10) {
        return ((ac0) this.f23820b.e.f22956a.get(i10)).f22647a;
    }
}
