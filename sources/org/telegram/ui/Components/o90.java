package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class o90 extends w61 {
    public final ja0 V;

    public o90(ja0 ja0Var, Context context, fa0 fa0Var) {
        super(context, fa0Var);
        this.V = ja0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.V.f34974f.f39950e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    da0 da0Var = (da0) view;
                    if (da0Var.f32915a == 0) {
                        z9 = da0Var.f32921e.f30666i;
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
        View view = this.f39950e[0];
        if (view instanceof da0) {
            ((da0) view).f32921e.V();
        }
    }

    @Override
    public final void w(boolean z9) {
        ja0 ja0Var = this.V;
        ja0Var.f34973e.setSelectedTab(ja0Var.f34974f.getPositionAnimated());
        View[] viewArr = this.f39950e;
        View view = viewArr[0];
        if (view instanceof da0) {
            ((da0) view).f32921e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof da0) {
            ((da0) view2).f32921e.G();
        }
    }
}
