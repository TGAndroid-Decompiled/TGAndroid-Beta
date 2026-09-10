package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class pi implements View.OnTouchListener {
    public final int f35844a;
    public final int[] f35845b;
    public final Rect f35846c;
    public final Object d;

    public pi(j60 j60Var, Rect rect) {
        this.f35844a = 1;
        this.d = j60Var;
        this.f35846c = rect;
        this.f35845b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j50 j50Var;
        switch (this.f35844a) {
            case 0:
                eo eoVar = (eo) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.p1 p1Var = eoVar.Q8;
                    if (p1Var != null && p1Var.isShowing()) {
                        View contentView = eoVar.Q8.getContentView();
                        int[] iArr = this.f35845b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f35846c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            eoVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    eoVar.A7(true);
                }
                return false;
            default:
                j60 j60Var = (j60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    j50 j50Var2 = j60Var.f33960f3;
                    if (j50Var2 != null && j50Var2.isShowing()) {
                        View contentView2 = j60Var.f33960f3.getContentView();
                        int[] iArr2 = this.f35845b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f35846c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            j60Var.f33960f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (j50Var = j60Var.f33960f3) != null && j50Var.isShowing()) {
                    j60Var.f33960f3.dismiss();
                }
                return false;
        }
    }

    public pi(eo eoVar, Rect rect) {
        this.f35844a = 0;
        this.d = eoVar;
        this.f35846c = rect;
        this.f35845b = new int[2];
    }
}
