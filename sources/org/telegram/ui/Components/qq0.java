package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class qq0 implements View.OnTouchListener {
    public final int f29963a;
    public final Rect f29964b;
    public final ir0 f29965c;

    public qq0(ir0 ir0Var, int i10) {
        this.f29963a = i10;
        switch (i10) {
            case 1:
                this.f29965c = ir0Var;
                this.f29964b = new Rect();
                return;
            default:
                this.f29965c = ir0Var;
                this.f29964b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ir0 ir0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        ir0 ir0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f29963a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (ir0Var = this.f29965c).K0) != null && m1Var.isShowing()) {
                    Rect rect = this.f29964b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ir0Var.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (ir0Var2 = this.f29965c).K0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f29964b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ir0Var2.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
