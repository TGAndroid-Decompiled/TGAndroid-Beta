package org.telegram.ui;

import android.view.View;
public final class qc0 implements View.OnAttachStateChangeListener {
    public boolean f49022b;
    public final rc0 d;
    public long f49021a = System.currentTimeMillis();
    public final pc0 f49023c = new pc0(this, 0);

    public qc0(rc0 rc0Var) {
        this.d = rc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49022b = true;
        view.post(this.f49023c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f49022b = false;
        view.removeCallbacks(this.f49023c);
    }
}
