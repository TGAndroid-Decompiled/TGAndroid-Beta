package org.telegram.ui;

import android.view.View;
public final class if0 implements View.OnAttachStateChangeListener {
    public boolean f34555b;
    public final jf0 d;
    public long f34554a = System.currentTimeMillis();
    public final hf0 f34556c = new hf0(this, 0);

    public if0(jf0 jf0Var) {
        this.d = jf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34555b = true;
        view.post(this.f34556c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f34555b = false;
        view.removeCallbacks(this.f34556c);
    }
}
