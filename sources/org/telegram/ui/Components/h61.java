package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class h61 implements View.OnLayoutChangeListener {
    public Boolean f26633a;
    public boolean f26634b;
    public final li.k f26635c;

    public h61(li.k kVar, View view) {
        this.f26635c = kVar;
        o1.j jVar = new o1.j((Object) view, (o1.h) o1.j.f13942p, 0.0f);
        kVar.f12101c = jVar;
        jVar.f13957m.a(1.0f);
        ((o1.j) kVar.f12101c).f13957m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f26633a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f26633a = Boolean.valueOf(z10);
            this.f26634b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f26634b) {
            li.k kVar = this.f26635c;
            ((o1.j) kVar.f12101c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.j) kVar.f12101c).f13957m.f13964i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.j) kVar.f12101c).h();
            return;
        }
        this.f26634b = false;
    }
}
