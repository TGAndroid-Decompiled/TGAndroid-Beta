package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class p90 extends w61 {
    public final ja0 W;

    public p90(ja0 ja0Var, Context context, fa0 fa0Var) {
        super(context, fa0Var);
        this.W = ja0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.W.f35952f.f41297e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    da0 da0Var = (da0) view;
                    if (da0Var.f33894a == 0) {
                        z10 = da0Var.f33901e.f31749i;
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
        View view = this.f41297e[0];
        if (view instanceof da0) {
            ((da0) view).f33901e.V();
        }
    }

    @Override
    public final void t(boolean z10) {
        ja0 ja0Var = this.W;
        ja0Var.f35951e.setSelectedTab(ja0Var.f35952f.getPositionAnimated());
        View[] viewArr = this.f41297e;
        View view = viewArr[0];
        if (view instanceof da0) {
            ((da0) view).f33901e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof da0) {
            ((da0) view2).f33901e.G();
        }
    }
}
