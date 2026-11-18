package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class hj extends org.telegram.ui.Components.p01 {
    public final bn f48408e;

    public hj(bn bnVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.f48408e = bnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            bn bnVar = this.f48408e;
            kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
            if (!kVar.y() && !bnVar.Y9()) {
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
