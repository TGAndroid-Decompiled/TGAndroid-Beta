package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wa extends org.telegram.ui.ActionBar.l {
    public final aw0 f28742t1;
    public final ab f28743u1;

    public wa(ab abVar, Context context, aw0 aw0Var) {
        super(context, null);
        this.f28743u1 = abVar;
        this.f28742t1 = aw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab abVar = this.f28743u1;
        if (abVar.L && abVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f28742t1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f28743u1.M();
    }
}
