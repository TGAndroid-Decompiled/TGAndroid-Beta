package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
public final class j0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f27649a;
    public final q0 f27650b;

    public j0(q0 q0Var, float f10) {
        this.f27650b = q0Var;
        this.f27649a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        q0 q0Var = this.f27650b;
        q0Var.f28445e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = q0Var.f28445e.getX();
        float f10 = this.f27649a;
        if (x10 != f10) {
            bh.g gVar = q0Var.f28445e;
            gVar.setTranslationX(f10 - gVar.getX());
        }
        q0Var.f28445e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(xq.f40452f).start();
        return true;
    }
}
