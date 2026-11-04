package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
public final class y41 implements View.OnLayoutChangeListener {
    public Boolean f40614a;
    public boolean f40615b;
    public final k4.j f40616c;

    public y41(k4.j jVar, View view) {
        this.f40616c = jVar;
        q1.g gVar = new q1.g((Object) view, (q1.e) q1.g.f53637p, 0.0f);
        jVar.f16870b = gVar;
        gVar.f53653m.a(1.0f);
        ((q1.g) jVar.f16870b).f53653m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f40614a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f40614a = Boolean.valueOf(z10);
            this.f40615b = true;
        }
        if (i14 != 0 && i14 != i10 && !this.f40615b) {
            k4.j jVar = this.f40616c;
            ((q1.g) jVar.f16870b).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((q1.g) jVar.f16870b).f53653m.f53661i = 0.0f;
            view.setTranslationY((i14 - i10) + 0.0f);
            ((q1.g) jVar.f16870b).h();
            return;
        }
        this.f40615b = false;
    }
}
