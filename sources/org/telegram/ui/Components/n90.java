package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class n90 extends u61 {
    public final ia0 V;

    public n90(ia0 ia0Var, Context context, ea0 ea0Var) {
        super(context, ea0Var);
        this.V = ia0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.V.f34542f.f38534e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    ca0 ca0Var = (ca0) view;
                    if (ca0Var.f32502a == 0) {
                        z9 = ca0Var.f32508e.f30657i;
                        break;
                    }
                }
                i7++;
            } else {
                z9 = false;
                break;
            }
        }
        if (z9) {
            return false;
        }
        return B(motionEvent);
    }

    @Override
    public final void u() {
        View view = this.f38534e[0];
        if (view instanceof ca0) {
            ((ca0) view).f32508e.V();
        }
    }

    @Override
    public final void w(boolean z9) {
        ia0 ia0Var = this.V;
        ia0Var.f34541e.setSelectedTab(ia0Var.f34542f.getPositionAnimated());
        View[] viewArr = this.f38534e;
        View view = viewArr[0];
        if (view instanceof ca0) {
            ((ca0) view).f32508e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof ca0) {
            ((ca0) view2).f32508e.G();
        }
    }
}
