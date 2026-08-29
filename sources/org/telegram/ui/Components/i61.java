package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i61 implements View.OnLayoutChangeListener {
    public Boolean f29328a;
    public boolean f29329b;
    public final oc.i f29330c;

    public i61(oc.i iVar, View view) {
        this.f29330c = iVar;
        o1.k kVar = new o1.k(view, o1.i.f19028n, 0.0f);
        iVar.f19484c = kVar;
        kVar.f19045u.a(1.0f);
        ((o1.k) iVar.f19484c).f19045u.b(350.0f);
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
        Boolean bool = this.f29328a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f29328a = Boolean.valueOf(z10);
            this.f29329b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f29329b) {
            oc.i iVar = this.f29330c;
            ((o1.k) iVar.f19484c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) iVar.f19484c).f19045u.f19052i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) iVar.f19484c).f();
            return;
        }
        this.f29329b = false;
    }
}
