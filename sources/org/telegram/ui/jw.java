package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class jw extends org.telegram.ui.Components.bz {
    public final uw C0;

    public jw(uw uwVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.C0 = uwVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.C0.f50274o3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
