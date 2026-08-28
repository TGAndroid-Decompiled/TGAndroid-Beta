package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
public final class q0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f23711a;
    public final w0 f23712b;

    public q0(w0 w0Var, float f10) {
        this.f23712b = w0Var;
        this.f23711a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        w0 w0Var = this.f23712b;
        w0Var.f23906e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = w0Var.f23906e.getX();
        float f10 = this.f23711a;
        if (x10 != f10) {
            fg.g gVar = w0Var.f23906e;
            gVar.setTranslationX(f10 - gVar.getX());
        }
        w0Var.f23906e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(gr.f28844f).start();
        return true;
    }
}
