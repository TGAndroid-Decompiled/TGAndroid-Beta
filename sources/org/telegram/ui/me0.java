package org.telegram.ui;

import android.view.View;
public final class me0 implements View.OnAttachStateChangeListener {
    public boolean f39229b;
    public final ne0 d;
    public long f39228a = System.currentTimeMillis();
    public final le0 f39230c = new le0(this, 0);

    public me0(ne0 ne0Var) {
        this.d = ne0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f39229b = true;
        view.post(this.f39230c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f39229b = false;
        view.removeCallbacks(this.f39230c);
    }
}
