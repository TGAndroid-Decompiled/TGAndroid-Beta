package org.telegram.ui;

import android.view.View;
public final class ef0 implements View.OnAttachStateChangeListener {
    public boolean f37329b;
    public final ff0 d;
    public long f37328a = System.currentTimeMillis();
    public final df0 f37330c = new df0(this, 0);

    public ef0(ff0 ff0Var) {
        this.d = ff0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f37329b = true;
        view.post(this.f37330c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f37329b = false;
        view.removeCallbacks(this.f37330c);
    }
}
