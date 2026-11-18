package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.ym0;
public final class a4 implements View.OnLayoutChangeListener {
    public final int f28755a;
    public final Object f28756b;
    public final Object f28757c;
    public final Object d;

    public a4(ym0 ym0Var, ym0 ym0Var2, ym0 ym0Var3) {
        this.f28755a = 1;
        this.f28756b = ym0Var;
        this.f28757c = ym0Var2;
        this.d = ym0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f28755a) {
            case 0:
                Rect rect = (Rect) this.f28756b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.f28757c;
                rect2.set(i13, i14, i15, i16);
                m4 m4Var = (m4) this.d;
                k4 k4Var = m4Var.f29235b;
                if (k4Var.f() && !rect.equals(rect2)) {
                    m4Var.h = true;
                    if (k4Var.f()) {
                        m4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ym0) this.f28756b).setProgress(org.telegram.ui.h5.n1);
                ((ym0) this.f28757c).setProgress(org.telegram.ui.h5.f48152o1);
                ((ym0) this.d).setProgress(org.telegram.ui.h5.f48153p1);
                return;
        }
    }

    public a4(m4 m4Var) {
        this.f28755a = 0;
        this.d = m4Var;
        this.f28756b = new Rect();
        this.f28757c = new Rect();
    }
}
