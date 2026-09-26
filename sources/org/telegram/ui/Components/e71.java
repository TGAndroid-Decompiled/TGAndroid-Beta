package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e71 implements View.OnLayoutChangeListener {
    public Boolean f23853a;
    public boolean f23854b;
    public final n7.z0 f23855c;

    public e71(n7.z0 z0Var, View view) {
        this.f23855c = z0Var;
        o1.k kVar = new o1.k(view, o1.h.f15516n, 0.0f);
        z0Var.f15411c = kVar;
        kVar.f15533u.a(1.0f);
        ((o1.k) z0Var.f15411c).f15533u.b(350.0f);
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
        Boolean bool = this.f23853a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f23853a = Boolean.valueOf(z10);
            this.f23854b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f23854b) {
            n7.z0 z0Var = this.f23855c;
            ((o1.k) z0Var.f15411c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) z0Var.f15411c).f15533u.f15539i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) z0Var.f15411c).f();
            return;
        }
        this.f23854b = false;
    }
}
