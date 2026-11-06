package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ja extends org.telegram.ui.ActionBar.k {
    public final rt0 F1;
    public final na G1;

    public ja(na naVar, Context context, rt0 rt0Var) {
        super(context, null);
        this.G1 = naVar;
        this.F1 = rt0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        na naVar = this.G1;
        if (naVar.C1 && naVar.D1) {
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
