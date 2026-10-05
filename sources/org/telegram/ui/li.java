package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class li implements View.OnTouchListener {
    public final int f38326a;
    public final int[] f38327b;
    public final Rect f38328c;
    public final Object d;

    public li(h60 h60Var, Rect rect) {
        this.f38326a = 1;
        this.d = h60Var;
        this.f38328c = rect;
        this.f38327b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i50 i50Var;
        switch (this.f38326a) {
            case 0:
                yn ynVar = (yn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.n1 n1Var = ynVar.O8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = ynVar.O8.getContentView();
                        int[] iArr = this.f38327b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f38328c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            ynVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    ynVar.A7(true);
                }
                return false;
            default:
                h60 h60Var = (h60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    i50 i50Var2 = h60Var.f36931f3;
                    if (i50Var2 != null && i50Var2.isShowing()) {
                        View contentView2 = h60Var.f36931f3.getContentView();
                        int[] iArr2 = this.f38327b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f38328c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            h60Var.f36931f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (i50Var = h60Var.f36931f3) != null && i50Var.isShowing()) {
                    h60Var.f36931f3.dismiss();
                }
                return false;
        }
    }

    public li(yn ynVar, Rect rect) {
        this.f38326a = 0;
        this.d = ynVar;
        this.f38328c = rect;
        this.f38327b = new int[2];
    }
}
