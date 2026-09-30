package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class cw extends bw {
    public final dw K;

    public cw(dw dwVar, Context context, int i10, int i11) {
        super(dwVar.f23728s, context, i10, i11);
        this.K = dwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
