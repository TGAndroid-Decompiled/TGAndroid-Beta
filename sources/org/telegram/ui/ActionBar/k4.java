package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.fo0;
public final class k4 implements View.OnLayoutChangeListener {
    public final int f21160a;
    public final Object f21161b;
    public final Object f21162c;
    public final Object d;

    public k4(fo0 fo0Var, fo0 fo0Var2, fo0 fo0Var3) {
        this.f21160a = 1;
        this.f21161b = fo0Var;
        this.f21162c = fo0Var2;
        this.d = fo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21160a) {
            case 0:
                Rect rect = (Rect) this.f21161b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21162c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.f21535b;
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
                ((fo0) this.f21161b).setProgress(org.telegram.ui.i5.f37267c);
                ((fo0) this.f21162c).setProgress(org.telegram.ui.i5.d);
                ((fo0) this.d).setProgress(org.telegram.ui.i5.f37268e);
                return;
        }
    }

    public k4(x4 x4Var) {
        this.f21160a = 0;
        this.d = x4Var;
        this.f21161b = new Rect();
        this.f21162c = new Rect();
    }
}
