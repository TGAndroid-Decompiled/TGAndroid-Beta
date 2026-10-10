package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.is;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21457a;
    public final v0 f21458b;

    public p0(v0 v0Var, float f7) {
        this.f21458b = v0Var;
        this.f21457a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f21458b;
        v0Var.f21588e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.f21588e.getX();
        float f7 = this.f21457a;
        if (x10 != f7) {
            ci.g2 g2Var = v0Var.f21588e;
            g2Var.setTranslationX(f7 - g2Var.getX());
        }
        v0Var.f21588e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(is.f27443f).start();
        return true;
    }
}
