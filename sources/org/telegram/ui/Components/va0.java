package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class va0 extends j81 {
    public final vb0 U;

    public va0(vb0 vb0Var, Context context, rb0 rb0Var) {
        super(context, rb0Var);
        this.U = vb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.U.f28674f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    pb0 pb0Var = (pb0) view;
                    if (pb0Var.f26983a == 0) {
                        z10 = pb0Var.e.f19962i;
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
        if (view instanceof pb0) {
            ((pb0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        vb0 vb0Var = this.U;
        vb0Var.e.setSelectedTab(vb0Var.f28674f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof pb0) {
            ((pb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof pb0) {
            ((pb0) view2).e.H();
        }
    }
}
