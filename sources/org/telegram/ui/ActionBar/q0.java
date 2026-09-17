package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.qr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f19505a;
    public final w0 f19506b;

    public q0(w0 w0Var, float f7) {
        this.f19506b = w0Var;
        this.f19505a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f19506b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.e.getX();
        float f7 = this.f19505a;
        if (x10 != f7) {
            ci.h2 h2Var = w0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(qr.f27380f).start();
        return true;
    }
}
