package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final ew0 f25300a;
    public final vp0 f25301b;

    public hf(ew0 ew0Var, vp0 vp0Var) {
        this.f25300a = ew0Var;
        this.f25301b = vp0Var;
    }

    @Override
    public final void onDraw() {
        ew0 ew0Var = this.f25300a;
        ew0Var.post(new org.telegram.messenger.video.f(this, ew0Var, this.f25301b, 13));
    }
}
