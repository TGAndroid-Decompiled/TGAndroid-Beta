package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class fw extends ew {
    public final gw O;

    public fw(gw gwVar, Context context, int i10) {
        super(gwVar.f26803s, context, i10);
        this.O = gwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
