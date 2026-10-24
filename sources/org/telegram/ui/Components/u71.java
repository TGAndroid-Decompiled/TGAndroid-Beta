package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u71 implements View.OnLayoutChangeListener {
    public Boolean f31038a;
    public boolean f31039b;
    public final m.g3 f31040c;

    public u71(m.g3 g3Var, View view) {
        this.f31040c = g3Var;
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
        Boolean bool = this.f31038a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f31038a = Boolean.valueOf(z10);
            this.f31039b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f31039b) {
            m.g3 g3Var = this.f31040c;
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
        this.f31039b = false;
    }
}
