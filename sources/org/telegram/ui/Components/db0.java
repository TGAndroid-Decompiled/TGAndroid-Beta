package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class db0 extends x81 {
    public final dc0 U;

    public db0(dc0 dc0Var, Context context, zb0 zb0Var) {
        super(context, zb0Var);
        this.U = dc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.U.f23553f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    xb0 xb0Var = (xb0) view;
                    if (xb0Var.f30224a == 0) {
                        z10 = xb0Var.e.f20216i;
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
        if (view instanceof xb0) {
            ((xb0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        dc0 dc0Var = this.U;
        dc0Var.e.setSelectedTab(dc0Var.f23553f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof xb0) {
            ((xb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof xb0) {
            ((xb0) view2).e.H();
        }
    }
}
