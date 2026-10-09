package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class xb0 extends o91 {
    public final vc0 T;

    public xb0(vc0 vc0Var, Context context, rc0 rc0Var) {
        super(context, rc0Var);
        this.T = vc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f31751f.f29429e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    pc0 pc0Var = (pc0) view;
                    if (pc0Var.f29840a == 0) {
                        z10 = pc0Var.f29846e.f21866i;
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
        View view = this.f29429e[0];
        if (view instanceof pc0) {
            ((pc0) view).f29846e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        vc0 vc0Var = this.T;
        vc0Var.f31750e.setSelectedTab(vc0Var.f31751f.getPositionAnimated());
        View[] viewArr = this.f29429e;
        View view = viewArr[0];
        if (view instanceof pc0) {
            ((pc0) view).f29846e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof pc0) {
            ((pc0) view2).f29846e.G();
        }
    }
}
