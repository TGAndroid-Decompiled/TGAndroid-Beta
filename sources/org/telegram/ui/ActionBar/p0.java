package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.qr;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f19665a;
    public final v0 f19666b;

    public p0(v0 v0Var, float f7) {
        this.f19666b = v0Var;
        this.f19665a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f19666b;
        v0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = v0Var.e.getX();
        float f7 = this.f19665a;
        if (x10 != f7) {
            ci.h2 h2Var = v0Var.e;
            h2Var.setTranslationX(f7 - h2Var.getX());
        }
        v0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(qr.f27715f).start();
        return true;
    }
}
