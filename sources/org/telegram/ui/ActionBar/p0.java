package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.pr;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21300a;
    public final v0 f21301b;

    public p0(v0 v0Var, float f7) {
        this.f21301b = v0Var;
        this.f21300a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f21301b;
        v0Var.f21410e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.f21410e.getX();
        float f7 = this.f21300a;
        if (x10 != f7) {
            di.h2 h2Var = v0Var.f21410e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.f21410e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(pr.f29493f).start();
        return true;
    }
}
