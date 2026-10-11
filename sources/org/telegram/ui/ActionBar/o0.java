package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.is;
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21405a;
    public final u0 f21406b;

    public o0(u0 u0Var, float f7) {
        this.f21406b = u0Var;
        this.f21405a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        u0 u0Var = this.f21406b;
        u0Var.f21540e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.f21540e.getX();
        float f7 = this.f21405a;
        if (x10 != f7) {
            ci.g2 g2Var = u0Var.f21540e;
            g2Var.setTranslationX(f7 - g2Var.getX());
        }
        u0Var.f21540e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(is.f27451f).start();
        return true;
    }
}
