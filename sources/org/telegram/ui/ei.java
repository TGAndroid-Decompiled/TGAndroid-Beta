package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ei implements View.OnTouchListener {
    public final int f36660a;
    public final int[] f36661b;
    public final Rect f36662c;
    public final Object d;

    public ei(q50 q50Var, Rect rect) {
        this.f36660a = 1;
        this.d = q50Var;
        this.f36662c = rect;
        this.f36661b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        q40 q40Var;
        switch (this.f36660a) {
            case 0:
                qn qnVar = (qn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = qnVar.Q8.getContentView();
                        int[] iArr = this.f36661b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f36662c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            qnVar.D7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    qnVar.D7(true);
                }
                return false;
            default:
                q50 q50Var = (q50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    q40 q40Var2 = q50Var.f40400f3;
                    if (q40Var2 != null && q40Var2.isShowing()) {
                        View contentView2 = q50Var.f40400f3.getContentView();
                        int[] iArr2 = this.f36661b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f36662c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            q50Var.f40400f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (q40Var = q50Var.f40400f3) != null && q40Var.isShowing()) {
                    q50Var.f40400f3.dismiss();
                }
                return false;
        }
    }

    public ei(qn qnVar, Rect rect) {
        this.f36660a = 0;
        this.d = qnVar;
        this.f36662c = rect;
        this.f36661b = new int[2];
    }
}
