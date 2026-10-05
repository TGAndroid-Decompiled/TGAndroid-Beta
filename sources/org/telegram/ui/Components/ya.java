package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ya extends org.telegram.ui.ActionBar.k {
    public final mw0 f33249v1;
    public final cb f33250w1;

    public ya(cb cbVar, Context context, mw0 mw0Var) {
        super(context, null);
        this.f33250w1 = cbVar;
        this.f33249v1 = mw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb cbVar = this.f33250w1;
        if (cbVar.L && cbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f33249v1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f33250w1.K();
    }
}
