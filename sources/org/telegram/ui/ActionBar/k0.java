package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.nr;
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final float f29179a;
    public final q0 f29180b;

    public k0(q0 q0Var, float f10) {
        this.f29180b = q0Var;
        this.f29179a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        q0 q0Var = this.f29180b;
        q0Var.f29907e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = q0Var.f29907e.getX();
        float f10 = this.f29179a;
        if (x10 != f10) {
            ah.i iVar = q0Var.f29907e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        q0Var.f29907e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(nr.f37960f).start();
        return true;
    }
}
