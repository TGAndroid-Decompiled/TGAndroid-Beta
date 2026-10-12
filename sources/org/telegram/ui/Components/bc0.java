package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class bc0 extends u91 {
    public final zc0 T;

    public bc0(zc0 zc0Var, Context context, vc0 vc0Var) {
        super(context, vc0Var);
        this.T = zc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f33334f.f31109e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    tc0 tc0Var = (tc0) view;
                    if (tc0Var.f30854a == 0) {
                        z10 = tc0Var.f30860e.f21629i;
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
        View view = this.f31109e[0];
        if (view instanceof tc0) {
            ((tc0) view).f30860e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        zc0 zc0Var = this.T;
        zc0Var.f33333e.setSelectedTab(zc0Var.f33334f.getPositionAnimated());
        View[] viewArr = this.f31109e;
        View view = viewArr[0];
        if (view instanceof tc0) {
            ((tc0) view).f30860e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof tc0) {
            ((tc0) view2).f30860e.G();
        }
    }
}
