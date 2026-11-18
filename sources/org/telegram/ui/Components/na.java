package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class na extends org.telegram.ui.ActionBar.k {
    public final au0 G1;
    public final sa H1;

    public na(sa saVar, Context context, au0 au0Var) {
        super(context, null);
        this.H1 = saVar;
        this.G1 = au0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.H1;
        if (saVar.G1 && saVar.H1) {
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
