package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class u9 extends w7.h0 {
    public final ViewGroup f31107a;
    public final x9 f31108b;

    public u9(x9 x9Var, ViewGroup viewGroup) {
        this.f31108b = x9Var;
        this.f31107a = viewGroup;
    }

    @Override
    public final void a() {
        this.f31107a.invalidate();
    }
}
