package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xa extends org.telegram.ui.ActionBar.l {
    public final cw0 f30387y1;
    public final bb f30388z1;

    public xa(bb bbVar, Context context, cw0 cw0Var) {
        super(context, null);
        this.f30388z1 = bbVar;
        this.f30387y1 = cw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar = this.f30388z1;
        if (bbVar.L && bbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f30387y1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f30388z1.M();
    }
}
