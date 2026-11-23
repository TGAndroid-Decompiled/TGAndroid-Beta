package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class z90 extends k71 {
    public final ta0 W;

    public z90(ta0 ta0Var, Context context, pa0 pa0Var) {
        super(context, pa0Var);
        this.W = ta0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.W.f39885f.f36665e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    na0 na0Var = (na0) view;
                    if (na0Var.f37736a == 0) {
                        z10 = na0Var.f37743e.f32271i;
                        break;
                    }
                }
                i7++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return false;
        }
        return y(motionEvent);
    }

    @Override
    public final void r() {
        View view = this.f36665e[0];
        if (view instanceof na0) {
            ((na0) view).f37743e.V();
        }
    }

    @Override
    public final void t(boolean z10) {
        ta0 ta0Var = this.W;
        ta0Var.f39884e.setSelectedTab(ta0Var.f39885f.getPositionAnimated());
        View[] viewArr = this.f36665e;
        View view = viewArr[0];
        if (view instanceof na0) {
            ((na0) view).f37743e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof na0) {
            ((na0) view2).f37743e.G();
        }
    }
}
