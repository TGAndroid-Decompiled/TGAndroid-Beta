package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.cc1;
public final class j0 extends ko0 {
    public final int f21240i0;

    public j0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, z4);
        this.f21240i0 = i10;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f21240i0) {
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
        this.f21240i0 = 1;
    }

    public j0(Context context, cc1 cc1Var) {
        super(context, cc1Var, false);
        this.f21240i0 = 3;
    }
}
