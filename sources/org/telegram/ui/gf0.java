package org.telegram.ui;

import android.view.View;
public final class gf0 implements View.OnAttachStateChangeListener {
    public boolean f38033b;
    public final hf0 d;
    public long f38032a = System.currentTimeMillis();
    public final ff0 f38034c = new ff0(this, 0);

    public gf0(hf0 hf0Var) {
        this.d = hf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f38033b = true;
        view.post(this.f38034c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f38033b = false;
        view.removeCallbacks(this.f38034c);
    }
}
