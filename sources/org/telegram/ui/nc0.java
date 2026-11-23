package org.telegram.ui;

import android.view.View;
public final class nc0 implements View.OnAttachStateChangeListener {
    public boolean f50292b;
    public final oc0 d;
    public long f50291a = System.currentTimeMillis();
    public final mc0 f50293c = new mc0(this, 0);

    public nc0(oc0 oc0Var) {
        this.d = oc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50292b = true;
        view.post(this.f50293c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50292b = false;
        view.removeCallbacks(this.f50293c);
    }
}
