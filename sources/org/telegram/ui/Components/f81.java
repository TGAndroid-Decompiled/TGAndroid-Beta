package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f81 implements View.OnLayoutChangeListener {
    public Boolean f28047a;
    public boolean f28048b;
    public final k6.c f28049c;

    public f81(k6.c cVar, View view) {
        this.f28049c = cVar;
        o1.j jVar = new o1.j(view, o1.h.f18952n, 0.0f);
        cVar.f16406c = jVar;
        jVar.f18968u.a(1.0f);
        ((o1.j) cVar.f16406c).f18968u.b(350.0f);
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
        Boolean bool = this.f28047a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f28047a = Boolean.valueOf(z10);
            this.f28048b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f28048b) {
            k6.c cVar = this.f28049c;
            ((o1.j) cVar.f16406c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) cVar.f16406c).f18968u.f18974i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.j) cVar.f16406c).h();
            return;
        }
        this.f28048b = false;
    }
}
