package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class mi implements View.OnTouchListener {
    public final int f35707a;
    public final int[] f35708b;
    public final Rect f35709c;
    public final Object d;

    public mi(g60 g60Var, Rect rect) {
        this.f35707a = 1;
        this.d = g60Var;
        this.f35709c = rect;
        this.f35708b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g50 g50Var;
        switch (this.f35707a) {
            case 0:
                xn xnVar = (xn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = xnVar.Q8;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = xnVar.Q8.getContentView();
                        int[] iArr = this.f35708b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f35709c;
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
                g60 g60Var = (g60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    g50 g50Var2 = g60Var.f33750f3;
                    if (g50Var2 != null && g50Var2.isShowing()) {
                        View contentView2 = g60Var.f33750f3.getContentView();
                        int[] iArr2 = this.f35708b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f35709c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            g60Var.f33750f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (g50Var = g60Var.f33750f3) != null && g50Var.isShowing()) {
                    g60Var.f33750f3.dismiss();
                }
                return false;
        }
    }

    public mi(xn xnVar, Rect rect) {
        this.f35707a = 0;
        this.d = xnVar;
        this.f35709c = rect;
        this.f35708b = new int[2];
    }
}
