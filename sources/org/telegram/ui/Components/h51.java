package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class h51 implements View.OnLayoutChangeListener {
    public Boolean f35170a;
    public boolean f35171b;
    public final h6.m f35172c;

    public h51(h6.m mVar, View view) {
        this.f35172c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f55732p, 0.0f);
        mVar.f13625c = gVar;
        gVar.f55748m.a(1.0f);
        ((r1.g) mVar.f13625c).f55748m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f23611q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f35170a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f35170a = Boolean.valueOf(z10);
            this.f35171b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f35171b) {
            h6.m mVar = this.f35172c;
            ((r1.g) mVar.f13625c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f13625c).f55748m.f55756i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f13625c).h();
            return;
        }
        this.f35171b = false;
    }
}
