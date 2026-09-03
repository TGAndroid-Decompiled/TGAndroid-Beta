package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class hi extends d20 {
    public final li G;

    public hi(Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var);
        this.G = liVar;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.t1(this.f24117r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
