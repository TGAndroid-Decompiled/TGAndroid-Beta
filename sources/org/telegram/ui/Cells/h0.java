package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.on0;
import org.telegram.ui.l81;
public final class h0 extends on0 {
    public final int m0;

    public h0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, z10);
        this.m0 = i10;
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

    public h0(Context context, l81 l81Var) {
        super(context, l81Var, false);
        this.m0 = 3;
    }
}
