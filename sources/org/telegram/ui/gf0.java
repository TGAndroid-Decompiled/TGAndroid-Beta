package org.telegram.ui;

import android.view.View;
public final class gf0 implements View.OnAttachStateChangeListener {
    public boolean f33086b;
    public final hf0 d;
    public long f33085a = System.currentTimeMillis();
    public final ff0 f33087c = new ff0(this, 0);

    public gf0(hf0 hf0Var) {
        this.d = hf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f33086b = true;
        view.post(this.f33087c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f33086b = false;
        view.removeCallbacks(this.f33087c);
    }
}
