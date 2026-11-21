package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class ca0 extends j71 {
    public final wa0 W;

    public ca0(wa0 wa0Var, Context context, sa0 sa0Var) {
        super(context, sa0Var);
        this.W = wa0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.W.f41747f.f36440e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    qa0 qa0Var = (qa0) view;
                    if (qa0Var.f38858a == 0) {
                        z10 = qa0Var.f38865e.f32279i;
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
        return x(motionEvent);
    }

    @Override
    public final void q() {
        View view = this.f36440e[0];
        if (view instanceof qa0) {
            ((qa0) view).f38865e.V();
        }
    }

    @Override
    public final void s(boolean z10) {
        wa0 wa0Var = this.W;
        wa0Var.f41746e.setSelectedTab(wa0Var.f41747f.getPositionAnimated());
        View[] viewArr = this.f36440e;
        View view = viewArr[0];
        if (view instanceof qa0) {
            ((qa0) view).f38865e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof qa0) {
            ((qa0) view2).f38865e.G();
        }
    }
}
