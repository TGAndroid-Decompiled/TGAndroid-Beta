package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o71 implements View.OnLayoutChangeListener {
    public Boolean f28958a;
    public boolean f28959b;
    public final m.g3 f28960c;

    public o71(m.g3 g3Var, View view) {
        this.f28960c = g3Var;
        o1.k kVar = new o1.k(view, o1.h.f17542n, 0.0f);
        g3Var.f16203c = kVar;
        kVar.f17559u.a(1.0f);
        ((o1.k) g3Var.f16203c).f17559u.b(350.0f);
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
        Boolean bool = this.f28958a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f28958a = Boolean.valueOf(z10);
            this.f28959b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f28959b) {
            m.g3 g3Var = this.f28960c;
            ((o1.k) g3Var.f16203c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) g3Var.f16203c).f17559u.f17565i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) g3Var.f16203c).h();
            return;
        }
        this.f28959b = false;
    }
}
