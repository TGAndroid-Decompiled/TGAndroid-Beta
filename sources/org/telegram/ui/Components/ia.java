package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ia extends org.telegram.ui.ActionBar.l {
    public final st0 F1;
    public final ma G1;

    public ia(ma maVar, Context context, st0 st0Var) {
        super(context, null);
        this.G1 = maVar;
        this.F1 = st0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ma maVar = this.G1;
        if (maVar.F1 && maVar.G1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.F1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.G1.a1();
    }
}
