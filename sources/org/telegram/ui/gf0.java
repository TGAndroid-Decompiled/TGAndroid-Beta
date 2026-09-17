package org.telegram.ui;

import android.view.View;
public final class gf0 implements View.OnAttachStateChangeListener {
    public boolean f36689b;
    public final hf0 d;
    public long f36688a = System.currentTimeMillis();
    public final ff0 f36690c = new ff0(this, 0);

    public gf0(hf0 hf0Var) {
        this.d = hf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f36689b = true;
        view.post(this.f36690c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f36689b = false;
        view.removeCallbacks(this.f36690c);
    }
}
