package org.telegram.ui;

import android.view.View;
public final class gf0 implements View.OnAttachStateChangeListener {
    public boolean f36661b;
    public final hf0 d;
    public long f36660a = System.currentTimeMillis();
    public final ff0 f36662c = new ff0(this, 0);

    public gf0(hf0 hf0Var) {
        this.d = hf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f36661b = true;
        view.post(this.f36662c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f36661b = false;
        view.removeCallbacks(this.f36662c);
    }
}
