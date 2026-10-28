package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ds;
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f22926a;
    public final w0 f22927b;

    public p0(w0 w0Var, float f7) {
        this.f22927b = w0Var;
        this.f22926a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f22927b;
        w0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x9 = w0Var.e.getX();
        float f7 = this.f22926a;
        if (x9 != f7) {
            fi.c2 c2Var = w0Var.e;
            c2Var.setTranslationX(f7 - c2Var.getX());
        }
        w0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(ds.f27530f).start();
        return true;
    }
}
