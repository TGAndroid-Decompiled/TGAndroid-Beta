package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kb0 extends x81 {
    public final Context f28060a;
    public final ic0 f28061b;

    public kb0(ic0 ic0Var, Context context) {
        this.f28061b = ic0Var;
        this.f28060a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        cc0 cc0Var = (cc0) view;
        cc0Var.h();
        cc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new cc0(this.f28061b, this.f28060a, i10);
    }

    @Override
    public final int e() {
        return this.f28061b.f27358e.f26790a.size();
    }

    @Override
    public final int h(int i10) {
        return ((fc0) this.f28061b.f27358e.f26790a.get(i10)).f26435a;
    }
}
