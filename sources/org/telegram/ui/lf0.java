package org.telegram.ui;

import android.view.View;
public final class lf0 implements View.OnAttachStateChangeListener {
    public boolean f37946b;
    public final mf0 d;
    public long f37945a = System.currentTimeMillis();
    public final kf0 f37947c = new kf0(this, 0);

    public lf0(mf0 mf0Var) {
        this.d = mf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f37946b = true;
        view.post(this.f37947c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f37946b = false;
        view.removeCallbacks(this.f37947c);
    }
}
