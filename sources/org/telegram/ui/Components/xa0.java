package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class xa0 extends l81 {
    public final wb0 Q;

    public xa0(wb0 wb0Var, Context context, sb0 sb0Var) {
        super(context, sb0Var);
        this.Q = wb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.Q.f30288f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f28102a == 0) {
                        z4 = qb0Var.e.f22678i;
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
        if (view instanceof qb0) {
            ((qb0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z4) {
        wb0 wb0Var = this.Q;
        wb0Var.e.setSelectedTab(wb0Var.f30288f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof qb0) {
            ((qb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qb0) {
            ((qb0) view2).e.H();
        }
    }
}
