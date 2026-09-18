package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s61 implements View.OnLayoutChangeListener {
    public Boolean f27786a;
    public boolean f27787b;
    public final n7.a1 f27788c;

    public s61(n7.a1 a1Var, View view) {
        this.f27788c = a1Var;
        o1.k kVar = new o1.k(view, o1.h.f15344n, 0.0f);
        a1Var.f15119c = kVar;
        kVar.f15361u.a(1.0f);
        ((o1.k) a1Var.f15119c).f15361u.b(350.0f);
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
        Boolean bool = this.f27786a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f27786a = Boolean.valueOf(z10);
            this.f27787b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f27787b) {
            n7.a1 a1Var = this.f27788c;
            ((o1.k) a1Var.f15119c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) a1Var.f15119c).f15361u.f15367i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) a1Var.f15119c).f();
            return;
        }
        this.f27787b = false;
    }
}
