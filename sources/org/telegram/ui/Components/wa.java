package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wa extends org.telegram.ui.ActionBar.k {
    public final cw0 f29989u1;
    public final ab f29990v1;

    public wa(ab abVar, Context context, cw0 cw0Var) {
        super(context, null);
        this.f29990v1 = abVar;
        this.f29989u1 = cw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab abVar = this.f29990v1;
        if (abVar.L && abVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f29989u1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f29990v1.M();
    }
}
