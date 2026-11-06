package org.telegram.ui;

import android.view.View;
public final class oc0 implements View.OnAttachStateChangeListener {
    public boolean f48369b;
    public final pc0 d;
    public long f48368a = System.currentTimeMillis();
    public final nc0 f48370c = new nc0(this, 0);

    public oc0(pc0 pc0Var) {
        this.d = pc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f48369b = true;
        view.post(this.f48370c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f48369b = false;
        view.removeCallbacks(this.f48370c);
    }
}
