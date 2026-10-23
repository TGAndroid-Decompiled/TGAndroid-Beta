package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class s9 extends w7.w5 {
    public final ViewGroup f30225a;
    public final v9 f30226b;

    public s9(v9 v9Var, ViewGroup viewGroup) {
        this.f30226b = v9Var;
        this.f30225a = viewGroup;
    }

    @Override
    public final void a() {
        this.f30225a.invalidate();
    }
}
