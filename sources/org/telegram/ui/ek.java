package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ek extends org.telegram.ui.Components.g31 {
    public final zn f37417e;

    public ek(zn znVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f37417e = znVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            zn znVar = this.f37417e;
            kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
            if (!kVar.t() && !znVar.F9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
