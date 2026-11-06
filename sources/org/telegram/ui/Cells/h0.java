package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.v61;
public final class h0 extends mm0 {
    public final int m0;

    public h0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, z9);
        this.m0 = i7;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
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

    public h0(Context context) {
        super(context);
        this.m0 = 1;
    }

    public h0(Context context, v61 v61Var) {
        super(context, v61Var, false);
        this.m0 = 3;
    }
}
