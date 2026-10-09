package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class pw extends ow {
    public final qw K;

    public pw(qw qwVar, Context context, int i10) {
        super(qwVar.f30297s, context, i10);
        this.K = qwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
