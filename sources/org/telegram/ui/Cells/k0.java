package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.cd1;
public final class k0 extends gp0 {
    public final int f21426l0;

    public k0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10);
        this.f21426l0 = i10;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f21426l0) {
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

    public k0(Context context) {
        super(context);
        this.f21426l0 = 1;
    }

    public k0(Context context, cd1 cd1Var) {
        super(context, cd1Var, false);
        this.f21426l0 = 3;
    }
}
