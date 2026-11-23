package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ma extends org.telegram.ui.ActionBar.k {
    public final cu0 G1;
    public final ra H1;

    public ma(ra raVar, Context context, cu0 cu0Var) {
        super(context, null);
        this.H1 = raVar;
        this.G1 = cu0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ra raVar = this.H1;
        if (raVar.G1 && raVar.H1) {
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
        this.H1.b1();
    }
}
