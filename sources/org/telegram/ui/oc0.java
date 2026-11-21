package org.telegram.ui;

import android.view.View;
public final class oc0 implements View.OnAttachStateChangeListener {
    public boolean f50552b;
    public final pc0 d;
    public long f50551a = System.currentTimeMillis();
    public final nc0 f50553c = new nc0(this, 0);

    public oc0(pc0 pc0Var) {
        this.d = pc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50552b = true;
        view.post(this.f50553c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50552b = false;
        view.removeCallbacks(this.f50553c);
    }
}
