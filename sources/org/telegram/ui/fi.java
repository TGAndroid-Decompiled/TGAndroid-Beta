package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class fi implements View.OnTouchListener {
    public final int f39380a;
    public final int[] f39381b;
    public final Rect f39382c;
    public final Object d;

    public fi(v50 v50Var, Rect rect) {
        this.f39380a = 1;
        this.d = v50Var;
        this.f39382c = rect;
        this.f39381b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        v40 v40Var;
        switch (this.f39380a) {
            case 0:
                un unVar = (un) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = unVar.f44213c9;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = unVar.f44213c9.getContentView();
                        int[] iArr = this.f39381b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f39382c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            unVar.H7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    unVar.H7(true);
                }
                return false;
            default:
                v50 v50Var = (v50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    v40 v40Var2 = v50Var.f44631f3;
                    if (v40Var2 != null && v40Var2.isShowing()) {
                        View contentView2 = v50Var.f44631f3.getContentView();
                        int[] iArr2 = this.f39381b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f39382c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            v50Var.f44631f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (v40Var = v50Var.f44631f3) != null && v40Var.isShowing()) {
                    v50Var.f44631f3.dismiss();
                }
                return false;
        }
    }

    public fi(un unVar, Rect rect) {
        this.f39380a = 0;
        this.d = unVar;
        this.f39382c = rect;
        this.f39381b = new int[2];
    }
}
