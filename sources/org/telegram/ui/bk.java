package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class bk extends org.telegram.ui.Components.p21 {
    public final xn e;

    public bk(xn xnVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.e = xnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            xn xnVar = this.e;
            lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
            if (!lVar.t() && !xnVar.A9()) {
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
