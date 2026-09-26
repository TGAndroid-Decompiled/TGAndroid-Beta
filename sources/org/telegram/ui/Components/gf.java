package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final qv0 f24444a;
    public final hp0 f24445b;

    public gf(qv0 qv0Var, hp0 hp0Var) {
        this.f24444a = qv0Var;
        this.f24445b = hp0Var;
    }

    @Override
    public final void onDraw() {
        qv0 qv0Var = this.f24444a;
        qv0Var.post(new org.telegram.messenger.video.o(this, qv0Var, this.f24445b, 11));
    }
}
