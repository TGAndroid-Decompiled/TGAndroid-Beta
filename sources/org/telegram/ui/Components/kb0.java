package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kb0 extends y81 {
    public final Context f28152a;
    public final ic0 f28153b;

    public kb0(ic0 ic0Var, Context context) {
        this.f28153b = ic0Var;
        this.f28152a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        cc0 cc0Var = (cc0) view;
        cc0Var.h();
        cc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new cc0(this.f28153b, this.f28152a, i10);
    }

    @Override
    public final int e() {
        return this.f28153b.f27459e.f26845a.size();
    }

    @Override
    public final int h(int i10) {
        return ((fc0) this.f28153b.f27459e.f26845a.get(i10)).f26448a;
    }
}
