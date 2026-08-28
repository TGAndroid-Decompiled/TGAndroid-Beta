package org.telegram.ui;

import android.view.View;
public final class pe0 implements View.OnAttachStateChangeListener {
    public boolean f41499b;
    public final qe0 d;
    public long f41498a = System.currentTimeMillis();
    public final oe0 f41500c = new oe0(this, 0);

    public pe0(qe0 qe0Var) {
        this.d = qe0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41499b = true;
        view.post(this.f41500c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f41499b = false;
        view.removeCallbacks(this.f41500c);
    }
}
