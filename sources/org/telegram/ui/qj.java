package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class qj extends org.telegram.ui.Components.g11 {
    public final qn f41811e;

    public qj(qn qnVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.f41811e = qnVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            qn qnVar = this.f41811e;
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (!kVar.s() && !qnVar.A9()) {
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
