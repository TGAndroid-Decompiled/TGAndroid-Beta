package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class c9 extends w7.y5 {
    public final ViewGroup f25063a;
    public final f9 f25064b;

    public c9(f9 f9Var, ViewGroup viewGroup) {
        this.f25064b = f9Var;
        this.f25063a = viewGroup;
    }

    @Override
    public final void a() {
        this.f25063a.invalidate();
    }
}
