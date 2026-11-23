package org.telegram.ui;

import android.view.View;
public final class oc0 implements View.OnAttachStateChangeListener {
    public boolean f50556b;
    public final pc0 d;
    public long f50555a = System.currentTimeMillis();
    public final nc0 f50557c = new nc0(this, 0);

    public oc0(pc0 pc0Var) {
        this.d = pc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50556b = true;
        view.post(this.f50557c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50556b = false;
        view.removeCallbacks(this.f50557c);
    }
}
