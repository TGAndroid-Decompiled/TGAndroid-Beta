package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.pm0;
public final class w3 implements View.OnLayoutChangeListener {
    public final int f28775a;
    public final Object f28776b;
    public final Object f28777c;
    public final Object d;

    public w3(pm0 pm0Var, pm0 pm0Var2, pm0 pm0Var3) {
        this.f28775a = 1;
        this.f28776b = pm0Var;
        this.f28777c = pm0Var2;
        this.d = pm0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f28775a) {
            case 0:
                Rect rect = (Rect) this.f28776b;
                rect.set(i3, i10, i11, i12);
                Rect rect2 = (Rect) this.f28777c;
                rect2.set(i13, i14, i15, i16);
                k4 k4Var = (k4) this.d;
                i4 i4Var = k4Var.f27768b;
                if (i4Var.f() && !rect.equals(rect2)) {
                    k4Var.h = true;
                    if (i4Var.f()) {
                        k4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((pm0) this.f28776b).setProgress(org.telegram.ui.j5.k1);
                ((pm0) this.f28777c).setProgress(org.telegram.ui.j5.f46496l1);
                ((pm0) this.d).setProgress(org.telegram.ui.j5.m1);
                return;
        }
    }

    public w3(k4 k4Var) {
        this.f28775a = 0;
        this.d = k4Var;
        this.f28776b = new Rect();
        this.f28777c = new Rect();
    }
}
