package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class jb0 extends g91 {
    public final ic0 V;

    public jb0(ic0 ic0Var, Context context, ec0 ec0Var) {
        super(context, ec0Var);
        this.V = ic0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.V.f27365f.f26738e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    cc0 cc0Var = (cc0) view;
                    if (cc0Var.f25321a == 0) {
                        z10 = cc0Var.f25327e.f21961i;
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
        View view = this.f26738e[0];
        if (view instanceof cc0) {
            ((cc0) view).f25327e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        ic0 ic0Var = this.V;
        ic0Var.f27364e.setSelectedTab(ic0Var.f27365f.getPositionAnimated());
        View[] viewArr = this.f26738e;
        View view = viewArr[0];
        if (view instanceof cc0) {
            ((cc0) view).f25327e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof cc0) {
            ((cc0) view2).f25327e.H();
        }
    }
}
