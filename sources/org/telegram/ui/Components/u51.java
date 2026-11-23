package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class u51 implements View.OnLayoutChangeListener {
    public Boolean f40266a;
    public boolean f40267b;
    public final h6.m f40268c;

    public u51(h6.m mVar, View view) {
        this.f40268c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.f56352p, 0.0f);
        mVar.f13969c = gVar;
        gVar.f56368m.a(1.0f);
        ((r1.g) mVar.f13969c).f56368m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f40266a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f40266a = Boolean.valueOf(z10);
            this.f40267b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f40267b) {
            h6.m mVar = this.f40268c;
            ((r1.g) mVar.f13969c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((r1.g) mVar.f13969c).f56368m.f56376i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((r1.g) mVar.f13969c).h();
            return;
        }
        this.f40267b = false;
    }
}
