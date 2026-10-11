package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class wq0 implements View.OnTouchListener {
    public final int f32702a;
    public final Rect f32703b;
    public final or0 f32704c;

    public wq0(or0 or0Var, int i10) {
        this.f32702a = i10;
        switch (i10) {
            case 1:
                this.f32704c = or0Var;
                this.f32703b = new Rect();
                return;
            default:
                this.f32704c = or0Var;
                this.f32703b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        or0 or0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        or0 or0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f32702a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (or0Var = this.f32704c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f32703b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        or0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (or0Var2 = this.f32704c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f32703b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        or0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
