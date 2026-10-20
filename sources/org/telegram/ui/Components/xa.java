package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xa extends org.telegram.ui.ActionBar.k {
    public final lw0 f32384u1;
    public final bb f32385v1;

    public xa(bb bbVar, Context context, lw0 lw0Var) {
        super(context, null);
        this.f32385v1 = bbVar;
        this.f32384u1 = lw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar = this.f32385v1;
        if (bbVar.L && bbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f32384u1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f32385v1.N();
    }
}
