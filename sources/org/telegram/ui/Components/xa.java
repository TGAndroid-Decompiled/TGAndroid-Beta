package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xa extends org.telegram.ui.ActionBar.k {
    public final pv0 f29975t1;
    public final bb f29976u1;

    public xa(bb bbVar, Context context, pv0 pv0Var) {
        super(context, null);
        this.f29976u1 = bbVar;
        this.f29975t1 = pv0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar = this.f29976u1;
        if (bbVar.L && bbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f29975t1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f29976u1.M();
    }
}
