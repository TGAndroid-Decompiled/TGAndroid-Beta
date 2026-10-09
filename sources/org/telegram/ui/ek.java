package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ek extends org.telegram.ui.Components.f31 {
    public final zn f37279e;

    public ek(zn znVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f37279e = znVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            zn znVar = this.f37279e;
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar.t() && !znVar.F9()) {
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
