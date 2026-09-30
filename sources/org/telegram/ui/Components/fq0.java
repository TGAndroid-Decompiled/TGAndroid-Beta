package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class fq0 implements View.OnTouchListener {
    public final int f24334a;
    public final Rect f24335b;
    public final xq0 f24336c;

    public fq0(xq0 xq0Var, int i10) {
        this.f24334a = i10;
        switch (i10) {
            case 1:
                this.f24336c = xq0Var;
                this.f24335b = new Rect();
                return;
            default:
                this.f24336c = xq0Var;
                this.f24335b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        xq0 xq0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        xq0 xq0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f24334a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (xq0Var = this.f24336c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f24335b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        xq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (xq0Var2 = this.f24336c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f24335b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        xq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
