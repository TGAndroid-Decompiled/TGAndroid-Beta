package org.telegram.ui;

import android.view.View;
public final class df0 implements View.OnAttachStateChangeListener {
    public boolean f32955b;
    public final ef0 d;
    public long f32954a = System.currentTimeMillis();
    public final cf0 f32956c = new cf0(this, 0);

    public df0(ef0 ef0Var) {
        this.d = ef0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f32955b = true;
        view.post(this.f32956c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f32955b = false;
        view.removeCallbacks(this.f32956c);
    }
}
