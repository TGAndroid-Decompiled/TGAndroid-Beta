package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class u9 extends w7.i0 {
    public final ViewGroup f31397a;
    public final x9 f31398b;

    public u9(x9 x9Var, ViewGroup viewGroup) {
        this.f31398b = x9Var;
        this.f31397a = viewGroup;
    }

    @Override
    public final void a() {
        this.f31397a.invalidate();
    }
}
