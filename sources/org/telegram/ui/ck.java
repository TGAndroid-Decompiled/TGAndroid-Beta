package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ck extends org.telegram.ui.Components.a21 {
    public final bo e;

    public ck(bo boVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.e = boVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            bo boVar = this.e;
            kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            if (!kVar.s() && !boVar.A9()) {
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
