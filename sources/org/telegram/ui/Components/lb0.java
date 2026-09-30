package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class lb0 extends p81 {
    public final Context f25960a;
    public final ic0 f25961b;

    public lb0(ic0 ic0Var, Context context) {
        this.f25961b = ic0Var;
        this.f25960a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        cc0 cc0Var = (cc0) view;
        cc0Var.h();
        cc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new cc0(this.f25961b, this.f25960a, i10);
    }

    @Override
    public final int e() {
        return this.f25961b.e.f24534a.size();
    }

    @Override
    public final int h(int i10) {
        return ((fc0) this.f25961b.e.f24534a.get(i10)).f24269a;
    }
}
