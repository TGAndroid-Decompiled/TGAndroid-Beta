package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class sw extends rw {
    public final tw K;

    public sw(tw twVar, Context context, int i10) {
        super(twVar.f30990s, context, i10);
        this.K = twVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
