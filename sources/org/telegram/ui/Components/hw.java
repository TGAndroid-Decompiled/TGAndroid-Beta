package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class hw extends gw {
    public final iw O;

    public hw(iw iwVar, Context context, int i10) {
        super(iwVar.f29388s, context, i10);
        this.O = iwVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
