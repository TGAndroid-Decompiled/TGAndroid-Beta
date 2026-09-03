package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pa extends org.telegram.ui.ActionBar.k {
    public final qv0 f27815q1;
    public final sa f27816r1;

    public pa(sa saVar, Context context, qv0 qv0Var) {
        super(context, null);
        this.f27816r1 = saVar;
        this.f27815q1 = qv0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.f27816r1;
        if (saVar.I && saVar.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f27815q1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f27816r1.M();
    }
}
