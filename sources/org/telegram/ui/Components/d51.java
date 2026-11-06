package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class d51 implements View.OnLayoutChangeListener {
    public Boolean f32776a;
    public boolean f32777b;
    public final h6.m f32778c;

    public d51(h6.m mVar, View view) {
        this.f32778c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f54159p, 0.0f);
        mVar.f14265c = gVar;
        gVar.f54175m.a(1.0f);
        ((r1.g) mVar.f14265c).f54175m.b(350.0f);
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
        Boolean bool = this.f32776a;
        if (bool == null || bool.booleanValue() != z9) {
            this.f32776a = Boolean.valueOf(z9);
            this.f32777b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f32777b) {
            h6.m mVar = this.f32778c;
            ((r1.g) mVar.f14265c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f14265c).f54175m.f54183i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f14265c).h();
            return;
        }
        this.f32777b = false;
    }
}
