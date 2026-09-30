package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final tv0 f24853a;
    public final kp0 f24854b;

    public hf(tv0 tv0Var, kp0 kp0Var) {
        this.f24853a = tv0Var;
        this.f24854b = kp0Var;
    }

    @Override
    public final void onDraw() {
        tv0 tv0Var = this.f24853a;
        tv0Var.post(new org.telegram.messenger.video.o(this, tv0Var, this.f24854b, 11));
    }
}
