package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ni implements View.OnTouchListener {
    public final int f40261a;
    public final int[] f40262b;
    public final Rect f40263c;
    public final Object d;

    public ni(g60 g60Var, Rect rect) {
        this.f40261a = 1;
        this.d = g60Var;
        this.f40263c = rect;
        this.f40262b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g50 g50Var;
        switch (this.f40261a) {
            case 0:
                zn znVar = (zn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = znVar.Q8.getContentView();
                        int[] iArr = this.f40262b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f40263c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            znVar.D7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    znVar.D7(true);
                }
                return false;
            default:
                g60 g60Var = (g60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    g50 g50Var2 = g60Var.f37858f3;
                    if (g50Var2 != null && g50Var2.isShowing()) {
                        View contentView2 = g60Var.f37858f3.getContentView();
                        int[] iArr2 = this.f40262b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f40263c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            g60Var.f37858f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (g50Var = g60Var.f37858f3) != null && g50Var.isShowing()) {
                    g60Var.f37858f3.dismiss();
                }
                return false;
        }
    }

    public ni(zn znVar, Rect rect) {
        this.f40261a = 0;
        this.d = znVar;
        this.f40263c = rect;
        this.f40262b = new int[2];
    }
}
