package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class qp0 implements View.OnTouchListener {
    public final int f27374a;
    public final Rect f27375b;
    public final iq0 f27376c;

    public qp0(iq0 iq0Var, int i10) {
        this.f27374a = i10;
        switch (i10) {
            case 1:
                this.f27376c = iq0Var;
                this.f27375b = new Rect();
                return;
            default:
                this.f27376c = iq0Var;
                this.f27375b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        iq0 iq0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        iq0 iq0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f27374a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (iq0Var = this.f27376c).J0) != null && o1Var.isShowing()) {
                    Rect rect = this.f27375b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        iq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (iq0Var2 = this.f27376c).J0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.f27375b;
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
