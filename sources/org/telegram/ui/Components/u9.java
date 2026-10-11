package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class u9 extends w7.i0 {
    public final ViewGroup f31352a;
    public final x9 f31353b;

    public u9(x9 x9Var, ViewGroup viewGroup) {
        this.f31353b = x9Var;
        this.f31352a = viewGroup;
    }

    @Override
    public final void a() {
        this.f31352a.invalidate();
    }
}
