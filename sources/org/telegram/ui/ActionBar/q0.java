package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.nr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f20530a;
    public final w0 f20531b;

    public q0(w0 w0Var, float f10) {
        this.f20531b = w0Var;
        this.f20530a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f20531b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f10 = this.f20530a;
        if (x10 != f10) {
            kg.f fVar = w0Var.e;
            fVar.setTranslationX(f10 - fVar.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(nr.f27346f).start();
        return true;
    }
}
