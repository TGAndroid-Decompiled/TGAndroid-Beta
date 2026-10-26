package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class uq0 implements View.OnTouchListener {
    public final int f33479a;
    public final Rect f33480b;
    public final mr0 f33481c;

    public uq0(mr0 mr0Var, int i10) {
        this.f33479a = i10;
        switch (i10) {
            case 1:
                this.f33481c = mr0Var;
                this.f33480b = new Rect();
                return;
            default:
                this.f33481c = mr0Var;
                this.f33480b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mr0 mr0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        mr0 mr0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f33479a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (mr0Var = this.f33481c).K0) != null && o1Var.isShowing()) {
                    Rect rect = this.f33480b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mr0Var.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (mr0Var2 = this.f33481c).K0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.f33480b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mr0Var2.K0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
