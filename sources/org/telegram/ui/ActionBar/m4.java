package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.ko0;
public final class m4 implements View.OnLayoutChangeListener {
    public final int f22135a;
    public final Object f22136b;
    public final Object f22137c;
    public final Object d;

    public m4(ko0 ko0Var, ko0 ko0Var2, ko0 ko0Var3) {
        this.f22135a = 1;
        this.f22136b = ko0Var;
        this.f22137c = ko0Var2;
        this.d = ko0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f22135a) {
            case 0:
                Rect rect = (Rect) this.f22136b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f22137c;
                rect2.set(i14, i15, i16, i17);
                z4 z4Var = (z4) this.d;
                x4 x4Var = z4Var.f22493b;
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
                ((ko0) this.f22136b).setProgress(org.telegram.ui.l5.f38538c);
                ((ko0) this.f22137c).setProgress(org.telegram.ui.l5.d);
                ((ko0) this.d).setProgress(org.telegram.ui.l5.f38539e);
                return;
        }
    }

    public m4(z4 z4Var) {
        this.f22135a = 0;
        this.d = z4Var;
        this.f22136b = new Rect();
        this.f22137c = new Rect();
    }
}
