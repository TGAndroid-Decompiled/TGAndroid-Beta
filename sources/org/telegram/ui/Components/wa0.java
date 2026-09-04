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
            View[] viewArr = this.T.f32228f.f27017e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f29657a == 0) {
                        z10 = qb0Var.f29663e.f21776i;
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
        View view = this.f27017e[0];
        if (view instanceof qb0) {
            ((qb0) view).f29663e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        wb0 wb0Var = this.T;
        wb0Var.f32227e.setSelectedTab(wb0Var.f32228f.getPositionAnimated());
        View[] viewArr = this.f27017e;
        View view = viewArr[0];
        if (view instanceof qb0) {
            ((qb0) view).f29663e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qb0) {
            ((qb0) view2).f29663e.H();
        }
    }
}
