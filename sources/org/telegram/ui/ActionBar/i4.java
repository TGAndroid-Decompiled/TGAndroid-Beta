package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.vo0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f19496a;
    public final Object f19497b;
    public final Object f19498c;
    public final Object d;

    public i4(vo0 vo0Var, vo0 vo0Var2, vo0 vo0Var3) {
        this.f19496a = 1;
        this.f19497b = vo0Var;
        this.f19498c = vo0Var2;
        this.d = vo0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f19496a) {
            case 0:
                Rect rect = (Rect) this.f19497b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f19498c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f19894b;
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
                ((vo0) this.f19497b).setProgress(org.telegram.ui.i5.f34508c);
                ((vo0) this.f19498c).setProgress(org.telegram.ui.i5.d);
                ((vo0) this.d).setProgress(org.telegram.ui.i5.e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f19496a = 0;
        this.d = v4Var;
        this.f19497b = new Rect();
        this.f19498c = new Rect();
    }
}
