package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class iv extends hv {
    public final jv P;

    public iv(jv jvVar, Context context, int i7) {
        super(jvVar.f36539s, context, i7);
        this.P = jvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
