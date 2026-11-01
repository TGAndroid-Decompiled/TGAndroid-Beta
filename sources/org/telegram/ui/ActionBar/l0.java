package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
public final class l0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f20529a;
    public final t0 f20530b;

    public l0(t0 t0Var, float f7) {
        this.f20530b = t0Var;
        this.f20529a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        t0 t0Var = this.f20530b;
        t0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = t0Var.e.getX();
        float f7 = this.f20529a;
        if (x10 != f7) {
            n0 n0Var = t0Var.e;
            n0Var.setTranslationX(f7 - n0Var.getX());
        }
        t0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(gr.f26523f).start();
        return true;
    }
}
