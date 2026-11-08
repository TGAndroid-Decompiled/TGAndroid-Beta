package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f27710a;
    public final r0 f27711b;

    public k0(r0 r0Var, float f10) {
        this.f27711b = r0Var;
        this.f27710a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        r0 r0Var = this.f27711b;
        r0Var.f28429e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = r0Var.f28429e.getX();
        float f10 = this.f27710a;
        if (x10 != f10) {
            ah.i iVar = r0Var.f28429e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        r0Var.f28429e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(xq.f40366f).start();
        return true;
    }
}
