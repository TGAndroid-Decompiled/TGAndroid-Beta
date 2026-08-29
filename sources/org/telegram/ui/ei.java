package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ei implements View.OnTouchListener {
    public final int f37839a;
    public final int[] f37840b;
    public final Rect f37841c;
    public final Object d;

    public ei(r50 r50Var, Rect rect) {
        this.f37839a = 1;
        this.d = r50Var;
        this.f37841c = rect;
        this.f37840b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r40 r40Var;
        switch (this.f37839a) {
            case 0:
                tn tnVar = (tn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = tnVar.M8.getContentView();
                        int[] iArr = this.f37840b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f37841c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            tnVar.A7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    tnVar.A7(true);
                }
                return false;
            default:
                r50 r50Var = (r50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    r40 r40Var2 = r50Var.f41875b3;
                    if (r40Var2 != null && r40Var2.isShowing()) {
                        View contentView2 = r50Var.f41875b3.getContentView();
                        int[] iArr2 = this.f37840b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f37841c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            r50Var.f41875b3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (r40Var = r50Var.f41875b3) != null && r40Var.isShowing()) {
                    r50Var.f41875b3.dismiss();
                }
                return false;
        }
    }

    public ei(tn tnVar, Rect rect) {
        this.f37839a = 0;
        this.d = tnVar;
        this.f37841c = rect;
        this.f37840b = new int[2];
    }
}
