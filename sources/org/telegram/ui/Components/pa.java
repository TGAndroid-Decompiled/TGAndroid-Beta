package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pa extends org.telegram.ui.ActionBar.k {
    public final pv0 f30025q1;
    public final sa f30026r1;

    public pa(sa saVar, Context context, pv0 pv0Var) {
        super(context, null);
        this.f30026r1 = saVar;
        this.f30025q1 = pv0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.f30026r1;
        if (saVar.I && saVar.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f30025q1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f30026r1.M();
    }
}
