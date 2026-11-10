package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.wq;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f27632a;
    public final r0 f27633b;

    public k0(r0 r0Var, float f10) {
        this.f27633b = r0Var;
        this.f27632a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        r0 r0Var = this.f27633b;
        r0Var.f28435e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = r0Var.f28435e.getX();
        float f10 = this.f27632a;
        if (x10 != f10) {
            ah.i iVar = r0Var.f28435e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        r0Var.f28435e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(wq.f40046f).start();
        return true;
    }
}
