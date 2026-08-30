package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class tp0 implements View.OnTouchListener {
    public final int f29000a;
    public final Rect f29001b;
    public final lq0 f29002c;

    public tp0(lq0 lq0Var, int i10) {
        this.f29000a = i10;
        switch (i10) {
            case 1:
                this.f29002c = lq0Var;
                this.f29001b = new Rect();
                return;
            default:
                this.f29002c = lq0Var;
                this.f29001b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lq0 lq0Var;
        org.telegram.ui.ActionBar.p1 p1Var;
        lq0 lq0Var2;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f29000a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (p1Var = (lq0Var = this.f29002c).G0) != null && p1Var.isShowing()) {
                    Rect rect = this.f29001b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var.G0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = (lq0Var2 = this.f29002c).G0) != null && p1Var2.isShowing()) {
                    Rect rect2 = this.f29001b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var2.G0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
