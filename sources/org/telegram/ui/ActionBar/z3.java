package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.mm0;
public final class z3 implements View.OnLayoutChangeListener {
    public final int f28816a;
    public final Object f28817b;
    public final Object f28818c;
    public final Object d;

    public z3(mm0 mm0Var, mm0 mm0Var2, mm0 mm0Var3) {
        this.f28816a = 1;
        this.f28817b = mm0Var;
        this.f28818c = mm0Var2;
        this.d = mm0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f28816a) {
            case 0:
                Rect rect = (Rect) this.f28817b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.f28818c;
                rect2.set(i13, i14, i15, i16);
                l4 l4Var = (l4) this.d;
                j4 j4Var = l4Var.f27753b;
                if (j4Var.f() && !rect.equals(rect2)) {
                    l4Var.h = true;
                    if (j4Var.f()) {
                        l4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((mm0) this.f28817b).setProgress(org.telegram.ui.h5.f46218m1);
                ((mm0) this.f28818c).setProgress(org.telegram.ui.h5.n1);
                ((mm0) this.d).setProgress(org.telegram.ui.h5.f46219o1);
                return;
        }
    }

    public z3(l4 l4Var) {
        this.f28816a = 0;
        this.d = l4Var;
        this.f28817b = new Rect();
        this.f28818c = new Rect();
    }
}
