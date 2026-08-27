package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class x51 implements View.OnLayoutChangeListener {

    public Boolean f34505a;

    public boolean f34506b;

    public final org.telegram.ui.i6 f34507c;

    public x51(org.telegram.ui.i6 i6Var, View view) {
        this.f34507c = i6Var;
        o1.j jVar = new o1.j(view, o1.h.f19130n, 0.0f);
        i6Var.f38985c = jVar;
        jVar.f19147u.a(1.0f);
        ((o1.j) i6Var.f38985c).f19147u.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.x > point.y;
        Boolean bool = this.f34505a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f34505a = Boolean.valueOf(z10);
            this.f34506b = true;
        }
        if (i15 == 0 || i15 == i11 || this.f34506b) {
            this.f34506b = false;
            return;
        }
        org.telegram.ui.i6 i6Var = this.f34507c;
        ((o1.j) i6Var.f38985c).c();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((o1.j) i6Var.f38985c).f19147u.f19154i = 0.0f;
        view.setTranslationY((i15 - i11) + 0.0f);
        ((o1.j) i6Var.f38985c).f();
    }
}
