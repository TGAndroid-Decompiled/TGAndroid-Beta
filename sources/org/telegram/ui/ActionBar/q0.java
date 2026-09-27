package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.sr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f19716a;
    public final w0 f19717b;

    public q0(w0 w0Var, float f7) {
        this.f19717b = w0Var;
        this.f19716a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f19717b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f7 = this.f19716a;
        if (x10 != f7) {
            ci.h2 h2Var = w0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(sr.f28359f).start();
        return true;
    }
}
