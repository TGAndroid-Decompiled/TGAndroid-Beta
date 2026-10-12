package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t71 implements View.OnLayoutChangeListener {
    public Boolean f29289a;
    public boolean f29290b;
    public final li.k f29291c;

    public t71(li.k kVar, View view) {
        this.f29291c = kVar;
        o1.k kVar2 = new o1.k(view, o1.h.f16451n, 0.0f);
        kVar.f14821c = kVar2;
        kVar2.f16468u.a(1.0f);
        ((o1.k) kVar.f14821c).f16468u.b(350.0f);
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
        Boolean bool = this.f29289a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f29289a = Boolean.valueOf(z10);
            this.f29290b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f29290b) {
            li.k kVar = this.f29291c;
            ((o1.k) kVar.f14821c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) kVar.f14821c).f16468u.f16474i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) kVar.f14821c).h();
            return;
        }
        this.f29290b = false;
    }
}
