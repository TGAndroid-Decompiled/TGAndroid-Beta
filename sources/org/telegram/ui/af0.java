package org.telegram.ui;

import android.view.View;
public final class af0 implements View.OnAttachStateChangeListener {
    public boolean f32153b;
    public final bf0 d;
    public long f32152a = System.currentTimeMillis();
    public final ze0 f32154c = new ze0(this, 0);

    public af0(bf0 bf0Var) {
        this.d = bf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f32153b = true;
        view.post(this.f32154c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f32153b = false;
        view.removeCallbacks(this.f32154c);
    }
}
