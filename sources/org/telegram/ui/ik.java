package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ik extends org.telegram.ui.Components.b31 {
    public final fo e;

    public ik(fo foVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.e = foVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            fo foVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if (!kVar.t() && !foVar.F9()) {
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
