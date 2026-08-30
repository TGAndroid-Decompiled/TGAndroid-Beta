package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t61 implements View.OnLayoutChangeListener {
    public Boolean f28912a;
    public boolean f28913b;
    public final n7.qa f28914c;

    public t61(n7.qa qaVar, View view) {
        this.f28914c = qaVar;
        o1.j jVar = new o1.j(view, o1.h.f16182n, 0.0f);
        qaVar.f14703c = jVar;
        jVar.f16198u.a(1.0f);
        ((o1.j) qaVar.f14703c).f16198u.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z4;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.f28912a;
        if (bool == null || bool.booleanValue() != z4) {
            this.f28912a = Boolean.valueOf(z4);
            this.f28913b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f28913b) {
            n7.qa qaVar = this.f28914c;
            ((o1.j) qaVar.f14703c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) qaVar.f14703c).f16198u.f16204i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.j) qaVar.f14703c).f();
            return;
        }
        this.f28913b = false;
    }
}
