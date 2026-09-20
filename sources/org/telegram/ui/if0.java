package org.telegram.ui;

import android.view.View;
public final class if0 implements View.OnAttachStateChangeListener {
    public boolean f34553b;
    public final jf0 d;
    public long f34552a = System.currentTimeMillis();
    public final hf0 f34554c = new hf0(this, 0);

    public if0(jf0 jf0Var) {
        this.d = jf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34553b = true;
        view.post(this.f34554c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f34553b = false;
        view.removeCallbacks(this.f34554c);
    }
}
