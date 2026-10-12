package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.es;
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f20552a;
    public final u0 f20553b;

    public o0(u0 u0Var, float f7) {
        this.f20553b = u0Var;
        this.f20552a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        u0 u0Var = this.f20553b;
        u0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.e.getX();
        float f7 = this.f20552a;
        if (x10 != f7) {
            di.g2 g2Var = u0Var.e;
            g2Var.setTranslationX(f7 - g2Var.getX());
        }
        u0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(es.f24771f).start();
        return true;
    }
}
