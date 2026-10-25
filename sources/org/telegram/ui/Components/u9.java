package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class u9 extends gb1 {
    public final ViewGroup f33312c;
    public final x9 d;

    public u9(x9 x9Var, ViewGroup viewGroup) {
        this.d = x9Var;
        this.f33312c = viewGroup;
    }

    @Override
    public final void M() {
        this.f33312c.invalidate();
    }
}
