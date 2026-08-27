package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

public final class di implements View.OnTouchListener {

    public final int f37406a;

    public final int[] f37407b;

    public final Rect f37408c;
    public final Object d;

    public di(s50 s50Var, Rect rect) {
        this.f37406a = 1;
        this.d = s50Var;
        this.f37408c = rect;
        this.f37407b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s40 s40Var;
        switch (this.f37406a) {
            case 0:
                rn rnVar = (rn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.n1 n1Var = rnVar.M8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = rnVar.M8.getContentView();
                        int[] iArr = this.f37407b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f37408c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            rnVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    rnVar.A7(true);
                }
                break;
            default:
                s50 s50Var = (s50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    s40 s40Var2 = s50Var.f42416b3;
                    if (s40Var2 != null && s40Var2.isShowing()) {
                        View contentView2 = s50Var.f42416b3.getContentView();
                        int[] iArr2 = this.f37407b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f37408c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            s50Var.f42416b3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (s40Var = s50Var.f42416b3) != null && s40Var.isShowing()) {
                    s50Var.f42416b3.dismiss();
                }
                break;
        }
        return false;
    }

    public di(rn rnVar, Rect rect) {
        this.f37406a = 0;
        this.d = rnVar;
        this.f37408c = rect;
        this.f37407b = new int[2];
    }
}
