package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class qp0 implements View.OnTouchListener {
    public final int f27371a;
    public final Rect f27372b;
    public final iq0 f27373c;

    public qp0(iq0 iq0Var, int i10) {
        this.f27371a = i10;
        switch (i10) {
            case 1:
                this.f27373c = iq0Var;
                this.f27372b = new Rect();
                return;
            default:
                this.f27373c = iq0Var;
                this.f27372b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        iq0 iq0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        iq0 iq0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f27371a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (iq0Var = this.f27373c).J0) != null && o1Var.isShowing()) {
                    Rect rect = this.f27372b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        iq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (iq0Var2 = this.f27373c).J0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.f27372b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        iq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
