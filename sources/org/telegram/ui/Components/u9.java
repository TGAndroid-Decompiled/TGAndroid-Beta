package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class u9 extends w7.i0 {
    public final ViewGroup f31424a;
    public final x9 f31425b;

    public u9(x9 x9Var, ViewGroup viewGroup) {
        this.f31425b = x9Var;
        this.f31424a = viewGroup;
    }

    @Override
    public final void a() {
        this.f31424a.invalidate();
    }
}
