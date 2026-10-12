package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b81 implements View.OnLayoutChangeListener {
    public Boolean f24573a;
    public boolean f24574b;
    public final m.f3 f24575c;

    public b81(m.f3 f3Var, View view) {
        this.f24575c = f3Var;
        o1.k kVar = new o1.k(view, o1.h.f16673n, 0.0f);
        f3Var.f15425c = kVar;
        kVar.f16691u.a(1.0f);
        ((o1.k) f3Var.f15425c).f16691u.b(350.0f);
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
        Boolean bool = this.f24573a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f24573a = Boolean.valueOf(z10);
            this.f24574b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f24574b) {
            m.f3 f3Var = this.f24575c;
            ((o1.k) f3Var.f15425c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) f3Var.f15425c).f16691u.f16698i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) f3Var.f15425c).h();
            return;
        }
        this.f24574b = false;
    }
}
