package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t61 implements View.OnLayoutChangeListener {
    public Boolean f28924a;
    public boolean f28925b;
    public final n7.qa f28926c;

    public t61(n7.qa qaVar, View view) {
        this.f28926c = qaVar;
        o1.j jVar = new o1.j(view, o1.h.f16162n, 0.0f);
        qaVar.f14688c = jVar;
        jVar.f16178u.a(1.0f);
        ((o1.j) qaVar.f14688c).f16178u.b(350.0f);
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
        Boolean bool = this.f28924a;
        if (bool == null || bool.booleanValue() != z4) {
            this.f28924a = Boolean.valueOf(z4);
            this.f28925b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f28925b) {
            n7.qa qaVar = this.f28926c;
            ((o1.j) qaVar.f14688c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) qaVar.f14688c).f16178u.f16184i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.j) qaVar.f14688c).f();
            return;
        }
        this.f28925b = false;
    }
}
