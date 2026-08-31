package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.pr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f22233a;
    public final w0 f22234b;

    public q0(w0 w0Var, float f10) {
        this.f22234b = w0Var;
        this.f22233a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f22234b;
        w0Var.f22349e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.f22349e.getX();
        float f10 = this.f22233a;
        if (x10 != f10) {
            lg.f fVar = w0Var.f22349e;
            fVar.setTranslationX(f10 - fVar.getX());
        }
        w0Var.f22349e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(pr.f30183f).start();
        return true;
    }
}
