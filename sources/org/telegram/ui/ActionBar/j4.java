package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.zo0;
public final class j4 implements View.OnLayoutChangeListener {
    public final int f21250a;
    public final Object f21251b;
    public final Object f21252c;
    public final Object d;

    public j4(zo0 zo0Var, zo0 zo0Var2, zo0 zo0Var3) {
        this.f21250a = 1;
        this.f21251b = zo0Var;
        this.f21252c = zo0Var2;
        this.d = zo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21250a) {
            case 0:
                Rect rect = (Rect) this.f21251b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21252c;
                rect2.set(i14, i15, i16, i17);
                w4 w4Var = (w4) this.d;
                u4 u4Var = w4Var.f21673b;
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
                ((zo0) this.f21251b).setProgress(org.telegram.ui.j5.f37571c);
                ((zo0) this.f21252c).setProgress(org.telegram.ui.j5.d);
                ((zo0) this.d).setProgress(org.telegram.ui.j5.f37572e);
                return;
        }
    }

    public j4(w4 w4Var) {
        this.f21250a = 0;
        this.d = w4Var;
        this.f21251b = new Rect();
        this.f21252c = new Rect();
    }
}
