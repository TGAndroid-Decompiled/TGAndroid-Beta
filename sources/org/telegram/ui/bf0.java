package org.telegram.ui;

import android.view.View;
public final class bf0 implements View.OnAttachStateChangeListener {
    public boolean f32101b;
    public final cf0 d;
    public long f32100a = System.currentTimeMillis();
    public final af0 f32102c = new af0(this, 0);

    public bf0(cf0 cf0Var) {
        this.d = cf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f32101b = true;
        view.post(this.f32102c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f32101b = false;
        view.removeCallbacks(this.f32102c);
    }
}
