package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x71 implements View.OnLayoutChangeListener {
    public Boolean f32883a;
    public boolean f32884b;
    public final la.h f32885c;

    public x71(la.h hVar, View view) {
        this.f32885c = hVar;
        o1.k kVar = new o1.k(view, o1.h.f17006n, 0.0f);
        hVar.f15502c = kVar;
        kVar.f17024u.a(1.0f);
        ((o1.k) hVar.f15502c).f17024u.b(350.0f);
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
        Boolean bool = this.f32883a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f32883a = Boolean.valueOf(z10);
            this.f32884b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f32884b) {
            la.h hVar = this.f32885c;
            ((o1.k) hVar.f15502c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) hVar.f15502c).f17024u.f17031i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) hVar.f15502c).h();
            return;
        }
        this.f32884b = false;
    }
}
