package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class za0 extends l81 {
    public final yb0 Q;

    public za0(yb0 yb0Var, Context context, ub0 ub0Var) {
        super(context, ub0Var);
        this.Q = yb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.Q.f33457f.f28687e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    sb0 sb0Var = (sb0) view;
                    if (sb0Var.f31027a == 0) {
                        z4 = sb0Var.f31030e.f24516i;
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
        View view = this.f28687e[0];
        if (view instanceof sb0) {
            ((sb0) view).f31030e.W();
        }
    }

    @Override
    public final void w(boolean z4) {
        yb0 yb0Var = this.Q;
        yb0Var.f33456e.setSelectedTab(yb0Var.f33457f.getPositionAnimated());
        View[] viewArr = this.f28687e;
        View view = viewArr[0];
        if (view instanceof sb0) {
            ((sb0) view).f31030e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof sb0) {
            ((sb0) view2).f31030e.H();
        }
    }
}
