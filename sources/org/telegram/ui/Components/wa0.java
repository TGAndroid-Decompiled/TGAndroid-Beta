package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class wa0 extends h81 {
    public final ub0 T;

    public wa0(ub0 ub0Var, Context context, qb0 qb0Var) {
        super(context, qb0Var);
        this.T = ub0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f28451f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ob0 ob0Var = (ob0) view;
                    if (ob0Var.f26703a == 0) {
                        z10 = ob0Var.e.f19990i;
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
        if (view instanceof ob0) {
            ((ob0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        ub0 ub0Var = this.T;
        ub0Var.e.setSelectedTab(ub0Var.f28451f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ob0) {
            ((ob0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ob0) {
            ((ob0) view2).e.H();
        }
    }
}
