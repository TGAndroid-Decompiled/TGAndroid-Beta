package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.mp0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f21207a;
    public final Object f21208b;
    public final Object f21209c;
    public final Object d;

    public i4(mp0 mp0Var, mp0 mp0Var2, mp0 mp0Var3) {
        this.f21207a = 1;
        this.f21208b = mp0Var;
        this.f21209c = mp0Var2;
        this.d = mp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21207a) {
            case 0:
                Rect rect = (Rect) this.f21208b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21209c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f21629b;
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
                ((mp0) this.f21208b).setProgress(org.telegram.ui.h5.f38294c);
                ((mp0) this.f21209c).setProgress(org.telegram.ui.h5.d);
                ((mp0) this.d).setProgress(org.telegram.ui.h5.f38295e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f21207a = 0;
        this.d = v4Var;
        this.f21208b = new Rect();
        this.f21209c = new Rect();
    }
}
