package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class wb0 extends k91 {
    public final vc0 T;

    public wb0(vc0 vc0Var, Context context, rc0 rc0Var) {
        super(context, rc0Var);
        this.T = vc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f29936f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    pc0 pc0Var = (pc0) view;
                    if (pc0Var.f28281a == 0) {
                        z10 = pc0Var.e.f20972i;
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
        if (view instanceof pc0) {
            ((pc0) view).e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        vc0 vc0Var = this.T;
        vc0Var.e.setSelectedTab(vc0Var.f29936f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof pc0) {
            ((pc0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof pc0) {
            ((pc0) view2).e.G();
        }
    }
}
