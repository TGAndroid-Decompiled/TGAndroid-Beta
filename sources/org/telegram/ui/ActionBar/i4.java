package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.lp0;
public final class i4 implements View.OnLayoutChangeListener {
    public final int f21243a;
    public final Object f21244b;
    public final Object f21245c;
    public final Object d;

    public i4(lp0 lp0Var, lp0 lp0Var2, lp0 lp0Var3) {
        this.f21243a = 1;
        this.f21244b = lp0Var;
        this.f21245c = lp0Var2;
        this.d = lp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21243a) {
            case 0:
                Rect rect = (Rect) this.f21244b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21245c;
                rect2.set(i14, i15, i16, i17);
                v4 v4Var = (v4) this.d;
                t4 t4Var = v4Var.f21665b;
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
                ((lp0) this.f21244b).setProgress(org.telegram.ui.h5.f38328c);
                ((lp0) this.f21245c).setProgress(org.telegram.ui.h5.d);
                ((lp0) this.d).setProgress(org.telegram.ui.h5.f38329e);
                return;
        }
    }

    public i4(v4 v4Var) {
        this.f21243a = 0;
        this.d = v4Var;
        this.f21244b = new Rect();
        this.f21245c = new Rect();
    }
}
