package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class e51 implements View.OnLayoutChangeListener {
    public Boolean f33173a;
    public boolean f33174b;
    public final h6.m f33175c;

    public e51(h6.m mVar, View view) {
        this.f33175c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f54158p, 0.0f);
        mVar.f14265c = gVar;
        gVar.f54174m.a(1.0f);
        ((r1.g) mVar.f14265c).f54174m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z9;
        Point point = org.telegram.messenger.g0.f22544q;
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f33173a;
        if (bool == null || bool.booleanValue() != z9) {
            this.f33173a = Boolean.valueOf(z9);
            this.f33174b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f33174b) {
            h6.m mVar = this.f33175c;
            ((r1.g) mVar.f14265c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f14265c).f54174m.f54182i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f14265c).h();
            return;
        }
        this.f33174b = false;
    }
}
