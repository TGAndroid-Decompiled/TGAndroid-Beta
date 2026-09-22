package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.uo0;
public final class k4 implements View.OnLayoutChangeListener {
    public final int f19583a;
    public final Object f19584b;
    public final Object f19585c;
    public final Object d;

    public k4(uo0 uo0Var, uo0 uo0Var2, uo0 uo0Var3) {
        this.f19583a = 1;
        this.f19584b = uo0Var;
        this.f19585c = uo0Var2;
        this.d = uo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19583a) {
            case 0:
                Rect rect = (Rect) this.f19584b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19585c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.f19935b;
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
                ((uo0) this.f19584b).setProgress(org.telegram.ui.i5.f34374c);
                ((uo0) this.f19585c).setProgress(org.telegram.ui.i5.d);
                ((uo0) this.d).setProgress(org.telegram.ui.i5.e);
                return;
        }
    }

    public k4(x4 x4Var) {
        this.f19583a = 0;
        this.d = x4Var;
        this.f19584b = new Rect();
        this.f19585c = new Rect();
    }
}
