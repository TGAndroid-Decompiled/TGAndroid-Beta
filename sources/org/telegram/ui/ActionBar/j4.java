package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.kp0;
public final class j4 implements View.OnLayoutChangeListener {
    public final int f21216a;
    public final Object f21217b;
    public final Object f21218c;
    public final Object d;

    public j4(kp0 kp0Var, kp0 kp0Var2, kp0 kp0Var3) {
        this.f21216a = 1;
        this.f21217b = kp0Var;
        this.f21218c = kp0Var2;
        this.d = kp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21216a) {
            case 0:
                Rect rect = (Rect) this.f21217b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21218c;
                rect2.set(i14, i15, i16, i17);
                w4 w4Var = (w4) this.d;
                u4 u4Var = w4Var.f21672b;
                if (u4Var.f() && !rect.equals(rect2)) {
                    w4Var.h = true;
                    if (u4Var.f()) {
                        w4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((kp0) this.f21217b).setProgress(org.telegram.ui.i5.f38525c);
                ((kp0) this.f21218c).setProgress(org.telegram.ui.i5.d);
                ((kp0) this.d).setProgress(org.telegram.ui.i5.f38526e);
                return;
        }
    }

    public j4(w4 w4Var) {
        this.f21216a = 0;
        this.d = w4Var;
        this.f21217b = new Rect();
        this.f21218c = new Rect();
    }
}
