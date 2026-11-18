package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.lr;
public final class l0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29192a;
    public final r0 f29193b;

    public l0(r0 r0Var, float f10) {
        this.f29193b = r0Var;
        this.f29192a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        r0 r0Var = this.f29193b;
        r0Var.f29921e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = r0Var.f29921e.getX();
        float f10 = this.f29192a;
        if (x10 != f10) {
            ah.i iVar = r0Var.f29921e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        r0Var.f29921e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(lr.f37208f).start();
        return true;
    }
}
