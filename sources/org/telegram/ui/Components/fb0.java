package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class fb0 extends v81 {
    public final ec0 T;

    public fb0(ec0 ec0Var, Context context, ac0 ac0Var) {
        super(context, ac0Var);
        this.T = ec0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f22664f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    yb0 yb0Var = (yb0) view;
                    if (yb0Var.f29290a == 0) {
                        z10 = yb0Var.e.f19141i;
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
        if (view instanceof yb0) {
            ((yb0) view).e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        ec0 ec0Var = this.T;
        ec0Var.e.setSelectedTab(ec0Var.f22664f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof yb0) {
            ((yb0) view).e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof yb0) {
            ((yb0) view2).e.H();
        }
    }
}
