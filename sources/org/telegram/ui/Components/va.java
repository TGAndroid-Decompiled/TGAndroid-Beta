package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class va extends org.telegram.ui.ActionBar.k {
    public final pv0 f28673t1;
    public final za f28674u1;

    public va(za zaVar, Context context, pv0 pv0Var) {
        super(context, null);
        this.f28674u1 = zaVar;
        this.f28673t1 = pv0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        za zaVar = this.f28674u1;
        if (zaVar.L && zaVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f28673t1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f28674u1.M();
    }
}
