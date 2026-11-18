package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class r51 implements View.OnLayoutChangeListener {
    public Boolean f39043a;
    public boolean f39044b;
    public final h6.m f39045c;

    public r51(h6.m mVar, View view) {
        this.f39045c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f56307p, 0.0f);
        mVar.f13940c = gVar;
        gVar.f56323m.a(1.0f);
        ((r1.g) mVar.f13940c).f56323m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f24121q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f39043a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f39043a = Boolean.valueOf(z10);
            this.f39044b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f39044b) {
            h6.m mVar = this.f39045c;
            ((r1.g) mVar.f13940c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f13940c).f56323m.f56331i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f13940c).h();
            return;
        }
        this.f39044b = false;
    }
}
