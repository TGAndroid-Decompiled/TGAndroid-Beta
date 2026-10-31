package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class yo0 implements View.OnTouchListener {
    public final int f32768a;
    public final Rect f32769b;
    public final op0 f32770c;

    public yo0(op0 op0Var, int i10) {
        this.f32768a = i10;
        switch (i10) {
            case 1:
                this.f32770c = op0Var;
                this.f32769b = new Rect();
                return;
            default:
                this.f32770c = op0Var;
                this.f32769b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        op0 op0Var;
        org.telegram.ui.ActionBar.k1 k1Var;
        op0 op0Var2;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.f32768a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (k1Var = (op0Var = this.f32770c).B2) != null && k1Var.isShowing()) {
                    Rect rect = this.f32769b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        op0Var.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = (op0Var2 = this.f32770c).B2) != null && k1Var2.isShowing()) {
                    Rect rect2 = this.f32769b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        op0Var2.B2.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
