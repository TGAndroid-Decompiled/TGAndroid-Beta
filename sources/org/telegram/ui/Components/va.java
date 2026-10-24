package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class va extends org.telegram.ui.ActionBar.k {
    public final nw0 f31390v1;
    public final za f31391w1;

    public va(za zaVar, Context context, nw0 nw0Var) {
        super(context, null);
        this.f31391w1 = zaVar;
        this.f31390v1 = nw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        za zaVar = this.f31391w1;
        if (zaVar.L && zaVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f31390v1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f31391w1.M();
    }
}
