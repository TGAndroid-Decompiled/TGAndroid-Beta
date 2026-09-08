package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class pp0 implements View.OnTouchListener {
    public final int f29484a;
    public final Rect f29485b;
    public final hq0 f29486c;

    public pp0(hq0 hq0Var, int i10) {
        this.f29484a = i10;
        switch (i10) {
            case 1:
                this.f29486c = hq0Var;
                this.f29485b = new Rect();
                return;
            default:
                this.f29486c = hq0Var;
                this.f29485b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        hq0 hq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        hq0 hq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f29484a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (hq0Var = this.f29486c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.f29485b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hq0Var.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (hq0Var2 = this.f29486c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f29485b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hq0Var2.J0.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
