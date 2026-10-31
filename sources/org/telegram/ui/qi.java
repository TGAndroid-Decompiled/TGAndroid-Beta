package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class qi implements View.OnTouchListener {
    public final int f40989a;
    public final int[] f40990b;
    public final Rect f40991c;
    public final Object d;

    public qi(b50 b50Var, Rect rect) {
        this.f40989a = 1;
        this.d = b50Var;
        this.f40991c = rect;
        this.f40990b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c40 c40Var;
        switch (this.f40989a) {
            case 0:
                un unVar = (un) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.k1 k1Var = unVar.f42240e9;
                    if (k1Var != null && k1Var.isShowing()) {
                        View contentView = unVar.f42240e9.getContentView();
                        int[] iArr = this.f40990b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f40991c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            unVar.I7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    unVar.I7(true);
                }
                return false;
            default:
                b50 b50Var = (b50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    c40 c40Var2 = b50Var.W4;
                    if (c40Var2 != null && c40Var2.isShowing()) {
                        View contentView2 = b50Var.W4.getContentView();
                        int[] iArr2 = this.f40990b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f40991c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            b50Var.W4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (c40Var = b50Var.W4) != null && c40Var.isShowing()) {
                    b50Var.W4.dismiss();
                }
                return false;
        }
    }

    public qi(un unVar, Rect rect) {
        this.f40989a = 0;
        this.d = unVar;
        this.f40991c = rect;
        this.f40990b = new int[2];
    }
}
