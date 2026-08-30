package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.ko0;
public final class l4 implements View.OnLayoutChangeListener {
    public final int f20425a;
    public final Object f20426b;
    public final Object f20427c;
    public final Object d;

    public l4(ko0 ko0Var, ko0 ko0Var2, ko0 ko0Var3) {
        this.f20425a = 1;
        this.f20426b = ko0Var;
        this.f20427c = ko0Var2;
        this.d = ko0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f20425a) {
            case 0:
                Rect rect = (Rect) this.f20426b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f20427c;
                rect2.set(i14, i15, i16, i17);
                y4 y4Var = (y4) this.d;
                w4 w4Var = y4Var.f20758b;
                if (w4Var.f() && !rect.equals(rect2)) {
                    y4Var.h = true;
                    if (w4Var.f()) {
                        y4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ko0) this.f20426b).setProgress(org.telegram.ui.l5.f35957c);
                ((ko0) this.f20427c).setProgress(org.telegram.ui.l5.d);
                ((ko0) this.d).setProgress(org.telegram.ui.l5.e);
                return;
        }
    }

    public l4(y4 y4Var) {
        this.f20425a = 0;
        this.d = y4Var;
        this.f20426b = new Rect();
        this.f20427c = new Rect();
    }
}
