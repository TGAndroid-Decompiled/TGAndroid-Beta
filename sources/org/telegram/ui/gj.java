package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class gj extends org.telegram.ui.Components.h01 {
    public final an f47463e;

    public gj(an anVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.f47463e = anVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            an anVar = this.f47463e;
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (!kVar.x() && !anVar.Y9()) {
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
