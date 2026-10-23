package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.dp0;
public final class k4 implements View.OnLayoutChangeListener {
    public final int f21550a;
    public final Object f21551b;
    public final Object f21552c;
    public final Object d;

    public k4(dp0 dp0Var, dp0 dp0Var2, dp0 dp0Var3) {
        this.f21550a = 1;
        this.f21551b = dp0Var;
        this.f21552c = dp0Var2;
        this.d = dp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21550a) {
            case 0:
                Rect rect = (Rect) this.f21551b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21552c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.f21883b;
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
                ((dp0) this.f21551b).setProgress(org.telegram.ui.n5.f39416c);
                ((dp0) this.f21552c).setProgress(org.telegram.ui.n5.d);
                ((dp0) this.d).setProgress(org.telegram.ui.n5.e);
                return;
        }
    }

    public k4(x4 x4Var) {
        this.f21550a = 0;
        this.d = x4Var;
        this.f21551b = new Rect();
        this.f21552c = new Rect();
    }
}
