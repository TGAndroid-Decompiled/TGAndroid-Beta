package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class zn0 implements View.OnTouchListener {
    public final int f42407a;
    public final Rect f42408b;
    public final po0 f42409c;

    public zn0(po0 po0Var, int i7) {
        this.f42407a = i7;
        switch (i7) {
            case 1:
                this.f42409c = po0Var;
                this.f42408b = new Rect();
                return;
            default:
                this.f42409c = po0Var;
                this.f42408b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        po0 po0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        po0 po0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f42407a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (po0Var = this.f42409c).F2) != null && g1Var.isShowing()) {
                    Rect rect = this.f42408b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        po0Var.F2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (po0Var2 = this.f42409c).F2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.f42408b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        po0Var2.F2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
