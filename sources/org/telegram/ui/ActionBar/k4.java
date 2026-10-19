package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.cp0;
public final class k4 implements View.OnLayoutChangeListener {
    public final int f21543a;
    public final Object f21544b;
    public final Object f21545c;
    public final Object d;

    public k4(cp0 cp0Var, cp0 cp0Var2, cp0 cp0Var3) {
        this.f21543a = 1;
        this.f21544b = cp0Var;
        this.f21545c = cp0Var2;
        this.d = cp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21543a) {
            case 0:
                Rect rect = (Rect) this.f21544b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21545c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.f21876b;
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
                ((cp0) this.f21544b).setProgress(org.telegram.ui.n5.f39406c);
                ((cp0) this.f21545c).setProgress(org.telegram.ui.n5.d);
                ((cp0) this.d).setProgress(org.telegram.ui.n5.e);
                return;
        }
    }

    public k4(x4 x4Var) {
        this.f21543a = 0;
        this.d = x4Var;
        this.f21544b = new Rect();
        this.f21545c = new Rect();
    }
}
