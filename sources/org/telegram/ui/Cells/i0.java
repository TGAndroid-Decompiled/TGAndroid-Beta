package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.an0;
import org.telegram.ui.u61;
public final class i0 extends an0 {
    public final int f30862n0;

    public i0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, z10);
        this.f30862n0 = i7;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30862n0) {
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

    public i0(Context context) {
        super(context);
        this.f30862n0 = 1;
    }

    public i0(Context context, u61 u61Var) {
        super(context, u61Var, false);
        this.f30862n0 = 3;
    }
}
