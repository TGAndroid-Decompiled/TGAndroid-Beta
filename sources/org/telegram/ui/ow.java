package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ow extends org.telegram.ui.Components.iz {
    public final yw C0;

    public ow(yw ywVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.C0 = ywVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.C0.f53687p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
