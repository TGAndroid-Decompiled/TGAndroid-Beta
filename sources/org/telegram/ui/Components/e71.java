package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e71 implements View.OnLayoutChangeListener {
    public Boolean f22608a;
    public boolean f22609b;
    public final og.u0 f22610c;

    public e71(og.u0 u0Var, View view) {
        this.f22610c = u0Var;
        o1.k kVar = new o1.k(view, o1.h.f14117n, 0.0f);
        u0Var.f14498c = kVar;
        kVar.f14134u.a(1.0f);
        ((o1.k) u0Var.f14498c).f14134u.b(350.0f);
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
        Boolean bool = this.f22608a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f22608a = Boolean.valueOf(z10);
            this.f22609b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f22609b) {
            og.u0 u0Var = this.f22610c;
            ((o1.k) u0Var.f14498c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) u0Var.f14498c).f14134u.f14140i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) u0Var.f14498c).f();
            return;
        }
        this.f22609b = false;
    }
}
