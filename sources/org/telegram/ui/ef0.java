package org.telegram.ui;

import android.view.View;
public final class ef0 implements View.OnAttachStateChangeListener {
    public boolean f36016b;
    public final ff0 d;
    public long f36015a = System.currentTimeMillis();
    public final df0 f36017c = new df0(this, 0);

    public ef0(ff0 ff0Var) {
        this.d = ff0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f36016b = true;
        view.post(this.f36017c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f36016b = false;
        view.removeCallbacks(this.f36017c);
    }
}
