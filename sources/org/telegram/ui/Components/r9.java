package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class r9 extends w7.j0 {
    public final ViewGroup f27809a;
    public final u9 f27810b;

    public r9(u9 u9Var, ViewGroup viewGroup) {
        this.f27810b = u9Var;
        this.f27809a = viewGroup;
    }

    @Override
    public final void a() {
        this.f27809a.invalidate();
    }
}
