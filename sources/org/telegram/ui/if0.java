package org.telegram.ui;

import android.view.View;
public final class if0 implements View.OnAttachStateChangeListener {
    public boolean f34560b;
    public final jf0 d;
    public long f34559a = System.currentTimeMillis();
    public final hf0 f34561c = new hf0(this, 0);

    public if0(jf0 jf0Var) {
        this.d = jf0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34560b = true;
        view.post(this.f34561c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f34560b = false;
        view.removeCallbacks(this.f34561c);
    }
}
