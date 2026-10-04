package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class jb0 extends g91 {
    public final ic0 U;

    public jb0(ic0 ic0Var, Context context, ec0 ec0Var) {
        super(context, ec0Var);
        this.U = ic0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.U.f27359f.f26732e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    cc0 cc0Var = (cc0) view;
                    if (cc0Var.f25315a == 0) {
                        z10 = cc0Var.f25321e.f21956i;
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
        View view = this.f26732e[0];
        if (view instanceof cc0) {
            ((cc0) view).f25321e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        ic0 ic0Var = this.U;
        ic0Var.f27358e.setSelectedTab(ic0Var.f27359f.getPositionAnimated());
        View[] viewArr = this.f26732e;
        View view = viewArr[0];
        if (view instanceof cc0) {
            ((cc0) view).f25321e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof cc0) {
            ((cc0) view2).f25321e.H();
        }
    }
}
