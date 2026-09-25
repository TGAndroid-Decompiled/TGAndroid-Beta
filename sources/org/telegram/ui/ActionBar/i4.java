package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.so0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f19480a;
    public final Object f19481b;
    public final Object f19482c;
    public final Object d;

    public i4(so0 so0Var, so0 so0Var2, so0 so0Var3) {
        this.f19480a = 1;
        this.f19481b = so0Var;
        this.f19482c = so0Var2;
        this.d = so0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19480a) {
            case 0:
                Rect rect = (Rect) this.f19481b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19482c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f19878b;
                if (t4Var.f() && !rect.equals(rect2)) {
                    v4Var.h = true;
                    if (t4Var.f()) {
                        v4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((so0) this.f19481b).setProgress(org.telegram.ui.i5.f34414c);
                ((so0) this.f19482c).setProgress(org.telegram.ui.i5.d);
                ((so0) this.d).setProgress(org.telegram.ui.i5.e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f19480a = 0;
        this.d = v4Var;
        this.f19481b = new Rect();
        this.f19482c = new Rect();
    }
}
