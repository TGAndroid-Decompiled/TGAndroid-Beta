package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kv extends jv {
    public final lv P;

    public kv(lv lvVar, Context context, int i7) {
        super(lvVar.f37250s, context, i7);
        this.P = lvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
