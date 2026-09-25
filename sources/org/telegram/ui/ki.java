package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ki implements View.OnTouchListener {
    public final int f35071a;
    public final int[] f35072b;
    public final Rect f35073c;
    public final Object d;

    public ki(d60 d60Var, Rect rect) {
        this.f35071a = 1;
        this.d = d60Var;
        this.f35073c = rect;
        this.f35072b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        d50 d50Var;
        switch (this.f35071a) {
            case 0:
                wn wnVar = (wn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.m1 m1Var = wnVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = wnVar.Q8.getContentView();
                        int[] iArr = this.f35072b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f35073c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            wnVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    wnVar.A7(true);
                }
                return false;
            default:
                d60 d60Var = (d60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    d50 d50Var2 = d60Var.f32960f3;
                    if (d50Var2 != null && d50Var2.isShowing()) {
                        View contentView2 = d60Var.f32960f3.getContentView();
                        int[] iArr2 = this.f35072b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f35073c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            d60Var.f32960f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (d50Var = d60Var.f32960f3) != null && d50Var.isShowing()) {
                    d60Var.f32960f3.dismiss();
                }
                return false;
        }
    }

    public ki(wn wnVar, Rect rect) {
        this.f35071a = 0;
        this.d = wnVar;
        this.f35073c = rect;
        this.f35072b = new int[2];
    }
}
