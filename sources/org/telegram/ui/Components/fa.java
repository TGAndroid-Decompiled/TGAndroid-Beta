package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class fa extends org.telegram.ui.ActionBar.k {
    public final st0 G1;
    public final ja H1;

    public fa(ja jaVar, Context context, st0 st0Var) {
        super(context, null);
        this.H1 = jaVar;
        this.G1 = st0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ja jaVar = this.H1;
        if (jaVar.G1 && jaVar.H1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.G1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.H1.a1();
    }
}
