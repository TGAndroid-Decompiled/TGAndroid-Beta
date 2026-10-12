package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ar0 implements View.OnTouchListener {
    public final int f24460a;
    public final Rect f24461b;
    public final sr0 f24462c;

    public ar0(sr0 sr0Var, int i10) {
        this.f24460a = i10;
        switch (i10) {
            case 1:
                this.f24462c = sr0Var;
                this.f24461b = new Rect();
                return;
            default:
                this.f24462c = sr0Var;
                this.f24461b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sr0 sr0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        sr0 sr0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f24460a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (sr0Var = this.f24462c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.f24461b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sr0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (sr0Var2 = this.f24462c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.f24461b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sr0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
