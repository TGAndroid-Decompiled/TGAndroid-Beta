package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class hw extends gw {
    public final iw K;

    public hw(iw iwVar, Context context, int i10) {
        super(iwVar.f27348s, context, i10);
        this.K = iwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
