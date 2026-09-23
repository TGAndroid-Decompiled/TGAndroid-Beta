package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q61 implements View.OnLayoutChangeListener {
    public Boolean f27243a;
    public boolean f27244b;
    public final n7.a1 f27245c;

    public q61(n7.a1 a1Var, View view) {
        this.f27245c = a1Var;
        o1.k kVar = new o1.k(view, o1.h.f15309n, 0.0f);
        a1Var.f15084c = kVar;
        kVar.f15326u.a(1.0f);
        ((o1.k) a1Var.f15084c).f15326u.b(350.0f);
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
        Boolean bool = this.f27243a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f27243a = Boolean.valueOf(z10);
            this.f27244b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f27244b) {
            n7.a1 a1Var = this.f27245c;
            ((o1.k) a1Var.f15084c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) a1Var.f15084c).f15326u.f15332i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) a1Var.f15084c).f();
            return;
        }
        this.f27244b = false;
    }
}
