package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class f51 implements View.OnLayoutChangeListener {
    public Boolean f33472a;
    public boolean f33473b;
    public final h6.m f33474c;

    public f51(h6.m mVar, View view) {
        this.f33474c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f54263p, 0.0f);
        mVar.f14267c = gVar;
        gVar.f54279m.a(1.0f);
        ((r1.g) mVar.f14267c).f54279m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z9;
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f33472a;
        if (bool == null || bool.booleanValue() != z9) {
            this.f33472a = Boolean.valueOf(z9);
            this.f33473b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f33473b) {
            h6.m mVar = this.f33474c;
            ((r1.g) mVar.f14267c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f14267c).f54279m.f54287i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f14267c).h();
            return;
        }
        this.f33473b = false;
    }
}
