package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ni implements View.OnTouchListener {
    public final int f36053a;
    public final int[] f36054b;
    public final Rect f36055c;
    public final Object d;

    public ni(i60 i60Var, Rect rect) {
        this.f36053a = 1;
        this.d = i60Var;
        this.f36055c = rect;
        this.f36054b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i50 i50Var;
        switch (this.f36053a) {
            case 0:
                zn znVar = (zn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = znVar.Q8.getContentView();
                        int[] iArr = this.f36054b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f36055c;
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
                i60 i60Var = (i60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    i50 i50Var2 = i60Var.f34404f3;
                    if (i50Var2 != null && i50Var2.isShowing()) {
                        View contentView2 = i60Var.f34404f3.getContentView();
                        int[] iArr2 = this.f36054b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f36055c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            i60Var.f34404f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (i50Var = i60Var.f34404f3) != null && i50Var.isShowing()) {
                    i60Var.f34404f3.dismiss();
                }
                return false;
        }
    }

    public ni(zn znVar, Rect rect) {
        this.f36053a = 0;
        this.d = znVar;
        this.f36055c = rect;
        this.f36054b = new int[2];
    }
}
