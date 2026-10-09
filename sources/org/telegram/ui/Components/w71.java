package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w71 implements View.OnLayoutChangeListener {
    public Boolean f32563a;
    public boolean f32564b;
    public final la.h f32565c;

    public w71(la.h hVar, View view) {
        this.f32565c = hVar;
        o1.k kVar = new o1.k(view, o1.h.f16920n, 0.0f);
        hVar.f15463c = kVar;
        kVar.f16938u.a(1.0f);
        ((o1.k) hVar.f15463c).f16938u.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f32563a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f32563a = Boolean.valueOf(z10);
            this.f32564b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f32564b) {
            la.h hVar = this.f32565c;
            ((o1.k) hVar.f15463c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) hVar.f15463c).f16938u.f16945i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) hVar.f15463c).h();
            return;
        }
        this.f32564b = false;
    }
}
