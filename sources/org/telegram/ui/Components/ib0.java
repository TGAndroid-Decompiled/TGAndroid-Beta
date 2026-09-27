package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class ib0 extends y81 {
    public final gc0 U;

    public ib0(gc0 gc0Var, Context context, cc0 cc0Var) {
        super(context, cc0Var);
        this.U = gc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.U.f24543f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ac0 ac0Var = (ac0) view;
                    if (ac0Var.f22645a == 0) {
                        z10 = ac0Var.e.f20170i;
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
        if (view instanceof ac0) {
            ((ac0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        gc0 gc0Var = this.U;
        gc0Var.e.setSelectedTab(gc0Var.f24543f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof ac0) {
            ((ac0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ac0) {
            ((ac0) view2).e.H();
        }
    }
}
