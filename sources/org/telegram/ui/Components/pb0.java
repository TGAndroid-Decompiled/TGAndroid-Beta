package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class pb0 extends l91 {
    public final pc0 T;

    public pb0(pc0 pc0Var, Context context, lc0 lc0Var) {
        super(context, lc0Var);
        this.T = pc0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.T.f29540f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    jc0 jc0Var = (jc0) view;
                    if (jc0Var.f27669a == 0) {
                        z10 = jc0Var.e.f22167i;
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
        if (view instanceof jc0) {
            ((jc0) view).e.V();
        }
    }

    @Override
    public final void w(boolean z10) {
        pc0 pc0Var = this.T;
        pc0Var.e.setSelectedTab(pc0Var.f29540f.getPositionAnimated());
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view instanceof jc0) {
            ((jc0) view).e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof jc0) {
            ((jc0) view2).e.G();
        }
    }
}
