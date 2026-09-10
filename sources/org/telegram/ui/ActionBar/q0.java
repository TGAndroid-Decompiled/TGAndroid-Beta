package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.wr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f18569a;
    public final w0 f18570b;

    public q0(w0 w0Var, float f7) {
        this.f18570b = w0Var;
        this.f18569a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f18570b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f7 = this.f18569a;
        if (x10 != f7) {
            bi.t2 t2Var = w0Var.e;
            t2Var.setTranslationX(f7 - t2Var.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(wr.f28819f).start();
        return true;
    }
}
