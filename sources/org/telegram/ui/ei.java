package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ei implements View.OnTouchListener {
    public final int f36974a;
    public final int[] f36975b;
    public final Rect f36976c;
    public final Object d;

    public ei(u50 u50Var, Rect rect) {
        this.f36974a = 1;
        this.d = u50Var;
        this.f36976c = rect;
        this.f36975b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        t40 t40Var;
        switch (this.f36974a) {
            case 0:
                sn snVar = (sn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.m1 m1Var = snVar.f41484c9;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = snVar.f41484c9.getContentView();
                        int[] iArr = this.f36975b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f36976c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            snVar.D7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    snVar.D7(true);
                }
                return false;
            default:
                u50 u50Var = (u50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    t40 t40Var2 = u50Var.f42195f3;
                    if (t40Var2 != null && t40Var2.isShowing()) {
                        View contentView2 = u50Var.f42195f3.getContentView();
                        int[] iArr2 = this.f36975b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f36976c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            u50Var.f42195f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (t40Var = u50Var.f42195f3) != null && t40Var.isShowing()) {
                    u50Var.f42195f3.dismiss();
                }
                return false;
        }
    }

    public ei(sn snVar, Rect rect) {
        this.f36974a = 0;
        this.d = snVar;
        this.f36976c = rect;
        this.f36975b = new int[2];
    }
}
