package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class z41 implements View.OnLayoutChangeListener {
    public Boolean f40841a;
    public boolean f40842b;
    public final h6.m f40843c;

    public z41(h6.m mVar, View view) {
        this.f40843c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f54134p, 0.0f);
        mVar.f14265c = gVar;
        gVar.f54150m.a(1.0f);
        ((r1.g) mVar.f14265c).f54150m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z9;
        Point point = org.telegram.messenger.g0.f22537q;
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f40841a;
        if (bool == null || bool.booleanValue() != z9) {
            this.f40841a = Boolean.valueOf(z9);
            this.f40842b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f40842b) {
            h6.m mVar = this.f40843c;
            ((r1.g) mVar.f14265c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f14265c).f54150m.f54158i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f14265c).h();
            return;
        }
        this.f40842b = false;
    }
}
