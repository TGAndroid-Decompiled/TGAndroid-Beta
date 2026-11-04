package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ia extends org.telegram.ui.ActionBar.k {
    public final qt0 G1;
    public final ma H1;

    public ia(ma maVar, Context context, qt0 qt0Var) {
        super(context, null);
        this.H1 = maVar;
        this.G1 = qt0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ma maVar = this.H1;
        if (maVar.D1 && maVar.E1) {
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
        this.H1.a1();
    }
}
