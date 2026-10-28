package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class u9 extends kb1 {
    public final ViewGroup f33291c;
    public final x9 d;

    public u9(x9 x9Var, ViewGroup viewGroup) {
        this.d = x9Var;
        this.f33291c = viewGroup;
    }

    @Override
    public final void M() {
        this.f33291c.invalidate();
    }
}
