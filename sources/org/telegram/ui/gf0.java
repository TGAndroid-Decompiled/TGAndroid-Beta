package org.telegram.ui;

import android.view.View;
public final class gf0 implements View.OnAttachStateChangeListener {
    public boolean f36688b;
    public final hf0 d;
    public long f36687a = System.currentTimeMillis();
    public final ff0 f36689c = new ff0(this, 0);

    public gf0(hf0 hf0Var) {
        this.d = hf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f36688b = true;
        view.post(this.f36689c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f36688b = false;
        view.removeCallbacks(this.f36689c);
    }
}
