package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class ya0 extends l81 {
    public final xb0 Q;

    public ya0(xb0 xb0Var, Context context, tb0 tb0Var) {
        super(context, tb0Var);
        this.Q = xb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.Q.f30576f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    rb0 rb0Var = (rb0) view;
                    if (rb0Var.f28440a == 0) {
                        z4 = rb0Var.e.f22614i;
                        break;
                    }
                }
                i10++;
            } else {
                z4 = false;
                break;
            }
        }
        if (z4) {
            return false;
        }
        return A(motionEvent);
    }

    @Override
    public final void u() {
        View view = this.e[0];
        if (view instanceof rb0) {
            ((rb0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z4) {
        xb0 xb0Var = this.Q;
        xb0Var.e.setSelectedTab(xb0Var.f30576f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof rb0) {
            ((rb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof rb0) {
            ((rb0) view2).e.H();
        }
    }
}
