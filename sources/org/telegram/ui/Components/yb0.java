package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class yb0 extends q91 {
    public final wc0 T;

    public yb0(wc0 wc0Var, Context context, sc0 sc0Var) {
        super(context, sc0Var);
        this.T = wc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f32616f.f30096e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qc0 qc0Var = (qc0) view;
                    if (qc0Var.f30127a == 0) {
                        z10 = qc0Var.f30133e.f21858i;
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
        View view = this.f30096e[0];
        if (view instanceof qc0) {
            ((qc0) view).f30133e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        wc0 wc0Var = this.T;
        wc0Var.f32615e.setSelectedTab(wc0Var.f32616f.getPositionAnimated());
        View[] viewArr = this.f30096e;
        View view = viewArr[0];
        if (view instanceof qc0) {
            ((qc0) view).f30133e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qc0) {
            ((qc0) view2).f30133e.G();
        }
    }
}
