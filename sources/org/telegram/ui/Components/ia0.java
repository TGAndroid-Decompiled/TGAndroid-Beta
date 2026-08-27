package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public final class ia0 extends p71 {
    public final gb0 P;

    public ia0(gb0 gb0Var, Context context, cb0 cb0Var) {
        super(context, cb0Var);
        this.P = gb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.P.f28584f.f31545e;
            if (i10 >= viewArr.length) {
                z10 = false;
                break;
            }
            View view = viewArr[i10];
            if (view != null) {
                ab0 ab0Var = (ab0) view;
                if (ab0Var.f26712a == 0) {
                    z10 = ab0Var.f26715e.f25872i;
                    break;
                }
            }
            i10++;
        }
        if (z10) {
            return false;
        }
        return A(motionEvent);
    }

    @Override
    public final void u() {
        View view = this.f31545e[0];
        if (view instanceof ab0) {
            ((ab0) view).f26715e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        gb0 gb0Var = this.P;
        gb0Var.f28583e.setSelectedTab(gb0Var.f28584f.getPositionAnimated());
        View[] viewArr = this.f31545e;
        View view = viewArr[0];
        if (view instanceof ab0) {
            ((ab0) view).f26715e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ab0) {
            ((ab0) view2).f26715e.H();
        }
    }
}
