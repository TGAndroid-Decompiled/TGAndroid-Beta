package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class t51 implements View.OnLayoutChangeListener {
    public Boolean f39801a;
    public boolean f39802b;
    public final h6.m f39803c;

    public t51(h6.m mVar, View view) {
        this.f39803c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f56430p, 0.0f);
        mVar.f13932c = gVar;
        gVar.f56446m.a(1.0f);
        ((r1.g) mVar.f13932c).f56446m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f39801a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f39801a = Boolean.valueOf(z10);
            this.f39802b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f39802b) {
            h6.m mVar = this.f39803c;
            ((r1.g) mVar.f13932c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f13932c).f56446m.f56454i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f13932c).h();
            return;
        }
        this.f39802b = false;
    }
}
