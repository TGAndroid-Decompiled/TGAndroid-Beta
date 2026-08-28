package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class ea0 extends n71 {
    public final cb0 P;

    public ea0(cb0 cb0Var, Context context, ya0 ya0Var) {
        super(context, ya0Var);
        this.P = cb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i9 = 0;
        while (true) {
            View[] viewArr = this.P.f27458f.f31035e;
            if (i9 < viewArr.length) {
                View view = viewArr[i9];
                if (view != null) {
                    wa0 wa0Var = (wa0) view;
                    if (wa0Var.f34168a == 0) {
                        z10 = wa0Var.f34171e.f24085i;
                        break;
                    }
                }
                i9++;
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
        View view = this.f31035e[0];
        if (view instanceof wa0) {
            ((wa0) view).f34171e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        cb0 cb0Var = this.P;
        cb0Var.f27457e.setSelectedTab(cb0Var.f27458f.getPositionAnimated());
        View[] viewArr = this.f31035e;
        View view = viewArr[0];
        if (view instanceof wa0) {
            ((wa0) view).f34171e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof wa0) {
            ((wa0) view2).f34171e.H();
        }
    }
}
