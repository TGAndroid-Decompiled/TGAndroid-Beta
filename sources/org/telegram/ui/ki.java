package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ki implements View.OnTouchListener {
    public final int f34732a;
    public final int[] f34733b;
    public final Rect f34734c;
    public final Object d;

    public ki(f60 f60Var, Rect rect) {
        this.f34732a = 1;
        this.d = f60Var;
        this.f34734c = rect;
        this.f34733b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f50 f50Var;
        switch (this.f34732a) {
            case 0:
                xn xnVar = (xn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.n1 n1Var = xnVar.Q8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = xnVar.Q8.getContentView();
                        int[] iArr = this.f34733b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f34734c;
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
                f60 f60Var = (f60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    f50 f50Var2 = f60Var.f33123f3;
                    if (f50Var2 != null && f50Var2.isShowing()) {
                        View contentView2 = f60Var.f33123f3.getContentView();
                        int[] iArr2 = this.f34733b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f34734c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            f60Var.f33123f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (f50Var = f60Var.f33123f3) != null && f50Var.isShowing()) {
                    f60Var.f33123f3.dismiss();
                }
                return false;
        }
    }

    public ki(xn xnVar, Rect rect) {
        this.f34732a = 0;
        this.d = xnVar;
        this.f34734c = rect;
        this.f34733b = new int[2];
    }
}
