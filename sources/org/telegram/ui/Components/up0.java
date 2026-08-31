package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class up0 implements View.OnTouchListener {
    public final int f31701a;
    public final Rect f31702b;
    public final mq0 f31703c;

    public up0(mq0 mq0Var, int i10) {
        this.f31701a = i10;
        switch (i10) {
            case 1:
                this.f31703c = mq0Var;
                this.f31702b = new Rect();
                return;
            default:
                this.f31703c = mq0Var;
                this.f31702b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mq0 mq0Var;
        org.telegram.ui.ActionBar.p1 p1Var;
        mq0 mq0Var2;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f31701a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (p1Var = (mq0Var = this.f31703c).G0) != null && p1Var.isShowing()) {
                    Rect rect = this.f31702b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var.G0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = (mq0Var2 = this.f31703c).G0) != null && p1Var2.isShowing()) {
                    Rect rect2 = this.f31702b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var2.G0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
