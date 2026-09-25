package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class hb0 extends w81 {
    public final fc0 T;

    public hb0(fc0 fc0Var, Context context, bc0 bc0Var) {
        super(context, bc0Var);
        this.T = fc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f24143f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    zb0 zb0Var = (zb0) view;
                    if (zb0Var.f30835a == 0) {
                        z10 = zb0Var.e.f20169i;
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
        if (view instanceof zb0) {
            ((zb0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        fc0 fc0Var = this.T;
        fc0Var.e.setSelectedTab(fc0Var.f24143f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof zb0) {
            ((zb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof zb0) {
            ((zb0) view2).e.H();
        }
    }
}
