package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xa extends org.telegram.ui.ActionBar.k {
    public final vw0 f34677x1;
    public final bb f34678y1;

    public xa(bb bbVar, Context context, vw0 vw0Var) {
        super(context, null);
        this.f34678y1 = bbVar;
        this.f34677x1 = vw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar = this.f34678y1;
        if (bbVar.L && bbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f34677x1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f34678y1.M();
    }
}
