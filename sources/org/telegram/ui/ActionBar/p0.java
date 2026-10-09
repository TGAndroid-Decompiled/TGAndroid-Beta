package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.hs;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21453a;
    public final v0 f21454b;

    public p0(v0 v0Var, float f7) {
        this.f21454b = v0Var;
        this.f21453a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f21454b;
        v0Var.f21584e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.f21584e.getX();
        float f7 = this.f21453a;
        if (x10 != f7) {
            ci.g2 g2Var = v0Var.f21584e;
            g2Var.setTranslationX(f7 - g2Var.getX());
        }
        v0Var.f21584e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(hs.f27118f).start();
        return true;
    }
}
