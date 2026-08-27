package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.er;

public final class p0 implements ViewTreeObserver.OnPreDrawListener {

    public final float f23704a;

    public final v0 f23705b;

    public p0(v0 v0Var, float f10) {
        this.f23705b = v0Var;
        this.f23704a = f10;
    }

    @Override
    public final boolean onPreDraw() {
        v0 v0Var = this.f23705b;
        v0Var.f23859e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x8 = v0Var.f23859e.getX();
        float f10 = this.f23704a;
        if (x8 != f10) {
            gg.g gVar = v0Var.f23859e;
            gVar.setTranslationX(f10 - gVar.getX());
        }
        v0Var.f23859e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(er.f28122f).start();
        return true;
    }
}
