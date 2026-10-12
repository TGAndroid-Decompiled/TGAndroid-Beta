package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ik extends org.telegram.ui.Components.l31 {
    public final eo f38932e;

    public ik(eo eoVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f38932e = eoVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            eo eoVar = this.f38932e;
            kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
            if (!kVar.u() && !eoVar.F9()) {
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
