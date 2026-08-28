package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pa extends org.telegram.ui.ActionBar.k {
    public final xu0 f31602p1;
    public final sa f31603q1;

    public pa(sa saVar, Context context, xu0 xu0Var) {
        super(context, null);
        this.f31603q1 = saVar;
        this.f31602p1 = xu0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sa saVar = this.f31603q1;
        if (saVar.H && saVar.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f31602p1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f31603q1.L();
    }
}
