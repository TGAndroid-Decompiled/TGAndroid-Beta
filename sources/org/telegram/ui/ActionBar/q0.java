package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.mr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f20505a;
    public final w0 f20506b;

    public q0(w0 w0Var, float f10) {
        this.f20506b = w0Var;
        this.f20505a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f20506b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f10 = this.f20505a;
        if (x10 != f10) {
            kg.f fVar = w0Var.e;
            fVar.setTranslationX(f10 - fVar.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(mr.f27122f).start();
        return true;
    }
}
