package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.tr;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21450a;
    public final v0 f21451b;

    public p0(v0 v0Var, float f7) {
        this.f21451b = v0Var;
        this.f21450a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f21451b;
        v0Var.f21584e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.f21584e.getX();
        float f7 = this.f21450a;
        if (x10 != f7) {
            ci.h2 h2Var = v0Var.f21584e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.f21584e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(tr.f31215f).start();
        return true;
    }
}
