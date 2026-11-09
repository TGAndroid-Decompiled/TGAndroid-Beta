package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class yu extends xu {
    public final zu O;

    public yu(zu zuVar, Context context, int i7) {
        super(zuVar.f41140s, context, i7);
        this.O = zuVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
