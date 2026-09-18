package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class bk extends org.telegram.ui.Components.p21 {
    public final zn e;

    public bk(zn znVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.e = znVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            zn znVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
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
