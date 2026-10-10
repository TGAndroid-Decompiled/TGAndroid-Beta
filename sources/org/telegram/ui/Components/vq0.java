package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class vq0 implements View.OnTouchListener {
    public final int f32488a;
    public final Rect f32489b;
    public final nr0 f32490c;

    public vq0(nr0 nr0Var, int i10) {
        this.f32488a = i10;
        switch (i10) {
            case 1:
                this.f32490c = nr0Var;
                this.f32489b = new Rect();
                return;
            default:
                this.f32490c = nr0Var;
                this.f32489b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nr0 nr0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        nr0 nr0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f32488a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (nr0Var = this.f32490c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.f32489b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nr0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (nr0Var2 = this.f32490c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f32489b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nr0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
