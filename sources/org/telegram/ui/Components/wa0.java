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
            View[] viewArr = this.T.f32255f.f27044e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f29684a == 0) {
                        z10 = qb0Var.f29690e.f21803i;
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
        View view = this.f27044e[0];
        if (view instanceof qb0) {
            ((qb0) view).f29690e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        wb0 wb0Var = this.T;
        wb0Var.f32254e.setSelectedTab(wb0Var.f32255f.getPositionAnimated());
        View[] viewArr = this.f27044e;
        View view = viewArr[0];
        if (view instanceof qb0) {
            ((qb0) view).f29690e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qb0) {
            ((qb0) view2).f29690e.H();
        }
    }
}
