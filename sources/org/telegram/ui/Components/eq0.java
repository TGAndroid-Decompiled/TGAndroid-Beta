package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class eq0 implements View.OnTouchListener {
    public final int f24045a;
    public final Rect f24046b;
    public final wq0 f24047c;

    public eq0(wq0 wq0Var, int i10) {
        this.f24045a = i10;
        switch (i10) {
            case 1:
                this.f24047c = wq0Var;
                this.f24046b = new Rect();
                return;
            default:
                this.f24047c = wq0Var;
                this.f24046b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wq0 wq0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        wq0 wq0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f24045a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (wq0Var = this.f24047c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f24046b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (wq0Var2 = this.f24047c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f24046b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
