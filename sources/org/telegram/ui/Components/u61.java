package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u61 implements View.OnLayoutChangeListener {
    public Boolean f31526a;
    public boolean f31527b;
    public final n7.qa f31528c;

    public u61(n7.qa qaVar, View view) {
        this.f31528c = qaVar;
        o1.j jVar = new o1.j(view, o1.h.f16321n, 0.0f);
        qaVar.f15702c = jVar;
        jVar.f16338u.a(1.0f);
        ((o1.j) qaVar.f15702c).f16338u.b(350.0f);
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
        Boolean bool = this.f31526a;
        if (bool == null || bool.booleanValue() != z4) {
            this.f31526a = Boolean.valueOf(z4);
            this.f31527b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f31527b) {
            n7.qa qaVar = this.f31528c;
            ((o1.j) qaVar.f15702c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) qaVar.f15702c).f16338u.f16345i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.j) qaVar.f15702c).f();
            return;
        }
        this.f31527b = false;
    }
}
