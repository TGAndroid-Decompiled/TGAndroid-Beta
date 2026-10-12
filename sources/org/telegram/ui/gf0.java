package org.telegram.ui;

import android.view.View;
public final class gf0 implements View.OnAttachStateChangeListener {
    public boolean f38035b;
    public final hf0 d;
    public long f38034a = System.currentTimeMillis();
    public final ff0 f38036c = new ff0(this, 0);

    public gf0(hf0 hf0Var) {
        this.d = hf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f38035b = true;
        view.post(this.f38036c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f38035b = false;
        view.removeCallbacks(this.f38036c);
    }
}
