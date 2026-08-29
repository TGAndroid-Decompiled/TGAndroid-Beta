package org.telegram.ui;

import android.view.View;
public final class oe0 implements View.OnAttachStateChangeListener {
    public boolean f41102b;
    public final pe0 d;
    public long f41101a = System.currentTimeMillis();
    public final ne0 f41103c = new ne0(this, 0);

    public oe0(pe0 pe0Var) {
        this.d = pe0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41102b = true;
        view.post(this.f41103c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f41102b = false;
        view.removeCallbacks(this.f41103c);
    }
}
