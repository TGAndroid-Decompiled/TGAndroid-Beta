package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.lo0;
public final class m4 implements View.OnLayoutChangeListener {
    public final int f22133a;
    public final Object f22134b;
    public final Object f22135c;
    public final Object d;

    public m4(lo0 lo0Var, lo0 lo0Var2, lo0 lo0Var3) {
        this.f22133a = 1;
        this.f22134b = lo0Var;
        this.f22135c = lo0Var2;
        this.d = lo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f22133a) {
            case 0:
                Rect rect = (Rect) this.f22134b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f22135c;
                rect2.set(i14, i15, i16, i17);
                z4 z4Var = (z4) this.d;
                x4 x4Var = z4Var.f22491b;
                if (x4Var.f() && !rect.equals(rect2)) {
                    z4Var.h = true;
                    if (x4Var.f()) {
                        z4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((lo0) this.f22134b).setProgress(org.telegram.ui.l5.f38637c);
                ((lo0) this.f22135c).setProgress(org.telegram.ui.l5.d);
                ((lo0) this.d).setProgress(org.telegram.ui.l5.f38638e);
                return;
        }
    }

    public m4(z4 z4Var) {
        this.f22133a = 0;
        this.d = z4Var;
        this.f22134b = new Rect();
        this.f22135c = new Rect();
    }
}
