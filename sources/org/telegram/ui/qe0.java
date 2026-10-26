package org.telegram.ui;

import android.view.View;
public final class qe0 implements View.OnAttachStateChangeListener {
    public boolean f42821b;
    public final re0 d;
    public long f42820a = System.currentTimeMillis();
    public final pe0 f42822c = new pe0(this, 0);

    public qe0(re0 re0Var) {
        this.d = re0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42821b = true;
        view.post(this.f42822c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42821b = false;
        view.removeCallbacks(this.f42822c);
    }
}
