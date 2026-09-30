package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ya extends org.telegram.ui.ActionBar.k {
    public final dw0 f30687t1;
    public final cb f30688u1;

    public ya(cb cbVar, Context context, dw0 dw0Var) {
        super(context, null);
        this.f30688u1 = cbVar;
        this.f30687t1 = dw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb cbVar = this.f30688u1;
        if (cbVar.L && cbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f30687t1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f30688u1.M();
    }
}
