package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class df implements ViewTreeObserver.OnDrawListener {
    public final gv0 f23342a;
    public final vo0 f23343b;

    public df(gv0 gv0Var, vo0 vo0Var) {
        this.f23342a = gv0Var;
        this.f23343b = vo0Var;
    }

    @Override
    public final void onDraw() {
        gv0 gv0Var = this.f23342a;
        gv0Var.post(new org.telegram.ui.ActionBar.q(this, gv0Var, this.f23343b, 8));
    }
}
