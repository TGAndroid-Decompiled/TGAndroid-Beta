package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pa extends org.telegram.ui.ActionBar.k {
    public final qv0 f30012q1;
    public final sa f30013r1;

    public pa(sa saVar, Context context, qv0 qv0Var) {
        super(context, null);
        this.f30013r1 = saVar;
        this.f30012q1 = qv0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.f30013r1;
        if (saVar.I && saVar.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f30012q1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f30013r1.M();
    }
}
