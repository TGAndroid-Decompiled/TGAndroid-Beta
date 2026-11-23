package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.nr;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29145a;
    public final q0 f29146b;

    public k0(q0 q0Var, float f10) {
        this.f29146b = q0Var;
        this.f29145a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        q0 q0Var = this.f29146b;
        q0Var.f29873e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = q0Var.f29873e.getX();
        float f10 = this.f29145a;
        if (x10 != f10) {
            ah.i iVar = q0Var.f29873e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        q0Var.f29873e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(nr.f37917f).start();
        return true;
    }
}
