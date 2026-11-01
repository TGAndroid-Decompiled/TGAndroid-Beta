package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class da extends org.telegram.ui.ActionBar.l {
    public final vu0 F1;
    public final ha G1;

    public da(ha haVar, Context context, vu0 vu0Var) {
        super(context, null);
        this.G1 = haVar;
        this.F1 = vu0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ha haVar = this.G1;
        if (haVar.C1 && haVar.D1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.F1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.G1.a1();
    }
}
