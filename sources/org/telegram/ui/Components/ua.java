package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ua extends org.telegram.ui.ActionBar.l {
    public final hv0 f33180p1;
    public final xa f33181q1;

    public ua(xa xaVar, Context context, hv0 hv0Var) {
        super(context, null);
        this.f33181q1 = xaVar;
        this.f33180p1 = hv0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xa xaVar = this.f33181q1;
        if (xaVar.H && xaVar.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f9) {
        if (getAlpha() != f9) {
            super.setAlpha(f9);
            this.f33180p1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f33181q1.L();
    }
}
