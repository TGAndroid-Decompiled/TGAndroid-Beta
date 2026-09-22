package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h71 implements View.OnLayoutChangeListener {
    public Boolean f24705a;
    public boolean f24706b;
    public final org.telegram.ui.Cells.f3 f24707c;

    public h71(org.telegram.ui.Cells.f3 f3Var, View view) {
        this.f24707c = f3Var;
        o1.k kVar = new o1.k(view, o1.h.f15520n, 0.0f);
        f3Var.f20285c = kVar;
        kVar.f15537u.a(1.0f);
        ((o1.k) f3Var.f20285c).f15537u.b(350.0f);
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
        Boolean bool = this.f24705a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f24705a = Boolean.valueOf(z10);
            this.f24706b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f24706b) {
            org.telegram.ui.Cells.f3 f3Var = this.f24707c;
            ((o1.k) f3Var.f20285c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) f3Var.f20285c).f15537u.f15543i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) f3Var.f20285c).f();
            return;
        }
        this.f24706b = false;
    }
}
