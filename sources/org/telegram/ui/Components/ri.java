package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ri extends b20 {
    public final vi J;

    public ri(Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var);
        this.J = viVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.t1(this.f24522r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
