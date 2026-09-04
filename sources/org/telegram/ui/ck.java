package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ck extends org.telegram.ui.Components.z11 {
    public final co f35166e;

    public ck(co coVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f35166e = coVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            co coVar = this.f35166e;
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (!kVar.s() && !coVar.A9()) {
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
