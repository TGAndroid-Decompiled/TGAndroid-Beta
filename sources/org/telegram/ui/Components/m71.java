package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m71 implements View.OnLayoutChangeListener {
    public Boolean f28460a;
    public boolean f28461b;
    public final m.g3 f28462c;

    public m71(m.g3 g3Var, View view) {
        this.f28462c = g3Var;
        o1.k kVar = new o1.k(view, o1.h.f17541n, 0.0f);
        g3Var.f16202c = kVar;
        kVar.f17558u.a(1.0f);
        ((o1.k) g3Var.f16202c).f17558u.b(350.0f);
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
        Boolean bool = this.f28460a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f28460a = Boolean.valueOf(z10);
            this.f28461b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f28461b) {
            m.g3 g3Var = this.f28462c;
            ((o1.k) g3Var.f16202c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) g3Var.f16202c).f17558u.f17564i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) g3Var.f16202c).h();
            return;
        }
        this.f28461b = false;
    }
}
