package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.uo0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f19481a;
    public final Object f19482b;
    public final Object f19483c;
    public final Object d;

    public i4(uo0 uo0Var, uo0 uo0Var2, uo0 uo0Var3) {
        this.f19481a = 1;
        this.f19482b = uo0Var;
        this.f19483c = uo0Var2;
        this.d = uo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19481a) {
            case 0:
                Rect rect = (Rect) this.f19482b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19483c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f19879b;
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
                ((uo0) this.f19482b).setProgress(org.telegram.ui.i5.f34416c);
                ((uo0) this.f19483c).setProgress(org.telegram.ui.i5.d);
                ((uo0) this.d).setProgress(org.telegram.ui.i5.e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f19481a = 0;
        this.d = v4Var;
        this.f19482b = new Rect();
        this.f19483c = new Rect();
    }
}
