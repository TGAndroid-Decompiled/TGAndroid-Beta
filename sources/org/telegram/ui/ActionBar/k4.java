package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.dp0;
public final class k4 implements View.OnLayoutChangeListener {
    public final int f21549a;
    public final Object f21550b;
    public final Object f21551c;
    public final Object d;

    public k4(dp0 dp0Var, dp0 dp0Var2, dp0 dp0Var3) {
        this.f21549a = 1;
        this.f21550b = dp0Var;
        this.f21551c = dp0Var2;
        this.d = dp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21549a) {
            case 0:
                Rect rect = (Rect) this.f21550b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21551c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.f21882b;
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
                ((dp0) this.f21550b).setProgress(org.telegram.ui.n5.f39415c);
                ((dp0) this.f21551c).setProgress(org.telegram.ui.n5.d);
                ((dp0) this.d).setProgress(org.telegram.ui.n5.e);
                return;
        }
    }

    public k4(x4 x4Var) {
        this.f21549a = 0;
        this.d = x4Var;
        this.f21550b = new Rect();
        this.f21551c = new Rect();
    }
}
