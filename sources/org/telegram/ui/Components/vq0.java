package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class vq0 implements View.OnTouchListener {
    public final int f34353a;
    public final Rect f34354b;
    public final nr0 f34355c;

    public vq0(nr0 nr0Var, int i10) {
        this.f34353a = i10;
        switch (i10) {
            case 1:
                this.f34355c = nr0Var;
                this.f34354b = new Rect();
                return;
            default:
                this.f34355c = nr0Var;
                this.f34354b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nr0 nr0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        nr0 nr0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f34353a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (nr0Var = this.f34355c).K0) != null && o1Var.isShowing()) {
                    Rect rect = this.f34354b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nr0Var.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (nr0Var2 = this.f34355c).K0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.f34354b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nr0Var2.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
