package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class we implements ViewTreeObserver.OnDrawListener {
    public final mu0 f34216a;
    public final do0 f34217b;

    public we(mu0 mu0Var, do0 do0Var) {
        this.f34216a = mu0Var;
        this.f34217b = do0Var;
    }

    @Override
    public final void onDraw() {
        mu0 mu0Var = this.f34216a;
        mu0Var.post(new org.telegram.messenger.video.e(this, mu0Var, this.f34217b, 13));
    }
}
