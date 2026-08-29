package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class kp0 implements View.OnTouchListener {
    public final int f30126a;
    public final Rect f30127b;
    public final dq0 f30128c;

    public kp0(dq0 dq0Var, int i10) {
        this.f30126a = i10;
        switch (i10) {
            case 1:
                this.f30128c = dq0Var;
                this.f30127b = new Rect();
                return;
            default:
                this.f30128c = dq0Var;
                this.f30127b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dq0 dq0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        dq0 dq0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f30126a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (dq0Var = this.f30128c).F0) != null && o1Var.isShowing()) {
                    Rect rect = this.f30127b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dq0Var.F0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (dq0Var2 = this.f30128c).F0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.f30127b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dq0Var2.F0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
