package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class kv extends jv {
    public final lv G;

    public kv(lv lvVar, Context context, int i9, int i10) {
        super(lvVar.f30562s, context, i9, i10);
        this.G = lvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
