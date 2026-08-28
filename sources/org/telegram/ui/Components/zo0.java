package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class zo0 implements View.OnTouchListener {
    public final int f35348a;
    public final Rect f35349b;
    public final rp0 f35350c;

    public zo0(rp0 rp0Var, int i9) {
        this.f35348a = i9;
        switch (i9) {
            case 1:
                this.f35350c = rp0Var;
                this.f35349b = new Rect();
                return;
            default:
                this.f35350c = rp0Var;
                this.f35349b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rp0 rp0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        rp0 rp0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f35348a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (rp0Var = this.f35350c).F0) != null && o1Var.isShowing()) {
                    Rect rect = this.f35349b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rp0Var.F0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (rp0Var2 = this.f35350c).F0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.f35349b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rp0Var2.F0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
