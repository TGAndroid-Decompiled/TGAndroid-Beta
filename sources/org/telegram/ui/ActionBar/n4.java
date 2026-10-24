package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.gp0;
public final class n4 implements View.OnLayoutChangeListener {
    public final int f21673a;
    public final Object f21674b;
    public final Object f21675c;
    public final Object d;

    public n4(gp0 gp0Var, gp0 gp0Var2, gp0 gp0Var3) {
        this.f21673a = 1;
        this.f21674b = gp0Var;
        this.f21675c = gp0Var2;
        this.d = gp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21673a) {
            case 0:
                Rect rect = (Rect) this.f21674b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21675c;
                rect2.set(i14, i15, i16, i17);
                a5 a5Var = (a5) this.d;
                y4 y4Var = a5Var.f20693b;
                if (y4Var.f() && !rect.equals(rect2)) {
                    a5Var.h = true;
                    if (y4Var.f()) {
                        a5Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((gp0) this.f21674b).setProgress(org.telegram.ui.m5.f39441c);
                ((gp0) this.f21675c).setProgress(org.telegram.ui.m5.d);
                ((gp0) this.d).setProgress(org.telegram.ui.m5.e);
                return;
        }
    }

    public n4(a5 a5Var) {
        this.f21673a = 0;
        this.d = a5Var;
        this.f21674b = new Rect();
        this.f21675c = new Rect();
    }
}
