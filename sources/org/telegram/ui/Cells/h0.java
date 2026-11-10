package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.y61;
public final class h0 extends mm0 {
    public final int m0;

    public h0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var, z9);
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

    public h0(Context context, y61 y61Var) {
        super(context, y61Var, false);
        this.m0 = 3;
    }
}
