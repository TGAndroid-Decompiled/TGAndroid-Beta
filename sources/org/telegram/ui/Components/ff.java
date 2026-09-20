package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final qv0 f24107a;
    public final hp0 f24108b;

    public ff(qv0 qv0Var, hp0 hp0Var) {
        this.f24107a = qv0Var;
        this.f24108b = hp0Var;
    }

    @Override
    public final void onDraw() {
        qv0 qv0Var = this.f24107a;
        qv0Var.post(new org.telegram.messenger.video.o(this, qv0Var, this.f24108b, 11));
    }
}
