package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class mw extends org.telegram.ui.Components.fz {
    public final ww B0;

    public mw(ww wwVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.B0 = wwVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.f51602n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
