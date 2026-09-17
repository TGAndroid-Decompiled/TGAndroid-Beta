package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class wa0 extends i81 {
    public final wb0 T;

    public wa0(wb0 wb0Var, Context context, sb0 sb0Var) {
        super(context, sb0Var);
        this.T = wb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f32229f.f27018e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f29658a == 0) {
                        z10 = qb0Var.f29664e.f21777i;
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
        View view = this.f27018e[0];
        if (view instanceof qb0) {
            ((qb0) view).f29664e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        wb0 wb0Var = this.T;
        wb0Var.f32228e.setSelectedTab(wb0Var.f32229f.getPositionAnimated());
        View[] viewArr = this.f27018e;
        View view = viewArr[0];
        if (view instanceof qb0) {
            ((qb0) view).f29664e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qb0) {
            ((qb0) view2).f29664e.H();
        }
    }
}
