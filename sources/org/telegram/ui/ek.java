package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ek extends org.telegram.ui.Components.o21 {
    public final eo e;

    public ek(eo eoVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = eoVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            eo eoVar = this.e;
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (!lVar.s() && !eoVar.A9()) {
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
