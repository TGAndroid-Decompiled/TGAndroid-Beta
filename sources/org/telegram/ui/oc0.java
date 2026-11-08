package org.telegram.ui;

import android.view.View;
public final class oc0 implements View.OnAttachStateChangeListener {
    public boolean f48372b;
    public final pc0 d;
    public long f48371a = System.currentTimeMillis();
    public final nc0 f48373c = new nc0(this, 0);

    public oc0(pc0 pc0Var) {
        this.d = pc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f48372b = true;
        view.post(this.f48373c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f48372b = false;
        view.removeCallbacks(this.f48373c);
    }
}
