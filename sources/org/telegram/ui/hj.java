package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class hj extends org.telegram.ui.Components.q01 {
    public final bn f48411e;

    public hj(bn bnVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.f48411e = bnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            bn bnVar = this.f48411e;
            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            if (!kVar.x() && !bnVar.Y9()) {
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
