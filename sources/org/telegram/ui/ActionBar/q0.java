package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.qr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f19506a;
    public final w0 f19507b;

    public q0(w0 w0Var, float f7) {
        this.f19507b = w0Var;
        this.f19506a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f19507b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f7 = this.f19506a;
        if (x10 != f7) {
            ci.h2 h2Var = w0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(qr.f27383f).start();
        return true;
    }
}
