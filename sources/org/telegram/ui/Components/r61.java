package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r61 implements View.OnLayoutChangeListener {
    public Boolean f27577a;
    public boolean f27578b;
    public final n7.a1 f27579c;

    public r61(n7.a1 a1Var, View view) {
        this.f27579c = a1Var;
        o1.k kVar = new o1.k(view, o1.h.f15332n, 0.0f);
        a1Var.f15107c = kVar;
        kVar.f15349u.a(1.0f);
        ((o1.k) a1Var.f15107c).f15349u.b(350.0f);
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
        Boolean bool = this.f27577a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f27577a = Boolean.valueOf(z10);
            this.f27578b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f27578b) {
            n7.a1 a1Var = this.f27579c;
            ((o1.k) a1Var.f15107c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) a1Var.f15107c).f15349u.f15355i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) a1Var.f15107c).f();
            return;
        }
        this.f27578b = false;
    }
}
