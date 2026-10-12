package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.js;
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21179a;
    public final u0 f21180b;

    public o0(u0 u0Var, float f7) {
        this.f21180b = u0Var;
        this.f21179a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        u0 u0Var = this.f21180b;
        u0Var.f21314e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.f21314e.getX();
        float f7 = this.f21179a;
        if (x10 != f7) {
            ci.g2 g2Var = u0Var.f21314e;
            g2Var.setTranslationX(f7 - g2Var.getX());
        }
        u0Var.f21314e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(js.f27627f).start();
        return true;
    }
}
