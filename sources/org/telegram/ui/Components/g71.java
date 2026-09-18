package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g71 implements View.OnLayoutChangeListener {
    public Boolean f24326a;
    public boolean f24327b;
    public final n7.z0 f24328c;

    public g71(n7.z0 z0Var, View view) {
        this.f24328c = z0Var;
        o1.k kVar = new o1.k(view, o1.h.f15473n, 0.0f);
        z0Var.f15368c = kVar;
        kVar.f15490u.a(1.0f);
        ((o1.k) z0Var.f15368c).f15490u.b(350.0f);
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
        Boolean bool = this.f24326a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f24326a = Boolean.valueOf(z10);
            this.f24327b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f24327b) {
            n7.z0 z0Var = this.f24328c;
            ((o1.k) z0Var.f15368c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) z0Var.f15368c).f15490u.f15496i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) z0Var.f15368c).f();
            return;
        }
        this.f24327b = false;
    }
}
