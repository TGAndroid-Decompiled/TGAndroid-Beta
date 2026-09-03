package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ji implements View.OnTouchListener {
    public final int f38054a;
    public final int[] f38055b;
    public final Rect f38056c;
    public final Object d;

    public ji(d60 d60Var, Rect rect) {
        this.f38054a = 1;
        this.d = d60Var;
        this.f38056c = rect;
        this.f38055b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        e50 e50Var;
        switch (this.f38054a) {
            case 0:
                xn xnVar = (xn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                    if (p1Var != null && p1Var.isShowing()) {
                        View contentView = xnVar.N8.getContentView();
                        int[] iArr = this.f38055b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f38056c;
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
                d60 d60Var = (d60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    e50 e50Var2 = d60Var.c3;
                    if (e50Var2 != null && e50Var2.isShowing()) {
                        View contentView2 = d60Var.c3.getContentView();
                        int[] iArr2 = this.f38055b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f38056c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            d60Var.c3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (e50Var = d60Var.c3) != null && e50Var.isShowing()) {
                    d60Var.c3.dismiss();
                }
                return false;
        }
    }

    public ji(xn xnVar, Rect rect) {
        this.f38054a = 0;
        this.d = xnVar;
        this.f38056c = rect;
        this.f38055b = new int[2];
    }
}
