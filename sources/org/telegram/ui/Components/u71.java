package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u71 implements View.OnLayoutChangeListener {
    public Boolean f29271a;
    public boolean f29272b;
    public final m.h3 f29273c;

    public u71(m.h3 h3Var, View view) {
        this.f29273c = h3Var;
        o1.k kVar = new o1.k(view, o1.h.f16144n, 0.0f);
        h3Var.f14851c = kVar;
        kVar.f16161u.a(1.0f);
        ((o1.k) h3Var.f14851c).f16161u.b(350.0f);
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
        Boolean bool = this.f29271a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f29271a = Boolean.valueOf(z10);
            this.f29272b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f29272b) {
            m.h3 h3Var = this.f29273c;
            ((o1.k) h3Var.f14851c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) h3Var.f14851c).f16161u.f16167i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) h3Var.f14851c).h();
            return;
        }
        this.f29272b = false;
    }
}
