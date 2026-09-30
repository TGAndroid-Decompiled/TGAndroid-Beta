package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.sr;
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f19668a;
    public final u0 f19669b;

    public o0(u0 u0Var, float f7) {
        this.f19669b = u0Var;
        this.f19668a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        u0 u0Var = this.f19669b;
        u0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.e.getX();
        float f7 = this.f19668a;
        if (x10 != f7) {
            ci.h2 h2Var = u0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        u0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(sr.f28346f).start();
        return true;
    }
}
