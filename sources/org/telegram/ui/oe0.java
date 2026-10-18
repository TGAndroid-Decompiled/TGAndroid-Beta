package org.telegram.ui;

import android.view.View;
public final class oe0 implements View.OnAttachStateChangeListener {
    public boolean f39778b;
    public final pe0 d;
    public long f39777a = System.currentTimeMillis();
    public final ne0 f39779c = new ne0(this, 0);

    public oe0(pe0 pe0Var) {
        this.d = pe0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f39778b = true;
        view.post(this.f39779c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f39778b = false;
        view.removeCallbacks(this.f39779c);
    }
}
