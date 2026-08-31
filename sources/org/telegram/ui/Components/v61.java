package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v61 implements View.OnLayoutChangeListener {
    public Boolean f31820a;
    public boolean f31821b;
    public final n7.qa f31822c;

    public v61(n7.qa qaVar, View view) {
        this.f31822c = qaVar;
        o1.j jVar = new o1.j(view, o1.h.f16319n, 0.0f);
        qaVar.f15700c = jVar;
        jVar.f16336u.a(1.0f);
        ((o1.j) qaVar.f15700c).f16336u.b(350.0f);
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
        Boolean bool = this.f31820a;
        if (bool == null || bool.booleanValue() != z4) {
            this.f31820a = Boolean.valueOf(z4);
            this.f31821b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f31821b) {
            n7.qa qaVar = this.f31822c;
            ((o1.j) qaVar.f15700c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) qaVar.f15700c).f16336u.f16343i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.j) qaVar.f15700c).f();
            return;
        }
        this.f31821b = false;
    }
}
