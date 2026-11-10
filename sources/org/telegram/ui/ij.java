package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ij extends org.telegram.ui.Components.f01 {
    public final cn f46639e;

    public ij(cn cnVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.f46639e = cnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            cn cnVar = this.f46639e;
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar.x() && !cnVar.X9()) {
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
