package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f71 implements View.OnLayoutChangeListener {
    public Boolean f24021a;
    public boolean f24022b;
    public final org.telegram.ui.Cells.f3 f24023c;

    public f71(org.telegram.ui.Cells.f3 f3Var, View view) {
        this.f24023c = f3Var;
        o1.k kVar = new o1.k(view, o1.h.f15505n, 0.0f);
        f3Var.f20270c = kVar;
        kVar.f15522u.a(1.0f);
        ((o1.k) f3Var.f20270c).f15522u.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f24021a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f24021a = Boolean.valueOf(z10);
            this.f24022b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f24022b) {
            org.telegram.ui.Cells.f3 f3Var = this.f24023c;
            ((o1.k) f3Var.f20270c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) f3Var.f20270c).f15522u.f15528i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) f3Var.f20270c).f();
            return;
        }
        this.f24022b = false;
    }
}
