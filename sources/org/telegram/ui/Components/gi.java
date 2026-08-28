package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class gi extends m10 {
    public final ki F;

    public gi(Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var);
        this.F = kiVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.F.t1(this.f30664r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
