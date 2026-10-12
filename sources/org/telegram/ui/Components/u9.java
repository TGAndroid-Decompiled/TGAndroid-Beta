package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class u9 extends w7.h0 {
    public final ViewGroup f31102a;
    public final x9 f31103b;

    public u9(x9 x9Var, ViewGroup viewGroup) {
        this.f31103b = x9Var;
        this.f31102a = viewGroup;
    }

    @Override
    public final void a() {
        this.f31102a.invalidate();
    }
}
