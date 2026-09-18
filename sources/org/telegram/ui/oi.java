package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class oi implements View.OnTouchListener {
    public final int f36358a;
    public final int[] f36359b;
    public final Rect f36360c;
    public final Object d;

    public oi(k60 k60Var, Rect rect) {
        this.f36358a = 1;
        this.d = k60Var;
        this.f36360c = rect;
        this.f36359b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k50 k50Var;
        switch (this.f36358a) {
            case 0:
                bo boVar = (bo) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = boVar.Q8;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = boVar.Q8.getContentView();
                        int[] iArr = this.f36359b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f36360c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            boVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    boVar.A7(true);
                }
                return false;
            default:
                k60 k60Var = (k60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    k50 k50Var2 = k60Var.f35041f3;
                    if (k50Var2 != null && k50Var2.isShowing()) {
                        View contentView2 = k60Var.f35041f3.getContentView();
                        int[] iArr2 = this.f36359b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f36360c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            k60Var.f35041f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (k50Var = k60Var.f35041f3) != null && k50Var.isShowing()) {
                    k60Var.f35041f3.dismiss();
                }
                return false;
        }
    }

    public oi(bo boVar, Rect rect) {
        this.f36358a = 0;
        this.d = boVar;
        this.f36360c = rect;
        this.f36359b = new int[2];
    }
}
