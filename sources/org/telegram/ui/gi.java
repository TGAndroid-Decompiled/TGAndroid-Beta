package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class gi implements View.OnTouchListener {
    public final int f37189a;
    public final int[] f37190b;
    public final Rect f37191c;
    public final Object d;

    public gi(s50 s50Var, Rect rect) {
        this.f37189a = 1;
        this.d = s50Var;
        this.f37191c = rect;
        this.f37190b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s40 s40Var;
        switch (this.f37189a) {
            case 0:
                sn snVar = (sn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = snVar.Q8.getContentView();
                        int[] iArr = this.f37190b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f37191c;
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
                s50 s50Var = (s50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    s40 s40Var2 = s50Var.f40920f3;
                    if (s40Var2 != null && s40Var2.isShowing()) {
                        View contentView2 = s50Var.f40920f3.getContentView();
                        int[] iArr2 = this.f37190b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f37191c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            s50Var.f40920f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (s40Var = s50Var.f40920f3) != null && s40Var.isShowing()) {
                    s50Var.f40920f3.dismiss();
                }
                return false;
        }
    }

    public gi(sn snVar, Rect rect) {
        this.f37189a = 0;
        this.d = snVar;
        this.f37191c = rect;
        this.f37190b = new int[2];
    }
}
