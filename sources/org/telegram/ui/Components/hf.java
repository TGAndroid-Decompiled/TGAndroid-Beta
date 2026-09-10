package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final pv0 f23612a;
    public final ep0 f23613b;

    public hf(pv0 pv0Var, ep0 ep0Var) {
        this.f23612a = pv0Var;
        this.f23613b = ep0Var;
    }

    @Override
    public final void onDraw() {
        pv0 pv0Var = this.f23612a;
        pv0Var.post(new gf(this, pv0Var, this.f23613b, 0));
    }
}
