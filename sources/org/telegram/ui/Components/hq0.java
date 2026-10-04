package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class hq0 implements View.OnTouchListener {
    public final int f27217a;
    public final Rect f27218b;
    public final zq0 f27219c;

    public hq0(zq0 zq0Var, int i10) {
        this.f27217a = i10;
        switch (i10) {
            case 1:
                this.f27219c = zq0Var;
                this.f27218b = new Rect();
                return;
            default:
                this.f27219c = zq0Var;
                this.f27218b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zq0 zq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        zq0 zq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f27217a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (zq0Var = this.f27219c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.f27218b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (zq0Var2 = this.f27219c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f27218b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
