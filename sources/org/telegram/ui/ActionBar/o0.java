package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.zr;
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21716a;
    public final u0 f21717b;

    public o0(u0 u0Var, float f7) {
        this.f21717b = u0Var;
        this.f21716a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        u0 u0Var = this.f21717b;
        u0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.e.getX();
        float f7 = this.f21716a;
        if (x10 != f7) {
            ei.e2 e2Var = u0Var.e;
            e2Var.setTranslationX(f7 - e2Var.getX());
        }
        u0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(zr.f33337f).start();
        return true;
    }
}
