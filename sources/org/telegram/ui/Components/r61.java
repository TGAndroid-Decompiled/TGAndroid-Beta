package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r61 implements View.OnLayoutChangeListener {
    public Boolean f29989a;
    public boolean f29990b;
    public final n7.z0 f29991c;

    public r61(n7.z0 z0Var, View view) {
        this.f29991c = z0Var;
        o1.k kVar = new o1.k(view, o1.h.f16834n, 0.0f);
        z0Var.f16731c = kVar;
        kVar.f16852u.a(1.0f);
        ((o1.k) z0Var.f16731c).f16852u.b(350.0f);
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
        Boolean bool = this.f29989a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f29989a = Boolean.valueOf(z10);
            this.f29990b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f29990b) {
            n7.z0 z0Var = this.f29991c;
            ((o1.k) z0Var.f16731c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) z0Var.f16731c).f16852u.f16859i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) z0Var.f16731c).f();
            return;
        }
        this.f29990b = false;
    }
}
