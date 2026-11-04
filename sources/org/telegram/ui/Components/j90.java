package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class j90 extends n61 {
    public final da0 W;

    public j90(da0 da0Var, Context context, z90 z90Var) {
        super(context, z90Var);
        this.W = da0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i3 = 0;
        while (true) {
            View[] viewArr = this.W.f33037f.f36386e;
            if (i3 < viewArr.length) {
                View view = viewArr[i3];
                if (view != null) {
                    x90 x90Var = (x90) view;
                    if (x90Var.f40285a == 0) {
                        z10 = x90Var.f40292e.f30673i;
                        break;
                    }
                }
                i3++;
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
    public final void s() {
        View view = this.f36386e[0];
        if (view instanceof x90) {
            ((x90) view).f40292e.V();
        }
    }

    @Override
    public final void u(boolean z10) {
        da0 da0Var = this.W;
        da0Var.f33036e.setSelectedTab(da0Var.f33037f.getPositionAnimated());
        View[] viewArr = this.f36386e;
        View view = viewArr[0];
        if (view instanceof x90) {
            ((x90) view).f40292e.G();
        }
        View view2 = viewArr[1];
        if (view2 instanceof x90) {
            ((x90) view2).f40292e.G();
        }
    }
}
