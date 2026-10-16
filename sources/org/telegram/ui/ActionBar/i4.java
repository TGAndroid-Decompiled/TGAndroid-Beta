package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.gp0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f20066a;
    public final Object f20067b;
    public final Object f20068c;
    public final Object d;

    public i4(gp0 gp0Var, gp0 gp0Var2, gp0 gp0Var3) {
        this.f20066a = 1;
        this.f20067b = gp0Var;
        this.f20068c = gp0Var2;
        this.d = gp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f20066a) {
            case 0:
                Rect rect = (Rect) this.f20067b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f20068c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f20464b;
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
                ((gp0) this.f20067b).setProgress(org.telegram.ui.m5.f37909c);
                ((gp0) this.f20068c).setProgress(org.telegram.ui.m5.d);
                ((gp0) this.d).setProgress(org.telegram.ui.m5.e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f20066a = 0;
        this.d = v4Var;
        this.f20067b = new Rect();
        this.f20068c = new Rect();
    }
}
