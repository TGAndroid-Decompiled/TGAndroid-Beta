package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.pr;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21274a;
    public final v0 f21275b;

    public p0(v0 v0Var, float f7) {
        this.f21275b = v0Var;
        this.f21274a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f21275b;
        v0Var.f21384e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.f21384e.getX();
        float f7 = this.f21274a;
        if (x10 != f7) {
            di.h2 h2Var = v0Var.f21384e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.f21384e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(pr.f29467f).start();
        return true;
    }
}
