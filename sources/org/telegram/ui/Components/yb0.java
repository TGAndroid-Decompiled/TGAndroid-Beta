package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class yb0 extends p91 {
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
            View[] viewArr = this.T.f32647f.f29734e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qc0 qc0Var = (qc0) view;
                    if (qc0Var.f30178a == 0) {
                        z10 = qc0Var.f30184e.f21870i;
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
        View view = this.f29734e[0];
        if (view instanceof qc0) {
            ((qc0) view).f30184e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        wc0 wc0Var = this.T;
        wc0Var.f32646e.setSelectedTab(wc0Var.f32647f.getPositionAnimated());
        View[] viewArr = this.f29734e;
        View view = viewArr[0];
        if (view instanceof qc0) {
            ((qc0) view).f30184e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qc0) {
            ((qc0) view2).f30184e.G();
        }
    }
}
