package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class qh implements View.OnTouchListener {
    public final int f48888a;
    public final int[] f48889b;
    public final Rect f48890c;
    public final Object d;

    public qh(x30 x30Var, Rect rect) {
        this.f48888a = 1;
        this.d = x30Var;
        this.f48890c = rect;
        this.f48889b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        z20 z20Var;
        switch (this.f48888a) {
            case 0:
                wm wmVar = (wm) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.f1 f1Var = wmVar.f51316f9;
                    if (f1Var != null && f1Var.isShowing()) {
                        View contentView = wmVar.f51316f9.getContentView();
                        int[] iArr = this.f48889b;
                        contentView.getLocationInWindow(iArr);
                        int i3 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f48890c;
                        rect.set(i3, iArr[1], contentView.getMeasuredWidth() + i3, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            wmVar.O7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    wmVar.O7(true);
                }
                return false;
            default:
                x30 x30Var = (x30) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    z20 z20Var2 = x30Var.X4;
                    if (z20Var2 != null && z20Var2.isShowing()) {
                        View contentView2 = x30Var.X4.getContentView();
                        int[] iArr2 = this.f48889b;
                        contentView2.getLocationInWindow(iArr2);
                        int i10 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f48890c;
                        rect2.set(i10, iArr2[1], contentView2.getMeasuredWidth() + i10, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            x30Var.X4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (z20Var = x30Var.X4) != null && z20Var.isShowing()) {
                    x30Var.X4.dismiss();
                }
                return false;
        }
    }

    public qh(wm wmVar, Rect rect) {
        this.f48888a = 0;
        this.d = wmVar;
        this.f48890c = rect;
        this.f48889b = new int[2];
    }
}
