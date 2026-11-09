package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ij extends org.telegram.ui.Components.g01 {
    public final cn f46677e;

    public ij(cn cnVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.f46677e = cnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            cn cnVar = this.f46677e;
            kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!kVar.w() && !cnVar.X9()) {
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
