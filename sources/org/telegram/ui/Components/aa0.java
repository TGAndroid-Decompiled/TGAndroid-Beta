package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class aa0 extends g71 {
    public final ua0 W;

    public aa0(ua0 ua0Var, Context context, qa0 qa0Var) {
        super(context, qa0Var);
        this.W = ua0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.W.f40281f.f35378e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    oa0 oa0Var = (oa0) view;
                    if (oa0Var.f38039a == 0) {
                        z10 = oa0Var.f38046e.f32193i;
                        break;
                    }
                }
                i7++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return false;
        }
        return x(motionEvent);
    }

    @Override
    public final void q() {
        View view = this.f35378e[0];
        if (view instanceof oa0) {
            ((oa0) view).f38046e.V();
        }
    }

    @Override
    public final void s(boolean z10) {
        ua0 ua0Var = this.W;
        ua0Var.f40280e.setSelectedTab(ua0Var.f40281f.getPositionAnimated());
        View[] viewArr = this.f35378e;
        View view = viewArr[0];
        if (view instanceof oa0) {
            ((oa0) view).f38046e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof oa0) {
            ((oa0) view2).f38046e.G();
        }
    }
}
