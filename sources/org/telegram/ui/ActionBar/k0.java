package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.er;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29333a;
    public final q0 f29334b;

    public k0(q0 q0Var, float f10) {
        this.f29334b = q0Var;
        this.f29333a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        q0 q0Var = this.f29334b;
        q0Var.f29502e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = q0Var.f29502e.getX();
        float f10 = this.f29333a;
        if (x10 != f10) {
            ah.i iVar = q0Var.f29502e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        q0Var.f29502e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(er.f34420f).start();
        return true;
    }
}
