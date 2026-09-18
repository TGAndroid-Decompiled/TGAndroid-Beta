package org.telegram.ui;

import android.view.View;
public final class hf0 implements View.OnAttachStateChangeListener {
    public boolean f34150b;
    public final if0 d;
    public long f34149a = System.currentTimeMillis();
    public final gf0 f34151c = new gf0(this, 0);

    public hf0(if0 if0Var) {
        this.d = if0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34150b = true;
        view.post(this.f34151c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f34150b = false;
        view.removeCallbacks(this.f34151c);
    }
}
