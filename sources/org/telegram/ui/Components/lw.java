package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class lw extends kw {
    public final mw K;

    public lw(mw mwVar, Context context, int i10) {
        super(mwVar.f27530s, context, i10);
        this.K = mwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
