package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class jb0 extends y81 {
    public final hc0 T;

    public jb0(hc0 hc0Var, Context context, dc0 dc0Var) {
        super(context, dc0Var);
        this.T = hc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f24775f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    bc0 bc0Var = (bc0) view;
                    if (bc0Var.f22946a == 0) {
                        z10 = bc0Var.e.f20169i;
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
        if (view instanceof bc0) {
            ((bc0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        hc0 hc0Var = this.T;
        hc0Var.e.setSelectedTab(hc0Var.f24775f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof bc0) {
            ((bc0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof bc0) {
            ((bc0) view2).e.H();
        }
    }
}
