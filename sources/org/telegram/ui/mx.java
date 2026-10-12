package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class mx extends ai.b0 {
    public final vy O0;

    public mx(vy vyVar, Context context, vy vyVar2, int i10, int i11) {
        super(context, vyVar2, i10, i11);
        this.O0 = vyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.O0).actionBar;
        if (!kVar.u() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
