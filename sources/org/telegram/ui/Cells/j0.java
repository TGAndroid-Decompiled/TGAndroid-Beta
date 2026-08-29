package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.pb1;
public final class j0 extends ao0 {
    public final int f24528h0;

    public j0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10);
        this.f24528h0 = i10;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24528h0) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
            case 1:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
            case 2:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
            default:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return d(motionEvent);
        }
    }

    public j0(Context context) {
        super(context);
        this.f24528h0 = 1;
    }

    public j0(Context context, pb1 pb1Var) {
        super(context, pb1Var, false);
        this.f24528h0 = 3;
    }
}
