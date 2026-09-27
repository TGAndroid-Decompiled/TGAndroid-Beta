package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h71 implements View.OnLayoutChangeListener {
    public Boolean f24747a;
    public boolean f24748b;
    public final n7.z0 f24749c;

    public h71(n7.z0 z0Var, View view) {
        this.f24749c = z0Var;
        o1.k kVar = new o1.k(view, o1.h.f15555n, 0.0f);
        z0Var.f15446c = kVar;
        kVar.f15572u.a(1.0f);
        ((o1.k) z0Var.f15446c).f15572u.b(350.0f);
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
        Boolean bool = this.f24747a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f24747a = Boolean.valueOf(z10);
            this.f24748b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f24748b) {
            n7.z0 z0Var = this.f24749c;
            ((o1.k) z0Var.f15446c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) z0Var.f15446c).f15572u.f15578i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) z0Var.f15446c).f();
            return;
        }
        this.f24748b = false;
    }
}
