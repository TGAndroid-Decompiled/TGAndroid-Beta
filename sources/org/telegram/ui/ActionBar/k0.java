package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f27694a;
    public final r0 f27695b;

    public k0(r0 r0Var, float f10) {
        this.f27695b = r0Var;
        this.f27694a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        r0 r0Var = this.f27695b;
        r0Var.f28430e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = r0Var.f28430e.getX();
        float f10 = this.f27694a;
        if (x10 != f10) {
            ah.i iVar = r0Var.f28430e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        r0Var.f28430e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(xq.f40458f).start();
        return true;
    }
}
