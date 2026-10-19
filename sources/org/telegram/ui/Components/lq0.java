package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class lq0 implements View.OnTouchListener {
    public final int f28285a;
    public final Rect f28286b;
    public final er0 f28287c;

    public lq0(er0 er0Var, int i10) {
        this.f28285a = i10;
        switch (i10) {
            case 1:
                this.f28287c = er0Var;
                this.f28286b = new Rect();
                return;
            default:
                this.f28287c = er0Var;
                this.f28286b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        er0 er0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        er0 er0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f28285a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (er0Var = this.f28287c).K0) != null && m1Var.isShowing()) {
                    Rect rect = this.f28286b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        er0Var.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (er0Var2 = this.f28287c).K0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f28286b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        er0Var2.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
