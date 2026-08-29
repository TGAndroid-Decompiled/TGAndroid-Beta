package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class sa0 extends z71 {
    public final rb0 P;

    public sa0(rb0 rb0Var, Context context, nb0 nb0Var) {
        super(context, nb0Var);
        this.P = rb0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.P.f32253f.f35261e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    lb0 lb0Var = (lb0) view;
                    if (lb0Var.f30273a == 0) {
                        z10 = lb0Var.f30276e.f25946i;
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
        View view = this.f35261e[0];
        if (view instanceof lb0) {
            ((lb0) view).f30276e.W();
        }
    }

    @Override
    public final void w(boolean z10) {
        rb0 rb0Var = this.P;
        rb0Var.f32252e.setSelectedTab(rb0Var.f32253f.getPositionAnimated());
        View[] viewArr = this.f35261e;
        View view = viewArr[0];
        if (view instanceof lb0) {
            ((lb0) view).f30276e.H();
        }
        View view2 = viewArr[1];
        if (view2 instanceof lb0) {
            ((lb0) view2).f30276e.H();
        }
    }
}
