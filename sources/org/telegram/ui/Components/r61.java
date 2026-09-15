package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r61 implements View.OnLayoutChangeListener {
    public Boolean f27580a;
    public boolean f27581b;
    public final n7.a1 f27582c;

    public r61(n7.a1 a1Var, View view) {
        this.f27582c = a1Var;
        o1.k kVar = new o1.k(view, o1.h.f15334n, 0.0f);
        a1Var.f15109c = kVar;
        kVar.f15351u.a(1.0f);
        ((o1.k) a1Var.f15109c).f15351u.b(350.0f);
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
        Boolean bool = this.f27580a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f27580a = Boolean.valueOf(z10);
            this.f27581b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f27581b) {
            n7.a1 a1Var = this.f27582c;
            ((o1.k) a1Var.f15109c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) a1Var.f15109c).f15351u.f15357i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) a1Var.f15109c).f();
            return;
        }
        this.f27581b = false;
    }
}
