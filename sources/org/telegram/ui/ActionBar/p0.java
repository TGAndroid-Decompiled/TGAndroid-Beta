package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.qr;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f19474a;
    public final v0 f19475b;

    public p0(v0 v0Var, float f7) {
        this.f19475b = v0Var;
        this.f19474a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f19475b;
        v0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.e.getX();
        float f7 = this.f19474a;
        if (x10 != f7) {
            ci.h2 h2Var = v0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(qr.f27420f).start();
        return true;
    }
}
