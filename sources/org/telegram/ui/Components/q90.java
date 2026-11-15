package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class q90 extends w61 {
    public final ka0 W;

    public q90(ka0 ka0Var, Context context, ga0 ga0Var) {
        super(context, ga0Var);
        this.W = ka0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.W.f36339f.f41300e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    ea0 ea0Var = (ea0) view;
                    if (ea0Var.f34254a == 0) {
                        z10 = ea0Var.f34261e.f31749i;
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
        return z(motionEvent);
    }

    @Override
    public final void r() {
        View view = this.f41300e[0];
        if (view instanceof ea0) {
            ((ea0) view).f34261e.V();
        }
    }

    @Override
    public final void t(boolean z10) {
        ka0 ka0Var = this.W;
        ka0Var.f36338e.setSelectedTab(ka0Var.f36339f.getPositionAnimated());
        View[] viewArr = this.f41300e;
        View view = viewArr[0];
        if (view instanceof ea0) {
            ((ea0) view).f34261e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ea0) {
            ((ea0) view2).f34261e.G();
        }
    }
}
