package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class na extends org.telegram.ui.ActionBar.k {

    public final zu0 f30909p1;

    public final qa f30910q1;

    public na(qa qaVar, Context context, zu0 zu0Var) {
        super(context, null);
        this.f30910q1 = qaVar;
        this.f30909p1 = zu0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qa qaVar = this.f30910q1;
        if (qaVar.H && qaVar.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.f30909p1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f30910q1.M();
    }
}
