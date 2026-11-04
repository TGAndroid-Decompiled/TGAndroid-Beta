package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class me implements ViewTreeObserver.OnDrawListener {
    public final ht0 f36140a;
    public final dn0 f36141b;

    public me(ht0 ht0Var, dn0 dn0Var) {
        this.f36140a = ht0Var;
        this.f36141b = dn0Var;
    }

    @Override
    public final void onDraw() {
        ht0 ht0Var = this.f36140a;
        ht0Var.post(new e7(this, ht0Var, this.f36141b, 1));
    }
}
