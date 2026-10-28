package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ii implements View.OnTouchListener {
    public final int f40188a;
    public final int[] f40189b;
    public final Rect f40190c;
    public final Object d;

    public ii(x50 x50Var, Rect rect) {
        this.f40188a = 1;
        this.d = x50Var;
        this.f40190c = rect;
        this.f40189b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        x40 x40Var;
        switch (this.f40188a) {
            case 0:
                wn wnVar = (wn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.o1 o1Var = wnVar.f45134g9;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = wnVar.f45134g9.getContentView();
                        int[] iArr = this.f40189b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f40190c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            wnVar.J7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    wnVar.J7(true);
                }
                return false;
            default:
                x50 x50Var = (x50) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    x40 x40Var2 = x50Var.f45515f3;
                    if (x40Var2 != null && x40Var2.isShowing()) {
                        View contentView2 = x50Var.f45515f3.getContentView();
                        int[] iArr2 = this.f40189b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f40190c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            x50Var.f45515f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (x40Var = x50Var.f45515f3) != null && x40Var.isShowing()) {
                    x50Var.f45515f3.dismiss();
                }
                return false;
        }
    }

    public ii(wn wnVar, Rect rect) {
        this.f40188a = 0;
        this.d = wnVar;
        this.f40190c = rect;
        this.f40189b = new int[2];
    }
}
