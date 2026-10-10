package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnDrawListener {
    public final jw0 f27667a;
    public final aq0 f27668b;

    public jf(jw0 jw0Var, aq0 aq0Var) {
        this.f27667a = jw0Var;
        this.f27668b = aq0Var;
    }

    @Override
    public final void onDraw() {
        jw0 jw0Var = this.f27667a;
        jw0Var.post(new org.telegram.messenger.video.f(this, jw0Var, this.f27668b, 13));
    }
}
