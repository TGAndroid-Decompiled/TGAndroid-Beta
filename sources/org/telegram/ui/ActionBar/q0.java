package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.pr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f22235a;
    public final w0 f22236b;

    public q0(w0 w0Var, float f10) {
        this.f22236b = w0Var;
        this.f22235a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f22236b;
        w0Var.f22351e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.f22351e.getX();
        float f10 = this.f22235a;
        if (x10 != f10) {
            lg.f fVar = w0Var.f22351e;
            fVar.setTranslationX(f10 - fVar.getX());
        }
        w0Var.f22351e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(pr.f30168f).start();
        return true;
    }
}
