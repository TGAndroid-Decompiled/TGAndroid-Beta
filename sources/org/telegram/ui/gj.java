package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class gj extends org.telegram.ui.Components.e01 {
    public final an f46015e;

    public gj(an anVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.f46015e = anVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            an anVar = this.f46015e;
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (!kVar.v() && !anVar.W9()) {
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
