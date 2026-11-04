package org.telegram.ui;

import android.view.View;
public final class mc0 implements View.OnAttachStateChangeListener {
    public boolean f47649b;
    public final nc0 d;
    public long f47648a = System.currentTimeMillis();
    public final lc0 f47650c = new lc0(this, 0);

    public mc0(nc0 nc0Var) {
        this.d = nc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f47649b = true;
        view.post(this.f47650c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f47649b = false;
        view.removeCallbacks(this.f47650c);
    }
}
