package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class qb0 extends c91 {
    public final oc0 T;

    public qb0(oc0 oc0Var, Context context, kc0 kc0Var) {
        super(context, kc0Var);
        this.T = oc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f28931f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ic0 ic0Var = (ic0) view;
                    if (ic0Var.f27187a == 0) {
                        z10 = ic0Var.e.f21998i;
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
        if (view instanceof ic0) {
            ((ic0) view).e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        oc0 oc0Var = this.T;
        oc0Var.e.setSelectedTab(oc0Var.f28931f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ic0) {
            ((ic0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ic0) {
            ((ic0) view2).e.G();
        }
    }
}
