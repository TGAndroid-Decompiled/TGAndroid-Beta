package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class s9 extends w7.w5 {
    public final ViewGroup f30221a;
    public final v9 f30222b;

    public s9(v9 v9Var, ViewGroup viewGroup) {
        this.f30222b = v9Var;
        this.f30221a = viewGroup;
    }

    @Override
    public final void a() {
        this.f30221a.invalidate();
    }
}
