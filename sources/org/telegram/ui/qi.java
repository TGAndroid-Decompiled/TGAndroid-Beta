package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class qi implements View.OnTouchListener {
    public final int f40795a;
    public final int[] f40796b;
    public final Rect f40797c;
    public final Object d;

    public qi(a50 a50Var, Rect rect) {
        this.f40795a = 1;
        this.d = a50Var;
        this.f40797c = rect;
        this.f40796b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        b40 b40Var;
        switch (this.f40795a) {
            case 0:
                un unVar = (un) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.k1 k1Var = unVar.f42051e9;
                    if (k1Var != null && k1Var.isShowing()) {
                        View contentView = unVar.f42051e9.getContentView();
                        int[] iArr = this.f40796b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f40797c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            unVar.M7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    unVar.M7(true);
                }
                return false;
            default:
                a50 a50Var = (a50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    b40 b40Var2 = a50Var.W4;
                    if (b40Var2 != null && b40Var2.isShowing()) {
                        View contentView2 = a50Var.W4.getContentView();
                        int[] iArr2 = this.f40796b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f40797c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            a50Var.W4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (b40Var = a50Var.W4) != null && b40Var.isShowing()) {
                    a50Var.W4.dismiss();
                }
                return false;
        }
    }

    public qi(un unVar, Rect rect) {
        this.f40795a = 0;
        this.d = unVar;
        this.f40797c = rect;
        this.f40796b = new int[2];
    }
}
