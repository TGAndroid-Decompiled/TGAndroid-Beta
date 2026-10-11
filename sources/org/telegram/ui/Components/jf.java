package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnDrawListener {
    public final jw0 f27722a;
    public final aq0 f27723b;

    public jf(jw0 jw0Var, aq0 aq0Var) {
        this.f27722a = jw0Var;
        this.f27723b = aq0Var;
    }

    @Override
    public final void onDraw() {
        jw0 jw0Var = this.f27722a;
        jw0Var.post(new org.telegram.messenger.video.f(this, jw0Var, this.f27723b, 13));
    }
}
