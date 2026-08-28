package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class bi implements View.OnTouchListener {
    public final int f36862a;
    public final int[] f36863b;
    public final Rect f36864c;
    public final Object d;

    public bi(o50 o50Var, Rect rect) {
        this.f36862a = 1;
        this.d = o50Var;
        this.f36864c = rect;
        this.f36863b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o40 o40Var;
        switch (this.f36862a) {
            case 0:
                qn qnVar = (qn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = qnVar.M8;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = qnVar.M8.getContentView();
                        int[] iArr = this.f36863b;
                        contentView.getLocationInWindow(iArr);
                        int i9 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f36864c;
                        rect.set(i9, iArr[1], contentView.getMeasuredWidth() + i9, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            qnVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    qnVar.A7(true);
                }
                return false;
            default:
                o50 o50Var = (o50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    o40 o40Var2 = o50Var.f40887b3;
                    if (o40Var2 != null && o40Var2.isShowing()) {
                        View contentView2 = o50Var.f40887b3.getContentView();
                        int[] iArr2 = this.f36863b;
                        contentView2.getLocationInWindow(iArr2);
                        int i10 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f36864c;
                        rect2.set(i10, iArr2[1], contentView2.getMeasuredWidth() + i10, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            o50Var.f40887b3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (o40Var = o50Var.f40887b3) != null && o40Var.isShowing()) {
                    o50Var.f40887b3.dismiss();
                }
                return false;
        }
    }

    public bi(qn qnVar, Rect rect) {
        this.f36862a = 0;
        this.d = qnVar;
        this.f36864c = rect;
        this.f36863b = new int[2];
    }
}
