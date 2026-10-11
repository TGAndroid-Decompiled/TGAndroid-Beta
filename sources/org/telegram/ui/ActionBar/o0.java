package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.is;
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21441a;
    public final u0 f21442b;

    public o0(u0 u0Var, float f7) {
        this.f21442b = u0Var;
        this.f21441a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        u0 u0Var = this.f21442b;
        u0Var.f21576e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.f21576e.getX();
        float f7 = this.f21441a;
        if (x10 != f7) {
            ci.g2 g2Var = u0Var.f21576e;
            g2Var.setTranslationX(f7 - g2Var.getX());
        }
        u0Var.f21576e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(is.f27500f).start();
        return true;
    }
}
