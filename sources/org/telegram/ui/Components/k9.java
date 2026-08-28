package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k9 extends g7.b6 {
    public final ViewGroup f30030a;
    public final n9 f30031b;

    public k9(n9 n9Var, ViewGroup viewGroup) {
        this.f30031b = n9Var;
        this.f30030a = viewGroup;
    }

    @Override
    public final void a() {
        this.f30030a.invalidate();
    }
}
