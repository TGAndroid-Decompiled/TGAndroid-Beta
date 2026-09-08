package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ni implements View.OnTouchListener {
    public final int f38988a;
    public final int[] f38989b;
    public final Rect f38990c;
    public final Object d;

    public ni(j60 j60Var, Rect rect) {
        this.f38988a = 1;
        this.d = j60Var;
        this.f38990c = rect;
        this.f38989b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j50 j50Var;
        switch (this.f38988a) {
            case 0:
                co coVar = (co) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.n1 n1Var = coVar.Q8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = coVar.Q8.getContentView();
                        int[] iArr = this.f38989b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f38990c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            coVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    coVar.A7(true);
                }
                return false;
            default:
                j60 j60Var = (j60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    j50 j50Var2 = j60Var.f37565f3;
                    if (j50Var2 != null && j50Var2.isShowing()) {
                        View contentView2 = j60Var.f37565f3.getContentView();
                        int[] iArr2 = this.f38989b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f38990c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            j60Var.f37565f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (j50Var = j60Var.f37565f3) != null && j50Var.isShowing()) {
                    j60Var.f37565f3.dismiss();
                }
                return false;
        }
    }

    public ni(co coVar, Rect rect) {
        this.f38988a = 0;
        this.d = coVar;
        this.f38990c = rect;
        this.f38989b = new int[2];
    }
}
