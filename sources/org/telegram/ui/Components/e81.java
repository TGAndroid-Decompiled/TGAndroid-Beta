package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e81 implements View.OnLayoutChangeListener {
    public Boolean f27758a;
    public boolean f27759b;
    public final k6.c f27760c;

    public e81(k6.c cVar, View view) {
        this.f27760c = cVar;
        o1.j jVar = new o1.j(view, o1.h.f18953n, 0.0f);
        cVar.f16407c = jVar;
        jVar.f18969u.a(1.0f);
        ((o1.j) cVar.f16407c).f18969u.b(350.0f);
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
        Boolean bool = this.f27758a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f27758a = Boolean.valueOf(z10);
            this.f27759b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f27759b) {
            k6.c cVar = this.f27760c;
            ((o1.j) cVar.f16407c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) cVar.f16407c).f18969u.f18975i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.j) cVar.f16407c).h();
            return;
        }
        this.f27759b = false;
    }
}
