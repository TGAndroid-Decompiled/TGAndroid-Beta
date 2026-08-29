package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.jr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f23733a;
    public final w0 f23734b;

    public q0(w0 w0Var, float f9) {
        this.f23734b = w0Var;
        this.f23733a = f9;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f23734b;
        w0Var.f23920e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x4 = w0Var.f23920e.getX();
        float f9 = this.f23733a;
        if (x4 != f9) {
            ig.f fVar = w0Var.f23920e;
            fVar.setTranslationX(f9 - fVar.getX());
        }
        w0Var.f23920e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(jr.f29800f).start();
        return true;
    }
}
