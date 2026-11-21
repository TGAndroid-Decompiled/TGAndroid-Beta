package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.nr;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29176a;
    public final q0 f29177b;

    public k0(q0 q0Var, float f10) {
        this.f29177b = q0Var;
        this.f29176a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        q0 q0Var = this.f29177b;
        q0Var.f29904e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = q0Var.f29904e.getX();
        float f10 = this.f29176a;
        if (x10 != f10) {
            ah.i iVar = q0Var.f29904e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        q0Var.f29904e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(nr.f37956f).start();
        return true;
    }
}
