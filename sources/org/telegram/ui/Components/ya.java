package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ya extends org.telegram.ui.ActionBar.k {
    public final lw0 f33132w1;
    public final cb f33133x1;

    public ya(cb cbVar, Context context, lw0 lw0Var) {
        super(context, null);
        this.f33133x1 = cbVar;
        this.f33132w1 = lw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb cbVar = this.f33133x1;
        if (cbVar.L && cbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f33132w1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f33133x1.K();
    }
}
