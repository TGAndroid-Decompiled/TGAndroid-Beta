package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

public final class zo0 implements View.OnTouchListener {

    public final int f35320a;

    public final Rect f35321b;

    public final sp0 f35322c;

    public zo0(sp0 sp0Var, int i10) {
        this.f35320a = i10;
        switch (i10) {
            case 1:
                this.f35322c = sp0Var;
                this.f35321b = new Rect();
                break;
            default:
                this.f35322c = sp0Var;
                this.f35321b = new Rect();
                break;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sp0 sp0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        sp0 sp0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f35320a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (sp0Var = this.f35322c).F0) != null && n1Var.isShowing()) {
                    Rect rect = this.f35321b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sp0Var.F0.d(true);
                    }
                    break;
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (sp0Var2 = this.f35322c).F0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.f35321b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sp0Var2.F0.d(true);
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
