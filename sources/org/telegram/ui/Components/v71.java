package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v71 implements View.OnLayoutChangeListener {
    public Boolean f31377a;
    public boolean f31378b;
    public final m.g3 f31379c;

    public v71(m.g3 g3Var, View view) {
        this.f31379c = g3Var;
        o1.k kVar = new o1.k(view, o1.h.f17605n, 0.0f);
        g3Var.f16266c = kVar;
        kVar.f17622u.a(1.0f);
        ((o1.k) g3Var.f16266c).f17622u.b(350.0f);
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
        Boolean bool = this.f31377a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f31377a = Boolean.valueOf(z10);
            this.f31378b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f31378b) {
            m.g3 g3Var = this.f31379c;
            ((o1.k) g3Var.f16266c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) g3Var.f16266c).f17622u.f17628i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) g3Var.f16266c).h();
            return;
        }
        this.f31378b = false;
    }
}
