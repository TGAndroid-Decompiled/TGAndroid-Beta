package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class fa0 extends x71 {
    public final ab0 V;

    public fa0(ab0 ab0Var, Context context, wa0 wa0Var) {
        super(context, wa0Var);
        this.V = ab0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.V.f24339f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ua0 ua0Var = (ua0) view;
                    if (ua0Var.f30910a == 0) {
                        z10 = ua0Var.e.f23426i;
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
        if (view instanceof ua0) {
            ((ua0) view).e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        ab0 ab0Var = this.V;
        ab0Var.e.setSelectedTab(ab0Var.f24339f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ua0) {
            ((ua0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ua0) {
            ((ua0) view2).e.G();
        }
    }
}
