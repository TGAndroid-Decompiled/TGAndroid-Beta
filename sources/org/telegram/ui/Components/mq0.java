package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class mq0 implements View.OnTouchListener {
    public final int f28588a;
    public final Rect f28589b;
    public final fr0 f28590c;

    public mq0(fr0 fr0Var, int i10) {
        this.f28588a = i10;
        switch (i10) {
            case 1:
                this.f28590c = fr0Var;
                this.f28589b = new Rect();
                return;
            default:
                this.f28590c = fr0Var;
                this.f28589b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        fr0 fr0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        fr0 fr0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f28588a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (fr0Var = this.f28590c).K0) != null && m1Var.isShowing()) {
                    Rect rect = this.f28589b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        fr0Var.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (fr0Var2 = this.f28590c).K0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f28589b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        fr0Var2.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
