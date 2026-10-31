package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class da extends org.telegram.ui.ActionBar.l {
    public final uu0 E1;
    public final ha F1;

    public da(ha haVar, Context context, uu0 uu0Var) {
        super(context, null);
        this.F1 = haVar;
        this.E1 = uu0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ha haVar = this.F1;
        if (haVar.C1 && haVar.D1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.E1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.F1.a1();
    }
}
