package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class li implements View.OnTouchListener {
    public final int f35774a;
    public final int[] f35775b;
    public final Rect f35776c;
    public final Object d;

    public li(e60 e60Var, Rect rect) {
        this.f35774a = 1;
        this.d = e60Var;
        this.f35776c = rect;
        this.f35775b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f50 f50Var;
        switch (this.f35774a) {
            case 0:
                zn znVar = (zn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.p1 p1Var = znVar.N8;
                    if (p1Var != null && p1Var.isShowing()) {
                        View contentView = znVar.N8.getContentView();
                        int[] iArr = this.f35775b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f35776c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            znVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    znVar.A7(true);
                }
                return false;
            default:
                e60 e60Var = (e60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    f50 f50Var2 = e60Var.c3;
                    if (f50Var2 != null && f50Var2.isShowing()) {
                        View contentView2 = e60Var.c3.getContentView();
                        int[] iArr2 = this.f35775b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f35776c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            e60Var.c3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (f50Var = e60Var.c3) != null && f50Var.isShowing()) {
                    e60Var.c3.dismiss();
                }
                return false;
        }
    }

    public li(zn znVar, Rect rect) {
        this.f35774a = 0;
        this.d = znVar;
        this.f35776c = rect;
        this.f35775b = new int[2];
    }
}
