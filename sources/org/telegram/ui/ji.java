package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ji implements View.OnTouchListener {
    public final int f35355a;
    public final int[] f35356b;
    public final Rect f35357c;
    public final Object d;

    public ji(c60 c60Var, Rect rect) {
        this.f35355a = 1;
        this.d = c60Var;
        this.f35357c = rect;
        this.f35356b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        d50 d50Var;
        switch (this.f35355a) {
            case 0:
                xn xnVar = (xn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                    if (p1Var != null && p1Var.isShowing()) {
                        View contentView = xnVar.N8.getContentView();
                        int[] iArr = this.f35356b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f35357c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            xnVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    xnVar.A7(true);
                }
                return false;
            default:
                c60 c60Var = (c60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    d50 d50Var2 = c60Var.c3;
                    if (d50Var2 != null && d50Var2.isShowing()) {
                        View contentView2 = c60Var.c3.getContentView();
                        int[] iArr2 = this.f35356b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f35357c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            c60Var.c3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (d50Var = c60Var.c3) != null && d50Var.isShowing()) {
                    c60Var.c3.dismiss();
                }
                return false;
        }
    }

    public ji(xn xnVar, Rect rect) {
        this.f35355a = 0;
        this.d = xnVar;
        this.f35357c = rect;
        this.f35356b = new int[2];
    }
}
