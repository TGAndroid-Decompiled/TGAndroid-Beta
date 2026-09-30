package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class kb0 extends y81 {
    public final ic0 T;

    public kb0(ic0 ic0Var, Context context, ec0 ec0Var) {
        super(context, ec0Var);
        this.T = ic0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f25074f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    cc0 cc0Var = (cc0) view;
                    if (cc0Var.f23259a == 0) {
                        z10 = cc0Var.e.f20185i;
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
        if (view instanceof cc0) {
            ((cc0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        ic0 ic0Var = this.T;
        ic0Var.e.setSelectedTab(ic0Var.f25074f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof cc0) {
            ((cc0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof cc0) {
            ((cc0) view2).e.H();
        }
    }
}
