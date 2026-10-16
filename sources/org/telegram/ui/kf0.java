package org.telegram.ui;

import android.view.View;
public final class kf0 implements View.OnAttachStateChangeListener {
    public boolean f37370b;
    public final lf0 d;
    public long f37369a = System.currentTimeMillis();
    public final jf0 f37371c = new jf0(this, 0);

    public kf0(lf0 lf0Var) {
        this.d = lf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f37370b = true;
        view.post(this.f37371c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f37370b = false;
        view.removeCallbacks(this.f37371c);
    }
}
