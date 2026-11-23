package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.kr;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29195a;
    public final q0 f29196b;

    public k0(q0 q0Var, float f10) {
        this.f29196b = q0Var;
        this.f29195a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        q0 q0Var = this.f29196b;
        q0Var.f29964e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = q0Var.f29964e.getX();
        float f10 = this.f29195a;
        if (x10 != f10) {
            ah.i iVar = q0Var.f29964e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        q0Var.f29964e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(kr.f36858f).start();
        return true;
    }
}
