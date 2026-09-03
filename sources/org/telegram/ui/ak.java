package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ak extends org.telegram.ui.Components.c21 {
    public final zn e;

    public ak(zn znVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = znVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            zn znVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
