package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.so0;
public final class k4 implements View.OnLayoutChangeListener {
    public final int f19568a;
    public final Object f19569b;
    public final Object f19570c;
    public final Object d;

    public k4(so0 so0Var, so0 so0Var2, so0 so0Var3) {
        this.f19568a = 1;
        this.f19569b = so0Var;
        this.f19570c = so0Var2;
        this.d = so0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19568a) {
            case 0:
                Rect rect = (Rect) this.f19569b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19570c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.f19920b;
                if (v4Var.f() && !rect.equals(rect2)) {
                    x4Var.h = true;
                    if (v4Var.f()) {
                        x4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((so0) this.f19569b).setProgress(org.telegram.ui.i5.f34354c);
                ((so0) this.f19570c).setProgress(org.telegram.ui.i5.d);
                ((so0) this.d).setProgress(org.telegram.ui.i5.e);
                return;
        }
    }

    public k4(x4 x4Var) {
        this.f19568a = 0;
        this.d = x4Var;
        this.f19569b = new Rect();
        this.f19570c = new Rect();
    }
}
