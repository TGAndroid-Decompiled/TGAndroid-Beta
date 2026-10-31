package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ck extends org.telegram.ui.Components.k11 {
    public final un e;

    public ck(un unVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.e = unVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            un unVar = this.e;
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar.u() && !unVar.M9()) {
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
