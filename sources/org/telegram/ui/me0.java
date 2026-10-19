package org.telegram.ui;

import android.view.View;
public final class me0 implements View.OnAttachStateChangeListener {
    public boolean f39253b;
    public final ne0 d;
    public long f39252a = System.currentTimeMillis();
    public final le0 f39254c = new le0(this, 0);

    public me0(ne0 ne0Var) {
        this.d = ne0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f39253b = true;
        view.post(this.f39254c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f39253b = false;
        view.removeCallbacks(this.f39254c);
    }
}
