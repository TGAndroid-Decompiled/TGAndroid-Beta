package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class rb0 extends l91 {
    public final rc0 T;

    public rb0(rc0 rc0Var, Context context, nc0 nc0Var) {
        super(context, nc0Var);
        this.T = rc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f30146f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    lc0 lc0Var = (lc0) view;
                    if (lc0Var.f28335a == 0) {
                        z10 = lc0Var.e.f22166i;
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
        return A(motionEvent);
    }

    @Override
    public final void u() {
        View view = this.e[0];
        if (view instanceof lc0) {
            ((lc0) view).e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        rc0 rc0Var = this.T;
        rc0Var.e.setSelectedTab(rc0Var.f30146f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof lc0) {
            ((lc0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof lc0) {
            ((lc0) view2).e.G();
        }
    }
}
