package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class ob0 extends u91 {
    public final nc0 V;

    public ob0(nc0 nc0Var, Context context, jc0 jc0Var) {
        super(context, jc0Var);
        this.V = nc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.V.f30959f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    hc0 hc0Var = (hc0) view;
                    if (hc0Var.f28914a == 0) {
                        z10 = hc0Var.e.f24100i;
                        break;
                    }
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return false;
        }
        return B(motionEvent);
    }

    @Override
    public final void u() {
        View view = this.e[0];
        if (view instanceof hc0) {
            ((hc0) view).e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        nc0 nc0Var = this.V;
        nc0Var.e.setSelectedTab(nc0Var.f30959f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof hc0) {
            ((hc0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof hc0) {
            ((hc0) view2).e.G();
        }
    }
}
