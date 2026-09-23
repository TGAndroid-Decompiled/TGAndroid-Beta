package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class m60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout f35161a;
    public final p60 f35162b;

    public m60(p60 p60Var, FrameLayout frameLayout) {
        this.f35162b = p60Var;
        this.f35161a = frameLayout;
    }

    @Override
    public final void onGlobalLayout() {
        this.f35161a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        p60 p60Var = this.f35162b;
        if (p60Var.f36030z0 == null) {
            p60Var.f36030z0 = (tc) p60Var.y0(p60Var.Z);
        }
        p60Var.f36030z0.f37604f.setOnClickListener(new h60(this, 1));
    }
}
