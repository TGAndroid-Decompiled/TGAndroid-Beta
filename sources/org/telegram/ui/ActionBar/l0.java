package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.lr;
public final class l0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29194a;
    public final r0 f29195b;

    public l0(r0 r0Var, float f10) {
        this.f29195b = r0Var;
        this.f29194a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        r0 r0Var = this.f29195b;
        r0Var.f29923e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = r0Var.f29923e.getX();
        float f10 = this.f29194a;
        if (x10 != f10) {
            ah.i iVar = r0Var.f29923e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        r0Var.f29923e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(lr.f37208f).start();
        return true;
    }
}
