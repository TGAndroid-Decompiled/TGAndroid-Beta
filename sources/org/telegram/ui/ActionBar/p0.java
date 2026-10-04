package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.tr;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21446a;
    public final v0 f21447b;

    public p0(v0 v0Var, float f7) {
        this.f21447b = v0Var;
        this.f21446a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f21447b;
        v0Var.f21580e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.f21580e.getX();
        float f7 = this.f21446a;
        if (x10 != f7) {
            ci.h2 h2Var = v0Var.f21580e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.f21580e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(tr.f31147f).start();
        return true;
    }
}
