package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.bs;
public final class o0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f21715a;
    public final u0 f21716b;

    public o0(u0 u0Var, float f7) {
        this.f21716b = u0Var;
        this.f21715a = f7;
    }

    @Override
    public final boolean onPreDraw() {
        u0 u0Var = this.f21716b;
        u0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = u0Var.e.getX();
        float f7 = this.f21715a;
        if (x10 != f7) {
            ei.e2 e2Var = u0Var.e;
            e2Var.setTranslationX(f7 - e2Var.getX());
        }
        u0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(bs.f25133f).start();
        return true;
    }
}
