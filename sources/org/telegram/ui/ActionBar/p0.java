package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.pr;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21273a;
    public final v0 f21274b;

    public p0(v0 v0Var, float f7) {
        this.f21274b = v0Var;
        this.f21273a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f21274b;
        v0Var.f21383e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.f21383e.getX();
        float f7 = this.f21273a;
        if (x10 != f7) {
            di.h2 h2Var = v0Var.f21383e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.f21383e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(pr.f29466f).start();
        return true;
    }
}
