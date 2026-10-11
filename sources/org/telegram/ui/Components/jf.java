package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class jf implements ViewTreeObserver.OnDrawListener {
    public final kw0 f27674a;
    public final bq0 f27675b;

    public jf(kw0 kw0Var, bq0 bq0Var) {
        this.f27674a = kw0Var;
        this.f27675b = bq0Var;
    }

    @Override
    public final void onDraw() {
        kw0 kw0Var = this.f27674a;
        kw0Var.post(new org.telegram.messenger.video.f(this, kw0Var, this.f27675b, 13));
    }
}
