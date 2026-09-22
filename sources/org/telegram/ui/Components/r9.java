package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class r9 extends w7.j0 {
    public final ViewGroup f27852a;
    public final u9 f27853b;

    public r9(u9 u9Var, ViewGroup viewGroup) {
        this.f27853b = u9Var;
        this.f27852a = viewGroup;
    }

    @Override
    public final void a() {
        this.f27852a.invalidate();
    }
}
