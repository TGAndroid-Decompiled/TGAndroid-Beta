package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v51 implements View.OnLayoutChangeListener {
    public Boolean f33266a;
    public boolean f33267b;
    public final org.telegram.ui.Cells.e3 f33268c;

    public v51(org.telegram.ui.Cells.e3 e3Var, View view) {
        this.f33268c = e3Var;
        o1.j jVar = new o1.j(view, o1.h.f18783n, 0.0f);
        e3Var.f24287c = jVar;
        jVar.f18800u.a(1.0f);
        ((o1.j) e3Var.f24287c).f18800u.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f33266a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f33266a = Boolean.valueOf(z10);
            this.f33267b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f33267b) {
            org.telegram.ui.Cells.e3 e3Var = this.f33268c;
            ((o1.j) e3Var.f24287c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) e3Var.f24287c).f18800u.f18807i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((o1.j) e3Var.f24287c).f();
            return;
        }
        this.f33267b = false;
    }
}
