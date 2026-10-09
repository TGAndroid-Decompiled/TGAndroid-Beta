package org.telegram.ui;

import android.view.View;
public final class ff0 implements View.OnAttachStateChangeListener {
    public boolean f37540b;
    public final gf0 d;
    public long f37539a = System.currentTimeMillis();
    public final ef0 f37541c = new ef0(this, 0);

    public ff0(gf0 gf0Var) {
        this.d = gf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f37540b = true;
        view.post(this.f37541c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f37540b = false;
        view.removeCallbacks(this.f37541c);
    }
}
