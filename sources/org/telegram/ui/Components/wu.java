package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class wu extends vu {
    public final xu P;

    public wu(xu xuVar, Context context, int i3) {
        super(xuVar.f40482s, context, i3);
        this.P = xuVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
