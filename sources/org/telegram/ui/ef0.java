package org.telegram.ui;

import android.view.View;
public final class ef0 implements View.OnAttachStateChangeListener {
    public boolean f36010b;
    public final ff0 d;
    public long f36009a = System.currentTimeMillis();
    public final df0 f36011c = new df0(this, 0);

    public ef0(ff0 ff0Var) {
        this.d = ff0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f36010b = true;
        view.post(this.f36011c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f36010b = false;
        view.removeCallbacks(this.f36011c);
    }
}
