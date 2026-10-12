package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ar0 implements View.OnTouchListener {
    public final int f24463a;
    public final Rect f24464b;
    public final sr0 f24465c;

    public ar0(sr0 sr0Var, int i10) {
        this.f24463a = i10;
        switch (i10) {
            case 1:
                this.f24465c = sr0Var;
                this.f24464b = new Rect();
                return;
            default:
                this.f24465c = sr0Var;
                this.f24464b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sr0 sr0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        sr0 sr0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f24463a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (sr0Var = this.f24465c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f24464b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sr0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (sr0Var2 = this.f24465c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f24464b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sr0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
