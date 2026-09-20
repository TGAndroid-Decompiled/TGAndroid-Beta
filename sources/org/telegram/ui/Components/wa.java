package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wa extends org.telegram.ui.ActionBar.k {
    public final aw0 f30015u1;
    public final ab f30016v1;

    public wa(ab abVar, Context context, aw0 aw0Var) {
        super(context, null);
        this.f30016v1 = abVar;
        this.f30015u1 = aw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab abVar = this.f30016v1;
        if (abVar.L && abVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f30015u1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f30016v1.M();
    }
}
