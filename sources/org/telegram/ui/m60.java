package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class m60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35987a;
    public final o60 f35988b;

    public m60(o60 o60Var, FrameLayout frameLayout) {
        this.f35988b = o60Var;
        this.f35987a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35987a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        o60 o60Var = this.f35988b;
        if (o60Var.f36660w0 == null) {
            o60Var.f36660w0 = (wc) o60Var.y0(o60Var.W);
        }
        o60Var.f36660w0.f39337f.setOnClickListener(new g60(this, 1));
    }
}
