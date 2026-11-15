package org.telegram.ui;

import android.view.View;
public final class nc0 implements View.OnAttachStateChangeListener {
    public boolean f49544b;
    public final oc0 d;
    public long f49543a = System.currentTimeMillis();
    public final mc0 f49545c = new mc0(this, 0);

    public nc0(oc0 oc0Var) {
        this.d = oc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49544b = true;
        view.post(this.f49545c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f49544b = false;
        view.removeCallbacks(this.f49545c);
    }
}
