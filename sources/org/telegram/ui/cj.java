package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class cj extends org.telegram.ui.Components.e01 {
    public final wm f44363e;

    public cj(wm wmVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.f44363e = wmVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            wm wmVar = this.f44363e;
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (!kVar.v() && !wmVar.W9()) {
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
