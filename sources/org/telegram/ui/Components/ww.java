package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class ww extends jx {

    public final yy f34349c3;

    public ww(yy yyVar, Context context) {
        super(yyVar, context);
        this.f34349c3 = yyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f34349c3.f34994f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
